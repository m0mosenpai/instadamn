package com.facebook.memorytimeline.nativeheap;

import X.C09170dP;
import X.C0TG;
import X.C0TJ;
import X.C0TP;
import X.C0TQ;
import X.C0TR;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public class NativeHeapMemoryTimelineMetricSource implements C0TR {
    public boolean mLibraryLoaded;

    public static native void nativeGetNativeHeapStats(long[] jArr);

    @Override // X.C0TR
    public /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    @Override // X.C0TR
    public boolean shouldCollectMetrics(int i) {
        return (i & 4) != 0;
    }

    @Override // X.C0TR
    public /* synthetic */ boolean shouldCollectMetrics(int i, C0TG c0tg) {
        return C0TQ.A00(c0tg, this, i);
    }

    @Override // X.C0TR
    public /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }

    @Override // X.C0TR
    public Collection getDataPoints() {
        if (!this.mLibraryLoaded) {
            C09170dP.A0C("nativeheapstats");
            this.mLibraryLoaded = true;
        }
        long[] jArr = new long[3];
        nativeGetNativeHeapStats(jArr);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0TJ(C0TP.A0m, jArr[0] / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
        arrayList.add(new C0TJ(C0TP.A0n, jArr[1] / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
        arrayList.add(new C0TJ(C0TP.A0o, jArr[2] / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
        return arrayList;
    }
}
