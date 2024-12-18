package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AHU {
    public static final C84B A00(C84B c84b, int i) {
        C115475Kh c115475Kh;
        C115475Kh c115475Kh2;
        InterfaceC115495Kj A04 = c84b.A04(i);
        if (A04 instanceof C115475Kh) {
            c115475Kh = (C115475Kh) A04;
        } else {
            c115475Kh = null;
        }
        InterfaceC115495Kj A042 = c84b.A04(i + 1);
        if (A042 instanceof C115475Kh) {
            c115475Kh2 = (C115475Kh) A042;
        } else {
            c115475Kh2 = null;
        }
        if (c115475Kh != null && c115475Kh.A0N != null) {
            if (A02(c84b, i)) {
                if (c115475Kh2 != null) {
                    c115475Kh2.A0M = c115475Kh.A0N;
                }
            } else {
                c115475Kh.A0N = null;
                if (c115475Kh2 != null) {
                    c115475Kh2.A0M = null;
                }
            }
        } else if (c115475Kh2 != null) {
            c115475Kh2.A0M = null;
        }
        List list = c84b.A02;
        boolean z = c84b.A03;
        C14360o3.A0B(list, 0);
        return new C84B(list, z);
    }

    public static final C84B A01(C84B c84b, String str, int i) {
        C115475Kh c115475Kh;
        C115475Kh c115475Kh2;
        C115475Kh c115475Kh3;
        C115475Kh c115475Kh4;
        C14360o3.A0B(c84b, 0);
        int i2 = i + 1;
        InterfaceC115495Kj A04 = c84b.A04(i2);
        if ((A04 instanceof C115475Kh) && (c115475Kh4 = (C115475Kh) A04) != null) {
            c115475Kh = C115475Kh.A00(null, null, c115475Kh4, null, 0.0f, 0, 0, 0, 0, Integer.MAX_VALUE);
        } else {
            c115475Kh = null;
        }
        InterfaceC115495Kj A042 = c84b.A04(i);
        if ((A042 instanceof C115475Kh) && (c115475Kh3 = (C115475Kh) A042) != null) {
            c115475Kh2 = C115475Kh.A00(null, null, c115475Kh3, null, 0.0f, 0, 0, 0, 0, Integer.MAX_VALUE);
        } else {
            c115475Kh2 = null;
        }
        ArrayList A0U = AbstractC001800i.A0U(c84b.A05());
        boolean A02 = A02(c84b, i);
        if (c115475Kh != null) {
            if (A02) {
                c115475Kh.A0M = str;
            } else {
                c115475Kh.A0M = null;
            }
            A0U.set(i2, c115475Kh);
        }
        if (c115475Kh2 != null) {
            if (A02) {
                c115475Kh2.A0N = str;
            } else {
                c115475Kh2.A0N = null;
            }
            A0U.set(i, c115475Kh2);
        }
        return new C84B(A0U, false);
    }

    public static final boolean A02(C84B c84b, int i) {
        C115475Kh c115475Kh;
        C115475Kh c115475Kh2;
        C14360o3.A0B(c84b, 0);
        InterfaceC115495Kj A04 = c84b.A04(i + 1);
        if (A04 instanceof C115475Kh) {
            c115475Kh = (C115475Kh) A04;
        } else {
            c115475Kh = null;
        }
        InterfaceC115495Kj A042 = c84b.A04(i);
        if (!(A042 instanceof C115475Kh) || (c115475Kh2 = (C115475Kh) A042) == null || AbstractC226869zi.A00(c115475Kh2, false, true)) {
            return c115475Kh == null || AbstractC226869zi.A00(c115475Kh, true, false);
        }
        return false;
    }
}
