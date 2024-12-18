package X;

/* renamed from: X.AtS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24509AtS implements Runnable {
    public final /* synthetic */ C9SS A00;

    public RunnableC24509AtS(C9SS c9ss) {
        this.A00 = c9ss;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.invalidateSelf();
    }
}
