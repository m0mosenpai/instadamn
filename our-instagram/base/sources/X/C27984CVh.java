package X;

import android.app.Activity;
import android.os.Build;

/* renamed from: X.CVh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27984CVh {
    public boolean A00;
    public final Activity A01;
    public final boolean A02;

    public final void A00() {
        if (this.A02 && Build.VERSION.SDK_INT < 35) {
            Activity activity = this.A01;
            activity.getWindow().setStatusBarColor(-16777216);
            if (!this.A00) {
                AbstractC56402iY.A06(activity, false);
                this.A00 = true;
            }
        }
    }

    public final void A01() {
        if (this.A02 && Build.VERSION.SDK_INT < 35) {
            this.A01.getWindow().setStatusBarColor(-1);
        }
    }

    public final void A02(float f) {
        if (this.A02 && Build.VERSION.SDK_INT < 35) {
            C169367hA c169367hA = C169367hA.A00;
            C14360o3.A07(c169367hA);
            Number number = (Number) c169367hA.evaluate(f, AbstractC25227BEk.A0o(), -16777216);
            if (number != null) {
                this.A01.getWindow().setStatusBarColor(number.intValue());
            }
            if (f >= 0.5d && !this.A00) {
                AbstractC56402iY.A06(this.A01, false);
                this.A00 = true;
            }
        }
    }

    public C27984CVh(Activity activity, boolean z) {
        this.A01 = activity;
        this.A02 = z;
    }
}
