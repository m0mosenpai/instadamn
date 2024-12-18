package X;

/* renamed from: X.BRe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC25542BRe implements Runnable {
    public final /* synthetic */ C25541BRd A00;

    public RunnableC25542BRe(C25541BRd c25541BRd) {
        this.A00 = c25541BRd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25541BRd c25541BRd = this.A00;
        C120985dq c120985dq = c25541BRd.A01;
        if (c120985dq != null) {
            c25541BRd.A07.EWU(c120985dq, true);
        }
        c25541BRd.A05.postDelayed(c25541BRd.A0F, 2500L);
    }
}
