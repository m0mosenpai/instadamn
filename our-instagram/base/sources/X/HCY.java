package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;
import com.instagram.profile.fragment.UserDetailTabController;

/* loaded from: classes7.dex */
public final class HCY extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC152836uD {
    public static final String __redex_internal_original_name = "ProductsTabFragment";
    public C66362zD A01;
    public String A02;
    public String A03;
    public String A04;
    public View A05;
    public RecyclerView A06;
    public final C39084HIi A09;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0B = AbstractC60492pY.A02(this);
    public final String A0A = AbstractC111324zv.A00(5340);
    public int A00 = 2;
    public boolean A08 = true;
    public boolean A07 = true;
    public final C57112jm A0D = AbstractC37301Gc2.A0E();
    public final java.util.Set A0E = AbstractC31171DnF.A0l();

    @Override // X.InterfaceC152836uD, X.InterfaceC152846uE
    public final String Bi9() {
        return "profile_products";
    }

    @Override // X.InterfaceC152836uD
    public final void DcV(UserDetailTabController userDetailTabController) {
    }

    @Override // X.InterfaceC152836uD
    public final void Drq(boolean z) {
    }

    @Override // X.InterfaceC152836uD
    public final void Drv(boolean z) {
    }

    @Override // X.InterfaceC152836uD
    public final void Drw() {
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        AbstractC70663Fe abstractC70663Fe;
        ViewGroup.LayoutParams layoutParams;
        Resources resources;
        C38321qM A0h;
        InterfaceC39541sb A0F;
        IGAdProfileProductTabDict Bi3;
        Boolean Cay;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0B;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C06090Tz A0j = AbstractC25225BEi.A0j(A0r, 1);
        this.A00 = AbstractC25225BEi.A07(A0j, A0r, 36610455849998420L);
        String str = this.A03;
        if (C18U.A06(A0j, A0r, 36328980873232293L) && ((A0h = AbstractC25229BEm.A0h(A0r, str)) == null || (A0F = AbstractC37300Gc1.A0F(A0h)) == null || (Bi3 = A0F.Bi3()) == null || (Cay = Bi3.Cay()) == null || Cay.booleanValue())) {
            z = true;
        } else {
            z = false;
        }
        this.A08 = z;
        this.A06 = AbstractC31172DnG.A0G(view, R.id.product_tab_recyclerview);
        this.A05 = view.requireViewById(R.id.sponsored_label);
        if (C18U.A06(A0j, A0r, 36328980873559977L)) {
            TextView A0N = AbstractC167007dF.A0N(view, R.id.sponsored_label_text);
            Context context = getContext();
            String str2 = null;
            if (context != null && (resources = context.getResources()) != null) {
                Bundle bundle2 = this.mArguments;
                if (bundle2 != null) {
                    str2 = bundle2.getString("advertiser_name");
                }
                str2 = AbstractC166997dE.A0r(resources, str2, 2131974340);
            }
            A0N.setText(str2);
            ViewOnClickListenerC42032Ik1.A01(A0N, 68, this);
            ViewOnClickListenerC42032Ik1.A01(AbstractC166997dE.A0S(view, R.id.sponsored_label_more_menu), 69, this);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0M(this, interfaceC09390do), "instagram_thumbnail_impression");
            A0f.AAP("media_thumbnail_section", "ads_products_tab_sponsored_label");
            AbstractC37300Gc1.A0o(A0f, this.A04);
            A0f.AAP("position", AbstractC154266wb.A01(0, 0));
            AbstractC25234BEr.A11(A0f, "device_aspect_ratio_category", AbstractC37301Gc2.A0g(A0f));
            A0f.Cht();
        } else {
            AbstractC167007dF.A0x(this.A05);
        }
        if (!this.A07) {
            RecyclerView recyclerView = this.A06;
            if (recyclerView != null) {
                layoutParams = recyclerView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            C14360o3.A0C(layoutParams, AbstractC111324zv.A00(20));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, 0, 0, 0);
            RecyclerView recyclerView2 = this.A06;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutParams(marginLayoutParams);
            }
        }
        C57112jm c57112jm = this.A0D;
        AbstractC37301Gc2.A0v(view, c57112jm, this);
        C39101HIz c39101HIz = new C39101HIz(requireContext, this, AbstractC166987dD.A0r(interfaceC09390do), c57112jm, new C41029IEy(requireContext, this), this.A03, this.A04, this.A0E, this.A00, this.A08);
        C66392zG A00 = C66362zD.A00(requireContext);
        A00.A01(c39101HIz);
        this.A01 = AbstractC31173DnH.A0R(A00, new Object());
        int i = this.A00;
        Resources resources2 = requireContext.getResources();
        int i2 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        if (i == 3) {
            i2 = R.dimen.account_discovery_bottom_gap;
        }
        int dimensionPixelSize = resources2.getDimensionPixelSize(i2);
        FastScrollingGridLayoutManager fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(requireContext, this.A00);
        ((GridLayoutManager) fastScrollingGridLayoutManager).A01 = new C37922GmJ(this, 0);
        RecyclerView recyclerView3 = this.A06;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(fastScrollingGridLayoutManager);
        }
        RecyclerView recyclerView4 = this.A06;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(this.A01);
        }
        RecyclerView recyclerView5 = this.A06;
        if (recyclerView5 != null) {
            recyclerView5.A10(new C195638l4(dimensionPixelSize, !C18U.A06(A0j, A0r, 36328980873559977L)));
        }
        if (C18U.A06(A0j, AbstractC25230BEn.A0k(interfaceC09390do, 1), 36328980873428903L)) {
            P2N p2n = new P2N(this, 4);
            C153146ui c153146ui = C153146ui.A0C;
            RecyclerView recyclerView6 = this.A06;
            if (recyclerView6 != null) {
                abstractC70663Fe = recyclerView6.A0D;
            } else {
                abstractC70663Fe = null;
            }
            C153156uj c153156uj = new C153156uj(abstractC70663Fe, p2n, c153146ui, false, false);
            RecyclerView recyclerView7 = this.A06;
            if (recyclerView7 != null) {
                recyclerView7.A14(c153156uj);
            }
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 22), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC152836uD
    public final Fragment ACb() {
        return this;
    }

    @Override // X.InterfaceC152836uD
    public final ViewGroup Br5() {
        return this.A06;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0A;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0B);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.HIi] */
    public HCY() {
        C57244PbS c57244PbS = new C57244PbS(this, 23);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57244PbS(new C57244PbS(this, 20), 21));
        this.A0C = AbstractC25225BEi.A0a(new C57244PbS(A00, 22), c57244PbS, new C57257Pbf(15, null, A00), AbstractC25225BEi.A1D(C50945MfE.class));
        this.A09 = new Object();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-593184261);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = bundle2.getString("source_media_id");
            this.A02 = bundle2.getString(MSV.A00(172));
            this.A04 = bundle2.getString("tracking_token");
            this.A07 = bundle2.getBoolean(MSV.A00(1604));
            C0f9.A09(1424714812, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-610408302, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1235693739);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_product_tab_fragment, viewGroup, false);
        C0f9.A09(-1588323643, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1761389630);
        super.onDestroyView();
        this.A06 = null;
        this.A05 = null;
        this.A01 = null;
        C0f9.A09(-1076630369, A02);
    }
}
