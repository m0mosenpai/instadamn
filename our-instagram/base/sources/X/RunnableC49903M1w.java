package X;

import androidx.cardview.widget.CardView;

/* renamed from: X.M1w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49903M1w implements Runnable {
    public final /* synthetic */ KCU A00;

    public RunnableC49903M1w(KCU kcu) {
        this.A00 = kcu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KCU kcu = this.A00;
        CardView cardView = kcu.A08;
        if (cardView != null) {
            cardView.clearAnimation();
            CardView cardView2 = kcu.A08;
            if (cardView2 != null) {
                cardView2.setVisibility(8);
                return;
            }
        }
        C14360o3.A0F("locationSharingPill");
        throw C00O.createAndThrow();
    }
}
