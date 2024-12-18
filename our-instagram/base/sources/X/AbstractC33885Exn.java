package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Exn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33885Exn {
    public static final Object A00(C6FW c6fw) {
        int A0D = AbstractC25230BEn.A0D(c6fw.A01(), "null cannot be cast to non-null type kotlin.Number");
        Object obj = c6fw.A00.get(1);
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, AbstractC111324zv.A00(8));
        List list = (List) A00;
        Object A03 = c6fw.A03(3);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        AbstractC12990ll A0A = C6BQ.A0A((C6FG) A03);
        AbstractC31171DnF.A1Q(A0A);
        FQ2 A002 = F77.A00((UserSession) A0A);
        Integer num = C05F.A00(3)[A0D];
        C14360o3.A0B(list, 1);
        C14360o3.A0B(num, 2);
        if (obj != null) {
            HashMap hashMap = A002.A02;
            Runnable runnable = (Runnable) hashMap.get(obj);
            hashMap.clear();
            int intValue = num.intValue();
            if (intValue != 2) {
                if (intValue != 1 && intValue != 0) {
                    throw B4Z.A00();
                }
            } else {
                C34703FQo c34703FQo = A002.A01;
                for (Object obj2 : list) {
                    C23031Ai c23031Ai = c34703FQo.A00;
                    C14360o3.A0B(obj2, 0);
                    InterfaceC19630xq interfaceC19630xq = c23031Ai.A01;
                    java.util.Set A0j = AbstractC001800i.A0j(interfaceC19630xq.C2v("minor_education_acknowledged_users"));
                    A0j.add(obj2);
                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                    ARD.E7L("minor_education_acknowledged_users", A0j);
                    ARD.apply();
                }
            }
            if (runnable != null) {
                runnable.run();
                return null;
            }
            return null;
        }
        return null;
    }
}
