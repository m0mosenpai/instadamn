package X;

import com.instagram.api.schemas.XFBYPRequestStatus;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2OS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2OS implements InterfaceC13000lm {
    public InterfaceC16820sZ A00;
    public final UserSession A01;

    public C2OS(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public static final void A00(C5F2 c5f2, C2OS c2os, Boolean bool, Integer num, Integer num2) {
        C5F2 A00;
        XFBYPRequestStatus C0J;
        String id;
        UserSession userSession = c2os.A01;
        User A002 = C08730cb.A00(userSession).A00();
        InterfaceC223716s C45 = A002.A03.C45();
        if (C45 != null) {
            C223616r F2e = C45.F2e();
            A002.A03.EfB(VP8.A00(F2e, c5f2, F2e.A01, F2e.A02, F2e.A03, bool, F2e.A05, F2e.A06, F2e.A07, F2e.A08, F2e.A09, F2e.A0A, F2e.A0B, F2e.A0C, F2e.A0D, num2, num, F2e.A0G, F2e.A0H, F2e.A0I));
            A002.A0c(userSession);
            EnumC456327x[] values = EnumC456327x.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (AnonymousClass292.A07(userSession, values[i])) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    C461529z.A05();
                    C455127l.A03(userSession).A0R();
                    C455127l.A03(userSession).A0T();
                    break;
                }
            }
            C455127l.A03(userSession).A0X(false);
            C455127l A03 = C455127l.A03(userSession);
            UserSession userSession2 = A03.A02;
            AnonymousClass282 anonymousClass282 = AnonymousClass280.A01;
            if (anonymousClass282.A0C(userSession2) && !C461529z.A0A(userSession2) && (A00 = AnonymousClass282.A00(userSession2)) != null && (C0J = A00.C0J()) != null && C0J.equals(XFBYPRequestStatus.A07) && (id = A00.getId()) != null) {
                C14360o3.A0B(userSession2, 0);
                if (!anonymousClass282.A06(userSession2).getBoolean(AnonymousClass001.A0R("TIME_LIMIT_EXTENSION_RESULT_REQUEST_ID_PREFIX", id), false)) {
                    GP1 gp1 = new GP1(A03, id);
                    C11T.A01(gp1);
                    C11T.A04(gp1, 2000L);
                }
            }
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        InterfaceC16820sZ interfaceC16820sZ = this.A00;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        this.A00 = null;
    }
}
