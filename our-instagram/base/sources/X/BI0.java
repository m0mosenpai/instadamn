package X;

/* loaded from: classes5.dex */
public final class BI0 implements InterfaceC58121Ppk {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public BI0(C54781OIv c54781OIv, C26020Bf9 c26020Bf9, InterfaceC16620sF interfaceC16620sF) {
        this.A00 = 2;
        this.A02 = c54781OIv;
        this.A03 = c26020Bf9;
        this.A01 = interfaceC16620sF;
    }

    @Override // X.InterfaceC58121Ppk
    public final void DAq() {
        if (2 - this.A00 != 0) {
            AbstractC166987dD.A1Y(this.A01);
            return;
        }
        C54781OIv c54781OIv = (C54781OIv) this.A02;
        C26020Bf9 c26020Bf9 = (C26020Bf9) this.A03;
        c54781OIv.A00(c26020Bf9.A01, c26020Bf9.A00);
    }

    @Override // X.InterfaceC58121Ppk
    public final void DXG() {
        if (2 - this.A00 == 0) {
            InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A01;
            C26020Bf9 c26020Bf9 = (C26020Bf9) this.A03;
            AbstractC25227BEk.A1P(c26020Bf9.A01, interfaceC16620sF, c26020Bf9.A00);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC58121Ppk
    public final void Dhm() {
        Object obj;
        switch (this.A00) {
            case 2:
                C54781OIv c54781OIv = (C54781OIv) this.A02;
                C26020Bf9 c26020Bf9 = (C26020Bf9) this.A03;
                C47P c47p = c26020Bf9.A01;
                int i = c26020Bf9.A00;
                C14360o3.A0B(c47p, 0);
                if (!((java.util.Set) c54781OIv.A03.getValue()).add(c47p.CDj().getId())) {
                    return;
                }
                String id = c47p.getId();
                C63702ur c63702ur = c54781OIv.A02;
                C6PG c6pg = new C6PG("fullscreen", id, c63702ur.A02);
                c6pg.A00 = i;
                String CEI = c47p.CEI();
                if (CEI != null) {
                    c6pg.A07 = CEI;
                }
                c6pg.A04 = c47p.getAlgorithm();
                c6pg.A0B = c47p.ByJ();
                c6pg.A0C = c47p.C9e();
                c63702ur.A09(new C6PH(c6pg));
                return;
            case 3:
                obj = this.A02;
                AbstractC166987dD.A1Y(obj);
                return;
            default:
                obj = this.A03;
                AbstractC166987dD.A1Y(obj);
                return;
        }
    }

    public BI0(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i) {
        this.A00 = i;
        this.A01 = interfaceC16820sZ;
        switch (i) {
            case 0:
            case 1:
                this.A02 = interfaceC16820sZ2;
                this.A03 = interfaceC16820sZ3;
                break;
            default:
                this.A03 = interfaceC16820sZ2;
                this.A02 = interfaceC16820sZ3;
                break;
        }
    }
}
