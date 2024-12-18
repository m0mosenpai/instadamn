package X;

import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.model.business.BusinessInfo;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;

/* loaded from: classes6.dex */
public final class EKD extends AbstractC59962oe implements InterfaceC12870lZ, InterfaceC60072op, InterfaceC37221GaW, GY6, GY4, CallerContextable {
    public static final String __redex_internal_original_name = "UsernameSuggestionSignUpFragment";
    public C07270a1 A00;
    public RegFlowExtras A01;
    public String A02;
    public String A03;
    public C36142FxG A04;
    public C36143FxH A05;
    public C36144FxI A06;
    public NotificationBar A07;
    public EVN A08;
    public final Handler A09 = new Handler();
    public final InterfaceC41501vz A0A = C31650DvG.A00(this, 70);

    @Override // X.InterfaceC37221GaW
    public final void APP() {
    }

    @Override // X.InterfaceC37221GaW
    public final void ARU() {
    }

    @Override // X.InterfaceC37221GaW
    public final boolean CbE() {
        return true;
    }

    @Override // X.GY4
    public final void EjS(String str, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C07270a1 c07270a1 = this.A00;
            F9Y.A00(activity, this.A09, this, c07270a1, this, this.A01, this.A08, EnumC33523Erw.A07.A00, str, str2, this.A03);
        }
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        return this.A01.A01();
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        return EnumC33523Erw.A07.A00;
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        String str;
        if (!TextUtils.isEmpty(this.A02)) {
            C07270a1 c07270a1 = this.A00;
            EnumC31713DwI enumC31713DwI = EnumC33523Erw.A07.A00;
            String str2 = this.A02;
            RegFlowExtras regFlowExtras = this.A01;
            if (regFlowExtras.A01() != null) {
                str = regFlowExtras.A01().A00;
            } else {
                str = "";
            }
            FDE.A00(c07270a1, enumC31713DwI, str2, str);
        }
        C1UC activity = getActivity();
        if (activity instanceof InterfaceC37222GaX) {
            C35788FrQ A0K = AbstractC31176DnK.A0K((InterfaceC37222GaX) activity);
            C07270a1 c07270a12 = this.A00;
            String str3 = this.A03;
            RegFlowExtras regFlowExtras2 = this.A01;
            Handler handler = this.A09;
            EnumC33445EqI A01 = regFlowExtras2.A01();
            String str4 = A0K.A09;
            BusinessInfo businessInfo = A0K.A02;
            String A04 = AbstractC1567472a.A04(getActivity());
            CallerContext callerContext = C35786FrO.A00;
            if (A01 != EnumC33445EqI.A04) {
                handler.post(new GRB(handler, this, c07270a12, businessInfo, this, regFlowExtras2, A01, str3, str4, A04));
                return;
            }
            return;
        }
        C006802i.A0p.markerStart(4197923);
        C07270a1 c07270a13 = this.A00;
        String str5 = this.A03;
        AbstractC35794FrW.A02(this.A09, this, this, c07270a13, this, this, this.A01, this.A08, EnumC33523Erw.A07.A00, str5, str5, false);
    }

    @Override // X.GY6
    public final void Eks(String str, Integer num) {
        if (isVisible()) {
            AbstractC35259Fgt.A08(this.A07, str);
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
        int A03 = C0f9.A03(-2108922303);
        RegFlowExtras regFlowExtras = this.A01;
        if (regFlowExtras.A01() != EnumC33445EqI.A04) {
            C35146Fen.A01(this, EnumC33523Erw.A07, regFlowExtras).A03(this.A00, this.A01);
        }
        C0f9.A0A(888421431, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-1580729831, C0f9.A03(1652542070));
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!AbstractC31172DnG.A1a(AbstractC31174DnI.A0f(), "has_user_confirmed_dialog")) {
            C07270a1 c07270a1 = this.A00;
            EnumC31713DwI enumC31713DwI = EnumC33523Erw.A07.A00;
            AbstractC34266F9m.A00(this, c07270a1, new C36575GAz(this, 4), this.A01.A01(), enumC31713DwI, null);
            return true;
        }
        C35159Ff1.A00.A01(this.A00, this.A01.A01(), EnumC33523Erw.A07.A00.A01);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0047  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = -1771236737(0xffffffff966d127f, float:-1.9150544E-25)
            int r2 = X.C0f9.A02(r0)
            super.onCreate(r13)
            X.0a1 r0 = X.AbstractC31180DnO.A0L(r12)
            r12.A00 = r0
            android.os.Parcelable r0 = X.AbstractC31180DnO.A04(r12)
            com.instagram.registration.model.RegFlowExtras r0 = (com.instagram.registration.model.RegFlowExtras) r0
            r12.A01 = r0
            r0.getClass()
            com.instagram.registration.model.RegFlowExtras r1 = r12.A01
            X.EqI r0 = X.EnumC33445EqI.A04
            r1.A03(r0)
            java.lang.String r0 = r1.A08
            boolean r0 = X.AbstractC31171DnF.A1X(r0)
            com.instagram.registration.model.RegFlowExtras r1 = r12.A01
            if (r0 == 0) goto Lec
            X.EqI r0 = X.EnumC33445EqI.A03
        L2e:
            r1.A03(r0)
        L31:
            android.content.Context r1 = r12.getContext()
            X.0a1 r0 = r12.A00
            X.AbstractC34226F7y.A00(r1, r0)
            com.instagram.registration.model.RegFlowExtras r0 = r12.A01
            java.lang.String r0 = r0.A0Z
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            com.instagram.registration.model.RegFlowExtras r0 = r12.A01
            if (r1 != 0) goto Lb5
            java.lang.String r0 = r0.A0Z
            r12.A03 = r0
            r12.A02 = r4
        L4d:
            r12.B75()
            X.1V3 r3 = X.C3BH.A00()
            android.content.Context r4 = r12.getContext()
            X.0a1 r5 = r12.A00
            r7 = 0
            com.instagram.registration.model.RegFlowExtras r0 = r12.A01
            X.EqI r6 = r0.A01()
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r3.A02(r4, r5, r6, r7, r8, r9, r10, r11)
            X.1vu r3 = X.C41451vu.A01
            java.lang.Class<X.Fvi> r1 = X.C36046Fvi.class
            X.1vz r0 = r12.A0A
            r3.A02(r0, r1)
            X.0Tz r0 = X.C06090Tz.A05
            java.lang.String r1 = X.AbstractC31180DnO.A0f(r0)
            java.lang.String r0 = "UsernameSuggestionSignUpFragment"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lae
            java.lang.Boolean r0 = X.AbstractC34263F9j.A00()
            boolean r0 = r0.booleanValue()
            r4 = 0
            if (r0 == 0) goto L97
            X.1oB r3 = X.FBE.A00()
            android.content.Context r1 = r12.requireContext()
            X.0a1 r0 = r12.A00
            r3.A00(r1, r0, r4)
        L97:
            java.lang.Boolean r0 = X.AbstractC34264F9k.A00()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lae
            X.1oB r3 = X.FBE.A00()
            android.content.Context r1 = r12.requireContext()
            X.0a1 r0 = r12.A00
            r3.A01(r1, r0, r4)
        Lae:
            r0 = 55181176(0x349ff78, float:5.9361855E-37)
            X.C0f9.A09(r0, r2)
            return
        Lb5:
            java.util.List r1 = X.AbstractC31180DnO.A0s(r0)
            r3 = 0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Ld6
            java.lang.Object r0 = r1.get(r3)
            X.FJd r0 = (X.C34517FJd) r0
            java.lang.String r0 = r0.A01
            r12.A03 = r0
            java.lang.Object r0 = r1.get(r3)
            X.FJd r0 = (X.C34517FJd) r0
            java.lang.String r0 = r0.A00
            r12.A02 = r0
            goto L4d
        Ld6:
            r12.A02 = r4
            com.instagram.registration.model.RegFlowExtras r0 = r12.A01
            java.util.List r1 = r0.A0e
            if (r1 == 0) goto Le8
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Le8
            java.lang.String r4 = X.AbstractC31173DnH.A0s(r1, r3)
        Le8:
            r12.A03 = r4
            goto L4d
        Lec:
            java.lang.String r0 = r1.A0Q
            boolean r0 = X.AbstractC31171DnF.A1X(r0)
            if (r0 == 0) goto L31
            com.instagram.registration.model.RegFlowExtras r1 = r12.A01
            X.EqI r0 = X.EnumC33445EqI.A06
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EKD.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012f  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EKD.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(375350777);
        super.onDestroy();
        C41451vu.A01.A03(this.A0A, C36046Fvi.class);
        C0f9.A09(-375544439, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-997909093);
        super.onDestroyView();
        unregisterLifecycleListener(this.A08);
        C218914p.A06(this);
        this.A07 = null;
        this.A08 = null;
        C36144FxI c36144FxI = this.A06;
        if (c36144FxI != null) {
            C41451vu.A01.A03(c36144FxI, C36050Fvm.class);
            this.A06 = null;
        }
        C36143FxH c36143FxH = this.A05;
        if (c36143FxH != null) {
            C41451vu.A01.A03(c36143FxH, C36044Fvg.class);
            this.A05 = null;
        }
        C36142FxG c36142FxG = this.A04;
        if (c36142FxG != null) {
            C41451vu.A01.A03(c36142FxG, C36048Fvk.class);
            this.A04 = null;
        }
        C0f9.A09(597330094, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(666761793);
        super.onPause();
        this.A07.A03();
        this.A09.removeCallbacksAndMessages(null);
        AbstractC31174DnI.A0H(this).setSoftInputMode(0);
        C0f9.A09(160462824, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1569541694);
        super.onResume();
        AbstractC31180DnO.A1B(this);
        C0f9.A09(197739478, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(632021633);
        super.onStart();
        C0f9.A09(-1970576078, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1949040369);
        super.onStop();
        C0f9.A09(-1795609670, A02);
    }

    @Override // X.InterfaceC37221GaW
    public final void Dbn(boolean z) {
    }
}
