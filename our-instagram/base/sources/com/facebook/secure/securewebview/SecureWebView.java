package com.facebook.secure.securewebview;

import X.AbstractC08800ci;
import X.AbstractC08820cl;
import X.AbstractC166987dD;
import X.AbstractC62316S6l;
import X.AbstractC62760SPs;
import X.C0K8;
import X.C58718Q4t;
import X.C62490SDr;
import X.C62732SNx;
import X.C62990SaE;
import X.InterfaceC08100bW;
import X.Q4h;
import X.SKX;
import X.SVV;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public class SecureWebView extends WebView {
    public InterfaceC08100bW A00;
    public C62732SNx A01;
    public String A02;
    public ArrayList A03;
    public boolean A04;
    public boolean A05;
    public final C62490SDr A06;
    public final Context A07;

    public final void A03(AbstractC08800ci abstractC08800ci, String str, Collection collection, Map map) {
        if (this.A01.A00(getContext(), str).intValue() == 0) {
            Iterator it = this.A03.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("execute");
            }
            setCookieStrings(str, abstractC08800ci, collection, null);
            super.loadUrl(str, map);
        }
    }

    public final void setCookieStringsSecure(String str, AbstractC08800ci abstractC08800ci, Collection collection) {
        setCookieStrings(str, abstractC08800ci, collection, null);
    }

    public final void A01(SKX skx) {
        InterfaceC08100bW interfaceC08100bW;
        if (this.A04 && (interfaceC08100bW = this.A00) != null) {
            interfaceC08100bW.EHA("webview.SecureWebView", "WebChromeClient has been set already", null);
        }
        this.A04 = true;
        super.setWebChromeClient(new Q4h(skx));
    }

    public final void A02(AbstractC62760SPs abstractC62760SPs) {
        InterfaceC08100bW interfaceC08100bW;
        if (this.A05 && (interfaceC08100bW = this.A00) != null) {
            interfaceC08100bW.EHA("webview.SecureWebView", "WebViewClient has been set already", null);
        }
        this.A05 = true;
        super.setWebViewClient(new C58718Q4t(abstractC62760SPs));
    }

    public final C62490SDr getSecureJsBridgeAuth() {
        return this.A06;
    }

    public final C62732SNx getUriHandler() {
        return this.A01;
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map map) {
        A03(AbstractC62316S6l.A00, str, null, map);
    }

    public final void setCookieStrings(String str, AbstractC08800ci abstractC08800ci, Collection collection, ValueCallback valueCallback) {
        if (collection != null) {
            try {
                if (!abstractC08800ci.A01(AbstractC08820cl.A03(str))) {
                    C0K8.A0O(this.A02, "SecureUriWebView cannot load the cookie for the url \n%s\n. Please verify your cookie settings.\n", str);
                    return;
                }
                try {
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.flush();
                    cookieManager.setAcceptCookie(true);
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        String A1B = AbstractC166987dD.A1B(it);
                        if (valueCallback != null) {
                            cookieManager.setCookie(str, A1B, valueCallback);
                        } else {
                            cookieManager.setCookie(str, A1B);
                        }
                    }
                } catch (IllegalArgumentException unused) {
                }
            } catch (SecurityException e) {
                C0K8.A0L(this.A02, "Parse url run triggers the exception on url: \n%s\n", e, str);
            }
        }
    }

    public final void setCookieStringsInsecure(String str, Collection collection) {
        setCookieStrings(str, AbstractC62316S6l.A00, collection, null);
    }

    public SecureWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = new C62490SDr(this);
        this.A07 = C62990SaE.A00(context, this);
        A00();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0bW, java.lang.Object] */
    private void A00() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
        ?? obj = new Object();
        this.A03 = AbstractC166987dD.A1E();
        this.A00 = obj;
        this.A05 = false;
        this.A04 = false;
    }

    public SVV getSecureSettings() {
        return new SVV(getSettings());
    }

    public final void setReporter(InterfaceC08100bW interfaceC08100bW) {
        this.A00 = interfaceC08100bW;
    }

    public SecureWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = new C62490SDr(this);
        this.A07 = C62990SaE.A00(context, this);
        A00();
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        loadUrl(str, null);
    }

    public SecureWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A06 = new C62490SDr(this);
        this.A07 = C62990SaE.A00(context, this);
        A00();
    }

    @Deprecated
    public SecureWebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
        this.A06 = new C62490SDr(this);
        this.A07 = C62990SaE.A00(context, this);
        A00();
    }

    public SecureWebView(Context context) {
        super(context);
        this.A06 = new C62490SDr(this);
        this.A07 = C62990SaE.A00(context, this);
        A00();
    }
}
