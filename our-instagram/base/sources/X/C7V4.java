package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7V4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7V4 {
    public static final C7V6 A02 = new Object();
    public final UserSession A00;
    public final AnonymousClass988 A01;

    public C7V4(UserSession userSession, AnonymousClass988 anonymousClass988) {
        C14360o3.A0B(anonymousClass988, 2);
        this.A00 = userSession;
        this.A01 = anonymousClass988;
    }

    public final C7TT A00(C2EC c2ec, String str, boolean z) {
        C83693oE c83693oE;
        String C7I;
        if (c2ec != null && (C7I = c2ec.C7I()) != null) {
            str = C7I;
        }
        C7V6 c7v6 = A02;
        UserSession userSession = this.A00;
        AnonymousClass988 anonymousClass988 = this.A01;
        if (str != null) {
            c83693oE = new C83693oE(str);
        } else {
            c83693oE = null;
        }
        return c7v6.A00(userSession, anonymousClass988, c2ec, c83693oE, z);
    }
}
