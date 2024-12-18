package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.6ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142846ck implements InterfaceC13000lm {
    public Boolean A00;
    public String A01;
    public final long A02;
    public final C18920wW A03;
    public final UserSession A04;

    public static final String A06(List list) {
        if (!list.contains(0) && !list.contains(3)) {
            if (list.contains(1)) {
                return "broadcast";
            }
            return "subscriber_broadcast";
        }
        return "instagram";
    }

    public final void A0H(C2EY c2ey, Integer num, String str, boolean z) {
        String obj;
        C25531Mh A0E;
        String str2;
        C14360o3.A0B(num, 3);
        if (C2EY.A08.contains(c2ey) && num == C05F.A0N) {
            obj = c2ey.toString();
            A0E = C25531Mh.A0E(this.A03);
            if (((AbstractC02600Aj) A0E).A00.isSampled()) {
                A0E.A0g(Long.valueOf(this.A02));
                str2 = "xposting_disabled_unsupported_send_type";
            } else {
                return;
            }
        } else {
            if (!C2EY.A07.contains(c2ey) || z) {
                return;
            }
            int intValue = num.intValue();
            if (intValue != 2) {
                if (intValue != 1) {
                    return;
                }
                obj = c2ey.toString();
                A0E = C25531Mh.A0E(this.A03);
                if (!((AbstractC02600Aj) A0E).A00.isSampled()) {
                    return;
                }
                A0E.A0g(Long.valueOf(this.A02));
                str2 = "xposting_disabled_collaborator_moderator";
            } else {
                obj = c2ey.toString();
                A0E = C25531Mh.A0E(this.A03);
                if (!((AbstractC02600Aj) A0E).A00.isSampled()) {
                    return;
                }
                A0E.A0g(Long.valueOf(this.A02));
                str2 = "xposting_disabled_manual_opt_out";
            }
        }
        A0E.A0k(str2);
        A0E.A0j("tap");
        A0E.A0o("composer_send_button");
        A0E.A0p("thread_view");
        A0E.A0n("broadcast");
        A0E.A0r(str);
        A0E.A0u(this.A01);
        A0E.A0v(AbstractC16850sd.A0M(new C09530e4("send_type", obj)));
        A0E.Cht();
    }

    public final void A0I(EnumC154216wW enumC154216wW, String str, boolean z) {
        String str2;
        String str3;
        C14360o3.A0B(enumC154216wW, 0);
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            HashMap hashMap = new HashMap();
            hashMap.put("creator_igid", str);
            int ordinal = enumC154216wW.ordinal();
            if (ordinal != 2) {
                if (ordinal != 1) {
                    if (ordinal == 0) {
                        str2 = "notifications_disabled";
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    str2 = "some_notifications_enabled";
                }
            } else {
                str2 = "all_notifications_enabled";
            }
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k(str2);
            if (z) {
                str3 = "toggle";
            } else {
                str3 = "tap";
            }
            A0E.A0j(str3);
            A0E.A0o("broadcast_chats_notifications");
            A0E.A0p("profile_notification_settings");
            A0E.A0n("instagram");
            A0E.A0v(hashMap);
            A0E.Cht();
        }
    }

    public final void A0X(String str, String str2, String str3, boolean z) {
        String str4;
        C14360o3.A0B(str2, 1);
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled() && str3 != null) {
            A0E.A0g(Long.valueOf(this.A02));
            if (z) {
                str4 = "live_stream_end";
            } else {
                str4 = "live_stream_end_cancel";
            }
            A0E.A0k(str4);
            A0E.A0j("tap");
            A0E.A0o("end_live_button");
            A0E.A0p(MSV.A00(506));
            A0E.A0n("broadcast");
            A0E.A0r(str3);
            A0E.A0h(null);
            A0E.A0u(this.A01);
            A0E.A0v(AbstractC06930Yk.A06(new C09530e4("live_id", str), new C09530e4("audience", str2)));
            A0E.Cht();
        }
    }

    public final void A0Y(String str, String str2, String str3, boolean z, boolean z2) {
        String str4;
        String str5;
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled() && str != null) {
            HashMap hashMap = new HashMap();
            if (z2) {
                str4 = "True";
            } else {
                str4 = "False";
            }
            hashMap.put("is_follower", str4);
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("user_nux_sheet_rendered");
            A0E.A0j("tap");
            A0E.A0o(A05(str, false));
            A0E.A0p(A04(str));
            if (z) {
                str5 = "subscriber_broadcast";
            } else {
                str5 = "broadcast";
            }
            A0E.A0n(str5);
            A0E.A0r(str2);
            A0E.A0h(AbstractC003100w.A0k(10, str3));
            A0E.A0u(this.A01);
            A0E.A0v(hashMap);
            A0E.Cht();
        }
    }

    public final void A0a(String str, String str2, boolean z) {
        String str3;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("leave_user_nux");
            A0E.A0j("tap");
            A0E.A0o("exit_user_nux_button");
            A0E.A0p("broadcast_chat_creator_nux");
            if (z) {
                str3 = "subscriber_broadcast";
            } else {
                str3 = "broadcast";
            }
            A0E.A0n(str3);
            A0E.A0r(str);
            A0E.A0h(AbstractC003100w.A0k(10, str2));
            A0E.Cht();
        }
    }

    public static final String A00(ChannelCreationSource channelCreationSource) {
        switch (channelCreationSource.ordinal()) {
            case 0:
                return "activity_feed";
            case 1:
                return "edit_profile";
            case 2:
            case 3:
                return "mimicry_upsell_banner";
            case 4:
                return "dm_creation_omnipicker";
            case 5:
                return "professional_dashboard";
            case 6:
                return "profile";
            case 7:
                return "inbox";
            case 8:
            case 9:
            case 10:
            case 11:
                return "create_channel";
            default:
                throw new RuntimeException();
        }
    }

    public static final String A02(EnumC33373Ep6 enumC33373Ep6) {
        if (enumC33373Ep6 != EnumC33373Ep6.A03 && enumC33373Ep6 != EnumC33373Ep6.A0C && enumC33373Ep6 != EnumC33373Ep6.A0D) {
            if (enumC33373Ep6 == EnumC33373Ep6.A04) {
                return "reel";
            }
            return "thread_view";
        }
        return "story";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0131 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A03(java.lang.String r4) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142846ck.A03(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00de A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A04(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142846ck.A04(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A05(java.lang.String r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142846ck.A05(java.lang.String, boolean):java.lang.String");
    }

    public static final void A07(C142846ck c142846ck, String str, String str2, String str3, String str4, String str5, int i) {
        Long l;
        C25531Mh A0E = C25531Mh.A0E(c142846ck.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            LinkedHashMap A06 = AbstractC06930Yk.A06(new C09530e4("target_user_igid", str3), new C09530e4("button_type", str4), new C09530e4("user_type", str5));
            A0E.A0g(Long.valueOf(c142846ck.A02));
            A0E.A0k("member_cta_clicked");
            A0E.A0j("tap");
            A0E.A0o("member_cta_button");
            A0E.A0p("thread_details_people");
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.A0v(A06);
            A0E.Cht();
        }
    }

    public final void A08(int i, String str, String str2) {
        Long l;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("change_name_sheet_rendered");
            A0E.A0j("tap");
            A0E.A0o("change_name_item");
            A0E.A0p("change_name_photo_sheet");
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.A0u(this.A01);
            A0E.Cht();
        }
    }

    public final void A09(int i, String str, String str2) {
        Long l;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("change_photo_dialog_rendered");
            A0E.A0j("tap");
            A0E.A0o("change_photo_item");
            A0E.A0p("change_name_photo_sheet");
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.A0u(this.A01);
            A0E.Cht();
        }
    }

    public final void A0A(int i, String str, String str2) {
        Long l;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("custom_theme_sheet_rendered");
            A0E.A0j("tap");
            A0E.A0o("change_theme_item");
            A0E.A0p("change_theme_sheet");
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.A0u(this.A01);
            A0E.Cht();
        }
    }

    public final void A0C(AbstractC115105If abstractC115105If, String str, String str2, int i) {
        LinkedHashMap linkedHashMap;
        String str3;
        InterfaceC40821up interfaceC40821up;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            Long l = null;
            if (abstractC115105If != null && (interfaceC40821up = (InterfaceC40821up) abstractC115105If.A00()) != null) {
                linkedHashMap = AbstractC06930Yk.A06(new C09530e4("error_message", interfaceC40821up.getErrorMessage()), new C09530e4(TraceFieldType.ErrorCode, interfaceC40821up.getErrorCode()));
            } else {
                linkedHashMap = null;
            }
            A0E.A0g(Long.valueOf(this.A02));
            if (abstractC115105If != null) {
                str3 = "join_chat_collaborator_error";
            } else {
                str3 = "join_chat_collaborator_success";
            }
            A0E.A0k(str3);
            A0E.A0j("view");
            A0E.A0o("join_collaborator");
            A0E.A0p("thread_view");
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            }
            A0E.A0h(l);
            A0E.A0v(linkedHashMap);
            A0E.Cht();
        }
    }

    public final void A0D(AbstractC115105If abstractC115105If, String str, String str2, int i) {
        LinkedHashMap linkedHashMap;
        String str3;
        InterfaceC40821up interfaceC40821up;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            Long l = null;
            if (abstractC115105If != null && (interfaceC40821up = (InterfaceC40821up) abstractC115105If.A00()) != null) {
                linkedHashMap = AbstractC06930Yk.A06(new C09530e4("error_message", interfaceC40821up.getErrorMessage()), new C09530e4(TraceFieldType.ErrorCode, interfaceC40821up.getErrorCode()));
            } else {
                linkedHashMap = null;
            }
            A0E.A0g(Long.valueOf(this.A02));
            if (abstractC115105If != null) {
                str3 = "decline_chat_collaborator_error";
            } else {
                str3 = "decline_chat_collaborator_success";
            }
            A0E.A0k(str3);
            A0E.A0j("view");
            A0E.A0o("decline_collaborator");
            A0E.A0p("thread_view");
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            }
            A0E.A0h(l);
            A0E.A0v(linkedHashMap);
            A0E.Cht();
        }
    }

    public final void A0E(ChannelCreationSource channelCreationSource, int i) {
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            this.A01 = UUID.randomUUID().toString();
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("channel_option_viewed");
            A0E.A0j("view");
            String str = "omnipicker_view";
            switch (channelCreationSource.ordinal()) {
                case 4:
                    break;
                case 5:
                    str = "next_steps_item";
                    break;
                default:
                    str = "profile_view";
                    break;
            }
            A0E.A0o(str);
            A0E.A0p(A00(channelCreationSource));
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0u(this.A01);
            A0E.Cht();
        }
    }

    public final void A0F(EnumC33373Ep6 enumC33373Ep6, String str, int i) {
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("follow_join_chat");
            A0E.A0j("tap");
            A0E.A0o("follow_to_join_chat_sheet");
            A0E.A0p(A02(enumC33373Ep6));
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            String A01 = A01(enumC33373Ep6);
            if (A01 != null) {
                A0E.A0v(AbstractC16850sd.A0M(new C09530e4("entrypoint", A01)));
            }
            A0E.Cht();
        }
    }

    public final void A0G(EnumC33373Ep6 enumC33373Ep6, String str, int i, boolean z) {
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled() && !z) {
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("not_follow_join_chat");
            A0E.A0j("tap");
            A0E.A0o("follow_to_join_chat_sheet");
            A0E.A0p(A02(enumC33373Ep6));
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            String A01 = A01(enumC33373Ep6);
            if (A01 != null) {
                A0E.A0v(AbstractC16850sd.A0M(new C09530e4("entrypoint", A01)));
            }
            A0E.Cht();
        }
    }

    public final void A0J(Integer num, String str, String str2, int i) {
        String str3;
        Long l;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("thread_delete_successful");
            A0E.A0j("view");
            A0E.A0o("delete_broadcast_chat");
            if (num.intValue() != 1) {
                str3 = "thread_view";
            } else {
                str3 = "thread_details";
            }
            A0E.A0p(str3);
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.Cht();
        }
    }

    public final void A0K(Integer num, String str, String str2, int i) {
        Long l;
        String A00;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("remove_collaborator_dialog_rendered");
            A0E.A0j("tap");
            A0E.A0o("user_dot_menu");
            A0E.A0p("thread_details_people");
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            if (num.intValue() != 0) {
                A00 = "invited";
            } else {
                A00 = MSV.A00(373);
            }
            A0E.A0v(AbstractC16850sd.A0M(new C09530e4("invite_status", A00)));
            A0E.Cht();
        }
    }

    public final void A0L(Integer num, String str, String str2, int i, boolean z) {
        String str3;
        String str4;
        String str5;
        String str6;
        Long l;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            if (z) {
                str3 = "delete_broadcast_chat_dialog_rendered";
            } else {
                str3 = "remove_broadcast_chat_dialog_rendered";
            }
            A0E.A0k(str3);
            if (num == C05F.A00) {
                str4 = "swipe";
            } else {
                str4 = "tap";
            }
            A0E.A0j(str4);
            if (num == C05F.A01) {
                str5 = "delete_button";
            } else if (z) {
                str5 = "thread_swipe_options";
            } else {
                str5 = "thread_list_item";
            }
            A0E.A0o(str5);
            if (num.intValue() != 1) {
                str6 = "thread_view";
            } else {
                str6 = "thread_details";
            }
            A0E.A0p(str6);
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.Cht();
        }
    }

    public final void A0M(Integer num, String str, String str2, int i, boolean z) {
        String str3;
        String str4;
        String str5;
        Long l;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        str3 = "generate_qr_code_sheet_rendered";
                    } else {
                        str3 = "invite_link_reset";
                    }
                } else {
                    str3 = "send_invite_link_instagram_sheet_rendered";
                }
            } else {
                str3 = "invite_link_copied";
            }
            A0E.A0k(str3);
            A0E.A0j("tap");
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        str4 = "generate_qr_code_text";
                    } else {
                        str4 = "reset_text";
                    }
                } else {
                    str4 = "send_link_instagram_text";
                }
            } else {
                str4 = "chat_link_copy_text";
            }
            A0E.A0o(str4);
            if (z) {
                str5 = "creator_invite_link_details";
            } else {
                str5 = "fan_invite_link_details";
            }
            A0E.A0p(str5);
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.Cht();
        }
    }

    public final void A0N(Integer num, String str, String str2, int i, boolean z, boolean z2) {
        String str3;
        String str4;
        String str5;
        Long l;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            if (z) {
                if (z2) {
                    str3 = "thread_delete_attempt";
                } else {
                    str3 = "thread_delete_cancel";
                }
            } else if (z2) {
                str3 = "remove_broadcast_chat_inbox";
            } else {
                str3 = "remove_broadcast_chat_inbox_cancel";
            }
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k(str3);
            A0E.A0j("tap");
            if (z) {
                str4 = "delete_chat_dialog";
            } else {
                str4 = "remove_chat_dialog";
            }
            A0E.A0o(str4);
            if (num.intValue() != 1) {
                str5 = "thread_view";
            } else {
                str5 = "thread_details";
            }
            A0E.A0p(str5);
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.Cht();
        }
    }

    public final void A0O(Integer num, String str, String str2, boolean z) {
        String str3;
        int i;
        Long l;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            if (z) {
                str3 = "channel_controls_rendered";
            } else {
                str3 = "dismiss_comment_upsell_nux";
            }
            A0E.A0k(str3);
            A0E.A0j("tap");
            A0E.A0o("comments_upsell_banner");
            A0E.A0p("thread_view");
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.Cht();
        }
    }

    public final void A0P(Integer num, String str, String str2, boolean z) {
        String str3;
        String str4;
        int i;
        Long l;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            if (z) {
                str3 = "comments_enabled";
            } else {
                str3 = "comments_upsell_sheet_cancelled";
            }
            A0E.A0k(str3);
            A0E.A0j("tap");
            if (z) {
                str4 = "turn_on_button";
            } else {
                str4 = "not_now_button";
            }
            A0E.A0o(str4);
            A0E.A0p("comments_upsell_sheet");
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.Cht();
        }
    }

    public final void A0Q(String str, Integer num, String str2) {
        int i;
        Long l;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("comments_upsell_sheet_rendered");
            A0E.A0j("impression");
            A0E.A0o("thread_view");
            A0E.A0p("thread_view");
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.Cht();
        }
    }

    public final void A0R(String str, String str2, int i, boolean z) {
        String str3;
        Long l;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            if (z) {
                str3 = "creator_invite_link_sheet_rendered";
            } else {
                str3 = "fan_invite_link_sheet_rendered";
            }
            A0E.A0k(str3);
            A0E.A0j("tap");
            A0E.A0o("invite_link_setting");
            A0E.A0p("thread_details");
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.Cht();
        }
    }

    public final void A0S(String str, String str2, String str3) {
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("xposting_failed");
            A0E.A0j("tap");
            A0E.A0o("composer_send_button");
            A0E.A0p("thread_view");
            A0E.A0n("broadcast");
            A0E.A0r(str);
            A0E.A0u(this.A01);
            A0E.A0v(AbstractC06930Yk.A06(new C09530e4("error_message", str3), new C09530e4("send_type", str2)));
            A0E.Cht();
        }
    }

    public final void A0T(String str, String str2, String str3, int i, boolean z) {
        String str4;
        String str5;
        Long l;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            HashMap hashMap = new HashMap();
            if (z) {
                str4 = "True";
            } else {
                str4 = "False";
            }
            hashMap.put("is_chat_creator", str4);
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("story_camera_rendered_broadcast_jcs");
            A0E.A0j("tap");
            String str6 = "thread_details_link";
            boolean equals = str3.equals("thread_details_link");
            if (equals) {
                str5 = "share_to_story_link_button";
            } else {
                str5 = "share_to_story_cta_button";
            }
            A0E.A0o(str5);
            if (!equals) {
                str6 = "thread_view";
            }
            A0E.A0p(str6);
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.A0v(hashMap);
            A0E.Cht();
        }
    }

    public final void A0U(String str, String str2, String str3, String str4, String str5, int i) {
        Long l;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("share_sheet_rendered");
            A0E.A0j("tap");
            A0E.A0o(MSV.A00(1593));
            A0E.A0p("thread_view");
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.A0R("item_id", str3);
            A0E.A0R(AbstractC43591JPw.A00(136), str4);
            A0E.A0u(this.A01);
            A0E.A0v(AbstractC06930Yk.A06(new C09530e4("user_type", str5), new C09530e4("share_reason", "share_in_channel_message")));
            A0E.Cht();
        }
    }

    public final void A0V(String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str6;
        String str7;
        Long l;
        Boolean bool;
        String str8;
        String str9;
        String str10;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            String A03 = A03(str3);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str11 = "False";
            String str12 = "False";
            linkedHashMap.put("is_admin", "False");
            linkedHashMap.put("previously_joined", "False");
            if (z) {
                str11 = "True";
            }
            linkedHashMap.put("new_bc_user", str11);
            linkedHashMap.put("entrypoint", A03);
            if (z5) {
                str6 = "True";
            } else {
                str6 = str12;
            }
            linkedHashMap.put("is_follower", str6);
            if (str5 == null) {
                str5 = "";
            }
            linkedHashMap.put("ad_id", str5);
            if (C14360o3.A0K(A03, "message_in_story")) {
                if (str4 != null) {
                    linkedHashMap.put("story_poster_id", str4);
                }
                if (z2) {
                    str8 = "True";
                } else {
                    str8 = str12;
                }
                linkedHashMap.put("is_poster_chat_creator", str8);
                if (z3) {
                    str9 = "True";
                } else {
                    str9 = str12;
                }
                linkedHashMap.put("is_poster_moderator", str9);
                if (z4) {
                    str10 = "True";
                } else {
                    str10 = str12;
                }
                linkedHashMap.put("is_poster_collaborator", str10);
            }
            if (C14360o3.A0K(A03, "inbox_search") && (bool = this.A00) != null) {
                if (bool.booleanValue()) {
                    str12 = "True";
                }
                linkedHashMap.put("from_search_nullstate", str12);
            }
            if (C14360o3.A0K(A03, "message_in_story_join")) {
                str7 = "story";
            } else {
                str7 = "broadcast_chat_preview";
            }
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("thread_join");
            A0E.A0j("tap");
            A0E.A0o("join_chat_button");
            A0E.A0p(str7);
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.A0v(linkedHashMap);
            A0E.Cht();
        }
    }

    public final void A0W(String str, String str2, String str3, String str4, String str5, String str6, Map map, int i) {
        Long l;
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k(str);
            A0E.A0j(str2);
            A0E.A0o(str3);
            A0E.A0p(str4);
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str5);
            if (str6 != null) {
                l = AbstractC003100w.A0k(10, str6);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.A0v(map);
            A0E.Cht();
        }
    }

    public final void A0Z(String str, String str2, boolean z) {
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            LinkedHashMap A07 = AbstractC06930Yk.A07(new C09530e4("is_enabled", String.valueOf(z)));
            if (str2 != null) {
                A07.put("xposting_thread_fbid", str2);
            }
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("channel_controls_xposting_toggle_changed");
            A0E.A0j("toggle");
            A0E.A0o("xposting_channel_controls_toggle");
            A0E.A0p("thread_channel_controls");
            A0E.A0n("broadcast");
            A0E.A0r(str);
            A0E.A0u(this.A01);
            A0E.A0v(A07);
            A0E.Cht();
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A04.A03(C142846ck.class);
    }

    public C142846ck(UserSession userSession) {
        long j;
        this.A04 = userSession;
        String str = userSession.userId;
        C14360o3.A0B(str, 0);
        Long A0k = AbstractC003100w.A0k(10, str);
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = -1;
        }
        this.A02 = j;
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "creator_broadcast_chat";
        this.A03 = c12210kP.A00();
    }

    public static final String A01(EnumC33373Ep6 enumC33373Ep6) {
        int ordinal = enumC33373Ep6.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 8 && ordinal != 9) {
                    return null;
                }
                return "message_in_story";
            }
            return "reels";
        }
        return "join_chat_sticker";
    }

    public final void A0B(int i, String str, String str2) {
        Long l;
        this.A01 = UUID.randomUUID().toString();
        C25531Mh A0E = C25531Mh.A0E(this.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(this.A02));
            A0E.A0k("reaction_sheet_rendered");
            A0E.A0j("tap");
            A0E.A0o("plus_button");
            A0E.A0p("thread_view");
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
            A0E.A0r(str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0E.A0h(l);
            A0E.A0u(this.A01);
            A0E.Cht();
        }
    }
}
