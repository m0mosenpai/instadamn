package X;

/* loaded from: classes8.dex */
public final class M03 implements Runnable {
    public final /* synthetic */ C44372JjB A00;

    public M03(C44372JjB c44372JjB) {
        this.A00 = c44372JjB;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.invalidateSelf();
    }
}
