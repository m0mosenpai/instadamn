package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.GfI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37500GfI implements InterfaceC41501vz {
    public final /* synthetic */ UserDetailFragment A00;

    public C37500GfI(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(1683805130);
        C155116y0 c155116y0 = (C155116y0) obj;
        int A032 = C0f9.A03(2126367135);
        UserDetailFragment userDetailFragment = this.A00;
        if (userDetailFragment.A12()) {
            Reel reel = c155116y0.A00;
            IM8 im8 = new IM8(ProfileGridItemTypeEnum.A04, null, reel);
            IM7 im7 = userDetailFragment.A0q.A04;
            im7.A02.remove(reel.getId());
            im7.A03.remove(reel);
            UserDetailTabController userDetailTabController = userDetailFragment.A0z;
            EnumC125775mS enumC125775mS = EnumC125775mS.A06;
            C42749Ivn c42749Ivn = userDetailTabController.A02;
            if (c42749Ivn != null) {
                C42747Ivl A00 = C42749Ivn.A00(c42749Ivn, enumC125775mS);
                A00.A07.A0E(im8.A00());
                C42747Ivl.A00(A00);
            }
        }
        C0f9.A0A(-986212105, A032);
        C0f9.A0A(1651561518, A03);
    }
}
