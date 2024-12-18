package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.Bd4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25901Bd4 extends AbstractC65392xb implements InterfaceC60602pj {
    public ShimmerFrameLayout A00;
    public RecyclerView A01;
    public final C153766vl A02;
    public final C25837Bbs A03;
    public final AbstractC59962oe A04;
    public final C57112jm A05;

    public C25901Bd4(AbstractC59962oe abstractC59962oe, C57112jm c57112jm, C153766vl c153766vl, C25837Bbs c25837Bbs) {
        C14360o3.A0B(c25837Bbs, 1);
        this.A03 = c25837Bbs;
        this.A04 = abstractC59962oe;
        this.A02 = c153766vl;
        this.A05 = c57112jm;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A00 = null;
        this.A01 = null;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        this.A00 = (ShimmerFrameLayout) view.requireViewById(R.id.videos_list_shimmer_container);
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.videos_list);
        AbstractC59962oe abstractC59962oe = this.A04;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(abstractC59962oe.requireContext(), 3);
        C153766vl c153766vl = this.A02;
        gridLayoutManager.A01 = (AbstractC154146wP) c153766vl.A0P.getValue();
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.A10(AbstractC154166wR.A00(abstractC59962oe.requireContext(), 0, false));
        recyclerView.setAdapter(c153766vl.A0I);
        recyclerView.A14(new C153156uj(recyclerView.A0D, new C29277CvY(this, 3), C153146ui.A06, true, false));
        this.A01 = recyclerView;
        this.A05.A08(this.A01, C71163Hc.A00(abstractC59962oe), new InterfaceC57142jp[0]);
        c153766vl.A04(9);
        ShimmerFrameLayout shimmerFrameLayout = this.A00;
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.A02();
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.AbstractC65392xb
    public final void onChanged() {
        int childCount;
        AbstractC70663Fe abstractC70663Fe;
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null && 1 <= (childCount = recyclerView.getChildCount()) && childCount < 13) {
            RecyclerView recyclerView2 = this.A01;
            AbstractC70663Fe abstractC70663Fe2 = null;
            if (recyclerView2 != null) {
                abstractC70663Fe = recyclerView2.A0D;
            } else {
                abstractC70663Fe = null;
            }
            int A01 = AbstractC72193Ls.A01(abstractC70663Fe);
            RecyclerView recyclerView3 = this.A01;
            if (recyclerView3 != null) {
                abstractC70663Fe2 = recyclerView3.A0D;
            }
            int A02 = AbstractC72193Ls.A02(abstractC70663Fe2);
            if (A01 == 0 && childCount - 1 == A02) {
                this.A03.A03.A01.A04(null, null, C16930sl.A00, false);
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
        this.A02.A0I.registerAdapterDataObserver(this);
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        this.A02.A0I.unregisterAdapterDataObserver(this);
    }
}
