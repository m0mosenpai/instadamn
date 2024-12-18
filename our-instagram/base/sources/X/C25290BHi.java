package X;

/* renamed from: X.BHi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25290BHi extends C0T6 implements InterfaceC31038Dkc {
    public final int A00;
    public final C26086BgF A01;
    public final C45126Jxv A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25290BHi) {
                C25290BHi c25290BHi = (C25290BHi) obj;
                if (this.A00 != c25290BHi.A00 || !C14360o3.A0K(this.A03, c25290BHi.A03) || !C14360o3.A0K(this.A01, c25290BHi.A01) || !C14360o3.A0K(this.A02, c25290BHi.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31038Dkc
    public final boolean BBa() {
        return AbstractC167007dF.A1W(this.A02);
    }

    public final int hashCode() {
        return (((((this.A00 * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C25290BHi(C26086BgF c26086BgF, C45126Jxv c45126Jxv, Integer num, int i) {
        this.A00 = i;
        this.A03 = num;
        this.A01 = c26086BgF;
        this.A02 = c45126Jxv;
    }

    @Override // X.InterfaceC31038Dkc
    public final C26086BgF AsB() {
        return this.A01;
    }

    @Override // X.InterfaceC31038Dkc
    public final int BcB() {
        return this.A00;
    }
}
