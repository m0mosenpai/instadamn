package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4Da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92654Da {
    public long A00;
    public final UserSession A01;
    public final C23031Ai A02;

    public final void A00() {
        C23031Ai c23031Ai = this.A02;
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD = c23031Ai.A01.ARD();
        ARD.E7G("notification_feed_304_cooldown_timestamp", currentTimeMillis);
        ARD.apply();
        this.A00 = System.currentTimeMillis();
    }

    public C92654Da(C23031Ai c23031Ai, UserSession userSession) {
        this.A01 = userSession;
        this.A02 = c23031Ai;
        this.A00 = c23031Ai.A01.getLong("notification_feed_304_cooldown_timestamp", 0L);
    }
}
