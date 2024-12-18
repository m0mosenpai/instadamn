package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Nrp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53861Nrp {
    public static final void A00(C2JL c2jl, UserSession userSession, String str) {
        C2JM A0b = AbstractC25225BEi.A0b();
        A0b.A04("effect_id", str);
        C907442n c907442n = new C907442n(A0b, C51555Mpf.class, "IGRemoveAREffectMutation", true);
        C195928le.A00(userSession).ATV(new C55661Onm(c2jl, 2), new MV7(c2jl, 3), c907442n);
    }
}
