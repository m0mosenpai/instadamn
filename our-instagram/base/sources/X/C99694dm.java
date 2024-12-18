package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4dm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99694dm implements InterfaceC13000lm {
    public final C18920wW A00;
    public final UserSession A01;
    public final InterfaceC11380iw A02;

    public final void A01(Integer num, String str, long j) {
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_fan_club_fetch_fan_club_from_user_success");
        A00.AAP("container_module", F7L.A00(num));
        A00.A9K("creator_igid", Long.valueOf(Long.parseLong(str)));
        A00.A9K(AbstractC111324zv.A00(472), Long.valueOf(j));
        A00.Cht();
    }

    public final void A02(String str) {
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_fan_club_subs_in_live_bottom_sheet_impression");
        A00.AAP("container_module", str);
        A00.Cht();
    }

    public final void A03(String str) {
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_fan_club_subs_in_live_enable_clicked");
        A00.AAP("container_module", str);
        A00.Cht();
    }

    public final void A07(String str, Integer num) {
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_fan_club_fetch_fan_club_from_user_failure");
        A00.AAP("container_module", F7L.A00(num));
        A00.A9K("creator_igid", Long.valueOf(Long.parseLong(str)));
        A00.Cht();
    }

    public final void A08(String str, Integer num, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_fan_club_subscribe_cta_tap");
        A00.AAP("container_module", F7L.A00(num));
        A00.A9K("creator_igid", Long.valueOf(Long.parseLong(str)));
        A00.A9K("media_id", Long.valueOf(Long.parseLong(str2)));
        A00.Cht();
    }

    public final void A09(String str, Integer num, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_fan_club_subscribe_cta_impression");
        A00.AAP("container_module", F7L.A00(num));
        A00.A9K("creator_igid", Long.valueOf(Long.parseLong(str)));
        A00.A9K("media_id", Long.valueOf(Long.parseLong(str2)));
        A00.Cht();
    }

    public final void A0A(String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_digital_fan_club_consideration_screen_content_preview_item_clicked");
        A00.AAP("container_module", AbstractC111324zv.A00(4210));
        A00.AAP("origin", str2);
        A00.A9K("creator_igid", Long.valueOf(Long.parseLong(str)));
        A00.A9K("media_id", Long.valueOf(Long.parseLong(str3)));
        A00.Cht();
    }

    public final void A0B(String str, String str2, String str3, String str4) {
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "user_commented_with_fanclub_badge");
        A00.AAP("container_module", AbstractC111324zv.A00(2168));
        A00.A9K("creator_igid", Long.valueOf(Long.parseLong(str)));
        A00.AAP(MSV.A00(227), str2);
        A00.AAP("media_group", str3);
        A00.AAP("media_type", str4);
        A00.Cht();
    }

    public final void A0C(String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        C14360o3.A0B(str4, 3);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_fan_club_consideration_screen_failure");
        A00.AAP("container_module", AbstractC111324zv.A00(211));
        A00.A9K("creator_igid", Long.valueOf(Long.parseLong(str)));
        A00.AAP("error", str2);
        A00.AAP("sku", str3);
        A00.AAP(MSV.A00(273), str4);
        A00.AAP("origin", str5);
        A00.Cht();
    }

    public final void A00(long j) {
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_fan_club_exclusive_posts_icon_tapped");
        A00.A9K("creator_igid", Long.valueOf(j));
        A00.AAP("container_module", "feed");
        A00.AAP("origin", "");
        A00.Cht();
    }

    public final void A04(String str, long j, String str2, String str3) {
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_fan_club_promo_and_welcome_video_settings");
        A00.AAP("container_module", str);
        A00.A9K("creator_igid", Long.valueOf(j));
        A00.AAP("media_id", str2);
        A00.AAP("action", str3);
        A00.Cht();
    }

    public final void A05(String str, Integer num) {
        C14360o3.A0B(num, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_fan_club_exclusive_content_notification_turn_off");
        A00.AAP("container_module", F7L.A00(num));
        A00.A9K("creator_igid", Long.valueOf(Long.parseLong(str)));
        A00.AAP("origin", "PROFILE");
        A00.Cht();
    }

    public final void A06(String str, Integer num) {
        C14360o3.A0B(num, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_fan_club_exclusive_content_notification_turn_on");
        A00.AAP("container_module", F7L.A00(num));
        A00.A9K("creator_igid", Long.valueOf(Long.parseLong(str)));
        A00.AAP("origin", "PROFILE");
        A00.Cht();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C99694dm.class);
    }

    public C99694dm(UserSession userSession) {
        this.A01 = userSession;
        C19270xB c19270xB = new C19270xB("FanClubLogger");
        this.A02 = c19270xB;
        this.A00 = AbstractC12220kQ.A01(c19270xB, userSession);
    }
}
