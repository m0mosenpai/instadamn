package X;

/* renamed from: X.KXr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46003KXr extends AbstractC47449Kxe {
    public final int A00;
    public final C45119Jxo A01;
    public final C45128JyU A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46003KXr) {
                C46003KXr c46003KXr = (C46003KXr) obj;
                if (this.A06 != c46003KXr.A06 || !C14360o3.A0K(this.A02, c46003KXr.A02) || this.A00 != c46003KXr.A00 || !C14360o3.A0K(this.A01, c46003KXr.A01) || this.A05 != c46003KXr.A05 || this.A04 != c46003KXr.A04 || !C14360o3.A0K(this.A03, c46003KXr.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public C46003KXr(C45119Jxo c45119Jxo, C45128JyU c45128JyU, String str, int i, boolean z, boolean z2, boolean z3) {
        super(new C17u(i, 19));
        this.A06 = z;
        this.A02 = c45128JyU;
        this.A00 = i;
        this.A01 = c45119Jxo;
        this.A05 = z2;
        this.A04 = z3;
        this.A03 = str;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A01, (AbstractC166997dE.A0J(this.A02, AbstractC25225BEi.A08(this.A06)) + this.A00) * 31))) + AbstractC167017dG.A0O(this.A03);
    }
}
