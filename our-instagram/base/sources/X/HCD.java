package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes7.dex */
public final class HCD extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ProductCollectionPickerFragment";
    public final InterfaceC09390do A00 = C43206J8d.A00(this, 35);
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131969981);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "product_collection_picker";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C3F0 c3f0;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) AbstractC166987dD.A0c(view, R.id.search_box);
        igdsInlineSearchBox.A02 = new C42688Iuj(this, 0);
        igdsInlineSearchBox.setImeOptions(6);
        RecyclerView recyclerView = (RecyclerView) AbstractC166987dD.A0c(view, R.id.recycler_view);
        C3F1 c3f1 = recyclerView.A0C;
        if ((c3f1 instanceof C3F0) && (c3f0 = (C3F0) c3f1) != null) {
            c3f0.A00 = false;
        }
        recyclerView.setAdapter(((ILO) this.A00.getValue()).A00);
        recyclerView.A14(new C38385GuM(igdsInlineSearchBox, 1));
        AbstractC37304Gc5.A0y(recyclerView.A0D, recyclerView, new C42508Irn(this, 9), C153146ui.A0B);
        C43172J6r.A02(AbstractC25235BEs.A0S(this), this, 5);
        ((C38322GtH) this.A02.getValue()).A00.A06(getViewLifecycleOwner(), new C42078Ikl(this, 1));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public HCD() {
        C43206J8d c43206J8d = new C43206J8d(this, 39);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C43206J8d(new C43206J8d(this, 36), 37));
        this.A02 = AbstractC25225BEi.A0a(new C43206J8d(A00, 38), c43206J8d, C43208J8f.A00(null, A00, 5), AbstractC25225BEi.A1D(C38322GtH.class));
        this.A01 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-406415292);
        super.onCreate(bundle);
        ((C38322GtH) this.A02.getValue()).A01("");
        C0f9.A09(1280491710, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(79875888);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.product_collection_picker_fragment, false);
        C0f9.A09(2110840149, A02);
        return A0R;
    }
}
