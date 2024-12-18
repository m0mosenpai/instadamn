package X;

/* loaded from: classes10.dex */
public final class SK0 {
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A00(C58545PxD c58545PxD, Object obj) {
        long A0I;
        C58555PxV c58555PxV;
        int i;
        Object valueOf;
        int i2;
        C58555PxV c58555PxV2;
        AbstractC58536Px4 abstractC58536Px4;
        int i3 = c58545PxD.A02;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 == 5) {
                                C58545PxD.A02(c58545PxD, 5);
                                c58555PxV = (C58555PxV) obj;
                                i = (i4 << 3) | 5;
                                valueOf = Integer.valueOf(c58545PxD.A03.A0A());
                                c58555PxV.A02(i, valueOf);
                                return true;
                            }
                            throw C61032Re1.A00();
                        }
                        return false;
                    }
                    C58555PxV c58555PxV3 = new C58555PxV();
                    int i6 = i4 << 3;
                    int i7 = i6 | 4;
                    do {
                        int i8 = c58545PxD.A01;
                        if (i8 != 0) {
                            c58545PxD.A02 = i8;
                            c58545PxD.A01 = 0;
                        } else {
                            i8 = c58545PxD.A03.A0E();
                            c58545PxD.A02 = i8;
                            if (i8 == 0) {
                                break;
                            }
                        }
                        if (i8 == c58545PxD.A00 || (i8 >>> 3) == Integer.MAX_VALUE) {
                            break;
                        }
                    } while (A00(c58545PxD, c58555PxV3));
                    if (i7 == c58545PxD.A02) {
                        if (c58555PxV3.A02) {
                            c58555PxV3.A02 = false;
                        }
                        i2 = i6 | 3;
                        abstractC58536Px4 = c58555PxV3;
                        c58555PxV2 = (C58555PxV) obj;
                    } else {
                        throw C61032Re1.A01("Protocol message end-group tag did not match expected tag.");
                    }
                } else {
                    C58545PxD.A02(c58545PxD, 2);
                    i2 = (i4 << 3) | 2;
                    abstractC58536Px4 = c58545PxD.A03.A0M();
                    c58555PxV2 = (C58555PxV) obj;
                }
                c58555PxV2.A02(i2, abstractC58536Px4);
                return true;
            }
            C58545PxD.A02(c58545PxD, 1);
            A0I = c58545PxD.A03.A0H();
            c58555PxV = (C58555PxV) obj;
            i = (i4 << 3) | 1;
        } else {
            C58545PxD.A02(c58545PxD, 0);
            A0I = c58545PxD.A03.A0I();
            c58555PxV = (C58555PxV) obj;
            i = i4 << 3;
        }
        valueOf = Long.valueOf(A0I);
        c58555PxV.A02(i, valueOf);
        return true;
    }
}
