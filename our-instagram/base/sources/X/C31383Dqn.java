package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Dqn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31383Dqn implements InterfaceC42271xH {
    public final /* synthetic */ UserDetailFragment A00;

    public C31383Dqn(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        return AbstractC31177DnL.A1Y(this.A00, ((C154956xk) obj).A00.getId());
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-498093872);
        int A032 = C0f9.A03(-622340567);
        UserDetailFragment userDetailFragment = this.A00;
        if (C18U.A06(C06090Tz.A05, userDetailFragment.A0I, 36323822617636474L)) {
            userDetailFragment.A15.A00(userDetailFragment.getContext(), userDetailFragment.A0z, true, true);
        }
        C0f9.A0A(1613435581, A032);
        C0f9.A0A(-717258074, A03);
    }
}
