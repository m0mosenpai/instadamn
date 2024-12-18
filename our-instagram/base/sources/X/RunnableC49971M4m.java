package X;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: X.M4m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49971M4m implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;

    public RunnableC49971M4m(View view, View view2) {
        this.A01 = view;
        this.A00 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        view.setTranslationX(AbstractC166987dD.A07(view));
        view.animate().translationX(0.0f).setDuration(150L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new M2Q(this.A00)).start();
    }
}
