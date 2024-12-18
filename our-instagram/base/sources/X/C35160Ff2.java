package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Ff2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35160Ff2 {
    public static C35160Ff2 A00;
    public static final C34664FOx A02 = new Object();
    public static final long A01 = TimeUnit.HOURS.toMillis(12);

    public final synchronized Integer A01() {
        C34989FbL c34989FbL;
        long currentTimeMillis = System.currentTimeMillis();
        c34989FbL = C34989FbL.A00;
        long j = currentTimeMillis - AbstractC19750y3.A01("age_verification_settings_preferences").getLong("age_verification_settings_cooldown_start_time", -1L);
        if (c34989FbL.A00() == C05F.A0C && j > A01) {
            InterfaceC19610xo ARD = AbstractC19750y3.A01("age_verification_settings_preferences").ARD();
            ARD.E7D("age_verification_settings_blocked_state", 0);
            ARD.apply();
        }
        return c34989FbL.A00();
    }

    public final synchronized void A02() {
        Integer num;
        int i;
        if (C34989FbL.A00.A00().intValue() == 0) {
            num = C05F.A01;
        } else {
            num = C05F.A0C;
        }
        InterfaceC19610xo ARD = AbstractC19750y3.A01("age_verification_settings_preferences").ARD();
        if (1 - num.intValue() != 0) {
            i = 2;
        } else {
            i = 1;
        }
        ARD.E7D("age_verification_settings_blocked_state", i);
        ARD.apply();
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD2 = AbstractC19750y3.A01("age_verification_settings_preferences").ARD();
        ARD2.E7G("age_verification_settings_cooldown_start_time", currentTimeMillis);
        ARD2.apply();
    }

    public static final synchronized C35160Ff2 A00() {
        C35160Ff2 A002;
        synchronized (C35160Ff2.class) {
            A002 = A02.A00();
        }
        return A002;
    }
}
