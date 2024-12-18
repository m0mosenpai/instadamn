package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.registration.ui.NotificationBar;

/* loaded from: classes6.dex */
public final class ENv extends C53Z implements InterfaceC12870lZ, InterfaceC60072op, InterfaceC37221GaW {
    public static final String __redex_internal_original_name = "AdditionalContactFragment";
    public NotificationBar A00;
    public EVN A01;
    public String A02;
    public String A03;
    public TextView A04;
    public IgdsHeadline A05;
    public final C1P1 A06 = new C32539EUp(this, 24);

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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "nux_additional_contact";
    }

    @Override // X.InterfaceC37221GaW
    public final void Dbn(boolean z) {
        this.A04.setEnabled(z);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00.A02(getSession(), "additional_contact");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(ENv eNv, boolean z) {
        InterfaceC37264GbH interfaceC37264GbH;
        FragmentActivity activity = eNv.getActivity();
        if ((activity instanceof InterfaceC37264GbH) && (interfaceC37264GbH = (InterfaceC37264GbH) activity) != null) {
            interfaceC37264GbH.CnE(z ? 1 : 0);
        } else {
            new C35782FrK(eNv, eNv, AbstractC31176DnK.A0S(eNv)).A00();
        }
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        return EnumC33445EqI.A03;
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        return EnumC31713DwI.A08;
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        C1ON A05 = AbstractC152476ta.A05(AbstractC166987dD.A0o(AbstractC60492pY.A02(this)), this.A02, this.A03, false);
        A05.A00 = this.A06;
        schedule(A05);
        C35031Fc4.A00.A02(getSession(), "additional_contact");
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1769440619);
        UserSession session = getSession();
        double A00 = AbstractC31177DnL.A00(session);
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(session), "step_view_backgrounded");
        AbstractC31179DnN.A16(A0f, A00, A002);
        AbstractC35274Fh9.A06(A0f);
        AbstractC31176DnK.A1J(A0f, A002);
        AbstractC31171DnF.A1A(A0f, "additional_contact");
        AbstractC31179DnN.A15(A0f);
        AbstractC35274Fh9.A08(A0f, session);
        C0f9.A0A(-1568147908, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-22234090, C0f9.A03(-2005476464));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-400610349);
        super.onCreate(bundle);
        this.A03 = AbstractC31173DnH.A0j(requireArguments(), AbstractC31189DnY.A03(39, 17, 24));
        this.A02 = AbstractC31173DnH.A0j(requireArguments(), AbstractC31189DnY.A00());
        C0f9.A09(1770111685, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1667755995);
        UserSession session = getSession();
        AbstractC167017dG.A1N(session, "additional_contact");
        C35203Ffv.A01(session, "additional_contact");
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.nux_additional_contact_fragment, AbstractC31180DnO.A05(A0A), true);
        this.A00 = AbstractC31180DnO.A0S(A0A);
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.skip_button);
        this.A04 = A0T;
        A0T.setText(2131974123);
        ViewOnClickListenerC35667Fp2.A00(this.A04, 42, this);
        this.A05 = AbstractC31179DnN.A0Q(A0A, R.id.field_title_igds);
        String str = this.A02;
        try {
            PhoneNumberUtil A01 = PhoneNumberUtil.A01(requireActivity());
            str = A01.A0I(A01.A0F(str, AnonymousClass780.A00(requireActivity()).A00), C05F.A0C);
        } catch (C40f unused) {
            UserSession session2 = getSession();
            double A00 = AbstractC31177DnL.A00(session2);
            double A002 = AbstractC31171DnF.A00();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(session2), "additional_phone_number_parse_fail");
            AbstractC31179DnN.A16(A0f, A00, A002);
            AbstractC35274Fh9.A05(A0f);
            AbstractC31177DnL.A1G(A0f, "module", "waterfall_log_in", A002);
            AbstractC31178DnM.A19(A0f, "additional_contact");
            AbstractC35274Fh9.A0B(A0f, session2);
        }
        this.A05.setHeadline(AbstractC13670mt.A06(AbstractC166997dE.A0N(this).getString(2131952476), str));
        this.A05.EW2(R.drawable.phone, true);
        EVN evn = new EVN(null, getSession(), this, AbstractC31180DnO.A0U(A0A));
        this.A01 = evn;
        registerLifecycleListener(evn);
        C218914p.A08.A0A(this);
        C0f9.A09(1069600968, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-934732912);
        super.onDestroyView();
        unregisterLifecycleListener(this.A01);
        C218914p.A06(this);
        this.A05 = null;
        this.A00 = null;
        C0f9.A09(-754821389, A02);
    }
}
