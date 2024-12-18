package X;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.BtY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26871BtY extends AbstractC60672pq implements XEF, InterfaceC60122ou, InterfaceC37175GZm {
    public static final String __redex_internal_original_name = "SpamFollowRequestsFragment";
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A01 = C1XM.A00(DD1.A00);
    public final InterfaceC09390do A04 = AbstractC25229BEm.A0p(this, 26);
    public final InterfaceC09390do A02 = AbstractC25229BEm.A0p(this, 24);
    public final InterfaceC09390do A03 = AbstractC25229BEm.A0p(this, 25);
    public final InterfaceC09390do A05 = AbstractC25229BEm.A0p(this, 27);
    public final InterfaceC09390do A08 = AbstractC25229BEm.A0p(this, 28);
    public final InterfaceC09390do A06 = C1XM.A00(DD2.A00);
    public final InterfaceC09390do A00 = AbstractC25229BEm.A0p(this, 23);

    @Override // X.InterfaceC37175GZm
    public final void DI4() {
    }

    @Override // X.XEF
    public final void DXI(User user, int i) {
    }

    @Override // X.XEF
    public final void Dhj(User user, int i) {
        C14360o3.A0B(user, 1);
        AbstractC25231BEo.A0h(this.A09).A02(user.getId(), i);
    }

    @Override // X.XEF
    public final void Dhn(User user, int i) {
        C14360o3.A0B(user, 1);
        AbstractC25231BEo.A0h(this.A09).A03(user.getId(), i);
    }

    @Override // X.InterfaceC37175GZm
    public final void Dqy() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (isAdded() && getContext() != null) {
            AbstractC25229BEm.A1G(interfaceC56362iU, 2131962720);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbsListView absListView = (AbsListView) AbstractC166997dE.A0R(view, R.id.list);
        absListView.setAdapter((ListAdapter) this.A00.getValue());
        absListView.setImportantForAccessibility(1);
        absListView.setOnScrollListener((C1I2) this.A03.getValue());
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new PZP(viewLifecycleOwner, c07s, this, null, 42), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A00(EnumC141996bI enumC141996bI, String str, String str2) {
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A0C = enumC141996bI;
        c146106i8.A0H = str;
        c146106i8.A0D = str2;
        c146106i8.A06();
        AbstractC25233BEq.A1F(c146106i8);
    }

    @Override // X.XEF
    public final void CuL(C26023BfC c26023BfC) {
        AbstractC25231BEo.A0h(this.A09).A00(c26023BfC);
    }

    @Override // X.InterfaceC37175GZm
    public final void DI0() {
        this.A04.getValue();
        N86.A00((N86) this.A09.getValue());
    }

    @Override // X.XEF
    public final void DLH(User user, int i) {
        AbstractC25231BEo.A0h(this.A09).A04(user.getId(), i);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return ((InterfaceC11380iw) this.A01.getValue()).getModuleName();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public C26871BtY() {
        C57240PbO c57240PbO = new C57240PbO(this, 32);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57240PbO(new C57240PbO(this, 29), 30));
        this.A09 = AbstractC25225BEi.A0a(new C57240PbO(A00, 31), c57240PbO, new C57531Pg5(39, null, A00), AbstractC25225BEi.A1D(N86.class));
        this.A07 = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-26626996);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A05;
        AbstractC27777CMs.A00(requireContext(), (JQS) interfaceC09390do.getValue(), this, this.A07, interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = this.A09;
        ((N86) interfaceC09390do2.getValue()).A02();
        AbstractC25231BEo.A0h(interfaceC09390do2).A00 = new C25344BJn(this, 38);
        C0f9.A09(1571502515, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(6690201);
        C14360o3.A0B(layoutInflater, 0);
        registerLifecycleListener((C62882tR) this.A03.getValue());
        View inflate = layoutInflater.inflate(com.facebook.R.layout.layout_listview_with_progress, viewGroup, false);
        C0f9.A09(1289211609, A02);
        return inflate;
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1753296047);
        super.onDestroyView();
        unregisterLifecycleListener((C62882tR) this.A03.getValue());
        C0f9.A09(-139456666, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-202945373);
        super.onResume();
        UserSession A0r = AbstractC166987dD.A0r(this.A07);
        C14360o3.A0B(A0r, 0);
        Boolean Byy = AbstractC166997dE.A0Y(A0r).A03.Byy();
        Bundle requireArguments = requireArguments();
        String A00 = MSV.A00(313);
        boolean z = requireArguments.getBoolean(A00);
        if (Byy != null && !Byy.equals(Boolean.valueOf(z))) {
            AbstractC25233BEq.A15(this, A00, Byy);
            ((N86) this.A09.getValue()).A02();
        }
        C0f9.A09(-1754088249, A02);
    }
}
