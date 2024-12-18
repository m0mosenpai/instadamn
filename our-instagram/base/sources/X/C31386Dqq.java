package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.Dqq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31386Dqq implements InterfaceC42271xH {
    public final /* synthetic */ UserDetailFragment A00;

    public C31386Dqq(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        return AbstractC31177DnL.A1Y(this.A00, ((C70063Cq) obj).A00.getId());
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1787430465);
        int A032 = C0f9.A03(-1202234027);
        UserDetailFragment userDetailFragment = this.A00;
        User user = userDetailFragment.A10.A03;
        if (user != null) {
            userDetailFragment.A0z.A0S(user, true);
        }
        C0f9.A0A(1802669709, A032);
        C0f9.A0A(1372984235, A03);
    }
}
