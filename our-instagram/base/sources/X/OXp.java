package X;

import com.facebookpay.offsite.models.message.PayButtonCTAType$Companion;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class OXp {
    public static final EnumC53334Nik A00(String str) {
        for (EnumC53334Nik enumC53334Nik : EnumC53334Nik.values()) {
            if (C14360o3.A0K(enumC53334Nik.A00, str)) {
                return enumC53334Nik;
            }
        }
        return null;
    }

    public static final EnumC53335Nil A01(String str) {
        for (EnumC53335Nil enumC53335Nil : EnumC53335Nil.values()) {
            if (C14360o3.A0K(enumC53335Nil.A00, str)) {
                return enumC53335Nil;
            }
        }
        return null;
    }

    public static final void A02(UserSession userSession, boolean z) {
        String str;
        C448424o c448424o = AnonymousClass229.A01(userSession).A0C;
        EnumC114925Hg enumC114925Hg = EnumC114925Hg.STORY;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448424o.A01, "ig_camera_nux");
        if (A0f.isSampled()) {
            if (z) {
                str = PayButtonCTAType$Companion.CONTINUE;
            } else {
                str = "DISMISS";
            }
            MSW.A1R(A0f, "GLASSES_CAMERA_BLUETOOTH_PROMPT");
            A0f.AAP("nux_step", str);
            C22M c22m = c448424o.A04;
            MSZ.A1E(A0f, c22m, "camera_session_id", MSX.A0f(c22m));
            A0f.A8R(enumC114925Hg, "camera_destination");
            A0f.Cht();
        }
    }
}
