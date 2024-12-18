package X;

/* renamed from: X.9ZL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZL extends C0T6 {
    public String A01 = "";
    public String A02 = "";
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";
    public String A03 = "";
    public String A07 = "";
    public int A00 = -1;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZL) {
                C9ZL c9zl = (C9ZL) obj;
                if (!C14360o3.A0K(this.A01, c9zl.A01) || !C14360o3.A0K(this.A02, c9zl.A02) || !C14360o3.A0K(this.A04, c9zl.A04) || !C14360o3.A0K(this.A05, c9zl.A05) || !C14360o3.A0K(this.A06, c9zl.A06) || !C14360o3.A0K(this.A03, c9zl.A03) || !C14360o3.A0K(this.A07, c9zl.A07) || this.A00 != c9zl.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01))))))) + this.A00;
    }
}
