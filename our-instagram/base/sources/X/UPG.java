package X;

/* loaded from: classes11.dex */
public final class UPG extends C0T6 {
    public final int A00;
    public final C51752Mtb A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public UPG(C51752Mtb c51752Mtb, String str, String str2, String str3, String str4, int i) {
        C14360o3.A0B(str, 1);
        this.A05 = str;
        this.A04 = str2;
        this.A01 = c51752Mtb;
        this.A00 = i;
        this.A02 = str3;
        this.A03 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPG) {
                UPG upg = (UPG) obj;
                if (!C14360o3.A0K(this.A05, upg.A05) || !C14360o3.A0K(this.A04, upg.A04) || !C14360o3.A0K(this.A01, upg.A01) || this.A00 != upg.A00 || !C14360o3.A0K(this.A02, upg.A02) || !C14360o3.A0K(this.A03, upg.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((AbstractC166997dE.A0J(this.A01, ((this.A05.hashCode() * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return A0J + i;
    }
}
