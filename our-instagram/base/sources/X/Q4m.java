package X;

import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.views.webview.ReactWebViewManager;

/* loaded from: classes10.dex */
public final class Q4m extends WebView implements InterfaceC65542TmH {
    public Q4p A00;
    public String A01;
    public boolean A02;
    public boolean A03;

    @Override // X.InterfaceC65542TmH
    public final void onHostPause() {
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostResume() {
    }

    public Q4p getReactWebViewClient() {
        return this.A00;
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostDestroy() {
        if (this.A02) {
            CookieManager.getInstance().removeAllCookies(new C63523Soq(1));
        }
        setWebViewClient(null);
        destroy();
    }

    public void setMessagingEnabled(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            if (z) {
                addJavascriptInterface(new SLE(this, this), ReactWebViewManager.BRIDGE_NAME);
                if (this.A03) {
                    evaluateJavascript("(window.originalPostMessage = window.postMessage,window.postMessage = function(data) {__REACT_WEB_VIEW_BRIDGE.postMessage(String(data));})", null);
                    return;
                }
                return;
            }
            removeJavascriptInterface(ReactWebViewManager.BRIDGE_NAME);
        }
    }

    public void setClearCookiesOnExit(boolean z) {
        this.A02 = z;
    }

    public void setInjectedJavaScript(String str) {
        this.A01 = str;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.A00 = (Q4p) webViewClient;
    }
}
