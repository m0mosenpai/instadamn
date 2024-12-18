package X;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.4zq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111284zq implements Comparator, InterfaceC46402Bc {
    public AtomicLong A00 = new AtomicLong(0);
    public final float A01;
    public final long A02;
    public final Map A03;
    public final int A04;
    public final Map A05;
    public final NavigableSet A06;

    @Override // X.InterfaceC46402Bc
    public final void DEJ(String str, String str2, int i, int i2) {
    }

    public final void A00(C2QE c2qe, String str, long j) {
        NavigableSet navigableSet;
        try {
            AbstractC460729r.A01("perVideoLRUEvict");
            String A00 = AbstractC49822Qs.A00(str);
            if (A00 != null && (navigableSet = (NavigableSet) this.A05.get(A00)) != null) {
                while (true) {
                    Long l = (Long) this.A03.get(A00);
                    if (l == null || ((float) l.longValue()) / ((float) this.A02) < this.A01 || navigableSet.isEmpty()) {
                        break;
                    } else if (c2qe instanceof C2QD) {
                        ((C2QD) c2qe).A03((C49802Qq) navigableSet.first(), "lru_policy");
                    } else {
                        c2qe.EGK((C49802Qq) navigableSet.first());
                    }
                }
            }
            while (this.A00.get() + j > this.A02) {
                try {
                    C49802Qq c49802Qq = (C49802Qq) this.A06.first();
                    if (c49802Qq != null) {
                        c2qe.EGK(c49802Qq);
                    }
                } catch (NoSuchElementException unused) {
                    AbstractC459729h.A01("PerVideoLruCacheEvictor", "mLeastRecentlyUsed is empty while trying global eviction", new Object[0]);
                }
            }
        } finally {
            AbstractC460729r.A00();
        }
    }

    @Override // X.InterfaceC46412Bd
    public final void DnP(C2QE c2qe, C49802Qq c49802Qq) {
        Long valueOf;
        this.A06.add(c49802Qq);
        AtomicLong atomicLong = this.A00;
        long j = c49802Qq.A03;
        atomicLong.addAndGet(j);
        String str = c49802Qq.A06;
        String A00 = AbstractC49822Qs.A00(str);
        Map map = this.A03;
        Number number = (Number) map.get(A00);
        if (number != null) {
            valueOf = Long.valueOf(number.longValue() + j);
        } else {
            valueOf = Long.valueOf(j);
        }
        map.put(A00, valueOf);
        if (c49802Qq.A04 > this.A04) {
            Map map2 = this.A05;
            java.util.Set set = (java.util.Set) map2.get(A00);
            if (set != null) {
                set.add(c49802Qq);
            } else {
                TreeSet treeSet = new TreeSet(this);
                treeSet.add(c49802Qq);
                map2.put(A00, treeSet);
            }
        }
        if (str != null) {
            A00(c2qe, str, 0L);
        }
    }

    @Override // X.InterfaceC46412Bd
    public final void DnQ(C2QE c2qe, C49802Qq c49802Qq) {
        String A00 = AbstractC49822Qs.A00(c49802Qq.A06);
        if (A00 != null) {
            Map map = this.A03;
            Number number = (Number) map.get(A00);
            if (number != null) {
                long longValue = number.longValue() - c49802Qq.A03;
                Long valueOf = Long.valueOf(longValue);
                if (longValue <= 0) {
                    map.remove(A00);
                } else {
                    map.put(A00, valueOf);
                }
            }
            Map map2 = this.A05;
            java.util.Set set = (java.util.Set) map2.get(A00);
            if (set != null) {
                set.remove(c49802Qq);
                if (set.isEmpty()) {
                    map2.remove(A00);
                }
            }
        }
        this.A06.remove(c49802Qq);
        this.A00.addAndGet(-c49802Qq.A03);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C49802Qq c49802Qq = (C49802Qq) obj;
        C49802Qq c49802Qq2 = (C49802Qq) obj2;
        long j = c49802Qq.A02;
        long j2 = c49802Qq2.A02;
        if (j - j2 == 0) {
            return c49802Qq.compareTo(c49802Qq2);
        }
        if (j >= j2) {
            return 1;
        }
        return -1;
    }

    public C111284zq(long j, int i, double d) {
        j = j <= 0 ? 104857600L : j;
        d = d <= 0.0d ? 0.10000000149011612d : d;
        this.A03 = new HashMap();
        this.A05 = new HashMap();
        this.A06 = new TreeSet(this);
        this.A02 = j;
        this.A04 = i;
        this.A01 = (float) d;
    }

    @Override // X.InterfaceC46412Bd
    public final void DnR(C2QE c2qe, C49802Qq c49802Qq, C49802Qq c49802Qq2) {
        DnQ(c2qe, c49802Qq);
        DnP(c2qe, c49802Qq2);
    }

    @Override // X.InterfaceC46412Bd
    public final void DnS(C2QE c2qe, C49802Qq c49802Qq, C49802Qq c49802Qq2, Integer num) {
        DnQ(c2qe, c49802Qq);
        DnP(c2qe, c49802Qq2);
    }

    @Override // X.InterfaceC46402Bc
    public final void Do1(C2QE c2qe, String str, long j, long j2) {
        A00(c2qe, str, j2);
    }
}
