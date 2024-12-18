package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Cs, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Cs {
    public final HashMap A00;
    public final int A02;
    public final long A03;
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final ReentrantReadWriteLock A01 = new ReentrantReadWriteLock();

    public C0Cs(TimeUnit timeUnit, int i) {
        this.A02 = i;
        this.A00 = new HashMap(i);
        this.A03 = TimeUnit.NANOSECONDS.convert(30L, timeUnit);
    }

    public final Object A00(Object obj) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.A01;
        reentrantReadWriteLock.readLock().lock();
        try {
            HashMap hashMap = this.A00;
            C03150Cr c03150Cr = (C03150Cr) hashMap.get(obj);
            if (c03150Cr == null) {
                return null;
            }
            long nanoTime = System.nanoTime();
            c03150Cr.A00 = nanoTime;
            long j = c03150Cr.A01 - nanoTime;
            boolean z = false;
            if (j > 0) {
                z = true;
            }
            if (z) {
                return c03150Cr.A02;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                hashMap.remove(obj, c03150Cr);
                return null;
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    public final void A01(Object obj, Object obj2) {
        C03150Cr c03150Cr = new C03150Cr(obj2, this.A03);
        ReentrantReadWriteLock reentrantReadWriteLock = this.A01;
        reentrantReadWriteLock.writeLock().lock();
        try {
            HashMap hashMap = this.A00;
            C03150Cr c03150Cr2 = (C03150Cr) hashMap.remove(obj);
            if (hashMap.size() == this.A02) {
                Iterator it = hashMap.entrySet().iterator();
                long nanoTime = System.nanoTime();
                long j = Long.MAX_VALUE;
                Object obj3 = null;
                char c = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (c >= 1) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((C03150Cr) entry.getValue()).A01 - nanoTime > 0) {
                            if (((C03150Cr) entry.getValue()).A00 < j) {
                                obj3 = entry.getKey();
                                j = ((C03150Cr) entry.getValue()).A00;
                            }
                        } else {
                            it.remove();
                            c = 1;
                        }
                    } else if (c < 1) {
                        hashMap.remove(obj3);
                    }
                }
            }
            hashMap.put(obj, c03150Cr);
            if (c03150Cr2 != null) {
                c03150Cr2.A00 = System.nanoTime();
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}
