package X;

import android.app.Activity;
import android.view.Window;

/* renamed from: X.Txg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65987Txg {
    public static final void A00(Activity activity) {
        C14360o3.A0B(activity, 0);
        boolean A07 = AbstractC13440mV.A07();
        Window window = activity.getWindow();
        if (window != null) {
            AbstractC56402iY.A07(AbstractC43592JPx.A08(activity), window, A07);
            if (A07) {
                AbstractC56402iY.A06(activity, false);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A01(Activity activity, int i) {
        boolean A07 = AbstractC13440mV.A07();
        Window window = activity.getWindow();
        if (window != null) {
            AbstractC56402iY.A07(AbstractC43592JPx.A08(activity), window, A07);
            if (A07) {
                AbstractC56402iY.A02(activity, i);
                AbstractC56402iY.A06(activity, false);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
