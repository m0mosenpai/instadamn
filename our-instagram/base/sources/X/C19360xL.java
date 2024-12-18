package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0xL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19360xL {
    public static volatile C19360xL A0B;
    public int A00;
    public int A01;
    public long A02;
    public C17190tE A03;
    public final java.util.Set A04;
    public final AtomicBoolean A05;
    public final Lock A06;
    public final InterfaceC19630xq A07;
    public final Lock A08;
    public final ReadWriteLock A09;
    public volatile Integer A0A;

    public static C19360xL A00() {
        if (A0B == null) {
            synchronized (C19360xL.class) {
                if (A0B == null) {
                    A0B = new C19360xL();
                }
            }
        }
        return A0B;
    }

    public static void A01(C19360xL c19360xL) {
        if (c19360xL.A03 != null) {
            Lock lock = c19360xL.A08;
            lock.lock();
            try {
                if (c19360xL.A05.compareAndSet(false, true)) {
                    int i = c19360xL.A00;
                    long j = c19360xL.A02;
                    String A00 = AbstractC12380kg.A00(c19360xL.A0A);
                    int i2 = c19360xL.A01;
                    C0L6.A05(C0LK.A9D, String.valueOf(i));
                    C0L6.A05(C0LK.A9q, String.valueOf(j));
                    C0L6.A05(C0LK.A61, A00);
                    C0L6.A05(C0LK.A9E, String.valueOf(i2));
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public static void A02(C19360xL c19360xL, Integer num) {
        if (c19360xL.A0A != num) {
            java.util.Set set = c19360xL.A04;
            synchronized (set) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((InterfaceC10200gc) it.next()).DtB(c19360xL.A0A, num);
                }
            }
            c19360xL.A0A = num;
            InterfaceC19610xo ARD = c19360xL.A07.ARD();
            ARD.E7K("last_django_tier_pref", AbstractC12380kg.A00(num));
            ARD.apply();
        }
    }

    public final Integer A03() {
        if (this.A0A == C05F.A0N) {
            InterfaceC19630xq interfaceC19630xq = this.A07;
            if (interfaceC19630xq.contains("last_django_tier_pref")) {
                String string = interfaceC19630xq.getString("last_django_tier_pref", "UNKNOWN");
                string.getClass();
                this.A0A = AbstractC12370kf.A00(string);
            }
        }
        return this.A0A;
    }

    public C19360xL() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(true);
        this.A09 = reentrantReadWriteLock;
        this.A06 = reentrantReadWriteLock.writeLock();
        this.A08 = reentrantReadWriteLock.readLock();
        this.A05 = new AtomicBoolean();
        this.A07 = AbstractC19750y3.A01("last_django_tier_pref");
        this.A00 = -1;
        this.A02 = -1L;
        this.A01 = -1;
        this.A04 = Collections.synchronizedSet(new HashSet());
        this.A0A = C05F.A0N;
    }
}
