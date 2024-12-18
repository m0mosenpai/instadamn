package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.NrW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53842NrW {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        boolean z;
        boolean z2;
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        C102884kP c102884kP = (C102884kP) MSW.A10(c6fw, 1);
        if (c102884kP != null) {
            str = c102884kP.A0G();
            z = c102884kP.A0S(35, true);
            z2 = c102884kP.A0U(false);
        } else {
            str = null;
            z = true;
            z2 = false;
        }
        String str2 = null;
        boolean z3 = !z2;
        if (str != null) {
            str2 = str;
        }
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        A04.getSupportFragmentManager().A0u(new C55553Oln(6, c102884kP, c6fq), A04, "on_failure");
        Bundle A0T = AbstractC167017dG.A0T("IgSessionManager.SESSION_TOKEN_KEY", A0B.getToken(), AbstractC166987dD.A1L("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", new SimpleWebViewConfig((String) null, (String) null, false, false, false, z3, false, true, false, false, z, z3, false, false, str2, A0e)));
        AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
        abstractC59962oe.setArguments(A0T);
        AbstractC31177DnL.A0w(null, abstractC59962oe, A04, A0B);
        return null;
    }
}
