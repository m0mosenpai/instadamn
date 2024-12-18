package X;

import android.os.Handler;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.model.business.BusinessInfo;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;

/* loaded from: classes6.dex */
public final class EKH extends AbstractC59962oe implements InterfaceC12870lZ, InterfaceC60072op, InterfaceC37221GaW, GY6, InterfaceC37201GaC, GY4, CallerContextable {
    public static final String __redex_internal_original_name = "UsernameSignUpFragment";
    public C07270a1 A00;
    public FQY A01;
    public C34712FQx A02;
    public FQG A03;
    public RegFlowExtras A04;
    public NotificationBar A05;
    public InlineErrorMessageView A06;
    public ProgressButton A07;
    public SearchEditText A08;
    public ImageView A09;
    public C36139FxD A0A;
    public C36140FxE A0B;
    public C36141FxF A0C;
    public FQF A0D;
    public EVN A0E;
    public final Handler A0F = new Handler();
    public final Runnable A0G = new GM1(this);
    public final TextWatcher A0H = new Em2(this, 13);
    public final View.OnFocusChangeListener A0I = new ViewOnFocusChangeListenerC35694FpU(this, 19);
    public final InterfaceC41501vz A0J = C31650DvG.A00(this, 69);

    @Override // X.InterfaceC37221GaW
    public final void Dbn(boolean z) {
    }

