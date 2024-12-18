package X;

import java.util.List;

/* renamed from: X.6Hk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC136816Hk {
    public static final int A00(List list, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((C127045oi) AbstractC001800i.A0K(list)).A00) {
            C14360o3.A0B(list, 0);
            return list.size() - 1;
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C127045oi c127045oi = (C127045oi) list.get(i2);
            if (c127045oi.A01 > f) {
                size = i2 - 1;
            } else if (c127045oi.A00 <= f) {
                i = i2 + 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public static final int A01(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C127045oi c127045oi = (C127045oi) list.get(i3);
            if (c127045oi.A05 > i) {
                size = i3 - 1;
            } else if (c127045oi.A04 <= i) {
                i2 = i3 + 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int A02(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C127045oi c127045oi = (C127045oi) list.get(i3);
            if (c127045oi.A03 > i) {
                size = i3 - 1;
            } else if (c127045oi.A02 <= i) {
                i2 = i3 + 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final void A03(List list, InterfaceC16660sJ interfaceC16660sJ, long j) {
        int size = list.size();
        for (int A01 = A01(list, C5C2.A01(j)); A01 < size; A01++) {
            C127045oi c127045oi = (C127045oi) list.get(A01);
            if (c127045oi.A05 < C5C2.A00(j)) {
                if (c127045oi.A05 != c127045oi.A04) {
                    interfaceC16660sJ.invoke(c127045oi);
                }
            } else {
                return;
            }
        }
    }
}
