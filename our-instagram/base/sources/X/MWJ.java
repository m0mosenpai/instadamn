package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class MWJ {
    public static final C56139Ovz A01(UserSession userSession) {
        return (C56139Ovz) userSession.A00(C56139Ovz.class);
    }

    public static final C56139Ovz A00(Context context, UserSession userSession) {
        AbstractC167017dG.A1N(userSession, context);
        return (C56139Ovz) userSession.A01(C56139Ovz.class, new C57536PgA(19, context, userSession));
    }
}
