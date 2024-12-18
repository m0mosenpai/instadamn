package com.facebook.battery.metrics.threadcpu;

import X.AbstractC02960Bu;
import X.AbstractC02970Bv;
import X.AnonymousClass001;
import X.C0SA;
import X.C0WB;
import X.C55025OXc;
import X.OKO;
import android.util.Log;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ThreadCpuMetricsCollector extends AbstractC02970Bv {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0WB, java.lang.Object] */
    public static C0WB A00(OKO oko) {
        ?? obj = new Object();
        obj.A03 = oko.A01();
        obj.A02 = oko.A00();
        return obj;
    }

    public static final boolean A01(C0SA c0sa) {
        if (c0sa != null) {
            HashMap A00 = C55025OXc.A00();
            if (A00 == null) {
                return false;
            }
            c0sa.A00.keySet().retainAll(A00.keySet());
            for (Map.Entry entry : A00.entrySet()) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getKey());
                    Object obj = ((Pair) entry.getValue()).first;
                    C0WB A002 = A00((OKO) ((Pair) entry.getValue()).second);
                    HashMap hashMap = c0sa.A00;
                    Integer valueOf = Integer.valueOf(parseInt);
                    if (hashMap.containsKey(valueOf)) {
                        ((C0WB) ((Pair) c0sa.A00.get(valueOf)).second).A06(A002);
                    } else {
                        c0sa.A00.put(valueOf, new Pair(obj, A002));
                    }
                } catch (NumberFormatException e) {
                    Log.e("com.facebook.battery.metrics.threadcpu.ThreadCpuMetricsCollector", AnonymousClass001.A0R("Thread Id is not an integer: ", (String) entry.getKey()), e);
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Null value passed to getSnapshot!");
    }

    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03() {
        return new C0SA();
    }

    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ boolean A04(AbstractC02960Bu abstractC02960Bu) {
        return A01((C0SA) abstractC02960Bu);
    }
}
