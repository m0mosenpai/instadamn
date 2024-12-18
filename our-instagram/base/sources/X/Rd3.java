package X;

import android.os.Bundle;
import android.webkit.WebView;
import com.instagram.common.session.UserSession;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class Rd3 extends Rb0 implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "SecureWebViewWithUrlChangeFragment";
    public WebView A00;
    public C64487TFx A01;
    public String A02;
    public InterfaceC65448TkK A03;
    public InterfaceC65449TkL A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.Rb0
    public final boolean A03(android.net.Uri uri, WebView webView) {
        Boolean FDK;
        InterfaceC65448TkK interfaceC65448TkK = this.A03;
        if (interfaceC65448TkK != null && (FDK = interfaceC65448TkK.FDK(AbstractC166987dD.A19(uri))) != null && FDK.booleanValue()) {
            this.A02 = uri.toString();
            InterfaceC65449TkL interfaceC65449TkL = this.A04;
            if (interfaceC65449TkL != null) {
                interfaceC65449TkL.FE4(AbstractC166987dD.A19(uri), false);
            }
            AbstractC25227BEk.A1B(this);
            return true;
        }
        String A19 = AbstractC166987dD.A19(AbstractC08820cl.A03(uri.toString()));
        if (AbstractC001900j.A0a(A19, "/oauth/login", false)) {
            if (C1AD.A06(C06090Tz.A05, 18307083350844934L)) {
                new C63165SeP().A01().A00(requireContext(), AbstractC08820cl.A03(A19));
                return true;
            }
            C63397SjR c63397SjR = new C63397SjR(requireActivity(), (UserSession) this.A05.getValue(), C2Fb.A47, A19, false);
            Pattern pattern = AbstractC13670mt.A00;
            c63397SjR.A0M = A19;
            c63397SjR.A0N = "instagram";
            c63397SjR.A0j = true;
            c63397SjR.A1D = true;
            c63397SjR.A0A();
            return true;
        }
        return super.A03(uri, webView);
    }

    @Override // X.Rb0, X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        WebView webView = this.A00;
        if (webView == null || (str = webView.getUrl()) == null) {
            str = "";
        }
        InterfaceC65449TkL interfaceC65449TkL = this.A04;
        if (interfaceC65449TkL != null) {
            interfaceC65449TkL.FE4(str, true);
            return false;
        }
        return false;
    }

    @Override // X.Rb0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        int A02 = C0f9.A02(-1883514931);
        super.onCreate(bundle);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && bundle3.containsKey("redirected_from_deeplink") && (bundle2 = this.mArguments) != null && bundle2.getBoolean("redirected_from_deeplink")) {
            AbstractC25227BEk.A1B(this);
        }
        InterfaceC09390do interfaceC09390do = this.A05;
        AbstractC12990ll A0M = AbstractC31178DnM.A0M(interfaceC09390do);
        C64487TFx c64487TFx = (C64487TFx) A0M.A01(C64487TFx.class, new C50150MDd(A0M, 23));
        this.A01 = c64487TFx;
        if (c64487TFx != null) {
            InterfaceC65448TkK interfaceC65448TkK = c64487TFx.A00;
            if (interfaceC65448TkK == null) {
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null && bundle4.containsKey("completion_path")) {
                    interfaceC65448TkK = new TEh(this);
                } else {
                    interfaceC65448TkK = null;
                }
            }
            this.A03 = interfaceC65448TkK;
            C64487TFx c64487TFx2 = this.A01;
            if (c64487TFx2 != null) {
                InterfaceC65449TkL interfaceC65449TkL = c64487TFx2.A01;
                if (interfaceC65449TkL == null) {
                    interfaceC65449TkL = new C64447TEj(this, (UserSession) interfaceC09390do.getValue());
                }
                this.A04 = interfaceC65449TkL;
                C0f9.A09(-2064115550, A02);
                return;
            }
        }
        C14360o3.A0F("callbackHelper");
        throw C00O.createAndThrow();
    }

    @Override // X.Rb0, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(254417205);
        this.A00 = null;
        super.onDestroyView();
        C0f9.A09(-505800018, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1645477829);
        super.onResume();
        WebView webView = this.A00;
        if (webView != null) {
            webView.resumeTimers();
        }
        WebView webView2 = this.A00;
        if (webView2 != null) {
            webView2.loadUrl("javascript:window.Trustly.proceedToChooseAccount();");
        }
        C0f9.A09(-1186412032, A02);
    }
}
