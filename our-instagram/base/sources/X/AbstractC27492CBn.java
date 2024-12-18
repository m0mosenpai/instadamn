package X;

import java.util.List;

/* renamed from: X.CBn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27492CBn {
    public static final Integer A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type java.util.List<kotlin.Any>");
        List list = (List) A03;
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A02()).A00;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object A00 = C131845xK.A00(c6fq, AbstractC25227BEk.A0f(AbstractC25225BEi.A0s(), list.get(i), 0), interfaceC103384lE);
            if (!(A00 instanceof Number) && !(A00 instanceof Boolean)) {
                AbstractC25241Le.A02(AbstractC111324zv.A00(751), "Got non-boolean result while evaluating FindIndex predicate");
                break;
            }
            if (C6DZ.A01(A00)) {
                break;
            }
            i++;
        }
        i = -1;
        return Integer.valueOf(i);
    }
}
