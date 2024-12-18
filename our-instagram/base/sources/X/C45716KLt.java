package X;

/* renamed from: X.KLt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45716KLt extends AbstractRunnableC14200nk {
    public final /* synthetic */ InterfaceC16820sZ A00;
    public final /* synthetic */ C15370ps A01;

    @Override // java.lang.Runnable
    public final void run() {
        C42631xr c42631xr = (C42631xr) this.A01.A00;
        if (c42631xr != null) {
            c42631xr.A00.dispose();
        }
        this.A00.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45716KLt(InterfaceC16820sZ interfaceC16820sZ, C15370ps c15370ps) {
        super(1705805791, 3, false, false);
        this.A01 = c15370ps;
        this.A00 = interfaceC16820sZ;
    }
}
