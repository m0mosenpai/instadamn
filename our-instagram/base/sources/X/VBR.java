package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class VBR extends AbstractC77473dX {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UBD A01;
    public final /* synthetic */ C47O A02;

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        C14360o3.A0B(user, 0);
        int i = this.A00;
        if (i != -1) {
            UBD ubd = this.A01;
            C47K c47k = ubd.A01;
            if (c47k != null) {
                C47O c47o = this.A02;
                ubd.A07.Dqr(c47o, c47k.A0C, "fish-eye", c47k.getId(), c47k.A0I, c47k.A01, i);
            }
            FollowStatus A0N = C57582kX.A00(ubd.A06).A0N(user);
            if (A0N == FollowStatus.A05 || A0N == FollowStatus.A07) {
                ubd.A08.run();
            }
        }
        if (AbstractC65752yD.A00) {
            C0fA.A00(this.A01, -563442104);
        }
    }

    public VBR(UBD ubd, C47O c47o, int i) {
        this.A00 = i;
        this.A01 = ubd;
        this.A02 = c47o;
    }
}
