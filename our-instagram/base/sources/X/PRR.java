package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class PRR implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ PCO A01;

    public PRR(View view, PCO pco) {
        this.A01 = pco;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PCO pco = this.A01;
        View view = this.A00;
        MSW.A0B(pco.A08).removeView(view);
        view.setVisibility(0);
        view.setTranslationX(0.0f);
    }
}
