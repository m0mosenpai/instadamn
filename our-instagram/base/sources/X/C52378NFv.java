package X;

import android.app.Activity;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.tagging.activity.TaggingActivity;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.NFv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52378NFv extends C42H {
    public final int A00;
    public final Object A01;

    public C52378NFv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        Activity requireActivity;
        if (1 - this.A00 != 0) {
            super.DXP(i, i2);
            return;
        }
        ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
        ReelDashboardFragment.A0D(reelDashboardFragment, i);
        if (reelDashboardFragment.getRootActivity() != null) {
            requireActivity = reelDashboardFragment.getRootActivity();
        } else {
            requireActivity = reelDashboardFragment.requireActivity();
        }
        AbstractC13880nE.A0K(requireActivity);
        if (reelDashboardFragment.mImageViewPager != reelDashboardFragment.mScrollOwner) {
            return;
        }
        reelDashboardFragment.mListViewPager.A0K(i);
        reelDashboardFragment.A03.A08(reelDashboardFragment.mListViewPager.A01, true);
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void DXb(int i, int i2, boolean z) {
        if (this.A00 != 0) {
            super.DXb(i, i2, z);
        } else {
            TaggingActivity.A0G((TaggingActivity) this.A01);
        }
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
        ReboundViewPager reboundViewPager;
        if (1 - this.A00 != 0) {
            super.Diy(c3vz, c3vz2);
            return;
        }
        C3VZ c3vz3 = C3VZ.A03;
        ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
        if (c3vz != c3vz3) {
            if (reelDashboardFragment.mScrollOwner != null) {
                return;
            } else {
                reboundViewPager = reelDashboardFragment.mImageViewPager;
            }
        } else if (reelDashboardFragment.mImageViewPager != reelDashboardFragment.mScrollOwner) {
            return;
        } else {
            reboundViewPager = null;
        }
        reelDashboardFragment.mScrollOwner = reboundViewPager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r6 < r0.size()) goto L12;
     */
    @Override // X.C42H, X.InterfaceC62892tS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DrZ(int r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            if (r0 == 0) goto L8
            super.DrZ(r5, r6)
            return
        L8:
            java.lang.Object r2 = r4.A01
            com.instagram.tagging.activity.TaggingActivity r2 = (com.instagram.tagging.activity.TaggingActivity) r2
            java.lang.String r1 = "mediaTaggingInfos"
            r3 = 0
            if (r6 < 0) goto L54
            java.util.ArrayList r0 = r2.A0N
            if (r0 == 0) goto L5b
            int r0 = r0.size()
            if (r6 >= r0) goto L54
        L1b:
            r2.A00 = r6
            com.instagram.tagging.activity.TaggingActivity.A0F(r2)
            java.util.ArrayList r0 = r2.A0N
            if (r0 == 0) goto L5b
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r0 = X.MSW.A0t(r0, r5)
            X.1tc r1 = r0.A03
            X.1tc r0 = X.EnumC40111tc.A0Q
            if (r1 != r0) goto L50
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r2.A05
            if (r0 == 0) goto L56
            android.view.View r0 = r0.A0D(r5)
            if (r0 == 0) goto L56
            java.lang.Object r1 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.tagging.activity.TaggingPhotoViewBinder.Holder"
            X.C14360o3.A0C(r1, r0)
            X.NX7 r1 = (X.NX7) r1
            com.instagram.tagging.widget.TagsInteractiveLayout r0 = r1.A01
            r0.AVh()
        L48:
            com.instagram.tagging.activity.TaggingActivity.A0D(r2)
            r0 = 0
            com.instagram.tagging.activity.TaggingActivity.A0Q(r2, r0)
            return
        L50:
            r2.Ds0(r3)
            goto L48
        L54:
            r6 = r5
            goto L1b
        L56:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L5b:
            X.C14360o3.A0F(r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52378NFv.DrZ(int, int):void");
    }
}
