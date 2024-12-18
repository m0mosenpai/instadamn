package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NtH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53944NtH {
    public static final Integer A00(UserSession userSession, EnumC53117NeU enumC53117NeU, EnumC76383bi enumC76383bi, boolean z) {
        int i;
        boolean A1U = AbstractC167007dF.A1U(enumC53117NeU);
        boolean A1X = AbstractC167007dF.A1X(MSZ.A0i(userSession), C05F.A0C);
        if (enumC76383bi == EnumC76383bi.A04) {
            i = 2131955274;
            if (enumC53117NeU.ordinal() != A1U) {
                i = 2131962418;
            }
        } else if (enumC76383bi == EnumC76383bi.A07) {
            i = 2131955276;
            if (enumC53117NeU.ordinal() != A1U) {
                i = 2131962419;
            }
        } else if (!A1X && enumC76383bi != EnumC76383bi.A08) {
            if (z) {
                return null;
            }
            i = 2131955275;
        } else {
            i = 2131962752;
        }
        return Integer.valueOf(i);
    }
}
