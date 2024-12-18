package X;

/* renamed from: X.66m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1346266m extends C6D6 {
    public final AbstractC150996r0 A00;

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        final C1346366n c1346366n = new C1346366n(interfaceC42071wx);
        interfaceC42071wx.Dpc(c1346366n);
        C6KP.A03(this.A00.A01(new Runnable(c1346366n, this) { // from class: X.66o
            public final C1346366n A00;
            public final /* synthetic */ C1346266m A01;

            {
                this.A01 = this;
                this.A00 = c1346366n;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ((C6D6) this.A01).A00.EpF(this.A00);
            }
        }), c1346366n);
    }

    public C1346266m(InterfaceC42061ww interfaceC42061ww, AbstractC150996r0 abstractC150996r0) {
        super(interfaceC42061ww);
        this.A00 = abstractC150996r0;
    }
}
