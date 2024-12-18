package X;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Bg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C02820Bg {
    public ScheduledFuture A00;
    public final C0ZT A01;
    public final InterfaceC02790Bd A02;
    public final ScheduledExecutorService A03;

    public final synchronized void A00(final C02810Bf c02810Bf) {
        long j = c02810Bf.A00;
        ScheduledFuture scheduledFuture = this.A00;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.A00 = this.A03.scheduleWithFixedDelay(new Runnable(c02810Bf, this) { // from class: X.0Be
            public boolean A00 = true;
            public final C02810Bf A01;
            public final /* synthetic */ C02810Bf A02;
            public final /* synthetic */ C02820Bg A03;

            {
                this.A03 = this;
                this.A02 = c02810Bf;
                this.A01 = c02810Bf;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x0134  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 351
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC02800Be.run():void");
            }
        }, 0L, j, TimeUnit.SECONDS);
    }

    public C02820Bg(InterfaceC02790Bd interfaceC02790Bd, ScheduledExecutorService scheduledExecutorService) {
        C0ZT c0zt = new C0ZT();
        this.A03 = scheduledExecutorService;
        this.A02 = interfaceC02790Bd;
        this.A01 = c0zt;
    }
}
