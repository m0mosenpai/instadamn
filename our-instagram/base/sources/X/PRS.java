package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class PRS implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Runnable A01;

    public PRS(View view, Runnable runnable) {
        this.A00 = view;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        view.setVisibility(8);
        view.setAlpha(1.0f);
        this.A01.run();
    }
}
