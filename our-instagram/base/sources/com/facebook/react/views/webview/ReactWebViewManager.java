package com.facebook.react.views.webview;

import X.AbstractC08820cl;
import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC58318PtA;
import X.AbstractC61644RrG;
import X.AbstractC62295S5q;
import X.AbstractC70462WWz;
import X.AnonymousClass001;
import X.C0I2;
import X.C58795Q9w;
import X.C63081Sc3;
import X.C63523Soq;
import X.C63529Sow;
import X.C64145T0v;
import X.InterfaceC65231TgN;
import X.InterfaceC65364Tiw;
import X.InterfaceC65496TlK;
import X.Q21;
import X.Q4m;
import X.Q4p;
import X.R3N;
import X.SVN;
import X.Sb5;
import X.X9J;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = ReactWebViewManager.REACT_CLASS)
/* loaded from: classes10.dex */
public class ReactWebViewManager extends SimpleViewManager {
    public static final String BLANK_URL = "about:blank";
    public static final String BRIDGE_NAME = "__REACT_WEB_VIEW_BRIDGE";
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_LOAD_URL = 7;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    public static final String HTML_ENCODING = "UTF-8";
    public static final String HTML_MIME_TYPE = "text/html";
    public static final String HTTP_METHOD_POST = "POST";
    public static final String INTENT_URL_PREFIX = "intent://";
    public static final String[] META_DOMAINS = {IGPixelRequestBuffer.URL_PREFIX, "workplace.com", "meta.com"};
    public static final String REACT_CLASS = "RCTWebView";
    public static InterfaceC65231TgN customClientCertRequestHandler;
    public boolean mAlwaysReloadOnSourceChange;
    public final InterfaceC65496TlK mDelegate;
    public List mFBSessionCookies;
    public WebView.PictureListener mPictureListener;
    public InterfaceC65364Tiw mWebViewConfig;

    public ReactWebViewManager(InterfaceC65364Tiw interfaceC65364Tiw, List list) {
        super(null);
        this.mAlwaysReloadOnSourceChange = false;
        this.mWebViewConfig = interfaceC65364Tiw == null ? new C64145T0v(this) : interfaceC65364Tiw;
        this.mFBSessionCookies = list;
        this.mDelegate = new AbstractC70462WWz(this);
    }

