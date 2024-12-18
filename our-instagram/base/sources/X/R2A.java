package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bwpclientauthmanager.AuthenticationActivity;
import com.instagram.igoauthaccountlinking.IgOAuthAccountLinkingActivity;

/* loaded from: classes10.dex */
public final class R2A extends AbstractC53642Nnn {
    public final int A00;
    public final Object A01;

    public R2A(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC53642Nnn
    public final void A00() {
        C62702SMq c62702SMq;
        boolean A06;
        if (this.A00 != 0) {
            C63953Swc c63953Swc = (C63953Swc) this.A01;
            if (c63953Swc.A09) {
                c62702SMq = c63953Swc.A08;
            } else {
                C62695SMj c62695SMj = c63953Swc.A07;
                FragmentActivity fragmentActivity = c62695SMj.A04;
                Intent A08 = MSW.A08(fragmentActivity, AuthenticationActivity.class);
                Bundle bundle = c62695SMj.A02;
                A08.putExtra("iab_session_params", bundle);
                Bundle A0A = AbstractC31173DnH.A0A(fragmentActivity);
                if (A0A != null) {
                    if (C18U.A06(C06090Tz.A05, AbstractC31171DnF.A0G(A0A), 36324625776455972L)) {
                        c62695SMj.A01.putExtra("BrowserLiteIntent.IAB_EXTERNAL_INTERSTITIAL_ENABLED", false);
                    }
                    A08.putExtra("iab_browser_intent", c62695SMj.A01);
                    c62695SMj.A03.A02(A08);
                    C63295Sgw.A00.A02(bundle, c62695SMj.A00, C05F.A00, null);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        } else {
            c62702SMq = ((AbstractC63952Swb) this.A01).A00;
            if (c62702SMq == null) {
                C14360o3.A0F("accountLinkingManager");
                throw C00O.createAndThrow();
            }
        }
        C00X c00x = c62702SMq.A03;
        FragmentActivity fragmentActivity2 = c62702SMq.A05;
        C64522THp c64522THp = c62702SMq.A06;
        Intent A082 = MSW.A08(fragmentActivity2, IgOAuthAccountLinkingActivity.class);
        A082.putExtra("oauth_account_linking_provider", c64522THp);
        A082.putExtra("oauth_integration_id", c62702SMq.A07);
        Bundle A0A2 = AbstractC31173DnH.A0A(c62702SMq.A04);
        if (A0A2 == null) {
            A06 = true;
        } else {
            A06 = C18U.A06(C06090Tz.A05, AbstractC31171DnF.A0G(A0A2), 36327739628010319L);
        }
        A082.putExtra("is_app2app_enabled", A06);
        Intent intent = c62702SMq.A00;
        intent.putExtra("BrowserLiteIntent.IAB_EXTERNAL_INTERSTITIAL_ENABLED", false);
        A082.putExtra("iab_intent", intent);
        A082.putExtra("session_parameters", c62702SMq.A01);
        c00x.A02(A082);
    }

    @Override // X.AbstractC53642Nnn
    public final void A02() {
        if (this.A00 != 0) {
            ((C63953Swc) this.A01).A03.A00(EnumC61062Reb.A04);
            return;
        }
        AbstractC63952Swb abstractC63952Swb = (AbstractC63952Swb) this.A01;
        abstractC63952Swb.A02(C05F.A00);
        abstractC63952Swb.A01();
    }
}
