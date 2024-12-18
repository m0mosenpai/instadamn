package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.EMf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32333EMf extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "GenAiAccountsFragment";
    public RecyclerView A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "gen_ai_account_fragment";
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A08 = AbstractC31180DnO.A08(view);
        this.A00 = A08;
        if (A08 != null) {
            AbstractC31174DnI.A15(view.getContext(), A08);
            AbstractC18680vv session = getSession();
            C14360o3.A0C(session, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
            C31879Dzl c31879Dzl = new C31879Dzl(this, this, (UserSession) session);
            AbstractC18680vv session2 = getSession();
            C14360o3.A0C(session2, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
            C14360o3.A0B(session2, 0);
            C34599FMi c34599FMi = (C34599FMi) session2.A01(C34599FMi.class, GTU.A00);
            synchronized (c34599FMi.A03) {
                try {
                    list = c34599FMi.A01;
                    if (list == null) {
                        WeakReference weakReference = c34599FMi.A00;
                        if (weakReference != null) {
                            list = (List) weakReference.get();
                        } else {
                            list = null;
                        }
                    }
                } finally {
                    c34599FMi.A01 = null;
                    c34599FMi.A00 = 0 == true ? 1 : 0;
                    c34599FMi.A02.removeCallbacks(c34599FMi.A04);
                }
            }
            c31879Dzl.A00 = list;
            c31879Dzl.notifyDataSetChanged();
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.setAdapter(c31879Dzl);
                return;
            }
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        return AbstractC31175DnJ.A1S(recyclerView.computeVerticalScrollOffset());
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(505171722);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.gen_ai_accounts_fragment, viewGroup, false);
        C0f9.A09(496649179, A02);
        return inflate;
    }
}
