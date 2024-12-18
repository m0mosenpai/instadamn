package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.secure.securewebview.SecureWebView;

/* renamed from: X.Q4t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58718Q4t extends WebViewClient {
    public boolean A00 = false;
    public final AbstractC62760SPs A01;

    private boolean A00(WebView webView, String str, boolean z) {
        Integer A01;
        SI8 si8;
        if (!(webView instanceof SecureWebView)) {
            return false;
        }
        SecureWebView secureWebView = (SecureWebView) webView;
        this.A00 = true;
        C62732SNx c62732SNx = secureWebView.A01;
        if (z) {
            A01 = c62732SNx.A00(secureWebView.getContext(), str);
        } else {
            A01 = c62732SNx.A01(str);
        }
        boolean A1a = AbstractC25229BEm.A1a(A01, C05F.A00);
        AbstractC62760SPs abstractC62760SPs = this.A01;
        if ((abstractC62760SPs instanceof R7P) && (si8 = ((R7P) abstractC62760SPs).A00) != null) {
            C102884kP c102884kP = si8.A04;
            if (!c102884kP.A0S(44, true)) {
                InterfaceC103384lE A09 = c102884kP.A09();
                SFQ sfq = si8.A02;
                if (!str.equals(sfq.A01) && A09 != null) {
                    C6FP.A03(si8.A03, c102884kP, AbstractC58320PtC.A0g(str), A09);
                }
                InterfaceC103384lE A0B = c102884kP.A0B(48);
                if (!str.equals(sfq.A01) && A0B != null) {
                    C6FX A0s = AbstractC25225BEi.A0s();
                    A0s.A03(str, 0);
                    C6FG c6fg = si8.A03;
                    C6FP.A03(c6fg, c102884kP, AbstractC25227BEk.A0f(A0s, c6fg, 1), A0B);
                }
            }
        }
        if (!A1a) {
            return false;
        }
        this.A00 = false;
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.A01.A01.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.A01.A01.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        this.A01.A01.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        this.A01.A01.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A01.A03(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (webView instanceof SecureWebView) {
            if (this.A00) {
                this.A00 = false;
            }
            this.A01.A04(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.A01.A01.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.A01.A00(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.A01.A01.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.A01.A01.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.A01.A01.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.A01.A01(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.A01.A01.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        this.A01.A01.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        this.A01.A01.onScaleChanged(webView, f, f2);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        this.A01.A01.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.A01.A01.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.A01.A01.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public C58718Q4t(AbstractC62760SPs abstractC62760SPs) {
        this.A01 = abstractC62760SPs;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A00(webView, AbstractC58319PtB.A0r(webResourceRequest), AbstractC167007dF.A1M(webResourceRequest.isForMainFrame() ? 1 : 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A01.A02(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A00(webView, str, true);
    }
}
