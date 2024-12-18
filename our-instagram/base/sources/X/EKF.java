package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class EKF extends AbstractC59962oe implements InterfaceC12870lZ, InterfaceC60072op, InterfaceC37221GaW, GY6, GY5, InterfaceC43641zu, GY8 {
    public static final String __redex_internal_original_name = "ContactPointTriageFragment";
    public AutoCompleteTextView A00;
    public AutoCompleteTextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public C07270a1 A05;
    public IgFrameLayout A06;
    public FxSsoViewModel A07;
    public FMB A08;
    public EVG A09;
    public C34617FNa A0A;
    public EVQ A0B;
    public FN0 A0C;
    public FN0 A0D;
    public C34692FQd A0E;
    public FQF A0F;
    public FQF A0G;
    public EVK A0H;
    public CountryCodeData A0I;
    public RegFlowExtras A0J;
    public RegFlowExtras A0K;
    public EVN A0L;
    public EVN A0M;
    public InlineErrorMessageView A0N;
    public InlineErrorMessageView A0O;
    public String A0Q;
    public String A0R;
    public List A0S;
    public boolean A0T;
    public boolean A0V;
    public InterfaceC26681Qx A0X;
    public C57012jc A0Y;
    public NotificationBar A0Z;
    public final WKa A0b = new Em2(this, 8);
    public final WKa A0a = new Em2(this, 9);
    public Integer A0P = C05F.A00;
    public boolean A0W = false;
    public boolean A0U = false;
    public final InterfaceC41501vz A0c = C31650DvG.A00(this, 57);
    public final InterfaceC41501vz A0d = C31650DvG.A00(this, 58);

    private void A00(View view, AutoCompleteTextView autoCompleteTextView, EnumC31713DwI enumC31713DwI) {
        if (!this.A0T) {
            FMB fmb = new FMB(view, autoCompleteTextView, this, this.A05, new C36552GAb(autoCompleteTextView, new G9Q(getActivity()), this, enumC31713DwI), enumC31713DwI);
            this.A08 = fmb;
            fmb.A02.A00(requireContext(), this, this.A05, AbstractC31178DnM.A0L(this), new GAX(fmb, 1));
        }
    }

    public static void A03(EKF ekf) {
        C34692FQd c34692FQd = ekf.A0E;
        if (c34692FQd != null) {
            C35231FgO.A03.A03(ekf.getActivity(), ekf.A05, ekf, ekf.C0Q(), c34692FQd.A00());
            C1ON A00 = AbstractC35079Fcq.A00(ekf.getRootActivity().getApplicationContext(), ekf.A05, ekf.A0E.A00(), ekf.A0Q, ekf.A0R);
            C07270a1 c07270a1 = ekf.A05;
            String A0J = AbstractC13880nE.A0J(ekf.A01);
            EVN evn = ekf.A0M;
            FQV fqv = ekf.A0E.A00;
            fqv.getClass();
            C31456Ds0.A00(A00, new EV1(ekf, c07270a1, ekf, fqv.A04, ekf.A0J, evn, ekf.C0Q(), A0J), ekf, 36);
            ekf.schedule(A00);
        }
    }

    public static void A05(EKF ekf, String str) {
        String str2;
        RegFlowExtras A0B = AbstractC31181DnP.A0B(ekf.A0J);
        AbstractC35090Fd1.A01(ekf.A0J, A0B);
        if (ekf.A0T) {
            str2 = ekf.A0J.A0J;
        } else {
            str2 = null;
        }
        FragmentActivity activity = ekf.getActivity();
        C25621Ms A0N = AbstractC31173DnH.A0N(ekf.A05);
        A0N.A0B("consent/get_signup_config/");
        AbstractC31175DnJ.A0k(activity, A0N, C16030qx.A02);
        A0N.A9s("main_account_selected", "false");
        A0N.A0H("logged_in_user_id", str2);
        C1ON A0S = AbstractC31172DnG.A0S(A0N, ED2.class, FWC.class);
        A0S.A00 = new C39028HGe(A0B, A0B, ekf, str, 1);
        ekf.schedule(A0S);
    }

    @Override // X.InterfaceC37221GaW
    public final void Dbn(boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1.containsKey("caa_registration_redirection_to_native") == false) goto L6;
     */
    @Override // X.InterfaceC60072op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            r12 = this;
            r6 = r12
            androidx.fragment.app.FragmentActivity r0 = r12.requireActivity()
            android.os.Bundle r1 = X.AbstractC31173DnH.A0A(r0)
            if (r1 == 0) goto L14
            java.lang.String r0 = "caa_registration_redirection_to_native"
            boolean r1 = r1.containsKey(r0)
            r0 = 1
            if (r1 != 0) goto L15
        L14:
            r0 = 0
        L15:
            r5 = 1
            if (r0 == 0) goto L1c
            X.AbstractC25227BEk.A1B(r12)
            return r5
        L1c:
            androidx.fragment.app.FragmentActivity r1 = r12.getActivity()
            boolean r0 = r1 instanceof X.InterfaceC37222GaX
            if (r0 == 0) goto L2a
            X.GaX r1 = (X.InterfaceC37222GaX) r1
            X.AbstractC31179DnN.A1T(r1)
            return r5
        L2a:
            boolean r0 = A07(r12)
            if (r0 == 0) goto L65
            android.widget.AutoCompleteTextView r0 = r12.A01
        L32:
            boolean r0 = X.AbstractC13880nE.A10(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L68
            X.0xq r2 = X.AbstractC31174DnI.A0f()
            java.lang.String r0 = "has_user_confirmed_dialog"
            r1 = 0
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto L68
            X.0a1 r7 = r12.A05
            X.DwI r10 = r12.C0Q()
            X.EqI r9 = r12.B75()
            X.GAz r8 = new X.GAz
            r8.<init>(r12, r1)
            boolean r0 = A07(r12)
            if (r0 == 0) goto L62
            java.lang.Integer r11 = X.C05F.A01
        L5e:
            X.AbstractC34266F9m.A00(r6, r7, r8, r9, r10, r11)
            return r5
        L62:
            java.lang.Integer r11 = X.C05F.A00
            goto L5e
        L65:
            android.widget.AutoCompleteTextView r0 = r12.A00
            goto L32
        L68:
            r4 = 0
            X.C34907FZt.A00 = r4
            android.content.Context r0 = r12.getContext()
            X.C35146Fen.A02(r0)
            X.0a1 r3 = r12.A05
            X.DwI r0 = r12.C0Q()
            java.lang.String r2 = r0.A01
            X.EqI r1 = r12.B75()
            boolean r0 = A07(r12)
            if (r0 == 0) goto L97
            java.lang.Integer r0 = X.C05F.A01
        L86:
            X.AbstractC25230BEn.A15(r5, r3, r2)
            X.C35159Ff1.A00(r3, r1, r4, r0, r2)
            X.FgO r1 = X.C35231FgO.A03
            android.content.Context r0 = r12.getContext()
            r1.A05(r0)
            r5 = 0
            return r5
        L97:
            java.lang.Integer r0 = X.C05F.A00
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EKF.onBackPressed():boolean");
    }

    private void A01(EnumC33319EoE enumC33319EoE) {
        AutoCompleteTextView autoCompleteTextView;
        String str;
        Context context;
        C08790ch A00;
        java.util.Set keySet;
        String str2;
        C07270a1 c07270a1;
        boolean z;
        C1P1 c32543EUt;
        HashMap hashMap;
        List list;
        FMB fmb;
        boolean compare;
        EnumC33319EoE enumC33319EoE2 = EnumC33319EoE.A01;
        if (enumC33319EoE == enumC33319EoE2) {
            autoCompleteTextView = this.A00;
        } else {
            autoCompleteTextView = this.A01;
        }
        String A0J = AbstractC13880nE.A0J(autoCompleteTextView);
        if (!this.A0T && (fmb = this.A08) != null) {
            for (InterfaceC37225Gaa interfaceC37225Gaa : fmb.A02.A02) {
                if (enumC33319EoE instanceof EgS) {
                    compare = A0J.equalsIgnoreCase(interfaceC37225Gaa.B1C());
                } else {
                    compare = PhoneNumberUtils.compare(A0J, interfaceC37225Gaa.Bck());
                }
                if (compare) {
                    if (enumC33319EoE == enumC33319EoE2) {
                        C07270a1 c07270a12 = this.A05;
                        G9Q g9q = new G9Q(getActivity());
                        C36554GAd c36554GAd = new C36554GAd(interfaceC37225Gaa, this);
                        int i = 2131956666;
                        if (interfaceC37225Gaa instanceof EgO) {
                            i = 2131956665;
                        } else if (interfaceC37225Gaa instanceof EgP) {
                            i = 2131956664;
                        }
                        EnumC31713DwI enumC31713DwI = EnumC31713DwI.A0d;
                        Resources A0N = AbstractC166997dE.A0N(this);
                        C193328hC A0c = AbstractC31176DnK.A0c(this);
                        A0c.A0s(true);
                        A0c.A0t(true);
                        String A0w = AbstractC31174DnI.A0w(this, interfaceC37225Gaa.getUsername(), 2131956668);
                        String string = A0N.getString(i);
                        ImageUrl BGs = interfaceC37225Gaa.BGs();
                        if (BGs != null) {
                            A0c.A0o(BGs, this);
                            String A0w2 = AbstractC31174DnI.A0w(this, interfaceC37225Gaa.getUsername(), 2131956667);
                            DialogInterfaceOnClickListenerC35449Fk6 dialogInterfaceOnClickListenerC35449Fk6 = new DialogInterfaceOnClickListenerC35449Fk6(1, this, c07270a12, g9q, interfaceC37225Gaa, c36554GAd, c36554GAd, enumC31713DwI);
                            if (A0w2 != null) {
                                A0c.A0d(dialogInterfaceOnClickListenerC35449Fk6, A0w2);
                                String string2 = A0N.getString(2131973814);
                                DialogInterfaceOnClickListenerC35454FkB A002 = DialogInterfaceOnClickListenerC35454FkB.A00(c36554GAd, 15);
                                if (string2 != null) {
                                    A0c.A0c(A002, string2);
                                    A0c.A05 = A0w;
                                    A0c.A0r(string);
                                    AbstractC166987dD.A1W(A0c);
                                    C19280xC A003 = C35230FgN.A00(this, C1Q9.A1b);
                                    A003.A0C("autocomplete_account_type", interfaceC37225Gaa.AY9());
                                    AbstractC31173DnH.A1S(A003, this.A05);
                                    return;
                                }
                                throw AbstractC166997dE.A0g();
                            }
                            throw AbstractC166997dE.A0g();
                        }
                        throw AbstractC166997dE.A0g();
                    }
                    A03(this);
                    return;
                }
            }
        }
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        if (!this.A0T) {
            FMB fmb2 = this.A08;
            if (fmb2 != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : fmb2.A02.A02) {
                    if (obj instanceof EgN) {
                        A1E.add(obj);
                    }
                }
                Iterator it = A1E.iterator();
                while (it.hasNext()) {
                    EgN egN = (EgN) it.next();
                    C83803oP c83803oP = egN.A00;
                    A1G.put(c83803oP.A05, egN);
                    A1G2.put(c83803oP.A06, c83803oP.A05);
                }
            }
            str = C36007Fv5.A00().A02(this.A05, "ig_android_growth_FX_access_fbig_verify_email", __redex_internal_original_name);
        } else {
            str = null;
        }
        int i2 = FE8.A00[enumC33319EoE.ordinal()];
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                context = getContext();
                A00 = AbstractC018607g.A00(this);
                C34692FQd c34692FQd = this.A0E;
                if (c34692FQd == null) {
                    A0J = "";
                } else {
                    A0J = c34692FQd.A00();
                }
                keySet = null;
                hashMap = AbstractC166987dD.A1G();
                str2 = this.A0Q;
                c07270a1 = this.A05;
                boolean z2 = this.A0V;
                List list2 = this.A0S;
                c32543EUt = new C32539EUp(this, 26);
                z = z2;
                list = list2;
            } else {
                context = getContext();
                A00 = AbstractC018607g.A00(this);
                keySet = A1G.keySet();
                str2 = this.A0Q;
                c07270a1 = this.A05;
                z = false;
                List list3 = this.A0S;
                c32543EUt = new C32543EUt(this, c07270a1, this, this, this.A0J, this.A0L, A0J, A0J);
                hashMap = A1G2;
                list = list3;
            }
            enumC33319EoE.A00(context, A00, c32543EUt, c07270a1, A0J, str2, str, list, hashMap, keySet, z);
        } catch (JSONException unused) {
            C0w9.A03(__redex_internal_original_name, "Error creating the uid:nonce map");
        }
    }

    public static void A02(EKF ekf) {
        C1R0 C98 = ekf.A0X.C98();
        if (C98.A0C.contains("ig_sign_up_screen_banner")) {
            String str = C98.A06;
            if (str == null) {
                str = ekf.getString(2131977206);
            }
            ekf.A0Y.A03(0);
            ((TextView) ekf.A0Y.A01()).setText(AbstractC166997dE.A0r(AbstractC166997dE.A0N(ekf), str, 2131977216));
            return;
        }
        ekf.A0Y.A02();
    }

    private boolean A06() {
        if (this.A0T || (AbstractC31176DnK.A0k(this.A07.A04) != null && AbstractC166987dD.A1a(AbstractC31176DnK.A0k(this.A07.A04)))) {
            return false;
        }
        if (AbstractC31176DnK.A0k(this.A07.A02) != null && ((List) AbstractC31176DnK.A0k(this.A07.A02)).size() > 0) {
            return false;
        }
        if (AbstractC13670mt.A0B((CharSequence) AbstractC31176DnK.A0k(this.A07.A01)) && AbstractC13670mt.A0B((CharSequence) AbstractC31176DnK.A0k(this.A07.A00))) {
            return false;
        }
        return true;
    }

    public static boolean A07(EKF ekf) {
        EVK evk = ekf.A0H;
        if (evk != null && evk.A01 == C05F.A00) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37221GaW
    public final void APP() {
        ImageView imageView;
        EVK evk = this.A0H;
        evk.A03.setEnabled(false);
        evk.A04.setEnabled(false);
        if (A07(this)) {
            C34692FQd c34692FQd = this.A0E;
            c34692FQd.A07.setEnabled(false);
            c34692FQd.A05.setEnabled(false);
            imageView = c34692FQd.A06;
        } else {
            C34617FNa c34617FNa = this.A0A;
            c34617FNa.A04.setEnabled(false);
            imageView = c34617FNa.A05;
            imageView.setEnabled(false);
        }
        imageView.setVisibility(4);
    }

    @Override // X.InterfaceC37221GaW
    public final void ARU() {
        AutoCompleteTextView autoCompleteTextView;
        ImageView imageView;
        EVK evk = this.A0H;
        evk.A03.setEnabled(true);
        evk.A04.setEnabled(true);
        if (A07(this)) {
            C34692FQd c34692FQd = this.A0E;
            c34692FQd.A07.setEnabled(true);
            autoCompleteTextView = c34692FQd.A05;
            autoCompleteTextView.setEnabled(true);
            imageView = c34692FQd.A06;
        } else {
            C34617FNa c34617FNa = this.A0A;
            autoCompleteTextView = c34617FNa.A04;
            autoCompleteTextView.setEnabled(true);
            imageView = c34617FNa.A05;
            imageView.setEnabled(true);
        }
        int i = 0;
        if (AbstractC13880nE.A10(autoCompleteTextView)) {
            i = 4;
        }
        imageView.setVisibility(i);
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        if (this.A0T) {
            return EnumC33445EqI.A07;
        }
        if (A07(this)) {
            return EnumC33445EqI.A06;
        }
        return EnumC33445EqI.A03;
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        if (this.A0T) {
            return EnumC31713DwI.A1M;
        }
        if (A07(this)) {
            return EnumC31713DwI.A1F;
        }
        return EnumC31713DwI.A0d;
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        EnumC33445EqI enumC33445EqI;
        Integer num;
        String str;
        C35231FgO c35231FgO = C35231FgO.A03;
        boolean A07 = A07(this);
        boolean z = !A07;
        if (A07) {
            enumC33445EqI = EnumC33445EqI.A06;
            num = C05F.A01;
        } else if (z) {
            enumC33445EqI = EnumC33445EqI.A03;
            num = C05F.A00;
        } else {
            enumC33445EqI = EnumC33445EqI.A05;
            num = C05F.A0u;
        }
        if (this.A0T) {
            this.A0J.A0V = AbstractC34293FAn.A00(num);
        } else {
            this.A0J.A03(enumC33445EqI);
        }
        if (A07) {
            this.A0O.A03();
            EnumC33319EoE enumC33319EoE = EnumC33319EoE.A02;
            if (this.A0E.A03 && !AbstractC13880nE.A10(this.A01)) {
                C18920wW A02 = AbstractC12220kQ.A02(this.A05);
                double A01 = AbstractC31171DnF.A01();
                double A00 = AbstractC31171DnF.A00();
                String str2 = B75().A00;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A02, "phone_prefill_accepted");
                if (A0f.isSampled()) {
                    A0f.A7v("accepted", Boolean.valueOf(AbstractC167007dF.A0g(this.A01).equals(this.A0E.A02)));
                    AbstractC31177DnL.A1B(A0f, A01, A00);
                    AbstractC31171DnF.A19(A0f, str2);
                    AbstractC31178DnM.A19(A0f, C0Q().A01);
                    AbstractC31172DnG.A1N(A0f);
                    AbstractC31176DnK.A1K(A0f, A01);
                    AbstractC31176DnK.A1J(A0f, A00);
                    AbstractC31178DnM.A13(A0f);
                    if (AbstractC31174DnI.A06(this.A05) > 1) {
                        str = "mas";
                    } else {
                        str = null;
                    }
                    AbstractC31175DnJ.A16(A0f, str);
                }
            }
            A01(enumC33319EoE);
            return;
        }
        this.A0N.A03();
        EnumC33319EoE enumC33319EoE2 = EnumC33319EoE.A01;
        if (this.A0A.A02 && !AbstractC13880nE.A10(this.A00)) {
            C18920wW A022 = AbstractC12220kQ.A02(this.A05);
            long currentTimeMillis = System.currentTimeMillis();
            double A002 = AbstractC31171DnF.A00();
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(A022, "email_prefill_accepted");
            A0f2.A7v("accepted", Boolean.valueOf(this.A0A.A01.equals(AbstractC167007dF.A0g(this.A00))));
            AbstractC31175DnJ.A10(A0f2, currentTimeMillis);
            AbstractC31177DnL.A1B(A0f2, currentTimeMillis, A002);
            AbstractC31177DnL.A1G(A0f2, "flow", B75().A00, A002);
            AbstractC31178DnM.A19(A0f2, C0Q().A01);
            AbstractC31171DnF.A1D(A0f2, "email_or_phone");
            AbstractC31178DnM.A13(A0f2);
            A0f2.Cht();
        }
        A01(enumC33319EoE2);
        c35231FgO.A05(getContext());
    }

    @Override // X.GY5
    public final void Dhw(Context context, String str, String str2) {
        C35231FgO.A01(context, this.A05, str2, str, false);
    }

    @Override // X.GY8
    public final void ESF(CountryCodeData countryCodeData) {
        this.A0I = countryCodeData;
        C34692FQd c34692FQd = this.A0E;
        FQV fqv = c34692FQd.A00;
        fqv.getClass();
        CountryCodeData countryCodeData2 = fqv.A04;
        if (countryCodeData2 != null) {
            String str = countryCodeData2.A00;
            String str2 = countryCodeData2.A01;
            String str3 = countryCodeData.A00;
            String str4 = countryCodeData.A01;
            AbstractC12990ll abstractC12990ll = c34692FQd.A09;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "country_code_change");
            if (A0f.isSampled()) {
                double A01 = AbstractC31171DnF.A01();
                double A00 = AbstractC31171DnF.A00();
                AbstractC31177DnL.A1B(A0f, A01, A00);
                AbstractC31172DnG.A1O(A0f);
                AbstractC31179DnN.A1A(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, c34692FQd.A0A.A01, A00);
                A0f.AAP("to_code", str4);
                AbstractC31171DnF.A19(A0f, "phone");
                A0f.AAP("from_country", str);
                A0f.AAP("from_code", str2);
                A0f.AAP("to_country", str3);
                AbstractC31176DnK.A1K(A0f, A01);
                AbstractC35274Fh9.A08(A0f, abstractC12990ll);
            }
        }
        c34692FQd.A00.A04 = countryCodeData;
        TextView textView = c34692FQd.A07;
        textView.setText(countryCodeData.A02());
        textView.setContentDescription(countryCodeData.A02);
        c34692FQd.A00.A01();
    }

    @Override // X.GY6
    public final void Eks(String str, Integer num) {
        InlineErrorMessageView inlineErrorMessageView;
        if (this.A0W) {
            this.A0W = false;
            AbstractC35090Fd1.A00(this, this.A05, this.A0K, str);
            return;
        }
        if (num == C05F.A0N) {
            inlineErrorMessageView = this.A0N;
        } else if (num == C05F.A0Y) {
            inlineErrorMessageView = this.A0O;
        } else {
            AbstractC35259Fgt.A08(this.A0Z, str);
            return;
        }
        inlineErrorMessageView.A04(str);
        this.A0Z.A02();
    }

    @Override // X.InterfaceC43641zu
    public final void onTokenChange() {
        C11T.A02(new RunnableC36849GLw(this));
    }

    public static void A04(EKF ekf, RegFlowExtras regFlowExtras, String str) {
        C1ON A01 = AbstractC35079Fcq.A01(ekf.getContext(), ekf.A05, str, C36007Fv5.A00().A02(ekf.A05, "ig_android_growth_FX_access_fbig_verify_email", __redex_internal_original_name), AbstractC31172DnG.A0P(ekf.A05).A02(C19T.A1X), ekf.A0S);
        A01.A00 = new C32531EUh(ekf, regFlowExtras, str, 9);
        ekf.schedule(A01);
    }

    @Override // X.InterfaceC37221GaW
    public final boolean CbE() {
        AutoCompleteTextView autoCompleteTextView;
        if (A07(this)) {
            autoCompleteTextView = this.A01;
        } else {
            autoCompleteTextView = this.A00;
        }
        return !AbstractC31179DnN.A1a(autoCompleteTextView);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "email_or_phone";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A05;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(2114860104);
        RegFlowExtras regFlowExtras = this.A0J;
        regFlowExtras.A08 = AbstractC13880nE.A0J(this.A00);
        regFlowExtras.A0R = AbstractC13880nE.A0J(this.A01);
        FQV fqv = this.A0E.A00;
        fqv.getClass();
        regFlowExtras.A01 = fqv.A04;
        regFlowExtras.A03(B75());
        regFlowExtras.A0N = C0Q().name();
        C35146Fen.A00(getContext()).A03(this.A05, this.A0J);
        C0f9.A0A(2055517912, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1465114895, C0f9.A03(-1438490763));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EKF.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0413, code lost:
    
        if (r1.containsKey("caa_registration_redirection_to_native") == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03ea  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r41, android.view.ViewGroup r42, android.os.Bundle r43) {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EKF.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(30449988);
        super.onDestroy();
        this.A0I = null;
        C0f9.A09(1622570584, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1720614173);
        super.onDestroyView();
        this.A01.removeTextChangedListener(this.A0b);
        this.A00.removeTextChangedListener(this.A0a);
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        this.A0Z = null;
        this.A0N = null;
        this.A0O = null;
        this.A0Y = null;
        this.A02 = null;
        this.A0P = this.A0H.A01;
        FQV fqv = this.A0E.A00;
        fqv.getClass();
        this.A0I = fqv.A04;
        unregisterLifecycleListener(this.A0L);
        unregisterLifecycleListener(this.A0M);
        unregisterLifecycleListener(this.A0H);
        C218914p.A06(this);
        this.A08 = null;
        this.A0L = null;
        this.A0M = null;
        this.A0A = null;
        this.A0E = null;
        this.A0H = null;
        this.A0D = null;
        this.A0C = null;
        EVG evg = this.A09;
        if (evg != null) {
            unregisterLifecycleListener(evg);
            this.A09 = null;
        }
        if (A06()) {
            C41451vu c41451vu = C41451vu.A01;
            c41451vu.A03(this.A0c, C36036FvY.class);
            c41451vu.A03(this.A0d, C36037FvZ.class);
        }
        C0f9.A09(760239670, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(87679452);
        super.onPause();
        AbstractC31174DnI.A0H(this).setSoftInputMode(0);
        C0f9.A09(17256810, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1334507447);
        super.onResume();
        AbstractC31180DnO.A1B(this);
        C0f9.A09(-2007473635, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        CountryCodeData countryCodeData = this.A0I;
        if (countryCodeData != null) {
            bundle.putString("SAVED_STATE_COUNTRY_CODE", countryCodeData.A01);
            bundle.putString("SAVED_STATE_COUNTRY_DISPLAY_STRING", this.A0I.A02);
            bundle.putString("SAVED_STATE_COUNTRY", this.A0I.A00);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(349025558);
        super.onStart();
        C35231FgO.A03.A05(getActivity());
        FN0 fn0 = this.A0D;
        if (fn0 != null) {
            fn0.A00.Dnr(getActivity());
        }
        FN0 fn02 = this.A0C;
        if (fn02 != null) {
            fn02.A00.Dnr(getActivity());
        }
        this.A0X.AAd(this);
        C0f9.A09(-1098225434, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-878396686);
        super.onStop();
        FN0 fn0 = this.A0D;
        if (fn0 != null) {
            fn0.A00.onStop();
        }
        FN0 fn02 = this.A0C;
        if (fn02 != null) {
            fn02.A00.onStop();
        }
        this.A0X.EGT(this);
        C0f9.A09(1284081149, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        super.onViewCreated(view, bundle);
        C07270a1 c07270a1 = this.A05;
        String str = C0Q().A01;
        EnumC33445EqI B75 = B75();
        if (A07(this)) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        AbstractC167017dG.A1N(c07270a1, str);
        C35203Ffv.A00(c07270a1, null, B75, num, str, null);
        if (A06()) {
            C41451vu.A01.A02(this.A0c, C36036FvY.class);
        }
        C41451vu.A01.A02(this.A0d, C36037FvZ.class);
    }
}
