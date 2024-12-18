package X;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0X7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0X7 {
    public int A01;
    public long[] A03 = new long[5];
    public String[] A06 = new String[5];
    public C0XJ[] A04 = new C0XJ[5];
    public int[] A02 = new int[5];
    public InterfaceC07540aT[] A05 = new InterfaceC07540aT[5];
    public int A00 = 5;

    public final void A00(C0XJ c0xj, InterfaceC07540aT interfaceC07540aT, String str, TimeUnit timeUnit, int i, long j) {
        int i2 = this.A01;
        int i3 = this.A00;
        if (i2 == i3) {
            int i4 = i3 + (i3 >> 1);
            long[] jArr = this.A03;
            if (jArr.length < i4) {
                this.A03 = Arrays.copyOf(jArr, i4);
            }
            String[] strArr = this.A06;
            if (strArr.length < i4) {
                this.A06 = (String[]) Arrays.copyOf(strArr, i4);
            }
            C0XJ[] c0xjArr = this.A04;
            if (c0xjArr.length < i4) {
                this.A04 = (C0XJ[]) Arrays.copyOf(c0xjArr, i4);
            }
            int[] iArr = this.A02;
            if (iArr.length < i4) {
                this.A02 = Arrays.copyOf(iArr, i4);
            }
            InterfaceC07540aT[] interfaceC07540aTArr = this.A05;
            if (interfaceC07540aTArr.length < i4) {
                this.A05 = (InterfaceC07540aT[]) Arrays.copyOf(interfaceC07540aTArr, i4);
            }
            this.A00 = i4;
        }
        if (c0xj != null && !c0xj.A03) {
            throw new IllegalStateException("PointData should be locked before passing to the storage");
        }
        this.A03[this.A01] = timeUnit.toNanos(j);
        String[] strArr2 = this.A06;
        int i5 = this.A01;
        strArr2[i5] = str;
        this.A04[i5] = c0xj;
        this.A02[i5] = i;
        this.A05[i5] = interfaceC07540aT;
        this.A01 = i5 + 1;
    }
}
