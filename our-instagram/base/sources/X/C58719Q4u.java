package X;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.shopify.checkout.models.Authentication;
import com.shopify.checkout.models.CheckoutOptions;
import com.shopify.checkout.models.Defaults;
import com.shopify.checkout.models.errors.ParsableInternalErrorCode;
import com.shopify.checkout.models.errors.ParsableInternalErrorPayload;
import com.shopify.checkout.models.errors.ParsableInternalErrorReasons;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* renamed from: X.Q4u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58719Q4u extends WebViewClient {
    public WebView A00;
    public QJl A01;
    public C62454SCh A02;
    public Authentication A03;
    public CheckoutOptions A04;
    public C62455SCi A05;
    public S5V A06;
    public String A07;
    public InterfaceC16600sD A08;
    public final InterfaceC16620sF A09;

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        AbstractC167007dF.A1K(webView, str);
        super.onPageFinished(webView, str);
        webView.scrollTo(0, 0);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Map<String, String> A1G;
        if (webResourceRequest != null) {
            C62455SCi c62455SCi = this.A05;
            String str = null;
            if (c62455SCi != null) {
                String A0h = AbstractC167007dF.A0h(c62455SCi.A00.name());
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                if (requestHeaders != null) {
                    str = requestHeaders.get("Sec-CH-Prefers-Color-Scheme");
                }
                if (str == null && A0h.length() > 0 && webResourceRequest.isForMainFrame()) {
                    Map<String, String> requestHeaders2 = webResourceRequest.getRequestHeaders();
                    if (requestHeaders2 != null) {
                        A1G = new LinkedHashMap<>(requestHeaders2);
                    } else {
                        A1G = AbstractC166987dD.A1G();
                    }
                    A1G.put("Sec-CH-Prefers-Color-Scheme", A0h);
                    Authentication authentication = this.A03;
                    if (authentication != null) {
                        String A02 = AbstractC73763Sg.A03.A02(authentication, AbstractC192698gB.A00(C71748X0n.A00));
                        if (this.A05 != null) {
                            A1G.put("Shopify-Checkout-Sheet-Protocol-Consumer", A02);
                        }
                    }
                    if (webView != null) {
                        webView.loadUrl(AbstractC58319PtB.A0r(webResourceRequest), A1G);
                    }
                    return true;
                }
            }
            C14360o3.A0F("checkoutProtocolConfig");
            throw C00O.createAndThrow();
        }
        return false;
    }

    private final void A00(ParsableInternalErrorCode parsableInternalErrorCode, Exception exc) {
        C3R9[] c3r9Arr = ParsableInternalErrorPayload.A04;
        ParsableInternalErrorPayload parsableInternalErrorPayload = new ParsableInternalErrorPayload(parsableInternalErrorCode, exc.toString());
        C62454SCh c62454SCh = this.A02;
        if (c62454SCh != null) {
            QJl qJl = c62454SCh.A00;
            String A00 = QJl.A00(AbstractC166987dD.A1J(parsableInternalErrorPayload));
            AbstractC63399SjU abstractC63399SjU = qJl.A01;
            if (abstractC63399SjU != null) {
                String str = qJl.A0B;
                if (str == null) {
                    str = "";
                }
                abstractC63399SjU.A0E(str, qJl.A06, qJl.A0A, qJl.A03, A00, qJl.A09, qJl.A02);
            }
        }
    }

    public static void A01(C58719Q4u c58719Q4u, Exception exc, Integer num, String str) {
        C71177WpG c71177WpG = new C71177WpG(exc, num, str);
        C62454SCh c62454SCh = c58719Q4u.A02;
        if (c62454SCh != null) {
            QJl qJl = c62454SCh.A00;
            List singletonList = Collections.singletonList(c71177WpG);
            C14360o3.A07(singletonList);
            qJl.A02(singletonList);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Defaults defaults;
        CheckoutOptions checkoutOptions = this.A04;
        if (checkoutOptions != null && (defaults = checkoutOptions.A01) != null) {
            try {
                if (this.A06 == null) {
                    C14360o3.A0F("scriptBuilder");
                    throw C00O.createAndThrow();
                }
                C73773Sh c73773Sh = AbstractC73763Sg.A03;
                C3R9[] c3r9Arr = Defaults.A04;
                String A0S = AnonymousClass001.A0S("window.mobileCheckoutSdkIdentity = ", c73773Sh.A02(defaults, C71756X0v.A00), ';');
                WebView webView2 = this.A00;
                if (webView2 != null) {
                    webView2.evaluateJavascript(A0S, null);
                }
            } catch (Exception e) {
                A01(this, e, C05F.A0C, "fail_to_encode_buyer_identity");
            }
        }
        CheckoutOptions checkoutOptions2 = this.A04;
        if (checkoutOptions2 != null && checkoutOptions2.A03) {
            try {
                WebView webView3 = this.A00;
                if (webView3 != null) {
                    if (this.A06 != null) {
                        webView3.evaluateJavascript("\n      (function() {\n          var open = XMLHttpRequest.prototype.open;\n          XMLHttpRequest.prototype.open = function(method, url, async, user, password) {\n              // Intercept XHR requests and send details to native side\n              const body = JSON.stringify({\n                  method: method,\n                  url: url,\n                  async: async\n              });\n              window.CheckoutSheetProtocolConsumer.postMessage(JSON.stringify(\n                  {\n                      name: 'interceptXHR',\n                      body: body\n                  }\n              ));\n              open.call(this, method, url, async, user, password);\n          };\n      })();\n      ", null);
                    }
                    C14360o3.A0F("scriptBuilder");
                    throw C00O.createAndThrow();
                }
                WebView webView4 = this.A00;
                if (webView4 != null) {
                    if (this.A06 != null) {
                        webView4.evaluateJavascript("\n        (function() {\n            var originalFetch = window.fetch;\n            window.fetch = function(url, options) {\n                // Intercept Fetch API requests and send details to native side\n                window.CheckoutSheetProtocolConsumer.postMessage(JSON.stringify(\n                    {\n                        name: 'interceptFetch',\n                        body: JSON.stringify({\n                            url: url,\n                            options: options\n                        })\n                    }\n                    ));\n                return originalFetch.apply(this, arguments);\n            };\n        })();\n        ", null);
                    }
                    C14360o3.A0F("scriptBuilder");
                    throw C00O.createAndThrow();
                }
            } catch (Exception e2) {
                A01(this, e2, C05F.A0N, "meta_only_error_fail_to_run_injected_script");
            }
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public C58719Q4u(QJl qJl) {
        this.A09 = new C30193DRy(qJl, 29);
        this.A08 = new C30750Dfn(qJl, 2);
        this.A01 = qJl;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        Rk6 rk6 = new Rk6(webResourceError, webResourceRequest, null);
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            A01(this, rk6, C05F.A00, "webview_on_error");
        }
        ParsableInternalErrorCode parsableInternalErrorCode = ParsableInternalErrorCode.A03;
        EnumEntries enumEntries = ParsableInternalErrorReasons.A01;
        A00(parsableInternalErrorCode, rk6);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Rk6 rk6 = new Rk6(null, webResourceRequest, webResourceResponse);
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            A01(this, rk6, C05F.A00, "webview_on_error");
        }
        ParsableInternalErrorCode parsableInternalErrorCode = ParsableInternalErrorCode.A03;
        EnumEntries enumEntries = ParsableInternalErrorReasons.A01;
        A00(parsableInternalErrorCode, rk6);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        android.net.Uri uri;
        Map<String, String> map;
        String format = new DateTimeFormatterBuilder().appendInstant(0).toFormatter().withZone(ZoneId.systemDefault()).format(Instant.now());
        InterfaceC16600sD interfaceC16600sD = this.A08;
        String str = null;
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        } else {
            uri = null;
        }
        String valueOf = String.valueOf(uri);
        if (webResourceRequest != null) {
            map = webResourceRequest.getRequestHeaders();
            str = webResourceRequest.getMethod();
        } else {
            map = null;
        }
        String valueOf2 = String.valueOf(str);
        C14360o3.A0A(format);
        interfaceC16600sD.invoke(valueOf, map, valueOf2, format);
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
