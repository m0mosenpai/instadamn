package X;

/* loaded from: classes5.dex */
public final class CV5 {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CV5) && this.A00 == ((CV5) obj).A00);
    }

    public final int hashCode() {
        int A02 = AbstractC25235BEs.A02(this.A00);
        int floatToIntBits = Float.floatToIntBits(10.0f);
        return ((A02 + floatToIntBits) * 31) + floatToIntBits;
    }

    public CV5(float f) {
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ResistanceConfig(basis=");
        A1C.append(this.A00);
        A1C.append(", factorAtMin=");
        A1C.append(10.0f);
        A1C.append(", factorAtMax=");
        A1C.append(10.0f);
        return AbstractC167017dG.A0p(A1C);
    }
}
