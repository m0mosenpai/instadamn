package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* loaded from: classes8.dex */
public abstract class LCW {
    public static final void A00(UserSession userSession, DirectThreadKey directThreadKey, C47Z c47z, C40121td c40121td) {
        C14360o3.A0B(c40121td, 3);
        if (A01(userSession, directThreadKey)) {
            PendingMediaStore A00 = C25A.A00(userSession);
            A00.A07.add(c47z.A35);
            return;
        }
        c40121td.A09(c47z);
    }

    public static final boolean A01(UserSession userSession, DirectThreadKey directThreadKey) {
        boolean z = false;
        if (!C18U.A06(C06090Tz.A05, userSession, 2342164439534675380L)) {
            return false;
        }
        C81663kb A03 = C2DU.A03((C2DU) AbstractC28761aE.A00(userSession), directThreadKey);
        if (A03 != null && AbstractC31283Dp5.A00(A03)) {
            z = true;
        }
        return !z;
    }
}
