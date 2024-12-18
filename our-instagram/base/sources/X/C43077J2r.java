package X;

import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.List;

/* renamed from: X.J2r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43077J2r implements XBZ {
    public final /* synthetic */ ReelDashboardFragment A00;
    public final /* synthetic */ String A01;

    public C43077J2r(ReelDashboardFragment reelDashboardFragment, String str) {
        this.A00 = reelDashboardFragment;
        this.A01 = str;
    }

    @Override // X.XBZ
    public final void E18(C69448VnX c69448VnX, Boolean bool, String str, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i, int i2, int i3, boolean z, boolean z2) {
        ReelDashboardFragment reelDashboardFragment = this.A00;
        List A01 = ReelDashboardFragment.A01(list6);
        C38262Gs5 c38262Gs5 = reelDashboardFragment.mListAdapter;
        String str2 = this.A01;
        if (!list2.isEmpty() || list6 == null) {
            list6 = list2;
        }
        if (!list5.isEmpty()) {
            A01 = list5;
        }
        c38262Gs5.A0C(str2, str, list6, A01);
        reelDashboardFragment.mListAdapter.A0A(str2, list3);
    }
}
