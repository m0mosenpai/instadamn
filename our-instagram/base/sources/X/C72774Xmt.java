package X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.Xmt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72774Xmt {
    public static C72774Xmt A03;
    public final C02810Bf A00;
    public final C02810Bf A01;
    public final C02820Bg A02;

    public C72774Xmt(AbstractC12990ll abstractC12990ll) {
        C02810Bf c02810Bf;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A01 = new C02810Bf("foreground", C18U.A01(c06090Tz, abstractC12990ll, 36592867959309030L), C18U.A01(c06090Tz, abstractC12990ll, 36592867958981345L), C18U.A01(c06090Tz, abstractC12990ll, 36592867959046882L));
        this.A00 = new C02810Bf(AppStateModule.APP_STATE_BACKGROUND, C18U.A01(c06090Tz, abstractC12990ll, 36592867958915808L), C18U.A01(c06090Tz, abstractC12990ll, 36592867959243493L), C18U.A01(c06090Tz, abstractC12990ll, 36592867959112419L));
        C02820Bg c02820Bg = new C02820Bg(new Y9Q(newSingleThreadScheduledExecutor, C18U.A01(c06090Tz, abstractC12990ll, 36592867959177956L) * 1000), newSingleThreadScheduledExecutor);
        this.A02 = c02820Bg;
        if (C218914p.A08()) {
            c02810Bf = this.A00;
        } else {
            c02810Bf = this.A01;
        }
        c02820Bg.A00(c02810Bf);
    }
}
