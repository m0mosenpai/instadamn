package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.7FT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7FT implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "SuggestedStickerTrayFalcoLogger";
    public final C18920wW A00;

    public C7FT(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A01(this, userSession);
    }

    public final void A01(String str, String str2, String str3, String str4) {
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "avatar_stickers_measurement_suggested_sticker_tray_send");
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("referrer_surface", str2);
        c0Zx.A06("composer_text_input_session_id", str3);
        c0Zx.A06("composer_session_id", str);
        if (A00.isSampled()) {
            A00.AAQ(c0Zx, "event_data");
            A00.AAP("avatar_session_id", str4);
            A00.AAP("product", "typeahead");
            A00.Cht();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_suggested_sticker_tray";
    }

    public final void A00(String str, String str2, String str3, long j) {
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "avatar_stickers_measurement_suggested_sticker_tray_impression");
        C0Zx c0Zx = new C0Zx();
        c0Zx.A05("non_avatar_sticker_id", Long.valueOf(j));
        c0Zx.A06("referrer_surface", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
        c0Zx.A06("composer_text_input_session_id", str3);
        c0Zx.A06("composer_session_id", str);
        if (A00.isSampled()) {
            A00.AAQ(c0Zx, "event_data");
            A00.AAP("avatar_session_id", str2);
            A00.AAP("product", "typeahead");
            A00.Cht();
        }
    }
}
