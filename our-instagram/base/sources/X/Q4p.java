package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

/* loaded from: classes10.dex */
public final class Q4p extends WebViewClient {
    public ReadableArray A00;
    public List A01;
    public boolean A02 = false;

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "about:blank"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto La
            r9 = 0
        L9:
            return r9
        La:
            com.facebook.react.bridge.ReadableArray r0 = r10.A00
            r9 = 1
            if (r0 == 0) goto L3f
            int r0 = r0.size()
            if (r0 <= 0) goto L3f
            com.facebook.react.bridge.ReadableArray r0 = r10.A00
            java.util.ArrayList r0 = r0.toArrayList()
            java.util.Iterator r1 = r0.iterator()
        L1f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3f
            java.lang.String r0 = X.AbstractC166987dD.A1B(r1)
            boolean r0 = r12.startsWith(r0)
            if (r0 == 0) goto L1f
        L2f:
            android.content.Context r5 = r11.getContext()
            java.lang.String r8 = "intent://"
            boolean r0 = r12.startsWith(r8)
            java.lang.String r3 = "ReactNative"
            r7 = 0
            if (r0 == 0) goto L9d
            goto L92
        L3f:
            java.util.List r4 = r10.A01
            if (r4 == 0) goto L2f
            android.net.Uri r3 = X.AbstractC58319PtB.A09(r12)
            if (r3 == 0) goto L2f
            java.lang.String r0 = r3.getScheme()
            java.lang.String r2 = ""
            if (r0 == 0) goto L90
            java.lang.String r1 = r3.getScheme()
        L55:
            java.lang.String r0 = r3.getAuthority()
            if (r0 == 0) goto L5f
            java.lang.String r2 = r3.getAuthority()
        L5f:
            java.lang.String r0 = "://"
            java.lang.String r2 = X.AnonymousClass001.A0g(r1, r0, r2)
            java.util.Iterator r1 = r4.iterator()
        L69:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r1.next()
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            boolean r0 = X.AbstractC31175DnJ.A1Z(r2, r0)
            if (r0 == 0) goto L69
            int r3 = com.facebook.react.uimanager.UIManagerHelper.A01(r11)
            int r2 = r11.getId()
            com.facebook.react.bridge.WritableNativeMap r1 = r10.A00(r11, r12)
            X.R68 r0 = new X.R68
            r0.<init>(r1, r3, r2)
            com.facebook.react.views.webview.ReactWebViewManager.dispatchEvent(r11, r0)
            return r9
        L90:
            r1 = r2
            goto L55
        L92:
            android.content.Intent r6 = X.AbstractC07860b5.A00(r12)     // Catch: java.net.URISyntaxException -> L97
            goto L9e
        L97:
            r1 = move-exception
            java.lang.String r0 = "Can't parse intent:// URI"
            X.C0I2.A05(r3, r0, r1)
        L9d:
            r6 = r7
        L9e:
            java.lang.String r4 = "android.intent.category.BROWSABLE"
            java.lang.String r2 = "android.intent.action.VIEW"
            if (r6 == 0) goto Ld0
            r6.addCategory(r4)
            r6.setComponent(r7)
            r6.setSelector(r7)
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r0 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r6, r0)
            if (r0 == 0) goto Lbd
            X.AbstractC07840b2.A01(r5, r6)
            return r9
        Lbd:
            java.lang.String r0 = "browser_fallback_url"
            java.lang.String r1 = r6.getStringExtra(r0)
            if (r1 == 0) goto L9
            boolean r0 = r1.startsWith(r8)
            if (r0 != 0) goto L9
            android.net.Uri r0 = X.AbstractC08820cl.A03(r1)
            goto Ld4
        Ld0:
            android.net.Uri r0 = X.AbstractC08820cl.A03(r12)
        Ld4:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r0)     // Catch: android.content.ActivityNotFoundException -> Le5
            r1.addCategory(r4)     // Catch: android.content.ActivityNotFoundException -> Le5
            X.AbstractC07840b2.A01(r5, r1)     // Catch: android.content.ActivityNotFoundException -> Le5
            return r9
        Le5:
            r1 = move-exception
            java.lang.String r0 = "activity not found to handle uri scheme for: "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r12)
            X.C0I2.A06(r3, r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q4p.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r5.getProgress() == 100) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.react.bridge.WritableNativeMap A00(android.webkit.WebView r5, java.lang.String r6) {
        /*
            r4 = this;
            com.facebook.react.bridge.WritableNativeMap r3 = X.AbstractC58321PtD.A0c()
            int r0 = r5.getId()
            double r1 = (double) r0
            java.lang.String r0 = "target"
            r3.putDouble(r0, r1)
            java.lang.String r0 = "url"
            r3.putString(r0, r6)
            boolean r0 = r4.A02
            if (r0 != 0) goto L22
            int r2 = r5.getProgress()
            r0 = 100
            r1 = 1
            if (r2 != r0) goto L23
        L22:
            r1 = 0
        L23:
            java.lang.String r0 = "loading"
            r3.putBoolean(r0, r1)
            java.lang.String r1 = r5.getTitle()
            java.lang.String r0 = "title"
            r3.putString(r0, r1)
            boolean r1 = r5.canGoBack()
            java.lang.String r0 = "canGoBack"
            r3.putBoolean(r0, r1)
            boolean r1 = r5.canGoForward()
            java.lang.String r0 = "canGoForward"
            r3.putBoolean(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q4p.A00(android.webkit.WebView, java.lang.String):com.facebook.react.bridge.WritableNativeMap");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.R66, X.Sb5] */
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        String str2;
        super.onPageFinished(webView, str);
        if (!this.A02) {
            Q4m q4m = (Q4m) webView;
            if (q4m.A03) {
                q4m.evaluateJavascript("(window.originalPostMessage = window.postMessage,window.postMessage = function(data) {__REACT_WEB_VIEW_BRIDGE.postMessage(String(data));})", null);
            }
            if (q4m.getSettings().getJavaScriptEnabled() && (str2 = q4m.A01) != null && !TextUtils.isEmpty(str2)) {
                q4m.evaluateJavascript(AnonymousClass001.A0g("(function() {\n", q4m.A01, ";\n})();"), null);
            }
            int A01 = UIManagerHelper.A01(webView);
            int id = webView.getId();
            WritableNativeMap A00 = A00(webView, str);
            ?? sb5 = new Sb5(A01, id);
            sb5.A00 = A00;
            ReactWebViewManager.dispatchEvent(webView, sb5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.R67, X.Sb5] */
    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.A02 = false;
        int A01 = UIManagerHelper.A01(webView);
        int id = webView.getId();
        WritableNativeMap A00 = A00(webView, str);
        ?? sb5 = new Sb5(A01, id);
        sb5.A00 = A00;
        ReactWebViewManager.dispatchEvent(webView, sb5);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.R66, X.Sb5] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.R65, X.Sb5] */
    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.A02 = true;
        int A01 = UIManagerHelper.A01(webView);
        int id = webView.getId();
        WritableNativeMap A00 = A00(webView, str2);
        ?? sb5 = new Sb5(A01, id);
        sb5.A00 = A00;
        ReactWebViewManager.dispatchEvent(webView, sb5);
        WritableNativeMap A002 = A00(webView, str2);
        A002.putDouble(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, i);
        A002.putString(DevServerEntity.COLUMN_DESCRIPTION, str);
        ?? sb52 = new Sb5(UIManagerHelper.A01(webView), webView.getId());
        sb52.A00 = A002;
        ReactWebViewManager.dispatchEvent(webView, sb52);
    }
}
