package X;

import com.facebook.analytics.memory.AddressSpace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.2R5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2R5 implements C0TR {
    public static final long A00 = C0AY.A00() / 1024;
    public static final int[] A01 = {8224, 32, 32};

    @Override // X.C0TR
    public final Collection getDataPoints() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new C0TJ(C0TP.A05, AddressSpace.getLargestChunkKb()));
        C0TP c0tp = C0TP.A08;
        long[] jArr = new long[1];
        C0JC.A01("/proc/self/statm", A01, jArr);
        arrayList.add(new C0TJ(c0tp, jArr[0] * A00));
        return arrayList;
    }

    @Override // X.C0TR
    public final /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    @Override // X.C0TR
    public final boolean shouldCollectMetrics(int i) {
        return (i & 8) != 0;
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
