package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;

/* loaded from: classes7.dex */
public final class HCQ extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60682pr, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ShoppingMediaFeedListViewerFragment";
    public boolean A00;
    public final C57112jm A01;
    public final C61372qz A02;
    public final C27847CPk A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A = A01(this, 42);
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final InterfaceC09390do A0T;
    public final InterfaceC09390do A0U;

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
        RecyclerView recyclerView;
        C3F1 c3f1;
        AbstractC70663Fe abstractC70663Fe;
        RecyclerView recyclerView2;
        C3F0 c3f0;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C57112jm c57112jm = this.A01;
        C71163Hc A00 = C71163Hc.A00(this);
        View view2 = this.mView;
        View view3 = null;
        if (view2 instanceof RecyclerView) {
            view3 = view2;
        }
        c57112jm.A08(view3, A00, new InterfaceC57142jp[0]);
        C37443GeN c37443GeN = (C37443GeN) this.A0F.getValue();
        C33P c33p = (C33P) this.A0B.getValue();
        C14360o3.A0B(c33p, 0);
        c37443GeN.A03 = c33p;
        View view4 = this.mView;
        if (view4 instanceof RecyclerView) {
            recyclerView = (RecyclerView) view4;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            c3f1 = recyclerView.A0C;
        } else {
            c3f1 = null;
        }
        if ((c3f1 instanceof C3F0) && (c3f0 = (C3F0) c3f1) != null) {
            c3f0.A00 = false;
        }
        C42508Irn c42508Irn = new C42508Irn(this, 17);
        C153146ui c153146ui = C153146ui.A0I;
        if (recyclerView != null) {
            abstractC70663Fe = recyclerView.A0D;
        } else {
            abstractC70663Fe = null;
        }
        C153156uj c153156uj = new C153156uj(abstractC70663Fe, c42508Irn, c153146ui, true, false);
        View view5 = this.mView;
        if ((view5 instanceof RecyclerView) && (recyclerView2 = (RecyclerView) view5) != null) {
            recyclerView2.A14(c153156uj);
        }
        C38316GtB c38316GtB = (C38316GtB) this.A0S.getValue();
        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), c38316GtB.A00, new C30180DRl(this, 46), 50);
        C141796aw A002 = AbstractC141776au.A00(c38316GtB);
        C43172J6r c43172J6r = new C43172J6r(c38316GtB, null, 38);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, c43172J6r, A002);
        AbstractC23641Du.A05(anonymousClass191, new PZ0(c38316GtB, this, null, 6), AbstractC25235BEs.A0S(this));
    }

    public static final C66362zD A00(HCQ hcq) {
        return (C66362zD) AbstractC166987dD.A17(hcq.A0U);
    }

    public static InterfaceC09390do A01(Object obj, int i) {
        return C1XM.A00(new C43203J8a(obj, i));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (((EnumC39540HdC) this.A07.getValue()).ordinal() == 2) {
            return "instagram_shopping_storefront_media_feed_list_viewer";
        }
        return "instagram_shopping_media_feed_list_viewer";
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        ViewGroup viewGroup;
        C3FQ A00;
        View view = this.mView;
        if ((view instanceof RecyclerView) && (viewGroup = (ViewGroup) view) != null && (A00 = C3FN.A00(viewGroup)) != null) {
            return A00;
        }
        throw AbstractC166987dD.A14("No RecyclerView available for ScrollingViewProxy");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0P);
    }

    public HCQ() {
        C43203J8a c43203J8a = new C43203J8a(this, 36);
        J7R j7r = new J7R(this, 8);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new J7R(j7r, 9));
        this.A04 = AbstractC25225BEi.A0a(new J7R(A00, 10), c43203J8a, new D8I(34, null, A00), AbstractC25225BEi.A1D(Object.class));
        this.A0U = A01(this, 35);
        this.A0E = A01(this, 46);
        this.A0F = A01(this, 47);
        this.A01 = AbstractC37301Gc2.A0E();
        this.A0N = C1XM.A00(new J7R(this, 5));
        this.A03 = new C27847CPk(this);
        this.A0M = AbstractC09440dt.A01(new J7R(this, 4));
        this.A0Q = C1XM.A00(new J7R(this, 7));
        this.A06 = A01(this, 38);
        this.A05 = A01(this, 37);
        this.A0T = AbstractC09440dt.A01(new J7R(this, 16));
        this.A0L = AbstractC09440dt.A01(new J7R(this, 3));
        this.A02 = new C61372qz();
        this.A0O = AbstractC09440dt.A01(new J7R(this, 6));
        this.A0B = C43203J8a.A00(this, 43);
        this.A09 = A01(this, 41);
        this.A0H = C43203J8a.A00(this, 49);
        this.A0I = AbstractC09440dt.A01(new J7R(this, 0));
        this.A07 = C43203J8a.A00(this, 39);
        this.A0J = C1XM.A00(new J7R(this, 1));
        this.A0K = C1XM.A00(new J7R(this, 2));
        this.A0C = A01(this, 44);
        J7R j7r2 = new J7R(this, 15);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new J7R(new J7R(this, 11), 12));
        this.A0S = AbstractC25225BEi.A0a(new J7R(A002, 13), j7r2, new D8I(35, null, A002), AbstractC25225BEi.A1D(C38316GtB.class));
        this.A0R = C1XM.A00(new J7R(this, 14));
        this.A0D = A01(this, 45);
        this.A0G = A01(this, 48);
        this.A08 = A01(this, 40);
        this.A00 = true;
        this.A0P = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(AbstractC25225BEi.A15(this.A0R));
        if (this.A07.getValue() == EnumC39540HdC.A04) {
            ((IMK) this.A0T.getValue()).A00(interfaceC56362iU);
            ((C1563970j) AbstractC166987dD.A17(this.A05)).A01(interfaceC56362iU);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-738217573);
        super.onCreate(bundle);
        AbstractC37304Gc5.A1K(this, this.A0H);
        registerLifecycleListener((AnonymousClass396) this.A09.getValue());
        AbstractC37304Gc5.A1J(this, this.A0I);
        ((C41206ILu) this.A06.getValue()).A00();
        C0f9.A09(1953046525, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-701210196);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) inflate;
        recyclerView.A14((C1I4) this.A09.getValue());
        recyclerView.setAdapter(A00(this));
        recyclerView.setLayoutManager(new FastScrollingLinearLayoutManager(requireContext()));
        C0f9.A09(-1703752679, A02);
        return recyclerView;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-530876406);
        super.onDestroy();
        AbstractC37304Gc5.A1M(this, this.A0H);
        unregisterLifecycleListener((AnonymousClass396) this.A09.getValue());
        AbstractC37304Gc5.A1L(this, this.A0I);
        C0f9.A09(12306242, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-838489349);
        super.onDestroyView();
        C41206ILu c41206ILu = (C41206ILu) this.A06.getValue();
        c41206ILu.A01.flowEndSuccess(c41206ILu.A00);
        C0f9.A09(444620993, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(441613872);
        super.onResume();
        C56342iS c56342iS = C56352iT.A0t;
        configureActionBar(c56342iS.A03(requireActivity()));
        c56342iS.A03(requireActivity()).A0X(this);
        C0f9.A09(1249165016, A02);
    }
}
