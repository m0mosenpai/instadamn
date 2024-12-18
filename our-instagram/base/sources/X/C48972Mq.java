package X;

import java.util.concurrent.Executor;

/* renamed from: X.2Mq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48972Mq {
    public boolean A00 = false;
    public final C1UI A01;
    public final C1TZ A02;
    public final Executor A03;
    public final boolean A04;

    public static void A00(C48972Mq c48972Mq) {
        C1UP c1up = (C1UP) c48972Mq.A01.A00("AppModules::NeedToFallbackDownload");
        C1UP.A03(c1up);
        C1ZT c1zt = new C1ZT(c1up);
        c1zt.A0A("key::NeedFallback", false);
        c1zt.A03();
    }

    public C48972Mq(C1UI c1ui, C1TZ c1tz, Executor executor, boolean z) {
        this.A03 = executor;
        this.A02 = c1tz;
        this.A04 = z;
        this.A01 = c1ui;
    }
}
