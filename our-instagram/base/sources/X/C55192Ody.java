package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Ody, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55192Ody {
    public static final C55192Ody A00 = new Object();

    public static final void A02(EnumC53337Nin enumC53337Nin, EnumC53346Niw enumC53346Niw, EnumC53354Nj4 enumC53354Nj4, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_p92_onboarding_impression");
        if (A0f.isSampled()) {
            A0f.AAP("onboarding_session_id", str);
            A0f.A8R(enumC53337Nin, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.A8R(enumC53354Nj4, "step_name");
            if (enumC53346Niw != null) {
                C0Zx c0Zx = new C0Zx();
                c0Zx.A01(enumC53346Niw, "toggle_state");
                A0f.AAQ(c0Zx, "privacy_selection_step_info");
            }
            A0f.Cht();
        }
    }

    public final void A05(UserSession userSession, boolean z) {
        MU0 mu0;
        C14360o3.A0B(userSession, 0);
        C82G c82g = C82G.A07;
        if (z) {
            mu0 = MU0.AUTO_ON;
        } else {
            mu0 = MU0.AUTO_OFF;
        }
        A00(mu0, MU1.FEED, c82g, null, userSession, true);
    }

    public static final void A03(EnumC53361NjC enumC53361NjC, EnumC53346Niw enumC53346Niw, EnumC53354Nj4 enumC53354Nj4, UserSession userSession, String str) {
        A01(EnumC53337Nin.A02, enumC53361NjC, null, null, null, enumC53346Niw, enumC53354Nj4, userSession, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A04(UserSession userSession, String str, boolean z, boolean z2) {
        C51411MnJ c51411MnJ;
        MU0 mu0;
        if (str != null) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("unavailable_reason", str);
            c51411MnJ = c0Zx;
        } else {
            c51411MnJ = null;
        }
        C82G c82g = C82G.A0E;
        if (z) {
            mu0 = MU0.VIEW;
        } else {
            mu0 = MU0.UNAVAILABLE;
        }
        A00(mu0, MU1.FEED, c82g, c51411MnJ, userSession, z2);
    }

    public static final void A00(MU0 mu0, MU1 mu1, C82G c82g, C51411MnJ c51411MnJ, UserSession userSession, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "crosspost_controls");
        C0Zx c0Zx = new C0Zx();
        c0Zx.A03("is_account_linked", Boolean.valueOf(z));
        c0Zx.A03("is_auto_xpost_enabled", Boolean.valueOf(AbstractC31172DnG.A1a(AbstractC173927ok.A00(userSession).A00, "PREFERENCE_SHARE_TO_BARCELONA_AUTO_POSTING")));
        if (A0f.isSampled()) {
            A0f.A8R(c82g, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.A8R(mu0, "event_type");
            A0f.A8R(mu1, "product_type");
            A0f.AAQ(c0Zx, "user_info");
            A0f.AAQ(c51411MnJ, "creation_info");
            A0f.Cht();
        }
    }

    public static final void A01(EnumC53337Nin enumC53337Nin, EnumC53361NjC enumC53361NjC, EnumC53353Nj3 enumC53353Nj3, EnumC53344Niu enumC53344Niu, EnumC53345Niv enumC53345Niv, EnumC53346Niw enumC53346Niw, EnumC53354Nj4 enumC53354Nj4, UserSession userSession, String str) {
        C0Zx c0Zx;
        String str2;
        AbstractC167017dG.A1N(userSession, str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_p92_onboarding_tap");
        if (A0f.isSampled()) {
            A0f.AAP("onboarding_session_id", str);
            A0f.A8R(enumC53337Nin, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.A8R(enumC53354Nj4, "step_name");
            A0f.A8R(enumC53361NjC, "event_type");
            if (enumC53344Niu != null) {
                c0Zx = new C0Zx();
                c0Zx.A01(enumC53344Niu, "interaction");
                str2 = "login_step_info";
            } else if (enumC53346Niw != null) {
                c0Zx = new C0Zx();
                c0Zx.A01(enumC53346Niw, "toggle_state");
                if (enumC53345Niv != null) {
                    c0Zx.A01(enumC53345Niv, "interaction");
                }
                str2 = "privacy_selection_step_info";
            } else {
                if (enumC53353Nj3 != null) {
                    c0Zx = new C0Zx();
                    c0Zx.A01(EnumC53338Nio.A02, "interaction");
                    c0Zx.A01(enumC53353Nj3, "learn_more_section");
                    str2 = "how_it_works_step_info";
                }
                A0f.Cht();
            }
            A0f.AAQ(c0Zx, str2);
            A0f.Cht();
        }
    }
}
