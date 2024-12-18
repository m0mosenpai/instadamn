package X;

/* renamed from: X.ApX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24266ApX implements Runnable {
    public final /* synthetic */ C4P2 A00;

    public RunnableC24266ApX(C4P2 c4p2) {
        this.A00 = c4p2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4P2 c4p2 = this.A00;
        if (!C4OT.A00(c4p2.A02)) {
            C14360o3.A0B(C05F.A01, 0);
            C20H c20h = c4p2.A00;
            if (c20h != null) {
                c20h.onNetworkUnavailable();
            }
        }
    }
}
