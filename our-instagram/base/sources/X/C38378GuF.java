package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.GuF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38378GuF extends AbstractC65392xb implements InterfaceC60602pj {
    public RecyclerView A00;
    public ShimmerFrameLayout A01;
    public final UserSession A02;
    public final C38335GtV A03;
    public final C153766vl A04;
    public final AbstractC59962oe A05;
    public final C57112jm A06;

    public C38378GuF(AbstractC59962oe abstractC59962oe, UserSession userSession, C57112jm c57112jm, C38335GtV c38335GtV, C153766vl c153766vl) {
        C14360o3.A0B(userSession, 4);
        this.A03 = c38335GtV;
        this.A05 = abstractC59962oe;
        this.A04 = c153766vl;
        this.A02 = userSession;
        this.A06 = c57112jm;
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
        this.A01 = null;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.A00 = null;
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
        this.A01 = (ShimmerFrameLayout) view.requireViewById(R.id.videos_list_shimmer_container);
        AbstractC59962oe abstractC59962oe = this.A05;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(abstractC59962oe.requireContext(), 3);
        C153766vl c153766vl = this.A04;
        gridLayoutManager.A01 = (AbstractC154146wP) c153766vl.A0P.getValue();
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.videos_list);
        this.A00 = A0G;
        if (A0G != null) {
            A0G.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A10(AbstractC154166wR.A00(abstractC59962oe.requireContext(), 0, false));
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(c153766vl.A0I);
        }
        RecyclerView recyclerView3 = this.A00;
        if (recyclerView3 != null) {
            recyclerView3.A14(new C153156uj(gridLayoutManager, new C42508Irn(this, 16), C153146ui.A06, true, false));
        }
        this.A06.A08(this.A00, C71163Hc.A00(abstractC59962oe), new InterfaceC57142jp[0]);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.AbstractC65392xb
    public final void onChanged() {
        int childCount;
        AbstractC70663Fe abstractC70663Fe;
        AbstractC70663Fe abstractC70663Fe2;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null && 1 <= (childCount = recyclerView.getChildCount()) && childCount < 13) {
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                abstractC70663Fe = recyclerView2.A0D;
            } else {
                abstractC70663Fe = null;
            }
            int A01 = AbstractC72193Ls.A01(abstractC70663Fe);
            RecyclerView recyclerView3 = this.A00;
            if (recyclerView3 != null) {
                abstractC70663Fe2 = recyclerView3.A0D;
            } else {
                abstractC70663Fe2 = null;
            }
            int A02 = AbstractC72193Ls.A02(abstractC70663Fe2);
            if (A01 == 0 && childCount - 1 == A02) {
                this.A03.A03(null);
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
        this.A04.A0I.registerAdapterDataObserver(this);
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        this.A04.A0I.unregisterAdapterDataObserver(this);
    }
}
