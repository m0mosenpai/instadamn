package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.FZw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34910FZw {
    public static final InterfaceC08100bW A00 = AbstractC31175DnJ.A0B();

    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        SimpleWebViewConfig simpleWebViewConfig = new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, (String) null, str);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable(MSV.A00(2), simpleWebViewConfig);
        AbstractC31173DnH.A1C(A0b, userSession);
        AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
        abstractC59962oe.setArguments(A0b);
        AbstractC31177DnL.A0w(null, abstractC59962oe, fragmentActivity, userSession);
    }
}
