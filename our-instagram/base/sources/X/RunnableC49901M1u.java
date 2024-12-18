package X;

import android.view.View;

/* renamed from: X.M1u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49901M1u implements Runnable {
    public final /* synthetic */ KCU A00;

    public RunnableC49901M1u(KCU kcu) {
        this.A00 = kcu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KCU kcu = this.A00;
        View view = kcu.A00;
        if (view != null) {
            view.clearAnimation();
            View view2 = kcu.A00;
            if (view2 != null) {
                view2.setVisibility(8);
                return;
            }
        }
        C14360o3.A0F("bannerView");
        throw C00O.createAndThrow();
    }
}
