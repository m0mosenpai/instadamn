package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import java.util.List;

/* loaded from: classes8.dex */
public final class LLR {
    public final C18920wW A00;
    public final UserSession A01;
    public final C48509Ld0 A02;
    public final InterfaceC11380iw A03;
    public final C6Z0 A04;
    public final java.util.Set A05;

    public static final void A01(EnumC46289KeL enumC46289KeL, LLR llr, EnumC92974Es enumC92974Es, Boolean bool, Long l, String str, String str2, String str3) {
        A00(enumC46289KeL, null, null, null, llr, enumC92974Es, null, null, null, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l, str, str2, null, str3, null, null, null, null, null, null, null);
    }

    public static final void A02(EnumC46289KeL enumC46289KeL, LLR llr, String str, String str2) {
        A00(enumC46289KeL, null, null, null, llr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, str2, null, null, null, null, null, null, null, null, null);
    }

    public static final void A03(EnumC46298KeU enumC46298KeU, EnumC46275Ke7 enumC46275Ke7, LLR llr, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2, String str3, String str4) {
        A00(null, enumC46298KeU, null, enumC46275Ke7, llr, null, null, null, null, bool, null, bool2, null, null, null, num, num2, num3, null, null, null, null, null, num4, l, str, str2, null, str3, null, str4, null, null, null, null, null);
    }

    public static final void A04(EnumC46275Ke7 enumC46275Ke7, LLR llr, Boolean bool, Boolean bool2, Integer num, String str, String str2, String str3) {
        A00(null, null, null, enumC46275Ke7, llr, null, null, null, null, null, bool, bool2, null, null, num, null, null, null, null, null, null, null, null, null, null, str, str2, null, str3, null, null, null, null, null, null, null);
    }

    public static final void A06(LLR llr, Boolean bool, Boolean bool2, Boolean bool3, Long l, String str, String str2, String str3) {
        A00(null, null, null, null, llr, null, null, null, null, null, bool, null, bool2, bool3, null, null, null, null, null, null, null, null, null, null, l, str, "IMPRESSION", null, str2, str3, null, null, null, null, null, null);
    }

    public final void A09(long j, String str, boolean z) {
        boolean z2;
        C14360o3.A0B(str, 0);
        java.util.Set set = this.A05;
        if (set.contains(str)) {
            z2 = true;
        } else {
            set.add(str);
            z2 = false;
        }
        boolean A1Z = AbstractC31172DnG.A1Z(this.A01, str);
        A06(this, Boolean.valueOf(A1Z), Boolean.valueOf(z), Boolean.valueOf(z2), Long.valueOf(j), "LOCATION_POG", str, null);
    }

