package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.registration.model.RegFlowExtras;

/* loaded from: classes6.dex */
public abstract class EHT extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AgeCollectionBaseFragment";
    public C07270a1 A00;
    public RegFlowExtras A01;
    public EnumC33445EqI A02;

    public final void A02(C1P1 c1p1, int i, int i2, int i3) {
        C25621Ms A0M = AbstractC31173DnH.A0M(this.A00);
        A0M.A0B("consent/check_age_eligibility/");
        A0M.A9s("year", Integer.toString(i));
        A0M.A9s("month", Integer.toString(i2));
        A0M.A9s("day", Integer.toString(i3));
        C1ON A0S = AbstractC31172DnG.A0S(A0M, ECW.class, FW7.class);
        A0S.A00 = c1p1;
        schedule(A0S);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f9, code lost:
    
        if (X.AbstractC31180DnO.A0s(r3).isEmpty() == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.EnumC31713DwI r6) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EHT.A03(X.DwI):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Jk, java.lang.Object] */
    public final void A04(String str, int i, int i2, int i3) {
        C35160Ff2.A00().A02();
        int intValue = C35160Ff2.A00().A01().intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                RegFlowExtras regFlowExtras = this.A01;
                Bundle A0b = AbstractC166987dD.A0b();
                if (regFlowExtras != null) {
                    A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                }
                if (this.A02 == EnumC33445EqI.A07 && str != null) {
                    C023409i.A0A.A0A(new Object(), null, new FLR(i, i2, i3), str);
                }
                C140966Yy A0N = AbstractC31177DnL.A0N(requireActivity(), this.A00);
                AbstractC31173DnH.A1B(A0b);
                AbstractC31176DnK.A1A(A0b, new AbstractC59962oe(), A0N);
                return;
            }
            return;
        }
        C193328hC A0H = AbstractC31171DnF.A0H(getRootActivity());
        A0H.A0A(2131952532);
        A0H.A0F(DialogInterfaceOnClickListenerC35454FkB.A00(this, 25));
        A0H.A0s(false);
        AbstractC166987dD.A1W(A0H);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-750012635);
        super.onCreate(bundle);
        C18C.A07(this.mArguments, "Arguments must contain MainSession token and Registration extras");
        this.A00 = C023409i.A0A.A02(this.mArguments);
        Parcelable parcelable = this.mArguments.getParcelable("RegFlowExtras.EXTRA_KEY");
        C18C.A07(parcelable, "Registration extras cannot be null");
        RegFlowExtras regFlowExtras = (RegFlowExtras) parcelable;
        this.A01 = regFlowExtras;
        EnumC33445EqI A01 = regFlowExtras.A01();
        A01.getClass();
        this.A02 = A01;
        C0f9.A09(448833657, A02);
    }
}
