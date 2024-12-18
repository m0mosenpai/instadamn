package X;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0uw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18120uw {
    public static final AtomicInteger A09 = new AtomicInteger(0);
    public C0TA A00;
    public C0TF A01;
    public ReferenceQueue A02;
    public final C0TC A03;
    public final C0TE A04;
    public final boolean A06;
    public final java.util.Set A05 = new HashSet();
    public final String[] A08 = new String[1];
    public final long[] A07 = new long[1];

    public final void A00() {
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.A02 = referenceQueue;
        C0TF c0tf = new C0TF(this, referenceQueue, A09.getAndIncrement());
        this.A01 = c0tf;
        c0tf.start();
        C0TA c0ta = new C0TA(this);
        this.A00 = c0ta;
        c0ta.start();
    }

    public void allocationCallback(Object obj, long j, String str) {
        Reference c18080us;
        if (obj == null) {
            long[] jArr = this.A07;
            jArr[0] = j;
            C0TC c0tc = this.A03;
            String[] strArr = this.A08;
            c0tc.onDeallocation(jArr, strArr, 1);
            strArr[0] = null;
            return;
        }
        ReferenceQueue referenceQueue = this.A02;
        if (referenceQueue == null) {
            return;
        }
        Long valueOf = Long.valueOf(j);
        if (this.A06) {
            c18080us = new C18100uu(obj, valueOf, referenceQueue);
        } else {
            c18080us = new C18080us(obj, valueOf, referenceQueue);
        }
        java.util.Set set = this.A05;
        synchronized (set) {
            set.add(c18080us);
        }
    }

    public C18120uw(C0TC c0tc, C0TE c0te, boolean z) {
        this.A03 = c0tc;
        this.A04 = c0te;
        this.A06 = z;
    }
}
