package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class ACQ {
    public final QuickPerformanceLogger A00;

    public final /* synthetic */ void A00(String str) {
        C14360o3.A0B(str, 1);
        this.A00.markerPoint(19791876, 0, str, null, System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public final /* synthetic */ void A02(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A00.markerAnnotate(19791876, 0, str, str2);
    }

    public final /* synthetic */ void A01(String str, long j) {
        this.A00.markerPoint(19791876, 0, str, null, j, TimeUnit.NANOSECONDS);
    }

    public ACQ() {
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A00 = c006802i;
    }
}
