package X;

import android.content.Context;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.shopify.checkout.models.Authentication;
import com.shopify.checkout.models.AuthenticationVersion;
import com.shopify.checkout.models.CheckoutOptions;
import com.shopify.checkout.models.Defaults;
import com.shopify.checkout.models.PaymentMethod;
import com.shopify.checkout.models.ThemeOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

/* renamed from: X.RbX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60917RbX extends AbstractC65806TuP {
    public final AbstractC61593RqH A00;
    public final C6FG A01;
    public final C102884kP A02;

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new FrameLayout(context);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.S5V, java.lang.Object] */
    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        boolean z;
        ThemeOptions themeOptions;
        Defaults defaults;
        AuthenticationVersion authenticationVersion;
        String str;
        Authentication authentication;
        WebSettings settings;
        WebSettings settings2;
        WebSettings settings3;
        ArrayList A1E;
        QuickPerformanceLogger quickPerformanceLogger;
        ViewGroup viewGroup = (ViewGroup) view;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Object obj2 = null;
        Object obj3 = null;
        C14360o3.A0B(viewGroup, 0);
        AbstractC167007dF.A1D(c6fg, 1, c102884kP);
        C102884kP A08 = c102884kP.A08(42);
        C102884kP A082 = c102884kP.A08(56);
        String A0L = c102884kP.A0L(61);
        String A0L2 = c102884kP.A0L(53);
        String A0G = c102884kP.A0G();
        if (A0G != null) {
            SDC sdc = new SDC(c6fg, c102884kP);
            if (A08 == null) {
                z = false;
            } else {
                str4 = A08.A0L(42);
                obj3 = C102884kP.A00(A08, 44);
                obj2 = C102884kP.A00(A08, 43);
                z = true;
                str5 = A0L;
            }
            c102884kP.A0S(58, false);
            boolean z2 = false;
            if (A082 != null) {
                String A0G2 = A082.A0G();
                String A0E = A082.A0E();
                if (A0G2 != null && A0E != null) {
                    z2 = true;
                    str3 = A0G2;
                    str2 = A0E;
                }
            }
            AbstractC61593RqH abstractC61593RqH = this.A00;
            if (abstractC61593RqH != null && !abstractC61593RqH.A01) {
                abstractC61593RqH.A01 = true;
                QJl qJl = (QJl) abstractC61593RqH;
                qJl.A03 = A0G;
                qJl.A02 = A0L2;
                qJl.A00 = sdc;
                QuickPerformanceLogger quickPerformanceLogger2 = AbstractC63320ShT.A00;
                Integer num = qJl.A08;
                C14360o3.A0B(num, 0);
                Integer A00 = AbstractC63320ShT.A00(num);
                if (A00 != null && (quickPerformanceLogger = AbstractC63320ShT.A00) != null) {
                    quickPerformanceLogger.markerPoint(A00.intValue(), "sdk_present_checkout");
                }
                if (!z2) {
                    AbstractC63399SjU abstractC63399SjU = qJl.A01;
                    if (abstractC63399SjU != null) {
                        String str6 = qJl.A0B;
                        if (str6 == null) {
                            str6 = "";
                        }
                        abstractC63399SjU.A0E(str6, qJl.A06, qJl.A0A, qJl.A03, "Attempted to present checkout but sdk auth is null", qJl.A09, qJl.A02);
                    }
                } else {
                    AbstractC63399SjU abstractC63399SjU2 = qJl.A01;
                    if (abstractC63399SjU2 != null) {
                        String str7 = qJl.A0B;
                        if (str7 == null) {
                            str7 = "";
                        }
                        String str8 = qJl.A0A;
                        long j = qJl.A06;
                        String str9 = qJl.A03;
                        String str10 = qJl.A09;
                        String str11 = qJl.A02;
                        AbstractC25233BEq.A0w(1, str8, str9, str10);
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(abstractC63399SjU2.A0C(), "client_load_metacheckoutsdk_init");
                        if (A0f.isSampled()) {
                            A0f.AAP(AbstractC63082Sc5.A00(), str8);
                            AbstractC58321PtD.A1E(AbstractC63399SjU.A01(abstractC63399SjU2), A0f);
                            C0Zx c0Zx = new C0Zx();
                            AbstractC63399SjU.A09(c0Zx, abstractC63399SjU2, "present_checkout");
                            AbstractC58322PtE.A1H(A0f, c0Zx, AbstractC25233BEq.A0p("csp_version", "2024-10", AbstractC63399SjU.A06(str9)));
                            C0Zx c0Zx2 = new C0Zx();
                            AbstractC63399SjU.A0B(c0Zx2, str11, str7, j);
                            AbstractC63399SjU.A07(A0f, c0Zx2, abstractC63399SjU2, str7, str10);
                            A0f.Cht();
                        }
                    }
                    if (qJl.A0D) {
                        themeOptions = ThemeOptions.A02;
                    } else {
                        themeOptions = ThemeOptions.A03;
                    }
                    C62573SGy c62573SGy = qJl.A07;
                    String str12 = qJl.A03;
                    if (z) {
                        ArrayList arrayList = null;
                        if (obj3 != null) {
                            try {
                                A1E = AbstractC166987dD.A1E();
                                Iterator it = ((List) obj3).iterator();
                                while (it.hasNext()) {
                                    A1E.add(VMX.A00((Map) it.next()));
                                }
                            } catch (Exception e) {
                                AbstractC25241Le.A02("MetaCheckoutDataFormatConverter_convertShippingAddresses", e.toString());
                                A1E = AbstractC166987dD.A1E();
                            }
                        } else {
                            A1E = null;
                        }
                        if (obj2 != null) {
                            try {
                                arrayList = AbstractC166987dD.A1E();
                                for (Map map : (List) obj2) {
                                    String str13 = (String) AbstractC58321PtD.A0o("referenceId", "null cannot be cast to non-null type kotlin.String", map);
                                    String str14 = (String) AbstractC58321PtD.A0o("cardType", "null cannot be cast to non-null type kotlin.String", map);
                                    String str15 = (String) AbstractC58321PtD.A0o("lastFourDigits", "null cannot be cast to non-null type kotlin.String", map);
                                    String str16 = (String) AbstractC58321PtD.A0o("expirationMonth", "null cannot be cast to non-null type kotlin.String", map);
                                    String str17 = (String) AbstractC58321PtD.A0o("expirationYear", "null cannot be cast to non-null type kotlin.String", map);
                                    Object obj4 = map.get("billingAddress");
                                    C14360o3.A0C(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                                    arrayList.add(new PaymentMethod(VMX.A00((Map) obj4), str13, str14, str15, str16, str17));
                                }
                            } catch (Exception e2) {
                                AbstractC25241Le.A02("MetaCheckoutDataFormatConverter_convertPaymentMethods", e2.toString());
                                arrayList = AbstractC166987dD.A1E();
                            }
                        }
                        defaults = new Defaults(str4, str5, A1E, arrayList);
                    } else {
                        defaults = null;
                    }
                    if (C14360o3.A0K(str3, "0")) {
                        authenticationVersion = AuthenticationVersion.A04;
                    } else {
                        authenticationVersion = AuthenticationVersion.A05;
                    }
                    CheckoutOptions checkoutOptions = new CheckoutOptions(new Authentication(authenticationVersion, str2), defaults, themeOptions);
                    C14360o3.A0B(str12, 0);
                    C62455SCi c62455SCi = new C62455SCi(checkoutOptions.A02);
                    Q4k q4k = new Q4k(AbstractC166997dE.A0L(viewGroup), c62573SGy.A02);
                    viewGroup.addView(q4k);
                    q4k.requestDisallowInterceptTouchEvent(true);
                    q4k.setBackgroundColor(0);
                    C58719Q4u c58719Q4u = c62573SGy.A00;
                    c58719Q4u.A00 = q4k;
                    WebSettings settings4 = q4k.getSettings();
                    if (settings4 != null) {
                        settings4.setJavaScriptEnabled(true);
                    }
                    WebView webView = c58719Q4u.A00;
                    if (webView != null && (settings3 = webView.getSettings()) != null) {
                        settings3.setDomStorageEnabled(true);
                    }
                    WebView webView2 = c58719Q4u.A00;
                    if (webView2 != null) {
                        webView2.setWebViewClient(c58719Q4u);
                    }
                    WebView webView3 = c58719Q4u.A00;
                    if (webView3 != null) {
                        if (SVN.A00("MULTI_PROFILE")) {
                            Q9s q9s = SVN.A0S;
                            if (q9s.A01()) {
                                InterfaceC65189TfX interfaceC65189TfX = C63643Sr9.A01;
                                if (interfaceC65189TfX == null) {
                                    interfaceC65189TfX = new C63643Sr9(AbstractC62296S5r.A00.Bi8());
                                    C63643Sr9.A01 = interfaceC65189TfX;
                                }
                                C63643Sr9 c63643Sr9 = (C63643Sr9) interfaceC65189TfX;
                                if (q9s.A01()) {
                                    C63642Sr8 c63642Sr8 = new C63642Sr8((ProfileBoundaryInterface) C63081Sc3.A00(ProfileBoundaryInterface.class, c63643Sr9.A00.getOrCreateProfile("shopify_sdk_profile")));
                                    if (q9s.A01()) {
                                        AbstractC62296S5r.A00.ANX(webView3).setProfile("shopify_sdk_profile");
                                        HandlerThread A0A = MSY.A0A("shopify_sdk_clear_cookies_thread");
                                        A0A.start();
                                        CountDownLatch countDownLatch = new CountDownLatch(1);
                                        MSY.A09(A0A).post(new TPG(c63642Sr8, countDownLatch));
                                        try {
                                            try {
                                                countDownLatch.await(5L, TimeUnit.SECONDS);
                                            } catch (Exception unused) {
                                                AbstractC63399SjU abstractC63399SjU3 = c58719Q4u.A01.A01;
                                                if (abstractC63399SjU3 != null) {
                                                    abstractC63399SjU3.A0D("ShopifySDKWebviewController Unable to clear cookies");
                                                }
                                            }
                                        } finally {
                                            A0A.quitSafely();
                                        }
                                    } else {
                                        throw AbstractC166987dD.A1D("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                } else {
                                    throw AbstractC166987dD.A1D("This method is not supported by the current version of the framework and the current WebView APK");
                                }
                            } else {
                                throw AbstractC166987dD.A1D("This method is not supported by the current version of the framework and the current WebView APK");
                            }
                        } else {
                            AbstractC63399SjU abstractC63399SjU4 = c58719Q4u.A01.A01;
                            if (abstractC63399SjU4 != null) {
                                abstractC63399SjU4.A0D("ShopifySDKWebviewController Unsupported version of Android, unable to properly clear cookies");
                            }
                        }
                    }
                    WebView webView4 = c58719Q4u.A00;
                    if (webView4 != null && (settings2 = webView4.getSettings()) != null) {
                        str = settings2.getUserAgentString();
                    } else {
                        str = null;
                    }
                    c58719Q4u.A07 = str;
                    c58719Q4u.A02 = new C62454SCh(c62573SGy.A01);
                    c58719Q4u.A06 = new Object();
                    c58719Q4u.A05 = c62455SCi;
                    c58719Q4u.A04 = checkoutOptions;
                    String A0R = AnonymousClass001.A0R("CheckoutSheetProtocol/", "2024-10");
                    String str18 = c58719Q4u.A07;
                    String A0n = AbstractC166997dE.A0n();
                    C14360o3.A07(A0n);
                    InterfaceC16620sF interfaceC16620sF = c58719Q4u.A09;
                    if (str18 == null) {
                        str18 = "";
                    }
                    interfaceC16620sF.invoke(A0n, str18);
                    WebView webView5 = c58719Q4u.A00;
                    if (webView5 != null && (settings = webView5.getSettings()) != null) {
                        settings.setUserAgentString(AnonymousClass001.A0j("Mozilla/5.0 (Linux; Android 14; sdk_gphone64_arm64 Build/UE1A.230829.036.A1; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/126.0.6478.170 Mobile Safari/537.36", A0n, A0R, ' ', ' '));
                    }
                    WebView webView6 = c58719Q4u.A00;
                    if (webView6 != null) {
                        LinkedHashMap A1I = AbstractC166987dD.A1I();
                        CheckoutOptions checkoutOptions2 = c58719Q4u.A04;
                        if (checkoutOptions2 != null && (authentication = checkoutOptions2.A00) != null) {
                            c58719Q4u.A03 = authentication;
                            String A02 = AbstractC73763Sg.A03.A02(authentication, C71748X0n.A00);
                            if (c58719Q4u.A05 != null) {
                                A1I.put("Shopify-Checkout-Sheet-Protocol-Consumer", A02);
                                C62455SCi c62455SCi2 = c58719Q4u.A05;
                                if (c62455SCi2 != null) {
                                    A1I.put("Sec-CH-Prefers-Color-Scheme", AbstractC167007dF.A0h(c62455SCi2.A00.name()));
                                }
                            }
                            C14360o3.A0F("checkoutProtocolConfig");
                            throw C00O.createAndThrow();
                        }
                        webView6.loadUrl(str12, A1I);
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public C60917RbX(AbstractC61593RqH abstractC61593RqH, C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
        this.A02 = c102884kP;
        this.A01 = c6fg;
        this.A00 = abstractC61593RqH;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
    }
}
