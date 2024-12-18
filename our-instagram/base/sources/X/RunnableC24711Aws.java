package X;

/* renamed from: X.Aws, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24711Aws implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public RunnableC24711Aws(InterfaceC16660sJ interfaceC16660sJ, long j) {
        this.A01 = interfaceC16660sJ;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.invoke(Long.valueOf(this.A00));
    }
}
