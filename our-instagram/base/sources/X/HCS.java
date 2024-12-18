package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HCS extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60682pr, InterfaceC60072op, JI1, InterfaceC60122ou, C38N, JGO {
    public static final String __redex_internal_original_name = "FeaturedProductSellerManagementFragment";
    public InterfaceC70513Em A00;
    public RecyclerView A02;
    public RefreshableNestedScrollingParent A03;
    public final InterfaceC09390do A0B = J8Y.A00(this, 45);
    public final InterfaceC41501vz A0H = C37816GkW.A00(this, 32);
    public final InterfaceC09390do A0F = J8Y.A00(this, 48);
    public final InterfaceC09390do A0G = J8Y.A00(this, 49);
    public final InterfaceC09390do A09 = J8Y.A00(this, 43);
    public final InterfaceC09390do A0A = J8Y.A00(this, 44);
    public final InterfaceC09390do A0E = J8Y.A00(this, 47);
    public final C38U A04 = C38U.A00;
    public final InterfaceC09390do A07 = J8Y.A00(this, 41);
    public final InterfaceC09390do A08 = J8Y.A00(this, 42);
    public final InterfaceC09390do A0C = J8Y.A00(this, 46);
    public String A01 = "";
    public final List A05 = AbstractC166987dD.A1E();
    public final Map A06 = AbstractC166987dD.A1I();
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);

    @Override // X.C38N
    public final void DJj(View view, C38321qM c38321qM, int i) {
        C14360o3.A0B(c38321qM, 0);
        C1XJ c1xj = C1XJ.A00;
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A0D;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String str = this.A01;
        String A0t = AbstractC31173DnH.A0t(interfaceC09390do);
        String str2 = AbstractC37300Gc1.A0I(this.A0E).A01.A03.A07;
        List list = this.A05;
        String id = c38321qM.getId();
        if (id != null) {
            c1xj.A0x(requireActivity, A0r, this, null, str, "commerce/community/featured_products/merchant_management/approved/", A0t, str2, id, "approved", AbstractC25225BEi.A15(this.A0F), list);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    @Override // X.JGO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DKJ(X.C41191ILf r24) {
        /*
            r23 = this;
            r14 = 0
            X.1XJ r15 = X.C1XJ.A00
            r0 = r23
            androidx.fragment.app.FragmentActivity r16 = r0.requireActivity()
            X.0do r4 = r0.A0D
            com.instagram.common.session.UserSession r17 = X.AbstractC166987dD.A0r(r4)
            r2 = r24
            java.lang.Integer r1 = r2.A00()
            java.lang.String r21 = X.AbstractC40798I6a.A00(r1)
            X.0do r1 = r0.A0F
            java.lang.String r22 = X.AbstractC25225BEi.A15(r1)
            java.lang.String r5 = r2.A02
            if (r5 == 0) goto Ldf
            java.lang.Integer r1 = r2.A00()
            int r3 = r1.intValue()
            r1 = 3
            if (r3 == r1) goto Ld1
            if (r3 == r14) goto Lcd
            r1 = 1
            if (r3 == r1) goto Lc9
            r1 = 2
            if (r3 != r1) goto Lda
            java.lang.String r6 = "commerce/community/featured_products/merchant_management/recently_edited/"
        L38:
            java.lang.String r7 = X.AbstractC31173DnH.A0t(r4)
            java.lang.Integer r1 = r2.A00()
            int r3 = r1.intValue()
            r1 = 3
            if (r3 == r1) goto Lbf
            if (r3 == r14) goto Lbc
            r1 = 1
            if (r3 == r1) goto Lc2
            r1 = 2
            if (r3 != r1) goto Ld5
            X.0sl r12 = X.C16930sl.A00
        L51:
            java.lang.Integer r1 = r2.A00()
            int r3 = r1.intValue()
            r9 = 0
            if (r3 == r14) goto Lb8
            r1 = 1
            if (r3 == r1) goto Lb4
            r1 = 2
            if (r3 != r1) goto L73
            r1 = 2131962403(0x7f132a23, float:1.956153E38)
        L65:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L73
            int r1 = r1.intValue()
            java.lang.String r9 = r0.getString(r1)
        L73:
            java.lang.Integer r1 = r2.A00()
            int r2 = r1.intValue()
            r10 = 0
            if (r2 == r14) goto Lb0
            r1 = 1
            if (r2 == r1) goto Lac
            r1 = 2
            if (r2 != r1) goto L95
            r1 = 2131962402(0x7f132a22, float:1.9561528E38)
        L87:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L95
            int r1 = r1.intValue()
            java.lang.String r10 = r0.getString(r1)
        L95:
            r8 = 0
            r1 = 217(0xd9, float:3.04E-43)
            java.lang.String r11 = X.AbstractC111324zv.A00(r1)
            com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration r4 = new com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration
            r13 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r18 = r0
            r19 = r4
            r20 = r8
            r15.A0v(r16, r17, r18, r19, r20, r21, r22)
            return
        Lac:
            r1 = 2131962394(0x7f132a1a, float:1.9561512E38)
            goto L87
        Lb0:
            r1 = 2131962400(0x7f132a20, float:1.9561524E38)
            goto L87
        Lb4:
            r1 = 2131962395(0x7f132a1b, float:1.9561514E38)
            goto L65
        Lb8:
            r1 = 2131962401(0x7f132a21, float:1.9561526E38)
            goto L65
        Lbc:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.A0E
            goto Lc4
        Lbf:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.A04
            goto Lc4
        Lc2:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.A09
        Lc4:
            java.util.List r12 = X.AbstractC166987dD.A1J(r1)
            goto L51
        Lc9:
            java.lang.String r6 = "commerce/community/featured_products/merchant_management/declined/"
            goto L38
        Lcd:
            java.lang.String r6 = "commerce/community/featured_products/merchant_management/pending/"
            goto L38
        Ld1:
            java.lang.String r6 = "commerce/community/featured_products/merchant_management/approved/"
            goto L38
        Ld5:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lda:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ldf:
            java.lang.String r0 = "title"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HCS.DKJ(X.ILf):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_featured_product_seller_management";
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
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A03;
        String str = "refreshableContainer";
        if (refreshableNestedScrollingParent != null) {
            AbstractC37304Gc5.A1R(refreshableNestedScrollingParent);
            InterfaceC09390do interfaceC09390do = this.A0D;
            this.A00 = AbstractC1571573u.A01(view, AbstractC166987dD.A0r(interfaceC09390do), new J1N(this, 6));
            RecyclerView A08 = AbstractC31180DnO.A08(view);
            A08.setItemAnimator(null);
            AbstractC31174DnI.A16(requireContext(), A08, 1, false);
            InterfaceC09390do interfaceC09390do2 = this.A07;
            AbstractC37304Gc5.A10(A08, interfaceC09390do2);
            AbstractC37304Gc5.A0y(A08.A0D, A08, new C42508Irn(this, 7), C153146ui.A06);
            this.A02 = A08;
            if (getScrollingViewProxy() instanceof C3FR) {
                boolean A1b = AbstractC37304Gc5.A1b(interfaceC09390do);
                String A00 = AbstractC111324zv.A00(70);
                C3FQ scrollingViewProxy = getScrollingViewProxy();
                C14360o3.A0C(scrollingViewProxy, A00);
                C3FR c3fr = (C3FR) scrollingViewProxy;
                if (A1b) {
                    InterfaceC70513Em interfaceC70513Em = this.A00;
                    str = "pullToRefresh";
                    if (interfaceC70513Em != null) {
                        C42082Ikp.A00(c3fr, (C71094Wnq) interfaceC70513Em, this, 7);
                        InterfaceC70513Em interfaceC70513Em2 = this.A00;
                        if (interfaceC70513Em2 != null) {
                            interfaceC70513Em2.ARj();
                        }
                    }
                } else {
                    c3fr.Ehc(new RunnableC43086J3b(this));
                }
            }
            C38975HEd.A00(interfaceC09390do2);
            ((C42883Ixx) this.A09.getValue()).FAs();
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(HCS hcs) {
        ((IN0) hcs.A0A.getValue()).A00(new JEZ(hcs, 48), new JEZ(hcs, 49));
    }

    @Override // X.JI1
    public final C25621Ms Ac9() {
        InterfaceC09390do interfaceC09390do = this.A0D;
        C25621Ms A0M = AbstractC31177DnL.A0M(AbstractC166987dD.A0o(interfaceC09390do));
        A0M.A9s("merchant_id", AbstractC31173DnH.A0t(interfaceC09390do));
        A0M.A0B("commerce/community/featured_products/merchant_management/approved/");
        A0M.A0R(C74293Vk.class, C74313Vm.class);
        return A0M;
    }

    @Override // X.JI1
    public final void Dls() {
        C38975HEd.A00(this.A07);
    }

    @Override // X.JI1
    public final /* bridge */ /* synthetic */ void Dlt(InterfaceC74303Vl interfaceC74303Vl, boolean z, boolean z2) {
        C74293Vk c74293Vk = (C74293Vk) interfaceC74303Vl;
        C14360o3.A0B(c74293Vk, 0);
        List list = this.A05;
        List list2 = c74293Vk.A06;
        C14360o3.A07(list2);
        list.addAll(list2);
        C38975HEd c38975HEd = (C38975HEd) this.A07.getValue();
        List list3 = c74293Vk.A06;
        C14360o3.A07(list3);
        C155946zO c155946zO = c38975HEd.A02;
        c155946zO.A04();
        c155946zO.A0B(list3);
        c38975HEd.A01();
        AbstractC37304Gc5.A1U(this.A08);
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        RecyclerView recyclerView = this.A02;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        C3FQ A00 = C3FN.A00(recyclerView);
        C14360o3.A07(A00);
        return A00;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // X.JI1
    public final boolean isEmpty() {
        return ((C2UT) this.A07.getValue()).isEmpty();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return ((AnonymousClass308) this.A0C.getValue()).onBackPressed();
    }

    @Override // X.C38N
    public final boolean DJk(MotionEvent motionEvent, View view, InterfaceC38411qV interfaceC38411qV, int i) {
        AbstractC167027dH.A12(view, motionEvent, interfaceC38411qV);
        return ((AnonymousClass308) this.A0C.getValue()).DuC(motionEvent, view, interfaceC38411qV, i);
    }

    @Override // X.JI1
    public final void Dlr(AbstractC115105If abstractC115105If, boolean z) {
        C9GR.A0F(getActivity(), "shopping_feed_failed", 2131956848);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(AbstractC25225BEi.A15(this.A0G));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(201939039);
        super.onCreate(bundle);
        ((C42883Ixx) this.A09.getValue()).EgQ();
        A00(this);
        AbstractC37304Gc5.A1K(this, this.A0B);
        AbstractC37304Gc5.A1J(this, this.A08);
        AbstractC37304Gc5.A1J(this, this.A0C);
        InterfaceC09390do interfaceC09390do = this.A0D;
        AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A0H, C42228InE.class);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0M(this, interfaceC09390do), "instagram_shopping_seller_management_entry");
        AbstractC37302Gc3.A0u(A0f, AbstractC37304Gc5.A06(this), AbstractC25225BEi.A15(this.A0F));
        A0f.Cht();
        C0f9.A09(581753611, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View A05;
        View view;
        int A02 = C0f9.A02(1430670453);
        C14360o3.A0B(layoutInflater, 0);
        if (AbstractC37304Gc5.A1b(this.A0D)) {
            A05 = layoutInflater.inflate(R.layout.layout_swipe_refresh_hscroll_recyclerview, viewGroup, false);
            view = A05.findViewById(R.id.refreshable_container);
        } else {
            A05 = AbstractC37304Gc5.A05(layoutInflater, viewGroup, R.layout.layout_refreshable_recyclerview);
            view = A05;
        }
        this.A03 = (RefreshableNestedScrollingParent) view;
        C14360o3.A0A(A05);
        C0f9.A09(-80386010, A02);
        return A05;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1218601207);
        super.onDestroy();
        AbstractC37304Gc5.A1M(this, this.A0B);
        AbstractC37304Gc5.A1L(this, this.A08);
        AbstractC37304Gc5.A1L(this, this.A0C);
        AbstractC31176DnK.A0Q(this.A0D).A02(this.A0H, C42228InE.class);
        C0f9.A09(465352449, A02);
    }
}
