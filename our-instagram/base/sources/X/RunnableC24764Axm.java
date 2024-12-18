package X;

/* renamed from: X.Axm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24764Axm implements Runnable {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C9V6 A01;
    public final /* synthetic */ C194388iy A02;

    public RunnableC24764Axm(InterfaceC11380iw interfaceC11380iw, C9V6 c9v6, C194388iy c194388iy) {
        this.A01 = c9v6;
        this.A02 = c194388iy;
        this.A00 = interfaceC11380iw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9V6 c9v6 = this.A01;
        C07X A00 = AbstractC55832hO.A00(c9v6.A01);
        if (A00 != null) {
            C57312k6 A002 = AbstractC57302k5.A00(A00.getLifecycle());
            AbstractC23641Du.A05(c9v6.A02, new MCB(this.A00, c9v6, this.A02, null), A002);
        }
    }
}
