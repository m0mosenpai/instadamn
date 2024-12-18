package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class HCI extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou, InterfaceC43443JHh, JGV, JPm {
    public static final String A0Y = AbstractC31173DnH.A0q(EnumC39583Hdt.A0A);
    public static final String __redex_internal_original_name = "ShoppingReconsiderationDestinationFragment";
    public RefreshableNestedScrollingParent A00;
    public RecyclerView A01;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final InterfaceC41501vz A0U;
    public final InterfaceC41501vz A0V = C37816GkW.A00(this, 24);
    public final InterfaceC09390do A07 = C1XM.A00(new C43209J8g(this, 5));
    public final InterfaceC41501vz A0W = C37816GkW.A00(this, 25);
    public final InterfaceC41501vz A0T = C37816GkW.A00(this, 22);
    public final InterfaceC41501vz A0X = C37816GkW.A00(this, 26);
    public final InterfaceC09390do A05 = C43209J8g.A01(this, 3);
    public final InterfaceC09390do A0M = C43209J8g.A01(this, 18);
    public final InterfaceC09390do A0E = C43209J8g.A01(this, 12);
    public final InterfaceC09390do A0F = C43209J8g.A01(this, 13);
    public final InterfaceC09390do A0C = C43209J8g.A01(this, 10);
    public final InterfaceC09390do A0D = C43209J8g.A01(this, 11);
    public final InterfaceC09390do A0P = C43209J8g.A01(this, 24);
    public final InterfaceC09390do A02 = C43209J8g.A01(this, 0);
    public final InterfaceC09390do A09 = C43209J8g.A01(this, 7);
    public final InterfaceC09390do A0A = C43209J8g.A01(this, 8);
    public final InterfaceC09390do A0N = C43209J8g.A01(this, 19);
    public final InterfaceC09390do A0O = C43209J8g.A01(this, 20);
    public final InterfaceC09390do A04 = C43209J8g.A01(this, 2);
    public final InterfaceC09390do A08 = C43209J8g.A01(this, 6);
    public final InterfaceC09390do A0B = C43209J8g.A01(this, 9);

    public static C41646Ibe A00(HCI hci, Object obj) {
        C14360o3.A0B(obj, 0);
        return (C41646Ibe) hci.A0H.getValue();
    }

    @Override // X.InterfaceC43418JGi
    public final void D2v(String str, String str2, String str3, int i, int i2) {
    }

    @Override // X.JII
    public final void Db5(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
        AbstractC167017dG.A1N(productFeedItem, view);
        ((C41646Ibe) this.A0H.getValue()).A01(view, c38675GzG, productFeedItem, null, i, i2);
    }

    @Override // X.JII
    public final /* synthetic */ void Db9(Product product, String str, String str2, int i, int i2) {
    }

    @Override // X.JII
    public final boolean DbA(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        C14360o3.A0B(productFeedItem, 0);
        if (z) {
            return ((C41646Ibe) this.A0H.getValue()).A09(productFeedItem);
        }
        return false;
    }

    @Override // X.JII
    public final void DbE(C38675GzG c38675GzG, ProductTile productTile, int i, int i2) {
        String str;
        A00(this, productTile).A03(c38675GzG, productTile, i, i2, true);
        C41741IeF A0K = AbstractC37304Gc5.A0K(this);
        if (c38675GzG != null) {
            str = c38675GzG.A04;
        } else {
            str = null;
        }
        String str2 = A0K.A02;
        if (C14360o3.A0K(str2, "instagram_shopping_mini_shop_storefront")) {
            EnumC39644HiZ enumC39644HiZ = EnumC39644HiZ.STOREFRONT;
            C41741IeF.A02(EnumC39651Hig.A0D, enumC39644HiZ, C41741IeF.A00(str), EnumC39649Hie.A03, A0K);
            return;
        }
        if (!C14360o3.A0K(str2, "instagram_shopping_home")) {
            return;
        }
        C41741IeF.A03(EnumC39651Hig.A0D, EnumC39644HiZ.TAB_FEED, C41741IeF.A00(str), EnumC39649Hie.A03, A0K);
    }

    @Override // X.JII
    public final boolean DbG(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        boolean A1b = AbstractC25233BEq.A1b(view, motionEvent, productFeedItem);
        ProductTile productTile = productFeedItem.A02;
        if (productTile == null || z) {
            return false;
        }
        HHG hhg = (HHG) this.A0G.getValue();
        hhg.A07 = productTile;
        hhg.A01 = i;
        hhg.A00 = i2;
        hhg.A0B = str;
        hhg.A0E = A1b;
        if (hhg.A0D && motionEvent.getActionMasked() == 3) {
            hhg.A0D = false;
        } else {
            ((ViewOnTouchListenerC668930g) hhg.A0S.getValue()).onTouch(view, motionEvent);
        }
        return true;
    }

    @Override // X.JII
    public final void DbK(Product product) {
        C41646Ibe A00 = A00(this, product);
        C1XJ.A00.A0z(A00.A02.requireActivity(), A00.A03, A00.A04, product, A00.A0E, A00.A0F, A00.A0I);
        A00.A07.A03(product, "view_similar");
    }

    @Override // X.JHT
    public final void Dw2(UnavailableProduct unavailableProduct, int i, int i2) {
    }

    @Override // X.JHT
    public final void Dw3(ProductFeedItem productFeedItem) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r4) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.0do r0 = r3.A0C
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L6a
            X.0do r2 = r3.A0D
            java.lang.Object r0 = r2.getValue()
            if (r0 == 0) goto L6a
            X.0do r0 = r3.A0P
            java.lang.String r1 = X.AbstractC25225BEi.A15(r0)
            if (r1 != 0) goto L2f
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L68
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L68
            r0 = 2131974012(0x7f13577c, float:1.9585076E38)
            java.lang.String r1 = r1.getString(r0)
        L2f:
            java.lang.String r0 = X.AbstractC25225BEi.A15(r2)
            r4.EaW(r1, r0)
        L36:
            X.0do r0 = r3.A0S
            java.lang.Object r0 = r0.getValue()
            X.IMK r0 = (X.IMK) r0
            if (r0 == 0) goto L43
            r0.A00(r4)
        L43:
            X.0do r0 = r3.A06
            java.lang.Object r0 = r0.getValue()
            X.70j r0 = (X.C1563970j) r0
            if (r0 == 0) goto L50
            r0.A01(r4)
        L50:
            r0 = 1
            r4.EkS(r0)
            X.3LO r2 = X.AbstractC31171DnF.A0B()
            r0 = 2131237967(0x7f081c4f, float:1.80922E38)
            r2.A01 = r0
            r1 = 52
            X.Ik2 r0 = new X.Ik2
            r0.<init>(r3, r1)
            X.AbstractC31176DnK.A1C(r0, r2, r4)
            return
        L68:
            r1 = 0
            goto L2f
        L6a:
            X.0do r0 = r3.A0P
            java.lang.String r0 = X.AbstractC25225BEi.A15(r0)
            if (r0 != 0) goto L7d
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r3)
            r0 = 2131974012(0x7f13577c, float:1.9585076E38)
            java.lang.String r0 = X.AbstractC166997dE.A0q(r1, r0)
        L7d:
            r4.setTitle(r0)
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HCI.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_reconsideration_destination";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView A08;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00;
        if (refreshableNestedScrollingParent != null && (A08 = AbstractC31180DnO.A08(refreshableNestedScrollingParent)) != null) {
            this.A01 = A08;
            AbstractC37301Gc2.A0v(A08, (C57112jm) this.A0R.getValue(), this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(A08.getContext(), 1, false);
            linearLayoutManager.A12(true);
            A08.setLayoutManager(linearLayoutManager);
            AbstractC37304Gc5.A10(A08, this.A03);
            C70623Ez c70623Ez = new C70623Ez();
            ((C3F0) c70623Ez).A00 = false;
            A08.setItemAnimator(c70623Ez);
            AbstractC37304Gc5.A0y(A08.A0D, A08, new C42508Irn(this, 4), C153146ui.A06);
            A08.setClipToPadding(false);
            C38383GuK c38383GuK = (C38383GuK) this.A0J.getValue();
            String str = A0Y;
            C14360o3.A08(str);
            c38383GuK.A00(A08, str);
            C38331GtQ c38331GtQ = (C38331GtQ) this.A0Q.getValue();
            AbstractC37301Gc2.A0w(getViewLifecycleOwner(), c38331GtQ.A02, new JEZ(this, 44), 10);
            AbstractC37301Gc2.A0w(getViewLifecycleOwner(), c38331GtQ.A01, new JEZ(this, 45), 10);
            ((C41206ILu) this.A07.getValue()).A00();
            return;
        }
        throw AbstractC166987dD.A14("Container not created in onViewCreated");
    }

    @Override // X.InterfaceC43443JHh
    public final /* bridge */ /* synthetic */ void AAr(Object obj, Object obj2) {
        H7J h7j = (H7J) obj;
        C41024IEt c41024IEt = (C41024IEt) obj2;
        C41646Ibe c41646Ibe = (C41646Ibe) this.A0H.getValue();
        InterfaceC09390do interfaceC09390do = this.A0C;
        String A15 = AbstractC25225BEi.A15(interfaceC09390do);
        C41633IbO c41633IbO = c41646Ibe.A0A;
        if (c41633IbO != null) {
            h7j.A00 = c41646Ibe.A0B;
            c41633IbO.A02(c41024IEt, h7j, A15);
        }
        I6J.A00(AbstractC166987dD.A0r(this.A0K)).A03(AbstractC25225BEi.A15(interfaceC09390do));
    }

    @Override // X.JGV
    public final void D9J(C1338462s c1338462s) {
        ((C38331GtQ) this.A0Q.getValue()).A00 = c1338462s;
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null && recyclerView.getScrollY() == 0) {
            RecyclerView recyclerView2 = this.A01;
            C14360o3.A0A(recyclerView2);
            recyclerView2.A0n(0);
        }
    }

    @Override // X.JII
    public final void Db6(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
        String str;
        String str2;
        String str3;
        EnumC39650Hif enumC39650Hif;
        EnumC39650Hif enumC39650Hif2;
        AbstractC167017dG.A1N(productFeedItem, view);
        String str4 = null;
        if (c38675GzG != null) {
            str = c38675GzG.A04;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str, "cart")) {
            str3 = "reconsideration_destination_cart";
        } else {
            if (c38675GzG != null) {
                str2 = c38675GzG.A04;
            } else {
                str2 = null;
            }
            if (C14360o3.A0K(str2, "wish_list")) {
                str3 = "reconsideration_destination_wishlist";
            } else {
                if (c38675GzG != null) {
                    str4 = c38675GzG.A04;
                }
                if (C14360o3.A0K(str4, "recently_viewed")) {
                    str3 = "reconsideration_destination_recently_viewed";
                } else {
                    str3 = "reconsideration_destination";
                }
            }
        }
        if (c38675GzG != null) {
            c38675GzG.A00 = str3;
        }
        InterfaceC09390do interfaceC09390do = this.A0E;
        if (C14360o3.A0K(interfaceC09390do.getValue(), "instagram_shopping_mini_shop_storefront")) {
            C41741IeF A0K = AbstractC37304Gc5.A0K(this);
            EnumC39644HiZ enumC39644HiZ = EnumC39644HiZ.STOREFRONT;
            EnumC39651Hig enumC39651Hig = EnumC39651Hig.A0A;
            EnumC39649Hie enumC39649Hie = EnumC39649Hie.A03;
            if (str3.equals("reconsideration_destination_wishlist")) {
                enumC39650Hif2 = EnumC39650Hif.A0B;
            } else {
                enumC39650Hif2 = EnumC39650Hif.A03;
            }
            C41741IeF.A02(enumC39651Hig, enumC39644HiZ, enumC39650Hif2, enumC39649Hie, A0K);
        } else if (C14360o3.A0K(interfaceC09390do.getValue(), "instagram_shopping_home")) {
            C41741IeF A0K2 = AbstractC37304Gc5.A0K(this);
            EnumC39651Hig enumC39651Hig2 = EnumC39651Hig.A0A;
            EnumC39649Hie enumC39649Hie2 = EnumC39649Hie.A03;
            EnumC39644HiZ enumC39644HiZ2 = EnumC39644HiZ.TAB_FEED;
            if (str3.equals("reconsideration_destination_wishlist")) {
                enumC39650Hif = EnumC39650Hif.A0B;
            } else {
                enumC39650Hif = EnumC39650Hif.A03;
            }
            C41741IeF.A03(enumC39651Hig2, enumC39644HiZ2, enumC39650Hif, enumC39649Hie2, A0K2);
        }
        ((C41646Ibe) this.A0H.getValue()).A02(c38675GzG, productFeedItem, Long.valueOf(AbstractC166987dD.A0N(this.A0O.getValue())), AbstractC25225BEi.A15(this.A0N), AbstractC25225BEi.A15(this.A04), i, i2);
    }

    @Override // X.InterfaceC43443JHh
    public final /* bridge */ /* synthetic */ void EDu(View view, Object obj) {
        H7J h7j = (H7J) obj;
        C14360o3.A0B(h7j, 1);
        C41633IbO c41633IbO = ((C41646Ibe) this.A0H.getValue()).A0A;
        if (c41633IbO != null) {
            c41633IbO.A01(view, h7j);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0K);
    }

    public HCI() {
        C43209J8g c43209J8g = new C43209J8g(this, 25);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C43209J8g(new C43209J8g(this, 21), 22));
        this.A0Q = AbstractC25225BEi.A0a(new C43209J8g(A00, 23), c43209J8g, new C57252Pba(49, null, A00), AbstractC25225BEi.A1D(C38331GtQ.class));
        this.A03 = C43209J8g.A01(this, 1);
        this.A0R = AbstractC09440dt.A01(J8B.A00);
        this.A0H = C43209J8g.A01(this, 15);
        this.A0L = C43209J8g.A01(this, 17);
        this.A0J = AbstractC09440dt.A01(J8A.A00);
        this.A06 = C1XM.A00(new C43209J8g(this, 4));
        this.A0S = C43209J8g.A01(this, 26);
        this.A0I = C1XM.A00(new C43209J8g(this, 16));
        this.A0G = C1XM.A00(new C43209J8g(this, 14));
        this.A0U = C37816GkW.A00(this, 23);
        this.A0K = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC43443JHh
    public final /* bridge */ /* synthetic */ void AAq(Object obj) {
        throw C00O.createAndThrow();
    }

    @Override // X.JII
    public final void Db4(C38675GzG c38675GzG, Product product) {
        String str;
        A00(this, product).A07(product, "reconsideration_destination_feed");
        C41741IeF A0K = AbstractC37304Gc5.A0K(this);
        if (c38675GzG != null) {
            str = c38675GzG.A04;
        } else {
            str = null;
        }
        String str2 = A0K.A02;
        if (C14360o3.A0K(str2, "instagram_shopping_mini_shop_storefront")) {
            EnumC39644HiZ enumC39644HiZ = EnumC39644HiZ.STOREFRONT;
            C41741IeF.A02(EnumC39651Hig.A02, enumC39644HiZ, C41741IeF.A00(str), EnumC39649Hie.A03, A0K);
            return;
        }
        if (!C14360o3.A0K(str2, "instagram_shopping_home")) {
            return;
        }
        C41741IeF.A03(EnumC39651Hig.A02, EnumC39644HiZ.TAB_FEED, C41741IeF.A00(str), EnumC39649Hie.A03, A0K);
    }

    @Override // X.JII
    public final void DbB(String str, int i) {
        C41646Ibe A00 = A00(this, str);
        C38321qM A0h = AbstractC25229BEm.A0h(A00.A03, str);
        if (A0h != null) {
            AnonymousClass387 anonymousClass387 = A00.A06;
            anonymousClass387.Di3(A0h, new C75113Zb(), new C42818Iwu(anonymousClass387), i);
        }
    }

    @Override // X.JII
    public final void DbC(Product product, int i, int i2) {
        A00(this, product).A06(product, i, i2);
    }

    @Override // X.JII
    public final void DbH(Product product) {
        C41646Ibe.A00(A00(this, product), product, "view_in_cart_cta");
    }

    @Override // X.JII
    public final void DbI(Product product) {
        A00(this, product).A05(product);
    }

    @Override // X.JII
    public final void DbJ(String str) {
        C41646Ibe A00 = A00(this, str);
        UserSession userSession = A00.A03;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null) {
            C1XJ.A00.A0s(A00.A02.requireActivity(), userSession, A0h, A00.A04, new C75113Zb(), null, null, A00.A0I, A00.A0F);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
    
        if (((X.C39336HZb) r1).A00 == null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0132  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HCI.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1581046125);
        C14360o3.A0B(layoutInflater, 0);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) AbstractC37304Gc5.A05(layoutInflater, viewGroup, R.layout.layout_refreshable_recyclerview);
        refreshableNestedScrollingParent.A07 = new J1P(this, 2);
        AbstractC37304Gc5.A1R(refreshableNestedScrollingParent);
        this.A00 = refreshableNestedScrollingParent;
        C0f9.A09(334062078, A02);
        return refreshableNestedScrollingParent;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        int A02 = C0f9.A02(1834849142);
        super.onDestroy();
        C25671My A0Q = AbstractC31176DnK.A0Q(this.A0K);
        A0Q.A02(this.A0W, C3HW.class);
        A0Q.A02(this.A0U, C42247InX.class);
        A0Q.A02(this.A0T, C42253Ind.class);
        A0Q.A02(this.A0X, C71I.class);
        A0Q.A02(this.A0V, C42257Inh.class);
        AbstractC37304Gc5.A1L(this, this.A0I);
        AbstractC37304Gc5.A1L(this, this.A0G);
        C41741IeF A0K = AbstractC37304Gc5.A0K(this);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A0K.A00, "instagram_shopping_reconsideration_destination_exit");
        if (A0f.isSampled()) {
            AbstractC37300Gc1.A0f(A0f, C41741IeF.A01(A0K, null));
            String str2 = A0K.A04;
            if (str2 != null) {
                boolean z = A0K.A05;
                C4SX A00 = C4SX.A00(str2);
                if (z) {
                    str = "marketer_id";
                } else {
                    str = "merchant_id";
                }
                A0f.AAK(A00, str);
            }
            Long l = A0K.A01;
            if (l != null) {
                AbstractC37304Gc5.A15(A0f, l, (l.longValue() > 0L ? 1 : (l.longValue() == 0L ? 0 : -1)));
            }
            A0f.Cht();
        }
        C0f9.A09(-242256497, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1936261967);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        C41206ILu c41206ILu = (C41206ILu) this.A07.getValue();
        c41206ILu.A01.flowEndSuccess(c41206ILu.A00);
        C0f9.A09(1099738521, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1116697930);
        super.onPause();
        C41642IbY A00 = I6J.A00(AbstractC166987dD.A0r(this.A0K));
        String A15 = AbstractC25225BEi.A15(this.A0C);
        synchronized (A00) {
            C37669Gi2 A002 = C41642IbY.A00(A00, A15);
            Iterator it = ((java.util.Set) A002.A01).iterator();
            while (it.hasNext()) {
                int A0B = AbstractC167007dF.A0B(it);
                C006802i.A0p.markerPoint(A0B, "USER_NAVIGATION_CANCELLATION");
                C006802i.A0p.markerEnd(A0B, (short) 4);
                A002.A01 = AnonymousClass090.A03(Integer.valueOf(A0B), (java.util.Set) A002.A01);
            }
        }
        C0f9.A09(1949203909, A02);
    }
}
