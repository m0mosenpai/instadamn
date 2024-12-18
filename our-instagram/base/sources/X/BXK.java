package X;

/* loaded from: classes5.dex */
public final class BXK extends C58J implements InterfaceC114155Db, InterfaceC30781DgI, InterfaceC1129458d, InterfaceC31145Dmk {
    public CWQ A00;
    public BXJ A01;
    public BXF A02;
    public final InterfaceC74953Yl A03 = AbstractC25230BEn.A0U(null);

    @Override // X.C58J
    public final void A0A() {
        BXJ bxj = this.A01;
        if (bxj.A00 == null) {
            bxj.A00 = this;
            return;
        }
        throw AbstractC166987dD.A14("Expected textInputModifierNode to be null");
    }

    @Override // X.C58J
    public final void A0E() {
        this.A01.A02(this);
    }

    @Override // X.InterfaceC114155Db
    public final void DJc(InterfaceC1131459c interfaceC1131459c) {
        this.A03.Egh(interfaceC1131459c);
    }

    public BXK(CWQ cwq, BXJ bxj, BXF bxf) {
        this.A01 = bxj;
        this.A00 = cwq;
        this.A02 = bxf;
    }
}
