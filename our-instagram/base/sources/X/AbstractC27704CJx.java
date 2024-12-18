package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.CJx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27704CJx {
    public static void A00(Activity activity, UserSession userSession, C38321qM c38321qM, String str, String str2) {
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0a = AbstractC166997dE.A0a();
        A0y.A1R = true;
        C189478aR A00 = A0y.A00();
        C26850BtC c26850BtC = new C26850BtC();
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC60492pY.A04(A0b, userSession);
        A0b.putString("media_id", c38321qM.getId());
        A0b.putString("prior_module", str2);
        A0b.putString("module", str);
        c26850BtC.setArguments(A0b);
        A00.A02(activity, c26850BtC);
    }
}
