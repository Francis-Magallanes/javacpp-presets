// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIdxDeclInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxDeclInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXIdxDeclInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxDeclInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXIdxDeclInfo position(long position) {
        return (CXIdxDeclInfo)super.position(position);
    }

  @MemberGetter public native @Const CXIdxEntityInfo entityInfo();
  public native @ByRef CXCursor cursor(); public native CXIdxDeclInfo cursor(CXCursor setter);
  public native @ByRef CXIdxLoc loc(); public native CXIdxDeclInfo loc(CXIdxLoc setter);
  @MemberGetter public native @Const CXIdxContainerInfo semanticContainer();
  /**
   * Generally same as #semanticContainer but can be different in
   * cases like out-of-line C++ member functions.
   */
  @MemberGetter public native @Const CXIdxContainerInfo lexicalContainer();
  public native int isRedeclaration(); public native CXIdxDeclInfo isRedeclaration(int setter);
  public native int isDefinition(); public native CXIdxDeclInfo isDefinition(int setter);
  public native int isContainer(); public native CXIdxDeclInfo isContainer(int setter);
  @MemberGetter public native @Const CXIdxContainerInfo declAsContainer();
  /**
   * Whether the declaration exists in code or was created implicitly
   * by the compiler, e.g. implicit Objective-C methods for properties.
   */
  public native int isImplicit(); public native CXIdxDeclInfo isImplicit(int setter);
  @MemberGetter public native @Const CXIdxAttrInfo attributes(int i);
  @MemberGetter public native @Cast("const CXIdxAttrInfo*const*") PointerPointer attributes();
  public native @Cast("unsigned") int numAttributes(); public native CXIdxDeclInfo numAttributes(int setter);

  public native @Cast("unsigned") int flags(); public native CXIdxDeclInfo flags(int setter);

}