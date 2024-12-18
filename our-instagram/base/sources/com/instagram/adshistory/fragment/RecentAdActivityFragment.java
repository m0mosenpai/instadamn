package com.instagram.adshistory.fragment;

import X.AbstractC018607g;
import X.AbstractC09440dt;
import X.AbstractC10360h2;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25229BEm;
import X.AbstractC31171DnF;
import X.AbstractC31175DnJ;
import X.AbstractC31178DnM;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37303Gc4;
import X.AbstractC37304Gc5;
import X.AbstractC39678HjA;
import X.AbstractC47119KsE;
import X.AbstractC60492pY;
import X.AbstractC60622pl;
import X.AnonymousClass391;
import X.AnonymousClass396;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C1338462s;
import X.C14360o3;
import X.C146106i8;
import X.C18U;
import X.C1I2;
import X.C1M3;
import X.C29898DGm;
import X.C33A;
import X.C38996HEy;
import X.C38K;
import X.C3CO;
import X.C41620IbA;
import X.C42275Inz;
import X.C42696Iur;
import X.C42752Ivq;
import X.C57112jm;
import X.C60462pV;
import X.C60762q0;
import X.C60972qL;
import X.C61142qc;
import X.C61372qz;
import X.C61972ry;
import X.C62862tP;
import X.C65953Twy;
import X.C675132q;
import X.C71163Hc;
import X.DGW;
import X.EnumC09460dv;
import X.EnumC153216up;
import X.EnumC37329GcX;
import X.HEK;
import X.IBW;
import X.IBX;
import X.IEA;
import X.InterfaceC09390do;
import X.InterfaceC56362iU;
import X.InterfaceC60022ok;
import X.InterfaceC60032ol;
import X.InterfaceC60092or;
import X.InterfaceC60122ou;
import X.InterfaceC60442pS;
import X.InterfaceC60602pj;
import X.InterfaceC62612t0;
import X.J10;
import X.J1D;
import X.LJW;
import X.ViewOnClickListenerC42032Ik1;
import X.ViewOnClickListenerC42034Ik3;
import X.ViewOnTouchListenerC60632pm;
import X.X2w;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class RecentAdActivityFragment extends C38K implements InterfaceC60442pS, InterfaceC62612t0, InterfaceC60092or, AbsListView.OnScrollListener, InterfaceC60122ou, InterfaceC60022ok, InterfaceC60032ol {
    public HEK A00;
    public C41620IbA A01;
    public C1338462s A02;
    public C57112jm A03;
    public EmptyStateView A04;
    public RefreshableListView A05;
    public String A06;
    public C62862tP A07;
    public InterfaceC60602pj A08;
    public C65953Twy A09;
    public AnonymousClass396 A0A;
    public C3CO A0B;
    public final InterfaceC09390do A0D;
    public final String A0G;
    public final InterfaceC09390do A0E = AbstractC60492pY.A02(this);
    public final C61372qz A0F = new C61372qz();
    public final C60762q0 A0C = new C60762q0();

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131952216);
        interfaceC56362iU.Ehq(this);
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RefreshableListView refreshableListView;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ListView A02 = AbstractC37300Gc1.A02(this);
        if (A02 instanceof RefreshableListView) {
            refreshableListView = (RefreshableListView) A02;
        } else {
            refreshableListView = null;
        }
        this.A05 = refreshableListView;
        if (refreshableListView != null) {
            refreshableListView.setupAndEnableRefresh(ViewOnClickListenerC42032Ik1.A00(this, 0));
            View emptyView = refreshableListView.getEmptyView();
            if (emptyView != null) {
                EmptyStateView emptyStateView = (EmptyStateView) emptyView;
                this.A04 = emptyStateView;
                emptyStateView.A0N(new ViewOnClickListenerC42034Ik3(0, emptyStateView, this), EnumC153216up.A04);
                J10 j10 = new J10(this, 0);
                EnumC153216up enumC153216up = EnumC153216up.A02;
                emptyStateView.A0O(j10, enumC153216up);
                emptyStateView.A0R(enumC153216up, R.drawable.instagram_core_ads_solution_assets_nullstateactivityoutlineandroid);
                emptyStateView.A0T(enumC153216up, 2131952221);
                emptyStateView.A0S(enumC153216up, 2131952220);
                emptyStateView.A0Q(enumC153216up, 2131952219);
                emptyStateView.A0L();
                RefreshableListView refreshableListView2 = this.A05;
                if (refreshableListView2 != null) {
                    refreshableListView2.setOnScrollListener(this);
                }
                C41620IbA c41620IbA = this.A01;
                if (c41620IbA == null) {
                    C14360o3.A0F("adsHistoryDataFetcher");
                    throw C00O.createAndThrow();
                }
                c41620IbA.A01();
                return;
            }
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return AbstractC166987dD.A0o(this.A0E);
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        C41620IbA c41620IbA = this.A01;
        if (c41620IbA == null) {
            C14360o3.A0F("adsHistoryDataFetcher");
            throw C00O.createAndThrow();
        }
        J1D j1d = c41620IbA.A06;
        if (j1d.A00.A05 && !j1d.isLoading()) {
            j1d.Chd();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0G;
    }

    @Override // X.InterfaceC60032ol
    public final C60762q0 getVolumeKeyPressController() {
        return this.A0C;
    }

    public RecentAdActivityFragment() {
        X2w x2w = new X2w(this, 48);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new DGW(new X2w(this, 49), 0));
        this.A0D = AbstractC25225BEi.A0a(new DGW(A00, 1), x2w, new C29898DGm(4, null, A00), AbstractC25225BEi.A1D(C61142qc.class));
        this.A0G = "recent_ad_activity";
    }

    public static final void A01(RecentAdActivityFragment recentAdActivityFragment, String str) {
        FragmentActivity requireActivity = recentAdActivityFragment.requireActivity();
        C42752Ivq c42752Ivq = new C42752Ivq();
        C146106i8 A0H = AbstractC37304Gc5.A0H();
        AbstractC25226BEj.A1N(requireActivity, A0H, 2131952218);
        A0H.A0I = recentAdActivityFragment.requireActivity().getString(2131952217);
        A0H.A02();
        A0H.A07(R.drawable.instagram_eye_off_pano_outline_24);
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(recentAdActivityFragment.A0E), 36317393051522168L)) {
            AbstractC31175DnJ.A0l(requireActivity, A0H, 2131976066);
            A0H.A0A = new C42696Iur(recentAdActivityFragment, c42752Ivq, str, 0);
            A0H.A0L = true;
        }
        AbstractC31178DnM.A1S(A0H);
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        ListView A02 = AbstractC37300Gc1.A02(this);
        C14360o3.A07(A02);
        AbstractC47119KsE.A00(A02, this);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, X.392] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(582242501);
        super.onCreate(bundle);
        this.A03 = AbstractC37301Gc2.A0E();
        AbstractC39678HjA.A00 = new IBW(this);
        Context requireContext = requireContext();
        C61972ry c61972ry = new C61972ry(requireContext, AbstractC018607g.A00(this), null);
        ArrayList A1E = AbstractC166987dD.A1E();
        InterfaceC09390do interfaceC09390do = this.A0E;
        A1E.add(new IEA(new IBX(this), AbstractC166987dD.A0r(interfaceC09390do)));
        this.A01 = new C41620IbA(this, c61972ry, AbstractC166987dD.A0r(interfaceC09390do), A1E);
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C65953Twy c65953Twy = new C65953Twy(AbstractC166987dD.A0r(interfaceC09390do), this, C05F.A01, 3);
        this.A09 = c65953Twy;
        C71163Hc A00 = C71163Hc.A00(this);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C57112jm c57112jm = this.A03;
        if (c57112jm == null) {
            str = "viewpointManager";
        } else {
            C62862tP A03 = C62862tP.A03(this, A0o, c57112jm);
            this.A07 = A03;
            C42275Inz c42275Inz = new C42275Inz(0, this, A00);
            this.A08 = c42275Inz;
            str = "bloksHost";
            A03.A05(c42275Inz);
            C60972qL c60972qL = new C60972qL(requireContext, AbstractC166987dD.A0r(interfaceC09390do), this);
            FragmentActivity requireActivity = requireActivity();
            C61142qc c61142qc = (C61142qc) this.A0D.getValue();
            C41620IbA c41620IbA = this.A01;
            if (c41620IbA == null) {
                str = "adsHistoryDataFetcher";
            } else {
                J1D j1d = c41620IbA.A06;
                C62862tP c62862tP = this.A07;
                if (c62862tP != null) {
                    HEK hek = new HEK(requireActivity, new C38996HEy(this, c62862tP), this, c61142qc, c60972qL, j1d);
                    this.A00 = hek;
                    A0U(hek);
                    AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
                    HEK hek2 = this.A00;
                    str = "adapter";
                    if (hek2 != null) {
                        AnonymousClass391 anonymousClass391 = new AnonymousClass391(this, abstractC10360h2, hek2, c60972qL);
                        anonymousClass391.A0R = C1M3.A00();
                        ViewOnTouchListenerC60632pm A002 = AbstractC60622pl.A00(requireContext(), null, false);
                        HEK hek3 = this.A00;
                        if (hek3 != null) {
                            C61372qz c61372qz = this.A0F;
                            anonymousClass391.A0C = new C33A(this, A002, c61372qz, hek3);
                            anonymousClass391.A0B = new Object();
                            anonymousClass391.A0T = AbstractC166997dE.A0b();
                            AnonymousClass396 A003 = anonymousClass391.A00();
                            this.A0A = A003;
                            InterfaceC60602pj c675132q = new C675132q(this, AbstractC166987dD.A0r(interfaceC09390do), this);
                            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                            HEK hek4 = this.A00;
                            if (hek4 != null) {
                                C3CO c3co = new C3CO(A0r, hek4, false, false);
                                this.A0B = c3co;
                                c3co.A01();
                                c61372qz.A01(c65953Twy);
                                C14360o3.A0A(A003);
                                c61372qz.A01(A003);
                                C60462pV c60462pV = new C60462pV();
                                c60462pV.A0E(this.A0A);
                                InterfaceC60602pj interfaceC60602pj = this.A0B;
                                if (interfaceC60602pj == null) {
                                    str = "mediaUpdateListener";
                                } else {
                                    c60462pV.A0E(interfaceC60602pj);
                                    c60462pV.A0E(c675132q);
                                    A0a(c60462pV);
                                    C0f9.A09(1105004566, A02);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-531080578);
        View A03 = AbstractC37303Gc4.A03(layoutInflater, viewGroup);
        C0f9.A09(50868675, A02);
        return A03;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC60602pj interfaceC60602pj;
        int A02 = C0f9.A02(-1084427867);
        super.onDestroy();
        C65953Twy c65953Twy = this.A09;
        if (c65953Twy != null) {
            this.A0F.A00.remove(c65953Twy);
            this.A09 = null;
        }
        AnonymousClass396 anonymousClass396 = this.A0A;
        if (anonymousClass396 != null) {
            this.A0F.A00.remove(anonymousClass396);
            this.A0A = null;
        }
        C62862tP c62862tP = this.A07;
        if (c62862tP != null && (interfaceC60602pj = this.A08) != null) {
            c62862tP.A06(interfaceC60602pj);
        }
        AbstractC39678HjA.A00 = null;
        C0f9.A09(561999681, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1057755721);
        super.onResume();
        String str = this.A06;
        if (str != null) {
            A01(this, str);
            this.A06 = null;
        }
        C0f9.A09(-1216356481, A02);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03 = C0f9.A03(-509172115);
        C14360o3.A0B(absListView, 0);
        HEK hek = this.A00;
        if (hek != null) {
            if (hek.A00) {
                if (LJW.A02(absListView)) {
                    HEK hek2 = this.A00;
                    if (hek2 != null) {
                        hek2.A00 = false;
                    }
                }
                C0f9.A0A(2016119336, A03);
                return;
            }
            this.A0F.onScroll(absListView, i, i2, i3);
            C0f9.A0A(2016119336, A03);
            return;
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0N = AbstractC167017dG.A0N(absListView, 927604066);
        HEK hek = this.A00;
        if (hek == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        if (!hek.A00) {
            this.A0F.onScrollStateChanged(absListView, i);
        }
        C0f9.A0A(-955506479, A0N);
    }

    @Override // X.InterfaceC60022ok
    public final boolean onVolumeKeyPressed(EnumC37329GcX enumC37329GcX, KeyEvent keyEvent) {
        AbstractC167017dG.A1N(enumC37329GcX, keyEvent);
        return this.A0C.onVolumeKeyPressed(enumC37329GcX, keyEvent);
    }
}
