package X;

import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Wwl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71589Wwl implements Runnable {
    public final int A00;
    public final MobileConfigManagerHolderImpl A01;
    public final C1A6 A02;
    public final ScheduledExecutorService A03;

    public RunnableC71589Wwl(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, C1A6 c1a6, ScheduledExecutorService scheduledExecutorService, int i) {
        this.A00 = i;
        this.A01 = mobileConfigManagerHolderImpl;
        this.A03 = scheduledExecutorService;
        this.A02 = c1a6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String A00 = C19S.A00();
        if (!A00.equals("EMPTY_FAMILY_DEVICE_ID")) {
            MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl = this.A01;
            mobileConfigManagerHolderImpl.setFamilyDeviceId(A00);
            mobileConfigManagerHolderImpl.updateConfigs(new C0U3());
            return;
        }
        int i = this.A00;
        if (i > 0) {
            ScheduledExecutorService scheduledExecutorService = this.A03;
            scheduledExecutorService.schedule(new RunnableC71589Wwl(this.A01, this.A02, scheduledExecutorService, i - 1), 100L, TimeUnit.MILLISECONDS);
            return;
        }
        C0K8.A02(RunnableC71589Wwl.class, "Used up all retries. Fail to update configs with non-empty fdid.");
    }
}
