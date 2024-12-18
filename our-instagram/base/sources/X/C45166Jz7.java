package X;

/* renamed from: X.Jz7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45166Jz7 extends C0T6 implements InterfaceC50392MMu {
    public final C45037JwS A00;
    public final C45125Jxu A01;
    public final AbstractC46399KgL A02;
    public final C5QE A03;
    public final Integer A04;
    public final boolean A05;

    public C45166Jz7(C45037JwS c45037JwS, C45125Jxu c45125Jxu, AbstractC46399KgL abstractC46399KgL, C5QE c5qe, Integer num, boolean z) {
        C14360o3.A0B(num, 6);
        this.A00 = c45037JwS;
        this.A01 = c45125Jxu;
        this.A03 = c5qe;
        this.A05 = z;
        this.A02 = abstractC46399KgL;
        this.A04 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45166Jz7) {
                C45166Jz7 c45166Jz7 = (C45166Jz7) obj;
                if (!C14360o3.A0K(this.A00, c45166Jz7.A00) || !C14360o3.A0K(this.A01, c45166Jz7.A01) || !C14360o3.A0K(this.A03, c45166Jz7.A03) || this.A05 != c45166Jz7.A05 || !C14360o3.A0K(this.A02, c45166Jz7.A02) || this.A04 != c45166Jz7.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A03, (AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01)) * 31))) + AbstractC46612Kjp.A00(this.A04);
    }
}
