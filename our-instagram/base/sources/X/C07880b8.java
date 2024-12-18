package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.0b8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07880b8 {
    public static final C07950bF A00(C16L c16l, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C0f7.A00();
        return new C07950bF(c16l, userSession, new C1Do(C1D3.A01.A00(userSession).A00().consistencyService));
    }

    public final C07950bF A01(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C07950bF A00 = A00(AbstractC221915u.A00.A03(str), userSession);
        A00.A1J();
        return A00;
    }

    public final C07950bF A02(UserSession userSession, byte[] bArr) {
        C14360o3.A0B(bArr, 1);
        C07950bF A00 = A00(AbstractC221915u.A00.A04(bArr), userSession);
        A00.A1J();
        return A00;
    }
}
