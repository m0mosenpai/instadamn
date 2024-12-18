package X;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.Pus, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58414Pus {
    public static C58414Pus A04;
    public final Context A02;
    public final ScheduledExecutorService A03;
    public ServiceConnectionC58416Puu A01 = new ServiceConnectionC58416Puu(this);
    public int A00 = 1;

    public static final synchronized C5KS A00(C58414Pus c58414Pus, AbstractC58415Put abstractC58415Put) {
        C5KS c5ks;
        synchronized (c58414Pus) {
            AbstractC58320PtC.A1L("MessengerIpcClient", abstractC58415Put);
            if (!c58414Pus.A01.A02(abstractC58415Put)) {
                ServiceConnectionC58416Puu serviceConnectionC58416Puu = new ServiceConnectionC58416Puu(c58414Pus);
                c58414Pus.A01 = serviceConnectionC58416Puu;
                serviceConnectionC58416Puu.A02(abstractC58415Put);
            }
            c5ks = abstractC58415Put.A03.A00;
        }
        return c5ks;
    }

    public static synchronized C58414Pus A01(Context context) {
        C58414Pus c58414Pus;
        synchronized (C58414Pus.class) {
            c58414Pus = A04;
            if (c58414Pus == null) {
                c58414Pus = new C58414Pus(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC58412Puq("MessengerIpcClient"))));
                A04 = c58414Pus;
            }
        }
        return c58414Pus;
    }

    public C58414Pus(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = scheduledExecutorService;
        this.A02 = context.getApplicationContext();
    }
}
