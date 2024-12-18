package X;

/* renamed from: X.Saa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63011Saa {
    public final Integer A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63011Saa) {
                C63011Saa c63011Saa = (C63011Saa) obj;
                if (Float.compare(this.A01, c63011Saa.A01) != 0 || this.A00 != c63011Saa.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final C63199Sf2 A00(float f, float f2) {
        if (this.A00 == C05F.A01) {
            float f3 = this.A01 / 100.0f;
            return new C63199Sf2(f3 * f, f3 * f2);
        }
        float f4 = this.A01;
        return new C63199Sf2(f4, f4);
    }

    public final int hashCode() {
        String str;
        int floatToIntBits = Float.floatToIntBits(this.A01) * 31;
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            str = "PERCENT";
        } else {
            str = "POINT";
        }
        return floatToIntBits + str.hashCode() + intValue;
    }

    public C63011Saa(Integer num, float f) {
        this.A01 = f;
        this.A00 = num;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LengthPercentage(value=");
        A1C.append(this.A01);
        A1C.append(", type=");
        if (this.A00.intValue() != 0) {
            str = "PERCENT";
        } else {
            str = "POINT";
        }
        return AbstractC25236BEt.A0Y(str, A1C);
    }

    public C63011Saa() {
        this(C05F.A00, 0.0f);
    }
}
