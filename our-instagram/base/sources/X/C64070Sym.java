package X;

import android.os.Bundle;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import java.util.HashMap;

/* renamed from: X.Sym, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64070Sym implements InterfaceC65342TiP {
    public final /* synthetic */ LoginClient$Request A00;
    public final /* synthetic */ C64074Syq A01;

    public C64070Sym(LoginClient$Request loginClient$Request, C64074Syq c64074Syq) {
        this.A01 = c64074Syq;
        this.A00 = loginClient$Request;
    }

    @Override // X.InterfaceC65342TiP
    public final void D6R(Bundle bundle, C62406SAf c62406SAf) {
        LoginClient$Result A02;
        C64074Syq c64074Syq = this.A01;
        LoginClient$Request loginClient$Request = this.A00;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                c64074Syq.A03 = bundle.getString("e2e");
            }
            try {
                AbstractC62273S4s.A00(c64074Syq.A02, "web_auth_success", loginClient$Request.A01, null, loginClient$Request.A02);
                AccessToken A00 = C63209SfE.A00(bundle, C05F.A0j, loginClient$Request.A03, loginClient$Request.A06);
                C63209SfE c63209SfE = c64074Syq.A01;
                A02 = LoginClient$Result.A00(A00, c63209SfE.A01);
                CookieSyncManager.createInstance(c63209SfE.A06.getActivity()).sync();
                String str = c64074Syq.A04;
                if (!"fbsdk_logged_out_id".equals(str)) {
                    String str2 = A00.A02;
                    C14360o3.A0B(str, 0);
                    InterfaceC19610xo ARD = C1AT.A00(C1AV.A1K, str).ARD();
                    ARD.E7K("com.facebook.login.WebViewAuthHandler.TOKEN_KEY", str2);
                    ARD.apply();
                }
            } catch (TXS e) {
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("exception", e.getMessage());
                AbstractC62273S4s.A00(c64074Syq.A02, "web_auth_error", loginClient$Request.A01, A1G, loginClient$Request.A02);
                A02 = LoginClient$Result.A02(c64074Syq.A01.A01, null, e.getMessage(), null);
            }
        } else {
            C18C.A07(c62406SAf, "If unsuccessful then error cannot be null");
            if (c62406SAf.A00 == C05F.A01) {
                AbstractC62273S4s.A00(c64074Syq.A02, "web_auth_cancel", loginClient$Request.A01, null, loginClient$Request.A02);
                A02 = LoginClient$Result.A01(c64074Syq.A01.A01, "User canceled log in.");
            } else {
                c64074Syq.A03 = null;
                A02 = LoginClient$Result.A02(c64074Syq.A01.A01, null, null, null);
            }
        }
        c64074Syq.A00.A04(A02);
    }
}
