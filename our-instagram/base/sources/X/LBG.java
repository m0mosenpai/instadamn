package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class LBG {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Long l, String str) {
        C14360o3.A0B(userSession, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_rename_audio_exit_rename_page_successful");
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            A0f.A9K("container_id", l);
            AbstractC25233BEq.A17(A0f, "media_tap_token", str);
            A0f.Cht();
        }
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Long l, String str) {
        C14360o3.A0B(userSession, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_rename_audio_button_tapped");
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            A0f.A9K("container_id", l);
            if (str == null) {
                str = "0";
            }
            AbstractC25233BEq.A17(A0f, "media_tap_token", str);
            A0f.Cht();
        }
    }
}
