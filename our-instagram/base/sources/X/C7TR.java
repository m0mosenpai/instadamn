package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7TR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7TR implements C7TS {
    public final UserSession A00;

    public C7TR(UserSession userSession) {
        this.A00 = userSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1gF, X.1OW] */
    @Override // X.C7TS
    public final void Ch4(C3o9 c3o9) {
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A00;
        JTa A08 = AbstractC31277Doz.A08(userSession, C32291gF.class);
        C14360o3.A0B(A08, 1);
        C14360o3.A0B(A01, 2);
        ?? c1ow = new C1OW(A08);
        if (A01.A00 != null) {
            c1ow.A00 = A01;
            C26141Ov.A01(userSession).A0B(c1ow);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
