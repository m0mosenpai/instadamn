package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TPb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64670TPb implements Runnable {
    public final /* synthetic */ WebResourceRequest A00;
    public final /* synthetic */ WebView A01;
    public final /* synthetic */ C58717Q4q A02;

    public RunnableC64670TPb(WebResourceRequest webResourceRequest, WebView webView, C58717Q4q c58717Q4q) {
        this.A02 = c58717Q4q;
        this.A01 = webView;
        this.A00 = webResourceRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A02.A06;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
                android.net.Uri url = this.A00.getUrl();
                if (url != null) {
                    String obj = url.toString();
                    if (!AbstractC116315Ok.A00(obj) && obj.startsWith("https://www.facebook.com/tr/?")) {
                        url.getQueryParameter("ev");
                        url.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    }
                }
            }
        }
    }
}
