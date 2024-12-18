package X;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes10.dex */
public final class TSP implements Comparator, InterfaceC46402Bc {
    public long A00;
    public long A01;
    public NavigableSet A02;
    public SortedSet A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final long A07;
    public final Map A08;
    public final int A09;
    public final Map A0A;

    @Override // X.InterfaceC46402Bc
    public final void DEJ(String str, String str2, int i, int i2) {
    }

    public final void A00(C2QE c2qe, String str, long j) {
        NavigableSet navigableSet;
        try {
            AbstractC460729r.A01("preVideoLruProtectPrefetchEvict");
            String A00 = AbstractC49822Qs.A00(str);
            if (A00 != null && (navigableSet = (NavigableSet) this.A0A.get(A00)) != null) {
                while (true) {
                    Long l = (Long) this.A08.get(A00);
                    if (l == null || ((float) l.longValue()) / ((float) this.A07) < this.A05 || navigableSet.isEmpty()) {
                        break;
                    }
                    C49802Qq c49802Qq = (C49802Qq) navigableSet.first();
                    if (c2qe instanceof C2QD) {
                        ((C2QD) c2qe).A03(c49802Qq, "lru_policy");
                    } else {
                        c2qe.EGK(c49802Qq);
                    }
                }
            }
            while (true) {
                long j2 = this.A00;
                long j3 = this.A01;
                long j4 = j2 + j3 + j;
                long j5 = this.A07;
                if (j4 > j5) {
                    if (((float) j3) > ((float) j5) * this.A04 || this.A03.isEmpty()) {
                        NavigableSet navigableSet2 = this.A02;
                        if (!navigableSet2.isEmpty()) {
                            c2qe.EGK((C49802Qq) navigableSet2.first());
                        }
                    }
                    SortedSet sortedSet = this.A03;
                    if (sortedSet.isEmpty()) {
                        break;
                    } else {
                        c2qe.EGK((C49802Qq) sortedSet.first());
                    }
                } else {
                    break;
                }
            }
        } finally {
            AbstractC460729r.A00();
        }
    }

    @Override // X.InterfaceC46412Bd
    public final void DnP(C2QE c2qe, C49802Qq c49802Qq) {
        long j;
        new TOD(this, c49802Qq).run();
        String str = c49802Qq.A06;
        String A00 = AbstractC49822Qs.A00(str);
        if (A00 != null) {
            Map map = this.A08;
            Number A0Q = AbstractC37300Gc1.A0Q(A00, map);
            if (A0Q != null) {
                j = A0Q.longValue() + c49802Qq.A03;
            } else {
                j = c49802Qq.A03;
            }
            AbstractC43592JPx.A1V(A00, j, map);
            if (c49802Qq.A04 > this.A09) {
                Map map2 = this.A0A;
                java.util.Set set = (java.util.Set) map2.get(A00);
                if (set != null) {
                    set.add(c49802Qq);
                } else {
                    TreeSet treeSet = new TreeSet(this);
                    treeSet.add(c49802Qq);
                    map2.put(A00, treeSet);
                }
            }
        }
        A00(c2qe, str, 0L);
    }

    @Override // X.InterfaceC46412Bd
    public final void DnQ(C2QE c2qe, C49802Qq c49802Qq) {
        String A00 = AbstractC49822Qs.A00(c49802Qq.A06);
        if (A00 != null) {
            Map map = this.A08;
            Number A0Q = AbstractC37300Gc1.A0Q(A00, map);
            if (A0Q != null) {
                long longValue = A0Q.longValue() - c49802Qq.A03;
                Long valueOf = Long.valueOf(longValue);
                if (longValue <= 0) {
                    map.remove(A00);
                } else {
                    map.put(A00, valueOf);
                }
            }
            Map map2 = this.A0A;
            java.util.Set set = (java.util.Set) map2.get(A00);
            if (set != null) {
                set.remove(c49802Qq);
                if (set.isEmpty()) {
                    map2.remove(A00);
                }
            }
        }
        new TOE(this, c49802Qq).run();
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

    public TSP(double d, double d2, int i, int i2, long j) {
        j = j <= 0 ? 104857600L : j;
        d = d <= 0.0d ? 0.10000000149011612d : d;
        d2 = d2 <= 0.0d ? 0.30000001192092896d : d2;
        this.A08 = AbstractC166987dD.A1G();
        this.A0A = AbstractC166987dD.A1G();
        this.A07 = j;
        this.A09 = i;
        this.A05 = (float) d;
        this.A06 = i2;
        this.A04 = (float) d2;
        this.A01 = 0L;
        this.A00 = 0L;
        this.A02 = new TreeSet(this);
        this.A03 = new TreeSet(this);
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
