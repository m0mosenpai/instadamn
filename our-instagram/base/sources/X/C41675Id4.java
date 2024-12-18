package X;

import java.util.List;

/* renamed from: X.Id4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41675Id4 {
    public static final C41675Id4 A00 = new Object();

    public static final Object A00(C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A01;
        String A0E = c102884kP.A0E();
        if (A0E != null) {
            String A0G = c102884kP.A0G();
            List list = c6fw.A00;
            String A0s = AbstractC31173DnH.A0s(list, 1);
            String A0s2 = AbstractC31173DnH.A0s(list, 2);
            C41675Id4 c41675Id4 = A00;
            C101644hZ c101644hZ = new C101644hZ(C05F.A00, A0E);
            c101644hZ.A0B = A0s;
            c101644hZ.A08 = A0s2;
            C75363a3 A002 = c101644hZ.A00();
            if (A0G == null) {
                A0G = "";
            }
            C41711wL.A01(C023409i.A0A.A08(c41675Id4)).A0E(new C4AD(A002, A0G));
        }
        return null;
    }
}
