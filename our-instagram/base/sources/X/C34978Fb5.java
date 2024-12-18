package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fb5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34978Fb5 {
    public static final C34978Fb5 A00 = new Object();

    public final String A00(UserSession userSession, User user) {
        String str;
        String Aae = user.A03.Aae();
        if (Aae == null) {
            return null;
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36319368742640924L)) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append((Object) AbstractC12290kX.A00.getApplicationContext().getText(2131952794));
            A1C.append(' ');
            str = A1C.toString();
        } else {
            str = "";
        }
        return AnonymousClass001.A0u(str, "https://aistudio.instagram.com/ai/", Aae, "?utm_source=ig4a");
    }
}
