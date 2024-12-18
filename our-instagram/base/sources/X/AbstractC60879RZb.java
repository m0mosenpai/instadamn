package X;

/* renamed from: X.RZb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC60879RZb extends TEZ {
    public RaB A00;
    public boolean A01 = false;
    public final RaB A02;

    public final void A00(RaB raB) {
        if (this.A01) {
            RaB raB2 = (RaB) this.A00.A03(C05F.A0N);
            SYY.A02.A00(raB2).CpL(raB2, this.A00);
            this.A00 = raB2;
            this.A01 = false;
        }
        RaB raB3 = this.A00;
        SYY.A02.A00(raB3).CpL(raB3, raB);
    }

    @Override // X.InterfaceC65446TkI
    public final /* bridge */ /* synthetic */ RaB AwH() {
        return this.A02;
    }

    @Override // X.TEZ
    public final /* bridge */ /* synthetic */ Object clone() {
        AbstractC60879RZb abstractC60879RZb = (AbstractC60879RZb) this.A02.A03(C05F.A0Y);
        if (!this.A01) {
            RaB raB = this.A00;
            SYY.A02.A00(raB).Cmk(raB);
            this.A01 = true;
        }
        abstractC60879RZb.A00(this.A00);
        return abstractC60879RZb;
    }

    public AbstractC60879RZb(RaB raB) {
        this.A02 = raB;
        this.A00 = (RaB) raB.A03(C05F.A0N);
    }
}
