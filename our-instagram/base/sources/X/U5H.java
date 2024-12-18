package X;

import java.util.List;

/* loaded from: classes11.dex */
public abstract class U5H {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        int i;
        int i2 = 0;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        List list = c6fw.A00;
        if (list.size() >= 2) {
            Object obj = list.get(1);
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Number");
            i = ((Number) obj).intValue();
        } else {
            i = 0;
        }
        List list2 = c6fq.A0D;
        if (list2 != null) {
            i2 = list2.size();
        }
        if (i <= i2) {
            String A00 = C66208U4e.A00(C05F.A01, str, list2, i);
            Object obj2 = C66208U4e.A01(c6fq).get(A00);
            InterfaceC136406Ft interfaceC136406Ft = c6fq.A05;
            if (interfaceC136406Ft != null) {
                interfaceC136406Ft.A7j(A00);
            }
            return obj2;
        }
        throw new IllegalArgumentException(AbstractC111324zv.A00(1569));
    }
}
