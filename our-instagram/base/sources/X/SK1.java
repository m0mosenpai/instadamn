package X;

/* loaded from: classes10.dex */
public final class SK1 {
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A00(C63401SjW c63401SjW, Object obj) {
        long A0J;
        C63022Saq c63022Saq;
        int i;
        Object valueOf;
        int i2;
        C63022Saq c63022Saq2;
        AbstractC64538TIu abstractC64538TIu;
        int i3 = c63401SjW.A02;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 == 5) {
                                C63401SjW.A0C(c63401SjW, 5);
                                c63022Saq = (C63022Saq) obj;
                                i = (i4 << 3) | 5;
                                valueOf = Integer.valueOf(c63401SjW.A03.A0B());
                                c63022Saq.A01(i, valueOf);
                                return true;
                            }
                            throw C4L5.A00();
                        }
                        return false;
                    }
                    C63022Saq c63022Saq3 = new C63022Saq();
                    int i6 = i4 << 3;
                    int i7 = i6 | 4;
                    while (c63401SjW.A0D() != Integer.MAX_VALUE && A00(c63401SjW, c63022Saq3)) {
                    }
                    if (i7 == c63401SjW.A02) {
                        c63022Saq3.A02 = false;
                        i2 = i6 | 3;
                        abstractC64538TIu = c63022Saq3;
                        c63022Saq2 = (C63022Saq) obj;
                    } else {
                        throw AbstractC58320PtC.A0e("Protocol message end-group tag did not match expected tag.");
                    }
                } else {
                    C63401SjW.A0C(c63401SjW, 2);
                    i2 = (i4 << 3) | 2;
                    abstractC64538TIu = c63401SjW.A03.A0N();
                    c63022Saq2 = (C63022Saq) obj;
                }
                c63022Saq2.A01(i2, abstractC64538TIu);
                return true;
            }
            C63401SjW.A0C(c63401SjW, 1);
            A0J = c63401SjW.A03.A0I();
            c63022Saq = (C63022Saq) obj;
            i = (i4 << 3) | 1;
        } else {
            A0J = C63401SjW.A03(c63401SjW).A0J();
            c63022Saq = (C63022Saq) obj;
            i = i4 << 3;
        }
        valueOf = Long.valueOf(A0J);
        c63022Saq.A01(i, valueOf);
        return true;
    }
}
