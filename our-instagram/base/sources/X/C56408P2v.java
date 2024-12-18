package X;

/* renamed from: X.P2v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56408P2v implements InterfaceC199918sv {
    public final int A00;
    public final Object A01;

    public C56408P2v(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        OZT A08;
        Integer num;
        C55177Odh c55177Odh;
        InterfaceC57854PlK c56621PBr;
        switch (this.A00) {
            case 0:
                ((C50676MYu) this.A01).A0A.onClick(null);
                return;
            case 1:
                A08 = ((PCT) this.A01).A08();
                num = C05F.A00;
                break;
            case 2:
                A08 = ((PCT) this.A01).A08();
                num = C05F.A01;
                break;
            case 3:
                A08 = ((PCT) this.A01).A08();
                num = C05F.A0C;
                break;
            case 4:
                NTG ntg = (NTG) this.A01;
                ntg.A05.invoke(ntg.A01);
                return;
            case 5:
                NTG ntg2 = (NTG) this.A01;
                c55177Odh = ntg2.A03;
                C51886MwU c51886MwU = ntg2.A00;
                boolean z = false;
                if (c51886MwU != null && c51886MwU.A00) {
                    z = true;
                }
                c56621PBr = new C56621PBr(!z);
                c55177Odh.A03(c56621PBr);
                return;
            default:
                c55177Odh = ((NTG) this.A01).A03;
                c56621PBr = new C56622PBs(true);
                c55177Odh.A03(c56621PBr);
                return;
        }
        OZT.A01(A08, num);
    }
}
