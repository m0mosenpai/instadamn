package X;

import java.util.List;

/* renamed from: X.Oa5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55054Oa5 {
    public static Boolean A00;
    public static String A01;
    public static String A02;
    public static String A03;
    public static boolean A04;
    public static final C55054Oa5 A05 = new Object();

    public final boolean A01(String str, String str2) {
        C14360o3.A0B(str, 0);
        List A0m = AbstractC167007dF.A0m(str, ".", 0);
        Object A0J = AbstractC001800i.A0J(A0m);
        if (A0J != null && A0J.equals("eng")) {
            return false;
        }
        List A0m2 = AbstractC167007dF.A0m(str2, ".", 0);
        for (int i = 0; i < A0m.size() && i < A0m2.size() && Long.parseLong(AbstractC25226BEj.A1I(A0m, i)) <= Long.parseLong(AbstractC25226BEj.A1I(A0m2, i)); i++) {
            if (Long.parseLong(AbstractC25226BEj.A1I(A0m, i)) < Long.parseLong(AbstractC25226BEj.A1I(A0m2, i))) {
                A00(true);
                return true;
            }
        }
        return false;
    }

    public static final void A00(boolean z) {
        A04 = z;
        AbstractC195978lm.A02.A01("sup:VersionEnforcementService", AnonymousClass001.A1D("Setting versionUpgradeRequired = ", z));
    }
}
