package X;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.Wpy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71207Wpy implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout A00;

    public RunnableC71207Wpy(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.A00 = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A01();
        actionBarOverlayLayout.A00 = actionBarOverlayLayout.A02.animate().translationY(-actionBarOverlayLayout.A02.getHeight()).setListener(actionBarOverlayLayout.A0J);
    }
}
