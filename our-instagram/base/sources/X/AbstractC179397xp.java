package X;

import android.opengl.Matrix;
import java.util.Arrays;

/* renamed from: X.7xp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC179397xp {
    public String A00;
    public boolean A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public boolean A07;
    public boolean A08;
    public final C179407xq A09;
    public final float[] A0A;
    public final float[] A0B;

    public static void A01(C179407xq c179407xq, float[] fArr) {
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
        System.arraycopy(fArr, 0, c179407xq.A03, 0, 16);
    }

    public static void A04(float[] fArr, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = i;
        float f7 = i2;
        float f8 = f6 / f7;
        float f9 = i3;
        float f10 = i4;
        float f11 = f9 / f10;
        if (i < i2) {
            f2 = f8;
            f = 1.0f;
        } else {
            f = f7 / f6;
            f2 = 1.0f;
        }
        if (i3 < i4) {
            f4 = f11;
            f3 = 1.0f;
        } else {
            f3 = f10 / f9;
            f4 = 1.0f;
        }
        if (f8 < f11) {
            f5 = f2 / f4;
        } else {
            f5 = f / f3;
        }
        Matrix.scaleM(fArr, 0, f5, f5, 1.0f);
    }

    public static void A07(float[] fArr, float[] fArr2) {
        System.arraycopy(fArr2, 0, fArr, 0, 16);
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
    }

    public static void A00(C179407xq c179407xq, float f, float f2, float f3, int i, int i2, int i3, int i4, int i5, int i6) {
        float f4;
        float f5;
        c179407xq.A01 = i5;
        c179407xq.A00 = i6;
        float f6 = i5;
        float f7 = (f * i3) / f6;
        float f8 = i6;
        float f9 = (f2 * i4) / f8;
        float f10 = (((i * 2) + i3) - i5) / f6;
        float f11 = (((i2 * 2) + i4) - i6) / f8;
        float[] fArr = c179407xq.A02;
        Matrix.setIdentityM(fArr, 0);
        if (f3 != 0.0f) {
            if (i5 < i6) {
                f5 = f8 / f6;
                f4 = 1.0f;
            } else {
                f4 = f6 / f8;
                f5 = 1.0f;
            }
            Matrix.scaleM(fArr, 0, f5, f4, 1.0f);
            Matrix.rotateM(fArr, 0, f3, 0.0f, 0.0f, 1.0f);
            A03(fArr, i5, i6);
        }
        Matrix.translateM(fArr, 0, f10, f11, 0.0f);
        Matrix.scaleM(fArr, 0, f7, f9, 1.0f);
    }

    public static void A02(float[] fArr, int i) {
        if (i != 0) {
            Matrix.rotateM(fArr, 0, i, 0.0f, 0.0f, -1.0f);
        }
    }

    public static void A03(float[] fArr, int i, int i2) {
        float f;
        float f2;
        if (i < i2) {
            f2 = i / i2;
            f = 1.0f;
        } else {
            f = i2 / i;
            f2 = 1.0f;
        }
        Matrix.scaleM(fArr, 0, f2, f, 1.0f);
    }

    public static void A05(float[] fArr, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i < i2) {
            f2 = i / i2;
            f = 1.0f;
        } else {
            f = i2 / i;
            f2 = 1.0f;
        }
        if (i3 < i4) {
            f4 = i3 / i4;
            f3 = 1.0f;
        } else {
            f3 = i4 / i3;
            f4 = 1.0f;
        }
        Matrix.scaleM(fArr, 0, f2 / f4, f / f3, 1.0f);
    }

    public static void A06(float[] fArr, boolean z, boolean z2) {
        if (z || z2) {
            float f = -1.0f;
            float f2 = 1.0f;
            if (z) {
                f2 = -1.0f;
            }
            if (!z2) {
                f = 1.0f;
            }
            Matrix.scaleM(fArr, 0, f2, f, 1.0f);
        }
    }

    public final C179407xq A08() {
        float f;
        int i;
        int i2;
        float f2;
        float f3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f4;
        float f5;
        float f6;
        if (this.A01) {
            this.A01 = false;
            C179407xq c179407xq = this.A09;
            float[] fArr = this.A0B;
            int i9 = this.A06;
            int i10 = this.A05;
            int i11 = this.A03;
            int i12 = this.A02;
            int i13 = this.A04;
            boolean z = this.A07;
            boolean z2 = this.A08;
            if (this instanceof C179387xo) {
                C179387xo c179387xo = (C179387xo) this;
                int i14 = i9;
                int i15 = i10;
                if (i13 % 180 != 0) {
                    i14 = i10;
                    i15 = i9;
                }
                float[] fArr2 = c179387xo.A00;
                A07(fArr2, fArr);
                if (i9 < i10) {
                    f6 = i10 / i9;
                    f5 = 1.0f;
                } else {
                    f5 = i9 / i10;
                    f6 = 1.0f;
                }
                Matrix.scaleM(fArr2, 0, f6, f5, 1.0f);
                A02(fArr2, i13);
                A04(fArr2, i14, i15, i11, i12);
                A06(fArr2, z, z2);
                A01(c179407xq, fArr2);
                float f7 = i14;
                float f8 = i15;
                float f9 = i11 / i12;
                if (f9 < f7 / f8) {
                    i14 = Math.round(f8 * f9);
                } else {
                    i15 = Math.round(f7 / f9);
                }
                c179407xq.A01 = i14;
                c179407xq.A00 = i15;
            } else if (this instanceof AnonymousClass814) {
                AnonymousClass814 anonymousClass814 = (AnonymousClass814) this;
                boolean z3 = true;
                boolean z4 = false;
                int i16 = i9;
                if (i13 % 180 != 0) {
                    i16 = i10;
                    i10 = i9;
                }
                if (anonymousClass814.A00) {
                    if (Math.abs(((i16 / i10) / (i11 / i12)) - 1.0f) >= 0.015f) {
                        z3 = false;
                    }
                    z4 = z3;
                }
                float[] fArr3 = anonymousClass814.A01;
                A07(fArr3, fArr);
                A02(fArr3, i13);
                if (z4) {
                    A04(fArr3, i16, i10, i11, i12);
                } else {
                    A05(fArr3, i16, i10, i11, i12);
                }
                A06(fArr3, z, z2);
                A03(fArr3, i11, i12);
                A01(c179407xq, fArr3);
                if (!z4) {
                    f4 = 0.0f;
                    float f10 = i16 / i10;
                    float f11 = i11;
                    float f12 = i12;
                    if (f10 < f11 / f12) {
                        i5 = Math.round(f12 * f10);
                        i6 = i12;
                    } else {
                        i6 = Math.round(f11 / f10);
                        i5 = i11;
                    }
                    f3 = 1.0f;
                    f2 = 1.0f;
                    i3 = (i11 - i5) / 2;
                    i4 = (i12 - i6) / 2;
                    i7 = i11;
                    i8 = i12;
                    A00(c179407xq, f3, f2, f4, i3, i4, i5, i6, i7, i8);
                }
                f4 = 0.0f;
                f3 = 1.0f;
                f2 = 1.0f;
                i3 = 0;
                i4 = 0;
                i5 = i11;
                i6 = i12;
                i7 = i11;
                i8 = i12;
                A00(c179407xq, f3, f2, f4, i3, i4, i5, i6, i7, i8);
            } else if (this instanceof C179417xr) {
                C179417xr c179417xr = (C179417xr) this;
                int i17 = i9;
                if (i13 % 180 != 0) {
                    i17 = i10;
                    i10 = i9;
                }
                float[] fArr4 = c179417xr.A00;
                A07(fArr4, fArr);
                A02(fArr4, i13);
                A04(fArr4, i17, i10, i11, i12);
                A06(fArr4, z, z2);
                A03(fArr4, i11, i12);
                A01(c179407xq, fArr4);
                f4 = 0.0f;
                f3 = 1.0f;
                f2 = 1.0f;
                i3 = 0;
                i4 = 0;
                i5 = i11;
                i6 = i12;
                i7 = i11;
                i8 = i12;
                A00(c179407xq, f3, f2, f4, i3, i4, i5, i6, i7, i8);
            } else {
                if (this instanceof C197828ot) {
                    C197828ot c197828ot = (C197828ot) this;
                    int i18 = i9;
                    if (i13 % 180 != 0) {
                        i18 = i10;
                        i10 = i9;
                    }
                    float[] fArr5 = c197828ot.A07;
                    A07(fArr5, fArr);
                    A02(fArr5, i13);
                    A04(fArr5, i18, i10, i11, i12);
                    float f13 = c197828ot.A05;
                    float f14 = c197828ot.A06;
                    float f15 = c197828ot.A04;
                    float f16 = c197828ot.A03;
                    float f17 = i18;
                    float f18 = i10;
                    float max = Math.max(f17, f18);
                    float f19 = (f14 + ((f16 - f18) / 2.0f)) / max;
                    float max2 = Math.max(f15, f16) / max;
                    Matrix.translateM(fArr5, 0, (f13 + ((f15 - f17) / 2.0f)) / max, -f19, 0.0f);
                    Matrix.scaleM(fArr5, 0, max2, max2, 1.0f);
                    A06(fArr5, z, z2);
                    A01(c179407xq, fArr5);
                    int i19 = c197828ot.A04;
                    int i20 = c197828ot.A03;
                    i3 = 0;
                    i4 = 0;
                    i5 = i19;
                    i6 = i20;
                    i7 = i19;
                    i8 = i20;
                    f3 = c197828ot.A01;
                    f2 = c197828ot.A02;
                    f4 = c197828ot.A00;
                } else if (this instanceof C212439bC) {
                    C212439bC c212439bC = (C212439bC) this;
                    int i21 = i9;
                    if (i13 % 180 != 0) {
                        i21 = i10;
                        i10 = i9;
                    }
                    float[] fArr6 = c212439bC.A04;
                    A07(fArr6, fArr);
                    A02(fArr6, i13);
                    A04(fArr6, i21, i10, c212439bC.A01, c212439bC.A00);
                    A06(fArr6, z, z2);
                    A03(fArr6, c212439bC.A01, c212439bC.A00);
                    A01(c179407xq, fArr6);
                    int i22 = c212439bC.A02;
                    int i23 = i12 - c212439bC.A03;
                    int i24 = c212439bC.A00;
                    i4 = i23 - i24;
                    f4 = 0.0f;
                    f3 = 1.0f;
                    f2 = 1.0f;
                    i3 = i22;
                    i5 = c212439bC.A01;
                    i6 = i24;
                    i7 = i11;
                    i8 = i12;
                } else {
                    C212449bD c212449bD = (C212449bD) this;
                    int i25 = i9;
                    if (i13 % 180 != 0) {
                        i25 = i10;
                        i10 = i9;
                    }
                    float f20 = i25 / i10;
                    float f21 = i11;
                    float f22 = i12;
                    float f23 = f21 / f22;
                    if (f23 > f20) {
                        f = f23 / f20;
                    } else {
                        f = 1.0f;
                    }
                    float[] fArr7 = c212449bD.A04;
                    A07(fArr7, fArr);
                    A02(fArr7, i13);
                    A05(fArr7, i25, i10, i11, i12);
                    A06(fArr7, z, z2);
                    A03(fArr7, i11, i12);
                    A01(c179407xq, fArr7);
                    if (f20 < f23) {
                        i2 = (int) (f20 * f22);
                        i = i12;
                    } else {
                        i = (int) (f21 / f20);
                        i2 = i11;
                    }
                    int i26 = ((int) (c212449bD.A02 * f21)) + ((i11 - i2) / 2);
                    int i27 = ((i12 - i) / 2) - ((int) (c212449bD.A03 * f22));
                    f2 = f * c212449bD.A01;
                    f3 = f2 * 1.0f;
                    i3 = i26;
                    i4 = i27;
                    i5 = i2;
                    i6 = i;
                    i7 = i11;
                    i8 = i12;
                    f4 = c212449bD.A00;
                }
                A00(c179407xq, f3, f2, f4, i3, i4, i5, i6, i7, i8);
            }
        }
        return this.A09;
    }

    public final void A09(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        if (i == this.A06 && i2 == this.A05 && i3 == this.A03 && i4 == this.A02 && i5 == this.A04 && z == this.A07 && z2 == this.A08) {
            return;
        }
        this.A06 = i;
        this.A05 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A04 = i5;
        this.A07 = z;
        this.A08 = z2;
        this.A01 = true;
    }

    public final void A0A(float[] fArr) {
        float[] fArr2 = this.A0B;
        if (!Arrays.equals(fArr2, fArr)) {
            System.arraycopy(fArr, 0, fArr2, 0, 16);
            this.A01 = true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BaseScaleType{");
        String str = this.A00;
        if (str == null) {
            str = Arrays.toString(Arrays.copyOfRange(Thread.currentThread().getStackTrace(), 4, 15));
        }
        sb.append(str);
        sb.append(", mBaseMatrix=");
        sb.append(Arrays.toString(this.A0B));
        sb.append(", mBaseContentMatrix=");
        sb.append(Arrays.toString(this.A0A));
        sb.append(", mViewport=");
        sb.append(this.A09);
        sb.append(", mSrcWidth=");
        sb.append(this.A06);
        sb.append(", mSrcHeight=");
        sb.append(this.A05);
        sb.append(", mDstWidth=");
        sb.append(this.A03);
        sb.append(", mDstHeight=");
        sb.append(this.A02);
        sb.append(", mOrientation=");
        sb.append(this.A04);
        sb.append(", mFlipX=");
        sb.append(this.A07);
        sb.append(", mFlipY=");
        sb.append(this.A08);
        sb.append('}');
        return sb.toString();
    }

    public AbstractC179397xp() {
        float[] fArr = new float[16];
        this.A0B = fArr;
        float[] fArr2 = new float[16];
        this.A0A = fArr2;
        C179407xq c179407xq = new C179407xq();
        this.A09 = c179407xq;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        System.arraycopy(fArr, 0, c179407xq.A03, 0, 16);
        System.arraycopy(fArr2, 0, c179407xq.A02, 0, 16);
    }
}
