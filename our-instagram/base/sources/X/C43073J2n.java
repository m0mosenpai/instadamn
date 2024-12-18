package X;

import androidx.recyclerview.widget.RecyclerView;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.J2n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43073J2n implements JIC {
    public final /* synthetic */ ReelDashboardFragment A00;

    @Override // X.JIC
    public final void Dgn() {
    }

    public C43073J2n(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    @Override // X.JIC
    public final C41181vS Aum() {
        return this.A00.A0G();
    }

    @Override // X.JIC
    public final IF7 BjY(int i) {
        C38372Gu9 c38372Gu9;
        C38372Gu9 c38372Gu92;
        ReelDashboardFragment reelDashboardFragment = this.A00;
        C41181vS A0G = reelDashboardFragment.A0G();
        if (A0G != null) {
            C38262Gs5 c38262Gs5 = reelDashboardFragment.mListAdapter;
            String str = A0G.A0j;
            RecyclerView A00 = C38262Gs5.A00(c38262Gs5, str);
            if (A00 != null && (c38372Gu9 = (C38372Gu9) A00.A0A) != null && c38372Gu9.A01.get(i) != null) {
                RecyclerView A002 = C38262Gs5.A00(reelDashboardFragment.mListAdapter, str);
                if (A002 != null && (c38372Gu92 = (C38372Gu9) A002.A0A) != null) {
                    return (IF7) c38372Gu92.A01.get(i);
                }
                return null;
            }
        }
        return new IF7(null, C05F.A00);
    }

    @Override // X.JIC
    public final int BjZ() {
        RecyclerView A00;
        C2UU c2uu;
        ReelDashboardFragment reelDashboardFragment = this.A00;
        C41181vS A0G = reelDashboardFragment.A0G();
        if (A0G != null && (A00 = C38262Gs5.A00(reelDashboardFragment.mListAdapter, A0G.A0j)) != null && (c2uu = A00.A0A) != null) {
            return c2uu.getItemCount();
        }
        return 0;
    }

    @Override // X.JIC
    public final void CJ4(int i) {
        RecyclerView A00;
        ReelDashboardFragment reelDashboardFragment = this.A00;
        C41181vS A0G = reelDashboardFragment.A0G();
        if (A0G != null && (A00 = C38262Gs5.A00(reelDashboardFragment.mListAdapter, A0G.A0j)) != null) {
            AbstractC41339IRk.A01(A00, i);
        }
    }

    @Override // X.JIC
    public final void Dcg() {
        RecyclerView A00;
        ReelDashboardFragment reelDashboardFragment = this.A00;
        C41181vS A0G = reelDashboardFragment.A0G();
        if (A0G != null && (A00 = C38262Gs5.A00(reelDashboardFragment.mListAdapter, A0G.A0j)) != null) {
            AbstractC41339IRk.A00(A00);
        }
    }

    @Override // X.JIC
    public final void EMa() {
        ReelDashboardFragment reelDashboardFragment = this.A00;
        C41181vS A0G = reelDashboardFragment.A0G();
        if (A0G != null) {
            reelDashboardFragment.A0M(A0G.A0k, A0G.A0j);
        }
    }
}
