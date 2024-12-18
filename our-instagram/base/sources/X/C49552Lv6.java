package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lv6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49552Lv6 implements C5OV {
    public final UserSession A00;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A00;
        if (C2E7.A01(c08730cb.A01(userSession))) {
            Boolean bool = (Boolean) ((C2DU) AbstractC28761aE.A00(userSession)).A0C.A0E.get(C47062Du.A00);
            if ((bool != null && bool.booleanValue()) || C18U.A06(C06090Tz.A05, userSession, 36315833978326632L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C49552Lv6(UserSession userSession) {
        this.A00 = userSession;
    }
}
