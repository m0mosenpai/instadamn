package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Dqo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31384Dqo implements InterfaceC42271xH {
    public final /* synthetic */ UserDetailFragment A00;

    public C31384Dqo(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        return AbstractC31177DnL.A1Y(this.A00, ((C154946xj) obj).A00);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-2144330419);
        C154946xj c154946xj = (C154946xj) obj;
        int A032 = C0f9.A03(1654424026);
        UserDetailFragment userDetailFragment = this.A00;
        userDetailFragment.A1v = c154946xj.A01;
        userDetailFragment.A1t = c154946xj.A03;
        userDetailFragment.A1z = c154946xj.A04;
        userDetailFragment.A1s = c154946xj.A02;
        if (C18U.A06(C06090Tz.A05, userDetailFragment.A0I, 36323822617636474L)) {
            userDetailFragment.A15.A00(userDetailFragment.getContext(), userDetailFragment.A0z, true, true);
        }
        C0f9.A0A(-1800988234, A032);
        C0f9.A0A(-1031657240, A03);
    }
}
