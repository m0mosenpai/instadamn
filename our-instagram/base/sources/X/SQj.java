package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class SQj {
    public static void A00(InterfaceC02550Ad interfaceC02550Ad, Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        long j;
        Long A0j;
        HashMap A11 = AbstractC31174DnI.A11(num, 4);
        A11.put("is_1P", String.valueOf(z));
        A11.put("is_3P", String.valueOf(z2));
        A11.put("bwp_type", AbstractC61780Rta.A00(num));
        A11.put("is_organic", String.valueOf(z3));
        if (str2 == null) {
            str2 = "";
        }
        A11.put("media_id", str2);
        if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        A01(interfaceC02550Ad, "PRE_CLICK_AD_PROCESSING", null, A11, j);
    }

    public static final void A01(InterfaceC02550Ad interfaceC02550Ad, String str, String str2, Map map, long j) {
        LinkedHashMap A1I;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C14360o3.A0B(str, 1);
        if (map != null) {
            A1I = new LinkedHashMap(map);
        } else {
            A1I = AbstractC166987dD.A1I();
        }
        InterfaceC02590Ai A0H = MSY.A0H(interfaceC02550Ad, "preferred_businesses_iab_event");
        if (A0H.isSampled()) {
            RiK riK = null;
            r11 = null;
            String str8 = null;
            if (str.equals("PRE_CLICK_AD_PROCESSING")) {
                if (map != null) {
                    Object obj = map.get("bwp_type");
                    if (C14360o3.A0K(obj, "CUSTOM_IAB_FOR_1P")) {
                        str8 = "BUY_WITH_PRIME_1P";
                    } else if (C14360o3.A0K(obj, "CUSTOM_IAB_FOR_DTC")) {
                        str8 = "BUY_WITH_PRIME_3P";
                    }
                    A1I.remove("bwp_type");
                }
                A0H.A8R(RiJ.valueOf(str), "event");
                AbstractC37301Gc2.A0z(A0H, j);
                A0H.A9M("extra_info", A1I);
                A0H.AAP("product_experience", str8);
            } else {
                C63217SfN c63217SfN = C63217SfN.A06;
                if (c63217SfN == null) {
                    return;
                }
                long j2 = c63217SfN.A04.A00;
                QJ0 qj0 = c63217SfN.A01;
                String str9 = qj0.A01;
                Integer num = (Integer) qj0.A00;
                if (map != null) {
                    str4 = AbstractC166987dD.A1A("pageLoadSource", map);
                    str5 = AbstractC166987dD.A1A("pageCloseReason", map);
                    str3 = AbstractC166987dD.A1A("messageCode", map);
                    A1I.remove("pageLoadSource");
                    A1I.remove("pageCloseReason");
                    A1I.remove("messageCode");
                } else {
                    str3 = null;
                    str4 = null;
                    str5 = null;
                }
                C62524SFa c62524SFa = c63217SfN.A03;
                if (c62524SFa.A02 == null) {
                    str6 = "unauthenticated";
                } else if (c62524SFa.A00 * 1000 > System.currentTimeMillis()) {
                    str6 = "authenticated_active";
                } else {
                    str6 = "authenticated_expired";
                }
                A0H.A8R(RiJ.valueOf(str), "event");
                A0H.AAP("iab_session_id", str2);
                AbstractC37301Gc2.A0z(A0H, j);
                A0H.AAP("user_authentication_state", str6);
                A0H.A7v("is_api_key_cookie_present", Boolean.valueOf(AbstractC167007dF.A1W(str9)));
                A0H.A9K("api_key_cookie_expiration_time", Long.valueOf(j2));
                A0H.AAP("page_load_source", str4);
                A0H.AAP("page_close_reason", str5);
                A0H.A9M("extra_info", A1I);
                if (str3 != null) {
                    riK = RiK.valueOf(str3);
                }
                A0H.A8R(riK, "js_message_code");
                String A00 = AbstractC61780Rta.A00(num);
                if (C14360o3.A0K(A00, "CUSTOM_IAB_FOR_1P")) {
                    str7 = "BUY_WITH_PRIME_1P";
                } else if (C14360o3.A0K(A00, "CUSTOM_IAB_FOR_DTC")) {
                    str7 = "BUY_WITH_PRIME_3P";
                } else {
                    str7 = null;
                }
                A0H.AAP("product_experience", str7);
            }
            A0H.Cht();
        }
    }
}
