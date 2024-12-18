package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.Dr3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31399Dr3 implements InterfaceC42271xH {
    public final /* synthetic */ UserDetailFragment A00;

    public C31399Dr3(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        return ((C71M) obj).A01.equalsIgnoreCase(this.A00.A10.A02());
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = C0f9.A03(1517110482);
        C71M c71m = (C71M) obj;
        int A032 = C0f9.A03(1646008383);
        UserDetailFragment userDetailFragment = this.A00;
        User user = userDetailFragment.A10.A03;
        if (user == null) {
            i = 1129659441;
        } else {
            user.A03.EV2(c71m.A00);
            InterfaceC109944xO B9U = user.A03.B9U();
            if (B9U != null && B9U.getDescription() != null) {
                userDetailFragment.A0m();
            } else {
                userDetailFragment.A0p();
            }
            i = -390033527;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-654007103, A03);
    }
}
