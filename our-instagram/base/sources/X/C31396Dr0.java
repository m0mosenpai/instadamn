package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Dr0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31396Dr0 implements InterfaceC42271xH {
    public final /* synthetic */ UserDetailFragment A00;

    public C31396Dr0(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        throw AbstractC166987dD.A15("mUserId");
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(781113595);
        int A032 = C0f9.A03(-968765396);
        UserDetailFragment userDetailFragment = this.A00;
        if (userDetailFragment.isResumed()) {
            UserDetailFragment.A0M(userDetailFragment.getContext(), userDetailFragment);
        } else {
            userDetailFragment.A1y = true;
        }
        C0f9.A0A(1803283811, A032);
        C0f9.A0A(731585178, A03);
    }
}
