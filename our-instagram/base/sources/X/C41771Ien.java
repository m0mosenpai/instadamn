package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Ien, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41771Ien {
    public static final C41771Ien A00 = new Object();

    public static final void A05(InterfaceC11380iw interfaceC11380iw, C19260xA c19260xA, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z) {
        String str8;
        String str9;
        AbstractC167007dF.A1F(userSession, 0, str);
        String id = c38321qM.getId();
        if (id != null) {
            EnumC40111tc BRp = c38321qM.BRp();
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                str9 = A2E.getId();
            } else {
                str9 = null;
            }
            A02(interfaceC11380iw, c19260xA, userSession, null, BRp, id, str9, str, str4, c38321qM.A0C.B3P(), c38321qM.A0C.getMezqlToken(), c38321qM.A0C.getConnectionId(), AbstractC37300Gc1.A0S(c38321qM), str2, str7, i);
        }
        String id2 = c38321qM.getId();
        EnumC40111tc BRp2 = c38321qM.BRp();
        User A2E2 = c38321qM.A2E(userSession);
        if (A2E2 != null) {
            str8 = A2E2.getId();
        } else {
            str8 = null;
        }
        A08(interfaceC11380iw, userSession, c75113Zb, BRp2, null, "explore_see_less_undo", id2, str8, str, str4, c38321qM.A0C.B3P(), AbstractC25226BEj.A1G(c38321qM), AbstractC37300Gc1.A0S(c38321qM), str2, str3, c38321qM.A0C.Bl8(), null, str5, str6, null, i, z, false);
    }

    public static final void A07(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, boolean z) {
        AbstractC167007dF.A1F(c38321qM, 2, str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_top_of_funnel_control_impression");
        if (A0f.isSampled()) {
            AbstractC37302Gc3.A0x(A0f, c38321qM);
            A0f.A7v(AbstractC43591JPw.A00(1120), Boolean.valueOf(z));
            AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
            A0f.AAP("event_source", str);
            AbstractC25233BEq.A17(A0f, "ranking_info_token", AbstractC25226BEj.A1G(c38321qM));
            A0f.Cht();
        }
    }

    public static final void A03(InterfaceC11380iw interfaceC11380iw, C19260xA c19260xA, UserSession userSession, C38321qM c38321qM, EnumC75193Zm enumC75193Zm, C75113Zb c75113Zb, String str, String str2, String str3, int i, boolean z) {
        String str4;
        String str5;
        C14360o3.A0B(str, 4);
        String id = c38321qM.getId();
        if (id != null) {
            EnumC40111tc BRp = c38321qM.BRp();
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                str5 = A2E.getId();
            } else {
                str5 = null;
            }
            A02(interfaceC11380iw, c19260xA, userSession, null, BRp, id, str5, str, str2, c38321qM.A0C.B3P(), c38321qM.A0C.getMezqlToken(), c38321qM.A0C.getConnectionId(), AbstractC37300Gc1.A0S(c38321qM), A01(enumC75193Zm), str3, i);
        }
        String id2 = c38321qM.getId();
        EnumC40111tc BRp2 = c38321qM.BRp();
        User A2E2 = c38321qM.A2E(userSession);
        if (A2E2 != null) {
            str4 = A2E2.getId();
        } else {
            str4 = null;
        }
        A08(interfaceC11380iw, userSession, c75113Zb, BRp2, null, "explore_see_less_undo", id2, str4, str, str2, c38321qM.A0C.B3P(), AbstractC25226BEj.A1G(c38321qM), AbstractC37300Gc1.A0S(c38321qM), A01(enumC75193Zm), null, c38321qM.A0C.Bl8(), null, null, null, null, i, z, false);
    }

    public static final void A04(InterfaceC11380iw interfaceC11380iw, C19260xA c19260xA, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, Long l, String str, String str2, String str3, String str4, String str5, List list, int i, boolean z) {
        String str6;
        String str7;
        AbstractC167007dF.A1D(userSession, 0, c38321qM);
        String id = c38321qM.getId();
        if (id != null) {
            EnumC40111tc BRp = c38321qM.BRp();
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                str7 = A2E.getId();
            } else {
                str7 = null;
            }
            A06(interfaceC11380iw, c19260xA, userSession, BRp, id, str7, str, str2, c38321qM.A0C.B3P(), c38321qM.A0C.getMezqlToken(), c38321qM.A0C.getConnectionId(), AbstractC37300Gc1.A0S(c38321qM), str3, str5, i);
        }
        String id2 = c38321qM.getId();
        EnumC40111tc BRp2 = c38321qM.BRp();
        User A2E2 = c38321qM.A2E(userSession);
        if (A2E2 != null) {
            str6 = A2E2.getId();
        } else {
            str6 = null;
        }
        A08(interfaceC11380iw, userSession, c75113Zb, BRp2, l, "explore_see_less", id2, str6, str, str2, c38321qM.A0C.B3P(), str5, AbstractC37300Gc1.A0S(c38321qM), str3, str4, c38321qM.A0C.Bl8(), null, null, null, list, i, z, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Integer A00(String str) {
        int i;
        switch (str.hashCode()) {
            case -1748085082:
                if (str.equals("sfplt_in_grid")) {
                    return C05F.A0N;
                }
                return C05F.A15;
            case -1747918657:
                if (str.equals("sfplt_in_menu")) {
                    return C05F.A00;
                }
                return C05F.A15;
            case -1134979389:
                if (str.equals("sfplt_from_multi_hide")) {
                    return C05F.A0C;
                }
                return C05F.A15;
            case -841539440:
                i = 3077;
                break;
            case -561162771:
                i = 1262;
                break;
            case 20170857:
                if (str.equals("on_impression")) {
                    return C05F.A0j;
                }
                return C05F.A15;
            default:
                return C05F.A15;
        }
        if (str.equals(AbstractC111324zv.A00(i))) {
            return C05F.A01;
        }
        return C05F.A15;
    }

    public static final String A01(EnumC75193Zm enumC75193Zm) {
        Integer num;
        int ordinal = enumC75193Zm.ordinal();
        if (ordinal != 4 && ordinal != 15) {
            if (ordinal != 5) {
                if (ordinal != 6) {
                    return null;
                }
                num = C05F.A0C;
            } else {
                num = C05F.A01;
            }
        } else {
            num = C05F.A00;
        }
        switch (num.intValue()) {
            case 0:
                return "hide_post_only";
            case 1:
                return "not_interested";
            default:
                return "hide_posts_from_account";
        }
    }

    public static final void A02(InterfaceC11380iw interfaceC11380iw, C19260xA c19260xA, UserSession userSession, C132835z6 c132835z6, EnumC40111tc enumC40111tc, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i) {
        int i2;
        String str11;
        String str12;
        String str13;
        String str14;
        Long l;
        Integer A03;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "explore_see_less_undo");
        if (A0f.isSampled()) {
            A0f.AAP("sfplt_source", str3);
            AbstractC37300Gc1.A0l(A0f, str);
            String str15 = null;
            A0f.A9K("a_pk", AbstractC37302Gc3.A0W(str2));
            if (enumC40111tc != null) {
                i2 = enumC40111tc.A00;
            } else {
                i2 = 0;
            }
            AbstractC37301Gc2.A0y(A0f, i2);
            A0f.AAP("ranking_session_id", str4);
            A0f.AAP("explore_source_token", str5);
            A0f.AAP("mezql_token", str6);
            A0f.AAP("connection_id", str7);
            A0f.AAP("inventory_source", str8);
            A0f.AAP("see_less_reason", str9);
            AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
            if (c19260xA != null) {
                str11 = c19260xA.A05("parent_m_pk");
            } else {
                str11 = null;
            }
            A0f.AAP("parent_m_pk", str11);
            if (c19260xA != null) {
                str12 = c19260xA.A05("application_state");
            } else {
                str12 = null;
            }
            A0f.AAP("application_state", str12);
            if (c19260xA != null) {
                str13 = c19260xA.A05("endpoint_type");
            } else {
                str13 = null;
            }
            A0f.AAP("endpoint_type", str13);
            if (c19260xA != null) {
                str14 = c19260xA.A05("chaining_session_id");
            } else {
                str14 = null;
            }
            AbstractC37300Gc1.A0r(A0f, str14);
            if (c19260xA != null && (A03 = c19260xA.A03("chaining_position")) != null) {
                l = AbstractC25229BEm.A0n(A03);
            } else {
                l = null;
            }
            A0f.A9K("chaining_position", l);
            A0f.AAP("event_source", AbstractC40627Hzl.A00(A00(str3)));
            A0f.AAP("ranking_info_token", str10);
            if (c132835z6 != null) {
                A0f.AAP("topic_cluster_id", c132835z6.A03);
                A0f.AAP("topic_cluster_title", c132835z6.A00().A04);
                A0f.AAP("topic_cluster_type", AbstractC127885qH.A00(c132835z6.A01()));
                if (c19260xA != null) {
                    str15 = c19260xA.A05("topic_cluster_debug_info");
                }
                A0f.AAP("topic_cluster_debug_info", str15);
            }
            if (i != -1) {
                A0f.A9K("m_ix", AbstractC31171DnF.A0V(i));
            }
            AbstractC31176DnK.A1I(A0f);
        }
    }

    public static final void A06(InterfaceC11380iw interfaceC11380iw, C19260xA c19260xA, UserSession userSession, EnumC40111tc enumC40111tc, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i) {
        String str11;
        String str12;
        String str13;
        String str14;
        Long l;
        String str15;
        String str16;
        String str17;
        Long l2;
        String str18;
        Integer A03;
        Integer A032;
        Integer A033;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "explore_see_less");
        if (A0f.isSampled()) {
            A0f.AAP("sfplt_source", str3);
            AbstractC37300Gc1.A0l(A0f, str);
            Long l3 = null;
            A0f.A9K("a_pk", AbstractC37302Gc3.A0W(str2));
            AbstractC37301Gc2.A0y(A0f, enumC40111tc.A00);
            A0f.AAP("ranking_session_id", str4);
            A0f.AAP("explore_source_token", str5);
            A0f.AAP("mezql_token", str6);
            A0f.AAP("connection_id", str7);
            A0f.AAP("inventory_source", str8);
            A0f.AAP("see_less_reason", str9);
            AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
            if (c19260xA != null) {
                str11 = c19260xA.A05("parent_m_pk");
            } else {
                str11 = null;
            }
            A0f.AAP("parent_m_pk", str11);
            if (c19260xA != null) {
                str12 = c19260xA.A05("application_state");
            } else {
                str12 = null;
            }
            A0f.AAP("application_state", str12);
            if (c19260xA != null) {
                str13 = c19260xA.A05("endpoint_type");
            } else {
                str13 = null;
            }
            A0f.AAP("endpoint_type", str13);
            if (c19260xA != null) {
                str14 = c19260xA.A05("chaining_session_id");
            } else {
                str14 = null;
            }
            AbstractC37300Gc1.A0r(A0f, str14);
            if (c19260xA != null && (A033 = c19260xA.A03("chaining_position")) != null) {
                l = AbstractC25229BEm.A0n(A033);
            } else {
                l = null;
            }
            A0f.A9K("chaining_position", l);
            if (c19260xA != null) {
                str15 = c19260xA.A05("carousel_cover_media_id");
            } else {
                str15 = null;
            }
            A0f.AAP("carousel_cover_media_id", str15);
            if (c19260xA != null) {
                str16 = c19260xA.A05("carousel_media_id");
            } else {
                str16 = null;
            }
            A0f.AAP("carousel_media_id", str16);
            if (c19260xA != null) {
                str17 = c19260xA.A05("carousel_cover_media_id");
            } else {
                str17 = null;
            }
            A0f.AAP("carousel_cover_media_id", str17);
            if (c19260xA != null && (A032 = c19260xA.A03("carousel_index")) != null) {
                l2 = AbstractC25229BEm.A0n(A032);
            } else {
                l2 = null;
            }
            A0f.A9K("carousel_index", l2);
            if (c19260xA != null) {
                str18 = c19260xA.A05("carousel_media_id");
            } else {
                str18 = null;
            }
            A0f.AAP("carousel_media_id", str18);
            if (c19260xA != null && (A03 = c19260xA.A03("carousel_size")) != null) {
                l3 = AbstractC25229BEm.A0n(A03);
            }
            A0f.A9K("carousel_size", l3);
            A0f.AAP("event_source", AbstractC40627Hzl.A00(A00(str3)));
            A0f.AAP("ranking_info_token", str10);
            if (i != -1) {
                A0f.A9K("m_ix", AbstractC31171DnF.A0V(i));
            }
            A0f.Cht();
        }
    }

    public static final void A08(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C75113Zb c75113Zb, EnumC40111tc enumC40111tc, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list, int i, boolean z, boolean z2) {
        String str15;
        int i2;
        int i3;
        String str16 = str12;
        String A14 = AbstractC25225BEi.A14();
        if (str.equals("explore_see_less")) {
            str15 = "discover/explore_report/";
        } else if (!str.equals("explore_see_less_undo")) {
            return;
        } else {
            str15 = "discover/explore_report_undo/";
        }
        if (c75113Zb != null) {
            i2 = c75113Zb.A0W;
        } else {
            i2 = -1;
        }
        String str17 = null;
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0E = str15;
        A0M.A9s("m_pk", str2);
        A0M.A9s("a_pk", str3);
        A0M.A9s("recommendation_data", str11);
        AbstractC37300Gc1.A0y(A0M, interfaceC11380iw.getModuleName());
        A0M.A0H("data", str10);
        A0M.A0H("source_token", str6);
        A0M.A0H(AbstractC58358Pty.A00(), str5);
        if (enumC40111tc != null) {
            i3 = enumC40111tc.A00;
        } else {
            i3 = 0;
        }
        A0M.A0A(Integer.valueOf(i3), "m_t");
        A0M.A0H("sfplt_source", str4);
        A0M.A0H("inventory_source", str8);
        if (str12 == null) {
            str16 = AbstractC40627Hzl.A00(A00(str4));
        }
        A0M.A0H("event_source", str16);
        A0M.A0H("nav_chain", A14);
        if (l != null) {
            A0M.A0E("num_visible_media_notes", l.longValue());
        }
        if (list != null) {
            str17 = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "[", "]", list, JCN.A00);
        }
        A0M.A0H("fully_visible_media_note_ids", str17);
        AbstractC31173DnH.A1N(A0M);
        if (i2 >= 0) {
            A0M.A0D("recs_ix", i2);
        }
        if (i != -1) {
            A0M.A0D("m_ix", i);
        }
        if (!C14360o3.A0K(str9, "hide_post_only")) {
            A0M.A0H(z ? "selected_reason" : "sfplt_follow_up_response", str9);
        }
        if (!C14360o3.A0K(str9, "hide_post_only") || C14360o3.A0K(interfaceC11380iw.getModuleName(), AbstractC43591JPw.A00(1067))) {
            A0M.A0H("ranking_info_token", str7);
        }
        A0M.A9s("is_from_swipe", "false");
        if (str13 != null && str13.length() != 0) {
            A0M.A9s("barcelona_source_reply_id", str13);
        }
        if (str14 != null && str14.length() != 0) {
            A0M.A9s(AbstractC111324zv.A00(4003), str14);
        }
        A0M.A0I("is_blend_self_rec", z2);
        C1GJ.A03(A0M.A0N());
    }
}
