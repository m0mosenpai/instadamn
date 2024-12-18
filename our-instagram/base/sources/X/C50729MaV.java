package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;

/* renamed from: X.MaV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50729MaV implements InterfaceC65982ya {
    public final int A00;
    public final Object A01;

    public C50729MaV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65982ya
    public final void Dbp(C47Z c47z) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c47z, 0);
                if (c47z.A0m()) {
                    return;
                }
                EnumC915447k enumC915447k = c47z.A6J;
                EnumC915447k enumC915447k2 = EnumC915447k.A02;
                if (enumC915447k != enumC915447k2 || c47z.A1f != enumC915447k2) {
                    return;
                }
                C25877Bcc c25877Bcc = (C25877Bcc) this.A01;
                C47Z c47z2 = c25877Bcc.A00;
                if (c47z2 != null) {
                    c47z2.A0X(c25877Bcc.A08);
                }
                c25877Bcc.A00 = null;
                C25877Bcc.A04(c25877Bcc, true);
                MBq.A01(c25877Bcc, AbstractC141776au.A00(c25877Bcc), 9);
                return;
            case 1:
                C14360o3.A0B(c47z, 0);
                if (c47z.A1f != EnumC915447k.A09) {
                    return;
                }
                c47z.A0X(this);
                FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A01;
                if (!FollowersShareFragment.A0Q(followersShareFragment) || C55183Odo.A00(FollowersShareFragment.A00(followersShareFragment), true) <= 3) {
                    return;
                }
                UserSession A0r = AbstractC166987dD.A0r(followersShareFragment.A0e);
                NJK njk = followersShareFragment.A0G;
                if (njk == null) {
                    MSW.A1K();
                    throw C00O.createAndThrow();
                }
                String str = njk.A0M;
                C47Z A01 = AbstractC55082Oac.A01(followersShareFragment);
                if (A01 != null) {
                    String str2 = A01.A3t;
                    long currentTimeMillis = System.currentTimeMillis() - followersShareFragment.A00;
                    boolean A1V = MSX.A1V(followersShareFragment);
                    AbstractC167007dF.A1D(A0r, 0, str);
                    InterfaceC02590Ai A012 = AbstractC55216Oef.A01(AbstractC37302Gc3.A0I(followersShareFragment, A0r), A0r, "ig_suggested_tags_media_uploaded", str2);
                    A012.AAP(AbstractC50635MWw.A01(), str);
                    AbstractC50522MSa.A1D(A012, A0r.userId);
                    AbstractC43593JPy.A1F(A012, currentTimeMillis);
                    MSY.A18(A012, A1V);
                    A012.Cht();
                    FollowersShareFragment.A0I(followersShareFragment, c47z);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 2:
                C14360o3.A0B(c47z, 0);
                ((InterfaceC24741Ir) this.A01).F8s(Integer.valueOf(c47z.A03()));
                return;
            default:
                C14360o3.A0B(c47z, 0);
                ((InterfaceC24741Ir) this.A01).F8s(c47z);
                return;
        }
    }
}
