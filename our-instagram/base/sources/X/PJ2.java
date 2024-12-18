package X;

/* loaded from: classes9.dex */
public final class PJ2 implements XDT {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public PJ2(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.XDT
    public final void CuW() {
        AbstractC52922bZ abstractC52922bZ;
        C141796aw A00;
        int i;
        int i2 = this.A00;
        C51169MjD c51169MjD = (C51169MjD) this.A02;
        switch (i2) {
            case 0:
                c51169MjD.A05.E0R((C56802PIt) this.A01);
                return;
            case 1:
                InterfaceC58172Pqc interfaceC58172Pqc = c51169MjD.A05;
                InterfaceC58171Pqb interfaceC58171Pqb = (InterfaceC58171Pqb) this.A01;
                AbstractC52821NZe abstractC52821NZe = (AbstractC52821NZe) interfaceC58172Pqc;
                if (abstractC52821NZe instanceof C52819NZc) {
                    abstractC52922bZ = ((C52819NZc) abstractC52821NZe).A03;
                } else {
                    abstractC52922bZ = abstractC52821NZe.A03;
                }
                if (abstractC52922bZ instanceof C52863NaK) {
                    EnumC53264Nh2 BO3 = interfaceC58171Pqb.BO3();
                    if (BO3 == EnumC53264Nh2.A0D) {
                        A00 = AbstractC141776au.A00(abstractC52922bZ);
                        i = 46;
                    } else {
                        if (BO3 != EnumC53264Nh2.A0J) {
                            return;
                        }
                        A00 = AbstractC141776au.A00(abstractC52922bZ);
                        i = 47;
                    }
                    PZE.A02(abstractC52922bZ, A00, i);
                    return;
                }
                PZY.A02(interfaceC58171Pqb, abstractC52922bZ, AbstractC141776au.A00(abstractC52922bZ), 3);
                return;
            default:
                c51169MjD.A05.CvU();
                int indexOf = c51169MjD.A07.indexOf((InterfaceC58171Pqb) this.A01);
                if (indexOf >= 0) {
                    c51169MjD.notifyItemChanged(C51169MjD.A00(c51169MjD, indexOf));
                    return;
                }
                return;
        }
    }

    @Override // X.XDT
    public final void D69() {
    }

    @Override // X.XDT
    public final void DDH() {
    }
}
