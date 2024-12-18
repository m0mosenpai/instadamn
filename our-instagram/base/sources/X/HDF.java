package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.ui.emptystaterow.EmptyStateView;

/* loaded from: classes7.dex */
public final class HDF extends C38K implements InterfaceC62602sz, InterfaceC60072op, InterfaceC62612t0, InterfaceC60092or, InterfaceC60122ou, JPR {
    public static final String __redex_internal_original_name = "ArchiveFeedFragment";
    public HEN A00;
    public C3CO A01;
    public C154796xU A02;
    public C57112jm A03;
    public C65953Twy A04;
    public EmptyStateView A05;
    public final C38U A06 = C38U.A00;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A02(false);
    }

    @Override // X.JPR
    public final void DXQ() {
    }

    @Override // X.JPR
    public final void DXZ() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131963496);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "archive_feed";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ListView A02 = AbstractC37300Gc1.A02(this);
        C65953Twy c65953Twy = this.A04;
        if (c65953Twy == null) {
            str = "autoLoadMoreHelper";
        } else {
            A02.setOnScrollListener(c65953Twy);
            View emptyView = AbstractC37300Gc1.A02(this).getEmptyView();
            C14360o3.A0C(emptyView, MSV.A00(14));
            this.A05 = (EmptyStateView) emptyView;
            A01(this);
            C57112jm c57112jm = this.A03;
            if (c57112jm == null) {
                str = "viewpointManager";
            } else {
                c57112jm.A08(AbstractC37300Gc1.A02(this), C71163Hc.A00(this), new InterfaceC57142jp[0]);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(HDF hdf) {
        if (hdf.A05 != null) {
            if (hdf.isLoading()) {
                EmptyStateView emptyStateView = hdf.A05;
                if (emptyStateView != null) {
                    emptyStateView.A0L();
                    return;
                }
            } else {
                boolean CUG = hdf.CUG();
                EmptyStateView emptyStateView2 = hdf.A05;
                if (CUG) {
                    if (emptyStateView2 != null) {
                        emptyStateView2.A0J();
                        return;
                    }
                } else if (emptyStateView2 != null) {
                    emptyStateView2.A0K();
                    return;
                }
            }
            C14360o3.A0F("emptyStateView");
            throw C00O.createAndThrow();
        }
    }

    private final void A02(boolean z) {
        C154796xU c154796xU = this.A02;
        if (c154796xU != null) {
            C25621Ms A0M = AbstractC31177DnL.A0M(AbstractC166987dD.A0o(this.A07));
            A0M.A0B("feed/only_me_feed/");
            A0M.A0R(C32206EDf.class, C34754FSt.class);
            C154796xU c154796xU2 = this.A02;
            if (c154796xU2 != null) {
                AbstractC2044893h.A06(A0M, c154796xU2.A03.A07);
                C38290GsZ.A00(A0M.A0N(), c154796xU, this, 0, z);
                return;
            }
        }
        AbstractC37300Gc1.A0b();
        throw C00O.createAndThrow();
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return AbstractC166987dD.A0o(this.A07);
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        C154796xU c154796xU = this.A02;
        if (c154796xU == null) {
            AbstractC37300Gc1.A0b();
            throw C00O.createAndThrow();
        }
        if (c154796xU.A06()) {
            A02(false);
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        HEN hen = this.A00;
        if (hen == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return AbstractC166987dD.A1b(((AbstractC65332xV) hen.A02).A01);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        C154796xU c154796xU = this.A02;
        if (c154796xU == null) {
            AbstractC37300Gc1.A0b();
            throw C00O.createAndThrow();
        }
        return c154796xU.A05();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        C154796xU c154796xU = this.A02;
        if (c154796xU == null) {
            AbstractC37300Gc1.A0b();
            throw C00O.createAndThrow();
        }
        return AbstractC37303Gc4.A1b(c154796xU);
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        if (this.mView != null) {
            ListView A02 = AbstractC37300Gc1.A02(this);
            C14360o3.A07(A02);
            AbstractC47119KsE.A00(A02, this);
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        C154796xU c154796xU = this.A02;
        if (c154796xU == null) {
            AbstractC37300Gc1.A0b();
            throw C00O.createAndThrow();
        }
        return AbstractC37303Gc4.A1a(c154796xU);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        if (isLoading() && !CL7()) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1332471514);
        super.onCreate(bundle);
        this.A03 = AbstractC37301Gc2.A0E();
        Context requireContext = requireContext();
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A07;
        HLI hli = new HLI(AbstractC166987dD.A0r(interfaceC09390do));
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C38U c38u = C38U.A00;
        C57112jm c57112jm = this.A03;
        if (c57112jm == null) {
            str = "viewpointManager";
        } else {
            this.A00 = new HEN(requireContext, requireActivity, this, A0r, c57112jm, hli, c38u, this);
            this.A01 = new C3CO(AbstractC166987dD.A0r(interfaceC09390do), new C38287GsW(this, 0), false, false);
            C3AX c3ax = new C3AX(AbstractC166987dD.A0r(interfaceC09390do), null, "archive_feed");
            C3AR c3ar = new C3AR(AbstractC166987dD.A0r(interfaceC09390do), "archive_feed");
            C42411xV A00 = C42411xV.A00(AbstractC166987dD.A0r(interfaceC09390do));
            C14360o3.A08(C42411xV.A0F);
            A00.A07(c3ar, c3ax, "archive_feed");
            HEN hen = this.A00;
            if (hen == null) {
                str = "adapter";
            } else {
                A0U(hen);
                this.A02 = AbstractC37302Gc3.A0L(requireContext(), this, AbstractC166987dD.A0r(interfaceC09390do));
                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                this.A04 = new C65953Twy(AbstractC166987dD.A0r(interfaceC09390do), this, C05F.A01, 6);
                C3CO c3co = this.A01;
                if (c3co == null) {
                    str = "mediaUpdateListener";
                } else {
                    c3co.A01();
                    A02(true);
                    C0f9.A09(1557046070, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1889284747);
        View A03 = AbstractC37303Gc4.A03(layoutInflater, viewGroup);
        C0f9.A09(610366202, A02);
        return A03;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-202688659);
        super.onDestroy();
        C3CO c3co = this.A01;
        if (c3co == null) {
            C14360o3.A0F("mediaUpdateListener");
            throw C00O.createAndThrow();
        }
        c3co.A02();
        C42411xV.A00(AbstractC166987dD.A0r(this.A07)).A08("archive_feed");
        C0f9.A09(-1689402815, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-452985606);
        super.onPause();
        C42411xV.A00(AbstractC166987dD.A0r(this.A07));
        C11T.A00();
        C11T.A00();
        C0f9.A09(2136082701, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1961855711);
        super.onResume();
        C42411xV.A00(AbstractC166987dD.A0r(this.A07));
        requireContext();
        C11T.A00();
        C11T.A00();
        C0f9.A09(590189377, A02);
    }
}
