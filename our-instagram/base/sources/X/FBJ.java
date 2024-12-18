package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FBJ {
    public static final GHY A00(Activity activity, UserSession userSession, String str, String str2, int i) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("sessionId", str2);
        return GHY.A00(activity, new ViewOnClickListenerC35618Fo9(activity, A0b, userSession, str, i, 3), i);
    }
}
