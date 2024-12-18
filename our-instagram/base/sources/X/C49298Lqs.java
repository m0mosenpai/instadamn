package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.Lqs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49298Lqs implements C7TS {
    public final C25671My A00;
    public final C6JX A01;

    public C49298Lqs(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = C6JW.A00(userSession, "MsysThreadLeaver");
        this.A00 = AbstractC25651Mw.A00(userSession);
    }

    @Override // X.C7TS
    public final void Ch4(C3o9 c3o9) {
        if (c3o9 instanceof MsysThreadId) {
            C42221xC A0R = AbstractC43592JPx.A0R(this.A01.A00.A05(((MsysThreadId) c3o9).A00));
            C41761wQ A0S = AbstractC31174DnI.A0S();
            A0S.A02(A0R, new C49798Lz5(12, A0S, c3o9, this));
            return;
        }
        throw AbstractC31172DnG.A0u();
    }
}
