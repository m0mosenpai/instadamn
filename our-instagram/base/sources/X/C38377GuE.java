package X;

import androidx.recyclerview.widget.RecyclerView;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.GuE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38377GuE extends AbstractC65392xb {
    public final /* synthetic */ EffectsPageFragment A00;

    public C38377GuE(EffectsPageFragment effectsPageFragment) {
        this.A00 = effectsPageFragment;
    }

    @Override // X.AbstractC65392xb
    public final void onChanged() {
        int childCount;
        AbstractC70663Fe abstractC70663Fe;
        Object obj;
        EffectsPageFragment effectsPageFragment = this.A00;
        RecyclerView recyclerView = effectsPageFragment.mClipsRecyclerView;
        if (recyclerView != null && (childCount = recyclerView.getChildCount()) > 0 && childCount < 9 && (abstractC70663Fe = effectsPageFragment.mClipsRecyclerView.A0D) != null) {
            int A01 = AbstractC72193Ls.A01(abstractC70663Fe);
            int A02 = AbstractC72193Ls.A02(abstractC70663Fe);
            if (A01 == 0 && childCount - 1 == A02 && (obj = effectsPageFragment.A06) != null) {
                ((InterfaceC62612t0) obj).AD4();
            }
        }
    }
}
