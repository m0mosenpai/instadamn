package X;

import android.graphics.Typeface;

/* loaded from: classes5.dex */
public final class CW6 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Typeface A03;
    public final COS A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CW6) {
                CW6 cw6 = (CW6) obj;
                if (!C14360o3.A0K(this.A03, cw6.A03) || Float.compare(this.A00, cw6.A00) != 0 || Float.compare(this.A01, cw6.A01) != 0 || !C14360o3.A0K(this.A04, cw6.A04) || this.A02 != cw6.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166987dD.A0G(this.A03), this.A00), this.A01)) + this.A02;
    }

    public CW6(Typeface typeface, COS cos, float f, float f2, int i) {
        this.A03 = typeface;
        this.A00 = f;
        this.A01 = f2;
        this.A04 = cos;
        this.A02 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TextStyleValues(typeface=");
        A1C.append(this.A03);
        A1C.append(", fontSize=");
        A1C.append(this.A00);
        A1C.append(AbstractC111324zv.A00(1430));
        A1C.append(this.A01);
        A1C.append(AbstractC111324zv.A00(3401));
        A1C.append(this.A04);
        A1C.append(", textColor=");
        return AbstractC25236BEt.A0Z(A1C, this.A02);
    }
}
