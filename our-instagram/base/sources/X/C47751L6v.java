package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.L6v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47751L6v {
    public C47909LEd A00;
    public final UserSession A01;

    public final void A00() {
        if (this.A00 == null) {
            C42201xA c42201xA = C1334460n.A01(this.A01, "IgRxPresence").A02;
            C14360o3.A07(c42201xA);
            this.A00 = new C47909LEd(c42201xA.A0K(C48426Lbf.A00).A0N(AbstractC137146It.A00("presence_instagram")));
        }
    }

    public C47751L6v(UserSession userSession) {
        this.A01 = userSession;
    }
}
