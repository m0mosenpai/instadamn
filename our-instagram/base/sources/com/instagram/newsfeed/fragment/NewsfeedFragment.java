package com.instagram.newsfeed.fragment;

import X.AbstractC10360h2;
import X.AbstractC12220kQ;
import X.AbstractC13880nE;
import X.AbstractC14480oK;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25229BEm;
import X.AbstractC25230BEn;
import X.AbstractC25235BEs;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31178DnM;
import X.AbstractC43593JPy;
import X.AbstractC50578MUk;
import X.AbstractC53242c7;
import X.AbstractC54792fc;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.AnonymousClass001;
import X.AnonymousClass772;
import X.AnonymousClass773;
import X.C06090Tz;
import X.C0f9;
import X.C0fQ;
import X.C14240no;
import X.C14360o3;
import X.C16930sl;
import X.C189458aP;
import X.C189468aQ;
import X.C189478aR;
import X.C18U;
import X.C25548BRk;
import X.C27741Wc;
import X.C2UY;
import X.C2fe;
import X.C3LO;
import X.C3LY;
import X.C50577MUi;
import X.C50581MUp;
import X.C50841MdY;
import X.C52775NXg;
import X.C54822fg;
import X.C56292iI;
import X.CJR;
import X.InterfaceC02590Ai;
import X.InterfaceC09390do;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import X.InterfaceC37175GZm;
import X.InterfaceC53892dT;
import X.InterfaceC53912dV;
import X.InterfaceC56362iU;
import X.InterfaceC60092or;
import X.InterfaceC60112ot;
import X.InterfaceC71793Kc;
import X.MPF;
import X.MSX;
import X.MSY;
import X.MSZ;
import X.MUH;
import X.MUI;
import X.MUK;
import X.MUR;
import X.OEX;
import X.PR5;
import X.ViewOnClickListenerC55393Oj3;
import X.ViewOnClickListenerC55456OkA;
import X.ViewOnClickListenerC55465OkK;
import X.ViewOnClickListenerC55468OkN;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class NewsfeedFragment extends AbstractC59962oe implements C2fe, InterfaceC60092or, InterfaceC60112ot, InterfaceC37175GZm, MPF, InterfaceC53912dV {
    public static boolean A0D = true;
    public int A00;
    public View A01;
    public ViewGroup A02;
    public C189478aR A03;
    public C52775NXg A04;
    public MUI A05;
    public InterfaceC53892dT A07;
    public boolean A06 = true;
    public final InterfaceC09390do A08 = AbstractC25229BEm.A0p(this, 34);
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);
    public final String A0B = "newsfeed_you";
    public final boolean A0C = true;
    public final InterfaceC09390do A09 = AbstractC25229BEm.A0p(this, 35);

    public static final C189468aQ A00(NewsfeedFragment newsfeedFragment, MUR mur, boolean z) {
        C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
        c189458aP.A06 = newsfeedFragment.getText(2131968498);
        c189458aP.A05 = new ViewOnClickListenerC55468OkN(0, mur, newsfeedFragment);
        c189458aP.A0A = z;
        return c189458aP.A00();
    }

    @Override // X.C2fe
    public final C25548BRk AvQ() {
        return null;
    }

    @Override // X.C2fe
    public final /* synthetic */ void CKS(MotionEvent motionEvent, Long l, boolean z) {
    }

    @Override // X.C2fe
    public final boolean Ce8(MotionEvent motionEvent) {
        return true;
    }

    @Override // X.InterfaceC37175GZm
    public final void DI0() {
    }

    @Override // X.InterfaceC37175GZm
    public final void DI4() {
    }

    @Override // X.C2fe
    public final /* synthetic */ void DVb() {
    }

    @Override // X.InterfaceC37175GZm
    public final void Dqy() {
    }

    @Override // X.C2fe
    public final void F84(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        Context context;
        MUI mui;
        MUR A01;
        MUI mui2;
        List A012;
        String str;
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkF(true);
        interfaceC56362iU.Efu(2131968849);
        InterfaceC09390do interfaceC09390do = this.A0A;
        if (AbstractC54792fc.A02(AbstractC25230BEn.A0k(interfaceC09390do, 0))) {
            interfaceC56362iU.EkS(true);
        }
        if (!C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36321924241958804L) && (context = getContext()) != null && (mui = this.A05) != null && (A01 = MUH.A01(mui)) != null && !A01.A01.isEmpty() && (mui2 = this.A05) != null) {
            C14360o3.A0C(mui2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            if (mui2.isAdded()) {
                MUI mui3 = this.A05;
                C14360o3.A0C(mui3, "null cannot be cast to non-null type com.instagram.newsfeed.fragment.NewsfeedViewSwitcherChildFragment");
                if (MSX.A0S(mui3).A02) {
                    A012 = A01.A03();
                } else {
                    A012 = A01.A01();
                }
                int size = A012.size();
                if (size > 0) {
                    str = AbstractC25235BEs.A0q(" (", size);
                } else {
                    str = "";
                }
                C3LO A0B = AbstractC31171DnF.A0B();
                A0B.A05 = 2131962565;
                A0B.A04 = R.id.action_bar_button_action;
                A0B.A0G = ViewOnClickListenerC55465OkK.A00(A01, this, 70);
                A0B.A0K = AbstractC167007dF.A0f(context, str, 2131968496);
                this.A01 = interfaceC56362iU.AA9(new C3LY(A0B));
                if (this.A06) {
                    this.A06 = false;
                    C50581MUp A00 = AbstractC50578MUk.A00(AbstractC166987dD.A0r(interfaceC09390do));
                    List A013 = A01.A01();
                    List A02 = A01.A02();
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(A00.A00, A00.A01), "instagram_af_filter_events_v2");
                    A0f.AAP("event_name", "entrypoint_impression");
                    if (A013 == null) {
                        A013 = C16930sl.A00;
                    }
                    A0f.AAk("current_filters", A013);
                    C16930sl c16930sl = C16930sl.A00;
                    A0f.AAk("clicked_filters", c16930sl);
                    if (A02 == null) {
                        A02 = c16930sl;
                    }
                    A0f.AAk("filters", A02);
                    A0f.Cht();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        getChildFragmentManager().A09 = new C50841MdY(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String A0O;
        MUI mui;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        int i = this.A00;
        if (Integer.valueOf(i).equals(0)) {
            A0O = "newsfeed_you";
        } else {
            A0O = AnonymousClass001.A0O("newsfeed_you_", i);
        }
        Fragment A0Q = childFragmentManager.A0Q(A0O);
        if (A0Q instanceof MUI) {
            mui = (MUI) A0Q;
        } else {
            mui = null;
        }
        this.A05 = mui;
        if (mui == null) {
            MUI A00 = CJR.A00(AbstractC166987dD.A0r(this.A0A), null, null);
            C14240no A0F = AbstractC43593JPy.A0F(this);
            A0F.A0D(A00, "newsfeed_you", R.id.newsfeed_you);
            A0F.A00();
            C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.newsfeed.fragment.NewsfeedViewSwitcherChildFragment");
            this.A05 = A00;
        }
        MSY.A1Q(this.A08);
        if (A02()) {
            ViewGroup viewGroup = (ViewGroup) view;
            View inflate = getLayoutInflater().inflate(R.layout.notification_upsell, viewGroup, false);
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) inflate;
            Context context = viewGroup2.getContext();
            TextView A0Q2 = AbstractC25230BEn.A0Q(viewGroup2, R.id.upsell_body);
            String string = context.getString(2131975813);
            String str = "";
            if (string == null) {
                string = "";
            }
            String string2 = context.getString(2131975812);
            if (string2 != null) {
                str = string2;
            }
            SpannableStringBuilder A09 = AbstractC31178DnM.A09(string, str);
            C14360o3.A07(A09);
            AnonymousClass773.A03(A09, new AnonymousClass772(AbstractC31174DnI.A0q(context, AbstractC53242c7.A0C(context))), str);
            A0Q2.setText(A09);
            ViewOnClickListenerC55456OkA.A00(viewGroup2, 32, this);
            View A0c = AbstractC166987dD.A0c(viewGroup2, R.id.upsell_close);
            float A092 = AbstractC13880nE.A09(requireContext());
            C0fQ.A00(new ViewOnClickListenerC55393Oj3(viewGroup2, this, A092), A0c);
            viewGroup.addView(viewGroup2);
            this.A02 = viewGroup2;
            if (A0D) {
                A0D = false;
                view.postDelayed(new PR5(viewGroup2, A092), 500L);
            } else {
                viewGroup2.setVisibility(0);
            }
            OEX oex = (OEX) this.A09.getValue();
            InterfaceC19610xo ARD = oex.A02.ARD();
            ARD.E7G(AbstractC166997dE.A0n(), MSZ.A0E(oex.A06));
            ARD.apply();
        }
    }

    public static final void A01(NewsfeedFragment newsfeedFragment) {
        try {
            if (Build.VERSION.SDK_INT >= 29 && C2UY.A01.A00 != null) {
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(newsfeedFragment.A0A), 36322718810974645L)) {
                    C2UY.A01.A06();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.C2fe
    public final /* synthetic */ double BbC() {
        return 0.0d;
    }

    @Override // X.C2fe
    public final /* synthetic */ boolean BvL() {
        return false;
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return false;
    }

    @Override // X.C2fe
    public final /* synthetic */ boolean Ce6() {
        return false;
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
    }

    @Override // X.C2fe
    public final /* synthetic */ boolean Ei8() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0B;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // X.AbstractC59962oe
    public final boolean isContainerFragment() {
        return this.A0C;
    }

    private final boolean A02() {
        if (!AbstractC14480oK.A01(requireContext())) {
            OEX oex = (OEX) this.A09.getValue();
            long A0E = MSZ.A0E(oex.A06);
            InterfaceC19630xq interfaceC19630xq = oex.A03;
            String AKD = oex.A01.AKD();
            String str = oex.A04;
            if (str.length() != 0) {
                AKD = AnonymousClass001.A0g(str, "::", AKD);
            }
            if (A0E > AbstractC31175DnJ.A03(interfaceC19630xq, AKD) && oex.A00 > AbstractC166987dD.A0N(oex.A05.getValue())) {
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A0A), 36325063863055028L)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC53912dV
    public final void DWU(C54822fg c54822fg) {
        int A03 = C0f9.A03(1418492578);
        MUI mui = this.A05;
        if (mui != null) {
            mui.A03();
        }
        C0f9.A0A(-287252225, A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(580703857);
        super.onCreate(bundle);
        MUK.A01(AbstractC166987dD.A0r(this.A0A)).A01.clear();
        C0f9.A09(-1658165339, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1914878993);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_newsfeed, viewGroup, false);
        C0f9.A09(757907429, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1937880476);
        MUH.A00(AbstractC166987dD.A0r(this.A0A)).A04 = true;
        super.onDestroy();
        C0f9.A09(130449583, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(537972727);
        C52775NXg c52775NXg = this.A04;
        if (c52775NXg != null) {
            c52775NXg.A00 = null;
        }
        this.A05 = null;
        super.onDestroyView();
        C0f9.A09(1107701618, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(820400121);
        super.onPause();
        InterfaceC53892dT interfaceC53892dT = this.A07;
        if (interfaceC53892dT != null) {
            interfaceC53892dT.C4b().A01(this);
        }
        C0f9.A09(-1471763425, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(851026723);
        super.onResume();
        InterfaceC09390do interfaceC09390do = this.A0A;
        if (MUK.A02(AbstractC166987dD.A0r(interfaceC09390do)).A00) {
            MUI mui = this.A05;
            if (mui != null) {
                mui.A04(false);
                MUK.A02(AbstractC166987dD.A0r(interfaceC09390do)).A00 = false;
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(-1552138731, A02);
                throw A0g;
            }
        }
        InterfaceC53892dT interfaceC53892dT = this.A07;
        if (interfaceC53892dT != null) {
            interfaceC53892dT.C4b().A00(this);
        }
        C27741Wc A01 = C27741Wc.A01();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        InterfaceC71793Kc A00 = C27741Wc.A00(A0r, A01, "newstab");
        if (A00 != null) {
            A01.A00.ATO(new C50577MUi(A0r, A00, A01));
        }
        boolean A022 = A02();
        ViewGroup viewGroup = this.A02;
        if (A022) {
            if (viewGroup != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                C56292iI c56292iI = (C56292iI) layoutParams;
                c56292iI.A02 = 80;
                viewGroup.setLayoutParams(c56292iI);
                viewGroup.bringToFront();
            }
        } else {
            AbstractC167007dF.A0x(viewGroup);
        }
        C0f9.A09(31141505, A02);
    }

    @Override // X.MPF
    public final void EfG(InterfaceC53892dT interfaceC53892dT) {
        this.A07 = interfaceC53892dT;
    }
}
