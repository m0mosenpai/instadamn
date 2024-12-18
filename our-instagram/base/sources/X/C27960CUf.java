package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.CUf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27960CUf {
    public final UserSession A00;
    public final CQO A01;

    public final void A00(boolean z) {
        C23031Ai c23031Ai = this.A01.A00;
        AbstractC167007dF.A1L(c23031Ai, c23031Ai.A23, C23031Ai.A8c, 459, z);
    }

    public final boolean A01() {
        C23031Ai c23031Ai = this.A01.A00;
        return !AbstractC167017dG.A1b(c23031Ai, c23031Ai.A23, C23031Ai.A8c, 459);
    }

    public /* synthetic */ C27960CUf(UserSession userSession) {
        CQO cqo = new CQO(AbstractC23021Ah.A00(userSession), userSession);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = cqo;
    }
}
