package X;

/* renamed from: X.5vm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC130985vm {
    public static final boolean A00(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (((((f17 * f28) - (f18 * f27)) + (f19 * f26)) + (f20 * f25)) - (f21 * f24)) + (f22 * f23);
        if (f29 == 0.0f) {
            return false;
        }
        float f30 = 1.0f / f29;
        fArr2[0] = (((f6 * f28) - (f7 * f27)) + (f8 * f26)) * f30;
        fArr2[1] = ((((-f2) * f28) + (f3 * f27)) - (f4 * f26)) * f30;
        fArr2[2] = (((f14 * f22) - (f15 * f21)) + (f16 * f20)) * f30;
        fArr2[3] = ((((-f10) * f22) + (f11 * f21)) - (f12 * f20)) * f30;
        float f31 = -f5;
        fArr2[4] = (((f31 * f28) + (f7 * f25)) - (f8 * f24)) * f30;
        fArr2[5] = (((f28 * f) - (f3 * f25)) + (f4 * f24)) * f30;
        float f32 = -f13;
        fArr2[6] = (((f32 * f22) + (f15 * f19)) - (f16 * f18)) * f30;
        fArr2[7] = (((f22 * f9) - (f11 * f19)) + (f12 * f18)) * f30;
        fArr2[8] = (((f5 * f27) - (f6 * f25)) + (f8 * f23)) * f30;
        fArr2[9] = ((((-f) * f27) + (f25 * f2)) - (f4 * f23)) * f30;
        fArr2[10] = (((f13 * f21) - (f14 * f19)) + (f16 * f17)) * f30;
        fArr2[11] = ((((-f9) * f21) + (f19 * f10)) - (f12 * f17)) * f30;
        fArr2[12] = (((f31 * f26) + (f6 * f24)) - (f7 * f23)) * f30;
        fArr2[13] = (((f * f26) - (f2 * f24)) + (f3 * f23)) * f30;
        fArr2[14] = (((f32 * f20) + (f14 * f18)) - (f15 * f17)) * f30;
        fArr2[15] = (((f9 * f20) - (f10 * f18)) + (f11 * f17)) * f30;
        return true;
    }
}
