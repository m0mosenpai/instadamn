package com.instagram.shopping.fragment.destination.productcollection;

import X.AbstractC018607g;
import X.AbstractC10360h2;
import X.AbstractC115105If;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC2044893h;
import X.AbstractC25225BEi;
import X.AbstractC25228BEl;
import X.AbstractC25229BEm;
import X.AbstractC25233BEq;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC31364DqT;
import X.AbstractC31402Dr6;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37304Gc5;
import X.AbstractC37423Ge3;
import X.AbstractC38851rI;
import X.AbstractC40733I3n;
import X.AbstractC41071vF;
import X.AbstractC41357ISk;
import X.AbstractC59962oe;
import X.AbstractC61112qZ;
import X.AbstractC65332xV;
import X.AbstractC76433bn;
import X.C006802i;
import X.C05F;
import X.C06090Tz;
import X.C08790ch;
import X.C0f9;
import X.C105824pt;
import X.C140966Yy;
import X.C14360o3;
import X.C153146ui;
import X.C153156uj;
import X.C1563970j;
import X.C18U;
import X.C193328hC;
import X.C1I4;
import X.C1M1;
import X.C1ON;
import X.C1XJ;
import X.C25671My;
import X.C28431Ze;
import X.C31368DqX;
import X.C37816GkW;
import X.C38321qM;
import X.C38385GuM;
import X.C38675GzG;
import X.C39030HGg;
import X.C39326HYr;
import X.C39696HjS;
import X.C3HW;
import X.C40791um;
import X.C41144IJj;
import X.C41206ILu;
import X.C41636IbR;
import X.C41646Ibe;
import X.C41755IeW;
import X.C42249InZ;
import X.C42873Ixn;
import X.C42878Ixs;
import X.C42901IyF;
import X.C42918IyW;
import X.C42927Iyf;
import X.C56352iT;
import X.C57112jm;
import X.C5GU;
import X.C64992wx;
import X.C71163Hc;
import X.C85963sQ;
import X.C99134ca;
import X.DialogInterfaceOnCancelListenerC55251OfP;
import X.DialogInterfaceOnClickListenerC35371Fim;
import X.DialogInterfaceOnClickListenerC41836Ifq;
import X.EnumC39583Hdt;
import X.EnumC39622HeW;
import X.HB3;
import X.HEZ;
import X.HH9;
import X.HHG;
import X.I7K;
import X.I7S;
import X.IDT;
import X.IFO;
import X.IKZ;
import X.IMK;
import X.INQ;
import X.InterfaceC02590Ai;
import X.InterfaceC41501vz;
import X.InterfaceC43444JHi;
import X.InterfaceC43455JHt;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.InterfaceC60442pS;
import X.InterfaceC65002wy;
import X.InterfaceC72783Nz;
import X.InterfaceC74303Vl;
import X.J1L;
import X.J1P;
import X.JGW;
import X.JGX;
import X.JI1;
import X.JPm;
import X.ViewOnTouchListenerC668930g;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.ShoppingBrandWithProducts;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.shopping.productfeed.ProductCollectionFooter;
import com.instagram.model.shopping.productfeed.ProductCollectionHeader;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
public class ProductCollectionFragment extends AbstractC59962oe implements C1M1, InterfaceC60442pS, InterfaceC65002wy, JI1, InterfaceC43444JHi, InterfaceC60122ou, JGX, InterfaceC72783Nz, JPm {
    public UserSession A00;
    public C38321qM A01;
    public C5GU A02;
    public ProductCollectionHeader A03;
    public EnumC39622HeW A04;
    public HEZ A05;
    public C41144IJj A06;
    public C41755IeW A07;
    public InterfaceC43455JHt A08;
    public INQ A09;
    public IKZ A0A;
    public C41646Ibe A0B;
    public J1L A0C;
    public User A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public C57112jm A0L;
    public IMK A0M;
    public HHG A0N;
    public C1563970j A0O;
    public C41206ILu A0P;
    public C42927Iyf A0Q;
    public C64992wx A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public IgdsBottomButtonLayout mFooterBtn;
    public View mFooterContainer;
    public RecyclerView mRecyclerView;
    public RefreshableNestedScrollingParent mRefreshableContainer;
    public final InterfaceC41501vz A0b = C37816GkW.A00(this, 20);
    public final InterfaceC41501vz A0a = C37816GkW.A00(this, 21);
    public final C1I4 A0Z = new C38385GuM(this, 0);
    public final JGW A0c = new C42873Ixn(this);
    public boolean A0X = false;
    public boolean A0K = false;
    public boolean A0W = false;
    public final List A0Y = AbstractC166987dD.A1E();

