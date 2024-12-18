package X;

/* renamed from: X.M0j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49864M0j implements Runnable {
    public final /* synthetic */ C164357Wy A00;

    public RunnableC49864M0j(C164357Wy c164357Wy) {
        this.A00 = c164357Wy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C164357Wy c164357Wy = this.A00;
        if (c164357Wy.A01.isResumed()) {
            c164357Wy.A00(false);
        }
    }
}
