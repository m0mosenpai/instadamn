package X;

import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class S4X {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = c6fw.A00;
        Object obj = list.get(0);
        String A0s = AbstractC31173DnH.A0s(list, 1);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        if (obj != null && A04 != null && A0s != null) {
            Q8T q8t = (Q8T) new C52942bb(A04).A00(Q8T.class);
            C47507Kya c47507Kya = (C47507Kya) q8t.A01.get(obj);
            if (c47507Kya != null) {
                c47507Kya.A01.A0A(C63406Sjd.A05(null, (Throwable) q8t.A00.A08(A0s, REX.class)));
            }
        }
        return null;
    }
}
