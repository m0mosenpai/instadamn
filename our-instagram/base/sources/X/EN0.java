package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes6.dex */
public final class EN0 extends AbstractC59962oe implements C51D, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PurchaseProtectionFragment";
    public EQ4 A00;
    public FQ6 A01;
    public SpinnerImageView A02;
    public RecyclerView A03;
    public UserSession A04;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131971165);
    }

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
        return "PurchaseProtection";
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

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        if (this.A03 != null) {
            return !r1.canScrollVertically(-1);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A04;
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
    public final void onCreate(Bundle bundle) {
        UserSession userSession;
        int A02 = C0f9.A02(-786349494);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            userSession = AbstractC31171DnF.A0G(bundle2);
        } else {
            userSession = null;
        }
        this.A04 = userSession;
        C0f9.A09(-2017895884, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EQ4 eq4;
        UserSession userSession;
        int A02 = C0f9.A02(1299112218);
        C14360o3.A0B(layoutInflater, 0);
        View A07 = AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.purchase_protection, false);
        SpinnerImageView spinnerImageView = (SpinnerImageView) A07.requireViewById(R.id.refresh_spinner);
        this.A02 = spinnerImageView;
        if (spinnerImageView != null) {
            ViewOnClickListenerC35682FpH.A01(spinnerImageView, 8, this);
        }
        RecyclerView A0F = AbstractC31176DnK.A0F(A07);
        this.A03 = A0F;
        if (A0F != null) {
            AbstractC31177DnL.A17(this, A0F);
        }
        UserSession userSession2 = this.A04;
        FQ6 fq6 = null;
        if (userSession2 != null) {
            eq4 = new EQ4(userSession2);
        } else {
            eq4 = null;
        }
        this.A00 = eq4;
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            recyclerView.setAdapter(eq4);
        }
        Context context = getContext();
        if (context != null && (userSession = this.A04) != null) {
            fq6 = new FQ6(context, AbstractC018607g.A00(this), userSession, this);
        }
        this.A01 = fq6;
        A07.postDelayed(new RunnableC36866GMn(this), 100L);
        C0f9.A09(-1752139922, A02);
        return A07;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1483331035);
        super.onDestroyView();
        this.A02 = null;
        this.A03 = null;
        C0f9.A09(-2143478440, A02);
    }
}
