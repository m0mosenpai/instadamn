package X;

/* loaded from: classes10.dex */
public final class RPH extends AbstractRunnableC64727TRj {
    public final /* synthetic */ C58411Pup A00;
    public final /* synthetic */ AbstractC53436NkP A01;
    public final /* synthetic */ SGY A02;
    public final /* synthetic */ byte[] A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RPH(C58411Pup c58411Pup, C58411Pup c58411Pup2, AbstractC53436NkP abstractC53436NkP, SGY sgy, byte[] bArr) {
        super(c58411Pup);
        this.A02 = sgy;
        this.A03 = bArr;
        this.A00 = c58411Pup2;
        this.A01 = abstractC53436NkP;
    }

    @Override // X.AbstractRunnableC64727TRj
    public final void A00(Exception exc) {
        if (exc instanceof C64855TXg) {
            super.A00(new N21(-9, exc));
        } else {
            super.A00(exc);
        }
    }
}
