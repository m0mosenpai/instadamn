package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.G5d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36428G5d implements MQ0 {
    @Override // X.MQ0
    public final boolean AT8(UserSession userSession, Object obj) {
        C14360o3.A0B(userSession, 1);
        Context A0F = AbstractC25225BEi.A0F(userSession);
        EnumC47122Ee enumC47122Ee = EnumC47122Ee.A08;
        C14360o3.A0B(enumC47122Ee, 1);
        return AbstractC166997dE.A1Z(AbstractC47112Ed.A00(A0F, enumC47122Ee, false), true);
    }

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "system setting - direct channel disabled";
    }
}
