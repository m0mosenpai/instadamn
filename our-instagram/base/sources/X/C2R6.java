package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2R6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2R6 implements C0TR {
    public C0IP A00;

    @Override // X.C0TR
    public final /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    @Override // X.C0TR
    public final boolean shouldCollectMetrics(int i) {
        return (i & 16) != 0;
    }

    @Override // X.C0TR
    public final /* synthetic */ boolean shouldCollectMetrics(int i, C0TG c0tg) {
        return C0TQ.A00(c0tg, this, i);
    }

    @Override // X.C0TR
    public final /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [X.0Td, java.lang.Object] */
    @Override // X.C0TR
    public final Collection getDataPoints() {
        Map map;
        List<C0J2> unmodifiableList;
        String num;
        boolean z;
        ArrayList arrayList = new ArrayList();
        C0IP c0ip = this.A00;
        synchronized (c0ip) {
            long nanoTime = System.nanoTime();
            map = c0ip.A02;
            if (map == null || nanoTime >= c0ip.A00) {
                c0ip.A00 = nanoTime + 50000000;
                HashMap hashMap = new HashMap();
                C03420Gu c03420Gu = c0ip.A01;
                synchronized (c03420Gu) {
                    try {
                        if (!c03420Gu.A04) {
                            unmodifiableList = Collections.emptyList();
                        } else {
                            C03830Iy c03830Iy = c03420Gu.A02;
                            synchronized (c03830Iy) {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(c03830Iy.A02);
                                    boolean z2 = false;
                                    if (c03830Iy.A00 < System.nanoTime()) {
                                        z2 = true;
                                    }
                                    if (z2) {
                                        c03830Iy.A00 = System.nanoTime() + 1000000000;
                                    }
                                    for (C0J2 c0j2 : c03830Iy.A01.values()) {
                                        if (z2) {
                                            if (!c0j2.A01.equals(C0J3.A00(c0j2.A00))) {
                                                c03420Gu.A01(c0j2.A00);
                                            }
                                        }
                                        arrayList2.add(c0j2);
                                    }
                                    unmodifiableList = Collections.unmodifiableList(arrayList2);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                for (C0J2 c0j22 : unmodifiableList) {
                    int i = c0j22.A00;
                    int[] iArr = C05930Td.A03;
                    if (i == 0) {
                        num = "self";
                    } else {
                        num = Integer.toString(i);
                    }
                    long[] jArr = new long[2];
                    if (C0JC.A01(AnonymousClass001.A0g("/proc/", num, "/statm"), C05930Td.A03, jArr)) {
                        long j = jArr[0];
                        long j2 = C05930Td.A02;
                        long j3 = j * j2;
                        long j4 = (j - jArr[1]) * j2;
                        ?? obj = new Object();
                        obj.A01 = j3;
                        obj.A00 = j4;
                        z = obj;
                    } else {
                        z = false;
                    }
                    if (z) {
                        hashMap.put(c0j22.A01, z);
                    }
                }
                map = Collections.unmodifiableMap(hashMap);
                c0ip.A02 = map;
            }
        }
        long j5 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            long j6 = ((C05930Td) entry.getValue()).A00;
            long j7 = ((C05930Td) entry.getValue()).A01;
            if (j6 > 0) {
                j5 += j6;
                arrayList.add(new C0TJ(C0TP.A0q.A00(str), -1L, j6));
            }
            if (j7 > 0) {
                arrayList.add(new C0TJ(C0TP.A0r.A00(str), -1L, j7));
            }
        }
        if (arrayList.size() > 0) {
            arrayList.add(new C0TJ(C0TP.A09, -1L, j5));
        }
        return arrayList;
    }
}
