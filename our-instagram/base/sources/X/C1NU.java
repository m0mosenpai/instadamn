package X;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: X.1NU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NU {
    public int A00;
    public long A02;
    public final PriorityQueue A04;
    public long A01 = Long.MAX_VALUE;
    public final HashMap A03 = new HashMap(0, 0.75f);

    public static final void A00(C1NU c1nu) {
        HashMap hashMap = c1nu.A03;
        for (int size = hashMap.size(); size > 0 && (c1nu.A02 > c1nu.A01 || size > c1nu.A00); size--) {
            CRP crp = (CRP) c1nu.A04.poll();
            if (crp != null) {
                hashMap.remove(crp.A02);
                c1nu.A02 -= crp.A01;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (hashMap.isEmpty() && c1nu.A02 > c1nu.A01) {
            throw new RuntimeException("unable to trim blocker to limits");
        }
    }

    public final void A01(CRP crp, String str) {
        HashMap hashMap = this.A03;
        CRP crp2 = (CRP) hashMap.get(str);
        if (crp2 != null) {
            crp.A01 = crp2.A01;
            this.A04.remove(crp2);
        }
        hashMap.put(str, crp);
        this.A04.add(crp);
        A00(this);
    }

    public C1NU(int i, Comparator comparator) {
        this.A00 = i;
        this.A04 = new PriorityQueue(100, comparator);
    }
}
