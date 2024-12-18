package com.instagram.discovery.mediamap.fragment;

import X.A2K;
import X.AbstractC02600Aj;
import X.AbstractC08820cl;
import X.AbstractC10360h2;
import X.AbstractC115105If;
import X.AbstractC12220kQ;
import X.AbstractC13670mt;
import X.AbstractC13880nE;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC50102Ry;
import X.AbstractC53242c7;
import X.AbstractC65702TsY;
import X.AbstractC65924TwV;
import X.AbstractC65980TxZ;
import X.AbstractC67879V0k;
import X.AbstractC70050W0k;
import X.BHS;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C12260kU;
import X.C123835ix;
import X.C13400mQ;
import X.C140966Yy;
import X.C14240no;
import X.C14360o3;
import X.C169487hO;
import X.C18920wW;
import X.C18C;
import X.C18U;
import X.C1GJ;
import X.C1ON;
import X.C23831Eq;
import X.C24531Hw;
import X.C25531Mh;
import X.C25621Ms;
import X.C31694Dvz;
import X.C31697Dw2;
import X.C32125E9y;
import X.C38657Gyy;
import X.C38C;
import X.C38E;
import X.C3I7;
import X.C3I8;
import X.C3I9;
import X.C42540IsJ;
import X.C50625MWm;
import X.C51621MrE;
import X.C51760Mtj;
import X.C65881Tvk;
import X.C65921TwS;
import X.C65954Twz;
import X.C65956Tx8;
import X.C65957Tx9;
import X.C65960TxC;
import X.C65963TxG;
import X.C65966TxJ;
import X.C65974TxR;
import X.C65986Txf;
import X.C66151U1s;
import X.C66152U1t;
import X.C66166U2h;
import X.C66362zD;
import X.C66392zG;
import X.C68090V9z;
import X.C69020Vfw;
import X.C69591Vru;
import X.C69794Vvd;
import X.C69800Vvm;
import X.C70108W4f;
import X.C70789Wh2;
import X.C9QE;
import X.FS6;
import X.GFV;
import X.GYH;
import X.GYT;
import X.HYX;
import X.InterfaceC11380iw;
import X.InterfaceC190488c6;
import X.InterfaceC37181GZs;
import X.InterfaceC37294Gbv;
import X.InterfaceC40821up;
import X.InterfaceC43403JFt;
import X.InterfaceC60152ox;
import X.InterfaceC71921XAf;
import X.InterfaceC71958XCk;
import X.InterfaceC72014XFc;
import X.InterfaceC72020XFi;
import X.InterfaceC72022XFk;
import X.NUN;
import X.Tx0;
import X.U0K;
import X.U1F;
import X.U1G;
import X.U1J;
import X.U1K;
import X.U1L;
import X.U20;
import X.U21;
import X.U3A;
import X.U3B;
import X.U3C;
import X.UQE;
import X.V5I;
import X.VEZ;
import X.VWR;
import X.VWT;
import X.VWU;
import X.ViewOnLayoutChangeListenerC35698FpY;
import X.W61;
import X.W69;
import X.WDY;
import X.WNU;
import X.WNY;
import X.Wi0;
import X.Wk0;
import X.XAn;
import X.XAq;
import X.XB4;
import X.XB6;
import X.XB8;
import X.XB9;
import X.XBD;
import X.XDN;
import X.XDu;
import X.XEB;
import X.XLN;
import X.XLQ;
import X.XLS;
import X.XLT;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationSearchFragment;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.discovery.refinement.model.RefinementAttributes;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.mapquery.MapQuery;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class LocationSearchFragment extends AbstractC67879V0k implements InterfaceC72022XFk, XB8, XB6, InterfaceC72020XFi, XAq, XDu, XEB, InterfaceC60152ox, XDN, InterfaceC37181GZs, InterfaceC71958XCk, XLN, InterfaceC71921XAf, InterfaceC43403JFt, InterfaceC72014XFc, GYH, XLQ, XLS, XLT, XBD, GYT, InterfaceC37294Gbv {
    public float A00;
    public C65960TxC A01;
    public C65966TxJ A02;
    public C65963TxG A03;
    public String A04;
    public String A05;
    public boolean A06;
    public int A07;
    public C18920wW A08;
    public C3I9 A09;
    public InterfaceC190488c6 A0A;
    public C50625MWm A0B;
    public C70789Wh2 A0C;
    public C65974TxR A0D;
    public boolean A0E;
    public ViewGroup mContainer;
    public RecyclerView mRecyclerView;
    public C42540IsJ mRefinementsController;
    public GFV mSearchBarController;
    public View mSearchCancelButton;
    public SearchEditText mSearchEditText;
    public Space mSearchFieldSeparator;
    public LinearLayoutManager mSearchLayoutManager;
    public C13400mQ mShowHideKeyboardDebouncer;

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
    }

    @Override // X.XEB
    public final void D05(MapBottomSheetController mapBottomSheetController) {
    }

    @Override // X.XEB
    public final void D07(MapBottomSheetController mapBottomSheetController) {
    }

    @Override // X.XEB
    public final void D0A(MapBottomSheetController mapBottomSheetController, float f, float f2, float f3, float f4) {
    }

    @Override // X.XEB
    public final void D0C(MapBottomSheetController mapBottomSheetController) {
    }

    @Override // X.InterfaceC71958XCk
    public final void D3E() {
    }

    @Override // X.XDN
    public final void DHG(W69 w69, MediaMapQuery mediaMapQuery) {
    }

    @Override // X.InterfaceC37181GZs
    public final void DHQ() {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfn(UQE uqe) {
        C9QE.A02(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dfo(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfq(UQE uqe, AbstractC115105If abstractC115105If) {
        C9QE.A01(uqe, abstractC115105If, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dg0(UQE uqe) {
        C9QE.A03(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgG(UQE uqe) {
        C9QE.A04(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgO(UQE uqe, InterfaceC40821up interfaceC40821up) {
        C9QE.A00(uqe, interfaceC40821up, this);
    }

    @Override // X.XDu
    public final /* synthetic */ void DjE(C51621MrE c51621MrE) {
    }

    @Override // X.GYT
    public final void DjF() {
    }

    @Override // X.XBD
    public final void Djn() {
    }

    @Override // X.XDN
    public final void Do7(W69 w69, MediaMapQuery mediaMapQuery) {
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }

    @Override // X.XDu
    public final /* synthetic */ C65956Tx8 E4l(String str, List list) {
        return VWU.A00(this, str);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.TwV, java.lang.Object, X.NUN] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.Tx9, X.U2y] */
    @Override // X.XDu
    public final C65956Tx8 E4m() {
        ?? c65957Tx9 = new C65957Tx9(false);
        ArrayList arrayList = new ArrayList(VWR.A00(getSession()).A00());
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            this.A06 = false;
            C42540IsJ c42540IsJ = this.mRefinementsController;
            if (c42540IsJ != null) {
                c42540IsJ.A00.setVisibility(8);
            }
            Fragment fragment = this.mParentFragment;
            fragment.getClass();
            Iterator A0n = AbstractC65702TsY.A0n(((MediaMapFragment) fragment).A06.A02(MediaMapQuery.A08).A03);
            while (A0n.hasNext()) {
                Refinement refinement = (Refinement) A0n.next();
                MapQuery mapQuery = new MapQuery(refinement.A00(), refinement.A01, AbstractC167007dF.A0h("CATEGORY"));
                ?? abstractC65924TwV = new AbstractC65924TwV(6);
                abstractC65924TwV.A00 = mapQuery;
                c65957Tx9.A01(new C65954Twz(), abstractC65924TwV);
            }
        } else {
            this.A06 = true;
            C42540IsJ c42540IsJ2 = this.mRefinementsController;
            if (c42540IsJ2 != null) {
                c42540IsJ2.A00();
            }
            BHS bhs = new BHS(new Object[0], 2131973059);
            Integer num = C05F.A0C;
            c65957Tx9.A04(num, new C51760Mtj(bhs, num, C05F.A00), new Object());
            c65957Tx9.A05(null, arrayList, false);
        }
        return c65957Tx9.A00();
    }

    @Override // X.InterfaceC72020XFi
    public final void EDz(View view, AbstractC65924TwV abstractC65924TwV, Tx0 tx0) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "discovery_map_location_search";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01.A04();
        this.A03.A01();
        this.mContainer = (ViewGroup) view;
        this.mSearchLayoutManager = new LinearLayoutManager(requireContext());
        this.mSearchEditText = (SearchEditText) view.requireViewById(R.id.search_field);
        this.mSearchFieldSeparator = (Space) view.requireViewById(R.id.search_field_separator);
        this.mSearchCancelButton = view.requireViewById(R.id.cancel_button);
        this.mShowHideKeyboardDebouncer = new C13400mQ(AbstractC167007dF.A0J(), new Wi0(this, 4), 100L);
        Fragment fragment = this.mParentFragment;
        fragment.getClass();
        ((MediaMapFragment) fragment).A0A.A05.add(this);
        C3I8 A01 = C3I7.A01(this, false, false);
        this.A09 = A01;
        A01.A9e(this);
        this.mSearchEditText.setOnFocusChangeListener(new WNY(this, 7));
        WNU.A00(this.mSearchCancelButton, 14, this);
        GFV gfv = new GFV(this, 2131972993);
        this.mSearchBarController = gfv;
        SearchEditText searchEditText = this.mSearchEditText;
        C14360o3.A0B(searchEditText, 0);
        gfv.A00(searchEditText, false);
        this.mSearchEditText.setSearchIconEnabled(true);
        this.mSearchEditText.setCompoundDrawableTintList(ColorStateList.valueOf(requireContext().getColor(AbstractC53242c7.A08(requireContext()))));
        this.mSearchEditText.setText(this.A04);
        UserSession session = getSession();
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.refinements_list);
        Fragment fragment2 = this.mParentFragment;
        fragment2.getClass();
        C42540IsJ c42540IsJ = new C42540IsJ(recyclerView, this, session, this, new ArrayList(((MediaMapFragment) fragment2).A06.A02(MediaMapQuery.A08).A03), true);
        this.mRefinementsController = c42540IsJ;
        if (this.A06) {
            c42540IsJ.A00();
        } else {
            c42540IsJ.A00.setVisibility(8);
        }
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.mRecyclerView = A0F;
        AbstractC31174DnI.A15(view.getContext(), A0F);
        this.mRecyclerView.setAdapter(this.A03.A0A);
        RecyclerView recyclerView2 = this.mRecyclerView;
        recyclerView2.A0S = true;
        recyclerView2.setItemAnimator(null);
        this.mRecyclerView.A14(new C65986Txf(this, 7));
        if (!AbstractC13670mt.A0B(this.A04)) {
            Fragment fragment3 = this.mParentFragment;
            fragment3.getClass();
            List list = ((MediaMapFragment) fragment3).A0f.BjP(this.A04).A06;
            if (list != null && !list.isEmpty()) {
                this.A01.A04();
                this.A03.A01();
            } else {
                DjI(this.A04);
            }
        }
        Fragment fragment4 = this.mParentFragment;
        fragment4.getClass();
        ((MediaMapFragment) fragment4).A06.A06.add(this);
        this.mSearchEditText.requestFocus();
        A00(this, true);
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC35698FpY(1, view, this));
    }

    public static void A00(LocationSearchFragment locationSearchFragment, boolean z) {
        C13400mQ c13400mQ = locationSearchFragment.mShowHideKeyboardDebouncer;
        if (c13400mQ != null) {
            c13400mQ.A01(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        String str3;
        C69020Vfw A01;
        Fragment fragment = this.mParentFragment;
        fragment.getClass();
        Location A00 = ((MediaMapFragment) fragment).A03.A00("LocationSearchFragment");
        C25621Ms A0N = AbstractC31173DnH.A0N(getSession());
        A0N.A0B("map/search/");
        A0N.A0S(U3B.class, U3A.class);
        A0N.A9s("query", this.A04);
        A0N.A9s("search_surface", "map_surface");
        A0N.A9s("timezone_offset", Long.toString(C23831Eq.A00()));
        String str4 = null;
        if (A00 != null) {
            str3 = String.valueOf(A00.getLatitude());
        } else {
            str3 = null;
        }
        A0N.A9s("lat", str3);
        if (A00 != null) {
            str4 = String.valueOf(A00.getLongitude());
        }
        A0N.A9s("lng", str4);
        Fragment fragment2 = this.mParentFragment;
        fragment2.getClass();
        C69800Vvm c69800Vvm = ((MediaMapFragment) fragment2).mMapViewController;
        if (c69800Vvm != null && (A01 = c69800Vvm.A01()) != null) {
            A0N.A9s("map_center_lat", Double.toString(A01.A00));
            A0N.A9s("map_center_lng", Double.toString(A01.A01));
        }
        return A0N.A0N();
    }

    @Override // X.InterfaceC71921XAf
    public final float Bc9() {
        return this.A00;
    }

    @Override // X.XB6
    public final boolean CZT() {
        return TextUtils.isEmpty(this.A04);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.XEB
    public final void D0B(MapBottomSheetController mapBottomSheetController, float f) {
        A00(this, AbstractC167007dF.A1N((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1))));
        if (f < 1.0f) {
            A00(this, false);
        }
    }

    @Override // X.XBC
    public final void DAv(InterfaceC11380iw interfaceC11380iw, AbstractC65924TwV abstractC65924TwV, Tx0 tx0) {
        W61 A00;
        int i;
        if (abstractC65924TwV instanceof HYX) {
            A00 = VWR.A00(getSession());
            C69794Vvd c69794Vvd = ((HYX) abstractC65924TwV).A00;
            synchronized (A00) {
                i = 0;
                C14360o3.A0B(c69794Vvd, 0);
                A00.A02.A05(c69794Vvd);
            }
        } else if (abstractC65924TwV instanceof C68090V9z) {
            A00 = VWR.A00(getSession());
            HashtagImpl hashtagImpl = ((C68090V9z) abstractC65924TwV).A00;
            synchronized (A00) {
                i = 0;
                C14360o3.A0B(hashtagImpl, 0);
                A00.A00.A05(hashtagImpl);
            }
        } else if (abstractC65924TwV instanceof NUN) {
            A00 = VWR.A00(getSession());
            MapQuery mapQuery = ((NUN) abstractC65924TwV).A00;
            synchronized (A00) {
                i = 0;
                C14360o3.A0B(mapQuery, 0);
                A00.A01.A05(mapQuery);
            }
        } else {
            return;
        }
        C18C.A0F(tx0.A0F);
        this.A01.A04();
        if (this.mRecyclerView != null) {
            this.A03.A01();
        }
        UserSession session = getSession();
        boolean A1R = AbstractC167007dF.A1R(i, session, abstractC65924TwV);
        C25621Ms A0c = AbstractC167017dG.A0c(session);
        A0c.A0B("map/remove_recent_search/");
        A0c.A9s("target_id", abstractC65924TwV.A01());
        A0c.A9s("target_type", (String) AbstractC166997dE.A0m(AbstractC70050W0k.A00, abstractC65924TwV.A01));
        A0c.A0R(C32125E9y.class, FS6.class);
        A0c.A0R = A1R;
        C1GJ.A03(A0c.A0N());
    }

    @Override // X.XLQ
    public final void DK6(C68090V9z c68090V9z, Tx0 tx0) {
        HashtagImpl hashtagImpl = c68090V9z.A00;
        Fragment fragment = this.mParentFragment;
        fragment.getClass();
        MediaMapFragment mediaMapFragment = (MediaMapFragment) fragment;
        MediaMapFragment.A08(mediaMapFragment, VEZ.A03, hashtagImpl.A0C, hashtagImpl.A0D);
        WDY.A00(mediaMapFragment);
        VWR.A00(getSession()).A01(c68090V9z.A00);
        AbstractC70050W0k.A00(getSession(), c68090V9z);
        A01(c68090V9z, tx0);
    }

    @Override // X.XLN
    public final void DM0(C38657Gyy c38657Gyy) {
        String str = c38657Gyy.A02;
        if (str != null && !str.isEmpty()) {
            C25531Mh A0G = C25531Mh.A0G(this.A08);
            if (((AbstractC02600Aj) A0G).A00.isSampled()) {
                AbstractC65702TsY.A1G(A0G, c38657Gyy, c38657Gyy.A05);
                A0G.A0R("query_text", this.A04);
                A0G.A0R("search_session_id", this.A05);
                A0G.A0R("rank_token", E6d());
                A0G.Cht();
            }
            C12260kU.A0G(requireContext(), AbstractC08820cl.A03(str));
            return;
        }
        new C140966Yy(requireActivity(), getSession()).A06();
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        if (i > 0 && isResumed()) {
            Fragment fragment = this.mParentFragment;
            fragment.getClass();
            ((MediaMapFragment) fragment).A0A.mBottomSheetBehavior.A0R(true, 1.0f);
        }
    }

    @Override // X.XLS
    public final void DR1(NUN nun, Tx0 tx0) {
        MapQuery mapQuery = nun.A00;
        if (mapQuery.A02.equals(AbstractC167007dF.A0h("TEXT"))) {
            if (C18U.A06(C06090Tz.A05, getSession(), 36321456090654165L)) {
                Fragment fragment = this.mParentFragment;
                fragment.getClass();
                MediaMapFragment mediaMapFragment = (MediaMapFragment) fragment;
                String str = mapQuery.A01;
                MediaMapFragment.A08(mediaMapFragment, VEZ.A09, str, str);
                WDY.A00(mediaMapFragment);
                VWR.A00(getSession()).A02(mapQuery);
                AbstractC70050W0k.A00(getSession(), nun);
                A01(nun, tx0);
            }
        }
        Fragment fragment2 = this.mParentFragment;
        fragment2.getClass();
        MediaMapFragment mediaMapFragment2 = (MediaMapFragment) fragment2;
        MediaMapFragment.A08(mediaMapFragment2, VEZ.A02, mapQuery.A00, mapQuery.A01);
        WDY.A00(mediaMapFragment2);
        VWR.A00(getSession()).A02(mapQuery);
        AbstractC70050W0k.A00(getSession(), nun);
        A01(nun, tx0);
    }

    @Override // X.XLT
    public final void DYm(HYX hyx, Tx0 tx0) {
        C69794Vvd c69794Vvd = hyx.A00;
        Fragment fragment = this.mParentFragment;
        fragment.getClass();
        ((MediaMapFragment) fragment).A0J(c69794Vvd);
        VWR.A00(getSession()).A03(hyx.A00);
        AbstractC70050W0k.A00(getSession(), hyx);
        A01(hyx, tx0);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.TwV, X.NUN] */
    @Override // X.InterfaceC43403JFt
    public final void DeL(Refinement refinement) {
        RefinementAttributes refinementAttributes = refinement.A00;
        String str = refinementAttributes.A04;
        if (str == null && (str = refinementAttributes.A03) == null) {
            str = null;
        }
        str.getClass();
        MapQuery mapQuery = new MapQuery(str, refinement.A01, AbstractC167007dF.A0h("CATEGORY"));
        ?? abstractC65924TwV = new AbstractC65924TwV(6);
        abstractC65924TwV.A00 = mapQuery;
        Fragment fragment = this.mParentFragment;
        fragment.getClass();
        MediaMapFragment mediaMapFragment = (MediaMapFragment) fragment;
        RefinementAttributes refinementAttributes2 = refinement.A00;
        String str2 = refinementAttributes2.A04;
        if (str2 == null && (str2 = refinementAttributes2.A03) == null) {
            str2 = null;
        }
        MediaMapFragment.A08(mediaMapFragment, VEZ.A02, str2, refinement.A01);
        WDY.A00(mediaMapFragment);
        VWR.A00(getSession()).A02(mapQuery);
        AbstractC70050W0k.A00(getSession(), abstractC65924TwV);
    }

    @Override // X.InterfaceC169457hL
    public final void Dg3(String str) {
        if (!this.A0D.A04()) {
            this.A03.A04 = false;
        }
        this.A03.A01();
    }

    @Override // X.InterfaceC169457hL
    public final void DgJ(String str) {
        this.A03.A01();
    }

    @Override // X.InterfaceC169457hL
    public final /* bridge */ /* synthetic */ void DgS(InterfaceC40821up interfaceC40821up, String str) {
        C38657Gyy c38657Gyy = ((U3C) interfaceC40821up).A00;
        if (c38657Gyy != null) {
            this.A02.A01(c38657Gyy, str);
        }
        this.A01.A04();
        this.A03.A01();
    }

    @Override // X.InterfaceC37181GZs
    public final void DjI(String str) {
        this.A04 = str;
        this.A03.A04 = true;
        if (this.A0D.A06(str)) {
            this.A03.A04 = true;
        } else if (!this.A0D.A04()) {
            this.A03.A04 = false;
        }
        this.A01.A04();
        this.A03.A01();
    }

    @Override // X.InterfaceC71952XCe
    public final void DjY(C38657Gyy c38657Gyy) {
        C65966TxJ c65966TxJ = this.A02;
        C14360o3.A0B(c38657Gyy, 0);
        String str = c38657Gyy.A05;
        if (str == null) {
            str = c38657Gyy.A06;
        }
        c65966TxJ.A02(str);
        this.A01.A04();
        this.A03.A01();
        C25531Mh A0H = C25531Mh.A0H(this.A08);
        if (((AbstractC02600Aj) A0H).A00.isSampled()) {
            AbstractC65702TsY.A1G(A0H, c38657Gyy, str);
            A0H.A0R("query_text", this.A04);
            A0H.A0R("search_session_id", this.A05);
            A0H.A0R("rank_token", E6d());
            A0H.Cht();
        }
    }

    @Override // X.InterfaceC71958XCk
    public final void Djl(Integer num) {
        Fragment fragment = this.mParentFragment;
        fragment.getClass();
        WDY wdy = ((MediaMapFragment) fragment).A0B;
        U0K u0k = U0K.A04;
        Bundle bundle = new Bundle();
        AbstractC31173DnH.A1C(bundle, wdy.A05);
        bundle.putString("argument_search_session_id", wdy.A06);
        bundle.putSerializable("edit_searches_type", u0k);
        bundle.putString("argument_parent_module_name", wdy.A04.getModuleName());
        AbstractC67879V0k abstractC67879V0k = new AbstractC67879V0k();
        abstractC67879V0k.setArguments(bundle);
        C14240no c14240no = new C14240no(wdy.A03);
        c14240no.A07(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
        c14240no.A0A(abstractC67879V0k, R.id.fragment_container);
        c14240no.A0I("SEARCH");
        c14240no.A0J(false);
    }

    @Override // X.XDN
    public final void DxF(W69 w69, C69591Vru c69591Vru, MediaMapQuery mediaMapQuery) {
        C42540IsJ c42540IsJ;
        MediaMapQuery mediaMapQuery2 = MediaMapQuery.A08;
        if (AbstractC50102Ry.A00(mediaMapQuery, mediaMapQuery2) && (c42540IsJ = this.mRefinementsController) != null) {
            Fragment fragment = this.mParentFragment;
            fragment.getClass();
            c42540IsJ.A01(new ArrayList(((MediaMapFragment) fragment).A06.A02(mediaMapQuery2).A03));
            if (!this.A06) {
                this.mRefinementsController.A00.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    @Override // X.XDu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C65956Tx8 E4n(java.lang.String r9, java.lang.String r10, java.util.List r11, java.util.List r12) {
        /*
            r8 = this;
            X.IsJ r0 = r8.mRefinementsController
            if (r0 == 0) goto Lb
            androidx.recyclerview.widget.RecyclerView r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
        Lb:
            r4 = 0
            X.TxI r2 = new X.TxI
            r2.<init>(r4, r4, r4)
            X.TxJ r0 = r8.A02
            X.Gyy r6 = r0.A00(r9)
            r3 = 1
            if (r6 == 0) goto Lc6
            java.lang.Integer r0 = X.C05F.A01
            r2.A03(r0, r6)
            java.util.List r7 = X.AbstractC68485VSq.A00(r6)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto Lc6
            X.Mtj r5 = X.OY6.A01()
            X.VWV r1 = new X.VWV
            r1.<init>()
            java.lang.Integer r0 = X.C05F.A0C
            r2.A04(r0, r5, r1)
            r2.A08(r7, r10)
            r1 = 1
        L3b:
            X.TxJ r0 = r8.A02
            boolean r0 = r0.A04(r9)
            if (r0 != 0) goto L56
            if (r6 == 0) goto L51
            if (r1 == 0) goto L51
            X.VA3 r1 = new X.VA3
            r1.<init>(r6)
            java.lang.Integer r0 = X.C05F.A01
        L4e:
            r2.A03(r0, r1)
        L51:
            X.Tx8 r0 = r2.A00()
            return r0
        L56:
            if (r1 == 0) goto L66
            X.Mtj r5 = X.OY6.A00()
            X.VWV r1 = new X.VWV
            r1.<init>()
            java.lang.Integer r0 = X.C05F.A0C
            r2.A04(r0, r5, r1)
        L66:
            com.instagram.common.session.UserSession r6 = r8.getSession()
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36321456090654165(0x810a2c000225d5, double:3.0331733142695913E-306)
            boolean r0 = X.C18U.A06(r5, r6, r0)
            if (r0 != 0) goto L7e
            r2.A06(r12, r10)
            r2.A07(r11, r10)
            goto L51
        L7e:
            int r1 = r12.size()
            r0 = 5
            int r0 = java.lang.Math.min(r1, r0)
            java.util.List r0 = r12.subList(r4, r0)
            r2.A06(r0, r10)
            int r1 = r11.size()
            int r0 = r12.size()
            int r0 = 6 - r0
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r4, r0)
            int r0 = java.lang.Math.min(r1, r0)
            java.util.List r0 = r11.subList(r4, r0)
            r2.A07(r0, r10)
            X.Twz r1 = new X.Twz
            r1.<init>()
            java.lang.String r0 = "typeahead_echo"
            r1.A09 = r0
            java.lang.String r0 = "server_results"
            r1.A05 = r0
            r1.A0H = r3
            X.Tx0 r0 = new X.Tx0
            r0.<init>(r1)
            X.Wh2 r1 = new X.Wh2
            r1.<init>(r0, r9)
            r8.A0C = r1
            java.lang.Integer r0 = X.C05F.A00
            goto L4e
        Lc6:
            r1 = 0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.LocationSearchFragment.E4n(java.lang.String, java.lang.String, java.util.List, java.util.List):X.Tx8");
    }

    @Override // X.XB8
    public final String E6U() {
        return this.A04;
    }

    @Override // X.InterfaceC72022XFk
    public final String E6d() {
        return this.A01.A03(this.A04);
    }

    @Override // X.InterfaceC72014XFc
    public final boolean Ein(AbstractC65924TwV abstractC65924TwV, Object obj) {
        if (!(obj instanceof Tx0) || !((Tx0) obj).A0E) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC71952XCe
    public final boolean Ejj(C38657Gyy c38657Gyy) {
        return !this.A02.A03(c38657Gyy);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        Fragment fragment = this.mParentFragment;
        fragment.getClass();
        AbstractC10360h2 abstractC10360h2 = ((MediaMapFragment) fragment).A0B.A03;
        if (abstractC10360h2.A0L() > 1) {
            abstractC10360h2.A0b();
        }
        return true;
    }

    private void A01(AbstractC65924TwV abstractC65924TwV, Tx0 tx0) {
        C70108W4f A00 = VWT.A00(abstractC65924TwV);
        A00.A07 = tx0.A09;
        A00.A01 = tx0.A05;
        C66166U2h A01 = A00.A01();
        InterfaceC190488c6 interfaceC190488c6 = this.A0A;
        String str = this.A04;
        int i = tx0.A00;
        interfaceC190488c6.ClZ(A01, C05F.A07, C05F.A0C, str, tx0.A06, i);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.TwV, X.NUN] */
    @Override // X.GYH
    public final void DCk(C70789Wh2 c70789Wh2) {
        if (C18U.A06(C06090Tz.A05, getSession(), 36321456090654165L)) {
            String str = c70789Wh2.A01;
            MapQuery mapQuery = new MapQuery(str, str, AbstractC167007dF.A0h("TEXT"));
            ?? abstractC65924TwV = new AbstractC65924TwV(6);
            abstractC65924TwV.A00 = mapQuery;
            Fragment fragment = this.mParentFragment;
            fragment.getClass();
            MediaMapFragment mediaMapFragment = (MediaMapFragment) fragment;
            MediaMapFragment.A08(mediaMapFragment, VEZ.A09, str, str);
            WDY.A00(mediaMapFragment);
            VWR.A00(getSession()).A02(mapQuery);
            AbstractC70050W0k.A00(getSession(), abstractC65924TwV);
            A01(abstractC65924TwV, c70789Wh2.A00);
        }
    }

    @Override // X.InterfaceC37181GZs
    public final void DjG(String str) {
        C70789Wh2 c70789Wh2;
        if (C18U.A06(C06090Tz.A05, getSession(), 36321456090719702L) && (c70789Wh2 = this.A0C) != null) {
            DCk(c70789Wh2);
        }
    }

    @Override // X.InterfaceC72022XFk
    public final /* synthetic */ String E6e(UQE uqe) {
        return E6d();
    }

    @Override // X.XAq
    public final /* bridge */ /* synthetic */ void ECz(View view, Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [X.2zJ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1360778859);
        super.onCreate(bundle);
        String string = requireArguments().getString("arg_hashtag_name");
        if (string == null || AbstractC50102Ry.A00(string, "popular")) {
            string = "";
        }
        this.A04 = string;
        Fragment fragment = this.mParentFragment;
        fragment.getClass();
        C169487hO c169487hO = ((MediaMapFragment) fragment).A0f;
        getSession();
        this.A02 = new C65966TxJ();
        UserSession session = getSession();
        C14360o3.A0B(session, 0);
        this.A0E = AbstractC65702TsY.A1Y(session);
        UserSession session2 = getSession();
        C14360o3.A0B(session2, 0);
        this.A07 = AbstractC65702TsY.A1Y(session2) ? 1 : 0;
        UserSession session3 = getSession();
        C14360o3.A0B(c169487hO, 0);
        this.A0D = AbstractC65980TxZ.A01(session3, this, null, this, c169487hO, C05F.A00, true);
        Wk0 wk0 = new Wk0(this, 1);
        C65960TxC c65960TxC = new C65960TxC(this, this, this, this, c169487hO, 10, false);
        this.A01 = c65960TxC;
        this.A0B = new C50625MWm(c65960TxC, -1);
        this.A05 = AbstractC166997dE.A0n();
        this.A08 = AbstractC12220kQ.A01(this, getSession());
        String str = this.A05;
        U21 u21 = new U21(this, getSession(), this.A05);
        UserSession session4 = getSession();
        AbstractC167007dF.A1E(str, 1, session4);
        this.A0A = new U20(this, session4, u21, str, null, null, null);
        UserSession session5 = getSession();
        String str2 = this.A05;
        UserSession session6 = getSession();
        FragmentActivity requireActivity = requireActivity();
        int A06 = AbstractC167007dF.A06(1, str2, session6);
        C66151U1s c66151U1s = new C66151U1s(requireActivity, this, session6, str2, 96, true);
        UserSession session7 = getSession();
        C14360o3.A0B(session7, 1);
        C66152U1t c66152U1t = new C66152U1t(null, session7, null);
        XAn xAn = new XAn() { // from class: X.Wjv
            @Override // X.XAn
            public final void DeJ() {
                LocationSearchFragment.this.A03.A01();
            }
        };
        C38E c38e = new C38E(this, getSession(), new C38C(this));
        InterfaceC190488c6 interfaceC190488c6 = this.A0A;
        C123835ix c123835ix = new C123835ix(this, getSession());
        XB9 xb9 = new XB9() { // from class: X.WmV
            @Override // X.XB9
            public final Integer E6f() {
                return C05F.A06;
            }
        };
        XB4 xb4 = new XB4() { // from class: X.WmP
            @Override // X.XB4
            public final String E6T() {
                return "";
            }
        };
        C65881Tvk c65881Tvk = new C65881Tvk(1);
        C65881Tvk c65881Tvk2 = new C65881Tvk(A06);
        UserSession session8 = getSession();
        boolean A062 = C18U.A06(AbstractC166997dE.A0U(session8), session8, 36328242140495230L);
        UserSession session9 = getSession();
        C14360o3.A0B(session9, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A063 = C18U.A06(c06090Tz, session9, 36328242139774323L);
        UserSession session10 = getSession();
        C14360o3.A0B(session10, 0);
        C65921TwS c65921TwS = new C65921TwS(session5, xAn, c123835ix, c38e, null, interfaceC190488c6, xb4, this, null, this, xb9, null, c66151U1s, null, c66152U1t, str2, null, c65881Tvk, c65881Tvk2, false, false, A062, A063, C18U.A06(c06090Tz, session10, 36328242139905397L));
        C66392zG A00 = C66362zD.A00(requireContext());
        A00.A01(new C31694Dvz(this, this));
        A00.A01(new U1K(this));
        A00.A01(new Object());
        A00.A01(new U1F(this, this, this, false));
        A00.A01(new U1G(this, getSession(), this, this, 0, true, false));
        A00.A01(new V5I(this, this));
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        A00.A01(new U1J(rootActivity, this, getSession(), c65921TwS, this, "map_search", false, true, this.A0E, false, false, false, false));
        A00.A01(new U1L(this));
        A00.A01(new C31697Dw2(wk0, this, 2131973175));
        boolean z = this.A0E;
        this.A03 = new C65963TxG(requireContext(), A00, this, this, this.A0B, this, this, this.A07, z, false, false, false, false, false);
        this.A06 = false;
        this.A0A.Cle();
        C0f9.A09(-874638961, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2071005954);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_location_search);
        C0f9.A09(-186464871, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-51309506);
        super.onDestroyView();
        GFV gfv = this.mSearchBarController;
        SearchEditText searchEditText = gfv.A00;
        if (searchEditText != null) {
            searchEditText.A0C = null;
        }
        gfv.A00 = null;
        this.A0D.A02();
        Fragment fragment = this.mParentFragment;
        fragment.getClass();
        ((MediaMapFragment) fragment).A0A.A05.remove(this);
        Context context = getContext();
        if (context instanceof Activity) {
            AbstractC13880nE.A0O(((Activity) context).getCurrentFocus());
        }
        LocationSearchFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(-1554053368, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1765017415);
        super.onStart();
        this.A09.Dnr(requireActivity());
        C0f9.A09(869060510, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-2139868697);
        super.onStop();
        this.A09.onStop();
        C0f9.A09(645428082, A02);
    }
}
