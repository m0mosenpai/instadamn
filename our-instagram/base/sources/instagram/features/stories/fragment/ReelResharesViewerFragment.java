package instagram.features.stories.fragment;

import X.AbstractC09440dt;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC37300Gc1;
import X.AbstractC37303Gc4;
import X.AbstractC60492pY;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C1I2;
import X.C1ON;
import X.C25621Ms;
import X.C31543DtT;
import X.C38E;
import X.C38K;
import X.C39030HGg;
import X.C3G2;
import X.C56552P8y;
import X.C61372qz;
import X.C6X4;
import X.C9GR;
import X.EnumC09460dv;
import X.EnumC153216up;
import X.HAP;
import X.HEQ;
import X.IR1;
import X.InterfaceC09390do;
import X.InterfaceC37188GZz;
import X.InterfaceC56362iU;
import X.InterfaceC58021Po7;
import X.InterfaceC60122ou;
import X.InterfaceC63982vJ;
import X.J7R;
import X.MSV;
import X.NSD;
import X.OF4;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class ReelResharesViewerFragment extends C38K implements AbsListView.OnScrollListener, InterfaceC60122ou, InterfaceC63982vJ, InterfaceC37188GZz, InterfaceC58021Po7 {
    public C31543DtT A00;
    public HEQ A01;
    public String A02;
    public String A03;
    public EmptyStateView emptyStateView;
    public final C61372qz A06 = new C61372qz();
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A04 = AbstractC09440dt.A00(EnumC09460dv.A02, new J7R(this, 27));
    public final String A07 = "reel_view_reshare_reels";

    @Override // X.InterfaceC58021Po7
    public final void CxF(C56552P8y c56552P8y, Reel reel, List list, int i, int i2, int i3, boolean z) {
        String str;
        ArrayList A0z = AbstractC31174DnI.A0z(reel);
        C38E c38e = (C38E) this.A04.getValue();
        String str2 = this.A02;
        if (str2 == null) {
            str = "reelTraySessionId";
        } else {
            c38e.A0C = str2;
            FragmentActivity requireActivity = requireActivity();
            ListView A02 = AbstractC37300Gc1.A02(this);
            HEQ heq = this.A01;
            if (heq == null) {
                str = "adapter";
            } else {
                c38e.A05 = new NSD(requireActivity, A02, heq, this);
                c38e.A0D = AbstractC31173DnH.A0t(this.A05);
                c38e.A07(reel, C3G2.A1h, c56552P8y, A0z, A0z, i3);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DHC(Reel reel, C6X4 c6x4) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void Ddi(Reel reel) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }

    @Override // X.InterfaceC37188GZz
    public final void Dit() {
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C61372qz c61372qz = this.A06;
        C31543DtT c31543DtT = this.A00;
        if (c31543DtT == null) {
            C14360o3.A0F("listPaginationHelper");
            throw C00O.createAndThrow();
        }
        c61372qz.A01(c31543DtT);
        View emptyView = AbstractC37300Gc1.A02(this).getEmptyView();
        C14360o3.A0C(emptyView, MSV.A00(14));
        this.emptyStateView = (EmptyStateView) emptyView;
        AbstractC37300Gc1.A02(this).setOnScrollListener(this);
        A02(this);
    }

    private final void A01() {
        C31543DtT c31543DtT = this.A00;
        if (c31543DtT != null) {
            c31543DtT.A01 = false;
            AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A05);
            String str = this.A03;
            C31543DtT c31543DtT2 = this.A00;
            if (c31543DtT2 != null) {
                String str2 = c31543DtT2.A00;
                C25621Ms A0N = AbstractC31173DnH.A0N(A0o);
                A0N.A0L("media/%s/feed_to_stories_shares/", str);
                A0N.A0S(HAP.class, IR1.class);
                if (!TextUtils.isEmpty(str2)) {
                    A0N.A9s("max_id", str2);
                }
                C1ON A0N2 = A0N.A0N();
                C39030HGg.A00(A0N2, this, 41);
                schedule(A0N2);
                return;
            }
        }
        C14360o3.A0F("listPaginationHelper");
        throw C00O.createAndThrow();
    }

    public static final void A02(ReelResharesViewerFragment reelResharesViewerFragment) {
        EmptyStateView emptyStateView = reelResharesViewerFragment.emptyStateView;
        if (emptyStateView != null) {
            HEQ heq = reelResharesViewerFragment.A01;
            if (heq == null) {
                AbstractC31171DnF.A0t();
                throw C00O.createAndThrow();
            }
            if (heq.isEmpty()) {
                emptyStateView.A0P(EnumC153216up.A02);
            } else {
                emptyStateView.A0K();
            }
            emptyStateView.A0I();
        }
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return AbstractC166987dD.A0o(this.A05);
    }

    @Override // X.InterfaceC37188GZz
    public final boolean CL7() {
        if (this.A01 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return !r0.isEmpty();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07;
    }

    @Override // X.InterfaceC37188GZz
    public final void Chd() {
        A01();
    }

    @Override // X.InterfaceC58021Po7
    public final void CxH(OF4 of4) {
        C9GR.A0F(requireContext(), MSV.A00(926), 2131953168);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1I(interfaceC56362iU, AbstractC31176DnK.A05(this, interfaceC56362iU).getString(2131971796));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1335640947);
        super.onCreate(bundle);
        this.A03 = requireArguments().getString("ReelResharesViewerFragment.MEDIA_ID");
        this.A02 = AbstractC166997dE.A0n();
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        InterfaceC09390do interfaceC09390do = this.A05;
        this.A00 = new C31543DtT(this, AbstractC166987dD.A0r(interfaceC09390do), this);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C31543DtT c31543DtT = this.A00;
        if (c31543DtT == null) {
            C14360o3.A0F("listPaginationHelper");
            throw C00O.createAndThrow();
        }
        HEQ heq = new HEQ(requireContext, this, this, A0r, c31543DtT);
        this.A01 = heq;
        A0U(heq);
        A01();
        C0f9.A09(1962765401, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1029446797);
        View A03 = AbstractC37303Gc4.A03(layoutInflater, viewGroup);
        C0f9.A09(-897392273, A02);
        return A03;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1468056013);
        super.onDestroyView();
        this.emptyStateView = null;
        C0f9.A09(694773758, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1212311787);
        super.onResume();
        EmptyStateView emptyStateView = this.emptyStateView;
        if (emptyStateView != null) {
            emptyStateView.A0T(EnumC153216up.A02, 2131971795);
            C0f9.A09(-645429722, A02);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0N = AbstractC167017dG.A0N(absListView, -1436068103);
        this.A06.onScroll(absListView, i, i2, i3);
        C0f9.A0A(-1868468223, A0N);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0N = AbstractC167017dG.A0N(absListView, -1717115656);
        this.A06.onScrollStateChanged(absListView, i);
        C0f9.A0A(815479490, A0N);
    }
}
