package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.32L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32L {
    public final UserSession A00;
    public final C1PK A01;
    public final C32M A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.32M] */
    public C32L(final UserSession userSession, C1PK c1pk) {
        this.A00 = userSession;
        this.A01 = c1pk;
        this.A02 = new Object(userSession) { // from class: X.32M
            public final UserSession A00;
            public final InterfaceC09390do A01;

            {
                C206839Do c206839Do = new C206839Do(userSession, 20);
                this.A00 = userSession;
                this.A01 = AbstractC09440dt.A01(new C206839Do(c206839Do, 21));
                if (!C18U.A06(C06090Tz.A05, userSession, 36317650750150087L)) {
                    this.A01.getValue().hashCode();
                }
            }
        };
    }
}
