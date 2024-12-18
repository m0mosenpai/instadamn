package X;

/* renamed from: X.Lzu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49849Lzu implements Runnable {
    public final /* synthetic */ C11R A00;

    public RunnableC49849Lzu(C11R c11r) {
        this.A00 = c11r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onCancel();
    }
}
