package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class BX0 {
    public static final ArrayList A00(C6FQ c6fq, C6FW c6fw) {
        Object obj = c6fw.A00.get(0);
        C14360o3.A0C(obj, "null cannot be cast to non-null type java.util.List<kotlin.Any>");
        List list = (List) obj;
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A02()).A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            C6FX c6fx = new C6FX();
            c6fx.A03(obj2, 0);
            Object A00 = C131845xK.A00(c6fq, c6fx.A00(), interfaceC103384lE);
            if (!(A00 instanceof Number) && !(A00 instanceof Boolean)) {
                AbstractC25241Le.A02("bk.action.array.Filter", "Got non-boolean result while evaluating filter predicate");
                return null;
            }
            if (C6DZ.A01(A00)) {
                A1E.add(obj2);
            }
        }
        return A1E;
    }
}
