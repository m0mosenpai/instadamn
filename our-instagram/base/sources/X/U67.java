package X;

import android.animation.Animator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class U67 {
    public static final Animator A00(C6FQ c6fq, C6FW c6fw) {
        Animator u65;
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            return null;
        }
        InterfaceC103384lE A00 = C1344465q.A00(MSY.A0a(c6fw));
        float A002 = AbstractC43593JPy.A00(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A003 = c6fw.A00();
        C14360o3.A0C(A003, "null cannot be cast to non-null type kotlin.collections.List<android.animation.Animator>");
        List<Animator> list = (List) A003;
        long j = A002 * ((float) C66250U5u.A00);
        C14360o3.A0B(list, 1);
        U66.A00(c6fg, list);
        if (list.size() == 1) {
            u65 = (Animator) AbstractC001800i.A0I(list);
            C66250U5u.A02(u65, j);
        } else {
            for (Animator animator : list) {
                AnonymousClass634.A07(animator, c6fg);
                C66250U5u.A02(animator, j);
            }
            u65 = new U65(C05F.A00, list);
        }
        if (A00 == null) {
            return u65;
        }
        C66250U5u.A04(u65, c6fg, c6fq, A00);
        return u65;
    }
}
