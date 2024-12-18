package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class WF3 {
    public static int A00(C92124As c92124As, C4BB c4bb, long j) {
        InterfaceC97364Yw A00;
        if (c4bb == null || (A00 = c4bb.A00()) == null) {
            return 0;
        }
        long A002 = c92124As.A00(0);
        long B6h = A00.B6h();
        long max = Math.max(0L, (B6h + A00.BsK(A002)) - 1);
        int BsO = (int) A00.BsO(Math.max(A00.C8V(B6h), (A00.C8V(max) + A00.Azu(max, A002)) - j), A002);
        AbstractC459729h.A01("Exo2DashManifestWrapper", "prefetch: lastSegNum:%d first:%d prefetchStart:%d edgeLatencyMs:%d", Long.valueOf(max), Long.valueOf(B6h), Integer.valueOf(BsO), Long.valueOf(j / 1000));
        return BsO;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Comparator] */
    public static C92214Bb A01(C2BE c2be, C92124As c92124As, String str, List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            arrayList.add(EnumC92204Ba.A0Y);
            return new C92214Bb(((C4BB) list.get(0)).A02, arrayList, -1, 0L, 0L);
        }
        C4B6[] A00 = AbstractC92234Bd.A00(list);
        C4BV c4bv = new C4BV(c92124As.A01(), c92124As.A03(), c92124As.A04());
        if (A00.length == 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        boolean A02 = C4BW.A02(A00[0]);
        int A022 = A02 ? 0 : c2be.A03.A02(null, null, null, A00);
        Arrays.sort(A00, new Object());
        int A05 = c2be.A03.A05(A00);
        C2BK c2bk = new C2BK(c2be.A01, c2be.A09, new C2BG(), c2be.A02.A00());
        EnumC440821q enumC440821q = EnumC440821q.A06;
        int A002 = C2BE.A00(c2be, A02);
        C93644Ip c93644Ip = new C93644Ip();
        c93644Ip.A01 = 0L;
        c93644Ip.A02 = 0L;
        c93644Ip.A03 = 0L;
        c93644Ip.A04 = enumC440821q;
        c93644Ip.A00 = A002;
        C4Iz AT7 = c2bk.AT7(c93644Ip, c4bv, null, null, A00, A022, A05);
        C4B6 c4b6 = AT7.A01;
        if (!A02) {
            c2be.A0D = c4b6;
        }
        long j = AT7.A00;
        arrayList2.add(EnumC92204Ba.A0c);
        C2B1 c2b1 = c2be.A04;
        if (c2b1 != null) {
            c2b1.A01.EbI(str, c4b6.A0T);
        }
        return new C92214Bb(c4b6, arrayList2, 50, j, j);
    }

    public static void A03(C46322Au c46322Au, EnumC91984Ae enumC91984Ae, C92124As c92124As, C4BB c4bb, String str, List list, int i) {
        InterfaceC97364Yw A00;
        android.net.Uri A002;
        if (c4bb == null || (A00 = c4bb.A00()) == null || i < 0) {
            return;
        }
        long j = i;
        long B6h = A00.B6h();
        if (j < B6h || j > (B6h + A00.BsK(0L)) - 1) {
            return;
        }
        String A03 = c4bb.A03();
        C4B0 BsR = A00.BsR(j);
        if (BsR == null || (A002 = BsR.A00(A03)) == null || c46322Au.A01(A002, str) != null) {
            return;
        }
        AbstractC459729h.A01("Exo2DashManifestWrapper", "Enqueue dash live init segment uri: %s", A002);
        list.add(new C69407Vmr(A002, enumC91984Ae, c4bb.A02, c4bb.A02(), (int) (A00.C8V(j) / 1000), (int) (A00.Azu(j, c92124As.A00(0)) / 1000), c4bb instanceof C97814aM ? ((C97814aM) c4bb).BfL(j) : -1, false));
    }

    public static C4BB A02(C4B6 c4b6, List list) {
        if (c4b6 != null && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4BB c4bb = (C4BB) it.next();
                String str = c4bb.A02.A0T;
                if (str != null && str.equals(c4b6.A0T)) {
                    return c4bb;
                }
            }
            return null;
        }
        return null;
    }

    public static void A04(C46322Au c46322Au, EnumC91984Ae enumC91984Ae, C4BB c4bb, String str, List list) {
        C4B0 c4b0;
        if (c4bb != null && (c4b0 = c4bb.A03) != null) {
            android.net.Uri A00 = c4b0.A00(c4bb.A03());
            if (c46322Au.A01(A00, str) == null) {
                AbstractC459729h.A01("Exo2DashManifestWrapper", "Enqueue dash live init segment uri: %s", A00);
                list.add(new C69407Vmr(A00, enumC91984Ae, c4bb.A02, c4bb.A02(), 0, 0, -1, true));
            }
        }
    }
}
