package X;

import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class U5E {
    public static IgBloksScreenConfig A01(C62862tP c62862tP, C6FG c6fg, C6FQ c6fq, C102884kP c102884kP) {
        C34397FEn c34397FEn = new C34397FEn(C6BQ.A0B(c6fq));
        boolean z = c62862tP.A00;
        IgBloksScreenConfig igBloksScreenConfig = c34397FEn.A00;
        igBloksScreenConfig.A0c = z;
        U5K A00 = U5L.A00(null, c6fg, c6fq, A03(c102884kP));
        if (A00 != null) {
            igBloksScreenConfig.A06(A00);
        }
        return igBloksScreenConfig;
    }

    public static int A00(C102884kP c102884kP) {
        int i;
        int i2 = c102884kP.A05;
        if (AbstractC167007dF.A1P(i2, 13647)) {
            i = 44;
        } else if (AbstractC167007dF.A1P(i2, 13784)) {
            i = 49;
        } else {
            throw new IllegalArgumentException("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        return c102884kP.A03(i, 0);
    }

    public static C1338462s A02(C6FQ c6fq, C102884kP c102884kP) {
        InterfaceC103384lE A0B;
        Object A00;
        if (AbstractC167007dF.A1P(c102884kP.A05, 13784) && (A0B = c102884kP.A0B(54)) != null) {
            try {
                A00 = C6FY.A00(c6fq, C6FW.A01, A0B);
            } catch (C1338562t e) {
                AbstractC25241Le.A00(c6fq.A03, "BloksScreenUtils", "Failed executing ACTION_LOADED_SCREEN_PARSE_RESULT, returning empty parse result", e);
                A00 = C1338462s.A00(c6fq, new C102884kP(13320));
            }
            return (C1338462s) A00;
        }
        return null;
    }

    public static C102884kP A03(C102884kP c102884kP) {
        int i;
        int i2 = c102884kP.A05;
        if (i2 == 13647) {
            i = 38;
        } else if (AbstractC167007dF.A1P(i2, 13784)) {
            C102884kP A08 = c102884kP.A08(51);
            if (A08 != null) {
                return A08;
            }
            i = 41;
        } else {
            throw new IllegalArgumentException("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        return c102884kP.A08(i);
    }

    public static InterfaceC103384lE A05(C102884kP c102884kP) {
        int i;
        int i2 = c102884kP.A05;
        if (i2 == 13647) {
            i = 48;
        } else if (AbstractC167007dF.A1P(i2, 13784)) {
            i = 44;
        } else {
            throw new IllegalArgumentException("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        return c102884kP.A0B(i);
    }

    public static String A06(C102884kP c102884kP) {
        int i = c102884kP.A05;
        if (i == 13647) {
            String A0E = c102884kP.A0E();
            A0E.getClass();
            String A0L = c102884kP.A0L(50);
            if (A0L != null) {
                return A0L;
            }
            return A0E;
        }
        if (AbstractC167007dF.A1P(i, 13784)) {
            return c102884kP.A0K();
        }
        throw new IllegalArgumentException("screen should be an instance of BloksScreenData or BloksScreenV2Data");
    }

    public static String A07(C102884kP c102884kP) {
        String A0E;
        int i = c102884kP.A05;
        if (i != 13647) {
            if (AbstractC167007dF.A1P(i, 13784)) {
                C102884kP A04 = A04(A09(c102884kP), 15855);
                if (A04 != null) {
                    A0E = A04.A0F();
                    A0E.getClass();
                    return A0E;
                }
            } else {
                throw new IllegalArgumentException("screen should be an instance of BloksScreenData or BloksScreenV2Data");
            }
        }
        A0E = c102884kP.A0E();
        A0E.getClass();
        return A0E;
    }

    public static String A08(C102884kP c102884kP) {
        int i;
        int i2 = c102884kP.A05;
        if (AbstractC167007dF.A1P(i2, 13647)) {
            i = 40;
        } else if (AbstractC167007dF.A1P(i2, 13784)) {
            i = 45;
        } else {
            throw new IllegalArgumentException("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        String A0L = c102884kP.A0L(i);
        if (A0L == null) {
            return "0";
        }
        return A0L;
    }

    public static List A09(C102884kP c102884kP) {
        if (AbstractC167007dF.A1P(c102884kP.A05, 13784)) {
            Object A00 = C102884kP.A00(c102884kP, 42);
            if (A00 instanceof List) {
                return (List) A00;
            }
        }
        return Collections.emptyList();
    }

    public static Map A0A(C6FQ c6fq, C102884kP c102884kP) {
        if (c102884kP != null && AbstractC167007dF.A1P(c102884kP.A05, 13784) && c102884kP.A0B(56) != null) {
            return (Map) C131845xK.A00(c6fq, C6FW.A01, c102884kP.A0B(56));
        }
        return new HashMap();
    }

    public static Map A0B(C6FQ c6fq, C102884kP c102884kP, int i) {
        if (c102884kP != null && c102884kP.A0B(i) != null) {
            return (Map) C131845xK.A00(c6fq, C6FW.A01, c102884kP.A0B(i));
        }
        return new HashMap();
    }

    public static boolean A0C(C102884kP c102884kP) {
        int i = c102884kP.A05;
        if (i != 13647 && !AbstractC167007dF.A1P(i, 13784)) {
            return false;
        }
        return true;
    }

    public static C102884kP A04(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C102884kP c102884kP = (C102884kP) it.next();
            if (c102884kP.A05 == i) {
                return c102884kP;
            }
        }
        return null;
    }
}
