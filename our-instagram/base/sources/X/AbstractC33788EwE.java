package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.EwE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33788EwE {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 0);
        Map map = (Map) AbstractC25227BEk.A0t(list);
        Object obj = list.get(2);
        obj.getClass();
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) obj).A00;
        Object obj2 = list.get(3);
        obj2.getClass();
        InterfaceC103384lE interfaceC103384lE2 = ((C1344465q) obj2).A00;
        if (list.size() > 4) {
            str = (String) c6fw.A03(4);
        } else {
            str = "current-screen";
        }
        C6BQ.A09(c6fq);
        C1GL A00 = AbstractC31705DwA.A00(C6BQ.A02(c6fq), C6BQ.A0C(c6fq), str, A0s);
        if (A00 != null) {
            AbstractC192798gL A04 = C192108fB.A04(C6BQ.A0B(c6fq), A0s, C6BQ.A0H(map));
            A04.A00(new C32389EOq(c6fq, interfaceC103384lE, interfaceC103384lE2, A0s, 1));
            A00.schedule(A04);
        }
        return null;
    }
}
