package X;

/* loaded from: classes5.dex */
public final class D1E implements Runnable {
    public final /* synthetic */ InterfaceC16820sZ A00;

    public D1E(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object c09540e5;
        CZ0 cz0 = C27288C2u.A00;
        try {
            this.A00.invoke();
            c09540e5 = C0eB.A00;
        } catch (Throwable th) {
            c09540e5 = new C09540e5(th);
        }
        Throwable A00 = C09550e6.A00(c09540e5);
        if (A00 != null) {
            C0K8.A0F("VideoRenderLatencyMarkerLoggerAsync", "error", A00);
            C0f5 AEp = C18950wb.A01.AEp("video_latency_qpl_event_error", 817901174);
            AEp.ERI(A00);
            AEp.report();
        }
    }
}
