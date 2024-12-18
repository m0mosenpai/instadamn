package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.user.model.User;

/* renamed from: X.Jc8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43959Jc8 {
    public static final boolean A00(UserSession userSession) {
        User A10 = AbstractC166987dD.A10(userSession);
        MonetizationRepository A00 = AbstractC63302u8.A00(userSession);
        Boolean Al9 = A10.A03.Al9();
        if ((Al9 == null || !Al9.booleanValue()) && !A00.A03(UserMonetizationProductType.A07)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        User A10 = AbstractC166987dD.A10(userSession);
        MonetizationRepository A00 = AbstractC63302u8.A00(userSession);
        if (!A10.A1P() && !A00.A03(UserMonetizationProductType.A08)) {
            return false;
        }
        return true;
    }
}
