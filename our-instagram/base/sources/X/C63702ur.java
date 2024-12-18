package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;

/* renamed from: X.2ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63702ur {
    public OB2 A00;
    public final C18920wW A01;
    public final String A02;

    public C63702ur(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A02 = interfaceC11380iw.getModuleName();
        C229419w A02 = C18U.A02(userSession, 36327619368598244L);
        if (A02 != null) {
            C06090Tz A00 = C06090Tz.A00(new C06090Tz());
            A00.A01 = true;
            C06090Tz A002 = C06090Tz.A00(A00);
            A002.A03 = true;
            if (A02.AhE(A002, 36327619368598244L)) {
                this.A00 = new OB2(userSession);
            }
        }
    }

    public static final String A00(User user) {
        EnumC33402EpZ enumC33402EpZ;
        if (user == null) {
            return null;
        }
        int ordinal = user.B7L().ordinal();
        if (ordinal != 4 && ordinal != 5 && ordinal != 2) {
            if (ordinal != 3) {
                return null;
            }
            enumC33402EpZ = EnumC33402EpZ.A0A;
        } else {
            enumC33402EpZ = EnumC33402EpZ.A06;
        }
        return enumC33402EpZ.A00;
    }

    public static void A01(C63702ur c63702ur, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2) {
        C18920wW c18920wW = c63702ur.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "recommended_user_impression");
        A00.AAP("target_id", str10);
        A00.A8p("position", Integer.valueOf(i));
        A00.AAP("view_module", str11);
        A00.AAP("algorithm", str);
        A00.A8p("view_state_item_type", Integer.valueOf(i2));
        A00.AAP("container_module", str2);
        A00.AAP("follow_impression_id", str5);
        A00.A9K("follow_impression_length", l);
        A00.AAP("ranking_algorithm", str8);
        A00.AAP("social_context", str9);
        A00.AAP("insertion_context", str6);
        A00.AAP("display_format", str4);
        A00.AAP("netego_unit_id", str7);
        A00.AAP("context_type", str3);
        A00.A8p("num_facepiles", num);
        A00.AAP("topic_name", null);
        A00.AAP("nav_chain", C1QM.A00.A02.A00);
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, null);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("search_session_id", null);
        c0Zx.A06("serp_session_id", null);
        c0Zx.A06("query_text", null);
        c0Zx.A06("rank_token", null);
        A00.AAQ(c0Zx, "search_context");
        A00.A8R(null, "text_app_aysf_vertical_type");
        A00.Cht();
        OB2 ob2 = c63702ur.A00;
        if (ob2 != null) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            C19L c19l = ob2.A02;
            MBX mbx = new MBX(ob2, valueOf, str10, (InterfaceC23621Ds) null, 20);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, mbx, c19l);
        }
    }

    public static void A03(C63702ur c63702ur, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2) {
        C18920wW c18920wW = c63702ur.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "recommended_username_tapped");
        A00.AAP("target_id", str10);
        A00.A8p("position", Integer.valueOf(i));
        A00.AAP("view_module", str11);
        A00.AAP("algorithm", str);
        A00.A8p("view_state_item_type", Integer.valueOf(i2));
        A00.AAP("container_module", str2);
        A00.AAP("follow_impression_id", str5);
        A00.AAP("ranking_algorithm", str8);
        A00.AAP("netego_unit_id", str7);
        A00.A9K("follow_impression_length", null);
        A00.AAP("social_context", str9);
        A00.AAP("context_type", str3);
        A00.AAP("insertion_context", str6);
        A00.AAP("display_format", str4);
        A00.AAP("topic_name", null);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("search_session_id", null);
        c0Zx.A06("serp_session_id", null);
        c0Zx.A06("query_text", null);
        c0Zx.A06("rank_token", null);
        A00.AAQ(c0Zx, "search_context");
        A00.A8R(null, "text_app_aysf_vertical_type");
        A00.Cht();
    }

    public static void A04(C63702ur c63702ur, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2) {
        C18920wW c18920wW = c63702ur.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "recommended_username_tapped");
        A00.AAP("target_id", str10);
        A00.A8p("position", Integer.valueOf(i));
        A00.AAP("view_module", str11);
        A00.AAP("algorithm", str);
        A00.A8p("view_state_item_type", Integer.valueOf(i2));
        A00.AAP("container_module", str2);
        A00.AAP("follow_impression_id", str5);
        A00.AAP("ranking_algorithm", str8);
        A00.AAP("netego_unit_id", str7);
        A00.A9K("follow_impression_length", null);
        A00.AAP("social_context", str9);
        A00.AAP("context_type", str3);
        A00.AAP("insertion_context", str6);
        A00.AAP("display_format", str4);
        A00.AAP("topic_name", null);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("search_session_id", null);
        c0Zx.A06("serp_session_id", null);
        c0Zx.A06("query_text", null);
        c0Zx.A06("rank_token", null);
        A00.AAQ(c0Zx, "search_context");
        A00.A8R(null, "text_app_aysf_vertical_type");
        A00.Cht();
    }

    public static void A05(C63702ur c63702ur, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, int i2) {
        C18920wW c18920wW = c63702ur.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "recommended_follow_button_tapped");
        A00.AAP("target_id", str11);
        A00.A8p("position", Integer.valueOf(i));
        A00.AAP("view_module", str12);
        A00.AAP("algorithm", str);
        A00.A8p("view_state_item_type", Integer.valueOf(i2));
        A00.AAP("container_module", str2);
        A00.AAP("request_type", null);
        A00.AAP("follow_status", str5);
        A00.AAP("follow_impression_id", str6);
        A00.AAP("ranking_algorithm", str9);
        A00.AAP("social_context", str10);
        A00.AAP("insertion_context", str7);
        A00.AAP("display_format", str4);
        A00.AAP("netego_unit_id", str8);
        A00.AAP("topic_name", null);
        A00.AAP("context_type", str3);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("search_session_id", null);
        c0Zx.A06("serp_session_id", null);
        c0Zx.A06("query_text", null);
        c0Zx.A06("rank_token", null);
        A00.AAQ(c0Zx, "search_context");
        A00.A8R(null, "text_app_aysf_vertical_type");
        A00.Cht();
    }

    public static void A06(C63702ur c63702ur, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, int i2) {
        C18920wW c18920wW = c63702ur.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "recommended_follow_button_tapped");
        A00.AAP("target_id", str12);
        A00.A8p("position", Integer.valueOf(i));
        A00.AAP("view_module", str13);
        A00.AAP("algorithm", str);
        A00.A8p("view_state_item_type", Integer.valueOf(i2));
        A00.AAP("container_module", str2);
        A00.AAP("request_type", str10);
        A00.AAP("follow_status", str5);
        A00.AAP("follow_impression_id", str6);
        A00.AAP("ranking_algorithm", str9);
        A00.AAP("social_context", str11);
        A00.AAP("insertion_context", str7);
        A00.AAP("display_format", str4);
        A00.AAP("netego_unit_id", str8);
        A00.AAP("topic_name", null);
        A00.AAP("context_type", str3);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("search_session_id", null);
        c0Zx.A06("serp_session_id", null);
        c0Zx.A06("query_text", null);
        c0Zx.A06("rank_token", null);
        A00.AAQ(c0Zx, "search_context");
        A00.A8R(null, "text_app_aysf_vertical_type");
        A00.Cht();
    }

    public static void A02(C63702ur c63702ur, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        C18920wW c18920wW = c63702ur.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "recommended_user_dismissed");
        A00.AAP("target_id", str4);
        A00.A8p("position", Integer.valueOf(i));
        A00.AAP("view_module", str5);
        A00.AAP("algorithm", "");
        A00.A8p("view_state_item_type", Integer.valueOf(i2));
        A00.AAP("container_module", str);
        A00.AAP("follow_impression_id", "");
        A00.AAP("ranking_algorithm", null);
        A00.AAP("social_context", null);
        A00.AAP("insertion_context", str2);
        A00.AAP("display_format", "preview");
        A00.AAP("netego_unit_id", str3);
        A00.AAP("topic_name", null);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("search_session_id", null);
        c0Zx.A06("serp_session_id", null);
        c0Zx.A06("query_text", null);
        c0Zx.A06("rank_token", null);
        A00.AAQ(c0Zx, "search_context");
        A00.A8R(null, "text_app_aysf_vertical_type");
        A00.Cht();
    }

    public final void A07(C6PH c6ph) {
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "recommended_user_dismissed");
        A00.AAP("target_id", c6ph.A0E);
        A00.A8p("position", Integer.valueOf(c6ph.A00));
        A00.AAP("view_module", c6ph.A0F);
        A00.AAP("algorithm", c6ph.A04);
        A00.A8p("view_state_item_type", -1);
        A00.AAP("container_module", c6ph.A05);
        A00.AAP("follow_impression_id", c6ph.A08);
        A00.AAP("ranking_algorithm", c6ph.A0A);
        A00.AAP("social_context", c6ph.A0C);
        A00.AAP("insertion_context", null);
        A00.AAP("display_format", null);
        A00.AAP("netego_unit_id", c6ph.A09);
        A00.AAP("topic_name", c6ph.A0D);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("search_session_id", null);
        c0Zx.A06("serp_session_id", null);
        c0Zx.A06("query_text", null);
        c0Zx.A06("rank_token", null);
        A00.AAQ(c0Zx, "search_context");
        A00.A8R(null, "text_app_aysf_vertical_type");
        A00.Cht();
    }

    public final void A08(C6PH c6ph) {
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "recommended_follow_button_tapped");
        A00.AAP("target_id", c6ph.A0E);
        A00.A8p("position", Integer.valueOf(c6ph.A00));
        A00.AAP("view_module", c6ph.A0F);
        A00.AAP("algorithm", c6ph.A04);
        A00.A8p("view_state_item_type", -1);
        A00.AAP("container_module", c6ph.A05);
        A00.AAP("request_type", c6ph.A0B);
        A00.AAP("follow_status", c6ph.A07);
        A00.AAP("follow_impression_id", c6ph.A08);
        A00.AAP("ranking_algorithm", c6ph.A0A);
        A00.AAP("social_context", c6ph.A0C);
        A00.AAP("insertion_context", null);
        A00.AAP("display_format", null);
        A00.AAP("netego_unit_id", c6ph.A09);
        A00.AAP("topic_name", c6ph.A0D);
        A00.AAP("context_type", null);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("search_session_id", null);
        c0Zx.A06("serp_session_id", null);
        c0Zx.A06("query_text", null);
        c0Zx.A06("rank_token", null);
        A00.AAQ(c0Zx, "search_context");
        A00.A8R(null, "text_app_aysf_vertical_type");
        A00.Cht();
    }

    public final void A09(C6PH c6ph) {
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "recommended_user_impression");
        String str = c6ph.A0E;
        A00.AAP("target_id", str);
        A00.A8p("position", Integer.valueOf(c6ph.A00));
        A00.AAP("view_module", c6ph.A0F);
        A00.AAP("algorithm", c6ph.A04);
        A00.A8p("view_state_item_type", -1);
        A00.AAP("container_module", c6ph.A05);
        A00.AAP("follow_impression_id", c6ph.A08);
        A00.A9K("follow_impression_length", c6ph.A03);
        A00.AAP("ranking_algorithm", c6ph.A0A);
        A00.AAP("social_context", c6ph.A0C);
        A00.AAP("insertion_context", null);
        A00.AAP("display_format", null);
        A00.AAP("netego_unit_id", c6ph.A09);
        A00.AAP("context_type", null);
        A00.A8p("num_facepiles", c6ph.A02);
        A00.AAP("topic_name", c6ph.A0D);
        A00.AAP("nav_chain", C1QM.A00.A02.A00);
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c6ph.A06);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("search_session_id", null);
        c0Zx.A06("serp_session_id", null);
        c0Zx.A06("query_text", null);
        c0Zx.A06("rank_token", null);
        A00.AAQ(c0Zx, "search_context");
        A00.A8R(null, "text_app_aysf_vertical_type");
        A00.Cht();
        OB2 ob2 = this.A00;
        if (ob2 != null) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            C19L c19l = ob2.A02;
            MBX mbx = new MBX(ob2, valueOf, str, (InterfaceC23621Ds) null, 20);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, mbx, c19l);
        }
    }

    public final void A0A(C6PH c6ph) {
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(1210));
        A00.AAP("view_module", c6ph.A0F);
        A00.A8p("view_state_item_type", -1);
        A00.AAP("ranking_algorithm", c6ph.A0A);
        A00.AAP("netego_unit_id", c6ph.A09);
        A00.AAP("module", this.A02);
        A00.A8R(null, "text_app_aysf_vertical_type");
        A00.Cht();
    }

    public final void A0B(C6PH c6ph) {
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "recommended_username_tapped");
        A00.AAP("target_id", c6ph.A0E);
        A00.A8p("position", Integer.valueOf(c6ph.A00));
        A00.AAP("view_module", c6ph.A0F);
        A00.AAP("algorithm", c6ph.A04);
        A00.A8p("view_state_item_type", -1);
        A00.AAP("container_module", c6ph.A05);
        A00.AAP("follow_impression_id", c6ph.A08);
        A00.AAP("ranking_algorithm", c6ph.A0A);
        A00.AAP("netego_unit_id", c6ph.A09);
        A00.A9K("follow_impression_length", c6ph.A03);
        A00.AAP("social_context", c6ph.A0C);
        A00.AAP("context_type", null);
        A00.AAP("insertion_context", null);
        A00.AAP("display_format", null);
        A00.AAP("topic_name", c6ph.A0D);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("search_session_id", null);
        c0Zx.A06("serp_session_id", null);
        c0Zx.A06("query_text", null);
        c0Zx.A06("rank_token", null);
        A00.AAQ(c0Zx, "search_context");
        A00.A8R(null, "text_app_aysf_vertical_type");
        A00.Cht();
    }
}
