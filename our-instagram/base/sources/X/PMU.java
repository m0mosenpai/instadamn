package X;

import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;

/* loaded from: classes9.dex */
public final class PMU implements Runnable {
    public final /* synthetic */ FollowersShareFragment A00;

    public PMU(FollowersShareFragment followersShareFragment) {
        this.A00 = followersShareFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FollowersShareFragment followersShareFragment = this.A00;
        C47Z A05 = FollowersShareFragment.A05(followersShareFragment);
        if (A05 != null && !A05.A5S && followersShareFragment.getActivity() != null && followersShareFragment.isAdded()) {
            C40121td A01 = C40121td.A0G.A01(followersShareFragment.requireActivity(), AbstractC166987dD.A0r(followersShareFragment.A0e));
            EnumC915447k enumC915447k = EnumC915447k.A07;
            A05.A0a(enumC915447k);
            A05.A0b(enumC915447k);
            A01.A05.A04();
            if (A05.A0t()) {
                A05.A0j(AbstractC166987dD.A1E());
            }
        }
    }
}
