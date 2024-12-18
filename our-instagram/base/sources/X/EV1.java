package X;

import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.registration.model.RegFlowExtras;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class EV1 extends C1P1 implements GY6 {
    public RegFlowExtras A00;
    public final AbstractC12990ll A01;
    public final EnumC31713DwI A02;
    public final AbstractC59962oe A03;
    public final GY6 A04;
    public final CountryCodeData A05;
    public final RegFlowExtras A06;
    public final EVN A07;
    public final String A08;

    public final void A00(EgM egM) {
        int A03;
        String str;
        String str2;
        int i;
        C140966Yy A0C;
        Bundle A0b;
        Fragment abstractC32319ELj;
        if (this instanceof Egg) {
            A03 = C0f9.A03(-522206666);
            EKE.A00(((Egg) this).A00);
            i = 834228009;
        } else {
            A03 = C0f9.A03(2117932095);
            boolean A1X = AbstractC31171DnF.A1X(egM.A02);
            CountryCodeData countryCodeData = this.A05;
            if (countryCodeData != null) {
                String A00 = countryCodeData.A00();
                str2 = this.A08;
                str = AbstractC35259Fgt.A00(A00, str2);
            } else {
                str = this.A08;
                str2 = str;
            }
            RegFlowExtras regFlowExtras = new RegFlowExtras();
            regFlowExtras.A0n = egM.A05;
            regFlowExtras.A0X = egM.A01;
            regFlowExtras.A0C = egM.A00;
            regFlowExtras.A0g = egM.A04;
            RegFlowExtras regFlowExtras2 = this.A06;
            if (regFlowExtras2 != null) {
                regFlowExtras.A0Z = regFlowExtras2.A0Z;
                regFlowExtras.A0P = regFlowExtras2.A0P;
                EnumC33445EqI A01 = regFlowExtras2.A01();
                A01.getClass();
                regFlowExtras.A03(A01);
                Integer A02 = regFlowExtras2.A02();
                if (A02 != null) {
                    regFlowExtras.A0V = AbstractC34293FAn.A00(A02);
                }
                regFlowExtras.A03 = regFlowExtras2.A03;
                regFlowExtras.A04 = regFlowExtras2.A04;
                regFlowExtras.A0w = regFlowExtras2.A0w;
                regFlowExtras.A06 = regFlowExtras2.A06;
                regFlowExtras.A07 = regFlowExtras2.A07;
                if (EnumC33445EqI.A07 == regFlowExtras2.A01()) {
                    regFlowExtras.A0g = regFlowExtras2.A0g;
                    regFlowExtras.A0J = regFlowExtras2.A0J;
                    regFlowExtras.A0M = regFlowExtras2.A0M;
                    regFlowExtras.A0u = regFlowExtras2.A0u;
                }
            }
            regFlowExtras.A0q = true;
            if (A1X) {
                regFlowExtras.A05 = egM.A02;
                regFlowExtras.A0Q = str;
                C35231FgO.A03.A05(this.A03.getContext());
            }
            regFlowExtras2.getClass();
            AbstractC35090Fd1.A01(regFlowExtras2, regFlowExtras);
            if (A1X) {
                long currentTimeMillis = System.currentTimeMillis();
                long A002 = C1Q9.A00();
                AbstractC12990ll abstractC12990ll = this.A01;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "phone_number_auto_confirmed");
                if (A0f.isSampled()) {
                    AbstractC31178DnM.A15(A0f, currentTimeMillis, A002);
                    AbstractC31178DnM.A19(A0f, this.A02.A01);
                    AbstractC31176DnK.A1J(A0f, A002);
                    AbstractC31172DnG.A1N(A0f);
                    AbstractC31176DnK.A1K(A0f, currentTimeMillis);
                    A0f.AAP("autoconfirmation_sources", new C71473Il(", ").A02(egM.A03));
                    AbstractC31175DnJ.A16(A0f, AbstractC31179DnN.A0c(abstractC12990ll));
                }
                if (EnumC33445EqI.A07 == regFlowExtras2.A01()) {
                    regFlowExtras.A0g = regFlowExtras2.A0g;
                    if (regFlowExtras2.A0t) {
                        regFlowExtras.A0u = false;
                        A0C = AbstractC31175DnJ.A0C(this.A03, abstractC12990ll);
                        A0b = AbstractC166987dD.A0b();
                        A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                        abstractC32319ELj = new AbstractC59962oe();
                    } else if (regFlowExtras.A0u) {
                        regFlowExtras.A0u = false;
                        this.A00 = regFlowExtras;
                        C07270a1 c07270a1 = (C07270a1) abstractC12990ll;
                        String str3 = regFlowExtras2.A0Z;
                        Pattern pattern = AbstractC13670mt.A01;
                        if (str3 == null) {
                            str3 = "";
                        }
                        AbstractC59962oe abstractC59962oe = this.A03;
                        AbstractC35794FrW.A02(AbstractC167007dF.A0J(), abstractC59962oe, abstractC59962oe, c07270a1, null, this, regFlowExtras, this.A07, this.A02, str3, null, false);
                    } else {
                        A0C = AbstractC31175DnJ.A0C(this.A03, abstractC12990ll);
                        A0b = AbstractC166987dD.A0b();
                        A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                        abstractC32319ELj = new AbstractC32319ELj();
                    }
                    AbstractC31175DnJ.A0u(A0b, abstractC32319ELj, A0C);
                    A0C.A04();
                } else {
                    AbstractC167007dF.A0J().post(new RunnableC36946GPp(this.A03, abstractC12990ll, regFlowExtras));
                }
            } else {
                regFlowExtras.A01 = countryCodeData;
                regFlowExtras.A0R = str2;
                FragmentActivity requireActivity = this.A03.requireActivity();
                AbstractC12990ll abstractC12990ll2 = this.A01;
                C140966Yy A0N = AbstractC31177DnL.A0N(requireActivity, abstractC12990ll2);
                String token = abstractC12990ll2.getToken();
                Bundle A0b2 = AbstractC166987dD.A0b();
                C18C.A0E(true);
                Bundle A0b3 = AbstractC166987dD.A0b();
                A0b3.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                A0b3.putBoolean("should_enable_auto_conf", false);
                A0b3.putBoolean("arg_is_reg_flow", true);
                AbstractC31171DnF.A12(A0b3, token);
                A0b3.putAll(A0b2);
                EKE eke = new EKE();
                eke.setArguments(A0b3);
                A0N.A0E(eke);
                A0N.A0G = true;
                A0N.A07();
            }
            i = -2115142360;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.GY6
    public final void Eks(String str, Integer num) {
        AbstractC35090Fd1.A00(this.A03, (C07270a1) this.A01, this.A00, str);
    }

    public EV1(AbstractC59962oe abstractC59962oe, AbstractC12990ll abstractC12990ll, GY6 gy6, CountryCodeData countryCodeData, RegFlowExtras regFlowExtras, EVN evn, EnumC31713DwI enumC31713DwI, String str) {
        this.A01 = abstractC12990ll;
        this.A08 = str;
        this.A03 = abstractC59962oe;
        this.A07 = evn;
        this.A05 = countryCodeData;
        this.A02 = enumC31713DwI;
        this.A04 = gy6;
        this.A06 = regFlowExtras;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String errorMessage;
        String str;
        String str2;
        Integer num;
        int A03 = C0f9.A03(1647865364);
        C35230FgN A02 = C1Q9.A1D.A02(this.A01);
        EnumC31713DwI enumC31713DwI = this.A02;
        C35037FcA A06 = A02.A06(EnumC33445EqI.A06, enumC31713DwI);
        boolean z = abstractC115105If instanceof C115115Ig;
        if (!z) {
            errorMessage = null;
        } else {
            Object A00 = abstractC115105If.A00();
            A00.getClass();
            C40781ul c40781ul = (C40781ul) A00;
            List list = c40781ul.mErrorStrings;
            if (list != null && !list.isEmpty()) {
                errorMessage = (String) AbstractC166987dD.A16(c40781ul.mErrorStrings);
            } else {
                errorMessage = c40781ul.getErrorMessage();
            }
        }
        GY6 gy6 = this.A04;
        if (errorMessage != null) {
            if (z) {
                Object A002 = abstractC115105If.A00();
                A002.getClass();
                String str3 = ((C40781ul) A002).mErrorSource;
                if (str3 != null) {
                    num = AbstractC33652Eu2.A00(str3);
                    gy6.Eks(errorMessage, num);
                    str = "invalid_number";
                }
            }
            num = C05F.A00;
            gy6.Eks(errorMessage, num);
            str = "invalid_number";
        } else {
            gy6.Eks(AbstractC31173DnH.A0m(this.A03), C05F.A00);
            str = "request_failed";
        }
        A06.A04("error", str);
        if (enumC31713DwI == EnumC31713DwI.A1F) {
            String stripSeparators = PhoneNumberUtils.stripSeparators(this.A08);
            stripSeparators.getClass();
            int length = stripSeparators.length();
            if (length >= 3) {
                stripSeparators = stripSeparators.substring(0, 3);
            }
            A06.A04(AbstractC31189DnY.A00(), stripSeparators);
            A06.A03("digits", length);
            CountryCodeData countryCodeData = this.A05;
            if (countryCodeData != null) {
                str2 = countryCodeData.A01;
            } else {
                str2 = "can't tell";
            }
            A06.A04("country_code", str2);
        }
        A06.A02();
        C0f9.A0A(715033024, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-432528267);
        super.onFinish();
        this.A07.A00();
        C0f9.A0A(-1638142396, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1013303443);
        super.onStart();
        this.A07.A01();
        C0f9.A0A(-463094905, A03);
    }

    @Override // X.C1P1
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1434960197);
        A00((EgM) obj);
        C0f9.A0A(853163110, A03);
    }
}
