package X;

import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vxn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69922Vxn {
    public static final boolean A00(PromoteData promoteData) {
        String str;
        String str2 = promoteData.A1C;
        if (str2 == null || str2.length() == 0 || (str = promoteData.A1D) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean A01(PromoteData promoteData, UserSession userSession) {
        PromoteAudience A06;
        boolean A1a = AbstractC167017dG.A1a(promoteData, userSession);
        if (!promoteData.A2E && (A06 = promoteData.A06()) != null && A06.A0C == A1a && C18U.A06(C06090Tz.A05, userSession, 36318509743020264L)) {
            return true;
        }
        return false;
    }
}
