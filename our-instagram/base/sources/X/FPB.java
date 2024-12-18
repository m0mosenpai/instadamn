package X;

import android.app.Activity;

/* loaded from: classes6.dex */
public final class FPB {
    public final Activity A00;

    public final void A00(String str) {
        C14360o3.A0B(str, 0);
        this.A00.runOnUiThread(new RunnableC36902GNx(this, str));
    }

    public FPB(Activity activity) {
        this.A00 = activity;
    }
}
