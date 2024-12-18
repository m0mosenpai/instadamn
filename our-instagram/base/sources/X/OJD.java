package X;

import android.media.projection.MediaProjection;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class OJD {
    public final C54517O6u A00;
    public final O5K A01;
    public final AtomicBoolean A02;
    public final InterfaceC16660sJ A03;
    public final Executor A04;

    public final void A00(MediaProjection mediaProjection) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.A02.compareAndSet(false, true)) {
                this.A04.execute(new RunnableC56965PPg(mediaProjection, this));
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("Minimum SDK version is 29");
    }

    public OJD(C54517O6u c54517O6u, O5K o5k, Executor executor, InterfaceC16660sJ interfaceC16660sJ) {
        MSZ.A1O(executor, interfaceC16660sJ);
        this.A04 = executor;
        this.A01 = o5k;
        this.A00 = c54517O6u;
        this.A03 = interfaceC16660sJ;
        this.A02 = new AtomicBoolean();
    }
}
