package X;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.4aP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97844aP implements C4WE {
    public int A00;
    public final int A01;
    public final C4B6[] A02;
    public final long[] A03;
    public final C4WV A04;
    public final int[] A05;

    @Override // X.C4WF
    public final int CNI(int i) {
        for (int i2 = 0; i2 < this.A01; i2++) {
            if (this.A05[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.C4WF
    public final int CNJ(C4B6 c4b6) {
        boolean equals;
        for (int i = 0; i < this.A01; i++) {
            C4B6[] c4b6Arr = this.A02;
            C4B6 c4b62 = c4b6Arr[i];
            if (c4b62 != c4b6) {
                if (c4b62.A0T != null) {
                    equals = c4b6Arr[i].A0T.equals(c4b6.A0T);
                } else if (c4b6.A0T == null) {
                    equals = c4b6Arr[i].equals(c4b6);
                } else {
                    continue;
                }
                if (!equals) {
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AbstractC97844aP abstractC97844aP = (AbstractC97844aP) obj;
            if (this.A04 != abstractC97844aP.A04 || !Arrays.equals(this.A05, abstractC97844aP.A05)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C4WF
    public final C4B6 B7x(int i) {
        return this.A02[i];
    }

    @Override // X.C4WF
    public final int BHT(int i) {
        return this.A05[i];
    }

    @Override // X.C4WF
    public final long BUB(C4TG c4tg, InterfaceC97914aW interfaceC97914aW, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, boolean z2, boolean z3) {
        if (this instanceof C97834aO) {
            return ((C97834aO) this).A01.BUB(c4tg, interfaceC97914aW, j, j2, j3, j4, j5, j6, j7, j8, j9, z, z2, z3);
        }
        return -9223372036854775807L;
    }

    @Override // X.C4WE
    public final C4B6 Bsc() {
        return this.A02[Bsd()];
    }

    @Override // X.C4WF
    public final C4WV CAE() {
        return this.A04;
    }

    @Override // X.C4WE
    public final boolean CQd(int i, long j) {
        if (this.A03[i] <= j) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r2.A04 != r4) goto L8;
     */
    @Override // X.C4WE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void DYy(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C97834aO
            if (r0 == 0) goto L15
            r2 = r3
            X.4aO r2 = (X.C97834aO) r2
            boolean r0 = r2.A03
            if (r0 != 0) goto L10
            boolean r1 = r2.A04
            r0 = 0
            if (r1 == r4) goto L11
        L10:
            r0 = 1
        L11:
            r2.A03 = r0
            r2.A04 = r4
        L15:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC97844aP.DYy(boolean):void");
    }

    @Override // X.C4WE
    public final void DZ8(float f) {
        if (this instanceof C97834aO) {
            ((C97834aO) this).A00 = f;
        }
    }

    @Override // X.C4WE
    public final /* synthetic */ boolean EiE(AbstractC98234b2 abstractC98234b2, List list, long j) {
        if (this instanceof C97834aO) {
            C97834aO c97834aO = (C97834aO) this;
            if (c97834aO.A03) {
                c97834aO.A03 = false;
                return !c97834aO.A04;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int identityHashCode = (System.identityHashCode(this.A04) * 31) + Arrays.hashCode(this.A05);
            this.A00 = identityHashCode;
            return identityHashCode;
        }
        return i;
    }

    @Override // X.C4WF
    public final int length() {
        return this.A05.length;
    }

    public AbstractC97844aP(C4WV c4wv, int[] iArr) {
        int i;
        int length = iArr.length;
        C4B8.A04(length > 0);
        this.A04 = c4wv;
        this.A01 = length;
        C4B6[] c4b6Arr = new C4B6[length];
        this.A02 = c4b6Arr;
        for (int i2 = 0; i2 < length; i2++) {
            c4b6Arr[i2] = c4wv.A04[iArr[i2]];
        }
        Arrays.sort(c4b6Arr, new Comparator() { // from class: X.4aQ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C4B6) obj2).A05 - ((C4B6) obj).A05;
            }
        });
        int i3 = this.A01;
        int[] iArr2 = new int[i3];
        this.A05 = iArr2;
        for (int i4 = 0; i4 < i3; i4++) {
            C4B6 c4b6 = this.A02[i4];
            while (true) {
                C4B6[] c4b6Arr2 = c4wv.A04;
                if (i < c4b6Arr2.length) {
                    i = c4b6 != c4b6Arr2[i] ? i + 1 : 0;
                } else {
                    i = -1;
                    break;
                }
            }
            iArr2[i4] = i;
        }
        this.A03 = new long[i3];
    }

    @Override // X.C4WE
    public final boolean AE3(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean CQd = CQd(i, elapsedRealtime);
        int i2 = 0;
        while (true) {
            if (i2 < this.A01) {
                if (CQd) {
                    break;
                }
                if (i2 != i) {
                    CQd = true;
                    if (!CQd(i2, elapsedRealtime)) {
                        i2++;
                    }
                }
                CQd = false;
                i2++;
            } else if (!CQd) {
                return false;
            }
        }
        long[] jArr = this.A03;
        long j2 = jArr[i];
        long j3 = elapsedRealtime + j;
        if (((elapsedRealtime ^ j3) & (j ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // X.C4WE
    public final int AT9(List list, long j) {
        return list.size();
    }

    @Override // X.C4WE
    public void FC5(InterfaceC97914aW interfaceC97914aW, AbstractC98474bQ abstractC98474bQ, long j, long j2, long j3, long j4, boolean z, boolean z2) {
    }
}
