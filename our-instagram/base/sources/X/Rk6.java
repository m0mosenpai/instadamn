package X;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* loaded from: classes10.dex */
public final class Rk6 extends Exception {
    public final WebResourceError A00;
    public final WebResourceRequest A01;
    public final WebResourceResponse A02;

    public Rk6(WebResourceError webResourceError, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.A01 = webResourceRequest;
        this.A00 = webResourceError;
        this.A02 = webResourceResponse;
    }
}
