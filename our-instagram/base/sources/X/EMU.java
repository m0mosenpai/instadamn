package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* loaded from: classes6.dex */
public final class EMU extends AbstractC59962oe implements InterfaceC37221GaW, GY6 {
    public static final String __redex_internal_original_name = "SACWelcomeFragment";
    public C07270a1 A00;
    public RegFlowExtras A01;
    public EVN A02;
    public ProgressButton A03;

    @Override // X.InterfaceC37221GaW
    public final boolean CbE() {
        return true;
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        String str = this.A01.A0Z;
        if (str == null) {
            str = "";
        }
        C07270a1 c07270a1 = this.A00;
        str.getClass();
        AbstractC35794FrW.A02(new Handler(), this, this, c07270a1, null, this, this.A01, this.A02, EnumC33523Erw.A0F.A00, str, null, false);
    }

    @Override // X.InterfaceC37221GaW
    public final void Dbn(boolean z) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "sac_welcome_page";
    }

    @Override // X.InterfaceC37221GaW
    public final void APP() {
        this.A03.setEnabled(false);
    }

    @Override // X.InterfaceC37221GaW
    public final void ARU() {
        this.A03.setEnabled(true);
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        return EnumC33523Erw.A0F.A00;
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        return EnumC33445EqI.A07;
    }

    @Override // X.GY6
    public final void Eks(String str, Integer num) {
        C193328hC A0b = AbstractC31176DnK.A0b(this);
        A0b.A0r(str);
        A0b.A0I(DialogInterfaceOnClickListenerC35454FkB.A00(this, 64), 2131968948);
        A0b.A04();
        AbstractC166987dD.A1W(A0b);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1918730900);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = C023409i.A0A.A02(requireArguments);
        Parcelable parcelable = requireArguments.getParcelable("RegFlowExtras.EXTRA_KEY");
        C18C.A07(parcelable, "Registration extras cannot be null in SAC flow!");
        this.A01 = (RegFlowExtras) parcelable;
        if (getContext() != null) {
            C3BH.A00();
            Context context = getContext();
            C07270a1 c07270a1 = this.A00;
            EnumC33445EqI enumC33445EqI = EnumC33445EqI.A07;
            Integer A022 = this.A01.A02();
            AbstractC167007dF.A1K(context, c07270a1);
            C1V2.A00(context, c07270a1, enumC33445EqI, A022, C05F.A00, false, false, false, false, false);
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!AbstractC31180DnO.A0f(c06090Tz).contains(__redex_internal_original_name)) {
            if (C1AD.A06(c06090Tz, 2324147236411677036L)) {
                FBE.A00().A00(requireContext(), this.A00, null);
            }
            if (C1AD.A06(c06090Tz, 2324147236411742573L)) {
                FBE.A00().A01(requireContext(), this.A00, null);
            }
        }
        C0f9.A09(1675386570, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r3 == false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r19, android.view.ViewGroup r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMU.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1484398714);
        super.onDestroyView();
        this.A03 = null;
        unregisterLifecycleListener(this.A02);
        C0f9.A09(442922813, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C35203Ffv.A00.A02(this.A00, EnumC33445EqI.A07, EnumC33523Erw.A0F.A00.A01);
    }
}
