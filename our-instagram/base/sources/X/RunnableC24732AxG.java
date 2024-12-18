package X;

/* renamed from: X.AxG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24732AxG implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InterfaceC25203BDb A01;
    public final /* synthetic */ C176097sS A02;

    public RunnableC24732AxG(InterfaceC25203BDb interfaceC25203BDb, C176097sS c176097sS, long j) {
        this.A02 = c176097sS;
        this.A01 = interfaceC25203BDb;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.D2S(this.A00);
    }
}
