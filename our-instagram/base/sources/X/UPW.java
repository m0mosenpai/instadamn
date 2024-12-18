package X;

/* loaded from: classes11.dex */
public final class UPW extends C0T6 {
    public Boolean A00 = null;
    public Boolean A01 = null;
    public Integer A07 = null;
    public Integer A08 = null;
    public String A0A = null;
    public Boolean A02 = null;
    public String A0B = null;
    public Boolean A03 = null;
    public Boolean A04 = null;
    public Integer A09 = null;
    public String A0C = null;
    public Boolean A05 = null;
    public String A0D = null;
    public String A0E = null;
    public String A0F = null;
    public Boolean A06 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPW) {
                UPW upw = (UPW) obj;
                if (!C14360o3.A0K(this.A00, upw.A00) || !C14360o3.A0K(this.A01, upw.A01) || !C14360o3.A0K(this.A07, upw.A07) || !C14360o3.A0K(this.A08, upw.A08) || !C14360o3.A0K(this.A0A, upw.A0A) || !C14360o3.A0K(this.A02, upw.A02) || !C14360o3.A0K(this.A0B, upw.A0B) || !C14360o3.A0K(this.A03, upw.A03) || !C14360o3.A0K(this.A04, upw.A04) || !C14360o3.A0K(this.A09, upw.A09) || !C14360o3.A0K(this.A0C, upw.A0C) || !C14360o3.A0K(this.A05, upw.A05) || !C14360o3.A0K(this.A0D, upw.A0D) || !C14360o3.A0K(this.A0E, upw.A0E) || !C14360o3.A0K(this.A0F, upw.A0F) || !C14360o3.A0K(this.A06, upw.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((((((((((((((((((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31;
        Boolean bool = this.A06;
        if (bool != null) {
            i = bool.hashCode();
        }
        return A0M + i;
    }
}
