package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class LJH {
    public static final void A03(UserSession userSession, String str, String str2, String str3) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "avatars_core_experience_instant_avatars_entry_point_submit");
        if (A0f.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("raw_referrer_surface", str);
            c0Zx.A06("use_case", str2);
            c0Zx.A03("has_previous_avatar", false);
            AbstractC43593JPy.A1G(A0f, c0Zx, str3);
            A0f.Cht();
        }
    }

    public static final void A00(UserSession userSession, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "avatars_core_experience_avatar_editor_entry_point_impression");
        if (A0f.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("raw_referrer_surface", str);
            A0f.AAQ(c0Zx, "event_data");
            A0f.Cht();
        }
    }

    public static final void A01(UserSession userSession, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "avatars_core_experience_instant_avatars_entry_point_impression");
        if (A0f.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("raw_referrer_surface", str);
            A0f.AAQ(c0Zx, "event_data");
            A0f.Cht();
        }
    }

    public static final void A02(UserSession userSession, String str, String str2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(userSession), "avatars_core_experience_avatar_editor_entry_point_submit");
        if (A0f.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("raw_referrer_mechanism", "create_avatar");
            if (str2 != null) {
                c0Zx.A06("raw_referrer_surface", str);
                AbstractC43593JPy.A1G(A0f, c0Zx, str2);
            } else {
                c0Zx.A06("raw_referrer_surface", str);
                A0f.AAQ(c0Zx, "event_data");
            }
            A0f.Cht();
        }
    }
}
