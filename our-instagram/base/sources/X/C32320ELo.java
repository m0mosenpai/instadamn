package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.ArrayList;
import java.util.EnumSet;

/* renamed from: X.ELo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32320ELo extends AbstractC59962oe implements InterfaceC60072op, InterfaceC37212GaN, InterfaceC60122ou, GY5, C53U, GY8 {
    public static final EnumSet A0L = EnumSet.of(EnumC33365Eoy.A04, EnumC33365Eoy.A02);
    public static final String __redex_internal_original_name = "PhoneNumberEntryFragment";
    public View A00;
    public TextView A01;
    public UserSession A02;
    public IgTextView A03;
    public IgdsSwitch A04;
    public EnumC33365Eoy A05;
    public C35016Fbp A06;
    public EditPhoneNumberView A07;
    public ProgressButton A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public AbstractC018607g A0D;
    public ActionButton A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0C = false;
    public final Handler A0H = new Handler();
    public final C1P1 A0J = EV0.A00(this, 33);
    public final C1P1 A0I = EV0.A00(this, 34);
    public final Runnable A0K = new RunnableC36838GLl(this);

    @Override // X.InterfaceC37212GaN
    public final void CxI() {
    }

    @Override // X.InterfaceC37212GaN
    public final boolean DCu(int i) {
        if (i == 2) {
            if (this.A0E.isEnabled()) {
                A02(this);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37212GaN
    public final void DYO() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "phone_number_entry";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r3.A07.getPhoneNumber().equalsIgnoreCase(r3.A09) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00() {
        /*
            r3 = this;
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L32
            com.instagram.actionbar.ActionButton r0 = r3.A0E
            if (r0 == 0) goto L32
            boolean r0 = r3.A0B
            if (r0 == 0) goto L1b
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r3.A07
            java.lang.String r1 = r0.getPhoneNumber()
            java.lang.String r0 = r3.A09
            boolean r0 = r1.equalsIgnoreCase(r0)
            r2 = 1
            if (r0 != 0) goto L1c
        L1b:
            r2 = 0
        L1c:
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r3.A08
            if (r1 == 0) goto L25
            r0 = r2 ^ 1
            r1.setEnabled(r0)
        L25:
            android.view.View r0 = r3.A00
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L32
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r3.A04
            r0.setEnabled(r2)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32320ELo.A00():void");
    }

    public static void A01(C35002FbZ c35002FbZ, C32320ELo c32320ELo, boolean z) {
        EnumC33365Eoy enumC33365Eoy;
        boolean A1X = AbstractC167007dF.A1X(c32320ELo.A05, EnumC33365Eoy.A07);
        boolean z2 = !A1X;
        String phoneNumber = c32320ELo.A07.getPhoneNumber();
        String countryCodeWithoutPlus = c32320ELo.A07.A04.getCountryCodeWithoutPlus();
        String A0g = AbstractC167007dF.A0g(c32320ELo.A07.A01);
        Bundle A00 = C35002FbZ.A00(c35002FbZ);
        AbstractC31181DnP.A0R(A00, countryCodeWithoutPlus, A0g, phoneNumber, false);
        if (A1X) {
            enumC33365Eoy = EnumC33365Eoy.A07;
        } else {
            enumC33365Eoy = EnumC33365Eoy.A04;
        }
        AbstractC34231F8d.A00(A00, enumC33365Eoy);
        A00.putBoolean("HAS_SMS_CONSENT", z2);
        A00.putBoolean("AUTO_CONFIRM_SMS", z);
        C140966Yy A0N = AbstractC31177DnL.A0N(c32320ELo.requireActivity(), c32320ELo.A02);
        A0N.A0B(A00, new C32271EJg());
        A0N.A0F(c32320ELo, 0);
        A0N.A0G = true;
        A0N.A07();
    }

    public static void A02(C32320ELo c32320ELo) {
        C1ON A02;
        C1P1 c1p1;
        String str;
        if (A0L.contains(c32320ELo.A05)) {
            if (TextUtils.isEmpty(AbstractC167007dF.A0g(c32320ELo.A07.A01))) {
                AbstractC25226BEj.A1Q(c32320ELo);
                C25671My A00 = AbstractC25651Mw.A00(c32320ELo.A02);
                UserSession userSession = c32320ELo.A02;
                if (userSession == null) {
                    str = null;
                } else {
                    str = userSession.userId;
                }
                A00.E4s(new C36102Fwc(str, ""));
                return;
            }
            c32320ELo.A06.A02("contact_point", "add_contact_point");
            C35231FgO.A03.A03(c32320ELo.getActivity(), c32320ELo.A02, c32320ELo, EnumC31713DwI.A1E, c32320ELo.A07.getPhoneNumber());
            String phoneNumber = c32320ELo.A07.getPhoneNumber();
            A02 = AbstractC152476ta.A02(c32320ELo.getRootActivity().getApplicationContext(), c32320ELo.A02, C05F.A0C, phoneNumber);
            c1p1 = c32320ELo.A0I;
        } else {
            if (c32320ELo.A05 != EnumC33365Eoy.A07) {
                return;
            }
            if (TextUtils.isEmpty(c32320ELo.A07.getPhoneNumber())) {
                C9GR.A03(c32320ELo.getActivity(), c32320ELo.getString(2131969574), null, 0);
                return;
            } else {
                A02 = AbstractC35177FfU.A02(c32320ELo.getContext(), c32320ELo.A02, c32320ELo.A07.getPhoneNumber());
                c1p1 = c32320ELo.A0J;
            }
        }
        A02.A00 = c1p1;
        c32320ELo.schedule(A02);
    }

    @Override // X.C53U
    public final boolean CK6() {
        String str;
        EnumC33365Eoy enumC33365Eoy = this.A05;
        EnumC33365Eoy enumC33365Eoy2 = EnumC33365Eoy.A07;
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        if (enumC33365Eoy == enumC33365Eoy2) {
            abstractC10360h2.A0x(null, 1);
            AbstractC31172DnG.A1A();
            Bundle A05 = AbstractC31178DnM.A05(this.A02);
            C33228ElK c33228ElK = new C33228ElK();
            AbstractC31177DnL.A15(c33228ElK, AbstractC31173DnH.A0J(A05, c33228ElK, this), this.A02);
            return true;
        }
        abstractC10360h2.A0x(AbstractC111324zv.A00(88), 1);
        C25671My A00 = AbstractC25651Mw.A00(this.A02);
        UserSession userSession = this.A02;
        if (userSession == null) {
            str = null;
        } else {
            str = userSession.userId;
        }
        A00.E4s(new C36102Fwc(str, this.A0A));
        return true;
    }

    @Override // X.GY5
    public final void Dhw(Context context, String str, String str2) {
        AbstractC018607g abstractC018607g = this.A0D;
        C1ON A05 = AbstractC152476ta.A05(this.A02, str2, str, true);
        A05.A00 = new EUL(str2, str);
        C1GJ.A00(context, abstractC018607g, A05);
    }

    @Override // X.InterfaceC37212GaN
    public final void Dx4() {
        if (this.A0G) {
            AbstractC31178DnM.A0v(this);
        }
    }

    @Override // X.GY8
    public final void ESF(CountryCodeData countryCodeData) {
        this.A07.setCountryCodeWithCountryPrefix(countryCodeData);
    }

    @Override // X.InterfaceC37212GaN
    public final void DyV() {
        A00();
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnResume() {
        super.afterOnResume();
        if ("personal_information".equals(this.A0F)) {
            AbstractC32533EUj.A00(getParentFragmentManager(), this, AbstractC35177FfU.A01(getContext(), this.A02), 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r3.A07.getPhoneNumber().equalsIgnoreCase(r3.A09) == false) goto L6;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r4) {
        /*
            r3 = this;
            r2 = 2131969565(0x7f13461d, float:1.9576056E38)
            r1 = 31
            X.FpC r0 = new X.FpC
            r0.<init>(r3, r1)
            com.instagram.actionbar.ActionButton r2 = r4.Ehi(r0, r2)
            r3.A0E = r2
            boolean r0 = r3.A0B
            if (r0 == 0) goto L24
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r3.A07
            java.lang.String r1 = r0.getPhoneNumber()
            java.lang.String r0 = r3.A09
            boolean r1 = r1.equalsIgnoreCase(r0)
            r0 = 8
            if (r1 != 0) goto L25
        L24:
            r0 = 0
        L25:
            r2.setVisibility(r0)
            r3.A00()
            r0 = 1
            r3.A0G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32320ELo.configureActionBar(X.2iU):void");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1196399909);
        super.onCreate(bundle);
        this.A05 = EnumC33365Eoy.values()[requireArguments().getInt("flow_key")];
        this.A02 = AbstractC31176DnK.A0S(this);
        this.A0F = requireArguments().getString("ENTRYPOINT");
        this.A06 = new C35016Fbp(this.A02);
        C0f9.A09(-596575268, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC33622EtY abstractC33622EtY;
        int A02 = C0f9.A02(2112595722);
        View inflate = layoutInflater.inflate(R.layout.fragment_phone_number_entry_new, viewGroup, false);
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.phone_view_next_button);
        this.A08 = progressButton;
        ViewOnClickListenerC35677FpC.A00(progressButton, 30, this);
        this.A07 = (EditPhoneNumberView) inflate.requireViewById(R.id.phone_number_view);
        this.A01 = AbstractC166987dD.A0e(inflate, R.id.two_fac_phone_number_info_view);
        this.A00 = inflate.requireViewById(R.id.phone_number_confirmed_toggle_row);
        this.A03 = AbstractC31172DnG.A0X(inflate, R.id.phone_number_confirmed_secondary_text);
        this.A04 = (IgdsSwitch) inflate.requireViewById(R.id.phone_number_confirmed_toggle_switch);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString(PaymentDetailChangeTypes$Companion.PHONE_NUMBER);
            this.A09 = string;
            if (!TextUtils.isEmpty(string)) {
                this.A07.setupEditPhoneNumberView(AnonymousClass780.A01(getContext(), this.mArguments.getString("COUNTRY_CODE")), this.mArguments.getString("NATIONAL_NUMBER"));
            } else {
                Integer num = C05F.A0N;
                FragmentActivity activity = getActivity();
                UserSession userSession = this.A02;
                EnumC31713DwI enumC31713DwI = EnumC31713DwI.A1E;
                AbstractC167027dH.A13(activity, userSession, enumC31713DwI);
                ArrayList A04 = C35270Fh5.A04(activity, userSession, enumC31713DwI, C35270Fh5.A05(num));
                if (!A04.isEmpty() && (abstractC33622EtY = (AbstractC33622EtY) A04.get(0)) != null) {
                    try {
                        AnonymousClass793 A0F = PhoneNumberUtil.A01(getActivity()).A0F(abstractC33622EtY.A02, AnonymousClass780.A00(getActivity()).A00);
                        String A06 = AbstractC13670mt.A06("%d", Long.valueOf(A0F.A02));
                        EditPhoneNumberView editPhoneNumberView = this.A07;
                        Context context = getContext();
                        int i = A0F.A00;
                        C14360o3.A0B(context, 0);
                        String A01 = PhoneNumberUtil.A01(context).A00.A01(i);
                        C14360o3.A07(A01);
                        editPhoneNumberView.setupEditPhoneNumberView(new CountryCodeData(i, A01), A06);
                    } catch (C40f unused) {
                    }
                }
            }
            this.A0B = this.mArguments.getBoolean("IS_PHONE_CONFIRMED");
        }
        EditPhoneNumberView.A01(this, null, this.A02, this.A05, null, this, this.A07);
        this.A07.requestFocus();
        if (A0L.contains(this.A05)) {
            AbstractC166997dE.A0T(inflate, R.id.instructions_view).setText(2131974266);
        }
        this.A0D = AbstractC018607g.A00(this);
        this.A06.A00.markerEnd(857808781, (short) 2);
        C0f9.A09(-1828716266, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1321708138);
        super.onDestroy();
        C35231FgO.A03.A05(getContext());
        C0f9.A09(-894334433, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(583932428);
        super.onDestroyView();
        this.A07 = null;
        this.A08 = null;
        this.A04 = null;
        this.A00 = null;
        this.A03 = null;
        C0f9.A09(1318306072, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-451001097);
        super.onPause();
        this.A0H.removeCallbacks(this.A0K);
        C0f9.A09(-1404588560, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1659353686);
        super.onResume();
        if (AbstractC31172DnG.A1X(requireArguments(), "push_to_next")) {
            this.A0H.post(this.A0K);
        } else {
            EditPhoneNumberView editPhoneNumberView = this.A07;
            editPhoneNumberView.A01.postDelayed(editPhoneNumberView.A0A, 200L);
        }
        C0f9.A09(-1567584986, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1384329771);
        super.onStart();
        EnumC33365Eoy enumC33365Eoy = this.A05;
        if (enumC33365Eoy == EnumC33365Eoy.A04 || enumC33365Eoy == EnumC33365Eoy.A07) {
            AbstractC31179DnN.A1K(this, 8);
            C35231FgO.A03.A05(getContext());
        }
        C0f9.A09(-647072891, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1481032813);
        EnumC33365Eoy enumC33365Eoy = this.A05;
        if (enumC33365Eoy == EnumC33365Eoy.A04 || enumC33365Eoy == EnumC33365Eoy.A07) {
            AbstractC31179DnN.A1K(this, 0);
        }
        AbstractC31171DnF.A16(this);
        AbstractC31174DnI.A0H(this).setSoftInputMode(3);
        super.onStop();
        C0f9.A09(-526455746, A02);
    }
}
