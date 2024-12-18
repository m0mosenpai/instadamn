package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class Q4g extends WebChromeClient {
    public final Context A00;
    public final SDN A01;
    public final /* synthetic */ C63283Sgi A02;

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        C14360o3.A0B(webView, 0);
        C63283Sgi c63283Sgi = this.A02;
        if (webView == c63283Sgi.A0D.peek()) {
            C63283Sgi.A02(c63283Sgi);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        AbstractC167007dF.A1E(webView, 0, message);
        C63283Sgi c63283Sgi = this.A02;
        C14360o3.A0B(webView, 0);
        if (webView == c63283Sgi.A0D.peek() && z2) {
            R7U A00 = C63283Sgi.A00(c63283Sgi);
            Object obj = message.obj;
            if (obj instanceof WebView.WebViewTransport) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
                ((WebView.WebViewTransport) obj).setWebView(A00);
                message.sendToTarget();
                return true;
            }
            return false;
        }
        return false;
    }

    public Q4g(Context context, ProgressBar progressBar, C63283Sgi c63283Sgi) {
        this.A02 = c63283Sgi;
        this.A00 = context;
        this.A01 = new SDN(progressBar);
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        try {
            return BitmapFactory.decodeResource(this.A00.getResources(), R.drawable.play_icon);
        } catch (Exception unused) {
            return super.getDefaultVideoPoster();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        AbstractC167007dF.A0J().post(new TPZ(webView, this.A01, i));
        R7U r7u = (R7U) webView;
        if (i > 10) {
            r7u.A00("(function() {\n  if (!('__FBLoadedIndicator' in window) \n      && typeof(_FBIXLoggingBridge) !== 'undefined') {\n    window.__FBLoadedIndicator = true;\n    _FBIXLoggingBridge.log('FB_IX_PAGE_READY' + window.location.href);\n  }\n}());");
        }
    }
}
