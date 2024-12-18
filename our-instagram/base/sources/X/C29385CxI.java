package X;

/* renamed from: X.CxI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29385CxI implements InterfaceC1119153d {
    public final int A00;
    public final Object A01;

    public C29385CxI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        switch (this.A00) {
            case 0:
                C28238Cci.A00.A01(((C25814BbV) this.A01).A0C.A02);
                return;
            case 1:
                CQH cqh = (CQH) this.A01;
                BRG.A03(cqh.A00, cqh.A01);
                return;
            case 2:
                return;
            case 3:
            case 4:
            default:
                ((InterfaceC31039Dkd) this.A01).DWM();
                return;
            case 5:
                ((CSY) this.A01).A03.ESs(true);
                return;
            case 6:
                C29138Ct5 A12 = AbstractC25226BEj.A12(((C26802BsQ) this.A01).A02);
                EnumC39642HiX enumC39642HiX = EnumC39642HiX.PROFILE_BIO;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(C29138Ct5.A00(A12), "ig_school_reliability_remove_school_bottomsheet_dismiss_tap");
                if (!A0f.isSampled()) {
                    return;
                }
                AbstractC25225BEi.A1L(enumC39642HiX, A0f);
                AbstractC25234BEr.A0w(C8n.REMOVE_SCHOOL, A0f);
                return;
            case 7:
                if (!CND.A00) {
                    AbstractC166987dD.A1Y(this.A01);
                }
                CND.A00 = false;
                return;
        }
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
        if (2 - this.A00 == 0) {
            AbstractC166987dD.A1Y(this.A01);
        }
    }
}
