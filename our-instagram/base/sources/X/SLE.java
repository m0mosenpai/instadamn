package X;

import android.webkit.JavascriptInterface;

/* loaded from: classes10.dex */
public final class SLE {
    public Q4m A00;
    public final /* synthetic */ Q4m A01;

    public SLE(Q4m q4m, Q4m q4m2) {
        this.A01 = q4m;
        this.A00 = q4m2;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        this.A00.post(new RunnableC64639TNv(this, str));
    }
}
