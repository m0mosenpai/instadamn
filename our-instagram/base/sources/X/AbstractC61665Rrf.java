package X;

import android.webkit.WebView;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.Rrf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61665Rrf {
    public static final Object A00(C6FW c6fw) {
        String A0d = AbstractC31177DnL.A0d(c6fw);
        int A0D = AbstractC25230BEn.A0D(c6fw.A03(1), "null cannot be cast to non-null type kotlin.Number");
        AbstractC61593RqH abstractC61593RqH = AbstractC62357S8e.A00;
        if (abstractC61593RqH != null) {
            QJl qJl = (QJl) abstractC61593RqH;
            C14360o3.A0B(A0d, 0);
            QuickPerformanceLogger quickPerformanceLogger = AbstractC63320ShT.A00;
            Integer num = qJl.A08;
            String str = qJl.A0B;
            String str2 = str;
            if (str == null) {
                str = "";
            }
            String str3 = qJl.A0A;
            AbstractC167007dF.A1D(num, 0, str3);
            Integer A02 = AbstractC63320ShT.A02(num);
            if (A02 != null) {
                QuickPerformanceLogger quickPerformanceLogger2 = AbstractC63320ShT.A00;
                if (quickPerformanceLogger2 != null) {
                    quickPerformanceLogger2.markerStart(A02.intValue());
                }
                AbstractC63320ShT.A03(A02.intValue(), str, str3, "2024-10");
            }
            AbstractC63399SjU abstractC63399SjU = qJl.A01;
            if (abstractC63399SjU != null) {
                if (str2 == null) {
                    str2 = "";
                }
                long j = qJl.A06;
                String str4 = qJl.A03;
                String A09 = AnonymousClass001.A09(A0D, "{\"line_id\":\"", A0d, "\",\"quantity\":\"", "\"}");
                String str5 = qJl.A09;
                String str6 = qJl.A02;
                AbstractC25233BEq.A0x(3, str4, A09, str5);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(abstractC63399SjU.A0C(), "client_load_metacheckoutsdk_init");
                if (A0f.isSampled()) {
                    A0f.AAP(AbstractC63082Sc5.A00(), str3);
                    AbstractC58321PtD.A1E(AbstractC63399SjU.A01(abstractC63399SjU), A0f);
                    C0Zx c0Zx = new C0Zx();
                    AbstractC63399SjU.A09(c0Zx, abstractC63399SjU, "cart_update");
                    AbstractC58322PtE.A1H(A0f, c0Zx, AbstractC25232BEp.A1F("checkout_url", AbstractC63399SjU.A04(str4), AbstractC166987dD.A1L("csp_version", "2024-10"), AbstractC166987dD.A1L("shopify_sdk_payload", A09)));
                    C0Zx c0Zx2 = new C0Zx();
                    c0Zx2.A07("seller_ids", AbstractC63399SjU.A05(j));
                    c0Zx2.A06("commerce_checkout_session_id", str6);
                    QER qer = (QER) abstractC63399SjU;
                    AbstractC63399SjU.A08(c0Zx2, qer);
                    c0Zx2.A06("iaw_session_id", str2);
                    AbstractC63399SjU.A0A(c0Zx2, abstractC63399SjU, qer.A01, str2);
                    AbstractC58323PtF.A1G(A0f, c0Zx2, str5);
                }
            }
            C58719Q4u c58719Q4u = qJl.A07.A00;
            WebView webView = c58719Q4u.A00;
            if (webView != null) {
                if (c58719Q4u.A06 == null) {
                    C14360o3.A0F("scriptBuilder");
                    throw C00O.createAndThrow();
                }
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("window.Shopify.CheckoutSheetProtocol.postMessage");
                A1C.append("('updateCart', { detail: { lineId: '");
                A1C.append(A0d);
                A1C.append("', quantity: ");
                A1C.append(A0D);
                webView.evaluateJavascript(AbstractC166997dE.A0x(" }});", A1C), null);
                return null;
            }
            return null;
        }
        return null;
    }
}
