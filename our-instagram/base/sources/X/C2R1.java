package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.2R1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2R1 implements C0TR {
    public static final int[] A00 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 8224, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    @Override // X.C0TR
    public final synchronized Collection getDataPoints() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        long[] jArr = new long[1];
        C0JC.A01("/proc/self/stat", A00, jArr);
        arrayList.add(new C0TJ(C0TP.A13, jArr[0]));
        return arrayList;
    }

    @Override // X.C0TR
    public final /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    @Override // X.C0TR
    public final boolean shouldCollectMetrics(int i) {
        return (i & 2) != 0;
    }

    @Override // X.C0TR
    public final /* synthetic */ boolean shouldCollectMetrics(int i, C0TG c0tg) {
        return C0TQ.A00(c0tg, this, i);
    }

    @Override // X.C0TR
    public final /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }
}