    @Override // X.JII
    public final void Db4(C38675GzG c38675GzG, Product product) {
    }

    @Override // X.JII
    public final /* synthetic */ void Db9(Product product, String str, String str2, int i, int i2) {
    }

    @Override // X.JII
    public final boolean DbA(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    @Override // X.JII
    public final /* synthetic */ void DbB(String str, int i) {
    }

    @Override // X.JII
    public final void DbH(Product product) {
    }

    @Override // X.JII
    public final void DbI(Product product) {
    }

    @Override // X.JII
    public final /* synthetic */ void DbJ(String str) {
    }

    @Override // X.JII
    public final /* synthetic */ void DbK(Product product) {
    }

    @Override // X.JI1
    public final void Dlr(AbstractC115105If abstractC115105If, boolean z) {
        C40791um c40791um;
        C41144IJj c41144IJj = this.A06;
        synchronized (c41144IJj) {
            Set set = c41144IJj.A05;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int A0B = AbstractC167007dF.A0B(it);
                C006802i c006802i = c41144IJj.A00;
                c006802i.markerPoint(A0B, "NETWORK_FAILED");
                c006802i.markerEnd(A0B, (short) 3);
            }
            set.clear();
        }
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        this.A08.FAs();
        if (abstractC115105If == null) {
            c40791um = null;
        } else {
            c40791um = (C40791um) abstractC115105If.A00();
        }
        if (this.A04 == EnumC39622HeW.A0B && c40791um != null && AbstractC37423Ge3.A00(c40791um.mStatusCode)) {
            FragmentActivity requireActivity = requireActivity();
            UserSession userSession = this.A00;
            String str = this.A0J;
            User user = this.A0D;
            AbstractC25233BEq.A0w(1, userSession, str, user);
            String A00 = AbstractC76433bn.A00(user);
            if (A00 != null) {
                C193328hC A0H = AbstractC31171DnF.A0H(requireActivity);
                A0H.A0A(2131973279);
                AbstractC31177DnL.A0v(requireActivity, A0H, AbstractC37300Gc1.A0U(user), 2131973278);
                A0H.A0F(DialogInterfaceOnClickListenerC41836Ifq.A00(requireActivity, 27));
                A0H.A0b(new DialogInterfaceOnClickListenerC35371Fim(requireActivity, user, this, userSession, str, A00, 1), AbstractC166997dE.A0p(requireActivity, 2131976887));
                A0H.A0C(new DialogInterfaceOnCancelListenerC55251OfP(requireActivity, 13));
                AbstractC166987dD.A1W(A0H);
                return;
            }
            return;
        }
        AbstractC37304Gc5.A0w(this);
    }

