package X;

/* loaded from: classes7.dex */
public final class H2S extends C0T6 implements JIQ {
    public final Float A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2S) {
                H2S h2s = (H2S) obj;
                if (!C14360o3.A0K(this.A00, h2s.A00) || !C14360o3.A0K(this.A01, h2s.A01) || !C14360o3.A0K(this.A02, h2s.A02) || !C14360o3.A0K(this.A03, h2s.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public H2S(Float f, Float f2, Float f3, Float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }
}
