package X;

import android.graphics.Path;

/* renamed from: X.3LU, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3LU {
    public static int A02(float[] fArr, float f, int i) {
        int i2 = 0;
        if (0 == i) {
            return 0;
        }
        int i3 = i - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            float f2 = fArr[i4];
            if (f2 >= f) {
                if (f2 <= f) {
                    int floatToIntBits = Float.floatToIntBits(f2);
                    int floatToIntBits2 = Float.floatToIntBits(f);
                    if (floatToIntBits != floatToIntBits2) {
                        if (floatToIntBits < floatToIntBits2) {
                        }
                    } else {
                        return i4;
                    }
                }
                i3 = i4 - 1;
            }
            i2 = i4 + 1;
        }
        return -(i2 + 1);
    }

    public static float A00(AnonymousClass690 anonymousClass690, float f, float f2, float f3, float f4) {
        float f5 = f2 - f;
        float f6 = (f3 - f) / f5;
        byte b = anonymousClass690.A00;
        if (b != 0) {
            if (b == 1) {
                return f6;
            }
        } else {
            C3LS c3ls = anonymousClass690.A01;
            C3LS c3ls2 = anonymousClass690.A02;
            if (c3ls != null && c3ls2 != null) {
                float f7 = c3ls.A00;
                float f8 = f7 * 3.0f;
                float f9 = ((c3ls2.A00 - f7) * 3.0f) - f8;
                float f10 = (1.0f - f8) - f9;
                float f11 = c3ls.A01;
                float f12 = f11 * 3.0f;
                float f13 = ((c3ls2.A01 - f11) * 3.0f) - f12;
                float f14 = (1.0f - f12) - f13;
                float min = Math.min(0.005f, 1.0f / ((f5 * f4) * 200.0f));
                int i = 0;
                float f15 = f6;
                do {
                    float f16 = (((((f10 * f15) + f9) * f15) + f8) * f15) - f6;
                    if (Math.abs(f16) < min) {
                        break;
                    }
                    float f17 = (((f10 * 3.0f * f15) + (2.0f * f9)) * f15) + f8;
                    if (Math.abs(f17) < 1.0E-6d) {
                        break;
                    }
                    f15 -= f16 / f17;
                    i++;
                } while (i < 8);
                float f18 = 0.0f;
                f15 = 1.0f;
                if (f6 < 0.0f) {
                    f15 = 0.0f;
                } else if (f6 <= 1.0f) {
                    float f19 = f6;
                    do {
                        float f20 = ((((f10 * f19) + f9) * f19) + f8) * f19;
                        if (Math.abs(f20 - f6) < min) {
                            break;
                        }
                        if (f6 > f20) {
                            f18 = f19;
                        } else {
                            f15 = f19;
                        }
                        f19 = ((f15 - f18) * 0.5f) + f18;
                    } while (f18 < f15);
                    f15 = f19;
                }
                return ((((f14 * f15) + f13) * f15) + f12) * f15;
            }
        }
        return 0.0f;
    }

    public static int A01(Path path, C56562ip c56562ip, float f, float f2, int i, int i2) {
        byte[] bArr = c56562ip.A02;
        float[] fArr = c56562ip.A03;
        byte b = bArr[i];
        if (b == 4) {
            path.close();
        } else {
            int i3 = i2 + 1;
            float f3 = fArr[i2] * f;
            i2 = i3 + 1;
            float f4 = fArr[i3] * f2;
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b == 3) {
                            int i4 = i2 + 1;
                            float f5 = fArr[i2] * f;
                            int i5 = i4 + 1;
                            float f6 = fArr[i4] * f2;
                            int i6 = i5 + 1;
                            int i7 = i6 + 1;
                            path.cubicTo(f5, f6, fArr[i5] * f, fArr[i6] * f2, f3, f4);
                            return i7;
                        }
                    } else {
                        int i8 = i2 + 1;
                        float f7 = fArr[i2] * f;
                        int i9 = i8 + 1;
                        path.quadTo(f7, fArr[i8] * f2, f3, f4);
                        return i9;
                    }
                } else {
                    path.lineTo(f3, f4);
                    return i2;
                }
            } else {
                path.moveTo(f3, f4);
                return i2;
            }
        }
        return i2;
    }

    public static Path A03(Path path, AbstractC1348868e abstractC1348868e, C56562ip c56562ip, C56562ip c56562ip2, float f, float f2, float f3, float f4) {
        if (c56562ip == null || path == null || path.isEmpty()) {
            C56562ip c56562ip3 = (C56562ip) C3LT.A00(c56562ip, c56562ip2, abstractC1348868e, f, f2);
            if (c56562ip3 == null) {
                return null;
            }
            if (path == null) {
                path = new Path();
            } else if (!path.isEmpty()) {
                path.reset();
            }
            int i = 0;
            for (int i2 = 0; i2 < c56562ip3.A00; i2++) {
                i = A01(path, c56562ip3, f3, f4, i2, i);
            }
        }
        return path;
    }
}