    public final void A0B(C135976Dc c135976Dc, C45128JyU c45128JyU, long j, boolean z) {
        boolean z2;
        EnumC152186t3 enumC152186t3;
        JZB jzb;
        String str;
        C14360o3.A0B(c135976Dc, 2);
        String str2 = c45128JyU.A0A;
        C4F5 c4f5 = c45128JyU.A05;
        if (c4f5 != null && str2 != null) {
            java.util.Set set = this.A05;
            if (set.contains(str2)) {
                z2 = true;
            } else {
                set.add(str2);
                z2 = false;
            }
            if (z) {
                enumC152186t3 = EnumC152186t3.FRIEND_MAP_FLOATY_GRID;
            } else {
                enumC152186t3 = EnumC152186t3.FRIEND_MAP;
            }
            c135976Dc.A0L(enumC152186t3, c4f5);
            C152706ty c152706ty = c135976Dc.A01;
            if (c152706ty != null) {
                String str3 = c135976Dc.A07.A00;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c135976Dc.A05, AbstractC111324zv.A00(4591));
                if (A0f.isSampled()) {
                    AbstractC25225BEi.A1N(A0f, C135976Dc.A02());
                    A0f.AAP("target_user_id", c152706ty.A09);
                    A0f.AAk("content", c152706ty.A0B);
                    A0f.A7v("sub_impression", Boolean.valueOf(z2));
                    A0f.A7v("in_floaty_grid", Boolean.valueOf(z));
                    A0f.AAP("direct_session_id", str3);
                    A0f.AAP("note_id", c152706ty.A07);
                    A0f.A8I("dwell_time_ms", Double.valueOf(j));
                    NoteAudience noteAudience = c152706ty.A04;
                    if (noteAudience != null) {
                        jzb = AbstractC135966Db.A00(noteAudience);
                    } else {
                        jzb = null;
                    }
                    A0f.A8R(jzb, AbstractC111324zv.A00(5467));
                    if (c135976Dc.A04) {
                        str = AbstractC111324zv.A00(413);
                    } else {
                        str = "direct_inbox";
                    }
                    AbstractC25232BEp.A1L(A0f, "container_module", str);
                }
            }
            A06(this, null, Boolean.valueOf(z), Boolean.valueOf(z2), Long.valueOf(j), "MAP_NOTE", str2, null);
        }
    }

    public final void A0D(String str) {
        A04(null, this, Boolean.valueOf(AbstractC31172DnG.A1Z(this.A01, str)), null, null, "LOCATION_POG", "TAP", str);
    }

    public static final void A05(LLR llr, EnumC92974Es enumC92974Es, String str) {
        A00(null, null, null, null, llr, enumC92974Es, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, "TAP", null, null, null, null, null, null, null, null, null);
    }

    public static final void A07(LLR llr, String str) {
        A00(null, null, null, null, llr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, "TAP", null, null, null, null, null, null, null, null, null);
    }

    public final void A08() {
        A07(this, "LOCATION_SHARE_PERMISSION");
    }

    public final void A0A(EnumC46289KeL enumC46289KeL) {
        A02(enumC46289KeL, this, "NUX_SKIP", "TAP");
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x00c7, code lost:
    
        if (r3 != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[LOOP:1: B:17:0x0045->B:19:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb A[LOOP:3: B:42:0x00f5->B:44:0x00fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132 A[LOOP:5: B:58:0x012c->B:60:0x0132, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016f A[LOOP:7: B:78:0x0169->B:80:0x016f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a6 A[LOOP:9: B:94:0x01a0->B:96:0x01a6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(java.lang.Integer r48, java.lang.String r49, java.util.List r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LLR.A0C(java.lang.Integer, java.lang.String, java.util.List, boolean):void");
    }

    public LLR(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = userSession;
        this.A03 = interfaceC11380iw;
        this.A00 = AbstractC12220kQ.A02(userSession);
        C14360o3.A0B(userSession, 0);
        this.A02 = (C48509Ld0) userSession.A01(C48509Ld0.class, C50228MGj.A00);
        this.A05 = AbstractC31171DnF.A0l();
        this.A04 = new C6Z0(C50227MGi.A00);
    }

    public final void A0E(String str, boolean z) {
        A03(null, null, this, Boolean.valueOf(z), null, null, null, null, null, null, "QUICK_REACT", "TAP", null, str);
    }

    public final void A0F(String str, boolean z, boolean z2) {
        A00(null, null, null, null, this, null, null, Boolean.valueOf(z), Boolean.valueOf(z2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "QUICK_EMOJI", "IMPRESSION", null, null, null, str, null, null, null, null, null);
    }

    public final void A0G(List list, boolean z) {
        A00(null, null, null, null, this, null, Boolean.valueOf(z), null, null, null, null, null, null, null, null, null, null, null, null, AbstractC43592JPx.A0s(list), null, null, null, null, null, "CLUSTER", "TAP", null, null, null, null, null, null, null, null, null);
    }

    public static final void A00(EnumC46289KeL enumC46289KeL, EnumC46298KeU enumC46298KeU, EnumC46298KeU enumC46298KeU2, EnumC46275Ke7 enumC46275Ke7, LLR llr, EnumC92974Es enumC92974Es, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4) {
        String str8;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        String str9;
        Long l8;
        Long l9;
        Double d;
        Long l10;
        String moduleName;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(llr.A00, "ig_friend_map_entity_action");
        if (A0f.isSampled()) {
            String str10 = "";
            if (str3 != null) {
                str8 = "";
            } else {
                C48509Ld0 c48509Ld0 = llr.A02;
                if (AbstractC25228BEl.A1A(c48509Ld0.A02).length() == 0) {
                    C0w9.A01(EnumC12410kj.A0A, "FriendMapSessionManager", "Session id is not initiated");
                    c48509Ld0.A02 = AbstractC166997dE.A0n();
                }
                str8 = c48509Ld0.A02;
            }
            A0f.AAP("friend_map_session_id", str8);
            InterfaceC11380iw interfaceC11380iw = llr.A03;
            if (interfaceC11380iw != null && (moduleName = interfaceC11380iw.getModuleName()) != null) {
                str10 = moduleName;
            }
            A0f.AAP("container_module", str10);
            A0f.AAP("entity", str);
            AbstractC31171DnF.A1C(A0f, str2);
            A0f.AAP("direct_session_id", str3);
            A0f.AAP("entity_id", str4);
            A0f.AAP("bottom_sheet_state", str5);
            EnumC46294KeQ enumC46294KeQ = null;
            if (num6 != null) {
                l2 = AbstractC25229BEm.A0n(num6);
            } else {
                l2 = null;
            }
            A0f.A9K("cluster_size", l2);
            if (num7 != null) {
                l3 = AbstractC25229BEm.A0n(num7);
            } else {
                l3 = null;
            }
            A0f.A9K("position", l3);
            if (num5 != null) {
                l4 = AbstractC25229BEm.A0n(num5);
            } else {
                l4 = null;
            }
            A0f.A9K("users_count", l4);
            if (num3 != null) {
                l5 = AbstractC25229BEm.A0n(num3);
            } else {
                l5 = null;
            }
            A0f.A9K("shots_count", l5);
            if (num2 != null) {
                l6 = AbstractC25229BEm.A0n(num2);
            } else {
                l6 = null;
            }
            A0f.A9K("notes_count", l6);
            A0f.A7v("opens_floaty_grid", bool);
            if (num4 != null) {
                l7 = AbstractC25229BEm.A0n(num4);
            } else {
                l7 = null;
            }
            A0f.A9K("unseen_updates_count", l7);
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 0) {
                    str9 = "INBOX_MAP_POG";
                } else if (intValue != 2) {
                    str9 = intValue != 1 ? "UNKNOWN" : "PUSH_NOTIFICATION";
                } else {
                    str9 = "ACTIVITY_FEED";
                }
            } else {
                str9 = null;
            }
            AbstractC31171DnF.A1G(A0f, str9);
            A0f.AAP("quick_emoji_selected", str6);
            A0f.A7v("default_emoji", bool2);
            A0f.A7v("new_emoji_selected", bool3);
            if (num8 != null) {
                l8 = AbstractC25229BEm.A0n(num8);
            } else {
                l8 = null;
            }
            A0f.A9K("card_index", l8);
            if (num9 != null) {
                l9 = AbstractC25229BEm.A0n(num9);
            } else {
                l9 = null;
            }
            A0f.A9K("max_card_index", l9);
            if (l != null) {
                d = Double.valueOf(l.longValue());
            } else {
                d = null;
            }
            A0f.A8I("dwell_time_ms", d);
            A0f.A7v("is_focus_mode", bool4);
            if (num10 != null) {
                l10 = AbstractC25229BEm.A0n(num10);
            } else {
                l10 = null;
            }
            A0f.A9K("last_active_locations_count", l10);
            A0f.A7v("is_self_pog", bool5);
            A0f.A8R(enumC46289KeL, "nux_page");
            if (enumC92974Es != null) {
                int ordinal = enumC92974Es.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 3) {
                        enumC46294KeQ = EnumC46294KeQ.BESTIES;
                    } else if (ordinal == 4) {
                        enumC46294KeQ = EnumC46294KeQ.ALLOWLIST;
                    } else if (ordinal == 5) {
                        enumC46294KeQ = EnumC46294KeQ.BLOCKLIST;
                    } else if (ordinal == 2) {
                        enumC46294KeQ = EnumC46294KeQ.MUTUAL_FOLLOWS;
                    }
                }
                enumC46294KeQ = EnumC46294KeQ.ONLY_OWNER;
            }
            A0f.A8R(enumC46294KeQ, "audience_type");
            A0f.A7v("is_precise", bool6);
            A0f.A8R(enumC46275Ke7, "permission_type");
            A0f.A8R(enumC46298KeU, "permission_source");
            A0f.A8R(enumC46298KeU2, "audience_select_entry_point");
            A0f.AAP("location_name", str7);
            A0f.A7v("in_floaty_grid", bool7);
            A0f.A7v("sub_impression", bool8);
            A0f.AAk("locations_user_ids", list);
            A0f.AAk("notes_user_ids", list2);
            A0f.AAk("shots_user_ids", list3);
            A0f.AAk("updates_user_ids", list4);
            A0f.AAP(AbstractC111324zv.A00(358), AbstractC25041Ki.A00);
            A0f.Cht();
        }
    }
}
