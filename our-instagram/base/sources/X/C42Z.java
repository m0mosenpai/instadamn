package X;

import android.telephony.SubscriptionManager;

/* renamed from: X.42Z, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C42Z implements Runnable {
    public final /* synthetic */ C23441Cg A00;

    public C42Z(C23441Cg c23441Cg) {
        this.A00 = c23441Cg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23441Cg c23441Cg = this.A00;
        SubscriptionManager subscriptionManager = c23441Cg.A02;
        if (subscriptionManager != null) {
            SubscriptionManager.OnSubscriptionsChangedListener onSubscriptionsChangedListener = new SubscriptionManager.OnSubscriptionsChangedListener() { // from class: X.42a
                @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
                public final void onSubscriptionsChanged() {
                    C23441Cg.A0U(C42Z.this.A00);
                }
            };
            c23441Cg.A01 = onSubscriptionsChangedListener;
            subscriptionManager.addOnSubscriptionsChangedListener(onSubscriptionsChangedListener);
        }
    }
}
