package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.92f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2043092f {
    public final User A00;

    public C2043092f(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = C08730cb.A00(userSession).A00();
    }

    public final boolean A00(EnumC124815km enumC124815km) {
        int ordinal = enumC124815km.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return false;
            }
            return C14360o3.A0K(this.A00.A03.CZ8(), true);
        }
        return this.A00.A2E();
    }
}