    @Override // X.JGX
    public final void E04(C38321qM c38321qM, C105824pt c105824pt) {
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    public static void A00(ProductCollectionFragment productCollectionFragment, String str, String str2, String str3) {
        String str4 = productCollectionFragment.A0I;
        if (str4 != null) {
            productCollectionFragment.A07.A06(productCollectionFragment.A02, str4, str, str2, productCollectionFragment.A0F);
        }
        FragmentActivity activity = productCollectionFragment.getActivity();
        activity.getClass();
        C140966Yy A0P = AbstractC31173DnH.A0P(activity, productCollectionFragment.A00);
        C28431Ze A02 = AbstractC31364DqT.A02();
        UserSession userSession = productCollectionFragment.A00;
        C31368DqX A022 = AbstractC31402Dr6.A02(userSession, str, str2, productCollectionFragment.getModuleName());
        A022.A0G = str3;
        A022.A0L = productCollectionFragment.A0J;
        A022.A08 = productCollectionFragment.A0T;
        C31368DqX.A01(A0P, userSession, A02, A022);
    }

    @Override // X.InterfaceC43444JHi
    public final void A8F(User user) {
        this.A0Q.A8F(user);
    }

    @Override // X.InterfaceC65012wz
    public final void A9P(User user, int i) {
        this.A0R.A9P(user, i);
    }

    @Override // X.InterfaceC65002wy
    public final void A9Q(IDT idt, Integer num) {
        this.A0R.A9Q(idt, num);
    }

    @Override // X.InterfaceC65002wy
    public final void APi(C99134ca c99134ca, int i) {
        this.A0R.APi(c99134ca, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    @Override // X.JI1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C25621Ms Ac9() {
        /*
            r7 = this;
            com.instagram.common.session.UserSession r0 = r7.A00
            X.1Ms r2 = X.AbstractC31173DnH.A0N(r0)
            java.lang.Class<X.HYr> r1 = X.C39326HYr.class
            java.lang.Class<X.ISN> r0 = X.ISN.class
            r2.A0S(r1, r0)
            X.IKZ r4 = r7.A0A
            X.HeW r6 = r4.A02
            int r1 = r6.ordinal()
            java.lang.String r5 = "merchant_id"
            java.lang.String r3 = "ads_tracking_token"
            r0 = 0
            switch(r1) {
                case 1: goto L90;
                case 2: goto L1d;
                case 3: goto L1d;
                case 4: goto L1d;
                case 5: goto L1d;
                case 6: goto L6d;
                case 7: goto L1d;
                case 8: goto L55;
                case 9: goto L36;
                case 10: goto L30;
                case 11: goto L33;
                case 12: goto L1d;
                case 13: goto L1d;
                case 14: goto L48;
                case 15: goto L1d;
                case 16: goto L39;
                default: goto L1d;
            }
        L1d:
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            r0 = 1840(0x730, float:2.578E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.String r0 = X.AbstractC167017dG.A0n(r6, r0, r1)
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L30:
            java.lang.String r0 = "save/products/reconsideration/from_saved_posts_feed/"
            goto L98
        L33:
            java.lang.String r0 = "save/products/reconsideration/from_liked_posts_feed/"
            goto L98
        L36:
            java.lang.String r0 = "save/products/reconsideration/from_followed_brands_feed/"
            goto L98
        L39:
            java.lang.String r0 = r4.A04
            r0.getClass()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "commerce/incentive/%s/"
            r2.A0L(r0, r1)
            goto L4d
        L48:
            java.lang.String r0 = "commerce/reconsideration/recently_viewed_products_feed/"
            r2.A0B(r0)
        L4d:
            java.lang.String r0 = r4.A06
            if (r0 == 0) goto L9b
            r2.A9s(r5, r0)
            return r2
        L55:
            java.lang.String r0 = "commerce/product_collections/ads_collection_page/"
            r2.A0B(r0)
            com.instagram.common.session.UserSession r0 = r4.A01
            java.lang.String r1 = r4.A05
            java.lang.String r0 = X.AbstractC41071vF.A0I(r0, r1)
            r2.A9s(r3, r0)
            if (r1 == 0) goto L9b
            java.lang.String r0 = "ig_dynamic_ad_media_id"
            r2.A9s(r0, r1)
            return r2
        L6d:
            java.lang.String r0 = r4.A09
            r0.getClass()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "commerce/product_collections/collection_page/%s/"
            X.AbstractC31173DnH.A1Q(r2, r0, r1)
            java.lang.String r1 = r4.A08
            java.lang.String r0 = "prior_module"
            r2.A9s(r0, r1)
            com.instagram.common.session.UserSession r1 = r4.A01
            java.lang.String r0 = r4.A05
            java.lang.String r0 = X.AbstractC41071vF.A0I(r1, r0)
            if (r0 == 0) goto L9b
            r2.A9s(r3, r0)
            return r2
        L90:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "commerce/products/checkout/"
            java.lang.String r0 = X.AbstractC13670mt.A06(r0, r1)
        L98:
            r2.A0B(r0)
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment.Ac9():X.1Ms");
    }

    @Override // X.InterfaceC43418JGi
    public final void D2v(String str, String str2, String str3, int i, int i2) {
        this.A0B.A08(str2, str3, i, i2);
    }

    @Override // X.InterfaceC43444JHi
    public final void D7m(User user) {
        this.A0Q.D7m(user);
    }

    @Override // X.InterfaceC65022x0
    public final void DSs(ShoppingBrandWithProducts shoppingBrandWithProducts, String str, int i) {
        this.A0R.DSs(shoppingBrandWithProducts, str, i);
    }

    @Override // X.JII
    public final void Db5(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
        this.A0B.A01(view, c38675GzG, productFeedItem, AbstractC76433bn.A00(this.A0D), i, i2);
    }

    @Override // X.JII
    public final void Db6(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
        C41646Ibe c41646Ibe = this.A0B;
        AbstractC167017dG.A1N(productFeedItem, view);
        c41646Ibe.A02(c38675GzG, productFeedItem, null, null, null, i, i2);
    }

    @Override // X.JII
    public final void DbC(Product product, int i, int i2) {
        this.A0B.A06(product, i, i2);
    }

    @Override // X.JII
    public final void DbE(C38675GzG c38675GzG, ProductTile productTile, int i, int i2) {
        C41646Ibe c41646Ibe = this.A0B;
        C14360o3.A0B(productTile, 0);
        c41646Ibe.A03(c38675GzG, productTile, i, i2, true);
    }

    @Override // X.JII
    public final boolean DbG(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        HHG hhg = this.A0N;
        ProductTile productTile = productFeedItem.A02;
        C14360o3.A0B(motionEvent, 1);
        hhg.A07 = productTile;
        hhg.A01 = i;
        hhg.A00 = i2;
        hhg.A0B = str;
        hhg.A0E = true;
        if (hhg.A0D && motionEvent.getActionMasked() == 3) {
            hhg.A0D = false;
            return true;
        }
        ((ViewOnTouchListenerC668930g) hhg.A0S.getValue()).onTouch(view, motionEvent);
        return true;
    }

    @Override // X.JI1
    public final void Dls() {
        C41144IJj c41144IJj = this.A06;
        synchronized (c41144IJj) {
            Iterator it = c41144IJj.A05.iterator();
            while (it.hasNext()) {
                c41144IJj.A00.markerPoint(AbstractC167007dF.A0B(it), "SERVER_FETCH");
            }
        }
    }

    @Override // X.JI1
    public final /* bridge */ /* synthetic */ void Dlt(InterfaceC74303Vl interfaceC74303Vl, boolean z, boolean z2) {
        C39326HYr c39326HYr = (C39326HYr) interfaceC74303Vl;
        C41144IJj c41144IJj = this.A06;
        synchronized (c41144IJj) {
            Iterator it = c41144IJj.A05.iterator();
            while (it.hasNext()) {
                c41144IJj.A00.markerPoint(AbstractC167007dF.A0B(it), "SUCCESS_NETWORK");
            }
        }
        String str = this.A0I;
        if (z && str != null) {
            C41755IeW c41755IeW = this.A07;
            C5GU c5gu = this.A02;
            String str2 = this.A0F;
            C14360o3.A0B(c5gu, 1);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41755IeW.A02, "shops_product_collection_page_load_success");
            if (A0f.isSampled()) {
                AbstractC37301Gc2.A15(A0f, c41755IeW.A01);
                AbstractC37300Gc1.A0f(A0f, C41755IeW.A02(c41755IeW, null));
                A0f.AAK(C41755IeW.A03(A0f, c5gu, c41755IeW, str, str2), "merchant_igid");
                A0f.AAQ(C41755IeW.A01(c41755IeW), "feed_item_info");
                A0f.Cht();
            }
        }
        HEZ hez = this.A05;
        C14360o3.A0B(c39326HYr, 0);
        ProductFeedResponse productFeedResponse = ((HB3) c39326HYr).A02;
        C14360o3.A07(productFeedResponse);
        ProductCollectionHeader productCollectionHeader = c39326HYr.A01;
        IFO ifo = c39326HYr.A02;
        ProductCollectionFooter productCollectionFooter = c39326HYr.A00;
        C39696HjS c39696HjS = ((HB3) c39326HYr).A01;
        if (z) {
            hez.A0I.A04();
            hez.A02 = null;
            hez.A01 = null;
            hez.A03 = null;
            hez.A00 = null;
            hez.notifyDataSetChanged();
        }
        hez.A02 = c39696HjS;
        if (productCollectionHeader != null) {
            hez.A01 = productCollectionHeader;
        }
        if (ifo != null) {
            hez.A03 = ifo;
        }
        if (productCollectionFooter != null) {
            hez.A00 = productCollectionFooter;
        }
        hez.A01(AbstractC31172DnG.A19(productFeedResponse.A03));
        hez.A00();
        I7K.A00(this);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        this.A08.FAs();
        C39696HjS c39696HjS2 = ((HB3) c39326HYr).A01;
        if (c39696HjS2 != null && c39696HjS2.A03 != null) {
            FragmentActivity activity = getActivity();
            activity.getClass();
            C56352iT AYT = ((BaseFragmentActivity) activity).AYT();
            if (AYT != null) {
                AYT.A0T();
            }
        }
        if (!this.A0K) {
            this.A0K = true;
        }
        this.A03 = c39326HYr.A01;
        A01(Collections.unmodifiableList(((HB3) c39326HYr).A02.A03));
    }

    @Override // X.JHT
    public final void Dw2(UnavailableProduct unavailableProduct, int i, int i2) {
        C41646Ibe c41646Ibe = this.A0B;
        C14360o3.A0B(unavailableProduct, 0);
        I7S.A00(c41646Ibe.A02.requireActivity(), c41646Ibe.A03, c41646Ibe.A04, unavailableProduct, c41646Ibe.A0I, c41646Ibe.A0E);
    }

    @Override // X.JHT
    public final void Dw3(ProductFeedItem productFeedItem) {
        this.A0B.A04(productFeedItem);
    }

    @Override // X.InterfaceC43444JHi
    public final void EDC(View view) {
        this.A0Q.EDC(view);
    }

    @Override // X.InterfaceC65012wz
    public final void EDT(View view, User user) {
        this.A0R.EDT(view, user);
    }

    @Override // X.InterfaceC65002wy
    public final void EDU(View view, String str) {
        this.A0R.EDU(view, str);
    }

    @Override // X.InterfaceC65002wy
    public final void F9d(View view) {
        this.A0R.F9d(view);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        CharSequence charSequence;
        EnumC39622HeW enumC39622HeW;
        String str;
        User A0k;
        if (this.mFragmentManager != null) {
            interfaceC56362iU.EkS(true);
            if (this.A0W) {
                AbstractC31179DnN.A1G(interfaceC56362iU);
            }
            IKZ ikz = this.A0A;
            String str2 = ikz.A03;
            if (str2 == null && (((enumC39622HeW = ikz.A02) == EnumC39622HeW.A0I || enumC39622HeW == EnumC39622HeW.A0L) && (str = ikz.A07) != null)) {
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
                String str3 = ikz.A06;
                if (str3 != null && (A0k = AbstractC31174DnI.A0k(ikz.A01, str3)) != null && A0k.isVerified()) {
                    C85963sQ.A08(ikz.A00, A0H, true);
                }
                interfaceC56362iU.Efv(A0H);
            } else {
                EnumC39622HeW enumC39622HeW2 = ikz.A02;
                if ((enumC39622HeW2 != EnumC39622HeW.A0P && enumC39622HeW2 != EnumC39622HeW.A0O) || (charSequence = ikz.A07) == null) {
                    if (enumC39622HeW2 != EnumC39622HeW.A0F && enumC39622HeW2 != EnumC39622HeW.A0G && enumC39622HeW2 != EnumC39622HeW.A0H) {
                        if (str2 == null) {
                            str2 = ikz.A00.getString(2131969978);
                        }
                        interfaceC56362iU.setTitle(str2);
                    } else {
                        charSequence = ikz.A0A;
                    }
                }
                interfaceC56362iU.EaW(charSequence, str2);
            }
            IMK imk = this.A0M;
            if (imk != null) {
                imk.A00(interfaceC56362iU);
            }
            C1563970j c1563970j = this.A0O;
            if (c1563970j != null) {
                c1563970j.A01(interfaceC56362iU);
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        EnumC39622HeW enumC39622HeW = this.A0A.A02;
        switch (enumC39622HeW.ordinal()) {
            case 1:
                return "instagram_shopping_home_checkout_product_feed";
            case 9:
            case 10:
            case 11:
                return enumC39622HeW.toString();
            case 14:
                return "recently_viewed_products";
            case 16:
                return "instagram_shopping_incentive_collection";
            default:
                return "instagram_shopping_product_collection";
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.C1M1
    public final String getSessionId() {
        return this.A0J;
    }

    @Override // X.JI1
    public final boolean isEmpty() {
        return this.A05.isEmpty();
    }

    @Override // X.InterfaceC72783Nz
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && recyclerView.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    private void A01(List list) {
        ProductImageContainer productImageContainer;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductFeedItem productFeedItem = (ProductFeedItem) it.next();
            Product A02 = productFeedItem.A02();
            if (A02 != null && (productImageContainer = A02.A0A) != null && productImageContainer.BGx().AlQ() != null) {
                this.A0Y.add(AbstractC166987dD.A16(productFeedItem.A02().A0A.BGx().AlQ()));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r29v3, types: [X.HKv, X.2xV] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String str;
        ProductFeedResponse productFeedResponse;
        String str2;
        long j;
        String str3;
        int A02 = C0f9.A02(441683205);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A0J = AbstractC61112qZ.A00(requireArguments);
        if (requireArguments.getString("prior_module_name") == null) {
            string = "";
        } else {
            string = requireArguments.getString("prior_module_name");
        }
        this.A0G = string;
        User user = (User) requireArguments.getParcelable("merchant");
        if (user == null) {
            String string2 = requireArguments.getString("merchant_id");
            String string3 = requireArguments.getString("merchant_username");
            Parcelable.Creator creator = User.CREATOR;
            user = AbstractC38851rI.A05(string2, string3);
        }
        this.A0D = user;
        this.A0H = requireArguments.getString("prior_submodule_name");
        String string4 = requireArguments.getString("product_feed_type");
        EnumC39622HeW enumC39622HeW = (EnumC39622HeW) EnumC39622HeW.A01.get(string4);
        if (enumC39622HeW != null) {
            this.A04 = enumC39622HeW;
            String string5 = requireArguments.getString("product_feed_label");
            String string6 = requireArguments.getString("product_feed_subtitle");
            this.A0E = Integer.valueOf(requireArguments.getInt("product_feed_index"));
            this.A0I = requireArguments.getString("product_collection_id");
            this.A02 = AbstractC40733I3n.A00(requireArguments.getString("product_collection_type"));
            this.A0F = requireArguments.getString("incentive_id");
            this.A0X = requireArguments.getBoolean("is_sponsored", false);
            this.A0W = requireArguments.getBoolean("is_modal");
            this.A0T = requireArguments.getString("media_id");
            this.A03 = (ProductCollectionHeader) requireArguments.getParcelable("product_collection_header");
            this.A0U = requireArguments.getString("query_text");
            this.A0V = requireArguments.getString("search_session_id");
            this.A0S = requireArguments.getString("gift_recipient_id");
            this.A0A = new IKZ(requireContext(), this.A00, this.A04, this.A0G, this.A0I, string5, string6, AbstractC76433bn.A00(this.A0D), AbstractC37300Gc1.A0U(this.A0D), this.A0F, this.A0T);
            C41755IeW c41755IeW = new C41755IeW(this, this.A00, this.A0J, this.A0G, this.A0H, AbstractC76433bn.A00(this.A0D), this.A0T, null, this.A0U, this.A0V);
            this.A07 = c41755IeW;
            String str4 = this.A0I;
            if (str4 != null) {
                c41755IeW.A05(this.A02, str4, this.A0F);
            }
            String str5 = this.A0T;
            if (str5 != null) {
                C38321qM A0h = AbstractC25229BEm.A0h(this.A00, str5);
                this.A01 = A0h;
                if (A0h == null) {
                    C1ON A04 = AbstractC2044893h.A04(this.A00, str5);
                    C39030HGg.A00(A04, this, 24);
                    schedule(A04);
                }
            }
            EnumC39622HeW enumC39622HeW2 = this.A04;
            String str6 = this.A0I;
            String A00 = AbstractC76433bn.A00(this.A0D);
            C38321qM c38321qM = this.A01;
            if (c38321qM != null) {
                str = AbstractC41071vF.A07(this.A00, c38321qM);
            } else {
                str = null;
            }
            this.A06 = new C41144IJj(enumC39622HeW2, str6, A00, str);
            if (this.A0A.A02.ordinal() != 16) {
                productFeedResponse = (ProductFeedResponse) requireArguments.getParcelable("product_feed");
                if (productFeedResponse != null) {
                    str2 = productFeedResponse.A01;
                } else {
                    str2 = null;
                }
            } else {
                productFeedResponse = null;
                str2 = null;
            }
            Context requireContext = requireContext();
            C08790ch A002 = AbstractC018607g.A00(this);
            UserSession userSession = this.A00;
            C14360o3.A0B(userSession, 3);
            J1L j1l = new J1L(requireContext, A002, userSession, this, str2);
            this.A0C = j1l;
            this.A08 = new C42878Ixs(this, j1l);
            this.A0L = C57112jm.A00();
            C42918IyW c42918IyW = new C42918IyW(this);
            C42901IyF c42901IyF = new C42901IyF(this, 0);
            this.A0P = AbstractC41357ISk.A00(this.A00, EnumC39583Hdt.A04);
            C41636IbR c41636IbR = new C41636IbR(this, this.A00, this, this.A04, this.A0J, this.A0G, this.A0H);
            String str7 = this.A0I;
            C5GU c5gu = this.A02;
            c41636IbR.A0D = str7;
            c41636IbR.A02 = c5gu;
            c41636IbR.A06 = null;
            c41636IbR.A05 = c42918IyW;
            c41636IbR.A04 = c42901IyF;
            c41636IbR.A0I = this.A0X;
            c41636IbR.A01 = this.A01;
            c41636IbR.A00 = this.A0L;
            c41636IbR.A0B = AbstractC76433bn.A00(this.A0D);
            c41636IbR.A0A = this.A0T;
            c41636IbR.A0E = this.A0U;
            c41636IbR.A0F = this.A0V;
            c41636IbR.A08 = this.A0S;
            this.A0B = c41636IbR.A02();
            FragmentActivity requireActivity = requireActivity();
            UserSession userSession2 = this.A00;
            C57112jm c57112jm = this.A0L;
            String str8 = this.A0G;
            String str9 = this.A0H;
            String str10 = this.A0J;
            Integer num = C05F.A0Y;
            String str11 = this.A0I;
            this.A0Q = new C42927Iyf(requireActivity, userSession2, c57112jm, this.A01, this, this.A02, num, str8, str9, str10, str11);
            UserSession userSession3 = this.A00;
            C57112jm c57112jm2 = this.A0L;
            String str12 = this.A0G;
            String str13 = this.A0H;
            String str14 = this.A0J;
            Integer num2 = C05F.A0N;
            String str15 = this.A0I;
            C5GU c5gu2 = this.A02;
            AbstractC167007dF.A1F(userSession3, 3, c57112jm2);
            this.A0R = new C64992wx(this, userSession3, c57112jm2, this, c5gu2, num2, str12, str13, str14, str15, null, null, -1);
            List list = HHG.A0U;
            HHG hhg = new HHG(requireActivity(), requireContext(), this, this.A00, this.A0J);
            this.A0N = hhg;
            registerLifecycleListener(hhg);
            UserSession userSession4 = this.A00;
            C38321qM c38321qM2 = this.A01;
            if (c38321qM2 != null) {
                AbstractC41071vF.A07(userSession4, c38321qM2);
            }
            C38321qM c38321qM3 = this.A01;
            if (c38321qM3 != null) {
                AbstractC41071vF.A0F(this.A00, c38321qM3);
            }
            HH9 hh9 = new HH9(this, userSession4, this.A0L);
            registerLifecycleListener(hh9);
            Context requireContext2 = requireContext();
            J1L j1l2 = this.A0C;
            ?? abstractC65332xV = new AbstractC65332xV();
            UserSession userSession5 = this.A00;
            C5GU c5gu3 = this.A02;
            C38321qM c38321qM4 = this.A01;
            String A0U = AbstractC37300Gc1.A0U(this.A0D);
            EnumC39622HeW enumC39622HeW3 = this.A04;
            InterfaceC43455JHt interfaceC43455JHt = this.A08;
            C41144IJj c41144IJj = this.A06;
            ProductCollectionHeader productCollectionHeader = this.A03;
            C5GU c5gu4 = this.A02;
            C5GU c5gu5 = C5GU.A04;
            UserSession userSession6 = this.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (c5gu4 == c5gu5) {
                j = 36310959190507912L;
            } else {
                j = 36310959190442375L;
            }
            HEZ hez = new HEZ(requireContext2, userSession5, c38321qM4, this, c5gu3, productCollectionHeader, enumC39622HeW3, c41144IJj, interfaceC43455JHt, this, abstractC65332xV, hh9, j1l2, A0U, this.A0I, AbstractC31178DnM.A1X(c06090Tz, userSession6, j));
            this.A05 = hez;
            if (productFeedResponse != null) {
                hez.A01(Collections.unmodifiableList(productFeedResponse.A03));
                this.A05.A00();
                A01(Collections.unmodifiableList(productFeedResponse.A03));
            }
            IKZ ikz = this.A0A;
            EnumC39622HeW enumC39622HeW4 = ikz.A02;
            EnumC39622HeW enumC39622HeW5 = EnumC39622HeW.A0I;
            if ((enumC39622HeW4 == enumC39622HeW5 || enumC39622HeW4 == EnumC39622HeW.A0L) && C18U.A06(c06090Tz, ikz.A01, 36311822478869276L)) {
                C1XJ c1xj = C1XJ.A00;
                FragmentActivity activity = getActivity();
                activity.getClass();
                UserSession userSession7 = this.A00;
                String str16 = this.A0J;
                String moduleName = getModuleName();
                int ordinal = this.A0A.A02.ordinal();
                if (ordinal != 6 && ordinal != 8) {
                    str3 = null;
                } else {
                    str3 = "product_collection_page";
                }
                str3.getClass();
                this.A0O = c1xj.A0Q(activity, userSession7, null, this.A0P, str16, moduleName, str3, AbstractC41071vF.A0I(this.A00, this.A0T), this.A0T, null, null);
            }
            if (requireArguments().getBoolean("show_wishlist_icon")) {
                UserSession userSession8 = this.A00;
                this.A0M = new IMK(requireContext(), requireActivity(), userSession8, null, getModuleName(), this.A0J);
            }
            this.A09 = new INQ(requireContext(), this.A00, this, this);
            C25671My A003 = AbstractC25651Mw.A00(this.A00);
            A003.A01(this.A0b, C3HW.class);
            A003.A01(this.A0a, C42249InZ.class);
            C41144IJj c41144IJj2 = this.A06;
            synchronized (c41144IJj2) {
                EnumC39622HeW enumC39622HeW6 = c41144IJj2.A01;
                if (enumC39622HeW6 == enumC39622HeW5 || enumC39622HeW6 == EnumC39622HeW.A0L) {
                    Set set = c41144IJj2.A05;
                    if (set.contains(37355530)) {
                        c41144IJj2.A00.markerEnd(37355530, (short) 111);
                    }
                    set.add(37355530);
                    C006802i c006802i = c41144IJj2.A00;
                    c006802i.markerStart(37355530);
                    String str17 = c41144IJj2.A04;
                    if (str17 != null) {
                        c006802i.markerAnnotate(37355530, "product_collection_id", str17);
                    }
                    String str18 = c41144IJj2.A02;
                    if (str18 != null) {
                        c006802i.markerAnnotate(37355530, "ad_id", str18);
                    }
                    String str19 = c41144IJj2.A03;
                    if (str19 != null) {
                        c006802i.markerAnnotate(37355530, "merchant_id", str19);
                    }
                }
            }
            this.A0C.A01(AbstractC25229BEm.A1Z(str2), false);
            this.A08.FAs();
            C0f9.A09(-150377185, A02);
            return;
        }
        throw AbstractC167007dF.A0c("Cannot parse product feed type = ", string4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1632998409);
        this.mRefreshableContainer = (RefreshableNestedScrollingParent) layoutInflater.inflate(R.layout.layout_refreshable_recyclerview, viewGroup, false);
        if (viewGroup != null && this.A04 == EnumC39622HeW.A0L) {
            View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.layout_sticky_footer, viewGroup, false);
            this.mFooterContainer = inflate;
            this.mFooterBtn = (IgdsBottomButtonLayout) inflate.findViewById(R.id.product_collection_footer_cta_btn);
        }
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        refreshableNestedScrollingParent.A07 = new J1P(this, 1);
        AbstractC37304Gc5.A1R(refreshableNestedScrollingParent);
        this.mRecyclerView = AbstractC31176DnK.A0F(this.mRefreshableContainer);
        FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager = new FastScrollingLinearLayoutManager(requireContext());
        fastScrollingLinearLayoutManager.A12(true);
        this.mRecyclerView.setLayoutManager(fastScrollingLinearLayoutManager);
        this.mRecyclerView.setAdapter(this.A05);
        this.mRecyclerView.setItemAnimator(null);
        this.mRecyclerView.A14(new C153156uj(fastScrollingLinearLayoutManager, this.A0C, C153146ui.A0B));
        this.mRecyclerView.A14(this.A0Z);
        this.mRecyclerView.setClipToPadding(false);
        RecyclerView recyclerView = this.mRecyclerView;
        recyclerView.getClass();
        Integer num = this.A0E;
        if (num != null) {
            recyclerView.A0n(num.intValue() / 2);
            this.A0E = null;
        }
        this.A0P.A00();
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.mRefreshableContainer;
        C0f9.A09(-208486726, A02);
        return refreshableNestedScrollingParent2;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-219948154);
        super.onDestroy();
        C5GU c5gu = this.A02;
        String str = this.A0I;
        if (str != null && c5gu != null) {
            C41755IeW c41755IeW = this.A07;
            String str2 = this.A0F;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41755IeW.A02, "instagram_shopping_product_collection_page_exit");
            if (A0f.isSampled()) {
                AbstractC37300Gc1.A0f(A0f, C41755IeW.A02(c41755IeW, null));
                C41755IeW.A04(C41755IeW.A03(A0f, c5gu, c41755IeW, str, str2), A0f, c41755IeW);
            }
        }
        C25671My A00 = AbstractC25651Mw.A00(this.A00);
        A00.A02(this.A0b, C3HW.class);
        A00.A02(this.A0a, C42249InZ.class);
        C0f9.A09(-593255141, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-8683268);
        super.onDestroyView();
        ProductCollectionFragmentLifecycleUtil.cleanupReferences(this);
        C41206ILu c41206ILu = this.A0P;
        c41206ILu.A01.flowEndSuccess(c41206ILu.A00);
        C0f9.A09(2000921421, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1377056836);
        super.onPause();
        this.A09.A02("fragment_paused");
        C41144IJj c41144IJj = this.A06;
        synchronized (c41144IJj) {
            Set set = c41144IJj.A05;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                c41144IJj.A00.markerEnd(AbstractC167007dF.A0B(it), (short) 22);
            }
            set.clear();
        }
        C0f9.A09(369709597, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        AbstractC10360h2 abstractC10360h2;
        int A02 = C0f9.A02(-1690166350);
        super.onResume();
        if (this.A0K && this.A05.isEmpty() && (abstractC10360h2 = this.mFragmentManager) != null) {
            abstractC10360h2.A0b();
        }
        I7K.A00(this);
        C0f9.A09(-1188672351, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C57112jm c57112jm = this.A0L;
        if (c57112jm != null) {
            c57112jm.A06(this.mRecyclerView, C71163Hc.A00(this));
        }
    }
}
