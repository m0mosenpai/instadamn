package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class EK9 extends AbstractC59962oe implements InterfaceC11380iw, InterfaceC60072op, InterfaceC60122ou, InterfaceC37190Ga1 {
    public static final String __redex_internal_original_name = "SafetyStepFragment";
    public BusinessFlowAnalyticsLogger A00;
    public IgdsListCell A01;
    public IgdsListCell A02;
    public String A03;
    public boolean A06;
    public boolean A07;
    public InterfaceC37222GaX A08;
    public EVM A09;
    public boolean A05 = true;
    public boolean A04 = true;
    public boolean A0B = true;
    public boolean A0A = true;
    public final InterfaceC09390do A0D = C1XM.A00(new X2y(this, 38));
    public final InterfaceC09390do A0C = C1XM.A00(new X2y(this, 37));
    public final InterfaceC09390do A0E = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC37190Ga1
    public final void APP() {
    }

    @Override // X.InterfaceC37190Ga1
    public final void ARU() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "safety_step_fragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        this.A08 = AbstractC35211Fg4.A01(this);
    }

    public static final void A00(InterfaceC40821up interfaceC40821up, EK9 ek9, String str) {
        String str2 = null;
        String str3 = null;
        String str4 = ek9.A03;
        if (interfaceC40821up != null) {
            str3 = interfaceC40821up.getErrorMessage();
            str2 = interfaceC40821up.getErrorType();
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = ek9.A00;
        if (businessFlowAnalyticsLogger == null) {
            AbstractC31171DnF.A0s();
            throw C00O.createAndThrow();
        }
        businessFlowAnalyticsLogger.Clv(new Y7A("safety", str4, str, str3, str2, null, null, null));
    }

    public static final void A01(EK9 ek9, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = ek9.A00;
        if (businessFlowAnalyticsLogger == null) {
            AbstractC31171DnF.A0s();
            throw C00O.createAndThrow();
        }
        String str2 = ek9.A03;
        HashMap A1G = AbstractC166987dD.A1G();
        if (ek9.A06) {
            A1G.put("hide_more_comments_setting", String.valueOf(ek9.A05));
        }
        if (ek9.A07) {
            A1G.put("hide_message_requests_setting", String.valueOf(ek9.A04));
        }
        businessFlowAnalyticsLogger.Cm3(new Y7A("safety", str2, str, null, null, null, A1G, null));
    }

    @Override // X.InterfaceC37190Ga1
    public final void Dao() {
        InterfaceC53742dD interfaceC53742dD;
        A01(this, "continue");
        if (this.A06) {
            Context requireContext = requireContext();
            C08790ch A00 = AbstractC018607g.A00(this);
            C25621Ms A0c = AbstractC167017dG.A0c(AbstractC166987dD.A0o(this.A0E));
            A0c.A0B(AbstractC58317Pt9.A00(213));
            A0c.A0P(null, C40781ul.class, C55702hA.class, true);
            A0c.A0D("config_value", this.A05 ? 1 : 0);
            C32548EUy.A00(requireContext, A00, AbstractC31172DnG.A0U(A0c, true), this, 21);
        }
        if (this.A07) {
            InterfaceC09390do interfaceC09390do = this.A0E;
            C131305wJ c131305wJ = new C131305wJ(AbstractC166987dD.A0r(interfaceC09390do));
            if (c131305wJ.A04()) {
                c131305wJ.A00(new G70(this), this.A04);
            } else {
                Context requireContext2 = requireContext();
                C08790ch A002 = AbstractC018607g.A00(this);
                C25621Ms A0c2 = AbstractC167017dG.A0c(AbstractC166987dD.A0o(interfaceC09390do));
                A0c2.A0B("accounts/set_hide_message_requests_global/");
                A0c2.A0P(null, C40781ul.class, C55702hA.class, true);
                A0c2.A0D("config_value", this.A04 ? 1 : 0);
                C32548EUy.A00(requireContext2, A002, AbstractC31172DnG.A0U(A0c2, true), this, 22);
            }
        }
        AbstractC35091Fd2.A01(this, AbstractC166987dD.A0r(this.A0E), "igwb", "primary_button_did_tapped", null);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            AbstractC31171DnF.A0s();
            throw C00O.createAndThrow();
        }
        String str = this.A03;
        HashMap A1G = AbstractC166987dD.A1G();
        if (this.A06) {
            A1G.put("hide_more_comments_setting", String.valueOf(this.A05));
        }
        if (this.A07) {
            A1G.put("hide_message_requests_setting", String.valueOf(this.A04));
        }
        businessFlowAnalyticsLogger.CjL(new Y7A("safety", str, null, null, null, null, A1G, null));
        InterfaceC37222GaX interfaceC37222GaX = this.A08;
        if (interfaceC37222GaX != null) {
            ((BusinessConversionActivity) interfaceC37222GaX).CnD(null);
        }
        if (AbstractC167007dF.A1Z(this.A0D) && (interfaceC53742dD = (InterfaceC53742dD) AbstractC54852fj.A00()) != null) {
            AbstractC72153Lo.A00 = true;
            interfaceC53742dD.EfJ(C1QO.A0E);
        }
    }

    @Override // X.InterfaceC37190Ga1
    public final void DjW() {
        InterfaceC53742dD interfaceC53742dD;
        A01(this, "skip");
        AbstractC35091Fd2.A01(this, AbstractC166987dD.A0r(this.A0E), "igwb", "secondary_button_did_tapped", null);
        InterfaceC37222GaX interfaceC37222GaX = this.A08;
        if (interfaceC37222GaX != null) {
            ((BusinessConversionActivity) interfaceC37222GaX).A0p(null, true);
        }
        if (AbstractC167007dF.A1Z(this.A0D) && (interfaceC53742dD = (InterfaceC53742dD) AbstractC54852fj.A00()) != null) {
            AbstractC72153Lo.A00 = true;
            interfaceC53742dD.EfJ(C1QO.A0E);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0E);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC37222GaX interfaceC37222GaX = this.A08;
        if (interfaceC37222GaX != null) {
            AbstractC31179DnN.A1T(interfaceC37222GaX);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31180DnO.A1Q(interfaceC56362iU);
        if (!AbstractC167007dF.A1Z(this.A0C)) {
            ViewOnClickListenerC35690FpP.A02(AbstractC31174DnI.A0K(), interfaceC56362iU, this, 38);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC151596s5 enumC151596s5;
        String str;
        int A02 = C0f9.A02(335311956);
        super.onCreate(bundle);
        this.A03 = AbstractC31180DnO.A0b(this);
        C08730cb c08730cb = C17060sy.A01;
        InterfaceC09390do interfaceC09390do = this.A0E;
        User A0g = AbstractC31176DnK.A0g(c08730cb, interfaceC09390do);
        if (A0g.A03.CVn() != null) {
            this.A06 = !r0.booleanValue();
        }
        boolean z = !A0g.A2F();
        this.A07 = z;
        if (!z && !this.A06) {
            this.A07 = true;
            this.A06 = true;
            C0w9.A03("safety_step_fragment", "Both settings are already on");
        }
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        InterfaceC37222GaX interfaceC37222GaX = this.A08;
        if (interfaceC37222GaX != null) {
            enumC151596s5 = interfaceC37222GaX.B77();
        } else {
            enumC151596s5 = EnumC151596s5.A0D;
        }
        InterfaceC37222GaX interfaceC37222GaX2 = this.A08;
        if (interfaceC37222GaX2 != null) {
            str = (String) AbstractC166987dD.A17(((BusinessConversionActivity) interfaceC37222GaX2).A0C);
        } else {
            str = null;
        }
        BusinessFlowAnalyticsLogger A00 = AbstractC151606s6.A00(enumC151596s5, this, A0o, str);
        if (A00 != null) {
            this.A00 = A00;
            C0f9.A09(-621006612, A02);
        } else {
            IllegalStateException A14 = AbstractC166987dD.A14("received null flowType or unexpected value for flowType");
            C0f9.A09(-222337591, A02);
            throw A14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0100, code lost:
    
        if (r14.A06 == false) goto L30;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r15, android.view.ViewGroup r16, android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EK9.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-831642313);
        super.onDestroyView();
        EVM evm = this.A09;
        if (evm == null) {
            C14360o3.A0F("businessNavBarHelper");
            throw C00O.createAndThrow();
        }
        unregisterLifecycleListener(evm);
        C0f9.A09(1831060114, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        String str;
        int A02 = C0f9.A02(817817808);
        super.onStart();
        boolean z = this.A0B;
        this.A05 = z;
        this.A04 = this.A0A;
        if (this.A06) {
            IgdsListCell igdsListCell = this.A01;
            if (igdsListCell == null) {
                str = "commentSwitch";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            igdsListCell.setChecked(z);
        }
        if (this.A07) {
            IgdsListCell igdsListCell2 = this.A02;
            if (igdsListCell2 == null) {
                str = "messageSwitch";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            igdsListCell2.setChecked(this.A04);
        }
        C0f9.A09(-1859739362, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1345090128);
        this.A0B = this.A05;
        this.A0A = this.A04;
        super.onStop();
        C0f9.A09(1214529011, A02);
    }
}
