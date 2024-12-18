package X;

import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.92g, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C92g {
    public final UserSession A00;

    public C92g(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final String A00(Enum r1) {
        String name = r1.name();
        Locale locale = Locale.ROOT;
        C14360o3.A08(locale);
        String lowerCase = name.toLowerCase(locale);
        C14360o3.A07(lowerCase);
        return lowerCase;
    }
}
