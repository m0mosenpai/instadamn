package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;

/* renamed from: X.Ek0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33157Ek0 extends AbstractC32289EKc {
    public static final String __redex_internal_original_name = "DataDownloadPasswordFragment";
    public int A00;
    public int A01;
    public EditText A02;
    public TextView A03;
    public UserSession A04;
    public InlineErrorMessageView A05;
    public String A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "data_download_password";
    }

    public static void A00(C33157Ek0 c33157Ek0) {
        c33157Ek0.A05.A03();
        if (!AbstractC13880nE.A10(c33157Ek0.A02)) {
            C35016Fbp c35016Fbp = new C35016Fbp(c33157Ek0.A04);
            c35016Fbp.A02(AbstractC111324zv.A00(1355), "create_job");
            String A0g = AbstractC167007dF.A0g(c33157Ek0.A02);
            UserSession userSession = c33157Ek0.A04;
            String str = c33157Ek0.A06;
            C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
            A0M.A0B("dyi/request_download_data/");
            A0M.A9s("email", str);
            A0M.A9s("enc_password", AbstractC31176DnK.A0p(userSession, A0g));
            C1ON A0I = AbstractC31178DnM.A0I(A0M, EC3.class, FXT.class);
            A0I.A00 = new C32530EUg(0, c33157Ek0, c35016Fbp);
            C1GJ.A03(A0I);
            return;
        }
        c33157Ek0.A05.A04(c33157Ek0.getString(2131969374));
    }

    @Override // X.AbstractC32289EKc, X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        super.configureActionBar(interfaceC56362iU);
        boolean z = false;
        interfaceC56362iU.ARS(false);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0K = getString(2131968535);
        this.A03 = (TextView) AbstractC31177DnL.A0F(ViewOnClickListenerC35689FpO.A00(this, 62), A0B, interfaceC56362iU);
        EditText editText = this.A02;
        if (editText != null && !AbstractC13880nE.A10(editText)) {
            z = true;
        }
        this.A03.setEnabled(z);
        TextView textView = this.A03;
        if (z) {
            i = this.A01;
        } else {
            i = this.A00;
        }
        textView.setTextColor(i);
        AbstractC31176DnK.A1C(ViewOnClickListenerC35689FpO.A00(this, 63), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // X.AbstractC32289EKc, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-565067494);
        super.onCreate(bundle);
        this.A06 = requireArguments().getString("email");
        this.A04 = AbstractC31176DnK.A0S(this);
        this.A00 = getContext().getColor(R.color.blue_5_30_transparent);
        this.A01 = AbstractC31173DnH.A02(getContext());
        C0f9.A09(702741799, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1406989078);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.data_download_password_fragment);
        AbstractC31176DnK.A1F(A0A, AbstractC31174DnI.A0w(this, AbstractC31176DnK.A0q(this.A04), 2131957500), R.id.header_text);
        AbstractC31173DnH.A0G(A0A, R.id.inline_error_stub).inflate();
        this.A05 = (InlineErrorMessageView) A0A.findViewById(R.id.inline_error);
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.help_text);
        AbstractC31180DnO.A13(AbstractC166997dE.A0N(this), A0T, 2131962788);
        ViewOnClickListenerC35689FpO.A01(A0T, 61, this);
        EditText A0H = AbstractC31173DnH.A0H(A0A, R.id.text_field);
        this.A02 = A0H;
        A0H.setHint(2131969371);
        this.A02.setInputType(128);
        AbstractC31179DnN.A0s(this.A02);
        this.A02.setImeOptions(6);
        C35754Fqr.A00(this.A02, this, 20);
        C35469Fl4.A00(this.A02, this, 32);
        C0f9.A09(832607786, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1306254141);
        super.onResume();
        this.A02.requestFocus();
        AbstractC13880nE.A0R(this.A02);
        C0f9.A09(1862796429, A02);
    }
}
