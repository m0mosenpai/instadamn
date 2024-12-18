package X;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes9.dex */
public final class PO0 implements Runnable {
    public final /* synthetic */ C51379Mme A00;

    public PO0(C51379Mme c51379Mme) {
        this.A00 = c51379Mme;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C51379Mme c51379Mme = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View view = c51379Mme.A05;
        if (view.getVisibility() == 0) {
            MSX.A14(AbstractC43594JPz.A0G(view).setStartDelay(2000L).setInterpolator(new AccelerateDecelerateInterpolator()), new RunnableC56932PNz(c51379Mme));
        }
    }
}
