package X;

/* renamed from: X.SJf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62622SJf {
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A00(InterfaceC65598Tnk interfaceC65598Tnk, Object obj) {
        long A0C;
        C58373PuD c58373PuD;
        int i;
        Object valueOf;
        int i2;
        C58373PuD c58373PuD2;
        AbstractC58387PuR abstractC58387PuR;
        C58408Pum c58408Pum = (C58408Pum) interfaceC65598Tnk;
        int i3 = c58408Pum.A02;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 == 5) {
                                C58408Pum.A06(c58408Pum, 5);
                                c58373PuD = (C58373PuD) obj;
                                i = (i4 << 3) | 5;
                                valueOf = Integer.valueOf(((C58383PuN) c58408Pum.A03).A0M());
                                c58373PuD.A01(i, valueOf);
                                return true;
                            }
                            throw Q7Q.A00();
                        }
                        return false;
                    }
                    C58373PuD c58373PuD3 = new C58373PuD();
                    int i6 = i4 << 3;
                    int i7 = i6 | 4;
                    while (interfaceC65598Tnk.B68() != Integer.MAX_VALUE && A00(interfaceC65598Tnk, c58373PuD3)) {
                    }
                    if (i7 == c58408Pum.A02) {
                        c58373PuD3.A02 = false;
                        i2 = i6 | 3;
                        abstractC58387PuR = c58373PuD3;
                        c58373PuD2 = (C58373PuD) obj;
                    } else {
                        throw AbstractC58318PtA.A0H("Protocol message end-group tag did not match expected tag.");
                    }
                } else {
                    C58408Pum.A06(c58408Pum, 2);
                    i2 = (i4 << 3) | 2;
                    abstractC58387PuR = c58408Pum.A03.A0F();
                    c58373PuD2 = (C58373PuD) obj;
                }
                c58373PuD2.A01(i2, abstractC58387PuR);
                return true;
            }
            C58408Pum.A06(c58408Pum, 1);
            A0C = ((C58383PuN) c58408Pum.A03).A0O();
            c58373PuD = (C58373PuD) obj;
            i = (i4 << 3) | 1;
        } else {
            A0C = C58408Pum.A01(c58408Pum).A0C();
            c58373PuD = (C58373PuD) obj;
            i = i4 << 3;
        }
        valueOf = Long.valueOf(A0C);
        c58373PuD.A01(i, valueOf);
        return true;
    }
}
