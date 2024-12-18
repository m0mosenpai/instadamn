package X;

import android.content.Context;
import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.GcM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37320GcM implements Runnable {
    public final /* synthetic */ C65192xH A00;
    public final /* synthetic */ C61902rr A01;

    public RunnableC37320GcM(C65192xH c65192xH, C61902rr c61902rr) {
        this.A01 = c61902rr;
        this.A00 = c65192xH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        C38321qM A0E = AbstractC37300Gc1.A0E(this.A00.A03(0));
        Context context = this.A01.A00.getContext();
        if (context != null && A0E != null) {
            C14120nc.A00().ATO(new C37322GcO(context, this, A0E.getId(), now));
        }
    }
}
