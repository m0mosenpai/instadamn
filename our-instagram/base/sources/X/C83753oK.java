package X;

import java.util.HashMap;

/* renamed from: X.3oK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83753oK {
    public static final void A00(AbstractC12990ll abstractC12990ll, Integer num, String str, String str2, String str3, String str4, String str5, HashMap hashMap) {
        C18920wW A02 = AbstractC12220kQ.A02(abstractC12990ll);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "caa_login_client_events_ig");
        if (A00.isSampled()) {
            Integer A002 = AbstractC34030F0j.A00(abstractC12990ll, num, "CAALoginIgNativeLogger");
            C17280tP A003 = C17280tP.A4E.A00();
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("event", str);
            c0Zx.A06("event_flow", str2);
            if (str4 == null || str4.length() == 0) {
                str4 = "home_page";
            }
            c0Zx.A06(AbstractC43591JPw.A00(361), str4);
            c0Zx.A06("event_category", str3);
            c0Zx.A06(AbstractC111324zv.A00(712), AbstractC33637Etn.A00(A002));
            c0Zx.A08("extra_client_data", hashMap);
            c0Zx.A05(AbstractC111324zv.A00(2324), null);
            c0Zx.A06(AbstractC43591JPw.A00(77), str5);
            c0Zx.A06("waterfall_id", A003.A08());
            A00.AAQ(c0Zx, "core");
            A00.AAQ(new C0Zx(), "login_params");
            A00.Cht();
        }
    }

    public static final void A01(AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4) {
        A00(abstractC12990ll, C05F.A01, str, str2, str3, str4, null, null);
    }
}
