package X;

/* loaded from: classes6.dex */
public final class E6W extends C0T6 {
    public String A03 = null;
    public String A05 = null;
    public Long A01 = null;
    public boolean A07 = false;
    public String A02 = null;
    public String A04 = null;
    public Integer A00 = 0;
    public boolean A06 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6W) {
                E6W e6w = (E6W) obj;
                if (!C14360o3.A0K(this.A03, e6w.A03) || !C14360o3.A0K(this.A05, e6w.A05) || !C14360o3.A0K(this.A01, e6w.A01) || this.A07 != e6w.A07 || !C14360o3.A0K(this.A02, e6w.A02) || !C14360o3.A0K(this.A04, e6w.A04) || !C14360o3.A0K(this.A00, e6w.A00) || this.A06 != e6w.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, (((((AbstractC167007dF.A0D(this.A07, ((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A00)) * 31);
    }
}
