package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class GLP implements Runnable {
    public final /* synthetic */ View A00;

    public GLP(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
    }
}
