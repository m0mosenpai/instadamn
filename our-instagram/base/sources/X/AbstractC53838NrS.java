package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.NrS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53838NrS {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        Object A03 = c6fw.A03(1);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A03;
        String A0F = c102884kP.A0F();
        boolean A0U = c102884kP.A0U(true);
        String str = null;
        boolean z = !c102884kP.A0S(35, false);
        if (A0F != null) {
            str = A0F;
        }
        FragmentActivity A04 = C6BQ.A04(c6fq);
        A04.getSupportFragmentManager().A0u(new C55553Oln(3, c102884kP, c6fq), A04, "on_failure");
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        Bundle A00 = AbstractC61636Rr0.A00(AbstractC167007dF.A1b("IACWebviewFragment.LIVE_CHAT_URL_KEY", A0e, AbstractC166987dD.A1L("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", new SimpleWebViewConfig((String) null, (String) null, false, false, false, true, false, true, false, false, A0U, z, false, false, str, A0e)), AbstractC166987dD.A1L("IgSessionManager.SESSION_TOKEN_KEY", A0B.getToken())));
        AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
        abstractC59962oe.setArguments(A00);
        AbstractC31177DnL.A0w(null, abstractC59962oe, A04, A0B);
        return null;
    }
}
