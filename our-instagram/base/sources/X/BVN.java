package X;

/* loaded from: classes5.dex */
public final class BVN implements InterfaceC73023Pd {
    public final int A00;
    public final Object A01;

    @Override // X.InterfaceC73023Pd
    public final void DFp() {
    }

    public BVN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC73023Pd
    public final void DPX(C73083Pj c73083Pj) {
        if (this.A00 != 0) {
            C26413Blw c26413Blw = (C26413Blw) this.A01;
            C57782kr A00 = C57782kr.A00(c26413Blw.A01);
            C38321qM c38321qM = c26413Blw.A00.A02;
            if (c38321qM != null) {
                A00.A0O(c38321qM.A2u(), null);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        C14360o3.A0B(c73083Pj, 0);
        if (c73083Pj.A02 == null) {
            return;
        }
        AbstractC25398BLp abstractC25398BLp = ((BV3) this.A01).A08;
        C38321qM c38321qM2 = abstractC25398BLp.A0D.A02;
        if (c38321qM2 != null) {
            C57782kr.A00(abstractC25398BLp.A0H).A0O(c38321qM2.A2u(), null);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
