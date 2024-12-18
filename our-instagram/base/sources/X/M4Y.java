package X;

/* loaded from: classes8.dex */
public final class M4Y implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C44764Jrl A01;

    public M4Y(C44764Jrl c44764Jrl, float f) {
        this.A01 = c44764Jrl;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C44764Jrl c44764Jrl = this.A01;
        float f = -this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        c44764Jrl.A03.animate().setStartDelay(0L).translationX(f).setDuration(2000L).withEndAction(new M4Y(c44764Jrl, f));
    }
}
