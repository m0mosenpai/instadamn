package X;

/* renamed from: X.AuL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24564AuL implements Runnable {
    public final /* synthetic */ InterfaceC176187sb A00;
    public final /* synthetic */ C176097sS A01;

    public RunnableC24564AuL(InterfaceC176187sb interfaceC176187sb, C176097sS c176097sS) {
        this.A01 = c176097sS;
        this.A00 = interfaceC176187sb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.release();
    }
}
