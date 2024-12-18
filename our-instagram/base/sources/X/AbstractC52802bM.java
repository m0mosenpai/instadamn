package X;

import android.app.Activity;

/* renamed from: X.2bM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC52802bM {
    public static final void A00(final Activity activity) {
        final int i = 1;
        if (A01(activity)) {
            i = 13;
        }
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.2bW
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2109275490, 3, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC917648y.A00(activity, i);
            }
        });
    }

    public static final boolean A01(Activity activity) {
        if (AbstractC52812bN.A02(AbstractC52812bN.A00(activity))) {
            if (AbstractC225039wS.A00((int) (((InterfaceC52852bR) C52822bO.A00.invoke(C52842bQ.A00)).AIr(activity).A00().height() / activity.getResources().getDisplayMetrics().density)).intValue() != 0) {
                return true;
            }
        }
        return false;
    }
}
