package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OBa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54625OBa {
    public final long A00;
    public final C1QT A01;
    public final UserSession A02;
    public final C47Z A03;

    public C54625OBa(UserSession userSession, C47Z c47z) {
        this.A02 = userSession;
        this.A03 = c47z;
        C1QT A00 = C1QS.A00(userSession);
        this.A01 = A00;
        this.A00 = A00.generateFlowId(356981044, c47z.A35.hashCode());
    }
}
