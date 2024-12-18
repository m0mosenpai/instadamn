package X;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes8.dex */
public final class M2A implements Runnable {
    public final /* synthetic */ C132525yb A00;

    public M2A(C132525yb c132525yb) {
        this.A00 = c132525yb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager powerManager;
        C132525yb c132525yb = this.A00;
        c132525yb.A02.invoke(EnumC132075xi.A07);
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        Object systemService = context.getSystemService("power");
        if ((systemService instanceof PowerManager) && (powerManager = (PowerManager) systemService) != null && powerManager.isDeviceIdleMode()) {
            c132525yb.A05.flowAnnotate(c132525yb.A04, "is_idle_mode", true);
        }
        c132525yb.A05.flowEndSuccess(c132525yb.A04);
        c132525yb.A01 = null;
        c132525yb.A03 = false;
        c132525yb.A00 = -1;
    }
}
