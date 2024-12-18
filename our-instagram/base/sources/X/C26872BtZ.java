package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.BtZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26872BtZ extends AbstractC60672pq implements XEF, InterfaceC60122ou, InterfaceC37175GZm, C38O {
    public static final String __redex_internal_original_name = "FollowRequestsFragment";
    public TextView A00;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A02 = AbstractC25229BEm.A0p(this, 7);
    public final InterfaceC09390do A0E = AbstractC25229BEm.A0p(this, 16);
    public final InterfaceC09390do A07 = AbstractC25229BEm.A0p(this, 11);
    public final InterfaceC09390do A0B = AbstractC25229BEm.A0p(this, 14);
    public final InterfaceC09390do A04 = AbstractC25229BEm.A0p(this, 8);
    public final InterfaceC09390do A05 = AbstractC25229BEm.A0p(this, 9);
    public final InterfaceC09390do A06 = AbstractC25229BEm.A0p(this, 10);
    public final InterfaceC09390do A08 = AbstractC25229BEm.A0p(this, 12);
    public final InterfaceC09390do A09 = C1XM.A00(DD0.A00);
    public final InterfaceC09390do A0D = AbstractC25229BEm.A0p(this, 15);
    public final InterfaceC09390do A0F = AbstractC25229BEm.A0p(this, 17);
    public final InterfaceC09390do A03 = C1XM.A00(C57390Pdo.A00);
    public final InterfaceC09390do A0A = AbstractC25229BEm.A0p(this, 13);
    public final InterfaceC09390do A0G = AbstractC25229BEm.A0p(this, 18);
    public final InterfaceC09390do A01 = AbstractC25229BEm.A0p(this, 6);

    @Override // X.C38O
    public final C193328hC AM3(C193328hC c193328hC) {
        C14360o3.A0B(c193328hC, 0);
        c193328hC.A0n(this);
        return c193328hC;
    }

    @Override // X.InterfaceC37175GZm
    public final void DI4() {
    }

    @Override // X.XEF
    public final void Dhj(User user, int i) {
        C14360o3.A0B(user, 1);
        AbstractC25231BEo.A0h(this.A0H).A02(user.getId(), i);
    }

    @Override // X.XEF
    public final void Dhn(User user, int i) {
        C14360o3.A0B(user, 1);
        AbstractC25231BEo.A0h(this.A0H).A03(user.getId(), i);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (isAdded() && getContext() != null) {
            AbstractC25229BEm.A1G(interfaceC56362iU, 2131962720);
            FrameLayout frameLayout = ((C56352iT) interfaceC56362iU).A0S;
            C14360o3.A0C(frameLayout, AbstractC111324zv.A00(StringTreeSet.MAX_SYMBOL_COUNT));
            TextView A0T = AbstractC166997dE.A0T(LayoutInflater.from(requireContext()).inflate(R.layout.action_bar_button_text, (ViewGroup) frameLayout, false), R.id.action_bar_button_text);
            AbstractC25227BEk.A12(A0T, this, 2131962718);
            AbstractC166987dD.A1O(requireContext(), A0T, AbstractC53242c7.A07(A0T.getContext()));
            ViewOnClickListenerC28666ClE.A01(A0T, 9, this);
            this.A00 = A0T;
            C3LO c3lo = new C3LO();
            c3lo.A0I = this.A00;
            interfaceC56362iU.AAA(new C3LY(c3lo));
            boolean z = ((C28177CbP) ((N86) this.A0H.getValue()).A09.getValue()).A02;
            TextView textView = this.A00;
            if (textView != null) {
                textView.setEnabled(z);
                float f = 0.35f;
                if (textView.isEnabled()) {
                    f = 1.0f;
                }
                textView.setAlpha(f);
            }
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> arrayList;
        if (i2 == -1 && i == 277) {
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra(AbstractC111324zv.A00(284), false);
                arrayList = intent.getStringArrayListExtra("ARG_USER_IDS");
            } else {
                arrayList = null;
            }
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0H);
            AbstractC166987dD.A1Z(new PZO(arrayList, A0Z, null, 22, z), AbstractC141776au.A00(A0Z));
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((AbstractC55352ga) this.A0A.getValue()).DiZ();
        AbsListView absListView = (AbsListView) AbstractC166997dE.A0R(view, android.R.id.list);
        absListView.setAdapter((ListAdapter) this.A01.getValue());
        absListView.setImportantForAccessibility(1);
        absListView.setOnScrollListener((C1I2) this.A05.getValue());
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new PZP(viewLifecycleOwner, c07s, this, null, 41), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.XEF
    public final void CuL(C26023BfC c26023BfC) {
        AbstractC25231BEo.A0h(this.A0H).A00(c26023BfC);
    }

    @Override // X.InterfaceC37175GZm
    public final void DI0() {
        this.A07.getValue();
        N86.A00((N86) this.A0H.getValue());
    }

    @Override // X.XEF
    public final void DLH(User user, int i) {
        AbstractC25231BEo.A0h(this.A0H).A04(user.getId(), i);
        AbstractC55352ga abstractC55352ga = (AbstractC55352ga) this.A0A.getValue();
        java.util.Set singleton = Collections.singleton(Trigger.A0d);
        C14360o3.A07(singleton);
        abstractC55352ga.AVr(singleton);
    }

    @Override // X.XEF
    public final void DXI(User user, int i) {
        O8I o8i = (O8I) this.A07.getValue();
        String id = user.getId();
        UserSession userSession = o8i.A01;
        InterfaceC11380iw interfaceC11380iw = o8i.A00;
        AbstractC25234BEr.A1M(interfaceC11380iw, AbstractC12220kQ.A01(interfaceC11380iw, userSession), "follow_request_overflow_menu_tapped", id, i);
        C56787PIe c56787PIe = new C56787PIe(this, user);
        FragmentActivity requireActivity = requireActivity();
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0C;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C08790ch A00 = AbstractC018607g.A00(this);
        C18920wW A01 = AbstractC12220kQ.A01(this, AbstractC166987dD.A0o(interfaceC09390do));
        C14360o3.A0B(A0r, 4);
        C36006Fv4 c36006Fv4 = new C36006Fv4(requireContext, requireActivity, A00, this, this, A01, A0r, null, null, null, user, c56787PIe, null, null, null, null);
        C50674MYs c50674MYs = new C50674MYs(requireContext(), AbstractC166987dD.A0o(interfaceC09390do));
        List A03 = c36006Fv4.A03();
        int size = A03.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) A03.get(i2);
            c50674MYs.A0B(pair.second.toString(), new ViewOnClickListenerC31591DuJ(58, c36006Fv4, pair));
        }
        new C31727DwY(c50674MYs).A07(requireContext());
    }

    @Override // X.InterfaceC37175GZm
    public final void Dqy() {
        this.A07.getValue();
        if (AbstractC35067Fce.A02()) {
            C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity(), this.A0C);
            A0c.A0B(null, AbstractC35067Fce.A00().A00().A01("newsfeed_follow_requests", getString(2131960982)));
            A0c.A04();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return ((InterfaceC11380iw) this.A02.getValue()).getModuleName();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    public C26872BtZ() {
        C57240PbO c57240PbO = new C57240PbO(this, 22);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57240PbO(new C57240PbO(this, 19), 20));
        this.A0H = AbstractC25225BEi.A0a(new C57240PbO(A00, 21), c57240PbO, new C57531Pg5(38, null, A00), AbstractC25225BEi.A1D(N86.class));
        this.A0C = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-880939606);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A08;
        AbstractC27777CMs.A00(requireContext(), (JQS) interfaceC09390do.getValue(), this, this.A0C, interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = this.A0H;
        ((N86) interfaceC09390do2.getValue()).A02();
        AbstractC25231BEo.A0h(interfaceC09390do2).A00 = new C25344BJn(this, 36);
        ((C54781OIv) ((N86) interfaceC09390do2.getValue()).A04.A04.getValue()).A00 = new C25344BJn(this, 37);
        C0f9.A09(-1710284624, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1359653101);
        C14360o3.A0B(layoutInflater, 0);
        registerLifecycleListener((C62882tR) this.A05.getValue());
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_progress, viewGroup, false);
        C0f9.A09(-1222827728, A02);
        return inflate;
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1950013227);
        super.onDestroyView();
        unregisterLifecycleListener((C62882tR) this.A05.getValue());
        C0f9.A09(6311250, A02);
    }
}
