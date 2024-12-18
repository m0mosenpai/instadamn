package X;

import android.util.SizeF;

/* renamed from: X.L9m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47804L9m {
    public final float A00;
    public final float A01;
    public final float A02;
    public final SizeF A03;
    public final SizeF A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47804L9m) {
                C47804L9m c47804L9m = (C47804L9m) obj;
                if (!C14360o3.A0K(this.A03, c47804L9m.A03) || Float.compare(this.A00, c47804L9m.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A03) + Float.floatToIntBits(this.A00);
    }

    public C47804L9m(SizeF sizeF, float f) {
        this.A03 = sizeF;
        this.A00 = f;
        float f2 = 6.2831855f * f;
        float f3 = f * 2.0f;
        this.A04 = new SizeF(sizeF.getWidth() - f3, sizeF.getHeight() - f3);
        this.A02 = (((sizeF.getWidth() * 2.0f) + (sizeF.getHeight() * 2.0f)) - (f * 8.0f)) + f2;
        this.A01 = f2 / 4.0f;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RoundedRect(size=");
        A1C.append(this.A03);
        A1C.append(AbstractC111324zv.A00(575));
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
