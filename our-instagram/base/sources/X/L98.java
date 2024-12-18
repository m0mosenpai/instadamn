package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class L98 {
    public long A00;
    public final long A01;
    public final C24Q A02;
    public final String A03;
    public final String A04;
    public final AtomicBoolean A05;
    public final AtomicBoolean A06;
    public final UserSession A07;

    public L98(UserSession userSession, String str, String str2) {
        C14360o3.A0B(str2, 3);
        this.A07 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = new C24Q(userSession);
        this.A06 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
        this.A00 = 17633831L;
        this.A01 = C18U.A01(C06090Tz.A06, userSession, 36599022647512457L);
    }

    public final void A01(String str) {
        if (this.A06.getAndSet(false) && this.A05.getAndSet(false)) {
            C24Q c24q = this.A02;
            if (c24q.A0E(17633831, this.A00)) {
                this.A00 = c24q.A06(CancelReason.USER_CANCELLED, str, 17633831, this.A00);
                return;
            }
            int hashCode = UUID.randomUUID().hashCode();
            c24q.A06(CancelReason.USER_CANCELLED, AnonymousClass001.A0R(str, "|old_flow_timed_out"), 17633831, c24q.A04(Integer.valueOf(hashCode), null, 17633831, this.A01));
        }
    }

    public final void A00() {
        if (this.A06.get() && this.A05.getAndSet(false)) {
            this.A00 = this.A02.A02(17633831, this.A00);
        }
    }
}
