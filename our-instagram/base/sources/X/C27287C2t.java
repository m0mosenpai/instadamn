package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.C2t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27287C2t extends AbstractC77473dX {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C76223bS A01;
    public final /* synthetic */ C168127f7 A02;
    public final /* synthetic */ C26390BlZ A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ C32967Eey A05;

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        C14360o3.A0B(user, 0);
        C32967Eey c32967Eey = this.A05;
        if (c32967Eey != null) {
            c32967Eey.A0A(this.A04, this.A00);
        }
        FollowStatus A0N = C57582kX.A00(this.A03.A00).A0N(user);
        if (A0N == FollowStatus.A05 || A0N == FollowStatus.A07) {
            C168127f7 c168127f7 = this.A02;
            int i = this.A00;
            C76223bS c76223bS = this.A01;
            c168127f7.A02(C05F.A0C, i, AbstractC25228BEl.A07(c76223bS, AbstractC77623dm.A07(c76223bS)));
        }
    }

    public C27287C2t(C76223bS c76223bS, C168127f7 c168127f7, C26390BlZ c26390BlZ, User user, C32967Eey c32967Eey, int i) {
        this.A05 = c32967Eey;
        this.A00 = i;
        this.A04 = user;
        this.A03 = c26390BlZ;
        this.A02 = c168127f7;
        this.A01 = c76223bS;
    }
}
