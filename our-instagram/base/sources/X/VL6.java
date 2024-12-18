package X;

import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class VL6 {
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        int i = 0;
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        ?? A01 = C6DZ.A01(c6fw.A03(1));
        List list = c6fq.A0D;
        if (list != null) {
            i = list.size();
        }
        if (A01 <= i) {
            C66208U4e c66208U4e = U5D.A00;
            C14360o3.A0B(A0e, 1);
            Map A012 = C66208U4e.A01(c6fq);
            Integer num = C05F.A01;
            if (!A012.containsKey(C66208U4e.A00(num, A0e, list, A01 == true ? 1 : 0))) {
                num = C05F.A00;
                if (!C6AM.A00(c6fq).A08.containsKey(C66208U4e.A00(num, A0e, list, A01 == true ? 1 : 0))) {
                    throw new IllegalArgumentException(AnonymousClass001.A09(A01 == true ? 1 : 0, "Missing expanded or internal variable for variable ", A0e, " at depth ", ".Please verify the variable ID is correct."));
                }
            }
            if (num.intValue() != 0) {
                String A00 = C66208U4e.A00(num, A0e, list, A01 == true ? 1 : 0);
                Object obj = C66208U4e.A01(c6fq).get(A00);
                InterfaceC136406Ft interfaceC136406Ft = c6fq.A05;
                if (interfaceC136406Ft != null) {
                    interfaceC136406Ft.A7j(A00);
                }
                return obj;
            }
            if (A01 == 0) {
                return C6AM.A03(c6fq, A0e);
            }
            return c66208U4e.A02(c6fq, A0e, A01 == true ? 1 : 0);
        }
        throw new IllegalArgumentException("Trying to read a scoped client param from an un-scoped environment.");
    }
}
