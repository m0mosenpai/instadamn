package X;

/* loaded from: classes9.dex */
public final class P2N implements InterfaceC62612t0 {
    public final int A00;
    public final Object A01;

    public P2N(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        C141796aw A00;
        InterfaceC16620sF pzb;
        String str;
        switch (this.A00) {
            case 0:
                ((UFL) ((C52108N4g) this.A01).A07.getValue()).A00();
                return;
            case 1:
                ((N73) this.A01).A04(false);
                return;
            case 2:
                ((C51055Mh9) ((C52168N6x) this.A01).A0P.getValue()).Chd();
                return;
            case 3:
                ((P64) this.A01).A04.AD4();
                return;
            case 4:
                C50945MfE c50945MfE = (C50945MfE) ((HCY) this.A01).A0C.getValue();
                C05A c05a = c50945MfE.A05;
                if ((c05a.getValue() instanceof C52668NRp) || (c05a.getValue() instanceof C52669NRq) || !c50945MfE.A01) {
                    return;
                }
                c05a.Egh(C52669NRq.A00);
                A00 = AbstractC141776au.A00(c50945MfE);
                pzb = new PZW((Object) c50945MfE, (InterfaceC23621Ds) null, 41, false);
                break;
            case 5:
                N7L.A01((N7L) this.A01);
                return;
            case 6:
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((N7M) this.A01).A0L);
                A00 = AbstractC141776au.A00(A0Z);
                pzb = new PZB(A0Z, (InterfaceC23621Ds) null, 46);
                break;
            case 7:
                ((N87) ((C52177N7m) this.A01).A04.getValue()).A02();
                return;
            case 8:
                N7O n7o = (N7O) this.A01;
                String str2 = n7o.A08;
                if (str2 == null) {
                    str = "mediaId";
                } else {
                    OKz oKz = n7o.A02;
                    if (oKz == null) {
                        str = "interactor";
                    } else {
                        oKz.A01(str2, false, n7o.A07);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                ((AbstractC52113N4l) this.A01).A04(false);
                return;
        }
        AbstractC166987dD.A1Z(pzb, A00);
    }
}
