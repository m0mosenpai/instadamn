package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vft, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69017Vft {
    public final SharedPreferences A00;
    public final UserSession A01;

    public C69017Vft(Context context, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = context.getSharedPreferences(AnonymousClass001.A0g(userSession.userId, "_", "ViewStateModStore"), 0);
    }
}
