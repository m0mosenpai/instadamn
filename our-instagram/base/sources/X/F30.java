package X;

import com.instagram.direct.capabilities.Capabilities;

/* loaded from: classes6.dex */
public abstract class F30 {
    public static final boolean A00(Capabilities capabilities, E70 e70) {
        C14360o3.A0B(e70, 0);
        boolean z = e70.A0v;
        boolean A04 = E70.A04(e70);
        int i = e70.A09;
        boolean A1P = AbstractC167007dF.A1P(i, 1012);
        boolean A1P2 = AbstractC167007dF.A1P(i, 1013);
        int A00 = E70.A00(e70);
        if (z && !A04 && !A1P && !A1P2 && A00 == 1 && capabilities.A00(EnumC2054697t.A04)) {
            return true;
        }
        return false;
    }
}
