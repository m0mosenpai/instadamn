package X;

import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import com.instagram.pendingmedia.model.constants.ShareType;

/* loaded from: classes9.dex */
public final class PMX implements Runnable {
    public final /* synthetic */ FollowersShareFragment A00;

    public PMX(FollowersShareFragment followersShareFragment) {
        this.A00 = followersShareFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FollowersShareFragment followersShareFragment = this.A00;
        if (FollowersShareFragment.A01(followersShareFragment).A05()) {
            FollowersShareFragment.A02(followersShareFragment).A03();
            AbstractC55082Oac.A00(followersShareFragment).A0c(ShareType.A0H);
        }
    }
}
