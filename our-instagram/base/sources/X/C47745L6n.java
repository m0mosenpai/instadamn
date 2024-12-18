package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.L6n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47745L6n {
    public final UserSession A00;
    public final JX5 A01;

    public final String A00(String str, String str2, String str3) {
        String str4 = (String) this.A01.A00(AbstractC46722Klf.A00(str, str2), str3);
        if (str4 == null || str4.length() == 0) {
            return null;
        }
        return str4;
    }

    public C47745L6n(UserSession userSession, C13920nI c13920nI) {
        this.A00 = userSession;
        this.A01 = new JX5(c13920nI);
    }
}
