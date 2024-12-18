package X;

/* loaded from: classes7.dex */
public final class H2O extends C0T6 implements InterfaceC58214PrK {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2O) {
                H2O h2o = (H2O) obj;
                if (!C14360o3.A0K(this.A00, h2o.A00) || !C14360o3.A0K(this.A01, h2o.A01) || !C14360o3.A0K(this.A02, h2o.A02) || !C14360o3.A0K(this.A03, h2o.A03) || !C14360o3.A0K(this.A04, h2o.A04) || !C14360o3.A0K(this.A05, h2o.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A05);
    }

    public H2O(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        this.A00 = bool;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }
}
