package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Ink, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42260Ink implements InterfaceC42271xH {
    public final /* synthetic */ C42277Io1 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C1563970j A02;

    public C42260Ink(C42277Io1 c42277Io1, UserSession userSession, C1563970j c1563970j) {
        this.A00 = c42277Io1;
        this.A01 = userSession;
        this.A02 = c1563970j;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C36094FwU c36094FwU = (C36094FwU) obj;
        C14360o3.A0B(c36094FwU, 0);
        return C14360o3.A0K(c36094FwU.A00.getId(), this.A00.A05);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        FollowStatus followStatus;
        int A03 = C0f9.A03(-125578897);
        C36094FwU c36094FwU = (C36094FwU) obj;
        int A032 = C0f9.A03(773586541);
        C14360o3.A0B(c36094FwU, 0);
        C42277Io1 c42277Io1 = this.A00;
        User user = c36094FwU.A00;
        c42277Io1.A04 = user;
        c42277Io1.A06 = user.getUsername();
        c42277Io1.A05 = user.getId();
        User user2 = c42277Io1.A04;
        if (user2 != null) {
            followStatus = user2.B7L();
        } else {
            followStatus = null;
        }
        if (followStatus == FollowStatus.A08) {
            AbstractC129875tr.A00(this.A01).A0G(user, false);
        }
        UserSession userSession = this.A01;
        c42277Io1.A02(userSession, this.A02);
        AbstractC25651Mw.A00(userSession).A02(this, C36094FwU.class);
        C0f9.A0A(-722594906, A032);
        C0f9.A0A(1267726499, A03);
    }
}
