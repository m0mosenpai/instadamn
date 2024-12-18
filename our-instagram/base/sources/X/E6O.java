package X;

/* loaded from: classes6.dex */
public final class E6O extends C0T6 {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public E6O(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str, 2);
        AbstractC167017dG.A1T(str4, str5);
        this.A00 = bool;
        this.A01 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6O) {
                E6O e6o = (E6O) obj;
                if (!C14360o3.A0K(this.A00, e6o.A00) || !C14360o3.A0K(this.A01, e6o.A01) || !C14360o3.A0K(this.A05, e6o.A05) || !C14360o3.A0K(this.A02, e6o.A02) || !C14360o3.A0K(this.A03, e6o.A03) || !C14360o3.A0K(this.A04, e6o.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A04, AbstractC166997dE.A0K(this.A03, (((AbstractC166997dE.A0K(this.A01, AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A02)) * 31));
    }
}
