package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import java.util.Arrays;

/* renamed from: X.GfH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37499GfH implements InterfaceC41501vz {
    public final /* synthetic */ UserDetailFragment A00;

    public C37499GfH(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C42747Ivl A00;
        Integer num;
        C38321qM c38321qM;
        int A03 = C0f9.A03(1420403304);
        C155106xz c155106xz = (C155106xz) obj;
        int A032 = C0f9.A03(-1256535428);
        UserDetailFragment userDetailFragment = this.A00;
        if (userDetailFragment.A12()) {
            Reel reel = c155106xz.A01;
            IM8 im8 = new IM8(ProfileGridItemTypeEnum.A04, null, reel);
            if (c155106xz.A02 && userDetailFragment.A1w) {
                userDetailFragment.A0q.A04.A00(Arrays.asList(reel));
                UserDetailTabController userDetailTabController = userDetailFragment.A0z;
                EnumC125775mS enumC125775mS = EnumC125775mS.A06;
                int i = c155106xz.A00;
                C42749Ivn c42749Ivn = userDetailTabController.A02;
                if (c42749Ivn != null) {
                    A00 = C42749Ivn.A00(c42749Ivn, enumC125775mS);
                    int i2 = -1;
                    C39144HKx c39144HKx = A00.A07;
                    int i3 = 0;
                    for (Object obj2 : ((AbstractC65332xV) c39144HKx).A01) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        IM8 im82 = (IM8) obj2;
                        long j = 0;
                        if (im82.A01 == ProfileGridItemTypeEnum.A05) {
                            C38321qM c38321qM2 = im82.A02;
                            if (c38321qM2 != null) {
                                j = c38321qM2.A1B();
                            }
                        } else {
                            Reel reel2 = im82.A03;
                            if (reel2 != null && (num = reel2.A0i) != null) {
                                j = num.intValue();
                            }
                        }
                        if (i > j && i2 == -1 && (c38321qM = im82.A02) != null && !c38321qM.A6o(A00.A02.userId)) {
                            i2 = i3;
                        }
                        i3 = i4;
                    }
                    if (i2 != -1) {
                        AbstractC65332xV.A01(c39144HKx, im8, i2, true);
                        C42747Ivl.A00(A00);
                    }
                }
            } else {
                IM7 im7 = userDetailFragment.A0q.A04;
                im7.A02.remove(reel.getId());
                im7.A03.remove(reel);
                UserDetailTabController userDetailTabController2 = userDetailFragment.A0z;
                EnumC125775mS enumC125775mS2 = EnumC125775mS.A06;
                C42749Ivn c42749Ivn2 = userDetailTabController2.A02;
                if (c42749Ivn2 != null) {
                    A00 = C42749Ivn.A00(c42749Ivn2, enumC125775mS2);
                    A00.A07.A0E(im8.A00());
                    C42747Ivl.A00(A00);
                }
            }
        }
        C0f9.A0A(-1427743296, A032);
        C0f9.A0A(-912054914, A03);
    }
}
