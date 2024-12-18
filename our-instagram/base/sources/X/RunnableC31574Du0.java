package X;

import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import java.util.List;

/* renamed from: X.Du0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC31574Du0 implements Runnable {
    public final /* synthetic */ UnifiedFollowFragment A00;

    public RunnableC31574Du0(UnifiedFollowFragment unifiedFollowFragment) {
        this.A00 = unifiedFollowFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        UnifiedFollowFragment unifiedFollowFragment = this.A00;
        if (unifiedFollowFragment.viewPager != null) {
            AbstractC65852TvD abstractC65852TvD = unifiedFollowFragment.A06;
            if (abstractC65852TvD == null) {
                str = "onPageChangedCallback";
            } else {
                List list = unifiedFollowFragment.A0L;
                if (list == null) {
                    str = "tabs";
                } else {
                    abstractC65852TvD.A01(list.indexOf(unifiedFollowFragment.A0A));
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }
}
