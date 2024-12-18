package X;

/* renamed from: X.Arh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24400Arh implements Runnable {
    public final /* synthetic */ C05R A00;

    public RunnableC24400Arh(C05R c05r) {
        this.A00 = c05r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((C14550oT) this.A00.A00).A00.releasePermission();
    }
}
