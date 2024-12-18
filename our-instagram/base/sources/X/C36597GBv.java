package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GBv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36597GBv implements C5OV {
    public final UserSession A00;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A00;
        if (c08730cb.A01(userSession).A0M() == C05F.A01 && AbstractC31269Dor.A00(userSession)) {
            return true;
        }
        return false;
    }

    public C36597GBv(UserSession userSession) {
        this.A00 = userSession;
    }
}
