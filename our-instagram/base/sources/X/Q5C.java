package X;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: classes10.dex */
public final class Q5C extends LinearLayout {
    public final WebView A00;

    public Q5C(Context context) {
        super(context, null, 0);
        WebView webView = new WebView(context);
        this.A00 = webView;
        WebSettings settings = webView.getSettings();
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        webView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        webView.setWebViewClient(new Q4s(this, 7));
    }
}
