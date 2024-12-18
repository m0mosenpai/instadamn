package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Iw4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42766Iw4 implements C70R {
    public final /* synthetic */ C37434GeE A00;

    public C42766Iw4(C37434GeE c37434GeE) {
        this.A00 = c37434GeE;
    }

    @Override // X.C70R
    public final void D3X(User user) {
        C14360o3.A0B(user, 0);
        UserSession userSession = this.A00.A05;
        if (C18U.A06(C06090Tz.A05, userSession, 36312475313964161L) && userSession != null) {
            AbstractC25651Mw.A00(userSession).E4s(new C70073Cr(user, true, false, true));
        }
    }
}