    private void handlePostMessageCommand(WebView webView, ReadableArray readableArray) {
        postMessage(webView, readableArray.getString(0), readableArray.getString(1));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getCommandsMap() {
        HashMap A12 = AbstractC31174DnI.A12("goBack", 1);
        A12.put("goForward", 2);
        A12.put("reload", 3);
        A12.put("stopLoading", 4);
        A12.put("postMessage", 5);
        A12.put("injectJavaScript", 6);
        A12.put("loadUrl", 7);
        return A12;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [byte[]] */
    @com.facebook.react.uimanager.annotations.ReactProp(name = com.instagram.common.api.base.CacheBehaviorLogger.SOURCE)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSource(android.webkit.WebView r14, com.facebook.react.bridge.ReadableMap r15) {
        /*
            r13 = this;
            r7 = r14
            if (r15 == 0) goto Lca
            java.lang.String r1 = "html"
            boolean r0 = r15.hasKey(r1)
            java.lang.String r11 = "UTF-8"
            if (r0 == 0) goto L2c
            java.lang.String r9 = r15.getString(r1)
            java.lang.String r1 = "baseUrl"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L25
            java.lang.String r8 = r15.getString(r1)
            r12 = 0
            java.lang.String r10 = "text/html"
            r7.loadDataWithBaseURL(r8, r9, r10, r11, r12)
            return
        L25:
            java.lang.String r0 = "text/html"
            r14.loadData(r9, r0, r11)
            return
        L2c:
            java.lang.String r1 = "uri"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto Lca
            java.lang.String r4 = r15.getString(r1)
            r13.setSessionCookiesForFacebookURL(r4)
            java.lang.String r1 = r14.getUrl()
            boolean r0 = r13.mAlwaysReloadOnSourceChange
            if (r0 != 0) goto L4d
            if (r1 == 0) goto L4d
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L4d
            return
        L4d:
            java.lang.String r1 = "method"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L7f
            java.lang.String r1 = r15.getString(r1)
            java.lang.String r0 = "POST"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L7f
            java.lang.String r1 = "body"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L78
            java.lang.String r0 = r15.getString(r1)
            byte[] r0 = r0.getBytes(r11)     // Catch: java.io.UnsupportedEncodingException -> L72
            goto L76
        L72:
            byte[] r0 = r0.getBytes()
        L76:
            if (r0 != 0) goto L7b
        L78:
            r0 = 0
            byte[] r0 = new byte[r0]
        L7b:
            r14.postUrl(r4, r0)
            return
        L7f:
            java.util.HashMap r5 = X.AbstractC166987dD.A1G()
            java.lang.String r1 = "headers"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto Lc6
            com.facebook.react.bridge.ReadableMap r6 = r15.getMap(r1)
            com.facebook.react.bridge.ReadableMapKeySetIterator r3 = r6.keySetIterator()
        L93:
            boolean r0 = r3.CLQ()
            if (r0 == 0) goto Lc6
            java.lang.String r2 = r3.Csu()
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r1 = r2.toLowerCase(r0)
            java.lang.String r0 = "user-agent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbe
            android.webkit.WebSettings r0 = r14.getSettings()
            if (r0 == 0) goto L93
            android.webkit.WebSettings r1 = r14.getSettings()
            java.lang.String r0 = r6.getString(r2)
            r1.setUserAgentString(r0)
            goto L93
        Lbe:
            java.lang.String r0 = r6.getString(r2)
            r5.put(r2, r0)
            goto L93
        Lc6:
            r14.loadUrl(r4, r5)
            return
        Lca:
            java.lang.String r0 = "about:blank"
            r14.loadUrl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.webview.ReactWebViewManager.setSource(android.webkit.WebView, com.facebook.react.bridge.ReadableMap):void");
    }

    public static /* synthetic */ InterfaceC65231TgN access$000() {
        return null;
    }

    public static String parseOrigin(String str) {
        try {
            URL url = new URL(str);
            String protocol = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort();
            StringBuilder A11 = AbstractC166997dE.A11(protocol);
            A11.append("://");
            A11.append(host);
            if (port != -1 && port != url.getDefaultPort()) {
                A11.append(":");
                A11.append(port);
            }
            return A11.toString();
        } catch (MalformedURLException unused) {
            ReactSoftExceptionLogger.logSoftException("ReactNative", new RuntimeException("Error parsing origin: ReactWebView returned malformed URL for current page"));
            return null;
        }
    }

    private void setSessionCookiesForFacebookURL(String str) {
        String host;
        if (str != null && (host = AbstractC08820cl.A03(str).getHost()) != null) {
            for (String str2 : META_DOMAINS) {
                if (host.equals(str2) || host.endsWith(AnonymousClass001.A0R(".", str2))) {
                    List list = this.mFBSessionCookies;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            CookieManager.getInstance().setCookie(str, AbstractC166987dD.A1B(it));
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(R3N r3n, WebView webView) {
        webView.setWebViewClient(new Q4p());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Q4m, android.webkit.WebView] */
    public Q4m createReactWebViewInstance(R3N r3n) {
        ?? webView = new WebView(r3n);
        webView.A03 = false;
        webView.A02 = false;
        return webView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.TmH, android.view.View, X.Q4m, android.webkit.WebView] */
    @Override // com.facebook.react.uimanager.ViewManager
    public WebView createViewInstance(R3N r3n) {
        ?? webView = new WebView(r3n);
        webView.A03 = false;
        webView.A02 = false;
        webView.setWebChromeClient(new WebChromeClient());
        r3n.A0A(webView);
        this.mWebViewConfig.AJ4(webView);
        WebSettings settings = webView.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        setAllowUniversalAccessFromFileURLs((WebView) webView, false);
        setMixedContentMode((WebView) webView, "never");
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        settings.setGeolocationEnabled(false);
        return webView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC65496TlK getDelegate() {
        return this.mDelegate;
    }

    public WebView.PictureListener getPictureListener() {
        WebView.PictureListener pictureListener = this.mPictureListener;
        if (pictureListener == null) {
            C63529Sow c63529Sow = new C63529Sow(this);
            this.mPictureListener = c63529Sow;
            return c63529Sow;
        }
        return pictureListener;
    }

    public /* bridge */ /* synthetic */ void goBack(View view) {
        ((WebView) view).goBack();
    }

    public /* bridge */ /* synthetic */ void goForward(View view) {
        ((WebView) view).goForward();
    }

    public /* bridge */ /* synthetic */ void injectJavaScript(View view, String str) {
        ((WebView) view).evaluateJavascript(str, null);
    }

    public /* bridge */ /* synthetic */ void loadUrl(View view, String str) {
        ((WebView) view).loadUrl(str);
    }

    public void postMessage(WebView webView, String str, String str2) {
        Q4m q4m = (Q4m) webView;
        if (!TextUtils.isEmpty(str2) && !"*".equals(str2)) {
            String parseOrigin = parseOrigin(q4m.getUrl());
            if (!str2.equals(parseOrigin)) {
                C0I2.A08("ReactNative", "Cross-origin request blocked: postMessage was sent to %s, but current origin is %s", str2, parseOrigin);
                return;
            }
        } else {
            C0I2.A04("ReactNative", "Always provide specific targetOrigin when using WebView.postMessage command");
        }
        postWebMessage(q4m, str);
    }

    public /* bridge */ /* synthetic */ void reload(View view) {
        ((WebView) view).reload();
    }

    @ReactProp(name = "clearCookiesOnExit")
    public /* bridge */ /* synthetic */ void setClearCookiesOnExit(View view, boolean z) {
        ((Q4m) ((WebView) view)).A02 = z;
    }

    @ReactProp(name = "cookies")
    public void setCookies(WebView webView, ReadableArray readableArray) {
        if (readableArray != null) {
            Iterator it = readableArray.toArrayList().iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                ArrayList A0z = AbstractC31174DnI.A0z(AnonymousClass001.A0g(AbstractC166987dD.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, map), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, AbstractC166987dD.A1A(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, map)));
                Iterator it2 = Arrays.asList("path", "domain", "secure", "httpOnly", "sameSite").iterator();
                while (it2.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it2);
                    Object obj = map.get(A1B);
                    if (obj instanceof String) {
                        A1B = AbstractC167017dG.A0n(obj, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, AbstractC166997dE.A11(A1B));
                    } else if ((obj instanceof Boolean) && AbstractC166987dD.A1a(obj)) {
                    }
                    A0z.add(A1B);
                }
                String A1A = AbstractC166987dD.A1A("domain", map);
                String join = TextUtils.join("; ", A0z);
                if (A1A != null) {
                    if (Boolean.TRUE.equals(map.get("secure"))) {
                        A1A = AnonymousClass001.A0R("https://", A1A);
                    }
                    CookieManager.getInstance().setCookie(A1A, join);
                }
            }
        }
    }

    @ReactProp(name = "forceDarkOn")
    public void setForceDarkOn(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            if (SVN.A00("FORCE_DARK")) {
                WebSettings settings = webView.getSettings();
                int i = 0;
                if (z) {
                    i = 2;
                }
                C58795Q9w c58795Q9w = SVN.A0p;
                if (c58795Q9w.A00()) {
                    AbstractC61644RrG.A00(settings, i);
                } else if (c58795Q9w.A01()) {
                    ((WebSettingsBoundaryInterface) C63081Sc3.A00(WebSettingsBoundaryInterface.class, AbstractC62295S5q.A00.A00.convertSettings(settings))).setForceDark(i);
                } else {
                    throw AbstractC166987dD.A1D("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
            if (SVN.A00("FORCE_DARK_STRATEGY")) {
                WebSettings settings2 = webView.getSettings();
                if (SVN.A0O.A01()) {
                    ((WebSettingsBoundaryInterface) C63081Sc3.A00(WebSettingsBoundaryInterface.class, AbstractC62295S5q.A00.A00.convertSettings(settings2))).setForceDarkBehavior(1);
                    return;
                }
                throw AbstractC166987dD.A1D("This method is not supported by the current version of the framework and the current WebView APK");
            }
        }
    }

    @ReactProp(defaultBoolean = true, name = "hardwareAccelerationEnabledExperimental")
    public void setHardwareAccelerationEnabledExperimental(WebView webView, boolean z) {
        if (!z) {
            webView.setLayerType(1, null);
        }
    }

    @ReactProp(name = "incognito")
    public void setIncognito(WebView webView, boolean z) {
        if (z) {
            CookieManager.getInstance().removeAllCookies(new C63523Soq(1));
            webView.getSettings().setCacheMode(2);
            webView.clearHistory();
            webView.clearCache(true);
            webView.clearFormData();
        }
    }

    @ReactProp(name = "injectedJavaScript")
    public /* bridge */ /* synthetic */ void setInjectedJavaScript(View view, String str) {
        ((Q4m) ((WebView) view)).A01 = str;
    }

    @ReactProp(name = "messagingEnabled")
    public /* bridge */ /* synthetic */ void setMessagingEnabled(View view, boolean z) {
        ((Q4m) ((WebView) view)).setMessagingEnabled(z);
    }

    @ReactProp(name = "mixedContentMode")
    public void setMixedContentMode(WebView webView, String str) {
        WebSettings settings;
        int i;
        if (str != null && !"never".equals(str)) {
            if (AbstractC111324zv.A00(726).equals(str)) {
                settings = webView.getSettings();
                i = 0;
            } else {
                if (!"compatibility".equals(str)) {
                    return;
                }
                settings = webView.getSettings();
                i = 2;
            }
        } else {
            settings = webView.getSettings();
            i = 1;
        }
        settings.setMixedContentMode(i);
    }

    @ReactProp(name = "originAllowlist")
    public void setOriginAllowlist(WebView webView, ReadableArray readableArray) {
        Q4p q4p = ((Q4m) webView).A00;
        if (q4p != null && readableArray != null) {
            LinkedList A11 = AbstractC58318PtA.A11();
            for (int i = 0; i < readableArray.size(); i++) {
                A11.add(Pattern.compile(readableArray.getString(i)));
            }
            q4p.A01 = A11;
        }
    }

    @ReactProp(name = "reportContentSizeChanges")
    public void setReportContentSizeChanges(WebView webView, boolean z) {
        WebView.PictureListener pictureListener;
        if (z) {
            pictureListener = getPictureListener();
        } else {
            pictureListener = null;
        }
        webView.setPictureListener(pictureListener);
    }

    @ReactProp(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, ReadableArray readableArray) {
        Q4p q4p = ((Q4m) webView).A00;
        if (q4p != null && readableArray != null) {
            q4p.A00 = readableArray;
        }
    }

    @ReactProp(name = "userAgent")
    public void setUserAgent(WebView webView, String str) {
        if (str != null) {
            webView.getSettings().setUserAgentString(str);
        }
    }

    public /* bridge */ /* synthetic */ void stopLoading(View view) {
        ((WebView) view).stopLoading();
    }

    public static void dispatchEvent(WebView webView, Sb5 sb5) {
        X9J A05 = UIManagerHelper.A05((Q21) webView.getContext(), webView.getId());
        if (A05 != null) {
            A05.APn(sb5);
        }
    }

    private void postWebMessage(Q4m q4m, String str) {
        try {
            JSONObject A0q = AbstractC31171DnF.A0q();
            A0q.put("data", str);
            q4m.evaluateJavascript(AnonymousClass001.A0g("(function () {var event;var data = ", A0q.toString(), ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();"), null);
        } catch (JSONException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }

    public static void setCustomClientCertRequestHandler(InterfaceC65231TgN interfaceC65231TgN) {
        customClientCertRequestHandler = interfaceC65231TgN;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", AbstractC31174DnI.A12("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put("topContentSizeChange", AbstractC31174DnI.A12("registrationName", "onContentSizeChange"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance((View) webView);
        Q21 q21 = (Q21) webView.getContext();
        Q4m q4m = (Q4m) webView;
        q21.A0B(q4m);
        if (q4m.A02) {
            CookieManager.getInstance().removeAllCookies(new C63523Soq(1));
        }
        q4m.setWebViewClient(null);
        q4m.destroy();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(WebView webView, String str, ReadableArray readableArray) {
        switch (str.hashCode()) {
            case -1241591313:
                if (!str.equals("goBack")) {
                    return;
                }
                webView.goBack();
                return;
            case -948122918:
                if (!str.equals("stopLoading")) {
                    return;
                }
                webView.stopLoading();
                return;
            case -934641255:
                if (!str.equals("reload")) {
                    return;
                }
                webView.reload();
                return;
            case -318289731:
                if (!str.equals("goForward")) {
                    return;
                }
                webView.goForward();
                return;
            case 336631465:
                if (!str.equals("loadUrl") || readableArray == null) {
                    return;
                }
                webView.loadUrl(readableArray.getString(0));
                return;
            case 1490029383:
                if (!str.equals("postMessage") || readableArray == null) {
                    return;
                }
                handlePostMessageCommand(webView, readableArray);
                return;
            case 2104576510:
                if (!str.equals("injectJavaScript")) {
                    return;
                }
                webView.evaluateJavascript(readableArray.getString(0), null);
                return;
            default:
                return;
        }
    }

    @ReactProp(name = "allowFileAccess")
    public void setAllowFileAccess(WebView webView, boolean z) {
        webView.getSettings().setAllowFileAccess(z);
    }

    @ReactProp(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @ReactProp(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @ReactProp(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptEnabled(z);
    }

    @ReactProp(name = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @ReactProp(name = "openNewWindowLinksInNewView")
    public void setOpenNewWindowLinksInNewView(WebView webView, boolean z) {
        webView.getSettings().setSupportMultipleWindows(z);
    }

    @ReactProp(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(!z);
    }

    @ReactProp(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setUseWideViewPort(!z);
    }

    @ReactProp(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
    }

    @ReactProp(name = "alwaysReloadOnSourceChange")
    public /* bridge */ /* synthetic */ void setAlwaysReloadOnSourceChange(View view, boolean z) {
        this.mAlwaysReloadOnSourceChange = z;
    }

    @ReactProp(name = "webviewDebuggingEnabled")
    public /* bridge */ /* synthetic */ void setWebviewDebuggingEnabled(View view, boolean z) {
        WebView.setWebContentsDebuggingEnabled(z);
    }

    public ReactWebViewManager(InterfaceC65364Tiw interfaceC65364Tiw) {
        this(interfaceC65364Tiw, null);
    }

    public void goBack(WebView webView) {
        webView.goBack();
    }

    public void goForward(WebView webView) {
        webView.goForward();
    }

    public void injectJavaScript(WebView webView, String str) {
        webView.evaluateJavascript(str, null);
    }

    public void loadUrl(WebView webView, String str) {
        webView.loadUrl(str);
    }

    public void reload(WebView webView) {
        webView.reload();
    }

    @ReactProp(name = "alwaysReloadOnSourceChange")
    public void setAlwaysReloadOnSourceChange(WebView webView, boolean z) {
        this.mAlwaysReloadOnSourceChange = z;
    }

    @ReactProp(name = "clearCookiesOnExit")
    public void setClearCookiesOnExit(WebView webView, boolean z) {
        ((Q4m) webView).A02 = z;
    }

    @ReactProp(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, String str) {
        ((Q4m) webView).A01 = str;
    }

    @ReactProp(name = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z) {
        ((Q4m) webView).setMessagingEnabled(z);
    }

    @ReactProp(name = "webviewDebuggingEnabled")
    public void setWebviewDebuggingEnabled(WebView webView, boolean z) {
        WebView.setWebContentsDebuggingEnabled(z);
    }

    public void stopLoading(WebView webView) {
        webView.stopLoading();
    }

    public ReactWebViewManager(List list) {
        this(null, list);
    }

    public ReactWebViewManager() {
        this(null, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(WebView webView, int i, ReadableArray readableArray) {
        switch (i) {
            case 1:
                webView.goBack();
                return;
            case 2:
                webView.goForward();
                return;
            case 3:
                webView.reload();
                return;
            case 4:
                webView.stopLoading();
                return;
            case 5:
                if (readableArray == null) {
                    return;
                }
                handlePostMessageCommand(webView, readableArray);
                return;
            case 6:
                webView.evaluateJavascript(readableArray.getString(0), null);
                return;
            case 7:
                if (readableArray == null) {
                    return;
                }
                webView.loadUrl(readableArray.getString(0));
                return;
            default:
                return;
        }
    }
}
