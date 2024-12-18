package X;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: X.2Bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C46392Bb implements InterfaceC46402Bc {
    public long A00;
    public final long A01;
    public final TreeSet A02 = new TreeSet(new Comparator() { // from class: X.2Be
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
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
    });

    @Override // X.InterfaceC46402Bc
    public final void DEJ(String str, String str2, int i, int i2) {
    }

    @Override // X.InterfaceC46412Bd
    public void DnP(C2QE c2qe, C49802Qq c49802Qq) {
        this.A02.add(c49802Qq);
        this.A00 += c49802Qq.A03;
        A00(c2qe, this, 0L);
    }

    @Override // X.InterfaceC46412Bd
    public void DnQ(C2QE c2qe, C49802Qq c49802Qq) {
        this.A02.remove(c49802Qq);
        this.A00 -= c49802Qq.A03;
    }

    @Override // X.InterfaceC46402Bc
    public void Do1(C2QE c2qe, String str, long j, long j2) {
        if (j2 != -1) {
            A00(c2qe, this, j2);
        }
    }

    public C46392Bb(long j) {
        this.A01 = j;
    }

    public static void A00(C2QE c2qe, C46392Bb c46392Bb, long j) {
        AbstractC460729r.A01("evictCache");
        while (c46392Bb.A00 + j > c46392Bb.A01) {
            TreeSet treeSet = c46392Bb.A02;
            if (treeSet.isEmpty()) {
                break;
            } else {
                c2qe.EGK((C49802Qq) treeSet.first());
            }
        }
        AbstractC460729r.A00();
    }

    @Override // X.InterfaceC46412Bd
    public void DnR(C2QE c2qe, C49802Qq c49802Qq, C49802Qq c49802Qq2) {
        DnQ(c2qe, c49802Qq);
        DnP(c2qe, c49802Qq2);
    }

    @Override // X.InterfaceC46412Bd
    public void DnS(C2QE c2qe, C49802Qq c49802Qq, C49802Qq c49802Qq2, Integer num) {
        DnR(c2qe, c49802Qq, c49802Qq2);
    }
}
