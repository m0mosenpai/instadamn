package X;

import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.urlhandlers.media.ShortUrlReelLoadingFragment;

/* loaded from: classes6.dex */
public final class ET6 extends C1P1 {
    public final String A00;
    public final /* synthetic */ ShortUrlReelLoadingFragment A01;

    public ET6(ShortUrlReelLoadingFragment shortUrlReelLoadingFragment, String str) {
        this.A01 = shortUrlReelLoadingFragment;
        this.A00 = str;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(397053986);
        EDT edt = (EDT) obj;
        int A032 = C0f9.A03(168789099);
        if (edt != null) {
            ShortUrlReelLoadingFragment shortUrlReelLoadingFragment = this.A01;
            C31368DqX A01 = AbstractC31402Dr6.A01(shortUrlReelLoadingFragment.getSession(), edt.A00, "short_url_to_profile_and_launch_reel", "short_url_reel_loading_fragment");
            if (edt.A08) {
                A01.A02 = new AutoLaunchReelParams(C05F.A00, edt.A05, null, null, null, false, true, false, false);
            }
            shortUrlReelLoadingFragment.A00.post(new RunnableC36928GOx(C31368DqX.A00(shortUrlReelLoadingFragment.getSession(), AbstractC31364DqT.A02(), A01), this));
        }
        C0f9.A0A(-73599571, A032);
        C0f9.A0A(956623604, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(152095629);
        ShortUrlReelLoadingFragment shortUrlReelLoadingFragment = this.A01;
        shortUrlReelLoadingFragment.mLoadingSpinner.setLoadingStatus(C3T1.FAILED);
        ViewOnClickListenerC35682FpH.A01(shortUrlReelLoadingFragment.mLoadingSpinner, 24, this);
        C9GR.A0C(shortUrlReelLoadingFragment.getActivity(), "unknown_error_occured");
        C0f9.A0A(220952966, A03);
    }
}
