package X;

import android.app.Dialog;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import java.util.regex.Pattern;

/* renamed from: X.EUb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32525EUb extends C1P1 {
    public android.net.Uri A00;
    public FragmentActivity A01;
    public AbstractC016706m A02;
    public InterfaceC11380iw A03;
    public C07270a1 A04;
    public ELH A05;
    public EnumC31713DwI A06;
    public String A07;
    public final C32547EUx A08;
    public final /* synthetic */ ELH A09;

    public C32525EUb(ELH elh, String str) {
        C14240no c14240no;
        this.A09 = elh;
        FragmentActivity requireActivity = elh.requireActivity();
        C07270a1 c07270a1 = elh.A07;
        EnumC31713DwI enumC31713DwI = EnumC31713DwI.A1j;
        android.net.Uri A01 = AbstractC31525Dt9.A01(elh);
        AbstractC10360h2 abstractC10360h2 = elh.mFragmentManager;
        if (abstractC10360h2 != null) {
            c14240no = new C14240no(abstractC10360h2);
        } else {
            c14240no = null;
        }
        this.A07 = str;
        this.A01 = requireActivity;
        this.A04 = c07270a1;
        this.A06 = enumC31713DwI;
        this.A03 = elh;
        this.A00 = A01;
        this.A05 = elh;
        this.A02 = c14240no;
        this.A08 = new C32977Efj(requireActivity, A01, elh, c07270a1, this, enumC31713DwI, C05F.A00);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        EfS efS;
        String string;
        int A03 = C0f9.A03(389473469);
        ELH elh = this.A09;
        if (!elh.A06()) {
            i = 1477390927;
        } else {
            elh.A0G.setShowProgressBar(false);
            C006802i.A0p.markerEnd(725096220, (short) 3);
            if ((abstractC115105If instanceof C115115Ig) && (efS = (EfS) abstractC115105If.A00()) != null) {
                int i2 = efS.mStatusCode;
                if (i2 == 404) {
                    if (efS.A0D) {
                        if (efS.getErrorMessage() != null) {
                            string = efS.getErrorMessage();
                        } else {
                            string = elh.getString(2131976159);
                        }
                        String str = efS.mErrorTitle;
                        if (str == null) {
                            str = elh.getString(2131961880);
                        }
                        String str2 = efS.A02;
                        if (str2 == null) {
                            str2 = elh.getString(2131963210);
                        }
                        C193328hC A00 = AbstractC35254Fgn.A00(elh.requireContext());
                        A00.A0r(string);
                        A00.A05 = str;
                        A00.A0d(DialogInterfaceOnClickListenerC35453FkA.A00(this, 49), str2);
                        A00.A0H(null, 2131975766);
                        AbstractC166987dD.A1W(A00);
                        i = -2021502493;
                    } else {
                        elh.A0F.A04(elh.getString(2131968660));
                        i = -1628337061;
                    }
                } else if (i2 == 429) {
                    C193328hC A002 = AbstractC35254Fgn.A00(elh.requireContext());
                    A002.A09(2131976952);
                    AbstractC166987dD.A1W(A002);
                    i = 536305267;
                }
            }
            if (elh.getContext() != null) {
                AbstractC35254Fgn.A01(elh.getContext());
            }
            i = -114787796;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1263133345);
        this.A09.A0M.post(new RunnableC36836GLj(this));
        C0f9.A0A(-316766941, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-209660229);
        this.A09.A0M.post(new RunnableC36835GLi(this));
        C0f9.A0A(2124996522, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        C140966Yy A0N;
        int i;
        String str2;
        int A03 = C0f9.A03(1478049307);
        EfS efS = (EfS) obj;
        int A032 = C0f9.A03(925889387);
        ELH elh = this.A05;
        if (!elh.A06()) {
            i = -1624483291;
        } else {
            C35161Ff3 c35161Ff3 = new C35161Ff3();
            ELH elh2 = this.A09;
            Integer A00 = ELH.A00(AbstractC13880nE.A0J(elh2.A0E));
            Bundle bundle = c35161Ff3.A00;
            bundle.putString(AbstractC31176DnK.A0r(EnumC33320EoF.A06), F9V.A00(A00));
            Integer num = elh2.A0H;
            if (num != null) {
                bundle.putString(AbstractC31176DnK.A0r(EnumC33320EoF.A04), F9V.A00(num));
            }
            bundle.putBoolean(AbstractC31176DnK.A0r(EnumC33320EoF.A08), elh2.A0I.equals(AbstractC13880nE.A0J(elh2.A0E).trim()));
            c35161Ff3.A02();
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putAll(bundle);
            C006802i.A0p.markerPoint(725096220, "network_complete");
            C006802i.A0p.markerPoint(725096125, "network_complete");
            boolean z = efS.A0B;
            if (z && efS.A0C) {
                C006802i.A0p.markerEnd(725096220, (short) 4);
                if (TextUtils.isEmpty(efS.A03)) {
                    str2 = this.A07;
                } else {
                    str2 = efS.A03;
                }
                if ("link".equals(efS.A05)) {
                    FragmentActivity fragmentActivity = this.A01;
                    if (fragmentActivity != null) {
                        String formatNumber = PhoneNumberUtils.formatNumber(str2.replace("+", ""));
                        Pattern pattern = AbstractC13670mt.A01;
                        if (formatNumber == null) {
                            formatNumber = "";
                        }
                        str2 = AbstractC31181DnP.A0I(fragmentActivity, formatNumber).toString();
                    }
                    FragmentActivity activity = elh.getActivity();
                    if (activity != null && elh.A02 == null) {
                        C193328hC A0H = AbstractC31171DnF.A0H(activity);
                        A0H.A0A(2131965793);
                        AbstractC31177DnL.A1A(elh, A0H, str2, 2131965792);
                        A0H.A08(R.drawable.confirmation_icon);
                        A0H.A07();
                        Dialog A02 = A0H.A02();
                        elh.A02 = A02;
                        C0fJ.A00(A02);
                        C19280xC A05 = C1Q9.A1G.A02(elh.A07).A05(null, EnumC31713DwI.A1j);
                        elh.A09.A00.putString(AbstractC31176DnK.A0r(EnumC33320EoF.A0A), "sms");
                        elh.A09.A03(A05);
                        AbstractC31173DnH.A1S(A05, elh.A07);
                    }
                    i = 482263565;
                } else {
                    C34717FRd A0R = AbstractC31175DnJ.A0R();
                    String str3 = this.A07;
                    C07270a1 c07270a1 = this.A04;
                    EKE A033 = A0R.A03(A0b, str2, str3, true);
                    C35231FgO c35231FgO = C35231FgO.A03;
                    FragmentActivity fragmentActivity2 = this.A01;
                    c35231FgO.A03(fragmentActivity2, c07270a1, A033, this.A06, str3);
                    A0N = AbstractC31174DnI.A0O(A033, fragmentActivity2, c07270a1);
                    A0N.A0G = true;
                    A0N.A04();
                    i = 482263565;
                }
            } else {
                if (z && efS.A09) {
                    C006802i.A0p.markerEnd(725096220, (short) 4);
                    if (TextUtils.isEmpty(efS.A03)) {
                        str = this.A07;
                    } else {
                        str = efS.A03;
                    }
                    Bundle A0b2 = AbstractC166987dD.A0b();
                    A0b2.putString("lookup_user_input", this.A07);
                    A0b2.putString("lookup_email", str);
                    A0b2.putBoolean("arg_is_multiple_account_recovery", true);
                    if (!elh.A0K && !elh.requireActivity().isFinishing()) {
                        A0N = AbstractC31177DnL.A0N(this.A01, this.A04);
                        AbstractC31173DnH.A1B(A0b2);
                        AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
                        abstractC59962oe.setArguments(A0b2);
                        A0N.A0E(abstractC59962oe);
                        A0N.A04();
                    }
                } else if (((EfU) efS).A00 != null) {
                    this.A08.A04(efS);
                } else {
                    AbstractC167007dF.A0J().post(new GOG(this, new GPY(A0b, efS, this)));
                }
                i = 482263565;
            }
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-222269902, A03);
    }
}
