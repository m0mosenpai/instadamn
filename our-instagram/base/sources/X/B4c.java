package X;

/* loaded from: classes4.dex */
public final class B4c extends Thread {
    public final /* synthetic */ C6WQ A00;

    public B4c(C6WQ c6wq) {
        this.A00 = c6wq;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.A00.dismiss();
    }
}
