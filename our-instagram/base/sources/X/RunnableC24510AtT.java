package X;

/* renamed from: X.AtT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24510AtT implements Runnable {
    public final /* synthetic */ C9SS A00;

    public RunnableC24510AtT(C9SS c9ss) {
        this.A00 = c9ss;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.invalidateSelf();
    }
}
