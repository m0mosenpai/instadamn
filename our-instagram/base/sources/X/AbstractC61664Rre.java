package X;

import android.webkit.WebView;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.Rre, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61664Rre {
    public static final Object A00(C6FW c6fw) {
        String str;
        String str2;
        AbstractC61593RqH abstractC61593RqH = AbstractC62357S8e.A00;
        C102884kP c102884kP = (C102884kP) MSW.A10(c6fw, 0);
        if (c102884kP != null) {
            str = c102884kP.A0E();
        } else {
            str = null;
        }
        if (abstractC61593RqH != null) {
            QJl qJl = (QJl) abstractC61593RqH;
            QuickPerformanceLogger quickPerformanceLogger = AbstractC63320ShT.A00;
            Integer num = qJl.A08;
            String str3 = qJl.A0B;
            String str4 = str3;
            if (str3 == null) {
                str3 = "";
            }
            String str5 = qJl.A0A;
            AbstractC167007dF.A1D(num, 0, str5);
            Integer A01 = AbstractC63320ShT.A01(num);
            if (A01 != null) {
                QuickPerformanceLogger quickPerformanceLogger2 = AbstractC63320ShT.A00;
                if (quickPerformanceLogger2 != null) {
                    quickPerformanceLogger2.markerStart(A01.intValue());
                }
                AbstractC63320ShT.A03(A01.intValue(), str3, str5, "2024-10");
            }
            if (str == null) {
                str2 = "false";
            } else {
                str2 = "true";
            }
            AbstractC63399SjU abstractC63399SjU = qJl.A01;
            if (abstractC63399SjU != null) {
                String A0g = AnonymousClass001.A0g("{\"token_exists\":\"", str2, "\"}");
                if (str4 == null) {
                    str4 = "";
                }
                long j = qJl.A06;
                String str6 = qJl.A03;
                String str7 = qJl.A09;
                String str8 = qJl.A02;
                AbstractC25233BEq.A0x(0, A0g, str6, str7);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(abstractC63399SjU.A0C(), "client_load_metacheckoutsdk_init");
                if (A0f.isSampled()) {
                    A0f.AAP(AbstractC63082Sc5.A00(), str5);
                    A0f.A8R(AbstractC63399SjU.A01(abstractC63399SjU), "product_type");
                    A0f.A8R(EnumC31203Dnm.ANDROID, "platform");
                    A0f.A9K("actual_event_time", Long.valueOf(AbstractC31177DnL.A06()));
                    C0Zx c0Zx = new C0Zx();
                    AbstractC63399SjU.A09(c0Zx, abstractC63399SjU, "complete_checkout");
                    AbstractC58322PtE.A1H(A0f, c0Zx, AbstractC25232BEp.A1F("shopify_sdk_payload", A0g, AbstractC63399SjU.A06(str6), AbstractC166987dD.A1L("csp_version", "2024-10")));
                    C0Zx c0Zx2 = new C0Zx();
                    c0Zx2.A07("seller_ids", AbstractC63399SjU.A05(j));
                    c0Zx2.A06("commerce_checkout_session_id", str8);
                    c0Zx2.A06("external_session_id", AbstractC63399SjU.A03(abstractC63399SjU, str4));
                    c0Zx2.A06("iaw_session_id", str4);
                    AbstractC58323PtF.A1G(A0f, c0Zx2, str7);
                }
            }
            C58719Q4u c58719Q4u = qJl.A07.A00;
            if (str != null) {
                WebView webView = c58719Q4u.A00;
                if (webView != null) {
                    if (c58719Q4u.A06 != null) {
                        webView.evaluateJavascript(AnonymousClass001.A0u("window.Shopify.CheckoutSheetProtocol.postMessage", "('progress', { detail: { sessionId: '", str, "' }});"), null);
                    }
                    C14360o3.A0F("scriptBuilder");
                    throw C00O.createAndThrow();
                }
            } else {
                WebView webView2 = c58719Q4u.A00;
                if (webView2 != null) {
                    if (c58719Q4u.A06 != null) {
                        webView2.evaluateJavascript(AnonymousClass001.A0R("window.Shopify.CheckoutSheetProtocol.postMessage", "('progress');"), null);
                        return null;
                    }
                    C14360o3.A0F("scriptBuilder");
                    throw C00O.createAndThrow();
                }
            }
        }
        return null;
    }
}
