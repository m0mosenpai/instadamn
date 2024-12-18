package X;

import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.7Nu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162107Nu implements C7C2 {
    public static final C162107Nu A00 = new Object();

    @Override // X.C7C2
    public final boolean CWe(UserSession userSession, AbstractC159137Bz abstractC159137Bz, String str) {
        C14360o3.A0B(userSession, 2);
        if (str.length() == 0 || !(str.charAt(0) == abstractC159137Bz.commandType.A00 || (str.charAt(0) == '/' && C18U.A06(C06090Tz.A05, userSession, 36330466931983229L)))) {
            return false;
        }
        String substring = str.substring(1);
        C14360o3.A07(substring);
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        C14360o3.A07(lowerCase);
        if (lowerCase.length() != 0) {
            C14360o3.A0B("meta", 0);
            if (!"meta".startsWith(lowerCase)) {
                C14360o3.A0B("ai", 0);
                if (!"ai".startsWith(lowerCase)) {
                    C14360o3.A0B("meta", 1);
                    if (!lowerCase.startsWith("meta") || !C18U.A06(C06090Tz.A05, userSession, 36331141241783481L)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
