package X;

import android.view.animation.Animation;
import com.instagram.genericsurvey.fragment.AdBakeOffFragment;
import com.instagram.genericsurvey.fragment.BakeoffFeedPairSectionController;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Hap, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39405Hap extends AbstractAnimationAnimationListenerC55507Ol0 {
    public final /* synthetic */ AdBakeOffFragment A00;
    public final /* synthetic */ String A01;

    public C39405Hap(AdBakeOffFragment adBakeOffFragment, String str) {
        this.A00 = adBakeOffFragment;
        this.A01 = str;
    }

    @Override // X.AbstractAnimationAnimationListenerC55507Ol0, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AdBakeOffFragment adBakeOffFragment = this.A00;
        AdBakeOffFragment.A03(adBakeOffFragment);
        String str = this.A01;
        if ("bakeoff_feed_item".equals(str)) {
            BakeoffFeedPairSectionController bakeoffFeedPairSectionController = adBakeOffFragment.bakeoffFeedPairSectionController;
            if (bakeoffFeedPairSectionController != null) {
                Collection collection = (Collection) adBakeOffFragment.A09.get(adBakeOffFragment.A00);
                C14360o3.A0B(collection, 0);
                bakeoffFeedPairSectionController.A00 = AbstractC166987dD.A1F(collection);
                bakeoffFeedPairSectionController.pagerAdapter.notifyDataSetChanged();
            }
        } else if ("bakeoff_reel".equals(str)) {
            J1C j1c = adBakeOffFragment.bakeoffStoryPairSectionController;
            if (j1c != null) {
                j1c.A01((List) adBakeOffFragment.A09.get(adBakeOffFragment.A00));
            }
            J1C j1c2 = adBakeOffFragment.bakeoffStoryPairSectionController;
            if (j1c2 != null) {
                j1c2.A00();
            }
        }
        AbstractC40654I0m.A00(AbstractC166987dD.A0r(adBakeOffFragment.A0B), adBakeOffFragment, adBakeOffFragment.A07, AbstractC40655I0n.A00(adBakeOffFragment.A03, adBakeOffFragment.A00), "which_is_better", adBakeOffFragment.A00);
        AdBakeOffFragment.A04(adBakeOffFragment, 0, true, true);
    }
}
