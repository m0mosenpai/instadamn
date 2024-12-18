package X;

/* renamed from: X.3QS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3QS implements Runnable {
    public final /* synthetic */ C59252nR A00;

    public C3QS(C59252nR c59252nR) {
        this.A00 = c59252nR;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.invalidateSelf();
    }
}
