package X;

import android.animation.TimeInterpolator;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.model.business.BusinessInfo;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;

/* loaded from: classes6.dex */
public final class EKG extends AbstractC59962oe implements InterfaceC12870lZ, InterfaceC60072op, InterfaceC37221GaW, GY6, InterfaceC37201GaC, GY4 {
    public static final String __redex_internal_original_name = "UsernameChangeFragment";
    public C07270a1 A00;
    public FQY A01;
    public C34712FQx A02;
    public FQG A03;
    public RegFlowExtras A04;
    public NotificationBar A05;
    public InlineErrorMessageView A06;
    public ProgressButton A07;
    public SearchEditText A08;
    public String A09;
    public String A0A;
    public ImageView A0B;
    public C36138FxC A0C;
    public FQF A0D;
    public EVN A0E;
    public final Handler A0F = new Handler();
    public final Runnable A0G = new GM0(this);
    public final InterfaceC41501vz A0J = C31650DvG.A00(this, 68);
    public final TextWatcher A0H = new Em2(this, 12);
    public final View.OnFocusChangeListener A0I = new ViewOnFocusChangeListenerC35694FpU(this, 18);

    @Override // X.InterfaceC37221GaW
    public final void Dbn(boolean z) {
    }

    @Override // X.GY4
    public final void EjS(String str, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C07270a1 c07270a1 = this.A00;
            F9Y.A00(activity, this.A0F, this, c07270a1, this, this.A04, this.A0E, EnumC33523Erw.A05.A00, str, str2, this.A0A);
        }
    }

    @Override // X.InterfaceC37221GaW
    public final void APP() {
        SearchEditText searchEditText = this.A08;
        searchEditText.getClass();
        searchEditText.setEnabled(false);
    }

    @Override // X.InterfaceC37221GaW
    public final void ARU() {
        SearchEditText searchEditText = this.A08;
        searchEditText.getClass();
        searchEditText.setEnabled(true);
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        return this.A04.A01();
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        return EnumC33523Erw.A05.A00;
    }

    @Override // X.InterfaceC37221GaW
    public final boolean CbE() {
        SearchEditText searchEditText = this.A08;
        searchEditText.getClass();
        RectF rectF = AbstractC13880nE.A01;
        return AbstractC31171DnF.A1X(AbstractC31174DnI.A0v(searchEditText));
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        String str;
        SearchEditText searchEditText = this.A08;
        searchEditText.getClass();
        RectF rectF = AbstractC13880nE.A01;
        String A0v = AbstractC31174DnI.A0v(searchEditText);
        if (!TextUtils.isEmpty(this.A09)) {
            if (A0v.equals(this.A0A)) {
                C07270a1 c07270a1 = this.A00;
                EnumC31713DwI enumC31713DwI = EnumC33523Erw.A05.A00;
                String str2 = this.A09;
                RegFlowExtras regFlowExtras = this.A04;
                if (regFlowExtras.A01() != null) {
                    str = regFlowExtras.A01().A00;
                } else {
                    str = "";
                }
                FDE.A00(c07270a1, enumC31713DwI, str2, str);
            } else {
                C35037FcA A06 = C1Q9.A24.A02(this.A00).A06(this.A04.A01(), EnumC33523Erw.A05.A00);
                A06.A04("prototype", this.A09);
                A06.A02();
            }
        }
        Handler handler = this.A0F;
        handler.removeCallbacks(this.A0G);
        C1UC activity = getActivity();
        if (activity instanceof InterfaceC37222GaX) {
            C35788FrQ A0K = AbstractC31176DnK.A0K((InterfaceC37222GaX) activity);
            C07270a1 c07270a12 = this.A00;
            RegFlowExtras regFlowExtras2 = this.A04;
            EnumC33445EqI A01 = regFlowExtras2.A01();
            String str3 = A0K.A09;
            BusinessInfo businessInfo = A0K.A02;
            String A04 = AbstractC1567472a.A04(getActivity());
            CallerContext callerContext = C35786FrO.A00;
            if (A01 != EnumC33445EqI.A04) {
                handler.post(new GRB(handler, this, c07270a12, businessInfo, this, regFlowExtras2, A01, A0v, str3, A04));
                return;
            }
            return;
        }
        AbstractC35794FrW.A02(handler, this, this, this.A00, this, this, this.A04, this.A0E, EnumC33523Erw.A05.A00, A0v, this.A0A, false);
    }

    @Override // X.InterfaceC37201GaC
    public final void DyG() {
        ProgressButton progressButton = this.A07;
        progressButton.getClass();
        progressButton.setShowProgressBar(false);
        this.A02.A01();
    }

    @Override // X.InterfaceC37201GaC
    public final void DyH(String str, Integer num) {
        this.A02.A00();
        ProgressButton progressButton = this.A07;
        progressButton.getClass();
        progressButton.setShowProgressBar(false);
        Eks(str, num);
    }

    @Override // X.InterfaceC37201GaC
    public final void DyI() {
        ProgressButton progressButton = this.A07;
        progressButton.getClass();
        progressButton.setShowProgressBar(true);
        this.A02.A00();
    }

    @Override // X.InterfaceC37201GaC
    public final void DyK(String str, List list) {
        ProgressButton progressButton = this.A07;
        progressButton.getClass();
        progressButton.setEnabled(false);
        this.A07.setShowProgressBar(false);
        this.A02.A00();
        Eks(str, C05F.A01);
        FQY fqy = this.A01;
        fqy.getClass();
        fqy.A00(getRootActivity(), list);
    }

    @Override // X.GY6
    public final void Eks(String str, Integer num) {
        if (isVisible()) {
            if (num == C05F.A01) {
                InlineErrorMessageView inlineErrorMessageView = this.A06;
                inlineErrorMessageView.getClass();
                inlineErrorMessageView.A04(str);
                NotificationBar notificationBar = this.A05;
                notificationBar.getClass();
                notificationBar.A02();
                return;
            }
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
        int A03 = C0f9.A03(-319100878);
        RegFlowExtras regFlowExtras = this.A04;
        if (regFlowExtras.A01() != EnumC33445EqI.A04) {
            C35146Fen.A01(this, EnumC33523Erw.A05, regFlowExtras).A03(this.A00, this.A04);
        }
        C0f9.A0A(-1968384778, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-106624485, C0f9.A03(-731589380));
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!AbstractC31172DnG.A1a(AbstractC31174DnI.A0f(), "has_user_confirmed_dialog")) {
            C07270a1 c07270a1 = this.A00;
            EnumC31713DwI enumC31713DwI = EnumC33523Erw.A05.A00;
            AbstractC34266F9m.A00(this, c07270a1, new C36575GAz(this, 2), this.A04.A01(), enumC31713DwI, null);
            return true;
        }
        if (this.A04.A01() == EnumC33445EqI.A04) {
            C34907FZt.A00 = null;
        } else {
            C34907FZt.A00();
            SearchEditText searchEditText = this.A08;
            searchEditText.getClass();
            AbstractC13880nE.A0J(searchEditText);
        }
        C35159Ff1.A00.A01(this.A00, this.A04.A01(), EnumC33523Erw.A05.A00.A01);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = 1428651264(0x55277d00, float:1.1509707E13)
            int r3 = X.C0f9.A02(r0)
            super.onCreate(r6)
            X.0a1 r0 = X.AbstractC31180DnO.A0L(r5)
            r5.A00 = r0
            android.os.Parcelable r1 = X.AbstractC31180DnO.A04(r5)
            r1.getClass()
            com.instagram.registration.model.RegFlowExtras r1 = (com.instagram.registration.model.RegFlowExtras) r1
            r5.A04 = r1
            X.EqI r0 = X.EnumC33445EqI.A04
            r1.A03(r0)
            java.lang.String r0 = r1.A08
            boolean r0 = X.AbstractC31171DnF.A1X(r0)
            com.instagram.registration.model.RegFlowExtras r1 = r5.A04
            if (r0 == 0) goto Lbc
            X.EqI r0 = X.EnumC33445EqI.A03
        L2c:
            r1.A03(r0)
        L2f:
            android.content.Context r1 = r5.getContext()
            X.0a1 r0 = r5.A00
            X.AbstractC34226F7y.A00(r1, r0)
            com.instagram.registration.model.RegFlowExtras r0 = r5.A04
            java.util.List r1 = X.AbstractC31180DnO.A0s(r0)
            r4 = 0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto La6
            java.lang.Object r0 = r1.get(r4)
            X.FJd r0 = (X.C34517FJd) r0
            java.lang.String r0 = r0.A01
            r5.A0A = r0
            java.lang.Object r0 = r1.get(r4)
            X.FJd r0 = (X.C34517FJd) r0
            java.lang.String r0 = r0.A00
            r5.A09 = r0
        L59:
            X.1vu r2 = X.C41451vu.A01
            java.lang.Class<X.Fvi> r1 = X.C36046Fvi.class
            X.1vz r0 = r5.A0J
            r2.A02(r0, r1)
            X.0Tz r0 = X.C06090Tz.A05
            java.lang.String r1 = X.AbstractC31180DnO.A0f(r0)
            java.lang.String r0 = "UsernameChangeFragment"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L9f
            java.lang.Boolean r0 = X.AbstractC34263F9j.A00()
            boolean r0 = r0.booleanValue()
            r4 = 0
            if (r0 == 0) goto L88
            X.1oB r2 = X.FBE.A00()
            android.content.Context r1 = r5.requireContext()
            X.0a1 r0 = r5.A00
            r2.A00(r1, r0, r4)
        L88:
            java.lang.Boolean r0 = X.AbstractC34264F9k.A00()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9f
            X.1oB r2 = X.FBE.A00()
            android.content.Context r1 = r5.requireContext()
            X.0a1 r0 = r5.A00
            r2.A01(r1, r0, r4)
        L9f:
            r0 = -2054734336(0xffffffff85873e00, float:-1.2718114E-35)
            X.C0f9.A09(r0, r3)
            return
        La6:
            r2 = 0
            r5.A09 = r2
            com.instagram.registration.model.RegFlowExtras r0 = r5.A04
            java.util.List r1 = r0.A0e
            if (r1 == 0) goto Lb9
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lb9
            java.lang.String r2 = X.AbstractC25226BEj.A1I(r1, r4)
        Lb9:
            r5.A0A = r2
            goto L59
        Lbc:
            java.lang.String r0 = r1.A0Q
            boolean r0 = X.AbstractC31171DnF.A1X(r0)
            if (r0 == 0) goto L2f
            com.instagram.registration.model.RegFlowExtras r1 = r5.A04
            X.EqI r0 = X.EnumC33445EqI.A06
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EKG.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1986699127);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.reg_username_change, AbstractC31180DnO.A05(A0A), true);
        AbstractC166997dE.A0T(A0A, R.id.field_title).setText(2131955038);
        AbstractC166997dE.A0T(A0A, R.id.field_detail).setText(2131955037);
        C41451vu c41451vu = C41451vu.A01;
        C36138FxC c36138FxC = new C36138FxC(this);
        this.A0C = c36138FxC;
        c41451vu.A02(c36138FxC, C36048Fvk.class);
        this.A05 = AbstractC31180DnO.A0S(A0A);
        SearchEditText searchEditText = (SearchEditText) A0A.requireViewById(R.id.username);
        this.A08 = searchEditText;
        searchEditText.setOnFocusChangeListener(this.A0I);
        this.A08.setAllowTextSelection(true);
        this.A0B = AbstractC31173DnH.A0I(A0A, R.id.username_valid_icon);
        this.A06 = (InlineErrorMessageView) A0A.findViewById(R.id.username_inline_error);
        ViewGroup A0F = AbstractC31173DnH.A0F(A0A, R.id.username_input_container);
        TimeInterpolator timeInterpolator = InlineErrorMessageView.A09;
        FC5.A00(A0F);
        this.A08.addTextChangedListener(this.A0H);
        this.A08.setFilters(new InputFilter[]{new C33179EkQ(requireContext(), this), new InputFilter.LengthFilter(30)});
        SearchEditText searchEditText2 = this.A08;
        ImageView imageView = this.A0B;
        C07270a1 c07270a1 = this.A00;
        RegFlowExtras regFlowExtras = this.A04;
        EnumC33445EqI A01 = regFlowExtras.A01();
        EnumC31713DwI enumC31713DwI = EnumC33523Erw.A05.A00;
        this.A01 = new FQY(A0A, imageView, c07270a1, regFlowExtras, searchEditText2, A01, enumC31713DwI);
        ProgressButton progressButton = (ProgressButton) A0A.findViewById(R.id.next_button);
        this.A07 = progressButton;
        EVN evn = new EVN(this.A08, this.A00, this, progressButton);
        this.A0E = evn;
        registerLifecycleListener(evn);
        SearchEditText searchEditText3 = this.A08;
        this.A03 = new FQG(getContext(), AbstractC018607g.A00(this), this.A00, this, searchEditText3);
        this.A02 = new C34712FQx(requireContext(), this.A0B);
        this.A0D = new FQF(this.A08, this.A00, this, C05F.A0Y);
        SearchEditText searchEditText4 = this.A08;
        if (searchEditText4 != null && AbstractC13880nE.A10(searchEditText4) && !TextUtils.isEmpty(this.A0A)) {
            FDB.A00(this.A00, this.A04.A01(), enumC31713DwI, this.A0A);
            C07270a1 c07270a12 = this.A00;
            String str = enumC31713DwI.A01;
            EnumC33445EqI A012 = this.A04.A01();
            AbstractC25230BEn.A15(1, c07270a12, str);
            FD6.A00(c07270a12, A012, str).Cht();
            this.A08.setText(this.A0A);
            this.A08.setSelection(this.A0A.length());
            this.A02.A01();
            this.A0F.removeCallbacks(this.A0G);
        }
        this.A0D.A04 = true;
        C35203Ffv.A00.A02(this.A00, this.A04.A01(), enumC31713DwI.A01);
        C0f9.A09(381217659, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-564902981);
        super.onDestroy();
        C41451vu.A01.A03(this.A0J, C36046Fvi.class);
        C0f9.A09(1742374169, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1953684067);
        super.onDestroyView();
        unregisterLifecycleListener(this.A0E);
        C218914p.A06(this);
        this.A08.getClass();
        this.A08.removeTextChangedListener(this.A0H);
        this.A08.setOnEditorActionListener(null);
        this.A08.setOnFocusChangeListener(null);
        this.A05 = null;
        this.A08 = null;
        this.A01 = null;
        this.A0E = null;
        this.A06 = null;
        this.A0B = null;
        this.A07 = null;
        C36138FxC c36138FxC = this.A0C;
        if (c36138FxC != null) {
            C41451vu.A01.A03(c36138FxC, C36048Fvk.class);
            this.A0C = null;
        }
        C0f9.A09(187746683, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1603478791);
        super.onPause();
        AbstractC13880nE.A0O(this.A08);
        NotificationBar notificationBar = this.A05;
        notificationBar.getClass();
        notificationBar.A03();
        this.A0F.removeCallbacksAndMessages(null);
        Window A0H = AbstractC31174DnI.A0H(this);
        A0H.getClass();
        A0H.setSoftInputMode(0);
        C0f9.A09(187606949, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-182810235);
        super.onResume();
        SearchEditText searchEditText = this.A08;
        searchEditText.getClass();
        AbstractC35259Fgt.A06(searchEditText);
        AbstractC31180DnO.A0x(requireActivity());
        C0f9.A09(-875892200, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(267637886);
        super.onStart();
        C0f9.A09(-255878730, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1205676214);
        super.onStop();
        C0f9.A09(661873799, A02);
    }
}
