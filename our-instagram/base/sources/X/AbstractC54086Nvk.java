package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Nvk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54086Nvk {
    public static final boolean A00(UserSession userSession, ShareType shareType, boolean z) {
        C06090Tz c06090Tz;
        long j;
        C14360o3.A0B(shareType, 0);
        AbstractC54085Nvj abstractC54085Nvj = AbstractC54085Nvj.$redex_init_class;
        int ordinal = shareType.ordinal();
        if (ordinal != 9 && ordinal != 2 && ordinal != 4) {
            if (ordinal != 1 && ordinal != 3) {
                if (!z || !AbstractC14490oL.A0C(AbstractC12290kX.A00) || !C18U.A06(C06090Tz.A05, userSession, 36320841911509944L)) {
                    if (!AbstractC14490oL.A09(AbstractC12290kX.A00)) {
                        return false;
                    }
                    c06090Tz = C06090Tz.A05;
                    j = 36328671635586774L;
                }
            } else {
                if (!z) {
                    return false;
                }
                c06090Tz = C06090Tz.A05;
                j = 36320841911575481L;
            }
            if (!C18U.A06(c06090Tz, userSession, j)) {
                return false;
            }
        }
        return true;
    }
}
