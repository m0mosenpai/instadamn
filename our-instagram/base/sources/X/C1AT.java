package X;

import android.content.SharedPreferences;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

/* renamed from: X.1AT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AT {
    @Deprecated(message = "")
    public static final C17320tT A00(C1AV c1av, String str) {
        SharedPreferences sharedPreferences = AbstractC12290kX.A00.getSharedPreferences(AnonymousClass001.A0T(str, c1av.A00, '_'), 0);
        C14360o3.A07(sharedPreferences);
        return new C17320tT(sharedPreferences, AnonymousClass001.A0R("UserSharedPreferences:", c1av.name()));
    }

    public static final C1AU A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C1AU) userSession.A01(C1AU.class, new C9EQ(userSession, 24));
    }
}
