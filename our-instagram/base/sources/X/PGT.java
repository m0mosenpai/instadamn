package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;

/* loaded from: classes9.dex */
public final class PGT implements InterfaceC57992Pnc {
    public final int A00;
    public final Object A01;

    public PGT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC57992Pnc
    public final void Dgl(Integer num) {
        Context context;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(num, 0);
                if (num != C05F.A01) {
                    return;
                }
                OL7 ol7 = (OL7) this.A01;
                ol7.A05.A00 = false;
                ol7.A01(false);
                return;
            case 1:
                C14360o3.A0B(num, 0);
                if (num != C05F.A00) {
                    return;
                }
                P0G p0g = (P0G) this.A01;
                UserSession userSession = p0g.A06;
                if (!C55627OnC.A04(userSession)) {
                    return;
                }
                Context requireContext = p0g.A05.requireContext();
                String A02 = C6WI.A02();
                C14360o3.A07(A02);
                C55627OnC.A01(requireContext, userSession, null, A02);
                C5SW c5sw = p0g.A07.A0K.A00;
                if (c5sw == null || !c5sw.A09()) {
                    return;
                }
                c5sw.A08(true);
                return;
            case 2:
                C14360o3.A0B(num, 0);
                if (num != C05F.A00) {
                    return;
                }
                FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A01;
                CallerContext callerContext = FollowersShareFragment.A0z;
                FragmentActivity activity = followersShareFragment.getActivity();
                if (activity == null || (context = followersShareFragment.getContext()) == null) {
                    return;
                }
                C52527NLw A00 = AbstractC53978Ntp.A00(AbstractC166987dD.A0O(context), AbstractC166987dD.A0r(followersShareFragment.A0e), "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL");
                if (!A00.isUpsellEligible()) {
                    FollowersShareFragment.A0E(followersShareFragment);
                    return;
                } else {
                    A00.A00 = new C54764OHw(followersShareFragment, A00);
                    A00.showUpsell(null, activity);
                    return;
                }
            case 3:
                C14360o3.A0B(num, 0);
                if (num != C05F.A01) {
                    return;
                }
                AbstractC25651Mw.A00(((P1E) this.A01).A0J).A05(new C55987OtK(false));
                return;
            default:
                P23 p23 = (P23) this.A01;
                if (num == C05F.A00) {
                    P23.A00(p23);
                    return;
                }
                return;
        }
    }
}
