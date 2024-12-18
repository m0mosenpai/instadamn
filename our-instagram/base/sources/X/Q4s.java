package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Iterator;
import net.trustly.android.sdk.views.TrustlyView;

/* loaded from: classes10.dex */
public final class Q4s extends WebViewClient {
    public final int A00;
    public final Object A01;

    public Q4s(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        WebView webView2;
        String string;
        if (6 - this.A00 != 0) {
            super.onPageCommitVisible(webView, str);
            return;
        }
        Rb0 rb0 = (Rb0) this.A01;
        Bundle bundle = rb0.mArguments;
        if (bundle == null || (webView2 = rb0.A02) == null || (string = bundle.getString("SimpleWebViewFragment.ARG_JAVASCRIPT")) == null) {
            return;
        }
        webView2.evaluateJavascript(string, null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        View view;
        String str2;
        switch (this.A00) {
            case 0:
                C62707SMv c62707SMv = (C62707SMv) this.A01;
                synchronized (c62707SMv) {
                    c62707SMv.A06 = false;
                    if (!c62707SMv.A05.isEmpty()) {
                        C63305ShB c63305ShB = c62707SMv.A02;
                        C63305ShB.A02(new QDX(c63305ShB, c62707SMv.A04, c62707SMv.A05), c63305ShB, false);
                        AbstractC63254SgB.A03("Took %d ms to finish extract %d resource %s", new Object[]{Long.valueOf(System.currentTimeMillis() - c62707SMv.A00), AbstractC43592JPx.A0s(c62707SMv.A05), c62707SMv.A04});
                    }
                    c62707SMv.A04 = null;
                    c62707SMv.A05 = Collections.synchronizedList(AbstractC58318PtA.A11());
                    PrefetchCacheEntry prefetchCacheEntry = (PrefetchCacheEntry) c62707SMv.A08.pollFirst();
                    if (prefetchCacheEntry != null) {
                        c62707SMv.A00(prefetchCacheEntry);
                    }
                }
                return;
            case 1:
                AbstractC167017dG.A1N(webView, str);
                super.onPageFinished(webView, str);
                view = ((C58761Q7q) this.A01).A01;
                if (view == null) {
                    str2 = "progressBar";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                view.setVisibility(8);
                return;
            case 2:
                view = ((C58767Q7x) this.A01).A00.A01;
                view.setVisibility(8);
                return;
            case 3:
                view = ((C58768Q7y) this.A01).A00;
                view.setVisibility(8);
                return;
            case 4:
            default:
                super.onPageFinished(webView, str);
                return;
            case 5:
                super.onPageFinished(webView, str);
                view = ((N69) this.A01).A00;
                if (view == null) {
                    str2 = "loadingIndicator";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                view.setVisibility(8);
                return;
            case 6:
                AbstractC167007dF.A1K(webView, str);
                super.onPageFinished(webView, str);
                Rb0 rb0 = (Rb0) this.A01;
                FragmentActivity activity = rb0.getActivity();
                java.util.Set set = Rb0.A07;
                SimpleWebViewConfig simpleWebViewConfig = rb0.A04;
                if (simpleWebViewConfig != null) {
                    if (simpleWebViewConfig.A0F && activity != null) {
                        SXK sxk = new SXK(simpleWebViewConfig);
                        sxk.A02 = webView.getTitle();
                        rb0.A04 = new SimpleWebViewConfig(sxk);
                        C56352iT.A0t.A04(rb0).A0T();
                    }
                    AbstractC167007dF.A0x(rb0.A00);
                    WebView webView2 = rb0.A02;
                    if (webView2 != null) {
                        webView2.setVisibility(0);
                        webView2.getUrl();
                    }
                    if (!"file:///android_asset/webview_error.html".equals(str)) {
                        return;
                    }
                    AbstractC58321PtD.A17(AbstractC166997dE.A0N(rb0), webView);
                    return;
                }
                throw AbstractC166997dE.A0g();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        View view;
        switch (this.A00) {
            case 1:
                AbstractC167007dF.A1K(webView, str);
                super.onPageStarted(webView, str, bitmap);
                ProgressBar progressBar = ((C58761Q7q) this.A01).A01;
                if (progressBar == null) {
                    C14360o3.A0F("progressBar");
                    throw C00O.createAndThrow();
                }
                progressBar.setVisibility(0);
                return;
            case 2:
                view = ((C58767Q7x) this.A01).A00.A01;
                break;
            case 3:
                view = ((C58768Q7y) this.A01).A00;
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                return;
        }
        view.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (6 - this.A00 != 0) {
            super.onReceivedError(webView, i, str, str2);
            return;
        }
        AbstractC25233BEq.A0v(0, webView, str, str2);
        super.onReceivedError(webView, i, str, str2);
        FragmentActivity activity = ((Fragment) this.A01).getActivity();
        if (activity != null) {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putInt(TraceFieldType.ErrorCode, i);
            activity.getSupportFragmentManager().A0y("on_failure", A0b);
        }
        webView.loadUrl("file:///android_asset/webview_error.html");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Fragment fragment;
        Bundle A0b;
        switch (this.A00) {
            case 1:
                fragment = (Fragment) this.A01;
                A0b = AbstractC166987dD.A0b();
                A0b.putBoolean("WEB_VIEW_RESULT_ERROR_ENCOUNTERED", true);
                A0b.putString("WEB_VIEW_RESULT_ERROR_MESSAGE_FOR_LOGGING", "Webview received http error");
                break;
            case 2:
                fragment = (Fragment) this.A01;
                int statusCode = webResourceResponse.getStatusCode();
                String reasonPhrase = webResourceResponse.getReasonPhrase();
                A0b = AbstractC166987dD.A0b();
                A0b.putString("ERROR_MESSAGE", reasonPhrase);
                A0b.putInt("ERROR_CODE", statusCode);
                break;
            case 3:
                Fragment fragment2 = (Fragment) this.A01;
                int statusCode2 = webResourceResponse.getStatusCode();
                String reasonPhrase2 = webResourceResponse.getReasonPhrase();
                Bundle A0b2 = AbstractC166987dD.A0b();
                A0b2.putString("error", reasonPhrase2);
                A0b2.putInt(TraceFieldType.ErrorCode, statusCode2);
                SSB.A00(A0b2, fragment2, false);
                return;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                return;
        }
        SSB.A01(A0b, fragment, false);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (6 - this.A00 != 0) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            C14360o3.A0B(sslErrorHandler, 1);
            sslErrorHandler.cancel();
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (this.A00 != 0) {
            return super.shouldInterceptRequest(webView, str);
        }
        C62707SMv c62707SMv = (C62707SMv) this.A01;
        String str2 = c62707SMv.A04;
        if (str2 == null) {
            return null;
        }
        if (str2.equals(str)) {
            PrefetchCacheEntry prefetchCacheEntry = c62707SMv.A03;
            C14360o3.A0B(prefetchCacheEntry, 0);
            String str3 = prefetchCacheEntry.A01;
            if (str3 == null) {
                return null;
            }
            try {
                return new WebResourceResponse(prefetchCacheEntry.A02, prefetchCacheEntry.A00, new BufferedInputStream(new FileInputStream(str3)));
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        if (!AbstractC63387Sj3.A06(AbstractC63387Sj3.A03(str)) || c62707SMv.A05.size() >= 50) {
            return null;
        }
        c62707SMv.A05.add(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Bundle A0b;
        String str2;
        C58761Q7q c58761Q7q;
        String str3;
        String str4;
        try {
            switch (this.A00) {
                case 1:
                    if (str != null) {
                        C58761Q7q c58761Q7q2 = (C58761Q7q) this.A01;
                        java.net.URI uri = new java.net.URI(str);
                        Iterator A13 = AbstractC166997dE.A13(c58761Q7q2.A05);
                        while (A13.hasNext()) {
                            java.net.URI uri2 = (java.net.URI) AbstractC166997dE.A0l(A13);
                            String scheme = uri2.getScheme();
                            if (scheme == null || scheme.length() == 0 || C14360o3.A0K(uri2.getScheme(), uri.getScheme())) {
                                String host = uri2.getHost();
                                if (host == null || host.length() == 0 || C14360o3.A0K(uri2.getHost(), uri.getHost())) {
                                    String path = uri2.getPath();
                                    if (path == null || path.length() == 0 || C14360o3.A0K(uri2.getPath(), uri.getPath())) {
                                        A0b = AbstractC166987dD.A0b();
                                        str2 = "WEB_VIEW_RESULT_INTERCEPT_URL";
                                        c58761Q7q = c58761Q7q2;
                                    }
                                }
                            }
                        }
                        return false;
                    }
                    return false;
                case 2:
                    C58767Q7x c58767Q7x = (C58767Q7x) this.A01;
                    java.net.URI uri3 = new java.net.URI(str);
                    for (java.net.URI uri4 : c58767Q7x.A01) {
                        if (uri3.getScheme().equals(uri4.getScheme()) && uri3.getHost().equals(uri4.getHost()) && uri3.getPath().equals(uri4.getPath())) {
                            A0b = AbstractC166987dD.A0b();
                            str2 = "WEB_FRAGMENT_INTERCEPTED_URL";
                            c58761Q7q = c58767Q7x;
                            break;
                        }
                    }
                    return false;
                case 3:
                    C58768Q7y c58768Q7y = (C58768Q7y) this.A01;
                    java.net.URI uri5 = new java.net.URI(str);
                    for (java.net.URI uri6 : c58768Q7y.A03) {
                        if (uri5.getScheme().equals(uri6.getScheme()) && uri5.getHost().equals(uri6.getHost()) && uri5.getPath().equals(uri6.getPath())) {
                            Bundle A0b2 = AbstractC166987dD.A0b();
                            A0b2.putString("web_fragment_intercepted_url", str);
                            SSB.A00(A0b2, c58768Q7y, true);
                            return true;
                        }
                    }
                    return false;
                case 4:
                    C14360o3.A0B(str, 1);
                    if (new C11L("instagram://hide/\\?reason=.*").A08(str)) {
                        Rb3 rb3 = (Rb3) this.A01;
                        if (rb3.A04) {
                            UserSession userSession = (UserSession) rb3.A07.getValue();
                            if (userSession != null && (str3 = rb3.A01) != null && (str4 = rb3.A03) != null) {
                                IQX.A01(userSession, rb3, str3, str4, AbstractC43592JPx.A0z(str, 25));
                            }
                        } else {
                            String str5 = rb3.A01;
                            if (str5 != null) {
                                UserSession userSession2 = (UserSession) rb3.A07.getValue();
                                String str6 = rb3.A03;
                                int i = rb3.A00;
                                String A0z = AbstractC43592JPx.A0z(str, 25);
                                String str7 = rb3.A02;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                C32U.A0T(userSession2, rb3, false, str5, str6, A0z, str7, i);
                            }
                        }
                        AbstractC25226BEj.A1Q(rb3);
                        return true;
                    }
                    return false;
                case 6:
                    AbstractC167017dG.A1N(webView, str);
                    android.net.Uri A01 = AbstractC08820cl.A01(Rb0.A06, str);
                    if (A01 != null) {
                        if (((Rb0) this.A01).A03(A01, webView)) {
                            return true;
                        }
                    } else {
                        return false;
                    }
                case 5:
                default:
                    return super.shouldOverrideUrlLoading(webView, str);
            }
            A0b.putString(str2, str);
            SSB.A01(A0b, c58761Q7q, true);
            return true;
        } catch (URISyntaxException unused) {
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (7 - this.A00 != 0) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        String A0r = AbstractC58319PtB.A0r(webResourceRequest);
        if (!TrustlyView.A09 && ((!A0r.contains("paywithmybank.com") && !A0r.contains("trustly.one")) || !A0r.contains("/oauth/login/"))) {
            return true;
        }
        C62662SKw A01 = new C63165SeP().A01();
        Intent intent = A01.A00;
        intent.setPackage("com.android.chrome");
        intent.addFlags(67108864);
        A01.A00(webView.getContext(), android.net.Uri.parse(A0r));
        return true;
    }
}
