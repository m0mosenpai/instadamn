package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.DexStore;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.business.boost.webview.BoostWebViewAdPreviewFragment$Config;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import net.trustly.android.sdk.views.TrustlyView;

/* loaded from: classes10.dex */
public final class Q4r extends WebViewClient {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Q4r(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (this.A00 != 0) {
            super.onPageCommitVisible(webView, str);
        } else {
            if (((Fragment) this.A02).mArguments == null) {
                return;
            }
            ((WebView) this.A01).evaluateJavascript("javascript:(function() {window.addEventListener('resize', (event) => { var ratio = window.innerWidth / 320 < window.innerHeight / 567 ? window.innerWidth / 320 : window.innerHeight / 567;document.body.style.zoom = ratio;document.body.style.backgroundColor = 'black';var container = document.getElementsByClassName('publicIGAdPreviewContainer')[0];container.style = 'width: auto;';setTimeout(function(){document.getElementsByClassName('_86t img')[0].style.pointerEvents = 'auto';document.getElementsByClassName('_86t img')[0].onclick = function() {window.js_interface.interfacedUIMethod();};document.getElementsByClassName('_86n')[0].setAttribute('align', 'left');}, 300);});})();", null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        switch (this.A00) {
            case 0:
                AbstractC167007dF.A1K(webView, str);
                super.onPageFinished(webView, str);
                C60891Raz c60891Raz = (C60891Raz) this.A02;
                BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config = c60891Raz.A03;
                if (boostWebViewAdPreviewFragment$Config == null) {
                    C14360o3.A0F(DexStore.CONFIG_FILENAME);
                    throw C00O.createAndThrow();
                }
                boolean z = boostWebViewAdPreviewFragment$Config.A0E;
                if (z && c60891Raz.getActivity() != null) {
                    String str2 = boostWebViewAdPreviewFragment$Config.A03;
                    String str3 = boostWebViewAdPreviewFragment$Config.A01;
                    boolean z2 = boostWebViewAdPreviewFragment$Config.A0D;
                    boolean z3 = boostWebViewAdPreviewFragment$Config.A05;
                    boolean z4 = boostWebViewAdPreviewFragment$Config.A08;
                    boolean z5 = boostWebViewAdPreviewFragment$Config.A09;
                    boolean z6 = boostWebViewAdPreviewFragment$Config.A0A;
                    boolean z7 = boostWebViewAdPreviewFragment$Config.A0B;
                    boolean z8 = boostWebViewAdPreviewFragment$Config.A0C;
                    boolean z9 = boostWebViewAdPreviewFragment$Config.A07;
                    boolean z10 = boostWebViewAdPreviewFragment$Config.A04;
                    boolean z11 = boostWebViewAdPreviewFragment$Config.A06;
                    c60891Raz.A03 = new BoostWebViewAdPreviewFragment$Config(str2, str3, webView.getTitle(), boostWebViewAdPreviewFragment$Config.A00, z, z2, z3, z5, z6, z7, z8, z4, z9, z10, z11);
                    AbstractC31178DnM.A0v(c60891Raz);
                }
                AbstractC167007dF.A0x(c60891Raz.A00);
                WebView webView2 = (WebView) this.A01;
                webView2.setVisibility(0);
                webView2.getUrl();
                if ("file:///android_asset/webview_error.html".equals(str)) {
                    AbstractC58321PtD.A17(AbstractC166997dE.A0N(c60891Raz), webView);
                    return;
                }
                return;
            case 1:
                C60888Raw c60888Raw = (C60888Raw) this.A01;
                c60888Raw.A02.setVisibility(8);
                super.onPageFinished(webView, str);
                if ("file:///android_asset/webview_error.html".equals(str)) {
                    AbstractC58321PtD.A17(AbstractC166997dE.A0N(c60888Raw), webView);
                }
                if (c60888Raw.A04 != C05F.A00) {
                    c60888Raw.A07 = c60888Raw.A01.getTitle();
                    FragmentActivity activity = c60888Raw.getActivity();
                    C18C.A07(activity, "Activity expected to be not null");
                    C56352iT.A0t.A03(activity).A0T();
                    return;
                }
                return;
            default:
                TrustlyView trustlyView = (TrustlyView) this.A01;
                trustlyView.A06.loadUrl("javascript:TrustlyNativeSDK.resize(document.body.scrollWidth, document.body.scrollHeight)");
                int intValue = trustlyView.A00.intValue();
                if (intValue != 3) {
                    if (intValue == 1) {
                        trustlyView.A00 = C05F.A0C;
                        HashMap A1G = AbstractC166987dD.A1G();
                        A1G.put("page", "widget");
                        A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "load");
                    }
                } else {
                    trustlyView.A00 = C05F.A0Y;
                }
                String title = webView.getTitle();
                if (title != null) {
                    Matcher matcher = Pattern.compile("[0-9]+").matcher(title);
                    while (matcher.find()) {
                        long parseLong = Long.parseLong(matcher.group()) / 100;
                        InterfaceC65460TkW interfaceC65460TkW = trustlyView.A04;
                        if (interfaceC65460TkW != null && (parseLong == 4 || parseLong == 5)) {
                            interfaceC65460TkW.CJA(this.A02, AbstractC166987dD.A1G());
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (1 - this.A00 != 0) {
            super.onPageStarted(webView, str, bitmap);
        } else {
            ((C60888Raw) this.A01).A02.setVisibility(0);
        }
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.A00) {
            case 0:
                AbstractC25233BEq.A0v(0, webView, str, str2);
                super.onReceivedError(webView, i, str, str2);
                FragmentActivity activity = ((Fragment) this.A02).getActivity();
                if (activity != null) {
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putInt(TraceFieldType.ErrorCode, i);
                    activity.getSupportFragmentManager().A0y("on_failure", A0b);
                    break;
                }
                break;
            case 1:
                super.onReceivedError(webView, i, str, str2);
                ((C60888Raw) this.A01).A02.setVisibility(8);
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                return;
        }
        webView.loadUrl("file:///android_asset/webview_error.html");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (this.A00 != 0) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            C14360o3.A0B(sslErrorHandler, 1);
            sslErrorHandler.cancel();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean z;
        String str2;
        FragmentActivity requireActivity;
        UserSession userSession;
        String str3;
        String str4;
        InterfaceC65460TkW interfaceC65460TkW;
        java.util.Set unmodifiableSet;
        switch (this.A00) {
            case 0:
                AbstractC167007dF.A1K(webView, str);
                C60891Raz c60891Raz = (C60891Raz) this.A02;
                z = true;
                android.net.Uri A01 = AbstractC08820cl.A01(c60891Raz.A08, str);
                if (A01 == null) {
                    return false;
                }
                String A19 = AbstractC166987dD.A19(A01);
                BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config = c60891Raz.A03;
                if (boostWebViewAdPreviewFragment$Config != null) {
                    if (boostWebViewAdPreviewFragment$Config.A08 && (str3 = boostWebViewAdPreviewFragment$Config.A03) != null) {
                        str2 = AbstractC08820cl.A03(str3).getHost();
                    } else {
                        str2 = null;
                    }
                    requireActivity = c60891Raz.requireActivity();
                    if (str2 != null && str2.equalsIgnoreCase(A01.getHost())) {
                        webView.loadUrl(A19);
                        return true;
                    }
                    String scheme = A01.getScheme();
                    if (scheme != null && C60891Raz.A0A.contains(scheme) && C12260kU.A0I(AbstractC58318PtA.A0D(A01), c60891Raz)) {
                        return true;
                    }
                    String path = A01.getPath();
                    String host = A01.getHost();
                    if (scheme != null && scheme.equals("instagram")) {
                        String path2 = A01.getPath();
                        String host2 = A01.getHost();
                        if (host2 != null && host2.equals("checkpoint") && path2 != null && (path2.equals("/dismiss") || path2.equals("/switch"))) {
                            if (path != null && path.equals("/switch")) {
                                InterfaceC09390do interfaceC09390do = c60891Raz.A09;
                                if (interfaceC09390do.getValue() != null) {
                                    FTX.A00(AbstractC166987dD.A0o(interfaceC09390do)).A01();
                                    AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                                    if (A0o != null) {
                                        FTX.A01(requireActivity.getBaseContext(), A01, A0o);
                                    }
                                }
                            }
                        } else {
                            if (host != null) {
                                boolean equals = host.equals("browser");
                                if (equals && path != null && path.equals("/dismiss")) {
                                    String queryParameter = A01.getQueryParameter(DialogModule.KEY_MESSAGE);
                                    if (queryParameter != null) {
                                        C9GR.A03(c60891Raz.requireContext().getApplicationContext(), queryParameter, null, 0);
                                    }
                                    String queryParameter2 = A01.getQueryParameter("action");
                                    BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config2 = c60891Raz.A03;
                                    if (boostWebViewAdPreviewFragment$Config2 != null) {
                                        if (boostWebViewAdPreviewFragment$Config2.A00 != null && queryParameter2 != null && queryParameter2.equals("updated") && (userSession = (UserSession) c60891Raz.A09.getValue()) != null) {
                                            C1DX A00 = C1DW.A00(userSession);
                                            BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config3 = c60891Raz.A03;
                                            if (boostWebViewAdPreviewFragment$Config3 != null) {
                                                C38321qM A02 = A00.A02(boostWebViewAdPreviewFragment$Config3.A00);
                                                if (A02 != null) {
                                                    A02.A0C.EYw(null);
                                                    A02.AEH(userSession);
                                                }
                                            }
                                        }
                                    }
                                } else if (equals && A01.getQueryParameter("uri") != null) {
                                    String queryParameter3 = A01.getQueryParameter("uri");
                                    if (c60891Raz.getActivity() != null) {
                                        if (queryParameter3 != null) {
                                            C12260kU.A05(AbstractC08820cl.A03(queryParameter3), c60891Raz);
                                            return true;
                                        }
                                        throw AbstractC166987dD.A14("Required value was null.");
                                    }
                                    return z;
                                }
                            }
                            BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config4 = c60891Raz.A03;
                            if (boostWebViewAdPreviewFragment$Config4 != null) {
                                if (boostWebViewAdPreviewFragment$Config4.A09) {
                                    return true;
                                }
                            }
                        }
                        requireActivity.finish();
                        return z;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                C14360o3.A0F(DexStore.CONFIG_FILENAME);
                throw C00O.createAndThrow();
            case 1:
                android.net.Uri A03 = AbstractC08820cl.A03(str);
                C60888Raw c60888Raw = (C60888Raw) this.A01;
                String str5 = c60888Raw.A06;
                z = true;
                if (str5 != null && str5.equalsIgnoreCase(A03.getHost())) {
                    webView.loadUrl(str);
                    return true;
                }
                if ("instagram".equals(A03.getScheme())) {
                    if ("checkpoint".equals(A03.getHost()) && ("/dismiss".equals(A03.getPath()) || "/switch".equals(A03.getPath()))) {
                        if (c60888Raw.getActivity() != null) {
                            if ("/switch".equals(A03.getPath())) {
                                FTX.A00(c60888Raw.A03).A01();
                                FTX.A01(c60888Raw.getActivity().getBaseContext(), A03, c60888Raw.A03);
                            }
                            requireActivity = c60888Raw.getActivity();
                            requireActivity.finish();
                            return z;
                        }
                        return z;
                    }
                    Integer num = c60888Raw.A04;
                    Integer num2 = C05F.A00;
                    if (num == num2) {
                        if ("reported".equals(A03.getHost())) {
                            c60888Raw.A07 = AbstractC166997dE.A0N(c60888Raw).getString(2131972417);
                            c60888Raw.A00 = 2131961124;
                            c60888Raw.A08 = false;
                            if (c60888Raw.A05 == num2) {
                                C72213Lu.A00(c60888Raw.A03).A02 = "selfinjurydone".equals(A03.getQueryParameter(CacheBehaviorLogger.SOURCE));
                                C72213Lu.A00(c60888Raw.A03).A01 = "falsenews".equals(A03.getQueryParameter("action"));
                                C72213Lu.A00(c60888Raw.A03).A00 = true;
                            }
                        } else if (!"native-action".equals(A03.getHost()) || !"direct-message".equals(A03.getQueryParameter("action"))) {
                            c60888Raw.A07 = AbstractC166997dE.A0N(c60888Raw).getString(2131972368);
                            c60888Raw.A00 = 2131954754;
                            c60888Raw.A08 = true;
                        }
                    } else if (num == C05F.A01) {
                        if ("feedback_sent".equals(A03.getHost())) {
                            C9GR.A09((Context) this.A02, c60888Raw.getString(2131962535));
                        } else if ("promote".equals(A03.getHost())) {
                            Bundle A0b = AbstractC166987dD.A0b();
                            A0b.putString("pk", c60888Raw.A03.userId);
                            A0b.putString("accessToken", c60888Raw.A03.token);
                            A0b.putString("entryPoint", "webview");
                            FragmentActivity activity = c60888Raw.getActivity();
                            C18C.A07(activity, "Activity expected to be not null");
                            AbstractC35275FhA.A09(A0b, activity, c60888Raw.A03);
                        }
                    }
                    AbstractC31178DnM.A0v(c60888Raw);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            default:
                if (str != null) {
                    TrustlyView trustlyView = (TrustlyView) this.A01;
                    z = true;
                    if (str.startsWith(trustlyView.A02)) {
                        interfaceC65460TkW = trustlyView.A05;
                    } else if (str.startsWith(trustlyView.A01)) {
                        interfaceC65460TkW = trustlyView.A04;
                    } else if (str.startsWith("msg://")) {
                        if (str.startsWith("msg://push?")) {
                            String[] split = str.substring(11).split("\\|");
                            if (split[0].equals("PayWithMyBank.createTransaction")) {
                                int length = split.length;
                                Map map = trustlyView.A03;
                                if (length > 1) {
                                    str4 = split[1];
                                } else {
                                    str4 = "";
                                }
                                map.put("paymentProviderId", str4);
                                return true;
                            }
                        }
                        return z;
                    }
                    if (interfaceC65460TkW != null) {
                        Object obj = this.A02;
                        android.net.Uri parse = android.net.Uri.parse(str);
                        String encodedQuery = parse.getEncodedQuery();
                        if (encodedQuery == null) {
                            unmodifiableSet = Collections.emptySet();
                        } else {
                            LinkedHashSet A0l = AbstractC31171DnF.A0l();
                            int i = 0;
                            do {
                                int indexOf = encodedQuery.indexOf(38, i);
                                if (indexOf == -1) {
                                    indexOf = encodedQuery.length();
                                }
                                int indexOf2 = encodedQuery.indexOf(61, i);
                                if (indexOf2 > indexOf || indexOf2 == -1) {
                                    indexOf2 = indexOf;
                                }
                                A0l.add(android.net.Uri.decode(encodedQuery.substring(i, indexOf2)));
                                i = indexOf + 1;
                            } while (i < encodedQuery.length());
                            unmodifiableSet = Collections.unmodifiableSet(A0l);
                        }
                        HashMap A1G = AbstractC166987dD.A1G();
                        A1G.put("url", str.replaceAll("requestSignature=.*", ""));
                        Iterator it = unmodifiableSet.iterator();
                        while (it.hasNext()) {
                            String A1B = AbstractC166987dD.A1B(it);
                            A1G.put(A1B, parse.getQueryParameter(A1B));
                        }
                        interfaceC65460TkW.CJA(obj, A1G);
                        return z;
                    }
                }
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        InterfaceC65460TkW interfaceC65460TkW;
        if (2 - this.A00 != 0) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            return;
        }
        boolean z = true;
        try {
            z = true ^ AbstractC58319PtB.A0r(webResourceRequest).matches(".*\\.svg\\.png\\.jpg\\.jpeg\\.css\\.gif\\.webp");
        } catch (Exception unused) {
            ((TrustlyView) this.A01).A04.CJA(this.A02, AbstractC166987dD.A1G());
        }
        if (TrustlyView.A09 || (interfaceC65460TkW = ((TrustlyView) this.A01).A04) == null || !z) {
            return;
        }
        interfaceC65460TkW.CJA(this.A02, AbstractC166987dD.A1G());
    }
}
