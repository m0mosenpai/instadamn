package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.F6u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34196F6u {
    public static final C34956Fag A00(UserSession userSession, C32371gN c32371gN) {
        String str;
        AbstractC167017dG.A1N(c32371gN, userSession);
        DirectThreadKey directThreadKey = c32371gN.A00;
        if (directThreadKey != null) {
            String str2 = directThreadKey.A00;
            String str3 = directThreadKey.A01;
            if (str2 != null && str3 != null) {
                String str4 = c32371gN.A01;
                if (str4 != null) {
                    return new C34956Fag(userSession, str4, str2, str3);
                }
                str = "sessionIdFromCall";
            } else {
                return null;
            }
        } else {
            str = "directThreadKey";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
