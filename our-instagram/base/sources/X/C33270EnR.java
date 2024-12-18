package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.EnR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33270EnR extends AbstractC77473dX {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        C14360o3.A0B(user, 0);
        user.A0k(AbstractC31174DnI.A0j(this.A00, user));
        this.A01.invoke(user.B7L());
    }

    public C33270EnR(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = interfaceC16660sJ;
    }
}
