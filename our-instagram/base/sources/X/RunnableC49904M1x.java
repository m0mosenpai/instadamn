package X;

import androidx.cardview.widget.CardView;

/* renamed from: X.M1x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49904M1x implements Runnable {
    public final /* synthetic */ KCU A00;

    public RunnableC49904M1x(KCU kcu) {
        this.A00 = kcu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KCU kcu = this.A00;
        if (kcu.isAdded()) {
            CardView cardView = kcu.A08;
            if (cardView == null) {
                C14360o3.A0F("locationSharingPill");
                throw C00O.createAndThrow();
            }
            AbstractC43594JPz.A0G(cardView).withEndAction(new RunnableC49903M1w(kcu));
        }
    }
}
