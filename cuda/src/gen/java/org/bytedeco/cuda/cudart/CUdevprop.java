// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Legacy device properties
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUdevprop extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUdevprop() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUdevprop(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUdevprop(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUdevprop position(long position) {
        return (CUdevprop)super.position(position);
    }

    /** Maximum number of threads per block */
    public native int maxThreadsPerBlock(); public native CUdevprop maxThreadsPerBlock(int setter);
    /** Maximum size of each dimension of a block */
    public native int maxThreadsDim(int i); public native CUdevprop maxThreadsDim(int i, int setter);
    @MemberGetter public native IntPointer maxThreadsDim();
    /** Maximum size of each dimension of a grid */
    public native int maxGridSize(int i); public native CUdevprop maxGridSize(int i, int setter);
    @MemberGetter public native IntPointer maxGridSize();
    /** Shared memory available per block in bytes */
    public native int sharedMemPerBlock(); public native CUdevprop sharedMemPerBlock(int setter);
    /** Constant memory available on device in bytes */
    public native int totalConstantMemory(); public native CUdevprop totalConstantMemory(int setter);
    /** Warp size in threads */
    public native int SIMDWidth(); public native CUdevprop SIMDWidth(int setter);
    /** Maximum pitch in bytes allowed by memory copies */
    public native int memPitch(); public native CUdevprop memPitch(int setter);
    /** 32-bit registers available per block */
    public native int regsPerBlock(); public native CUdevprop regsPerBlock(int setter);
    /** Clock frequency in kilohertz */
    public native int clockRate(); public native CUdevprop clockRate(int setter);
    /** Alignment requirement for textures */
    public native int textureAlign(); public native CUdevprop textureAlign(int setter);
}