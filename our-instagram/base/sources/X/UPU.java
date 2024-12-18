package X;

/* loaded from: classes11.dex */
public final class UPU extends C0T6 {
    public String A07 = "";
    public String A09 = "";
    public String A06 = null;
    public C26068Bfw A00 = null;
    public String A08 = null;
    public Boolean A04 = null;
    public Boolean A03 = null;
    public String A05 = null;
    public Boolean A01 = null;
    public Boolean A02 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPU) {
                UPU upu = (UPU) obj;
                if (!C14360o3.A0K(this.A07, upu.A07) || !C14360o3.A0K(this.A09, upu.A09) || !C14360o3.A0K(this.A06, upu.A06) || !C14360o3.A0K(this.A00, upu.A00) || !C14360o3.A0K(this.A08, upu.A08) || !C14360o3.A0K(this.A04, upu.A04) || !C14360o3.A0K(this.A03, upu.A03) || !C14360o3.A0K(this.A05, upu.A05) || !C14360o3.A0K(this.A01, upu.A01) || !C14360o3.A0K(this.A02, upu.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0K = (((((((((((((AbstractC166997dE.A0K(this.A09, this.A07.hashCode() * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
        Boolean bool = this.A02;
        if (bool != null) {
            i = bool.hashCode();
        }
        return A0K + i;
    }
}
