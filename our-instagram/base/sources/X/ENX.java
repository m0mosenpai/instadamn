package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class ENX extends AbstractC60672pq implements InterfaceC60442pS, InterfaceC62612t0, InterfaceC60092or, InterfaceC11480j6, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SaveHomeFragment";
    public C64842wi A00;
    public C64742wY A01;
    public EQI A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public ViewOnTouchListenerC60632pm A08;
    public C57112jm A09;
    public C34964Fao A0A;
    public final FHK A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final C61372qz A0E = new C61372qz();

    public final void A03(SavedCollection savedCollection, int i, int i2) {
        long j;
        String str;
        EnumC33416Epn enumC33416Epn = savedCollection.A07;
        if (enumC33416Epn == EnumC33416Epn.A0B) {
            Bundle A0b = AbstractC166987dD.A0b();
            InterfaceC09390do interfaceC09390do = this.A0D;
            AbstractC31173DnH.A1C(A0b, AbstractC166987dD.A0r(interfaceC09390do));
            A0b.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", EnumC39551HdN.A05);
            A0b.putString("prior_module", getModuleName());
            EQI eqi = this.A02;
            if (eqi == null) {
                AbstractC31171DnF.A0t();
                throw C00O.createAndThrow();
            }
            A0b.putInt("ARGUMENT_NUM_MEDIA_COLLECTIONS", eqi.A01);
            if (this.A04) {
                A0b.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", new SavedCollection());
                str = "saved_feed";
            } else {
                str = "create_collection";
            }
            AbstractC31173DnH.A1I(this, AbstractC31171DnF.A0L(requireActivity(), A0b, AbstractC166987dD.A0r(interfaceC09390do), ModalActivity.class, str));
            return;
        }
        if (enumC33416Epn == EnumC33416Epn.A0D) {
            FB6.A00().A04(requireActivity(), AbstractC166987dD.A0r(this.A0D));
            return;
        }
        EnumC33416Epn enumC33416Epn2 = EnumC33416Epn.A08;
        InterfaceC09390do interfaceC09390do2 = this.A0D;
        if (enumC33416Epn == enumC33416Epn2) {
            AbstractC31175DnJ.A0s(null, FB5.A00(AbstractC166987dD.A0r(interfaceC09390do2), null, false, true, false), AbstractC25225BEi.A0r(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do2)));
            return;
        }
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do2);
        C14360o3.A0B(A0r, 1);
        try {
            String str2 = savedCollection.A0F;
            C14360o3.A07(str2);
            j = Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            j = -1;
        }
        String A00 = AbstractC154266wb.A00(i, i2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, A0r), AbstractC111324zv.A00(224));
        A0f.A7v(AbstractC111324zv.A00(2639), false);
        A0f.A9K("entity_id", Long.valueOf(j));
        A0f.AAP("entity_name", savedCollection.A0G);
        A0f.AAP("collection_type", savedCollection.A07.A00);
        AbstractC25233BEq.A17(A0f, "position", A00);
        A0f.AAP("saved_collection_type", savedCollection.A02());
        A0f.AAP("collection_id", savedCollection.A0F);
        A0f.AAP("collection_name", savedCollection.A0G);
        AbstractC25232BEp.A1L(A0f, "user_type", AbstractC35089Fd0.A01(savedCollection.A01(A0r)));
        FB6.A00().A02(requireActivity(), this, AbstractC166987dD.A0r(interfaceC09390do2), savedCollection);
        C1VN c1vn = C1VN.A00;
        if (c1vn != null) {
            c1vn.A02(AbstractC166987dD.A0r(interfaceC09390do2), getActivity(), "413864835927042");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r5.EkS(r0);
        r5.Ehq(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r4.A05 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r2 = X.AbstractC31171DnF.A0B();
        r2.A02(X.C05F.A1I);
        r2.A05 = 2131972732;
        X.AbstractC31176DnK.A1B(new X.ViewOnClickListenerC35686FpL(r4, 20), r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        r5.ARk(0, r4.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        if (r4.A06 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r1 > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r0 = true;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r5) {
        /*
            r4 = this;
            r3 = 0
            X.C14360o3.A0B(r5, r3)
            boolean r1 = r4.A05
            r0 = 2131972816(0x7f1352d0, float:1.958265E38)
            if (r1 != 0) goto Le
            r0 = 2131972800(0x7f1352c0, float:1.9582618E38)
        Le:
            r5.Efu(r0)
            X.0h2 r0 = r4.mFragmentManager
            if (r0 == 0) goto L21
            int r1 = r0.A0L()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L21
            if (r1 > 0) goto L26
        L21:
            boolean r1 = r4.A06
            r0 = 0
            if (r1 == 0) goto L27
        L26:
            r0 = 1
        L27:
            r5.EkS(r0)
            r5.Ehq(r4)
            boolean r0 = r4.A05
            if (r0 != 0) goto L49
            X.3LO r2 = X.AbstractC31171DnF.A0B()
            java.lang.Integer r0 = X.C05F.A1I
            r2.A02(r0)
            r0 = 2131972732(0x7f13527c, float:1.958248E38)
            r2.A05 = r0
            r1 = 20
            X.FpL r0 = new X.FpL
            r0.<init>(r4, r1)
            X.AbstractC31176DnK.A1B(r0, r2, r5)
        L49:
            boolean r0 = r4.A03
            r5.ARk(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ENX.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        AbstractC70663Fe abstractC70663Fe;
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        if (isResumed() && (abstractC70663Fe = getRecyclerView().A0D) != null) {
            bundle.putParcelable("recycler_view_state", abstractC70663Fe.A1M());
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A08;
        if (viewOnTouchListenerC60632pm == null) {
            str = "scrollableNavigationHelper";
        } else {
            C3FQ scrollingViewProxy = getScrollingViewProxy();
            EQI eqi = this.A02;
            if (eqi == null) {
                str = "adapter";
            } else {
                viewOnTouchListenerC60632pm.A06(eqi, scrollingViewProxy, AbstractC167017dG.A03(requireContext()));
                super.onViewCreated(view, bundle);
                EmptyStateView emptyStateView = (EmptyStateView) this.mEmptyView;
                if (emptyStateView != null) {
                    ViewOnClickListenerC35686FpL viewOnClickListenerC35686FpL = new ViewOnClickListenerC35686FpL(this, 21);
                    EnumC153216up enumC153216up = EnumC153216up.A02;
                    emptyStateView.A0R(enumC153216up, R.drawable.empty_state_save);
                    emptyStateView.A0T(enumC153216up, 2131972753);
                    emptyStateView.A0S(enumC153216up, 2131972752);
                    EnumC153216up enumC153216up2 = EnumC153216up.A04;
                    emptyStateView.A0R(enumC153216up2, R.drawable.loadmore_icon_refresh_compound);
                    emptyStateView.A0N(viewOnClickListenerC35686FpL, enumC153216up2);
                    emptyStateView.A0I();
                }
                RecyclerView recyclerView = getRecyclerView();
                if (this.A07) {
                    recyclerView.setNestedScrollingEnabled(true);
                    ((C3FR) getScrollingViewProxy()).APU();
                } else {
                    ((C3FR) getScrollingViewProxy()).Ehc(new RunnableC36854GMb(this));
                }
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
                C153156uj c153156uj = new C153156uj(linearLayoutManager, this, C153146ui.A0F, false, true);
                C61372qz c61372qz = this.A0E;
                c61372qz.A02(c153156uj);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.A0G = c61372qz;
                C64842wi c64842wi = this.A00;
                if (c64842wi == null) {
                    str = "quickPromotionDelegate";
                } else {
                    c64842wi.DiZ();
                    C57112jm c57112jm = this.A09;
                    if (c57112jm == null) {
                        str = "viewpointManager";
                    } else {
                        c57112jm.A08(recyclerView, C71163Hc.A00(this), new InterfaceC57142jp[0]);
                        AbstractC31172DnG.A0E(AbstractC31174DnI.A0h(this).A00).A06(getViewLifecycleOwner(), new C31421DrQ(1, new C57753Pjg(this, 33)));
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (X.AbstractC31171DnF.A1W(X.AbstractC166987dD.A0r(r3), r4.requireArguments().getString("profile_user_id")) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(X.ENX r4) {
        /*
            boolean r0 = r4.A07
            if (r0 == 0) goto L49
            X.0do r3 = r4.A0D
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r3)
            boolean r0 = X.AbstractC35085Fcw.A01(r0)
            java.lang.String r2 = "profile_user_id"
            if (r0 == 0) goto L24
            android.os.Bundle r0 = r4.requireArguments()
            java.lang.String r1 = r0.getString(r2)
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r3)
            boolean r0 = X.AbstractC31171DnF.A1W(r0, r1)
            if (r0 != 0) goto L40
        L24:
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r3)
            boolean r0 = X.AbstractC35085Fcw.A00(r0)
            if (r0 == 0) goto L49
            android.os.Bundle r0 = r4.requireArguments()
            java.lang.String r1 = r0.getString(r2)
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r3)
            boolean r0 = X.AbstractC31171DnF.A1W(r0, r1)
            if (r0 != 0) goto L49
        L40:
            android.os.Bundle r0 = r4.requireArguments()
            java.lang.String r0 = r0.getString(r2)
            return r0
        L49:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ENX.A00(X.ENX):java.lang.String");
    }

    public static final void A01(ENX enx) {
        EmptyStateView emptyStateView;
        EQI eqi = enx.A02;
        if (eqi == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        if (eqi.A00 == 0) {
            if (AbstractC31174DnI.A0h(enx).A02.A00 == C05F.A01 && (emptyStateView = (EmptyStateView) enx.mEmptyView) != null) {
                emptyStateView.A0J();
                emptyStateView.A0I();
            }
            enx.showEmptyView();
            return;
        }
        enx.hideEmptyView();
    }

    public final UserSession A02() {
        return AbstractC166987dD.A0r(this.A0D);
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        C11520jB c11520jB = new C11520jB();
        c11520jB.A0A(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AbstractC166987dD.A0r(this.A0D).userId);
        return c11520jB;
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        RecyclerView recyclerView;
        if (this.mView != null && (recyclerView = getRecyclerView()) != null) {
            AbstractC110854yx.A01(recyclerView, true);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (this.A05) {
            return "liked_saved_collections_list";
        }
        if (this.A07) {
            if (AbstractC31171DnF.A1V(AbstractC166987dD.A0r(this.A0D), AbstractC153636vY.A01(requireArguments(), "profile_user_id"))) {
                return "self_saved_collections_list_saved_profile";
            }
            return "saved_collections_list_saved_profile";
        }
        return "saved_collections_list";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0D);
    }

    public ENX() {
        C37016GSx c37016GSx = new C37016GSx(this, 15);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37016GSx(new C37016GSx(this, 16), 17));
        this.A0C = AbstractC25225BEi.A0a(new C37016GSx(A00, 18), c37016GSx, new C57536PgA(34, null, A00), AbstractC25225BEi.A1D(C31845DzD.class));
        this.A0B = new FHK(this);
        this.A0D = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        C31845DzD A0h = AbstractC31174DnI.A0h(this);
        if (A0h.A02.A02) {
            C31845DzD.A00(A0h, null, false);
        }
    }

    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2048590568);
        super.onCreate(bundle);
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A08 = AbstractC60622pl.A00(requireContext(), null, false);
        this.A07 = requireArguments().getBoolean("is_saved_profile_tab", false);
        this.A05 = requireArguments().getBoolean("is_liked_collections_list", false);
        this.A06 = requireArguments().getBoolean("is_modal", false);
        C57112jm A00 = C57112jm.A00();
        this.A09 = A00;
        InterfaceC09390do interfaceC09390do = this.A0D;
        C69247VkG c69247VkG = new C69247VkG(AbstractC62712tA.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00(), AbstractC166987dD.A0r(interfaceC09390do), A00, this);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        boolean z = this.A07;
        EQI eqi = new EQI(requireContext, this, A0r, c69247VkG, this, new C36745GHo(this, 9), requireArguments().getString("profile_user_id"), z, this.A05);
        this.A02 = eqi;
        eqi.A02 = true;
        setAdapter(eqi);
        EQI eqi2 = this.A02;
        if (eqi2 != null) {
            this.A0E.A02(new E0I(this, eqi2));
            C27961Xa A002 = AbstractC54912fq.A00();
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            A1I.put(QPTooltipAnchor.A1F, new GCU());
            C64742wY A05 = A002.A05(A0r2, A1I);
            this.A01 = A05;
            registerLifecycleListener(A05);
            C27961Xa A003 = AbstractC54912fq.A00();
            UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
            QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0s;
            C54922fr A0S = AbstractC31175DnJ.A0S();
            C31450Dru c31450Dru = new C31450Dru(this, 2);
            C64742wY c64742wY = this.A01;
            if (c64742wY == null) {
                C14360o3.A0F("quickPromotionTooltipsController");
                throw C00O.createAndThrow();
            }
            A0S.A01(c31450Dru, c64742wY);
            this.A00 = AbstractC31175DnJ.A0T(this, A0r3, A0S, A003, quickPromotionSlot);
            InterfaceC09390do interfaceC09390do2 = this.A0C;
            C31845DzD c31845DzD = (C31845DzD) interfaceC09390do2.getValue();
            FBA.A00(c31845DzD.A01).A07();
            C31845DzD.A00(c31845DzD, null, true);
            EQI eqi3 = this.A02;
            if (eqi3 != null) {
                this.A0A = new C34964Fao(AbstractC166987dD.A0r(interfaceC09390do), eqi3, (C31845DzD) interfaceC09390do2.getValue());
                C0f9.A09(1161423839, A02);
                return;
            }
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1747736413);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_refreshable_recyclerview_with_empty_state, false);
        C0f9.A09(451436601, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        int A02 = C0f9.A02(1649483003);
        super.onDestroy();
        C64742wY c64742wY = this.A01;
        if (c64742wY == null) {
            str = "quickPromotionTooltipsController";
        } else {
            unregisterLifecycleListener(c64742wY);
            C34964Fao c34964Fao = this.A0A;
            if (c34964Fao == null) {
                str = "savedCollectionsUpdateHelper";
            } else {
                C25671My c25671My = (C25671My) c34964Fao.A07.getValue();
                c25671My.A02(c34964Fao.A03, C3HW.class);
                c25671My.A02(c34964Fao.A01, C36110Fwk.class);
                c25671My.A02(c34964Fao.A02, C36116Fwq.class);
                c25671My.A02(c34964Fao.A00, C36117Fwr.class);
                C0f9.A09(861917640, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        AbstractC70663Fe abstractC70663Fe;
        int A02 = C0f9.A02(-2058947536);
        super.onViewStateRestored(bundle);
        if (isResumed() && (abstractC70663Fe = getRecyclerView().A0D) != null && bundle != null) {
            abstractC70663Fe.A1P(bundle.getParcelable("recycler_view_state"));
        }
        C0f9.A09(-1889683084, A02);
    }
}
