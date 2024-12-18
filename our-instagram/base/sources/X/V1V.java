package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class V1V extends C38K implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "QuickPromotionDebugListFragment";
    public UserSession A00;
    public C70267WOw A01;
    public C66142yq A02;
    public RefreshableListView A03;
    public final java.util.Set A04 = new HashSet();

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C70267WOw c70267WOw = new C70267WOw(requireContext());
        this.A01 = c70267WOw;
        A0U(c70267WOw);
        AbstractC05560Rg.A00(this);
        RefreshableListView refreshableListView = (RefreshableListView) ((AbstractC05560Rg) this).A04;
        this.A03 = refreshableListView;
        if (refreshableListView != null) {
            refreshableListView.setOnItemClickListener(new C70256WOb(this, 3));
            refreshableListView.setupAndEnableRefresh(new WNU(this, 56));
        }
        AbstractC167007dF.A0N(view, R.id.slot_search_edit_text).addTextChangedListener(new WKU(this, 15));
        A01(this);
    }

    public static final void A01(V1V v1v) {
        int i;
        java.util.Set set = v1v.A04;
        if (!(!set.isEmpty())) {
            for (QuickPromotionSlot quickPromotionSlot : QuickPromotionSlot.values()) {
                if (!set.contains(quickPromotionSlot) && QuickPromotionSlot.A1A != quickPromotionSlot) {
                    set.add(quickPromotionSlot);
                    if (v1v.getContext() != null) {
                        i = (int) Math.ceil(AbstractC65702TsY.A00(r0));
                    } else {
                        i = 1;
                    }
                    UserSession userSession = v1v.A00;
                    if (userSession == null) {
                        C14360o3.A0F("userSession");
                        throw C00O.createAndThrow();
                    }
                    C1ON A00 = AFY.A00(userSession, quickPromotionSlot, C05F.A01, i);
                    A00.A00 = new C67954V3t(15, quickPromotionSlot, v1v);
                    v1v.schedule(A00);
                }
            }
        }
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "qp_debug_list";
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(getString(2131958541));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-140694980);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A02 = new C66142yq();
        C0f9.A09(-67619032, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1925060376);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_slot_list_fragment, viewGroup, false);
        C0f9.A09(-1943228566, A02);
        return inflate;
    }
}
