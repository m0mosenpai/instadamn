package X;

import android.view.View;

/* renamed from: X.M1v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49902M1v implements Runnable {
    public final /* synthetic */ KCU A00;

    public RunnableC49902M1v(KCU kcu) {
        this.A00 = kcu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KCU kcu = this.A00;
        if (kcu.isAdded()) {
            View view = kcu.A00;
            if (view == null) {
                C14360o3.A0F("bannerView");
                throw C00O.createAndThrow();
            }
            AbstractC43594JPz.A0G(view).withEndAction(new RunnableC49901M1u(kcu));
        }
    }
}
