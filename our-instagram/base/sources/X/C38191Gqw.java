package X;

/* renamed from: X.Gqw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38191Gqw implements InterfaceC73023Pd {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C38191Gqw(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj4;
    }

    @Override // X.InterfaceC73023Pd
    public final void DFp() {
        AbstractC127945qN abstractC127945qN;
        AbstractC42425IqS abstractC42425IqS;
        C38321qM c38321qM;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                abstractC42425IqS = (AbstractC42425IqS) this.A01;
                c38321qM = (C38321qM) this.A03;
                C5qT c5qT = (C5qT) this.A02;
                i = c5qT.A01;
                i2 = c5qT.A00;
                abstractC127945qN = (AbstractC127945qN) this.A04;
                break;
            case 1:
                C38094GpN c38094GpN = (C38094GpN) this.A04;
                abstractC127945qN = (AbstractC127945qN) this.A03;
                C5qT c5qT2 = (C5qT) this.A01;
                abstractC42425IqS = c38094GpN.A03;
                c38321qM = (C38321qM) this.A02;
                i = c5qT2.A01;
                i2 = c5qT2.A00;
                break;
            default:
                return;
        }
        abstractC42425IqS.DRu(c38321qM, abstractC127945qN.A01, i, i2);
    }

    @Override // X.InterfaceC73023Pd
    public final void DPX(C73083Pj c73083Pj) {
        C38321qM c38321qM;
        int i;
        int i2;
        AbstractC127945qN abstractC127945qN;
        AbstractC42425IqS abstractC42425IqS;
        switch (this.A00) {
            case 0:
                AbstractC42425IqS abstractC42425IqS2 = (AbstractC42425IqS) this.A01;
                c38321qM = (C38321qM) this.A03;
                C5qT c5qT = (C5qT) this.A02;
                i = c5qT.A01;
                i2 = c5qT.A00;
                abstractC42425IqS = abstractC42425IqS2;
                abstractC127945qN = (AbstractC127945qN) this.A04;
                break;
            case 1:
                AbstractC42425IqS abstractC42425IqS3 = ((C38094GpN) this.A04).A03;
                HKV hkv = (HKV) this.A03;
                C5qT c5qT2 = (C5qT) this.A01;
                abstractC42425IqS3.A0F(c5qT2, hkv);
                c38321qM = (C38321qM) this.A02;
                i = c5qT2.A01;
                i2 = c5qT2.A00;
                abstractC42425IqS = abstractC42425IqS3;
                abstractC127945qN = hkv;
                break;
            default:
                return;
        }
        abstractC42425IqS.DRw(c38321qM, abstractC127945qN.A01, i, i2);
    }
}
