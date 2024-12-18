package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BSo {
    public static final BSo A00 = new Object();

    public final void A04(EnumC25577BSp enumC25577BSp, UserSession userSession, String str, String str2, String str3, String str4) {
        AbstractC167007dF.A1G(str, 1, str4);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_media_note_author_profile_click_client");
        Long A002 = A00(userSession, str4);
        if (A0f.isSampled() && A002 != null) {
            A0f.A9K("note_id", A002);
            A0f.AAP("container_module", str);
            A0f.A8R(enumC25577BSp, "event_source");
            A0f.AAP("inventory_source", str2);
            AbstractC25229BEm.A1B(A0f, str3);
        }
    }

    public final void A06(UserSession userSession, Integer num, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_media_note_reply_sheet_impression_client");
        Long A002 = A00(userSession, str4);
        if (A0f.isSampled() && A002 != null) {
            A0f.A9K("note_id", A002);
            A0f.AAP("container_module", str);
            A0f.A9K("carousel_index", AbstractC25234BEr.A0X(A0f, num, "inventory_source", str2));
            AbstractC25233BEq.A17(A0f, "carousel_media_id", str5);
            AbstractC25229BEm.A1B(A0f, str3);
        }
    }

    public final void A07(UserSession userSession, Integer num, String str, String str2, String str3, String str4, String str5) {
        AbstractC25229BEm.A1I(str, 1, str5);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_media_note_keyboard_interaction_client");
        Long A002 = A00(userSession, str5);
        if (A0f.isSampled() && A002 != null) {
            A0f.A9K("note_id", A002);
            A0f.AAP("container_module", str);
            A0f.A9K("carousel_index", AbstractC25234BEr.A0X(A0f, num, "inventory_source", str2));
            AbstractC25233BEq.A17(A0f, "carousel_media_id", str3);
            AbstractC25229BEm.A1B(A0f, str4);
        }
    }

    public static final Long A00(UserSession userSession, String str) {
        if (((C4F2) userSession.A01(C4F2.class, C4F1.A00)).A01(str)) {
            return null;
        }
        return AbstractC166997dE.A0j(str);
    }

    public static final void A01(EnumC46276Ke8 enumC46276Ke8, UserSession userSession, Integer num, Integer num2, String str, String str2, String str3, String str4) {
        Long l;
        AbstractC167017dG.A1P(str, str2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_media_note_reply_send_client");
        if (A0f.isSampled()) {
            A0f.A9K("target_user_id", AbstractC166997dE.A0j(str));
            A0f.AAP("container_module", str2);
            A0f.AAP("inventory_source", str3);
            Long l2 = null;
            if (num2 != null) {
                l = AbstractC25229BEm.A0n(num2);
            } else {
                l = null;
            }
            A0f.A9K("carousel_index", l);
            AbstractC25233BEq.A17(A0f, "carousel_media_id", str4);
            if (num != null) {
                l2 = AbstractC25229BEm.A0n(num);
            }
            A0f.A9K(AbstractC43591JPw.A00(410), l2);
            A0f.A8R(enumC46276Ke8, AbstractC111324zv.A00(3016));
            A0f.Cht();
        }
    }

    public static final void A02(UserSession userSession, String str, String str2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_media_note_production_nux_new_tooltip_impression_client");
        if (A0f.isSampled()) {
            AbstractC25231BEo.A17(A0f, str2, str);
            A0f.Cht();
        }
    }

    public final void A03(EnumC25577BSp enumC25577BSp, UserSession userSession, Integer num, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1Q(str, str3);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_media_note_report_click_client");
        Long A002 = A00(userSession, str3);
        if (A0f.isSampled() && A002 != null) {
            A0f.A9K("note_id", A002);
            A0f.AAP("container_module", str);
            A0f.A9K("carousel_index", AbstractC25234BEr.A0X(A0f, num, "inventory_source", str2));
            A0f.AAP("carousel_media_id", str4);
            A0f.A8R(enumC25577BSp, "event_source");
            AbstractC167017dG.A1C(A0f);
        }
    }

    public final void A05(UserSession userSession, Integer num, String str, String str2, String str3, String str4) {
        String str5;
        AbstractC167017dG.A1N(userSession, str);
        C14360o3.A0B(str4, 4);
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        if (num.intValue() != 2) {
            str5 = "double_tap";
        } else {
            str5 = "single_tap";
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A02, "instagram_media_note_gesture_nux_interaction_client");
        Long A002 = A00(userSession, str4);
        if (A0f.isSampled() && A002 != null) {
            A0f.A9K("note_id", A002);
            A0f.AAP(AbstractC43591JPw.A00(1013), str5);
            AbstractC25233BEq.A17(A0f, "container_module", str);
            A0f.AAP("inventory_source", str2);
            AbstractC25229BEm.A1B(A0f, str3);
        }
    }
}
