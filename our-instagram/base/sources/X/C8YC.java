package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8YC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8YC implements C8YD {
    @Override // X.C8YD
    public final int BfT(UserSession userSession) {
        return 0;
    }

    @Override // X.C8YD
    public final int BoD(UserSession userSession) {
        return 500;
    }

    @Override // X.C8YD
    public final boolean CZ0() {
        return true;
    }

    @Override // X.C8YD
    public final boolean Ej8(UserSession userSession) {
        return false;
    }

    @Override // X.C8YD
    public final boolean EiG(UserSession userSession) {
        if (System.currentTimeMillis() / 1000 >= AbstractC23021Ah.A00(userSession).A01.getLong(MSV.A00(1015), 0L)) {
            return true;
        }
        return false;
    }

    @Override // X.C8YD
    public final boolean Ej9(UserSession userSession) {
        return false;
    }
}
