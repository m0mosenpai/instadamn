package X;

import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.List;

/* renamed from: X.J2q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43076J2q implements XBY {
    public final /* synthetic */ ReelDashboardFragment A00;
    public final /* synthetic */ String A01;

    public C43076J2q(ReelDashboardFragment reelDashboardFragment, String str) {
        this.A00 = reelDashboardFragment;
        this.A01 = str;
    }

    @Override // X.XBY
    public final void DGP(Boolean bool, String str, List list, List list2, List list3, int i, int i2) {
        C38262Gs5 c38262Gs5 = this.A00.mListAdapter;
        if (c38262Gs5 != null && str != null) {
            String str2 = this.A01;
            c38262Gs5.A0C(str2, str, list, list3);
            c38262Gs5.A0A(str2, list2);
        }
    }
}
