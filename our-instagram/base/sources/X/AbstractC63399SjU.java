package X;

import com.facebook.proxygen.TraceFieldType;
import com.google.gson.Gson;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.SjU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63399SjU {
    public String A00;
    public final Gson A01 = new Gson();

    public static void A07(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx, AbstractC63399SjU abstractC63399SjU, String str, String str2) {
        QER qer = (QER) abstractC63399SjU;
        c0Zx.A01(qer.A00, "ui_mode");
        c0Zx.A06("navigation_chain", qer.A01);
        c0Zx.A06("external_session_id", A03(abstractC63399SjU, str));
        c0Zx.A05("ad_id", AbstractC003100w.A0k(10, str2));
        interfaceC02590Ai.AAQ(c0Zx, "custom_fields");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0iw, java.lang.Object] */
    public final C18920wW A0C() {
        return AbstractC12220kQ.A01(new Object(), ((QER) this).A03);
    }

    public static final C2O5 A01(AbstractC63399SjU abstractC63399SjU) {
        try {
            return C2O5.valueOf(AbstractC166997dE.A10(Locale.ROOT, abstractC63399SjU.A00));
        } catch (Exception unused) {
            AbstractC25241Le.A02("CheckoutShopifySDKLogger", AnonymousClass001.A0R("tryCastPaymentType with invalid paymentType: ", abstractC63399SjU.A00));
            return C2O5.A0K;
        }
    }

    public static final String A02(AbstractC63399SjU abstractC63399SjU) {
        if (AbstractC31174DnI.A1a(C2O5.A0G, abstractC63399SjU.A00)) {
            return "lite_checkout";
        }
        return "checkout";
    }

    public static final String A03(AbstractC63399SjU abstractC63399SjU, String str) {
        if (AbstractC31174DnI.A1a(C2O5.A0G, abstractC63399SjU.A00)) {
            str = ((QER) abstractC63399SjU).A02;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Ml, java.lang.Object] */
    public static final String A04(String str) {
        String F7g = new Object().A03(AbstractC08820cl.A03(str), C04700Mm.A04).F7g();
        C14360o3.A07(F7g);
        return F7g;
    }

    public static final List A05(long j) {
        if (j == 0) {
            return null;
        }
        return AbstractC166987dD.A1J(Long.valueOf(j));
    }

    public static void A08(C0Zx c0Zx, QER qer) {
        c0Zx.A01(qer.A00, "ui_mode");
    }

    public static void A0A(C0Zx c0Zx, AbstractC63399SjU abstractC63399SjU, String str, String str2) {
        c0Zx.A06("navigation_chain", str);
        c0Zx.A06("external_session_id", A03(abstractC63399SjU, str2));
    }

    public final void A0D(String str) {
        C14360o3.A0B(str, 0);
        C18950wb.A01.AEp(AnonymousClass001.A0g(str, " - cspVersion: ", "2024-10"), 37366537).report();
    }

    public final void A0E(String str, long j, String str2, String str3, String str4, String str5, String str6) {
        AbstractC25233BEq.A0w(1, str2, str3, str4);
        C14360o3.A0B(str5, 5);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A0C(), "client_load_metacheckoutsdk_fail");
        if (A0f.isSampled()) {
            A0f.AAP(AbstractC58347Ptn.A00(9, 10, 87), str2);
            AbstractC58321PtD.A1E(A01(this), A0f);
            C0Zx c0Zx = new C0Zx();
            A09(c0Zx, this, "on_error");
            AbstractC58322PtE.A1H(A0f, c0Zx, AbstractC25232BEp.A1F("shopify_sdk_payload", str4, AbstractC166987dD.A1L("csp_version", "2024-10"), A06(str3)));
            A0f.AAP("error_message", str4);
            C0Zx c0Zx2 = new C0Zx();
            A0B(c0Zx2, str6, str, j);
            QER qer = (QER) this;
            A08(c0Zx2, qer);
            A0A(c0Zx2, this, qer.A01, str);
            AbstractC58323PtF.A1G(A0f, c0Zx2, str5);
        }
    }

    public AbstractC63399SjU(String str) {
        this.A00 = str;
    }

    public static InterfaceC02590Ai A00(AbstractC63399SjU abstractC63399SjU) {
        C18920wW A0C = abstractC63399SjU.A0C();
        return A0C.A00(A0C.A00, "client_load_metacheckoutsdk_success");
    }

    public static C09530e4 A06(String str) {
        return new C09530e4("checkout_url", A04(str));
    }

    public static void A09(C0Zx c0Zx, AbstractC63399SjU abstractC63399SjU, String str) {
        c0Zx.A06("target_name", str);
        c0Zx.A06("view_name", A02(abstractC63399SjU));
    }

    public static void A0B(C0Zx c0Zx, String str, String str2, long j) {
        c0Zx.A07("seller_ids", A05(j));
        c0Zx.A06("commerce_checkout_session_id", str);
        c0Zx.A06("iaw_session_id", str2);
    }

    public final void A0F(String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        RiN riN;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A0C(), "shopify_onsite_sdk_webview_curl_performed");
        if (A0f.isSampled()) {
            try {
                RiP valueOf = RiP.valueOf(str4);
                if (str3 != null && str3.length() != 0) {
                    riN = RiN.valueOf(AbstractC166997dE.A10(Locale.ROOT, str3));
                } else {
                    riN = RiN.CONNECT;
                }
                A0f.A8R(riN, "api_request_method");
                A0f.AAP("api_endpoint", str2);
                if (str5 == null) {
                    str5 = "";
                }
                A0f.AAP("request_body", str5);
                if (str == null) {
                    str = "";
                }
                A0f.AAP("checkout_session_id", str);
                C09530e4 A1L = AbstractC166987dD.A1L("request_api_type", str4);
                C09530e4 A1L2 = AbstractC166987dD.A1L("headers", String.valueOf(map));
                String str7 = str6;
                if (str6 == null) {
                    str7 = "";
                }
                A0f.A9M("extra_data", AbstractC25232BEp.A1F(TraceFieldType.StartTime, str7, A1L, A1L2));
                if (str6 == null) {
                    str6 = "";
                }
                A0f.AAP("request_time_str", str6);
                if (map == null) {
                    map = AbstractC06930Yk.A0E();
                }
                A0f.A9M("headers", map);
                A0f.A8R(valueOf, "request_type");
                A0f.Cht();
            } catch (Exception e) {
                A0D(AbstractC167017dG.A0n(e, "CheckoutShopifySDKLogger unable to convert requestApiType to ShopifyOnsiteSDKWebviewRequestType ", AbstractC166987dD.A1C()));
            }
        }
    }
}
