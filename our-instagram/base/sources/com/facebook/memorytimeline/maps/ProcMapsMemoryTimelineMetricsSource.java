package com.facebook.memorytimeline.maps;

import X.AbstractC167007dF;
import X.C09170dP;
import X.C0TG;
import X.C0TQ;
import X.C0TR;
import X.EnumC58457Pvg;
import java.util.Map;

/* loaded from: classes10.dex */
public class ProcMapsMemoryTimelineMetricsSource implements C0TR {
    public final EnumC58457Pvg[] mMapEntryCategories = {EnumC58457Pvg.A07};

    public static native void nativeParseMaps(String[] strArr, long[] jArr);

    @Override // X.C0TR
    public /* synthetic */ boolean shouldCollectMetrics(int i, C0TG c0tg) {
        return C0TQ.A00(c0tg, this, i);
    }

    static {
        C09170dP.A0C("mapsreader");
    }

    @Override // X.C0TR
    public /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    @Override // X.C0TR
    public boolean shouldCollectMetrics(int i) {
        return AbstractC167007dF.A1M(i & 32);
    }

    @Override // X.C0TR
    public /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }

    public ProcMapsMemoryTimelineMetricsSource(boolean z) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0140, code lost:
    
        if (r0 == false) goto L68;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x007b. Please report as an issue. */
    @Override // X.C0TR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection getDataPoints() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.memorytimeline.maps.ProcMapsMemoryTimelineMetricsSource.getDataPoints():java.util.Collection");
    }
}
