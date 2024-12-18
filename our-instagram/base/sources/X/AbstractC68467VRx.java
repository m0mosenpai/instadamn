package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.VRx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68467VRx {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        SimpleWebViewConfig simpleWebViewConfig = new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, str, str2);
        Bundle bundle = new Bundle();
        bundle.putParcelable(MSV.A00(2), simpleWebViewConfig);
        AbstractC31173DnH.A1C(bundle, userSession);
        AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
        abstractC59962oe.setArguments(bundle);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A0D = false;
        c140966Yy.A0B(null, abstractC59962oe);
        c140966Yy.A04();
    }
}
