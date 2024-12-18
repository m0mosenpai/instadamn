package X;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.Wpx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71206Wpx implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout A00;

    public RunnableC71206Wpx(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.A00 = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A01();
        actionBarOverlayLayout.A00 = actionBarOverlayLayout.A02.animate().translationY(0.0f).setListener(actionBarOverlayLayout.A0J);
    }
}
