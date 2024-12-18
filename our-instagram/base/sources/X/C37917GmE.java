package X;

/* renamed from: X.GmE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37917GmE extends C0T6 implements InterfaceC31098Dlg {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37917GmE) {
                C37917GmE c37917GmE = (C37917GmE) obj;
                if (!C14360o3.A0K(this.A01, c37917GmE.A01) || this.A03 != c37917GmE.A03 || this.A05 != c37917GmE.A05 || this.A06 != c37917GmE.A06 || this.A00 != c37917GmE.A00 || this.A04 != c37917GmE.A04 || !C14360o3.A0K(this.A02, c37917GmE.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A04, (AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0J(this.A01)))) + this.A00) * 31) + AbstractC167017dG.A0O(this.A02);
    }

    public C37917GmE(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = str;
        this.A03 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A00 = i;
        this.A04 = z4;
        this.A02 = str2;
    }
}
