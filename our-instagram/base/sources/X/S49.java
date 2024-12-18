package X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookActivity;
import com.facebook.login.LoginClient$Request;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public abstract class S49 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        IgFragmentActivity igFragmentActivity;
        Bundle A0b;
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 0);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        if ((A04 instanceof BaseFragmentActivity) && (igFragmentActivity = (IgFragmentActivity) A04) != null) {
            UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
            C70620Wdy c70620Wdy = new C70620Wdy(0, c6fq, A0I);
            C14360o3.A0B(userSession, 1);
            try {
                igFragmentActivity.registerOnActivityResultListener(new C64475TFl(4, new SCJ(c70620Wdy), userSession, igFragmentActivity));
                if (!userSession.hasEnded()) {
                    Intent intent = igFragmentActivity.getIntent();
                    if (intent == null || (A0b = intent.getExtras()) == null) {
                        A0b = AbstractC166987dD.A0b();
                    }
                    String string = A0b.getString("IgSessionManager.SESSION_TOKEN_KEY");
                    if (string == null || string.length() == 0) {
                        A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                    }
                    Intent intent2 = igFragmentActivity.getIntent();
                    if (intent2 != null) {
                        intent2.putExtras(A0b);
                    }
                    LoginClient$Request loginClient$Request = new LoginClient$Request(C1L4.A02, AbstractC166997dE.A0n(), userSession.userId, AbstractC31171DnF.A0k(EnumC61160RgL.A06.A00));
                    loginClient$Request.A02 = false;
                    loginClient$Request.A01 = "pro2pro_promote_legacy_auth";
                    loginClient$Request.A00 = EnumC61140Rfu.A08;
                    Intent A042 = AbstractC31171DnF.A04();
                    A042.setClass(C1L4.A00, FacebookActivity.class);
                    Bundle A0b2 = AbstractC166987dD.A0b();
                    A0b2.putParcelable("Request", loginClient$Request);
                    A042.putExtras(A0b2);
                    try {
                        if (C12260kU.A08(igFragmentActivity, A042, 64206)) {
                            return null;
                        }
                    } catch (ActivityNotFoundException unused) {
                    }
                    throw new RuntimeException("Log in attempt failed: LoginActivity could not be started");
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }
}
