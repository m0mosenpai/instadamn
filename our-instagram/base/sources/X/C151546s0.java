package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6s0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151546s0 {
    public static final C151546s0 A00 = new Object();

    public static final void A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Boolean bool, String str) {
        C14360o3.A0B(userSession, 0);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "edit_link_menu_remove_link_clicked");
        if (A002.isSampled()) {
            A002.A7v("is_primary", bool);
            A002.AAP("link_type", str);
            String str2 = userSession.userId;
            C14360o3.A0B(str2, 0);
            A002.A9K("userid", AbstractC003100w.A0k(10, str2));
            A002.Cht();
        }
    }

    public static final void A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "fb_show_profile_dialog_add_clicked");
        if (A002.isSampled()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("flow", str);
            A002.A9M("extra_data_map", linkedHashMap);
            A002.Cht();
        }
    }

    public static final void A05(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "fb_show_profile_dialog_cancel_clicked");
        if (A002.isSampled()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("flow", str);
            A002.A9M("extra_data_map", linkedHashMap);
            A002.Cht();
        }
    }

    public final void A08(Context context, EnumC31499Dsj enumC31499Dsj, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "add_facebook_banner_to_featured");
        if (A002.isSampled()) {
            A002.A8R(enumC31499Dsj, "link_type");
            A002.A9M("extra_data_map", A00(context, userSession, null));
            A002.Cht();
        }
    }

    public final void A09(Context context, EnumC31499Dsj enumC31499Dsj, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "remove_facebook_banner_to_featured");
        if (A002.isSampled()) {
            A002.A8R(enumC31499Dsj, "link_type");
            A002.A9M("extra_data_map", A00(context, userSession, null));
            A002.Cht();
        }
    }

    public final void A0D(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Boolean bool, String str, Map map) {
        Long l;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "profile_link_menu_open");
        if (A002.isSampled()) {
            if (str != null) {
                l = AbstractC003100w.A0k(10, str);
            } else {
                l = null;
            }
            A002.A9K("profile_owner_id", l);
            A002.A7v("is_enhanced", Boolean.valueOf(bool.equals(true)));
            A002.A9M("extra_data_map", map);
            A002.Cht();
        }
        if (bool.equals(true)) {
            A07(interfaceC11380iw, userSession, "viewer", "click", "ig_profile", "bio_links");
        }
    }

    public final void A0E(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(userSession, 0);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "edit_link_existing_link_clicked");
        if (A002.isSampled()) {
            A002.A7v("is_primary", Boolean.valueOf(z));
            A002.AAP("link_type", str);
            A002.A9K("link_index", Long.valueOf(i));
            A002.A7v("is_enhanced", Boolean.valueOf(z2));
            A002.A7v("is_pinned", Boolean.valueOf(z3));
            A002.Cht();
        }
        if (z2) {
            A07(interfaceC11380iw, userSession, "subscriber", "click", "ig_profile_edit_link_list_page", MSV.A00(30));
        }
    }

    public final void A0F(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, boolean z) {
        C14360o3.A0B(userSession, 0);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "edit_link_add_link_clicked");
        if (A002.isSampled()) {
            A002.AAP("link_type", str);
            A002.A7v("is_enhanced", Boolean.valueOf(z));
            A002.Cht();
        }
        if (z) {
            A07(interfaceC11380iw, userSession, "subscriber", "click", "ig_profile_edit_link_list_page", MSV.A00(376));
        }
    }

    public static final Map A00(Context context, UserSession userSession, Map map) {
        if (context != null) {
            if (map != null) {
                map = new LinkedHashMap(map);
            } else {
                map = new LinkedHashMap();
            }
            boolean A0B = AbstractC14490oL.A0B(context);
            String str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            Object obj = "0";
            if (A0B) {
                obj = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            map.put("is_fb_app_installed", obj);
            if (!C180377zR.A08(userSession)) {
                str = "0";
            }
            map.put("is_fb_linked", str);
        }
        return map;
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "edit_link_cancel_clicked");
        if (A002.isSampled()) {
            A002.AAP("link_type", "external");
            A002.Cht();
        }
    }

    public static final void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "edit_link_done_clicked");
        if (A002.isSampled()) {
            A002.AAP("link_type", "external");
            A002.Cht();
        }
    }

    public static final void A07(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4) {
        long j;
        String str5 = userSession.userId;
        C14360o3.A0B(str5, 0);
        Long A0k = AbstractC003100w.A0k(10, str5);
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "ig_nme_benefits");
        if (A002.isSampled()) {
            A002.AAP("event_type", str2);
            A002.AAP("benefit_type", "ENHANCED_LINK_SHEET");
            A002.AAP("subject_type", str);
            A002.AAP("object_type", str4);
            A002.A9K("pbs_owner_id", Long.valueOf(j));
            A002.AAP("surface", str3);
            A002.Cht();
        }
    }

    public final void A0A(Context context, EnumC31499Dsj enumC31499Dsj, UserSession userSession, String str, boolean z, boolean z2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        Object obj = "0";
        if (z) {
            obj = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        linkedHashMap.put("target_has_hardlink_info", obj);
        if (!z2) {
            str2 = "0";
        }
        linkedHashMap.put("is_from_banners", str2);
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A002 = A02.A00(A02.A00, "facebook_link_impression");
        if (A002.isSampled()) {
            A002.A9K("profile_owner_id", AbstractC003100w.A0k(10, str));
            A002.A8R(enumC31499Dsj, "link_type");
            A002.A9M("extra_data_map", A00(context, userSession, linkedHashMap));
            A002.Cht();
        }
    }

    public static final void A06(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        Long A0k;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "profile_link_viewed");
        if (A002.isSampled() && (A0k = AbstractC003100w.A0k(10, str)) != null) {
            A002.A9K("profile_owner_id", A0k);
            A002.Cht();
        }
    }

    public final void A0B(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, Map map) {
        Long l;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "profile_link_clicked");
        if (A002.isSampled()) {
            A002.AAP("link_type", str);
            String str3 = userSession.userId;
            C14360o3.A0B(str3, 0);
            A002.A9K("userid", AbstractC003100w.A0k(10, str3));
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A002.A9K("profile_owner_id", l);
            A002.A9M("extra_data_map", A00(context, userSession, map));
            A002.Cht();
        }
    }

    public final void A0C(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, Map map) {
        Long l;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "profile_link_menu_clicked");
        if (A002.isSampled()) {
            A002.AAP("link_type", str);
            String str3 = userSession.userId;
            C14360o3.A0B(str3, 0);
            A002.A9K("userid", AbstractC003100w.A0k(10, str3));
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A002.A9K("profile_owner_id", l);
            A002.A9M("extra_data_map", A00(context, userSession, map));
            A002.Cht();
        }
    }
}
