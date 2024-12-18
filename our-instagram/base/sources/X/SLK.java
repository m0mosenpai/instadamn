package X;

import android.app.Activity;
import android.webkit.JavascriptInterface;

/* loaded from: classes10.dex */
public final class SLK {
    public final Activity A00;
    public final Runnable A01;

    @JavascriptInterface
    public final void interfacedUIMethod() {
        this.A00.runOnUiThread(this.A01);
    }

    public SLK(Activity activity, Runnable runnable) {
        this.A01 = runnable;
        this.A00 = activity;
    }
}
