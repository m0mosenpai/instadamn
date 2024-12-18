package X;

import java.util.List;

/* loaded from: classes11.dex */
public abstract class U5M {
    public static C102884kP A00(C102884kP c102884kP) {
        int i = c102884kP.A05;
        if (i != 13690) {
            if (i == 13785) {
                List<C102884kP> list = (List) C102884kP.A00(c102884kP, 40);
                if (list != null && !list.isEmpty()) {
                    for (C102884kP c102884kP2 : list) {
                        if (c102884kP2 != null && c102884kP2.A05 == 13890) {
                            return c102884kP2;
                        }
                    }
                }
            } else {
                AbstractC25241Le.A02("BloksScreenNavbarUtils", "Navbar should be an instance of BloksScreenNavbar or BloksScreenNavbarV2");
            }
        }
        return null;
    }
}
