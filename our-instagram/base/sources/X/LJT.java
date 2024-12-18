package X;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public abstract class LJT {
    public static final java.util.Set A00 = new HashSet(AbstractC166987dD.A1J(C2EY.A0G));

    public static final boolean A01(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        C45273K2b c45273K2b;
        C45273K2b A002 = Ko7.A00(c99e, interfaceC50520MRx, i);
        int i2 = i + 1;
        if (i2 != interfaceC50520MRx.getCount()) {
            boolean A1O = AbstractC167007dF.A1O(interfaceC50520MRx.B0J(i2));
            if (interfaceC50520MRx.BnJ(i2) != null || interfaceC50520MRx.CV7(i2) || A1O) {
                return false;
            }
            c45273K2b = Ko7.A00(c99e, interfaceC50520MRx, i2);
        } else {
            c45273K2b = null;
        }
        if (A02(c45273K2b, A002, false)) {
            C47384KwZ Bkg = interfaceC50520MRx.Bkg(i);
            if (Bkg == null || Bkg.A00.size() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A02(C45273K2b c45273K2b, C45273K2b c45273K2b2, boolean z) {
        if (c45273K2b != null && AbstractC162597Pw.A00(c45273K2b, c45273K2b2)) {
            long j = c45273K2b.A00;
            long j2 = c45273K2b2.A00;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            if (Math.abs(timeUnit.toSeconds(j) - timeUnit.toSeconds(j2)) < 60) {
                boolean z2 = !z;
                C2EY c2ey = c45273K2b.A01;
                java.util.Set set = A00;
                if (!set.contains(c2ey)) {
                    C2EY c2ey2 = C2EY.A0s;
                    if (c2ey == c2ey2 && z2 && !c45273K2b.A02) {
                        return false;
                    }
                    C2EY c2ey3 = c45273K2b2.A01;
                    if (set.contains(c2ey3)) {
                        return false;
                    }
                    if (c2ey3 == c2ey2 && z && !c45273K2b2.A02) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean A00(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        C45273K2b A002;
        C45273K2b A003 = Ko7.A00(c99e, interfaceC50520MRx, i);
        if (i == 0) {
            A002 = null;
        } else {
            A002 = Ko7.A00(c99e, interfaceC50520MRx, i - 1);
        }
        boolean A1O = AbstractC167007dF.A1O(interfaceC50520MRx.B0J(i));
        if (interfaceC50520MRx.BnJ(i) != null || interfaceC50520MRx.CV7(i) || A1O || !A02(A002, A003, true)) {
            return false;
        }
        C47384KwZ Bkg = interfaceC50520MRx.Bkg(i - 1);
        if (Bkg != null && Bkg.A00.size() != 0) {
            return false;
        }
        return true;
    }
}
