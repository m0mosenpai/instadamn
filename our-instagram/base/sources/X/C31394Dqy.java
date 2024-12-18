package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Dqy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31394Dqy implements InterfaceC41501vz {
    public final /* synthetic */ UserDetailFragment A00;

    public C31394Dqy(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = C0f9.A03(1722146504);
        int A032 = C0f9.A03(-304574694);
        UserDetailFragment userDetailFragment = this.A00;
        C33616EtS c33616EtS = userDetailFragment.A31;
        if (c33616EtS.A02 && (i = c33616EtS.A00) != -1 && c33616EtS.A01 != -1) {
            c33616EtS.A00 = i + 1;
            userDetailFragment.A0z.A0M(c33616EtS);
        } else {
            UserDetailFragment.A0T(userDetailFragment);
        }
        C0f9.A0A(955901715, A032);
        C0f9.A0A(-1526903543, A03);
    }
}
