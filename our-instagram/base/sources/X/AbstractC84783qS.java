package X;

import android.content.res.TypedArray;

/* renamed from: X.3qS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84783qS {
    public final C84793qT A00 = new C84793qT();

    public AbstractC84783qS A00(TypedArray typedArray) {
        if (typedArray.hasValue(3)) {
            C84793qT c84793qT = this.A00;
            c84793qT.A0I = typedArray.getBoolean(3, c84793qT.A0I);
        }
        if (typedArray.hasValue(0)) {
            C84793qT c84793qT2 = this.A00;
            c84793qT2.A0H = typedArray.getBoolean(0, c84793qT2.A0H);
        }
        if (typedArray.hasValue(1)) {
            A02(typedArray.getFloat(1, 0.3f));
        }
        if (typedArray.hasValue(11)) {
            A03(typedArray.getFloat(11, 1.0f));
        }
        if (typedArray.hasValue(7)) {
            A04(typedArray.getInt(7, (int) this.A00.A0D));
        }
        if (typedArray.hasValue(14)) {
            C84793qT c84793qT3 = this.A00;
            c84793qT3.A0A = typedArray.getInt(14, c84793qT3.A0A);
        }
        if (typedArray.hasValue(15)) {
            C84793qT c84793qT4 = this.A00;
            long j = typedArray.getInt(15, (int) c84793qT4.A0E);
            if (j >= 0) {
                c84793qT4.A0E = j;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0Q("Given a negative repeat delay: ", j));
            }
        }
        if (typedArray.hasValue(16)) {
            C84793qT c84793qT5 = this.A00;
            c84793qT5.A0B = typedArray.getInt(16, c84793qT5.A0B);
        }
        if (typedArray.hasValue(18)) {
            C84793qT c84793qT6 = this.A00;
            long j2 = typedArray.getInt(18, (int) c84793qT6.A0F);
            if (j2 >= 0) {
                c84793qT6.A0F = j2;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0Q("Given a negative start delay: ", j2));
            }
        }
        if (typedArray.hasValue(5)) {
            C84793qT c84793qT7 = this.A00;
            int i = typedArray.getInt(5, c84793qT7.A06);
            if (i != 1) {
                int i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        c84793qT7.A06 = 0;
                    }
                }
                c84793qT7.A06 = i2;
            } else {
                c84793qT7.A06 = 1;
            }
        }
        if (typedArray.hasValue(17)) {
            C84793qT c84793qT8 = this.A00;
            if (typedArray.getInt(17, c84793qT8.A0C) != 1) {
                c84793qT8.A0C = 0;
            } else {
                c84793qT8.A0C = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            C84793qT c84793qT9 = this.A00;
            float f = typedArray.getFloat(6, c84793qT9.A00);
            if (f >= 0.0f) {
                c84793qT9.A00 = f;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0N("Given invalid dropoff value: ", f));
            }
        }
        if (typedArray.hasValue(9)) {
            C84793qT c84793qT10 = this.A00;
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, c84793qT10.A08);
            if (dimensionPixelSize >= 0) {
                c84793qT10.A08 = dimensionPixelSize;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0O("Given invalid width: ", dimensionPixelSize));
            }
        }
        if (typedArray.hasValue(8)) {
            C84793qT c84793qT11 = this.A00;
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, c84793qT11.A07);
            if (dimensionPixelSize2 >= 0) {
                c84793qT11.A07 = dimensionPixelSize2;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0O("Given invalid height: ", dimensionPixelSize2));
            }
        }
        if (typedArray.hasValue(13)) {
            C84793qT c84793qT12 = this.A00;
            float f2 = typedArray.getFloat(13, c84793qT12.A02);
            if (f2 >= 0.0f) {
                c84793qT12.A02 = f2;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0N("Given invalid intensity value: ", f2));
            }
        }
        if (typedArray.hasValue(20)) {
            C84793qT c84793qT13 = this.A00;
            float f3 = typedArray.getFloat(20, c84793qT13.A04);
            if (f3 >= 0.0f) {
                c84793qT13.A04 = f3;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0N("Given invalid width ratio: ", f3));
            }
        }
        if (typedArray.hasValue(10)) {
            C84793qT c84793qT14 = this.A00;
            float f4 = typedArray.getFloat(10, c84793qT14.A01);
            if (f4 >= 0.0f) {
                c84793qT14.A01 = f4;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0N("Given invalid height ratio: ", f4));
            }
        }
        if (typedArray.hasValue(19)) {
            C84793qT c84793qT15 = this.A00;
            c84793qT15.A03 = typedArray.getFloat(19, c84793qT15.A03);
        }
        return this;
    }

    public final void A02(float f) {
        int min = (int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f);
        C84793qT c84793qT = this.A00;
        c84793qT.A05 = (min << 24) | (c84793qT.A05 & 16777215);
    }

    public final void A03(float f) {
        int min = (int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f);
        C84793qT c84793qT = this.A00;
        c84793qT.A09 = (min << 24) | (c84793qT.A09 & 16777215);
    }

    public final C84793qT A01() {
        int i;
        C84793qT c84793qT = this.A00;
        int i2 = c84793qT.A0C;
        int[] iArr = c84793qT.A0L;
        if (i2 != 1) {
            i = c84793qT.A05;
            iArr[0] = i;
            int i3 = c84793qT.A09;
            iArr[1] = i3;
            iArr[2] = i3;
        } else {
            int i4 = c84793qT.A09;
            iArr[0] = i4;
            iArr[1] = i4;
            i = c84793qT.A05;
            iArr[2] = i;
        }
        iArr[3] = i;
        float[] fArr = c84793qT.A0K;
        if (i2 != 1) {
            float f = c84793qT.A02;
            float f2 = 1.0f - f;
            float f3 = c84793qT.A00;
            fArr[0] = Math.max((f2 - f3) / 2.0f, 0.0f);
            fArr[1] = Math.max((f2 - 0.001f) / 2.0f, 0.0f);
            float f4 = f + 1.0f;
            fArr[2] = Math.min((f4 + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min((f4 + f3) / 2.0f, 1.0f);
            return c84793qT;
        }
        fArr[0] = 0.0f;
        float f5 = c84793qT.A02;
        fArr[1] = Math.min(f5, 1.0f);
        fArr[2] = Math.min(f5 + c84793qT.A00, 1.0f);
        fArr[3] = 1.0f;
        return c84793qT;
    }

    public final void A04(long j) {
        if (j >= 0) {
            this.A00.A0D = j;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0Q("Given a negative duration: ", j));
    }
}
