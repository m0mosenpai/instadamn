package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.87R, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87R {
    public final long A00;
    public final C24Q A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final AtomicLong A03 = new AtomicLong(17638221);
    public final UserSession A04;

    public C87R(UserSession userSession) {
        this.A04 = userSession;
        this.A01 = new C24Q(userSession);
        this.A00 = C18U.A01(C06090Tz.A06, userSession, 36599022647381383L);
    }
}
