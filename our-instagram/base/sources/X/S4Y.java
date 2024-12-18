package X;

import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class S4Y {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A0b;
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 0);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        String A0s2 = AbstractC31173DnH.A0s(list, 2);
        String A0y = AbstractC43593JPy.A0y(c6fw, 3);
        String A0s3 = AbstractC31173DnH.A0s(list, 5);
        Map map = (Map) list.get(6);
        List list2 = (List) list.get(7);
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 8);
        InterfaceC103384lE A0t2 = AbstractC25228BEl.A0t(list, 9);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        if (A0s != null && A04 != null && map != null && A0s2 != null && list2 != null) {
            Q8T q8t = (Q8T) new C52942bb(A04).A00(Q8T.class);
            C50369MLw c50369MLw = new C50369MLw(c6fq, A0t, 13);
            MHW mhw = new MHW(c6fq, A0t2, 39);
            AbstractC167007dF.A1G(str, 4, A0y);
            Map map2 = q8t.A01;
            if (map2.get(A0s) == null) {
                if (map.containsKey("payload")) {
                    A0b = map.get("payload");
                } else {
                    A0b = AbstractC58318PtA.A0b();
                }
                SE2 A022 = AbstractC63061Sbi.A02(str, A0s2, null, null, list2);
                if (A0s3 != null) {
                    A022.A00 = (REX) q8t.A00.A08(A0s3, REX.class);
                }
                C2GS A0J = AbstractC58318PtA.A0J();
                C58252li A03 = C2FP.A03().A02(A04).A03(new C63545SpD(0, A0J, c50369MLw), null, A022, A0b, A0y);
                AbstractC31180DnO.A1F(A04, A03, new C50365MLr(A04, q8t, mhw, A0s, 2), 8);
                C14360o3.A06(map2);
                map2.put(A0s, new C47507Kya(A03, A0J));
            }
            return null;
        }
        C6BQ.A0E(c6fq, A0t2, new Object[0]);
        return null;
    }
}
