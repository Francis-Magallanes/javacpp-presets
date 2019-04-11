// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Solves systems of linear equations.
 * 
 *  {@code Matrix} is a tensor of shape {@code [..., M, M]} whose inner-most 2 dimensions
 *  form square matrices. {@code Rhs} is a tensor of shape {@code [..., M, K]}. The {@code output} is
 *  a tensor shape {@code [..., M, K]}.  If {@code adjoint} is {@code False} then each output matrix
 *  satisfies {@code matrix[..., :, :] * output[..., :, :] = rhs[..., :, :]}.
 *  If {@code adjoint} is {@code True} then each output matrix satisfies
 *  {@code adjoint(matrix[..., :, :]) * output[..., :, :] = rhs[..., :, :]}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * matrix: Shape is {@code [..., M, M]}.
 *  * rhs: Shape is {@code [..., M, K]}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * adjoint: Boolean indicating whether to solve with {@code matrix} or its (block-wise)
 *  adjoint.
 * 
 *  Returns:
 *  * {@code Output}: Shape is {@code [..., M, K]}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MatrixSolve extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatrixSolve(Pointer p) { super(p); }

  /** Optional attribute setters for MatrixSolve */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** Boolean indicating whether to solve with {@code matrix} or its (block-wise)
     *  adjoint.
     * 
     *  Defaults to false */
    public native @ByVal Attrs Adjoint(@Cast("bool") boolean x);

    public native @Cast("bool") boolean adjoint_(); public native Attrs adjoint_(boolean setter);
  }
  public MatrixSolve(@Const @ByRef Scope scope, @ByVal Input matrix,
              @ByVal Input rhs) { super((Pointer)null); allocate(scope, matrix, rhs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input matrix,
              @ByVal Input rhs);
  public MatrixSolve(@Const @ByRef Scope scope, @ByVal Input matrix,
              @ByVal Input rhs, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, matrix, rhs, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input matrix,
              @ByVal Input rhs, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Adjoint(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native MatrixSolve operation(Operation setter);
  public native @ByRef Output output(); public native MatrixSolve output(Output setter);
}