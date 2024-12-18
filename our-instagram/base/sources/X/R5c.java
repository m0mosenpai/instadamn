package X;

/* loaded from: classes10.dex */
public final class R5c extends T0b {
    public final Object A00;
    public final /* synthetic */ SZN A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5c(SZN szn, Object obj, int i) {
        super(szn, i);
        this.A01 = szn;
        this.A00 = obj;
    }

    @Override // X.InterfaceC65362Tit
    public final void ATI() {
        C63309ShF c63309ShF = this.A01.A0L;
        int i = super.A00;
        Object obj = this.A00;
        synchronized (c63309ShF) {
            c63309ShF.A04(i).updateExtraData(c63309ShF.A03(i), obj);
        }
    }
}
