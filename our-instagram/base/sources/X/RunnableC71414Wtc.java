package X;

/* renamed from: X.Wtc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71414Wtc implements Runnable {
    public final /* synthetic */ InterfaceC65636Tpx A00;
    public final /* synthetic */ C7CX A01;

    public RunnableC71414Wtc(InterfaceC65636Tpx interfaceC65636Tpx, C7CX c7cx) {
        this.A01 = c7cx;
        this.A00 = interfaceC65636Tpx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7CX c7cx = this.A01;
        c7cx.A00.AYt(new WUD(this.A00, c7cx.A01));
    }
}
