package X;

/* loaded from: classes6.dex */
public final class E6R extends C0T6 {
    public final float A00;
    public final C32071E6x A01;
    public final C32071E6x A02;
    public final C45127Jxw A03;
    public final Float A04;
    public final Float A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6R) {
                E6R e6r = (E6R) obj;
                if (!C14360o3.A0K(this.A06, e6r.A06) || !C14360o3.A0K(this.A01, e6r.A01) || !C14360o3.A0K(this.A03, e6r.A03) || !C14360o3.A0K(this.A04, e6r.A04) || !C14360o3.A0K(this.A05, e6r.A05) || Float.compare(this.A00, e6r.A00) != 0 || !C14360o3.A0K(this.A02, e6r.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((AbstractC167017dG.A0O(this.A06) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + Float.floatToIntBits(this.A00)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public E6R(C32071E6x c32071E6x, C32071E6x c32071E6x2, C45127Jxw c45127Jxw, Float f, Float f2, String str, float f3) {
        this.A06 = str;
        this.A01 = c32071E6x;
        this.A03 = c45127Jxw;
        this.A04 = f;
        this.A05 = f2;
        this.A00 = f3;
        this.A02 = c32071E6x2;
    }
}
