package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2uP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC63422uP {
    public static final Integer A01(String str) {
        String str2;
        int i = 0;
        if (str != null && (str2 = (String) AbstractC001800i.A0O(AbstractC001900j.A0R(str, new String[]{"_"}, 0), 0)) != null) {
            i = str2.hashCode();
        }
        return Integer.valueOf(i);
    }

    public static final C63432uQ A00(UserSession userSession) {
        return (C63432uQ) userSession.A01(C63432uQ.class, new C206839Do(userSession, 9));
    }
}
