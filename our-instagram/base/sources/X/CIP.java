package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class CIP {
    public static final void A00(UserSession userSession, String str, String str2, String str3) {
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), "ig_creator_guidance_experiment_debug");
        if (A0f.isSampled()) {
            A0f.AAP("condition", str2);
            A0f.AAP("exposure_identifier", str3);
            A0f.AAP("universe", "ig_achievements_2024");
            A0f.Cht();
        }
    }
}
