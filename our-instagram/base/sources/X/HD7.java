package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class HD7 extends C38K implements InterfaceC60072op, InterfaceC60092or, InterfaceC60122ou, JPR {
    public static final String __redex_internal_original_name = "FanClubContentPreviewPickerFragment";
    public C56352iT A00;
    public HEO A01;
    public C3CO A02;
    public C154786xT A03;
    public boolean A04;
    public C57112jm A05;
    public C65953Twy A06;
    public EmptyStateView A07;
    public final J1F A08;
    public final InterfaceC09390do A0B;
    public final C42755Ivt A0C;
    public final InterfaceC62612t0 A0D;
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A09 = C1XM.A00(new C37049GUf(this, 49));

    @Override // X.JPR
    public final void DXQ() {
    }

    @Override // X.JPR
    public final void DXZ() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131962131);
        interfaceC56362iU.AAF(ViewOnClickListenerC42032Ik1.A00(this, 18), 2131961124);
        interfaceC56362iU.ARk(0, false);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "fan_club_content_preview_picker_fragment";
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ListView A02 = AbstractC37300Gc1.A02(this);
        C65953Twy c65953Twy = this.A06;
        if (c65953Twy == null) {
            str = "autoLoadMoreHelper";
        } else {
            A02.setOnScrollListener(c65953Twy);
            View emptyView = AbstractC37300Gc1.A02(this).getEmptyView();
            C14360o3.A0C(emptyView, MSV.A00(14));
            this.A07 = (EmptyStateView) emptyView;
            A01(this);
            C57112jm c57112jm = this.A05;
            if (c57112jm == null) {
                str = "viewpointManager";
            } else {
                c57112jm.A08(AbstractC37300Gc1.A02(this), C71163Hc.A00(this), new InterfaceC57142jp[0]);
                C44459JlR c44459JlR = (C44459JlR) this.A0B.getValue();
                c44459JlR.A01.A00();
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(c44459JlR.A04), "subscription_exclusive_content_public_preview_picker_impression");
                AbstractC31171DnF.A1I(A0f, AbstractC43591JPw.A00(627));
                A0f.A9K(AbstractC111324zv.A00(4206), AbstractC25228BEl.A13(c44459JlR.A00.userId));
                A0f.Cht();
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = getViewLifecycleOwner();
                AbstractC166987dD.A1Z(new MCL(viewLifecycleOwner, c07s, this, null, 28), C07Y.A00(viewLifecycleOwner));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(HD7 hd7) {
        if (hd7.A07 != null) {
            J1F j1f = hd7.A08;
            if (j1f.isLoading()) {
                EmptyStateView emptyStateView = hd7.A07;
                if (emptyStateView != null) {
                    emptyStateView.A0L();
                    return;
                }
            } else {
                boolean CUG = j1f.CUG();
                EmptyStateView emptyStateView2 = hd7.A07;
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

    public static final void A02(HD7 hd7, boolean z, boolean z2) {
        C154786xT c154786xT = hd7.A03;
        if (c154786xT == null) {
            AbstractC37300Gc1.A0b();
            throw C00O.createAndThrow();
        }
        c154786xT.A00(null, new AnonymousClass500(AbstractC31173DnH.A0t(hd7.A0A)), z, z2, true, false);
        if (z) {
            AbstractC166997dE.A1Y(((C44459JlR) hd7.A0B.getValue()).A05, false);
        }
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return AbstractC166987dD.A0o(this.A0A);
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        if (this.mView != null) {
            ListView A02 = AbstractC37300Gc1.A02(this);
            C14360o3.A07(A02);
            AbstractC47119KsE.A00(A02, this);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A04) {
            C193328hC A0O = AbstractC31175DnJ.A0O(this);
            A0O.A0A(2131962117);
            A0O.A09(2131962115);
            A0O.A0J(DialogInterfaceOnClickListenerC41836Ifq.A00(this, 0), 2131972710);
            A0O.A0H(DialogInterfaceOnClickListenerC41836Ifq.A00(this, 1), 2131962116);
            AbstractC166987dD.A1W(A0O);
            return true;
        }
        return false;
    }

    public HD7() {
        J7K j7k = new J7K(this, 3);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J7K(new J7K(this, 0), 1));
        this.A0B = AbstractC25225BEi.A0a(new J7K(A00, 2), j7k, new C50171MDy(38, null, A00), AbstractC25225BEi.A1D(C44459JlR.class));
        this.A08 = new J1F(this, 0);
        this.A0D = new C42508Irn(this, 0);
        this.A0C = new C42755Ivt(this);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            str = intent.getStringExtra(MSV.A00(146));
        } else {
            str = null;
        }
        if (C14360o3.A0K(str, MSV.A00(147))) {
            C44459JlR c44459JlR = (C44459JlR) this.A0B.getValue();
            Iterator it = c44459JlR.A02.A09(C05F.A04).iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long j = ((C47Z) next).A0g;
                    do {
                        Object next2 = it.next();
                        long j2 = ((C47Z) next2).A0g;
                        if (j < j2) {
                            next = next2;
                            j = j2;
                        }
                    } while (it.hasNext());
                }
                if (next != null) {
                    AbstractC166987dD.A1Z(new MCG(next, c44459JlR, (InterfaceC23621Ds) null, 11), AbstractC141776au.A00(c44459JlR));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(12924087);
        super.onCreate(bundle);
        requireArguments().getBoolean(AbstractC111324zv.A00(1491));
        this.A05 = AbstractC37301Gc2.A0E();
        Context requireContext = requireContext();
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A0A;
        C155376yQ c155376yQ = new C155376yQ(AbstractC166987dD.A0r(interfaceC09390do));
        J1F j1f = this.A08;
        this.A01 = new HEO(requireContext, requireActivity, this, AbstractC166987dD.A0r(interfaceC09390do), (C44459JlR) this.A0B.getValue(), c155376yQ, C38U.A00, j1f);
        this.A02 = new C3CO(AbstractC166987dD.A0r(interfaceC09390do), new C38287GsW(this, 1), false, false);
        HEO heo = this.A01;
        if (heo == null) {
            str = "adapter";
        } else {
            A0U(heo);
            Context requireContext2 = requireContext();
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C61972ry c61972ry = new C61972ry(requireContext(), AbstractC018607g.A00(this), null);
            C42755Ivt c42755Ivt = this.A0C;
            EnumC125775mS enumC125775mS = EnumC125775mS.A04;
            AbstractC25233BEq.A0x(2, A0r, c42755Ivt, enumC125775mS);
            this.A03 = new C154786xT(requireContext2, A0r, c61972ry, null, c42755Ivt, enumC125775mS, null, null, false);
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            this.A06 = new C65953Twy(AbstractC166987dD.A0r(interfaceC09390do), this.A0D, C05F.A01, 6);
            this.A00 = C56352iT.A0t.A03(requireActivity());
            C3CO c3co = this.A02;
            if (c3co == null) {
                str = "mediaUpdateListener";
            } else {
                c3co.A01();
                A02(this, true, false);
                C0f9.A09(2082911572, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-241995636);
        View A03 = AbstractC37303Gc4.A03(layoutInflater, viewGroup);
        C0f9.A09(990482834, A02);
        return A03;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-822859488);
        super.onDestroy();
        C3CO c3co = this.A02;
        if (c3co == null) {
            C14360o3.A0F("mediaUpdateListener");
            throw C00O.createAndThrow();
        }
        c3co.A02();
        C0f9.A09(-1194804991, A02);
    }
}
