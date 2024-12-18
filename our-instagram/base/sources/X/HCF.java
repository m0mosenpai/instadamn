package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes7.dex */
public final class HCF extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou {
    public static final /* synthetic */ C0YR[] A0E = {new AnonymousClass019(HCF.class, "inlineSearchBox", "getInlineSearchBox()Lcom/instagram/igds/components/search/IgdsInlineSearchBox;", 0), new AnonymousClass019(HCF.class, "productRecyclerView", "getProductRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public static final String __redex_internal_original_name = "ShoppingShopManagementEditFragment";
    public final KFH A01;
    public final KFH A02;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final ID8 A05 = new ID8(this);
    public final JGR A04 = new C42839IxF(this);
    public final C42842IxI A00 = new C42842IxI(this, 3);
    public final InterfaceC43386JFb A03 = new C42836IxC(this, 3);
    public final GZD A0D = new C42688Iuj(this, 4);
    public final C1I4 A0C = new C38385GuM(this, 7);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131961649);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0K = getString(2131961124);
        AbstractC31176DnK.A1B(new ViewOnClickListenerC42033Ik2(this, 64), A0B, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(3084);
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
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        KFH kfh = this.A02;
        ((RecyclerView) kfh.A02()).A14(this.A0C);
        ((RecyclerView) kfh.A02()).setAdapter(((IFJ) this.A08.getValue()).A01);
        RecyclerView recyclerView = (RecyclerView) kfh.A02();
        C70623Ez c70623Ez = new C70623Ez();
        ((C3F0) c70623Ez).A00 = false;
        recyclerView.setItemAnimator(c70623Ez);
        KFH kfh2 = this.A01;
        ((IgdsInlineSearchBox) kfh2.A02()).A02 = this.A0D;
        ((IgdsInlineSearchBox) kfh2.A02()).setImeOptions(6);
        ((RecyclerView) kfh.A02()).A14(new C153156uj(((RecyclerView) kfh.A02()).A0D, new C42508Irn(this, 13), C153146ui.A0B, false, false));
        C43172J6r.A02(AbstractC25235BEs.A0S(this), this, 9);
        InterfaceC09390do interfaceC09390do = this.A0A;
        ((C38328GtN) interfaceC09390do.getValue()).A01.A06(getViewLifecycleOwner(), new C42078Ikl(this, 3));
        C38328GtN c38328GtN = (C38328GtN) interfaceC09390do.getValue();
        C38328GtN.A00(c38328GtN, new DHI("", 4));
        C39331HYw c39331HYw = c38328GtN.A03;
        c39331HYw.A01 = "";
        c39331HYw.A06(true);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.EVa, X.KFH] */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.EVa, X.KFH] */
    public HCF() {
        C43207J8e c43207J8e = new C43207J8e(this, 44);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C43207J8e(new C43207J8e(this, 41), 42));
        this.A0A = AbstractC25225BEi.A0a(new C43207J8e(A00, 43), c43207J8e, C43208J8f.A00(null, A00, 10), AbstractC25225BEi.A1D(C38328GtN.class));
        this.A0B = C43207J8e.A00(this, 45);
        this.A07 = C43207J8e.A00(this, 39);
        this.A06 = C43207J8e.A00(this, 38);
        this.A08 = C43207J8e.A00(this, 40);
        this.A01 = new C32550EVa(this, new C57249PbX(R.id.search_box, 12, this));
        this.A02 = new C32550EVa(this, new C57249PbX(R.id.products_recycler_view, 12, this));
        this.A09 = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10 && i2 == 1002) {
            C38328GtN c38328GtN = (C38328GtN) this.A0A.getValue();
            C39331HYw c39331HYw = c38328GtN.A03;
            c39331HYw.A01();
            String str = ((C26063Bfr) AbstractC37301Gc2.A0e(c38328GtN.A01)).A03;
            C14360o3.A0B(str, 0);
            C38328GtN.A00(c38328GtN, new DHI(str, 4));
            c39331HYw.A01 = str;
            c39331HYw.A06(true);
            C38328GtN.A00(c38328GtN, C43337JDe.A00);
            requireActivity().setResult(1002);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1819194717);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.shop_management_edit_fragment, false);
        C0f9.A09(-779510713, A02);
        return A0R;
    }
}
