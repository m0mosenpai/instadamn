package X;

import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;

/* loaded from: classes9.dex */
public final class PQS implements Runnable {
    public final /* synthetic */ C55984OtH A00;
    public final /* synthetic */ FollowersShareFragment A01;

    public PQS(C55984OtH c55984OtH, FollowersShareFragment followersShareFragment) {
        this.A01 = followersShareFragment;
        this.A00 = c55984OtH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC50810Mcb abstractC50810Mcb;
        OL7 ol7;
        FollowersShareFragment followersShareFragment = this.A01;
        if (!AbstractC55222Oeo.A0B(followersShareFragment)) {
            int intValue = this.A00.A00.intValue();
            boolean z = true;
            if (intValue != 0) {
                if (intValue == 2 && (ol7 = followersShareFragment.shareToBarcelonaViewBinder) != null) {
                    abstractC50810Mcb = ol7.A04;
                } else {
                    return;
                }
            } else {
                OL7 ol72 = followersShareFragment.shareToBarcelonaViewBinder;
                if (ol72 == null) {
                    return;
                }
                abstractC50810Mcb = ol72.A04;
                z = false;
            }
            abstractC50810Mcb.setEnabledState(z);
        }
    }
}
