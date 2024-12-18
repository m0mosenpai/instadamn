package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
public final class OTE {
    public final C0JO A00;
    public final ExecutorService A01;

    public OTE(int i) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A01 = Executors.newFixedThreadPool(3);
        this.A00 = realtimeSinceBootClock;
    }

    public OTE() {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A01 = Executors.newFixedThreadPool(3);
        this.A00 = realtimeSinceBootClock;
    }
}
