// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Outputs random integers from a uniform distribution.
 * 
 *  The generated values are uniform integers in the range {@code [minval, maxval)}.
 *  The lower bound {@code minval} is included in the range, while the upper bound
 *  {@code maxval} is excluded.
 * 
 *  The random integers are slightly biased unless {@code maxval - minval} is an exact
 *  power of two.  The bias is small for values of {@code maxval - minval} significantly
 *  smaller than the range of the output (either {@code 2^32} or {@code 2^64}).
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * shape: The shape of the output tensor.
 *  * minval: 0-D.  Inclusive lower bound on the generated integers.
 *  * maxval: 0-D.  Exclusive upper bound on the generated integers.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * seed: If either {@code seed} or {@code seed2} are set to be non-zero, the random number
 *  generator is seeded by the given seed.  Otherwise, it is seeded by a
 *  random seed.
 *  * seed2: A second seed to avoid seed collision.
 * 
 *  Returns:
 *  * {@code Output}: A tensor of the specified shape filled with uniform random integers. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RandomUniformInt extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RandomUniformInt(Pointer p) { super(p); }

  /** Optional attribute setters for RandomUniformInt */
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
  
    /** If either {@code seed} or {@code seed2} are set to be non-zero, the random number
     *  generator is seeded by the given seed.  Otherwise, it is seeded by a
     *  random seed.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);

    /** A second seed to avoid seed collision.
     * 
     *  Defaults to 0 */
    public native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long seed_(); public native Attrs seed_(long setter);
    public native @Cast("tensorflow::int64") long seed2_(); public native Attrs seed2_(long setter);
  }
  public RandomUniformInt(@Const @ByRef Scope scope, @ByVal Input shape,
                   @ByVal Input minval, @ByVal Input maxval) { super((Pointer)null); allocate(scope, shape, minval, maxval); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input shape,
                   @ByVal Input minval, @ByVal Input maxval);
  public RandomUniformInt(@Const @ByRef Scope scope, @ByVal Input shape,
                   @ByVal Input minval, @ByVal Input maxval, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, shape, minval, maxval, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input shape,
                   @ByVal Input minval, @ByVal Input maxval, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native RandomUniformInt operation(Operation setter);
  public native @ByRef Output output(); public native RandomUniformInt output(Output setter);
}