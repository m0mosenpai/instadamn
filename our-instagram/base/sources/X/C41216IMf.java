package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.IMf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41216IMf {
    public final void A00(UserSession userSession, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        if (IBU.A03.get(str) != null) {
            IBU.A02.put(str, AbstractC31173DnH.A0g());
            C18920wW c18920wW = IBU.A00;
            if (c18920wW == null) {
                c18920wW = AbstractC12220kQ.A02(userSession);
                IBU.A00 = c18920wW;
            }
            C14360o3.A0C(c18920wW, "null cannot be cast to non-null type com.instagram.common.analytics.structuredlogger.IgTypedLogger");
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_smart_prefetch_ad_cta_disappear");
            if (A0f.isSampled()) {
                A0f.AAP("product_id", str);
                ConcurrentHashMap concurrentHashMap = IBU.A05;
                Map map = (Map) concurrentHashMap.get(str);
                String str6 = null;
                if (map != null) {
                    str2 = AbstractC166987dD.A1A("ad_id", map);
                } else {
                    str2 = null;
                }
                Map A0j = AbstractC37302Gc3.A0j(A0f, str, "ad_id", str2, concurrentHashMap);
                if (A0j != null) {
                    str3 = AbstractC166987dD.A1A("ad_tracking_token", A0j);
                } else {
                    str3 = null;
                }
                Map A0j2 = AbstractC37302Gc3.A0j(A0f, str, "ad_tracking_token", str3, concurrentHashMap);
                if (A0j2 != null) {
                    str4 = AbstractC166987dD.A1A("prior_module", A0j2);
                } else {
                    str4 = null;
                }
                Map A0j3 = AbstractC37302Gc3.A0j(A0f, str, "prior_module", str4, concurrentHashMap);
                if (A0j3 != null) {
                    str5 = AbstractC166987dD.A1A("prior_submodule", A0j3);
                } else {
                    str5 = null;
                }
                Map A0j4 = AbstractC37302Gc3.A0j(A0f, str, "prior_submodule", str5, concurrentHashMap);
                if (A0j4 != null) {
                    str6 = (String) A0j4.get(AbstractC37315GcH.A00(9, 10, 32));
                }
                AbstractC37301Gc2.A19(A0f, str6);
            }
        }
    }

    public final void A01(UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        long currentTimeMillis = System.currentTimeMillis();
        String A0j = AbstractC167017dG.A0j();
        C18920wW c18920wW = IBU.A00;
        if (c18920wW == null) {
            c18920wW = AbstractC12220kQ.A02(userSession);
            IBU.A00 = c18920wW;
        }
        C14360o3.A0C(c18920wW, "null cannot be cast to non-null type com.instagram.common.analytics.structuredlogger.IgTypedLogger");
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_smart_prefetch_ad_cta_impression");
        if (A0f.isSampled()) {
            A0f.AAP("product_id", str);
            A0f.AAP("ad_id", str3);
            A0f.AAP("ad_tracking_token", str4);
            AbstractC37300Gc1.A0n(A0f, str6);
            AbstractC37300Gc1.A0q(A0f, str7);
            AbstractC37301Gc2.A19(A0f, A0j);
        }
        IBU.A03.put(str, Long.valueOf(currentTimeMillis));
        IBU.A05.put(str, AbstractC06930Yk.A06(AbstractC166987dD.A1L("product_id", str), AbstractC166987dD.A1L("ad_id", str3), AbstractC166987dD.A1L("ad_tracking_token", str4), AbstractC166987dD.A1L("prior_module", str6), AbstractC166987dD.A1L("prior_submodule", str7), AbstractC166987dD.A1L("ad_media_id", str5), AbstractC166987dD.A1L("merchant_id", str2), AbstractC166987dD.A1L(AbstractC37315GcH.A00(9, 10, 32), A0j)));
        IBU.A02.remove(str);
        AbstractC167007dF.A0J().postDelayed(new J4Q(userSession, str), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
    }
}
