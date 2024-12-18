package X;

import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Wwk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71588Wwk implements Runnable {
    public final int A00;
    public final MobileConfigManagerHolderImpl A01;
    public final C1A6 A02;
    public final ScheduledExecutorService A03;

    public RunnableC71588Wwk(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, C1A6 c1a6, ScheduledExecutorService scheduledExecutorService, int i) {
        this.A00 = i;
        this.A01 = mobileConfigManagerHolderImpl;
        this.A02 = c1a6;
        this.A03 = scheduledExecutorService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String A00 = C19S.A00();
        if (!A00.equals("EMPTY_FAMILY_DEVICE_ID")) {
            this.A01.setFamilyDeviceId(A00);
            return;
        }
        int i = this.A00;
        if (i > 0) {
            ScheduledExecutorService scheduledExecutorService = this.A03;
            scheduledExecutorService.schedule(new RunnableC71588Wwk(this.A01, this.A02, scheduledExecutorService, i - 1), 100L, TimeUnit.MILLISECONDS);
            return;
        }
        C0K8.A02(RunnableC71588Wwk.class, "Used up all retries. Fail to update configs with non-empty fdid.");
    }
}
