package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.N9i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52219N9i extends C1P1 {
    public final /* synthetic */ C1P1 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C129885ts A02;
    public final /* synthetic */ User A03;

    public C52219N9i(C1P1 c1p1, UserSession userSession, C129885ts c129885ts, User user) {
        this.A00 = c1p1;
        this.A01 = userSession;
        this.A02 = c129885ts;
        this.A03 = user;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1672211280);
        this.A00.onFail(abstractC115105If);
        C0f9.A0A(-162095585, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-308341936);
        int A0N = AbstractC167017dG.A0N(obj, 837768660);
        this.A00.onSuccess(obj);
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A01;
        c08730cb.A01(userSession).A0d(this.A02.A02);
        this.A03.A0e(userSession);
        C0f9.A0A(385962513, A0N);
        C0f9.A0A(-1747601535, A03);
    }
}
