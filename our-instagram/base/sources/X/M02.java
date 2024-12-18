package X;

/* loaded from: classes8.dex */
public final class M02 implements Runnable {
    public final /* synthetic */ C44371JjA A00;

    public M02(C44371JjA c44371JjA) {
        this.A00 = c44371JjA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.invalidateSelf();
    }
}
