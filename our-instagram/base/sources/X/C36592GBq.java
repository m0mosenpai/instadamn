package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GBq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36592GBq implements C5OV {
    public final UserSession A00;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        UserSession userSession = this.A00;
        C2049995m A01 = C2049995m.A01(userSession);
        C14360o3.A07(A01);
        String str = userSession.userId;
        if (A01.A06(str) && C2049995m.A00(A01, str) > 0) {
            return true;
        }
        return false;
    }

    public C36592GBq(UserSession userSession) {
        this.A00 = userSession;
    }
}
