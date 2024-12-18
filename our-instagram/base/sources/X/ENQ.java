package X;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ENQ extends C38K implements C38M, InterfaceC60112ot, C38O {
    public static final C3G2 A08 = C3G2.A0s;
    public static final String __redex_internal_original_name = "FeaturedUserFragment";
    public C38E A00;
    public C140626Xq A01;
    public C32413EPo A02;
    public String A03;
    public C161887My A04;
    public final String A06 = AbstractC167017dG.A0j();
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final String A05 = "featured_user";

    @Override // X.C38O
    public final C193328hC AM3(C193328hC c193328hC) {
        C14360o3.A0B(c193328hC, 0);
        c193328hC.A0m(this, AbstractC166987dD.A0o(this.A07));
        return c193328hC;
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return false;
    }

    @Override // X.C38M
    public final void D4P(SparseArray sparseArray, Integer num) {
    }

    @Override // X.C38M
    public final void D4Q() {
    }

    @Override // X.C38M
    public final void D4R() {
    }

    @Override // X.C38M
    public final void D4T(SparseArray sparseArray) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131968452);
        interfaceC56362iU.AAF(ViewOnClickListenerC35682FpH.A00(this, 25), 2131961124);
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return AbstractC166987dD.A0o(this.A07);
    }

    @Override // X.C38M
    public final void D4S() {
        if (AbstractC167007dF.A1W(C37001nx.A02)) {
            C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity(), this.A07);
            A0c.A0B(null, AbstractC35067Fce.A00().A00().A01("featured_user", getString(2131960982)));
            A0c.A04();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-698205107);
        super.onCreate(bundle);
        this.A03 = AbstractC153636vY.A01(requireArguments(), "FeaturedUserFragment.EXTRA_USER_NAME");
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A07;
        C32413EPo c32413EPo = new C32413EPo(requireContext, this, AbstractC166987dD.A0r(interfaceC09390do), this, new Ef1(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), this), this, this);
        this.A02 = c32413EPo;
        A0U(c32413EPo);
        Context requireContext2 = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C32413EPo c32413EPo2 = this.A02;
        if (c32413EPo2 == null) {
            str = "adapter";
        } else {
            C161887My c161887My = new C161887My(requireContext2, A0r, c32413EPo2);
            c161887My.A00();
            this.A04 = c161887My;
            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
            String str2 = this.A03;
            if (str2 == null) {
                str = "displayedUsername";
            } else {
                C25621Ms A0D = AbstractC31179DnN.A0D(A0o);
                A0D.A0B("users/featureduserinfo/");
                A0D.A9s(AbstractC70143W6w.A00(), str2);
                C1ON A0e = AbstractC25227BEk.A0e(A0D, ED9.class, C34856FXq.class);
                C31714DwJ.A00(A0e, this, 9);
                schedule(A0e);
                C0f9.A09(1640839962, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(546112510);
        C161887My c161887My = this.A04;
        if (c161887My != null) {
            c161887My.A01();
        }
        super.onDestroy();
        C0f9.A09(-942477433, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(668062226);
        super.onResume();
        C3M4 A05 = C1OU.A05(requireActivity());
        if (A05 != null && A05.A0a() && A05.A0G == A08) {
            A05.A0Y(this);
        }
        C0f9.A09(969644138, A02);
    }
}
