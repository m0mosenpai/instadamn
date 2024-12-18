package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.503, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass503 {
    public final long A00;
    public final C1QT A01;
    public final UserSession A02;

    public static final boolean A00(AnonymousClass503 anonymousClass503) {
        return C18U.A06(C06090Tz.A05, anonymousClass503.A02, 36319334377004222L);
    }

    public AnonymousClass503(UserSession userSession) {
        this.A02 = userSession;
        C1QT A00 = C1QS.A00(userSession);
        this.A01 = A00;
        this.A00 = A00.generateNewFlowId(760415659);
    }
}
