package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HD6 extends C38K implements AbsListView.OnScrollListener, JPR, InterfaceC63982vJ, CallerContextable {
    public static final CallerContext A08 = CallerContext.A00(HD6.class);
    public static final String __redex_internal_original_name = "ArchiveLiveFragment";
    public HEP A00;
    public UserSession A01;
    public C154796xU A02;
    public C38E A03;
    public EmptyStateView A04;
    public String A05;
    public final Map A06 = AbstractC166987dD.A1I();
    public final C61372qz A07 = new C61372qz();

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DHC(Reel reel, C6X4 c6x4) {
    }

    @Override // X.JPR
    public final void DXQ() {
    }

    @Override // X.JPR
    public final void DXZ() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "archive_live";
    }

    public static void A02(HD6 hd6) {
        EmptyStateView emptyStateView = hd6.A04;
        if (emptyStateView != null) {
            if (hd6.A00.isEmpty()) {
                emptyStateView.A0P(EnumC153216up.A02);
            } else if (hd6.A02.A03.A03 == C05F.A01) {
                emptyStateView.A0J();
            } else {
                emptyStateView.A0K();
            }
            emptyStateView.A0I();
        }
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A01;
    }

    @Override // X.InterfaceC63982vJ
    public final void Ddi(Reel reel) {
        Map map = this.A06;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (true) {
            if (!A15.hasNext()) {
                break;
            }
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            IJT ijt = (IJT) A1K.getValue();
            if (ijt.A02 != null) {
                String id = reel.getId();
                String str = ijt.A02.A0X;
                str.getClass();
                if (id == str) {
                    map.remove(A1K.getKey());
                    break;
                }
            }
        }
        A01(this);
    }

    public static void A01(HD6 hd6) {
        IJT ijt;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A16 = AbstractC166997dE.A16(hd6.A06);
        while (A16.hasNext()) {
            IJT ijt2 = (IJT) A16.next();
            C105824pt c105824pt = ijt2.A02;
            if (c105824pt != null && c105824pt.A02() != null) {
                String str = ijt2.A04;
                str.getClass();
                c105824pt.A07 = new C109954xP(str, ijt2.A05);
                A1E.add(new C41087IHe(ijt2, C05F.A0C));
            }
        }
        HEP hep = hd6.A00;
        C38903HBa c38903HBa = hep.A02;
        c38903HBa.A04();
        Map map = hep.A06;
        map.clear();
        int size = A1E.size();
        hep.A00 = size;
        if (size > 9) {
            int i = size % 3;
            if (i != 0) {
                int i2 = 3 - i;
                for (int i3 = 0; i3 < i2; i3++) {
                    c38903HBa.A0A(new C41087IHe(null, C05F.A00));
                }
            }
        }
        c38903HBa.A0B(A1E);
        hep.A06();
        c38903HBa.A06();
        Map map2 = hep.A07;
        map2.clear();
        if (!hep.isEmpty()) {
            hep.A08(hep.A05, null);
            int A02 = c38903HBa.A02();
            int count = hep.getCount();
            for (int i4 = 0; i4 < A02; i4++) {
                C153126ug c153126ug = new C153126ug(c38903HBa.A01, i4 * 3, 3);
                int i5 = i4 + count;
                for (int i6 = 0; i6 < c153126ug.A01(); i6++) {
                    C41087IHe c41087IHe = (C41087IHe) c153126ug.A02(i6);
                    if (c41087IHe.A01 == C05F.A0C && (ijt = c41087IHe.A00) != null && !map2.containsKey(ijt.A04)) {
                        AbstractC37301Gc2.A1T(ijt.A04, map2, i5);
                    }
                }
                C153336v2 A0G = AbstractC37304Gc5.A0G(AbstractC166997dE.A0u(c153126ug), map);
                A0G.A00(i5, AbstractC167007dF.A1P(i4, A02 - 1));
                hep.A09(hep.A04, new IED(c153126ug), A0G);
            }
            hep.A08(hep.A03, null);
        }
        hep.A07();
        A02(hd6);
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        AbstractC47119KsE.A00(AbstractC37300Gc1.A02(this), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1289756988);
        super.onCreate(bundle);
        this.A01 = AbstractC31176DnK.A0S(this);
        this.A05 = AbstractC166997dE.A0n();
        HEP hep = new HEP(requireContext(), this, this);
        this.A00 = hep;
        A0U(hep);
        C154796xU A0L = AbstractC37302Gc3.A0L(requireContext(), requireActivity(), this.A01);
        this.A02 = A0L;
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 0);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("archive/live/lives_archived/");
        A0L.A03(AbstractC25227BEk.A0e(A0M, HB6.class, IPZ.class), new HL9(this, 0));
        C0f9.A09(1815556602, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1353716907);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_feed);
        C0f9.A09(1626789748, A02);
        return A0A;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1361286393);
        super.onDestroyView();
        this.A04 = null;
        C0f9.A09(-264557344, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(88005977);
        super.onResume();
        EmptyStateView emptyStateView = this.A04;
        if (emptyStateView == null) {
            emptyStateView = AbstractC37304Gc5.A0P(this);
            this.A04 = emptyStateView;
        }
        EnumC153216up enumC153216up = EnumC153216up.A02;
        emptyStateView.A0T(enumC153216up, 2131965318);
        this.A04.A0S(enumC153216up, 2131965317);
        this.A04.A0U(enumC153216up, "");
        A01(this);
        UserSession userSession = this.A01;
        int i = this.A00.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0L(this, userSession), "ig_live_archive_main_screen_impression");
        A0f.A9K("archive_items_count", AbstractC31171DnF.A0V(i));
        AbstractC31171DnF.A1I(A0f, "archive_live");
        A0f.Cht();
        C0f9.A09(493101032, A02);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03 = C0f9.A03(1458205281);
        this.A07.onScroll(absListView, i, i2, i3);
        C0f9.A0A(-694897865, A03);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = C0f9.A03(-1063039862);
        this.A07.onScrollStateChanged(absListView, i);
        C0f9.A0A(-1333736770, A03);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A04 = (EmptyStateView) AbstractC37300Gc1.A02(this).getEmptyView();
        RefreshableListView refreshableListView = (RefreshableListView) AbstractC37300Gc1.A02(this);
        refreshableListView.APU();
        boolean z = false;
        refreshableListView.A07 = false;
        refreshableListView.setOnScrollListener(this);
        if (this.A02.A03.A03 == C05F.A00 && !this.A00.isEmpty()) {
            z = true;
        }
        AbstractC31557Dth.A00(this.mView, z);
        A02(this);
        C196068lw.A00(this.A01).A01(A08, null, "archive_live");
    }

    @Override // X.InterfaceC63982vJ
    public final void DeI(Reel reel) {
        A01(this);
    }
}
