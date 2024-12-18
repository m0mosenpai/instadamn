package com.instagram.shopping.fragment.destination.wishlist;

import X.AbstractC018607g;
import X.AbstractC110824yu;
import X.AbstractC115105If;
import X.AbstractC12220kQ;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25229BEm;
import X.AbstractC25234BEr;
import X.AbstractC25651Mw;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37303Gc4;
import X.AbstractC37304Gc5;
import X.AbstractC41357ISk;
import X.AbstractC41775Ier;
import X.AbstractC59962oe;
import X.AbstractC61112qZ;
import X.AbstractC65332xV;
import X.AbstractC70663Fe;
import X.C006802i;
import X.C05F;
import X.C06090Tz;
import X.C08790ch;
import X.C0f9;
import X.C1338462s;
import X.C14360o3;
import X.C153146ui;
import X.C153156uj;
import X.C1563970j;
import X.C1M1;
import X.C1OU;
import X.C1XJ;
import X.C25621Ms;
import X.C25671My;
import X.C31349DqE;
import X.C36074FwA;
import X.C37816GkW;
import X.C38972HEa;
import X.C38B;
import X.C39142HKv;
import X.C3G2;
import X.C3HW;
import X.C3M4;
import X.C40965ICm;
import X.C41165IKe;
import X.C41206ILu;
import X.C41633IbO;
import X.C41636IbR;
import X.C41646Ibe;
import X.C41660Ibs;
import X.C42880Ixu;
import X.C42919IyX;
import X.C42931Iyj;
import X.C57112jm;
import X.C5GU;
import X.C62862tP;
import X.C64952wt;
import X.C65883Tvn;
import X.C71163Hc;
import X.C9GR;
import X.EnumC153216up;
import X.EnumC33447EqK;
import X.EnumC39583Hdt;
import X.EnumC39622HeW;
import X.EnumC69983Ch;
import X.HB3;
import X.HH8;
import X.ID1;
import X.IMS;
import X.INF;
import X.InterfaceC02590Ai;
import X.InterfaceC1571373s;
import X.InterfaceC41501vz;
import X.InterfaceC43420JGk;
import X.InterfaceC43455JHt;
import X.InterfaceC53782dH;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.InterfaceC60442pS;
import X.InterfaceC64872wl;
import X.InterfaceC74303Vl;
import X.InterfaceC99144cb;
import X.J1L;
import X.J1P;
import X.J89;
import X.JGV;
import X.JI1;
import X.JPn;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
public class WishListFeedFragment extends AbstractC59962oe implements C1M1, InterfaceC60442pS, InterfaceC64872wl, JI1, InterfaceC60122ou, InterfaceC1571373s, JGV {
    public UserSession A00;
    public C38972HEa A01;
    public HH8 A02;
    public InterfaceC43455JHt A03;
    public J1L A04;
    public C57112jm A08;
    public IMS A09;
    public C41165IKe A0A;
    public C41646Ibe A0B;
    public C1563970j A0C;
    public C41206ILu A0D;
    public JPn A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public RecyclerView mRecyclerView;
    public RefreshableNestedScrollingParent mRefreshableContainer;
    public final InterfaceC41501vz A0K = C37816GkW.A00(this, 27);
    public final ID1 A0I = new ID1(this);
    public final InterfaceC41501vz A0J = C37816GkW.A00(this, 28);
    public boolean A05 = false;
    public boolean A07 = false;
    public boolean A06 = false;

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }

    @Override // X.JI1
    public final void Dls() {
    }

    @Override // X.InterfaceC64872wl
    public final void E10(InterfaceC99144cb interfaceC99144cb) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_save_product_collection";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public final boolean A01() {
        if (this.A01.A06.A01.size() == 1 && !this.A04.A01.A05()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC64872wl
    public final void AA0(InterfaceC99144cb interfaceC99144cb, int i) {
        this.A09.A05.A03(interfaceC99144cb, ((MultiProductComponent) interfaceC99144cb).A00(), i);
    }

    @Override // X.JI1
    public final C25621Ms Ac9() {
        C25621Ms A0N = AbstractC31173DnH.A0N(this.A00);
        A0N.A0S(HB3.class, C41660Ibs.class);
        if (this.A07) {
            A0N.A0B("save/products/reconsideration/wish_list_collections_feed/");
            return A0N;
        }
        A0N.A0B("save/products/context_feed/");
        A0N.A9s("surface_type", "wishlist");
        return A0N;
    }

    @Override // X.InterfaceC64882wm
    public final JPn Bh2() {
        JPn jPn = this.A0E;
        if (jPn == null) {
            C42931Iyj c42931Iyj = new C42931Iyj(this.A00, this.A09, this.A0A, this.A0B);
            this.A0E = c42931Iyj;
            return c42931Iyj;
        }
        return jPn;
    }

    @Override // X.JGV
    public final void D9J(C1338462s c1338462s) {
        C38972HEa.A01(this.A01);
    }

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        C40965ICm c40965ICm = (C40965ICm) userSession.A01(C40965ICm.class, J89.A00);
        synchronized (c40965ICm) {
            AbstractC37304Gc5.A1T(c40965ICm.A00, 37357157);
        }
    }

    @Override // X.JI1
    public final /* bridge */ /* synthetic */ void Dlt(InterfaceC74303Vl interfaceC74303Vl, boolean z, boolean z2) {
        C38972HEa c38972HEa;
        List unmodifiableList;
        C39142HKv c39142HKv;
        HB3 hb3 = (HB3) interfaceC74303Vl;
        if (z) {
            C38972HEa c38972HEa2 = this.A01;
            c38972HEa2.A06.A04();
            c38972HEa2.A07.A04();
            C38972HEa.A01(c38972HEa2);
        }
        if (this.A07) {
            this.A06 = false;
            c38972HEa = this.A01;
            unmodifiableList = Collections.unmodifiableList(hb3.A02.A03);
            C14360o3.A0B(unmodifiableList, 0);
            c39142HKv = c38972HEa.A07;
            c39142HKv.A04();
        } else {
            if (!this.A04.A01.A05()) {
                this.A07 = true;
                this.A06 = true;
                this.A04.A01(false, false);
            }
            c38972HEa = this.A01;
            unmodifiableList = Collections.unmodifiableList(hb3.A02.A03);
            C14360o3.A0B(unmodifiableList, 0);
            c39142HKv = c38972HEa.A06;
        }
        c39142HKv.A0B(unmodifiableList);
        C38972HEa.A01(c38972HEa);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        this.A03.FAs();
        if (!this.A05) {
            this.A05 = true;
        }
    }

    @Override // X.InterfaceC64872wl
    public final void E0q(EnumC39622HeW enumC39622HeW, InterfaceC99144cb interfaceC99144cb, int i) {
        String title;
        String str;
        String str2;
        int i2 = i;
        IMS ims = this.A09;
        ProductFeedResponse productFeedResponse = null;
        InterfaceC60442pS interfaceC60442pS = ims.A02;
        UserSession userSession = ims.A01;
        EnumC39622HeW B60 = interfaceC99144cb.B60();
        B60.getClass();
        String obj = B60.toString();
        String str3 = ims.A06;
        String str4 = ims.A07;
        AbstractC41775Ier.A0C(userSession, interfaceC60442pS, interfaceC99144cb, obj, str3, str4);
        if (interfaceC99144cb.Aiv() != null && interfaceC99144cb.Aiv().Ax5() != null) {
            title = interfaceC99144cb.Aiv().Ax5();
        } else {
            title = interfaceC99144cb.getTitle();
        }
        boolean A1a = AbstractC25229BEm.A1a(enumC39622HeW, EnumC39622HeW.A0O);
        INF A0J = C1XJ.A00.A0J(ims.A00.getActivity(), userSession, enumC39622HeW, str4, interfaceC60442pS.getModuleName());
        A0J.A0D = title;
        String str5 = null;
        if (interfaceC99144cb.Aiv() != null) {
            str = interfaceC99144cb.Aiv().Ax4();
        } else {
            str = null;
        }
        A0J.A0C = str;
        A0J.A03 = null;
        EnumC39622HeW B602 = interfaceC99144cb.B60();
        EnumC39622HeW enumC39622HeW2 = EnumC39622HeW.A0B;
        if (B602 == enumC39622HeW2) {
            str2 = "incentive_products";
        } else {
            str2 = null;
        }
        A0J.A0A = str2;
        if (A1a) {
            productFeedResponse = interfaceC99144cb.Bgy();
        } else {
            i2 = 0;
        }
        A0J.A02 = productFeedResponse;
        A0J.A00 = i2;
        if (enumC39622HeW == enumC39622HeW2 && interfaceC99144cb.Aiv() != null) {
            str5 = interfaceC99144cb.Aiv().Ax2();
        }
        A0J.A05 = str5;
        A0J.A00();
    }

    @Override // X.InterfaceC64872wl
    public final void E0z(InterfaceC99144cb interfaceC99144cb) {
        IMS ims = this.A09;
        InterfaceC60442pS interfaceC60442pS = ims.A02;
        UserSession userSession = ims.A01;
        String A00 = ((MultiProductComponent) interfaceC99144cb).A00();
        String str = ims.A06;
        String str2 = ims.A07;
        AbstractC41775Ier.A0C(userSession, interfaceC60442pS, interfaceC99144cb, A00, str, str2);
        C1XJ.A00.A1A(ims.A00.getActivity(), userSession, str2, interfaceC60442pS.getModuleName(), interfaceC99144cb.C3N());
    }

    @Override // X.InterfaceC64872wl
    public final void EDe(View view, InterfaceC99144cb interfaceC99144cb) {
        this.A09.A05.A01(view, interfaceC99144cb, ((MultiProductComponent) interfaceC99144cb).A00());
    }

    @Override // X.InterfaceC64872wl
    public final void F9g(View view) {
        this.A09.A05.A00.A04(view);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        if (this.mFragmentManager != null) {
            interfaceC56362iU.EkS(true);
            interfaceC56362iU.Efu(2131972804);
            C1563970j c1563970j = this.A0C;
            if (c1563970j != null) {
                c1563970j.A01(interfaceC56362iU);
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.C1M1
    public final String getSessionId() {
        return this.A0H;
    }

    @Override // X.JI1
    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.1vN] */
    public static void A00(ProductFeedItem productFeedItem, WishListFeedFragment wishListFeedFragment, boolean z) {
        boolean A01 = wishListFeedFragment.A01();
        C38972HEa c38972HEa = wishListFeedFragment.A01;
        C39142HKv c39142HKv = c38972HEa.A06;
        if (z) {
            AbstractC65332xV.A01(c39142HKv, productFeedItem, 0, true);
            C38972HEa.A01(c38972HEa);
            RecyclerView recyclerView = wishListFeedFragment.mRecyclerView;
            if (recyclerView != null && wishListFeedFragment.getContext() != null) {
                C65883Tvn c65883Tvn = new C65883Tvn(wishListFeedFragment.getContext(), wishListFeedFragment, 2);
                ((AbstractC110824yu) c65883Tvn).A00 = 0;
                AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
                if (abstractC70663Fe != null) {
                    abstractC70663Fe.A10(c65883Tvn);
                }
            }
        } else {
            c39142HKv.A0E(AbstractC37301Gc2.A0j(productFeedItem));
            C38972HEa.A01(c38972HEa);
        }
        boolean A012 = wishListFeedFragment.A01();
        if (A01 != A012) {
            C25671My A00 = AbstractC25651Mw.A00(wishListFeedFragment.A00);
            if (A012) {
                C14360o3.A07(((ProductFeedItem) wishListFeedFragment.A01.A06.A01.get(0)).getId());
            }
            A00.E4s(new Object());
        }
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        ((InterfaceC53782dH) requireActivity()).Als().Emy(EnumC33447EqK.A0J, EnumC69983Ch.A02);
    }

    @Override // X.JI1
    public final void Dlr(AbstractC115105If abstractC115105If, boolean z) {
        C9GR.A01(getActivity(), "shopping_feed_failed", 2131956848, 0);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        this.A03.FAs();
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        C40965ICm c40965ICm = (C40965ICm) userSession.A01(C40965ICm.class, J89.A00);
        synchronized (c40965ICm) {
            Set set = c40965ICm.A00;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A0o(AbstractC167007dF.A0B(it));
            }
            set.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        int A02 = C0f9.A02(-1984987144);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A00 = A0S;
        C14360o3.A0B(A0S, 0);
        C40965ICm c40965ICm = (C40965ICm) A0S.A01(C40965ICm.class, J89.A00);
        synchronized (c40965ICm) {
            Set set = c40965ICm.A00;
            set.add(AbstractC37303Gc4.A0N(set, 37357157));
            C006802i.A0p.markerStart(37357157);
        }
        this.A0H = AbstractC61112qZ.A00(requireArguments);
        if (requireArguments.getString("prior_module_name") == null) {
            string = "";
        } else {
            string = requireArguments.getString("prior_module_name");
        }
        this.A0F = string;
        String string2 = requireArguments.getString("prior_submodule_name");
        this.A0G = string2;
        UserSession userSession = this.A00;
        String str = this.A0F;
        String str2 = this.A0H;
        AbstractC25234BEr.A1P(userSession, str, str2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, userSession), "instagram_shopping_wishlist_entry");
        C38B A04 = AbstractC37303Gc4.A04(str, string2);
        AbstractC37303Gc4.A0z(A04, "shopping_session_id", str2);
        AbstractC37300Gc1.A0f(A0f, A04);
        A0f.Cht();
        C08790ch A00 = AbstractC018607g.A00(this);
        getContext().getClass();
        Context context = getContext();
        UserSession userSession2 = this.A00;
        AbstractC167017dG.A1Q(context, userSession2);
        J1L j1l = new J1L(context, A00, userSession2, this, null);
        this.A04 = j1l;
        this.A03 = new C42880Ixu(getContext(), this, j1l);
        this.A08 = C57112jm.A00();
        this.A02 = new HH8(requireActivity(), A00, this.A00, this, C05F.A0C, null);
        C42919IyX c42919IyX = new C42919IyX(this);
        C41636IbR c41636IbR = new C41636IbR(this, this.A00, this, EnumC39622HeW.A0P, this.A0H, this.A0F, this.A0G);
        c41636IbR.A00 = this.A08;
        c41636IbR.A03 = this;
        c41636IbR.A05 = c42919IyX;
        this.A0B = c41636IbR.A02();
        C64952wt A002 = C41636IbR.A00(c41636IbR);
        UserSession userSession3 = c41636IbR.A0L;
        InterfaceC60442pS interfaceC60442pS = c41636IbR.A0M;
        C57112jm c57112jm = c41636IbR.A00;
        if (c57112jm != null) {
            EnumC39622HeW enumC39622HeW = c41636IbR.A0N;
            String str3 = c41636IbR.A0Q;
            String str4 = c41636IbR.A0O;
            C5GU c5gu = c41636IbR.A02;
            if (c5gu == null || c5gu.toString() == null) {
                enumC39622HeW.toString();
            }
            C41633IbO c41633IbO = new C41633IbO(userSession3, c57112jm, interfaceC60442pS, A002, str3, str4, null, null, c41636IbR.A0G);
            Fragment fragment = c41636IbR.A0K;
            InterfaceC43420JGk interfaceC43420JGk = c41636IbR.A05;
            WishListFeedFragment wishListFeedFragment = c41636IbR.A03;
            if (wishListFeedFragment != null) {
                this.A0A = new C41165IKe(fragment, userSession3, interfaceC60442pS, A002, wishListFeedFragment, interfaceC43420JGk, c41633IbO, str3, str4);
                this.A09 = c41636IbR.A01();
                Context context2 = getContext();
                J1L j1l2 = this.A04;
                UserSession userSession4 = this.A00;
                this.A01 = new C38972HEa(context2, C62862tP.A03(this, userSession4, this.A08), this, userSession4, this.A02, this.A03, this, j1l2);
                C25671My A003 = AbstractC25651Mw.A00(this.A00);
                A003.A01(this.A0K, C3HW.class);
                A003.A01(this.A0J, C36074FwA.class);
                this.A04.A01(true, false);
                this.A02.A00();
                this.A03.FAs();
                this.A0D = AbstractC41357ISk.A00(this.A00, EnumC39583Hdt.A0C);
                if (getActivity() != null) {
                    if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A00, 36311822478869276L)) {
                        C1563970j A0Q = C1XJ.A00.A0Q(getActivity(), this.A00, null, this.A0D, this.A0H, "instagram_shopping_save_product_collection", "wish_list", null, null, null, null);
                        this.A0C = A0Q;
                        registerLifecycleListener(A0Q);
                    }
                }
                C0f9.A09(1521225881, A02);
                return;
            }
            throw AbstractC166987dD.A14("wishlistFeedControllerProvider must not be null");
        }
        throw AbstractC166987dD.A14("viewpointManager must not be null");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2076361187);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) layoutInflater.inflate(R.layout.layout_refreshable_recyclerview, viewGroup, false);
        this.mRefreshableContainer = refreshableNestedScrollingParent;
        refreshableNestedScrollingParent.A07 = new J1P(this, 3);
        AbstractC37304Gc5.A1R(refreshableNestedScrollingParent);
        this.mRecyclerView = AbstractC31176DnK.A0F(this.mRefreshableContainer);
        getContext().getClass();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        linearLayoutManager.A12(true);
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        this.mRecyclerView.setAdapter(this.A01);
        this.mRecyclerView.setItemAnimator(null);
        this.mRecyclerView.A14(new C153156uj(linearLayoutManager, this.A04, C153146ui.A0B));
        int A06 = AbstractC167017dG.A06(requireContext());
        AbstractC13880nE.A0j(this.mRecyclerView, A06, A06);
        this.mRecyclerView.setClipToPadding(false);
        this.A0D.A00();
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.mRefreshableContainer;
        C0f9.A09(1672513038, A02);
        return refreshableNestedScrollingParent2;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1650950438);
        super.onDestroy();
        UserSession userSession = this.A00;
        String str = this.A0F;
        String str2 = this.A0G;
        String str3 = this.A0H;
        AbstractC25234BEr.A1P(userSession, str, str3);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, userSession), "instagram_shopping_wishlist_exit");
        C38B A04 = AbstractC37303Gc4.A04(str, str2);
        AbstractC37303Gc4.A0z(A04, "shopping_session_id", str3);
        AbstractC37300Gc1.A0f(A0f, A04);
        A0f.Cht();
        C25671My A00 = AbstractC25651Mw.A00(this.A00);
        A00.A02(this.A0K, C3HW.class);
        A00.A02(this.A0J, C36074FwA.class);
        C1563970j c1563970j = this.A0C;
        if (c1563970j != null) {
            unregisterLifecycleListener(c1563970j);
        }
        C0f9.A09(181832436, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1564559347);
        super.onDestroyView();
        WishListFeedFragmentLifecycleUtil.cleanupReferences(this);
        C41206ILu c41206ILu = this.A0D;
        c41206ILu.A01.flowEndSuccess(c41206ILu.A00);
        C0f9.A09(16392404, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-220896419);
        super.onPause();
        C41165IKe c41165IKe = this.A0A;
        C31349DqE c31349DqE = c41165IKe.A00;
        if (c31349DqE != null) {
            AbstractC31177DnL.A1L(c31349DqE);
            c41165IKe.A00 = null;
        }
        C0f9.A09(1970468112, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C3G2 c3g2;
        int A02 = C0f9.A02(2076459789);
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C1OU c1ou = C1OU.$redex_init_class;
            C3M4 A05 = C3M4.A05(activity);
            if (A05 != null && A05.A0a() && ((c3g2 = A05.A0G) == C3G2.A1o || c3g2 == C3G2.A1i)) {
                A05.A0Y(this);
            }
        }
        C0f9.A09(972404127, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            this.A08.A06(recyclerView, C71163Hc.A00(this));
        }
    }

    @Override // X.InterfaceC64872wl
    public final void E0v(InterfaceC99144cb interfaceC99144cb, User user) {
    }
}
