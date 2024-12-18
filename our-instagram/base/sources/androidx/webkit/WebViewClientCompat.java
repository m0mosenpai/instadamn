package androidx.webkit;

import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.AbstractC62295S5q;
import X.C63081Sc3;
import X.SAH;
import X.SVN;
import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

/* loaded from: classes10.dex */
public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    public static final String[] A00 = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return A00;
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        Object A002 = C63081Sc3.A00(WebResourceErrorBoundaryInterface.class, invocationHandler);
        if (SVN.A00("WEB_RESOURCE_ERROR_GET_CODE") && SVN.A00("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && webResourceRequest.isForMainFrame()) {
            SAH sah = AbstractC62295S5q.A00;
            WebResourceError webResourceError = (WebResourceError) sah.A00.convertWebResourceError(Proxy.getInvocationHandler(A002));
            onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), AbstractC58319PtB.A0r(webResourceRequest));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, InvocationHandler invocationHandler) {
        Object A002 = C63081Sc3.A00(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        if (SVN.A00("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            SAH sah = AbstractC62295S5q.A00;
            ((SafeBrowsingResponse) sah.A00.convertSafeBrowsingResponse(Proxy.getInvocationHandler(A002))).showInterstitial(true);
            return;
        }
        throw AbstractC166987dD.A1D("This method is not supported by the current version of the framework and the current WebView APK");
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, AbstractC58319PtB.A0r(webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (SVN.A00("WEB_RESOURCE_ERROR_GET_CODE") && SVN.A00("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && webResourceRequest.isForMainFrame()) {
            if (webResourceError == null) {
                SAH sah = AbstractC62295S5q.A00;
                webResourceError = (WebResourceError) sah.A00.convertWebResourceError(Proxy.getInvocationHandler(null));
            }
            onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), AbstractC58319PtB.A0r(webResourceRequest));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        if (SVN.A00("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            if (safeBrowsingResponse == null) {
                SAH sah = AbstractC62295S5q.A00;
                safeBrowsingResponse = (SafeBrowsingResponse) sah.A00.convertSafeBrowsingResponse(Proxy.getInvocationHandler(null));
            }
            safeBrowsingResponse.showInterstitial(true);
            return;
        }
        throw AbstractC166987dD.A1D("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
