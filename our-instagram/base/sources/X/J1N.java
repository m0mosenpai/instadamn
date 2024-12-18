package X;

/* loaded from: classes7.dex */
public final class J1N implements InterfaceC70493Ek {
    public final int A00;
    public final Object A01;

    public J1N(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC70493Ek
    public final void DeM() {
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 0:
                HDJ hdj = (HDJ) this.A01;
                hdj.A08.Cmo(new C38290GsZ(4, hdj, true), true);
                return;
            case 1:
                HCR hcr = (HCR) this.A01;
                ((IM9) hcr.A0J.getValue()).A00(AbstractC25225BEi.A15(hcr.A0C));
                return;
            case 2:
                interfaceC09390do = ((HCU) this.A01).A0E;
                break;
            case 3:
                interfaceC09390do = ((HCX) this.A01).A0L;
                break;
            case 4:
                interfaceC09390do = ((HCV) this.A01).A0E;
                break;
            case 5:
                interfaceC09390do = ((HCW) this.A01).A0M;
                break;
            case 6:
                HCS.A00((HCS) this.A01);
                return;
            default:
                HCT.A00((HCT) this.A01);
                return;
        }
        J1L.A00(interfaceC09390do);
    }
}
