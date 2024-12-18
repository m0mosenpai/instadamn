package X;

/* renamed from: X.Atv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24538Atv implements Runnable {
    public final /* synthetic */ C179527y2 A00;
    public final /* synthetic */ InterfaceC179247xa A01;

    public RunnableC24538Atv(C179527y2 c179527y2, InterfaceC179247xa interfaceC179247xa) {
        this.A00 = c179527y2;
        this.A01 = interfaceC179247xa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC179577y7 interfaceC179577y7 = this.A00.A05;
        if (interfaceC179577y7 != null) {
            interfaceC179577y7.DfO(this.A01);
        }
    }
}
