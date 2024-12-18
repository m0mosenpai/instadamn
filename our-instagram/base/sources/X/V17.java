package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.TimeZone;

/* loaded from: classes11.dex */
public final class V17 extends AbstractC59962oe implements InterfaceC60072op, C51D {
    public static final String __redex_internal_original_name = "AiSubscriptionAllFragment";
    public UGc A00;
    public boolean A01;
    public RecyclerView A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(1909);
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A00();
        RecyclerView A08 = AbstractC31180DnO.A08(view);
        this.A02 = A08;
        if (A08 != null) {
            AbstractC31174DnI.A15(view.getContext(), A08);
            UGc uGc = new UGc(new C68743VbM(this));
            this.A00 = uGc;
            RecyclerView recyclerView = this.A02;
            if (recyclerView != null) {
                recyclerView.setAdapter(uGc);
                Bundle bundle2 = this.mArguments;
                if (bundle2 != null && (string = bundle2.getString(AbstractC111324zv.A00(169))) != null && !AbstractC001900j.A0T(string)) {
                    C40701ud A01 = AbstractC40691uc.A01((UserSession) this.A03.getValue());
                    C2JM c2jm = new C2JM();
                    C2JM c2jm2 = new C2JM();
                    c2jm.A04("product_type", string);
                    Integer valueOf = Integer.valueOf((int) (TimeZone.getDefault().getRawOffset() / 1000.0f));
                    c2jm.A03("gmt_offset_seconds", valueOf);
                    A01.ATV(new C70434WVm(this, 5), new WW0(this, 10), new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC167007dF.A1W(valueOf)), "AiAgentsGetSubscriptions", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C66959Udu.class, false, null, 0, null, "xfb_genai_thread_subscriptions_query", new ArrayList()));
                } else {
                    A01(this);
                }
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    C30D.A04(activity, AbstractC167007dF.A09(requireContext(), R.attr.igds_color_secondary_background));
                    return;
                }
                return;
            }
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    private final void A00() {
        C189478aR A00;
        C189458aP c189458aP;
        C3DN A002 = C3DN.A00.A00(getActivity());
        if (A002 != null && (A00 = F86.A00(A002)) != null && C14360o3.A0K(A00.A03.A0M(), this)) {
            boolean z = this.A01;
            C189458aP c189458aP2 = new C189458aP(null, null, "", 0, 0);
            Context requireContext = requireContext();
            if (!z) {
                c189458aP2.A06 = requireContext.getText(2131961561);
                c189458aP2.A05 = new WNO(this, 42);
                A00.A0J(c189458aP2.A00(), true);
                c189458aP = new C189458aP(null, null, "", 0, 0);
            } else {
                c189458aP2.A06 = requireContext.getText(2131954754);
                c189458aP2.A05 = new WNO(this, 43);
                A00.A0J(c189458aP2.A00(), true);
                c189458aP = new C189458aP(null, null, "", 0, 0);
                c189458aP.A06 = requireContext().getText(2131957640);
                c189458aP.A0A = false;
                c189458aP.A09 = true;
            }
            A00.A0K(c189458aP.A00(), true);
        }
    }

    public static final void A02(V17 v17, boolean z) {
        if (z != v17.A01) {
            v17.A01 = z;
            v17.A00();
            UGc uGc = v17.A00;
            if (uGc == null) {
                C14360o3.A0F("itemAdapter");
                throw C00O.createAndThrow();
            }
            if (uGc.A01 != z) {
                uGc.A01 = z;
                uGc.A03.clear();
                uGc.notifyDataSetChanged();
            }
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
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
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A03.getValue();
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
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
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A02;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        return AbstractC31175DnJ.A1S(recyclerView.computeVerticalScrollOffset());
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!this.A01) {
            return false;
        }
        A02(this, false);
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final void A01(V17 v17) {
        Context context = v17.getContext();
        if (context != null) {
            C9GR.A0F(context, "AI Subscription item query", 2131952871);
        }
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1887977419);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.ai_subscription_all_items, viewGroup, false);
        C0f9.A09(1728362354, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1735345236);
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C30D.A04(activity, 0);
        }
        C0f9.A09(-545391023, A02);
    }
}
