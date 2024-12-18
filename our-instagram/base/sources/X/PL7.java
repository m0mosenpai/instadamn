package X;

/* loaded from: classes9.dex */
public final class PL7 implements Runnable {
    public final /* synthetic */ C54715OEs A00;

    public PL7(C54715OEs c54715OEs) {
        this.A00 = c54715OEs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C54715OEs c54715OEs = this.A00;
        int i = c54715OEs.A00;
        if (i < 3) {
            c54715OEs.A00 = i + 1;
            c54715OEs.A02.postDelayed(c54715OEs.A04, 450L);
        } else {
            c54715OEs.A03.A00("Ringtone failed to play after %d tries", AbstractC25228BEl.A1Y(3));
        }
    }
}
