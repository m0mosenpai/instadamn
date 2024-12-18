package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.I1z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40693I1z {
    public static final EnumC71153Hb A00(UserSession userSession, Integer num) {
        if (num == C05F.A0C) {
            C06090Tz c06090Tz = C06090Tz.A06;
            String A04 = C18U.A04(c06090Tz, userSession, 36881884898787752L);
            EnumC71153Hb enumC71153Hb = EnumC71153Hb.A03;
            if (!C14360o3.A0K(A04, "afi_ad_dwell_see_more_click")) {
                String A042 = C18U.A04(c06090Tz, userSession, 36881884898787752L);
                enumC71153Hb = EnumC71153Hb.A04;
                if (!C14360o3.A0K(A042, "afi_view_similar")) {
                    return null;
                }
            }
            return enumC71153Hb;
        }
        return null;
    }
}
