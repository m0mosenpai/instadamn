package X;

/* renamed from: X.Wum, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71486Wum implements Runnable {
    public final /* synthetic */ XDK A00;
    public final /* synthetic */ Throwable A01;

    public RunnableC71486Wum(XDK xdk, Throwable th) {
        this.A00 = xdk;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onError(this.A01);
    }
}
