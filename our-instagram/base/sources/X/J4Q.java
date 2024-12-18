package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class J4Q implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public J4Q(UserSession userSession, String str) {
        this.A01 = str;
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        String str3;
        String str4;
        ConcurrentHashMap concurrentHashMap = IBU.A03;
        String str5 = this.A01;
        if (concurrentHashMap.get(str5) != null && IBU.A02.get(str5) == null) {
            ConcurrentHashMap concurrentHashMap2 = IBU.A04;
            if (concurrentHashMap2.get(str5) == null) {
                UserSession userSession = this.A00;
                concurrentHashMap2.put(str5, AbstractC31173DnH.A0g());
                C18920wW c18920wW = IBU.A00;
                if (c18920wW == null) {
                    c18920wW = AbstractC12220kQ.A02(userSession);
                    IBU.A00 = c18920wW;
                }
                C14360o3.A0C(c18920wW, "null cannot be cast to non-null type com.instagram.common.analytics.structuredlogger.IgTypedLogger");
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_smart_prefetch_prefetch_triggered");
                if (A0f.isSampled()) {
                    A0f.AAP("product_id", str5);
                    ConcurrentHashMap concurrentHashMap3 = IBU.A05;
                    Map map = (Map) concurrentHashMap3.get(str5);
                    String str6 = null;
                    if (map != null) {
                        str = AbstractC166987dD.A1A("ad_id", map);
                    } else {
                        str = null;
                    }
                    Map A0j = AbstractC37302Gc3.A0j(A0f, str5, "ad_id", str, concurrentHashMap3);
                    if (A0j != null) {
                        str2 = AbstractC166987dD.A1A("ad_tracking_token", A0j);
                    } else {
                        str2 = null;
                    }
                    Map A0j2 = AbstractC37302Gc3.A0j(A0f, str5, "ad_tracking_token", str2, concurrentHashMap3);
                    if (A0j2 != null) {
                        str3 = AbstractC166987dD.A1A("prior_module", A0j2);
                    } else {
                        str3 = null;
                    }
                    Map A0j3 = AbstractC37302Gc3.A0j(A0f, str5, "prior_module", str3, concurrentHashMap3);
                    if (A0j3 != null) {
                        str4 = AbstractC166987dD.A1A("prior_submodule", A0j3);
                    } else {
                        str4 = null;
                    }
                    Map A0j4 = AbstractC37302Gc3.A0j(A0f, str5, "prior_submodule", str4, concurrentHashMap3);
                    if (A0j4 != null) {
                        str6 = (String) A0j4.get(AbstractC37315GcH.A00(9, 10, 32));
                    }
                    AbstractC37301Gc2.A19(A0f, str6);
                }
            }
        }
    }
}
