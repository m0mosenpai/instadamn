package X;

import com.google.android.exoplayer2.Timeline;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.4YI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YI extends Timeline {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C5PH A03;
    public final HashMap A04;
    public final int[] A05;
    public final int[] A06;
    public final Timeline[] A07;
    public final Object[] A08;

    public C4YI(C5PH c5ph, Collection collection) {
        int i = 0;
        this.A03 = c5ph;
        this.A00 = ((C5PG) c5ph).A02.length;
        int size = collection.size();
        this.A05 = new int[size];
        this.A06 = new int[size];
        this.A07 = new Timeline[size];
        this.A08 = new Object[size];
        this.A04 = new HashMap();
        Iterator it = collection.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            InterfaceC116495Pe interfaceC116495Pe = (InterfaceC116495Pe) it.next();
            Timeline[] timelineArr = this.A07;
            timelineArr[i3] = interfaceC116495Pe.C8Z();
            this.A06[i3] = i;
            this.A05[i3] = i2;
            Timeline timeline = timelineArr[i3];
            i += timeline.A02();
            i2 += timeline.A01();
            Object[] objArr = this.A08;
            objArr[i3] = interfaceC116495Pe.CCH();
            this.A04.put(objArr[i3], Integer.valueOf(i3));
            i3++;
        }
        this.A02 = i;
        this.A01 = i2;
    }

    public static int A00(C4YI c4yi, int i, boolean z) {
        if (z) {
            C5PG c5pg = (C5PG) c4yi.A03;
            int i2 = c5pg.A01[i] + 1;
            int[] iArr = c5pg.A02;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }
        if (i >= c4yi.A00 - 1) {
            return -1;
        }
        return i + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    @Override // com.google.android.exoplayer2.Timeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4WJ A0D(X.C4WJ r6, int r7, boolean r8) {
        /*
            r5 = this;
            int[] r4 = r5.A05
            int r1 = r7 + 1
            int r3 = java.util.Arrays.binarySearch(r4, r1)
            if (r3 >= 0) goto L32
            int r0 = r3 + 2
            int r3 = -r0
        Ld:
            int[] r0 = r5.A06
            r2 = r0[r3]
            r1 = r4[r3]
            com.google.android.exoplayer2.Timeline[] r0 = r5.A07
            r0 = r0[r3]
            int r7 = r7 - r1
            r0.A0D(r6, r7, r8)
            int r0 = r6.A00
            int r0 = r0 + r2
            r6.A00 = r0
            if (r8 == 0) goto L31
            java.lang.Object[] r0 = r5.A08
            r1 = r0[r3]
            java.lang.Object r0 = r6.A05
            r0.getClass()
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            r6.A05 = r0
        L31:
            return r6
        L32:
            int r3 = r3 + (-1)
            if (r3 < 0) goto Ld
            r0 = r4[r3]
            if (r0 != r1) goto Ld
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4YI.A0D(X.4WJ, int, boolean):X.4WJ");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    @Override // com.google.android.exoplayer2.Timeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C96604Vv A0E(X.C96604Vv r5, int r6, long r7) {
        /*
            r4 = this;
            int[] r3 = r4.A06
            int r1 = r6 + 1
            int r2 = java.util.Arrays.binarySearch(r3, r1)
            if (r2 >= 0) goto L3c
            int r0 = r2 + 2
            int r2 = -r0
        Ld:
            r1 = r3[r2]
            int[] r0 = r4.A05
            r3 = r0[r2]
            com.google.android.exoplayer2.Timeline[] r0 = r4.A07
            r0 = r0[r2]
            int r6 = r6 - r1
            r0.A0E(r5, r6, r7)
            java.lang.Object[] r0 = r4.A08
            r2 = r0[r2]
            java.lang.Object r1 = X.C96604Vv.A0H
            java.lang.Object r0 = r5.A0C
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2f
            java.lang.Object r0 = r5.A0C
            android.util.Pair r2 = android.util.Pair.create(r2, r0)
        L2f:
            r5.A0C = r2
            int r0 = r5.A00
            int r0 = r0 + r3
            r5.A00 = r0
            int r0 = r5.A01
            int r0 = r0 + r3
            r5.A01 = r0
            return r5
        L3c:
            int r2 = r2 + (-1)
            if (r2 < 0) goto Ld
            r0 = r3[r2]
            if (r0 != r1) goto Ld
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4YI.A0E(X.4Vv, int, long):X.4Vv");
    }
}
