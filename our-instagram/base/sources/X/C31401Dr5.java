package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.Dr5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31401Dr5 implements InterfaceC42271xH {
    public final /* synthetic */ UserDetailFragment A00;

    public C31401Dr5(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(532915697);
        int A032 = C0f9.A03(1712259001);
        UserDetailTabController userDetailTabController = this.A00.A0z;
        C155876zH c155876zH = userDetailTabController.A0N;
        InterfaceC152836uD A02 = c155876zH.A02(c155876zH.A01("profile_clips"));
        if (A02 != null) {
            A02.DcV(userDetailTabController);
        }
        C0f9.A0A(807726235, A032);
        C0f9.A0A(1048805943, A03);
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        return true;
    }
}
