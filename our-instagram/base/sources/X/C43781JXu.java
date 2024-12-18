package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JXu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43781JXu implements C5OV {
    public final UserSession A00;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        UserSession userSession = this.A00;
        if (!new C5zZ(userSession).A02.A01(1)) {
            return false;
        }
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (!AbstractC167017dG.A1b(A00, A00.A7w, C23031Ai.A8c, 509) || !JUW.A02(userSession, false)) {
            return false;
        }
        return true;
    }

    public C43781JXu(UserSession userSession) {
        this.A00 = userSession;
    }
}