    @Override // X.GY4
    public final void EjS(String str, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C07270a1 c07270a1 = this.A00;
            F9Y.A00(activity, this.A0F, this, c07270a1, this, this.A04, this.A0E, EnumC33523Erw.A0H.A00, str, str2, A00());
        }
    }

    private String A00() {
        List A0s = AbstractC31180DnO.A0s(this.A04);
        if (!A0s.isEmpty()) {
            return ((C34517FJd) A0s.get(0)).A01;
        }
        List list = this.A04.A0e;
        if (list != null && !list.isEmpty()) {
            return AbstractC25226BEj.A1I(list, 0);
        }
        return null;
    }

    @Override // X.InterfaceC37221GaW
    public final void APP() {
        this.A08.setEnabled(false);
    }

    @Override // X.InterfaceC37221GaW
    public final void ARU() {
        this.A08.setEnabled(true);
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        return this.A04.A01();
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        return EnumC33523Erw.A0H.A00;
    }

    @Override // X.InterfaceC37221GaW
    public final boolean CbE() {
        return !AbstractC31179DnN.A1a(this.A08);
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        String A0J = AbstractC13880nE.A0J(this.A08);
        Handler handler = this.A0F;
        handler.removeCallbacks(this.A0G);
        C1UC activity = getActivity();
        if (activity instanceof InterfaceC37222GaX) {
            C35788FrQ A0K = AbstractC31176DnK.A0K((InterfaceC37222GaX) activity);
            C07270a1 c07270a1 = this.A00;
            RegFlowExtras regFlowExtras = this.A04;
            EnumC33445EqI A01 = regFlowExtras.A01();
            String str = A0K.A09;
            BusinessInfo businessInfo = A0K.A02;
            String A04 = AbstractC1567472a.A04(getActivity());
            CallerContext callerContext = C35786FrO.A00;
            if (A01 != EnumC33445EqI.A04) {
                handler.post(new GRB(handler, this, c07270a1, businessInfo, this, regFlowExtras, A01, A0J, str, A04));
                return;
            }
            return;
        }
        AbstractC35794FrW.A02(handler, this, this, this.A00, this, this, this.A04, this.A0E, EnumC33523Erw.A0H.A00, A0J, A00(), false);
    }

    @Override // X.InterfaceC37201GaC
    public final void DyG() {
        this.A07.setShowProgressBar(false);
        this.A02.A01();
    }

    @Override // X.InterfaceC37201GaC
    public final void DyH(String str, Integer num) {
        this.A07.setShowProgressBar(false);
        this.A02.A00();
        Eks(str, num);
    }

    @Override // X.InterfaceC37201GaC
    public final void DyI() {
        this.A07.setShowProgressBar(true);
    }

    @Override // X.InterfaceC37201GaC
    public final void DyK(String str, List list) {
        this.A07.setEnabled(false);
        this.A07.setShowProgressBar(false);
        this.A02.A00();
        Eks(str, C05F.A01);
        this.A01.A00(getRootActivity(), list);
    }

    @Override // X.GY6
    public final void Eks(String str, Integer num) {
        if (num == C05F.A01) {
            this.A06.A04(str);
            this.A05.A02();
        } else {
            AbstractC35259Fgt.A08(this.A05, str);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "username_sign_up";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-894030057);
        RegFlowExtras regFlowExtras = this.A04;
        if (regFlowExtras.A01() != EnumC33445EqI.A04) {
            C35146Fen.A01(this, EnumC33523Erw.A0H, regFlowExtras).A03(this.A00, this.A04);
        }
        C0f9.A0A(1564278586, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(189312541, C0f9.A03(-1925054154));
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!AbstractC31172DnG.A1a(AbstractC31174DnI.A0f(), "has_user_confirmed_dialog")) {
            C07270a1 c07270a1 = this.A00;
            EnumC31713DwI enumC31713DwI = EnumC33523Erw.A0H.A00;
            AbstractC34266F9m.A00(this, c07270a1, new C36575GAz(this, 3), this.A04.A01(), enumC31713DwI, null);
            return true;
        }
        if (this.A04.A01() == EnumC33445EqI.A04) {
            C34907FZt.A00 = null;
        } else {
            C34907FZt.A00();
            AbstractC13880nE.A0J(this.A08);
        }
        C35159Ff1.A00.A01(this.A00, this.A04.A01(), EnumC33523Erw.A0H.A00.A01);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x006a  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = -2144896352(0xffffffff80277aa0, float:-3.625574E-39)
            int r3 = X.C0f9.A02(r0)
            super.onCreate(r14)
            X.0a1 r0 = X.AbstractC31180DnO.A0L(r13)
            r13.A00 = r0
            android.os.Parcelable r1 = X.AbstractC31180DnO.A04(r13)
            r1.getClass()
            com.instagram.registration.model.RegFlowExtras r1 = (com.instagram.registration.model.RegFlowExtras) r1
            r13.A04 = r1
            X.EqI r0 = X.EnumC33445EqI.A04
            r1.A03(r0)
            java.lang.String r0 = r1.A08
            boolean r0 = X.AbstractC31171DnF.A1X(r0)
            com.instagram.registration.model.RegFlowExtras r1 = r13.A04
            if (r0 == 0) goto La0
            X.EqI r0 = X.EnumC33445EqI.A03
        L2c:
            r1.A03(r0)
        L2f:
            android.content.Context r1 = r13.getContext()
            X.0a1 r0 = r13.A00
            X.AbstractC34226F7y.A00(r1, r0)
            r13.B75()
            X.1V3 r4 = X.C3BH.A00()
            android.content.Context r5 = r13.getContext()
            X.0a1 r6 = r13.A00
            r8 = 0
            com.instagram.registration.model.RegFlowExtras r0 = r13.A04
            X.EqI r7 = r0.A01()
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r4.A02(r5, r6, r7, r8, r9, r10, r11, r12)
            X.1vu r2 = X.C41451vu.A01
            java.lang.Class<X.Fvi> r1 = X.C36046Fvi.class
            X.1vz r0 = r13.A0J
            r2.A02(r0, r1)
            X.0Tz r0 = X.C06090Tz.A05
            java.lang.String r1 = X.AbstractC31180DnO.A0f(r0)
            java.lang.String r0 = "UsernameSignUpFragment"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L99
            java.lang.Boolean r0 = X.AbstractC34263F9j.A00()
            boolean r0 = r0.booleanValue()
            r4 = 0
            if (r0 == 0) goto L82
            X.1oB r2 = X.FBE.A00()
            android.content.Context r1 = r13.requireContext()
            X.0a1 r0 = r13.A00
            r2.A00(r1, r0, r4)
        L82:
            java.lang.Boolean r0 = X.AbstractC34264F9k.A00()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L99
            X.1oB r2 = X.FBE.A00()
            android.content.Context r1 = r13.requireContext()
            X.0a1 r0 = r13.A00
            r2.A01(r1, r0, r4)
        L99:
            r0 = 283832225(0x10eaefa1, float:9.266593E-29)
            X.C0f9.A09(r0, r3)
            return
        La0:
            java.lang.String r0 = r1.A0Q
            boolean r0 = X.AbstractC31171DnF.A1X(r0)
            if (r0 == 0) goto L2f
            com.instagram.registration.model.RegFlowExtras r1 = r13.A04
            X.EqI r0 = X.EnumC33445EqI.A06
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EKH.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0192  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r21, android.view.ViewGroup r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EKH.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1824451168);
        super.onDestroy();
        C41451vu.A01.A03(this.A0J, C36046Fvi.class);
        C0f9.A09(1798676529, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1031220482);
        super.onDestroyView();
        unregisterLifecycleListener(this.A0E);
        C218914p.A06(this);
        this.A08.removeTextChangedListener(this.A0H);
        this.A08.setOnEditorActionListener(null);
        this.A08.setOnFocusChangeListener(null);
        this.A05 = null;
        this.A08 = null;
        this.A01 = null;
        this.A0E = null;
        this.A06 = null;
        this.A09 = null;
        this.A07 = null;
        C36141FxF c36141FxF = this.A0C;
        if (c36141FxF != null) {
            C41451vu.A01.A03(c36141FxF, C36050Fvm.class);
            this.A0C = null;
        }
        C36140FxE c36140FxE = this.A0B;
        if (c36140FxE != null) {
            C41451vu.A01.A03(c36140FxE, C36044Fvg.class);
            this.A0B = null;
        }
        C36139FxD c36139FxD = this.A0A;
        if (c36139FxD != null) {
            C41451vu.A01.A03(c36139FxD, C36048Fvk.class);
            this.A0A = null;
        }
        C0f9.A09(533743747, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(2134887420);
        super.onPause();
        AbstractC13880nE.A0O(this.A08);
        this.A05.A03();
        this.A0F.removeCallbacksAndMessages(null);
        Window A0H = AbstractC31174DnI.A0H(this);
        A0H.getClass();
        A0H.setSoftInputMode(0);
        C0f9.A09(-1629268665, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(717935462);
        super.onResume();
        AbstractC35259Fgt.A06(this.A08);
        AbstractC31180DnO.A0x(requireActivity());
        C0f9.A09(1617406560, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-2039613888);
        super.onStart();
        C0f9.A09(-1824514499, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-742948969);
        super.onStop();
        C0f9.A09(1507949634, A02);
    }
}
