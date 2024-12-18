package X;

import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.7C1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7C1 implements C7C2 {
    @Override // X.C7C2
    public final boolean CWe(UserSession userSession, AbstractC159137Bz abstractC159137Bz, String str) {
        C14360o3.A0B(userSession, 2);
        if (str.length() == 0 || !AbstractC27664CIj.A00(userSession, abstractC159137Bz.commandType, str)) {
            return false;
        }
        String substring = str.substring(1);
        C14360o3.A07(substring);
        if (substring.length() == 0) {
            return true;
        }
        String str2 = abstractC159137Bz.trigger;
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        C14360o3.A07(lowerCase);
        C14360o3.A0B(str2, 0);
        if (str2.startsWith(lowerCase)) {
            return true;
        }
        return false;
    }
}
