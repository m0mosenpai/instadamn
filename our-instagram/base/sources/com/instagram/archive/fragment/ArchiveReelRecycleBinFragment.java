package com.instagram.archive.fragment;

import X.AbstractC12990ll;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC43594JPz;
import X.AbstractC47119KsE;
import X.AbstractC50523MSb;
import X.AbstractC60492pY;
import X.AbstractC60622pl;
import X.C00O;
import X.C05F;
import X.C0f9;
import X.C14360o3;
import X.C153126ug;
import X.C17u;
import X.C1I2;
import X.C1OU;
import X.C1XM;
import X.C29897DGl;
import X.C38E;
import X.C38K;
import X.C3G2;
import X.C3G5;
import X.C3G6;
import X.C41181vS;
import X.C50627MWo;
import X.C51013MgK;
import X.C51757Mtg;
import X.C52100N3a;
import X.C52196N8l;
import X.C54587O9o;
import X.C56552P8y;
import X.C57508Pfi;
import X.C61372qz;
import X.C69720VuF;
import X.C6X4;
import X.C9GR;
import X.EnumC09460dv;
import X.EnumC153216up;
import X.InterfaceC09390do;
import X.InterfaceC147106jm;
import X.InterfaceC56392iX;
import X.InterfaceC58021Po7;
import X.InterfaceC60072op;
import X.InterfaceC60092or;
import X.InterfaceC60132ov;
import X.InterfaceC63982vJ;
import X.JPR;
import X.MSW;
import X.N3Y;
import X.N3Z;
import X.NSB;
import X.OF4;
import X.OJ8;
import X.P8M;
import X.PZW;
import X.ViewOnClickListenerC55467OkM;
import X.ViewOnTouchListenerC195698lA;
import X.ViewOnTouchListenerC60632pm;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class ArchiveReelRecycleBinFragment extends C38K implements InterfaceC60072op, InterfaceC147106jm, InterfaceC60092or, AbsListView.OnScrollListener, JPR, InterfaceC60132ov, InterfaceC63982vJ, InterfaceC58021Po7 {
    public C52196N8l A00;
    public ViewOnTouchListenerC60632pm A01;
    public EmptyStateView A02;
    public ViewOnTouchListenerC195698lA A03;
    public String A04;
    public int A05;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public InterfaceC56392iX downloadAllButtonStubHolder;
    public InterfaceC56392iX fastScrollStubHolder;
    public C69720VuF viewPortObserver;
    public final C61372qz A06 = new C61372qz();
    public final Set A07 = AbstractC31171DnF.A0l();
    public final Set A08 = AbstractC31171DnF.A0l();
    public final InterfaceC09390do A0B = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        return true;
    }

    @Override // X.InterfaceC58021Po7
    public final void CxF(C56552P8y c56552P8y, Reel reel, List list, int i, int i2, int i3, boolean z) {
        String str;
        ArrayList A12 = AbstractC166997dE.A12(list, 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel A0G = AbstractC50523MSb.A0G(AbstractC166987dD.A1B(it), this.A0B);
            if (A0G != null) {
                A12.add(A0G);
            }
        }
        C38E c38e = (C38E) this.A0A.getValue();
        String str2 = this.A04;
        if (str2 == null) {
            str = "reelViewerSessionId";
        } else {
            c38e.A0C = str2;
            FragmentActivity requireActivity = requireActivity();
            ListView A02 = AbstractC37300Gc1.A02(this);
            C52196N8l c52196N8l = this.A00;
            if (c52196N8l == null) {
                str = "adapter";
            } else {
                c38e.A05 = new NSB(A02, requireActivity, c52196N8l, this);
                c38e.A0D = AbstractC31173DnH.A0t(this.A0B);
                c38e.A07(reel, C3G2.A0B, c56552P8y, A12, A12, i3);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC63982vJ
    public final void DHC(Reel reel, C6X4 c6x4) {
    }

    @Override // X.InterfaceC147106jm
    public final void DOA(String str) {
    }

    @Override // X.InterfaceC147106jm
    public final void DOB(String str) {
    }

    @Override // X.InterfaceC147106jm
    public final void DRJ(String str, String str2) {
    }

    @Override // X.InterfaceC147106jm
    public final void DRW(String str, String str2) {
    }

    @Override // X.InterfaceC147106jm
    public final void DSI(String str, String str2) {
    }

    @Override // X.InterfaceC147106jm
    public final void DSL(String str, String str2) {
    }

    @Override // X.JPR
    public final void DXQ() {
    }

    @Override // X.JPR
    public final void DXZ() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "archive_stories_recycle_bin";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x022d, code lost:
    
        if (r11 > 1.0f) goto L55;
     */
    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.ArchiveReelRecycleBinFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A02(ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment) {
        int i;
        long j;
        Integer num;
        C51013MgK c51013MgK = (C51013MgK) archiveReelRecycleBinFragment.A09.getValue();
        List<OJ8> A00 = C51013MgK.A00(c51013MgK.A01, (Map) ((C50627MWo) c51013MgK.A00.A06.getValue()).A00);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (OJ8 oj8 : A00) {
            C41181vS c41181vS = oj8.A03;
            Reel reel = oj8.A02;
            if (oj8 instanceof N3Y) {
                if (c41181vS != null) {
                    i = oj8.A00;
                    j = oj8.A01;
                    num = C05F.A0N;
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                if (oj8 instanceof N3Z) {
                    i = oj8.A00;
                    j = oj8.A01;
                    num = C05F.A01;
                } else if (oj8 instanceof C52100N3a) {
                    i = oj8.A00;
                    j = oj8.A01;
                    num = C05F.A0C;
                }
                c41181vS = null;
            }
            A1E.add(new OF4(reel, c41181vS, num, i, j));
        }
        C52196N8l c52196N8l = archiveReelRecycleBinFragment.A00;
        if (c52196N8l == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        c52196N8l.A0D(A1E);
        A03(archiveReelRecycleBinFragment);
    }

    public static final void A03(ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment) {
        if (archiveReelRecycleBinFragment.A02 != null) {
            InterfaceC09390do interfaceC09390do = archiveReelRecycleBinFragment.A09;
            if (((C51757Mtg) ((C51013MgK) interfaceC09390do.getValue()).A04.getValue()).A01 == C05F.A01) {
                EmptyStateView emptyStateView = archiveReelRecycleBinFragment.A02;
                if (emptyStateView != null) {
                    emptyStateView.A0L();
                }
            } else if (((C51757Mtg) ((C51013MgK) interfaceC09390do.getValue()).A04.getValue()).A01 == C05F.A0N) {
                EmptyStateView emptyStateView2 = archiveReelRecycleBinFragment.A02;
                if (emptyStateView2 != null) {
                    emptyStateView2.A0J();
                }
            } else {
                C52196N8l c52196N8l = archiveReelRecycleBinFragment.A00;
                if (c52196N8l == null) {
                    AbstractC31171DnF.A0t();
                    throw C00O.createAndThrow();
                }
                boolean isEmpty = c52196N8l.isEmpty();
                EmptyStateView emptyStateView3 = archiveReelRecycleBinFragment.A02;
                if (isEmpty) {
                    if (emptyStateView3 != null) {
                        emptyStateView3.A0P(EnumC153216up.A02);
                    }
                } else if (emptyStateView3 != null) {
                    emptyStateView3.A0K();
                }
            }
            EmptyStateView emptyStateView4 = archiveReelRecycleBinFragment.A02;
            if (emptyStateView4 != null) {
                emptyStateView4.A0I();
            }
        }
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return AbstractC166987dD.A0o(this.A0B);
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A01;
        if (viewOnTouchListenerC60632pm == null) {
            C14360o3.A0F("scrollableNavigationHelper");
            throw C00O.createAndThrow();
        }
        return viewOnTouchListenerC60632pm;
    }

    @Override // X.InterfaceC147106jm
    public final void DOC(String str, boolean z) {
        InterfaceC09390do interfaceC09390do;
        Reel A0G;
        if (((Map) ((C50627MWo) ((C51013MgK) this.A09.getValue()).A00.A06.getValue()).A00).containsKey(str) && !z && (A0G = AbstractC50523MSb.A0G(str, (interfaceC09390do = this.A0B))) != null && !A0G.A15(AbstractC166987dD.A0r(interfaceC09390do))) {
            A02(this);
        }
    }

    public ArchiveReelRecycleBinFragment() {
        C57508Pfi c57508Pfi = new C57508Pfi(this, 17);
        InterfaceC09390do A00 = C57508Pfi.A00(new C57508Pfi(this, 19), EnumC09460dv.A02, 20);
        this.A09 = AbstractC25225BEi.A0a(new C57508Pfi(A00, 21), c57508Pfi, new C29897DGl(48, null, A00), AbstractC25225BEi.A1D(C51013MgK.class));
        this.A0A = C1XM.A00(new C57508Pfi(this, 18));
    }

    public static final void A01(ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment) {
        ListView A02 = AbstractC37300Gc1.A02(archiveReelRecycleBinFragment);
        C14360o3.A07(A02);
        int firstVisiblePosition = A02.getFirstVisiblePosition();
        int lastVisiblePosition = A02.getLastVisiblePosition();
        ArrayList A1E = AbstractC166987dD.A1E();
        C17u c17u = new C17u(firstVisiblePosition + 1, lastVisiblePosition);
        int i = c17u.A00;
        int i2 = c17u.A01;
        boolean z = false;
        if (i <= i2) {
            while (true) {
                C52196N8l c52196N8l = archiveReelRecycleBinFragment.A00;
                if (c52196N8l == null) {
                    AbstractC31171DnF.A0t();
                    throw C00O.createAndThrow();
                }
                Object item = c52196N8l.getItem(i);
                C14360o3.A07(item);
                if (item instanceof C54587O9o) {
                    C153126ug c153126ug = ((C54587O9o) item).A00;
                    int A01 = c153126ug.A01();
                    for (int i3 = 0; i3 < A01; i3++) {
                        Reel reel = ((OF4) c153126ug.A02(i3)).A03;
                        if (reel != null) {
                            if (C14360o3.A0K(reel.getId(), "placeholder")) {
                                z = true;
                            }
                            if (!reel.A0z(AbstractC166987dD.A0r(archiveReelRecycleBinFragment.A0B))) {
                                Set set = archiveReelRecycleBinFragment.A07;
                                if (!set.contains(reel.getId())) {
                                    String A0i = AbstractC37301Gc2.A0i(reel);
                                    A1E.add(A0i);
                                    set.add(A0i);
                                }
                            }
                        }
                    }
                }
                if (i != i2) {
                    i++;
                } else if (z) {
                    C51013MgK c51013MgK = (C51013MgK) archiveReelRecycleBinFragment.A09.getValue();
                    PZW.A01(c51013MgK, AbstractC141776au.A00(c51013MgK), 3, false);
                }
            }
        }
        P8M p8m = new P8M(1, A1E, archiveReelRecycleBinFragment);
        archiveReelRecycleBinFragment.A08.add(p8m);
        if (AbstractC25226BEj.A1b(A1E)) {
            UserSession A0r = AbstractC166987dD.A0r(archiveReelRecycleBinFragment.A0B);
            C1OU c1ou = C1OU.$redex_init_class;
            C14360o3.A0B(A0r, 0);
            C3G6.A00(A0r).A05(C3G5.A0I, p8m, "archive_stories_recycle_bin", null, A1E);
        }
    }

    @Override // X.InterfaceC58021Po7
    public final void CxH(OF4 of4) {
        C9GR.A0F(requireContext(), "archive_media_unavailable", 2131953168);
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        ListView A02 = AbstractC37300Gc1.A02(this);
        C14360o3.A07(A02);
        AbstractC47119KsE.A00(A02, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-277291414);
        super.onCreate(bundle);
        C52196N8l c52196N8l = new C52196N8l(requireActivity(), requireContext(), this, this, null, null, this, AbstractC166987dD.A0r(this.A0B), null, false, false, true, true, true);
        this.A00 = c52196N8l;
        A0U(c52196N8l);
        this.A04 = AbstractC167017dG.A0j();
        this.A05 = AbstractC43594JPz.A06(requireContext());
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A01 = AbstractC60622pl.A00(requireContext(), null, false);
        C51013MgK c51013MgK = (C51013MgK) this.A09.getValue();
        PZW.A01(c51013MgK, AbstractC141776au.A00(c51013MgK), 3, true);
        C0f9.A09(-1859073182, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1882990144);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_feed_with_storage_quota, false);
        C0f9.A09(722715783, A02);
        return A0R;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1071206279);
        super.onDestroyView();
        UserSession A0r = AbstractC166987dD.A0r(this.A0B);
        MSW.A1X(A0r);
        C3G6.A00(A0r).A08(this);
        C61372qz c61372qz = this.A06;
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A01;
        if (viewOnTouchListenerC60632pm == null) {
            C14360o3.A0F("scrollableNavigationHelper");
            throw C00O.createAndThrow();
        }
        ArrayList arrayList = c61372qz.A00;
        arrayList.remove(viewOnTouchListenerC60632pm);
        ViewOnTouchListenerC195698lA viewOnTouchListenerC195698lA = this.A03;
        if (viewOnTouchListenerC195698lA != null) {
            arrayList.remove(viewOnTouchListenerC195698lA);
        }
        this.A02 = null;
        ArchiveReelRecycleBinFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(-1754076009, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1261385908);
        super.onPause();
        C69720VuF c69720VuF = this.viewPortObserver;
        if (c69720VuF != null) {
            c69720VuF.A01();
            C0f9.A09(161192862, A02);
        } else {
            C14360o3.A0F("viewPortObserver");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1040752687);
        super.onResume();
        EmptyStateView emptyStateView = this.A02;
        if (emptyStateView != null) {
            emptyStateView.A0R(EnumC153216up.A04, R.drawable.loadmore_icon_refresh_compound);
        }
        EmptyStateView emptyStateView2 = this.A02;
        if (emptyStateView2 != null) {
            emptyStateView2.A0N(new ViewOnClickListenerC55467OkM(this, 12), EnumC153216up.A04);
        }
        EmptyStateView emptyStateView3 = this.A02;
        if (emptyStateView3 != null) {
            emptyStateView3.A0T(EnumC153216up.A02, 2131974462);
        }
        EmptyStateView emptyStateView4 = this.A02;
        if (emptyStateView4 != null) {
            emptyStateView4.A0S(EnumC153216up.A02, 2131974462);
        }
        EmptyStateView emptyStateView5 = this.A02;
        if (emptyStateView5 != null) {
            emptyStateView5.A0Q(EnumC153216up.A02, 2131974462);
        }
        EmptyStateView emptyStateView6 = this.A02;
        if (emptyStateView6 != null) {
            emptyStateView6.A0R(EnumC153216up.A02, R.drawable.empty_state_private);
        }
        A02(this);
        C69720VuF c69720VuF = this.viewPortObserver;
        if (c69720VuF != null) {
            c69720VuF.A00();
            A01(this);
            C0f9.A09(-818861739, A02);
            return;
        }
        C14360o3.A0F("viewPortObserver");
        throw C00O.createAndThrow();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0N = AbstractC167017dG.A0N(absListView, 1223695442);
        this.A06.onScroll(absListView, i, i2, i3);
        C0f9.A0A(620697833, A0N);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0N = AbstractC167017dG.A0N(absListView, -1742311383);
        this.A06.onScrollStateChanged(absListView, i);
        C0f9.A0A(-357891439, A0N);
    }

    @Override // X.InterfaceC63982vJ
    public final void Ddi(Reel reel) {
        A02(this);
    }

    @Override // X.InterfaceC63982vJ
    public final void DeI(Reel reel) {
        A02(this);
    }
}
