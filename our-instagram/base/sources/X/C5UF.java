package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5UF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5UF {
    public int A00;
    public final int A01;
    public final C18750w2 A02;
    public final List A03;
    public final List A04;
    public final InterfaceC09390do A05;

    public final boolean A00(int i, int i2) {
        int i3;
        C18750w2 c18750w2 = this.A02;
        C5UK c5uk = (C5UK) c18750w2.A03(i);
        if (c5uk != null) {
            int i4 = c5uk.A01;
            int i5 = i2 - c5uk.A00;
            c5uk.A00 = i2;
            if (i5 == 0) {
                return true;
            }
            Object[] objArr = c18750w2.A04;
            long[] jArr = c18750w2.A03;
            int length = jArr.length - 2;
            if (length < 0) {
                return true;
            }
            int i6 = 0;
            while (true) {
                long j = jArr[i6];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - (((i6 - length) ^ (-1)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j) < 128) {
                            C5UK c5uk2 = (C5UK) objArr[(i6 << 3) + i8];
                            if (c5uk2.A01 >= i4 && !c5uk2.equals(c5uk) && (i3 = c5uk2.A01 + i5) >= 0) {
                                c5uk2.A01 = i3;
                            }
                        }
                        j >>= 8;
                    }
                    if (i7 != 8) {
                        return true;
                    }
                }
                if (i6 == length) {
                    return true;
                }
                i6++;
            }
        } else {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.5UK, java.lang.Object] */
    public C5UF(List list, int i) {
        this.A03 = list;
        this.A01 = i;
        if (i >= 0) {
            this.A04 = new ArrayList();
            C18750w2 c18750w2 = new C18750w2(6);
            int size = this.A03.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C5UH c5uh = (C5UH) this.A03.get(i3);
                int i4 = c5uh.A01;
                int i5 = c5uh.A02;
                ?? obj = new Object();
                obj.A02 = i3;
                obj.A01 = i2;
                obj.A00 = i5;
                c18750w2.A08(i4, obj);
                i2 += i5;
            }
            this.A02 = c18750w2;
            this.A05 = AbstractC09440dt.A01(new C9EV(this, 14));
            return;
        }
        SQP.A00("Invalid start index");
        throw C00O.createAndThrow();
    }
}
