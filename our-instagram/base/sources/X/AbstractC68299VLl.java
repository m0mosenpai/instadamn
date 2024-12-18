package X;

import android.animation.Animator;
import java.util.List;

/* renamed from: X.VLl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68299VLl {
    public static final Animator A00(C6FQ c6fq, C6FW c6fw) {
        Object u65;
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            return null;
        }
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.collections.List<android.animation.Animator>");
        List list = (List) A01;
        C14360o3.A0B(list, 1);
        U66.A00(c6fg, list);
        int size = list.size();
        if (size == 1) {
            u65 = AbstractC001800i.A0I(list);
        } else {
            for (int i = 0; i < size; i++) {
                Animator animator = (Animator) list.get(i);
                AnonymousClass634.A07(animator, c6fg);
                if (i > 0) {
                    Animator animator2 = (Animator) list.get(i - 1);
                    C66250U5u.A02(animator, animator2.getStartDelay() + animator2.getDuration());
                }
            }
            u65 = new U65(C05F.A01, list);
        }
        return (Animator) u65;
    }
}
