package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.MUm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50579MUm {
    public final long A00;
    public final AtomicLong A01;
    public final AtomicReference A02;

    public C50579MUm(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = C18U.A01(C06090Tz.A05, userSession, 36601380584689843L);
        this.A01 = new AtomicLong(System.currentTimeMillis());
        this.A02 = new AtomicReference(new C51729Mt8());
    }
}
