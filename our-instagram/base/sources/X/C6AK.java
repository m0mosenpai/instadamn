package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6AK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6AK {
    public final int getEligibilityOverrideFromSharedPreferences(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C2056398n A00 = AbstractC2056298m.A00(userSession);
        return ((Number) A00.A0C.CES(A00, C2056398n.A0d[1])).intValue();
    }

    public final int A00(UserSession userSession) {
        C2056398n A00 = AbstractC2056298m.A00(userSession);
        int intValue = ((Number) A00.A0C.CES(A00, C2056398n.A0d[1])).intValue();
        if (intValue == -1) {
            return (int) ((Number) AbstractC47132Ef.A00(userSession).A1J.getValue()).longValue();
        }
        return intValue;
    }
}
