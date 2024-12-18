package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.2vS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64072vS {
    public IntentAwareAdPivotState A00;
    public C38373GuA A01;

    public final void A00() {
        C38373GuA c38373GuA = this.A01;
        if (c38373GuA != null && c38373GuA.A04.size() >= 2) {
            AbstractC70663Fe abstractC70663Fe = null;
            if (c38373GuA.A0A) {
                ViewPager2 viewPager2 = c38373GuA.A07;
                if (viewPager2 != null) {
                    IntentAwareAdPivotState intentAwareAdPivotState = c38373GuA.A01;
                    if (intentAwareAdPivotState != null) {
                        viewPager2.A03(intentAwareAdPivotState.A01 + 1, true);
                    }
                }
                c38373GuA.A06.postDelayed(new J3C(c38373GuA), C18U.A01(C06090Tz.A06, c38373GuA.A08, 36594349728794302L));
                return;
            }
            C51108MiD c51108MiD = new C51108MiD(c38373GuA.A05, null);
            ((AbstractC110824yu) c51108MiD).A00 = 1;
            RecyclerView recyclerView = c38373GuA.A00;
            if (recyclerView != null) {
                abstractC70663Fe = recyclerView.A0D;
            }
            if ((abstractC70663Fe instanceof LinearLayoutManager) && abstractC70663Fe != null) {
                abstractC70663Fe.A10(c51108MiD);
            }
            IntentAwareAdPivotState intentAwareAdPivotState2 = c38373GuA.A01;
            if (intentAwareAdPivotState2 != null) {
                intentAwareAdPivotState2.A04 = new C38606Gy9();
                return;
            }
            C14360o3.A0F("intentAwareAdPivotState");
            throw C00O.createAndThrow();
        }
    }
}
