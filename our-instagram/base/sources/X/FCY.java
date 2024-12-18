package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FCY {
    public static final C26707Bqo A00(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C26707Bqo c26707Bqo = new C26707Bqo();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("arg_media_id", str);
        c26707Bqo.setArguments(A05);
        return c26707Bqo;
    }
}
