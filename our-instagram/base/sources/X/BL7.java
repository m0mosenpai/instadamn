package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BL7 extends C3r5 {
    public final UserSession A00;

    public final InterfaceC30877Dhq A05(C37644Ghd c37644Ghd) {
        EnumC75183Zl enumC75183Zl;
        int i;
        boolean A06 = C18U.A06(C06090Tz.A05, this.A00, 36330183464076008L);
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c75113Zb != null) {
            enumC75183Zl = (EnumC75183Zl) c75113Zb.A3b.A00;
        } else {
            enumC75183Zl = null;
        }
        if (A06 && enumC75183Zl != null) {
            int ordinal = enumC75183Zl.ordinal();
            if (ordinal != 3 && ordinal != 1) {
                i = 2131965665;
                if (ordinal != 2) {
                    i = 2131973211;
                }
            } else {
                i = 2131973204;
            }
            return new BOK(i);
        }
        return BT5.A00;
    }

    public BL7(UserSession userSession) {
        this.A00 = userSession;
    }
}
