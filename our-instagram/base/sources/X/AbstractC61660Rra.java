package X;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.Rra, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61660Rra {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = c6fw.A00;
        Object obj = list.get(0);
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) obj;
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 1);
        InterfaceC103384lE A0t2 = AbstractC25228BEl.A0t(list, 2);
        C1LN.A01("Inflate");
        try {
            try {
                Q0W q0w = new Q0W(C1LZ.A00().A04, c6fq, AbstractC166997dE.A15(map));
                q0w.Csy();
                C102884kP c102884kP = (C102884kP) AbstractC102864kN.A01(null, q0w);
                if (A0t != null) {
                    C6FW A0g = AbstractC58320PtC.A0g(c102884kP);
                    C14360o3.A0B(A0g, 2);
                    try {
                        C6FY.A00(c6fq, A0g, A0t);
                    } catch (C1338562t e) {
                        AbstractC25241Le.A00(null, "BKBloksActionBloksInflateImpl", AnonymousClass001.A0R("Exception while executing ", "SuccessCallback"), e);
                    }
                }
            } catch (IOException unused) {
                if (A0t2 != null) {
                    C6FW c6fw2 = C6FW.A01;
                    C14360o3.A08(c6fw2);
                    try {
                        C6FY.A00(c6fq, c6fw2, A0t2);
                    } catch (C1338562t e2) {
                        AbstractC25241Le.A00(null, "BKBloksActionBloksInflateImpl", AnonymousClass001.A0R("Exception while executing ", "FailureCallback"), e2);
                    }
                }
            }
            C1LN.A00();
            return null;
        } catch (Throwable th) {
            C1LN.A00();
            throw th;
        }
    }
}
