package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.webview.chromium.membrane.AppHostedShareDelegate;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABLandingPageViewEndedEvent;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.Q4v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58720Q4v extends WebViewClient implements AppHostedShareDelegate {
    public AbstractC62758SPp A00;

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        AbstractC62758SPp abstractC62758SPp = this.A00;
        SystemWebView A00 = R7V.A00(webView);
        if (abstractC62758SPp instanceof QF4) {
            QF4 qf4 = (QF4) abstractC62758SPp;
            AbstractC63254SgB.A03("doUpdateVisitedHistory %s", new Object[]{str});
            qf4.A0G.A00("BLWVC.doUpdateVisitedHistory");
            Iterator it = qf4.A08.iterator();
            while (it.hasNext()) {
                ((InterfaceC65638Tq1) it.next()).AQC(A00, str, z);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        AbstractC62758SPp abstractC62758SPp = this.A00;
        if (abstractC62758SPp instanceof QF4) {
            QF4 qf4 = (QF4) abstractC62758SPp;
            qf4.A0G.A00("BLWVC.onPageCommitVisible");
            if (qf4.A09) {
                C23016ACq c23016ACq = qf4.A0E.A0e;
                long currentTimeMillis = System.currentTimeMillis();
                if (c23016ACq.A0p) {
                    c23016ACq.A0A = currentTimeMillis;
                }
            }
            if (!qf4.A0A) {
                BrowserLiteFragment browserLiteFragment = qf4.A0E;
                AbstractC167007dF.A0x(browserLiteFragment.A0b);
                AbstractC167007dF.A0x(browserLiteFragment.A0c);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A00.A06(R7V.A00(webView), str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        InputStreamReader A0j;
        String A00;
        IABEvent iABEvent;
        AbstractC62758SPp abstractC62758SPp = this.A00;
        SystemWebView A002 = R7V.A00(webView);
        if (abstractC62758SPp instanceof QF4) {
            QF4 qf4 = (QF4) abstractC62758SPp;
            qf4.A0G.A00("BLWVC.onPageStarted");
            AbstractC63254SgB.A03("onPageStarted %s", new Object[]{str});
            qf4.A0A = false;
            qf4.A07 = str;
            if (qf4.A03 == -1) {
                qf4.A03 = System.currentTimeMillis();
            }
            if (!"file:///android_asset/".equals(str)) {
                C63305ShB c63305ShB = qf4.A0F;
                C63305ShB.A02(new C58862QDd(qf4.A0D.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING"), c63305ShB, A002.A05(), str), c63305ShB, false);
            }
            Iterator it = qf4.A08.iterator();
            while (it.hasNext()) {
                ((InterfaceC65638Tq1) it.next()).DXd(str);
            }
            A002.A0U = false;
            A002.A0S = false;
            A002.A0V = true;
            C62603SIh c62603SIh = A002.A0D;
            if (c62603SIh != null) {
                android.net.Uri parse = android.net.Uri.parse(str);
                C08270bp c08270bp = AbstractC63387Sj3.A00;
                String host = parse.getHost();
                if (!TextUtils.isEmpty(host) && AbstractC63387Sj3.A02.contains(host) && str.contains("/dialog/oauth")) {
                    C23016ACq c23016ACq = c62603SIh.A04.A0e;
                    if (c23016ACq.A0p) {
                        c23016ACq.A0R = true;
                    }
                }
                BrowserLiteFragment browserLiteFragment = c62603SIh.A04;
                if (browserLiteFragment.A0s && !browserLiteFragment.A10) {
                    String str2 = A002.A0L;
                    if (str2 == null) {
                        str2 = A002.A07(0);
                        A002.A0L = str2;
                    }
                    if (!str.equals(str2)) {
                        browserLiteFragment.A10 = true;
                        C23016ACq c23016ACq2 = browserLiteFragment.A0e;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (c23016ACq2.A0p) {
                            c23016ACq2.A0H = currentTimeMillis;
                            Parcelable.Creator creator = IABEvent.CREATOR;
                            iABEvent = new IABLandingPageViewEndedEvent(c23016ACq2.A0Q, c23016ACq2.A0Z, currentTimeMillis, c23016ACq2.A0m.now());
                        } else {
                            iABEvent = IABEvent.A04;
                        }
                        browserLiteFragment.Ckl(browserLiteFragment.A09, iABEvent, browserLiteFragment.A0f);
                    }
                }
                C63217SfN c63217SfN = browserLiteFragment.A0K;
                if (c63217SfN.A03()) {
                    QF6 qf6 = c62603SIh.A05;
                    if (AbstractC166987dD.A1a(SQi.A00(c63217SfN).A00)) {
                        C63527Sou c63527Sou = C63527Sou.A00;
                        R7V r7v = ((SystemWebView) qf6).A04;
                        r7v.evaluateJavascript("window.localStorage.setItem('session-aa-os-name', 'Android');", c63527Sou);
                        r7v.evaluateJavascript(AnonymousClass001.A0c("window.localStorage.setItem('session-aa-os-version', '", "');", AbstractC61707RsO.A00()), C63528Sov.A00);
                    }
                }
                C62965SZi c62965SZi = browserLiteFragment.A0J;
                if (c62965SZi.A01()) {
                    QF6 qf62 = c62603SIh.A05;
                    Pair A003 = AbstractC62768SQh.A00(c62965SZi);
                    if (AbstractC166987dD.A1a(A003.first)) {
                        AbstractC63254SgB.A03("For url %s, setting local storage", new Object[]{A003.second});
                        C63525Sos c63525Sos = C63525Sos.A00;
                        R7V r7v2 = ((SystemWebView) qf62).A04;
                        r7v2.evaluateJavascript("window.localStorage.setItem('session-aa-os-name', 'Android');", c63525Sos);
                        r7v2.evaluateJavascript(AnonymousClass001.A0c("window.localStorage.setItem('session-aa-os-version', '", "');", AbstractC61703RsK.A00()), C63526Sot.A00);
                    }
                }
            }
            SIC sic = A002.A0G;
            sic.A03 = true;
            sic.A02 = false;
            QF6.A00(A002);
            int i = sic.A00;
            if (i != Integer.MIN_VALUE) {
                A002.A0G(AnonymousClass001.A0c("(function () { window.__outer_height_override__ = ", "; })()", i));
            }
            int i2 = sic.A01;
            if (i2 != Integer.MIN_VALUE) {
                A002.A0G(AnonymousClass001.A0c("(function () { window.__screen_top_override__ = ", "; })()", i2));
            }
            SHJ shj = A002.A0H;
            if (shj.A03) {
                QF6 qf63 = shj.A01;
                Context context = shj.A00;
                C14360o3.A0B(context, 1);
                WeakReference weakReference = AbstractC61532RpC.A00;
                try {
                    if (weakReference != null) {
                        A00 = (String) weakReference.get();
                        if (A00 == null) {
                            AbstractC61532RpC.A00 = null;
                        }
                        qf63.A0G(A00);
                        return;
                    }
                    A00 = AbstractC38581qm.A00(A0j);
                    A0j.close();
                    if (A00.length() < 2048) {
                        AbstractC61532RpC.A00 = AbstractC25225BEi.A16(A00);
                    }
                    qf63.A0G(A00);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C20I.A00(A0j, th);
                        throw th2;
                    }
                }
                A0j = AbstractC58320PtC.A0j(context.getResources(), R.raw.iabjs_web_vital_reporter);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        AbstractC62758SPp abstractC62758SPp = this.A00;
        C62419SAt c62419SAt = new C62419SAt(httpAuthHandler);
        if (abstractC62758SPp instanceof QF4) {
            ((QF4) abstractC62758SPp).A0G.A00("BLWVC.onReceivedHttpAuthRequest");
        }
        c62419SAt.A00.cancel();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        if (r1.equals(r7) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        if (com.facebook.react.views.webview.ReactWebViewManager.BLANK_URL.equals(r1) == false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.Q7k, X.0SG, androidx.fragment.app.Fragment] */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceivedSslError(android.webkit.WebView r9, android.webkit.SslErrorHandler r10, android.net.http.SslError r11) {
        /*
            r8 = this;
            X.SPp r2 = r8.A00
            com.facebook.browser.lite.webview.SystemWebView r5 = X.R7V.A00(r9)
            X.SAs r3 = new X.SAs
            r3.<init>(r10)
            boolean r0 = r2 instanceof X.QF4
            if (r0 == 0) goto Lb5
            X.QF4 r2 = (X.QF4) r2
            java.lang.String r0 = r11.toString()
            r6 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "onReceivedSslError %s"
            X.AbstractC63254SgB.A03(r0, r1)
            X.ACQ r1 = r2.A0G
            java.lang.String r0 = "BLWVC.onReceivedSslError"
            r1.A00(r0)
            com.facebook.browser.lite.BrowserLiteFragment r4 = r2.A0E
            X.QF6 r0 = r4.C9a()
            if (r0 != r5) goto Lb5
            java.lang.String r7 = r11.getUrl()
            boolean r0 = r2.A0K
            if (r0 == 0) goto L85
            boolean r0 = r2.A09
            if (r0 == 0) goto L94
            android.net.Uri r0 = r4.A08
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L94
        L46:
            android.net.Uri r0 = r4.A08
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = r11.getUrl()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5a
            boolean r0 = r5.A0c
            if (r0 != 0) goto L6c
        L5a:
            android.net.http.SslError r0 = r2.A04
            if (r0 != 0) goto L6c
            r2.A04 = r11
            X.ACq r5 = r4.A0e
            int r1 = r11.getPrimaryError()
            boolean r0 = r5.A0p
            if (r0 == 0) goto L6c
            r5.A03 = r1
        L6c:
            X.Tnc r0 = r2.A0H
            if (r0 == 0) goto L9f
            android.content.Intent r1 = r2.A0D
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_NEW_SSL_ERROR_SCREEN_ENABLED"
            boolean r0 = r1.getBooleanExtra(r0, r6)
            if (r0 == 0) goto L9f
            r11.getUrl()
            X.7mi r0 = r2.A0I
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            r0.A0Q(r3)
            return
        L85:
            java.lang.String r1 = r5.A05()
            if (r1 == 0) goto L46
            java.lang.String r0 = "about:blank"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L98
        L94:
            java.lang.String r1 = r2.A07
            if (r1 == 0) goto Lb5
        L98:
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto Lb5
            goto L46
        L9f:
            X.Q7k r2 = new X.Q7k
            r2.<init>()
            r2.A00 = r4
            X.0h2 r0 = r4.mFragmentManager
            X.0no r1 = new X.0no
            r1.<init>(r0)
            java.lang.String r0 = "SSLDialog"
            r1.A0B(r2, r0)
            r1.A01()
        Lb5:
            android.webkit.SslErrorHandler r0 = r3.A00
            r0.cancel()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58720Q4v.onReceivedSslError(android.webkit.WebView, android.webkit.SslErrorHandler, android.net.http.SslError):void");
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.A00.A07(renderProcessGoneDetail, R7V.A00(webView));
    }

    @Override // com.android.webview.chromium.membrane.AppHostedShareDelegate
    public final void onShare(String str, String str2, android.net.Uri uri, AppHostedShareDelegate.ShareResultCallback shareResultCallback) {
        if (this.A00 instanceof QF4) {
            shareResultCallback.onResult(AppHostedShareDelegate.ShareResult.OK);
            return;
        }
        throw AbstractC166987dD.A14("onShare must be overridden");
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        AbstractC62758SPp abstractC62758SPp = this.A00;
        SystemWebView A00 = R7V.A00(webView);
        if (abstractC62758SPp instanceof QF4) {
            QF4 qf4 = (QF4) abstractC62758SPp;
            InterfaceC65614To5 interfaceC65614To5 = qf4.A0E.A0Y;
            qf4.A05 = interfaceC65614To5;
            if (interfaceC65614To5 != null && AbstractC61738Rst.A00(webResourceRequest, interfaceC65614To5)) {
                return qf4.A05.handleRequest(webResourceRequest, qf4, qf4.A06);
            }
            android.net.Uri url = webResourceRequest.getUrl();
            WebResourceResponse A002 = QF4.A00(url, qf4, AbstractC62758SPp.A03(webResourceRequest, qf4.A0D.getBooleanExtra("BrowserLiteIntent.EXTRA_ENABLE_GET_DOMAIN_FROM_REFERER_HEADER", false)));
            if (A002 != null) {
                return A002;
            }
            return QF4.A01(qf4, A00, url.toString());
        }
        AbstractC58319PtB.A0r(webResourceRequest);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r9, android.webkit.WebResourceRequest r10) {
        /*
            r8 = this;
            X.SPp r2 = r8.A00
            com.facebook.browser.lite.webview.SystemWebView r5 = X.R7V.A00(r9)
            boolean r0 = r2 instanceof X.QF4
            if (r0 == 0) goto Lc3
            X.QF4 r2 = (X.QF4) r2
            java.lang.String r4 = X.AbstractC58319PtB.A0r(r10)
            java.lang.String r6 = "BrowserLiteFragment"
            r3 = 1
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "shouldOverrideUrlLoading %s"
            X.AbstractC63254SgB.A01(r6, r0, r1)
            java.lang.String r0 = r5.A05()
            if (r0 == 0) goto L94
            java.lang.String r0 = r5.A05()
            android.net.Uri r1 = X.AbstractC63387Sj3.A01(r0)
            if (r1 == 0) goto L94
            java.lang.String r0 = r1.getHost()
            if (r0 == 0) goto L94
            java.lang.String r1 = r1.getHost()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = ".facebook.com"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L4d
            java.lang.String r0 = ".instagram.com"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L94
        L4d:
            r7 = 1
        L4e:
            boolean r0 = r10.isForMainFrame()
            if (r0 != 0) goto L77
            boolean r0 = r10.hasGesture()
            if (r0 != 0) goto L77
            if (r7 != 0) goto L77
            android.net.Uri r0 = r10.getUrl()
            java.lang.String r1 = r0.getScheme()
            java.lang.String r0 = "intent"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L77
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "Blocking intent navigation with no user gesture for %s"
        L72:
            X.AbstractC63254SgB.A01(r6, r0, r1)
            r1 = 1
            return r1
        L77:
            boolean r0 = r10.hasGesture()
            if (r0 != 0) goto L96
            boolean r0 = r10.isRedirect()
            if (r0 != 0) goto L96
            boolean r0 = r5.A0c
            if (r0 == 0) goto L96
            boolean r0 = r2.A0B
            if (r0 == 0) goto L96
            if (r7 != 0) goto L96
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "Blocking url change with no user gesture and no redirect for %s"
            goto L72
        L94:
            r7 = 0
            goto L4e
        L96:
            boolean r0 = r10.isForMainFrame()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r10.isRedirect()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = X.QF4.A02(r2, r5, r1, r0, r4)
            if (r1 != 0) goto Lae
            r2.A07 = r4
        Lae:
            X.0NO r0 = X.QF4.A0S
            android.net.Uri r0 = X.AbstractC08820cl.A00(r0, r4)
            if (r1 == 0) goto Lc1
            if (r0 == 0) goto Lc1
            boolean r0 = X.AbstractC63387Sj3.A04(r0)
            if (r0 != 0) goto Lc1
        Lbe:
            r2.A0B = r3
            return r1
        Lc1:
            r3 = 0
            goto Lbe
        Lc3:
            java.lang.String r0 = X.AbstractC58319PtB.A0r(r10)
            boolean r1 = r2.A08(r5, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58720Q4v.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        clientCertRequest.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        message.sendToTarget();
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A00.A05(webResourceError, webResourceRequest, R7V.A00(webView));
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        AbstractC62758SPp abstractC62758SPp = this.A00;
        SystemWebView A00 = R7V.A00(webView);
        if (abstractC62758SPp instanceof QF4) {
            QF4 qf4 = (QF4) abstractC62758SPp;
            WebResourceResponse A002 = QF4.A00(AbstractC08820cl.A03(str), qf4, "");
            if (A002 == null) {
                return QF4.A01(qf4, A00, str);
            }
            return A002;
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.A00.A08(R7V.A00(webView), str);
    }
}
