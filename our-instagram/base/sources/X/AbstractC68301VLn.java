package X;

import android.animation.Animator;
import java.util.List;

/* renamed from: X.VLn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68301VLn {
    public static final Animator A00(C6FQ c6fq, C6FW c6fw) {
        Object u65;
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            return null;
        }
        float A00 = AbstractC43593JPy.A00(c6fw.A01(), "null cannot be cast to non-null type kotlin.Number");
        Object A03 = c6fw.A03(1);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.collections.List<android.animation.Animator>");
        List list = (List) A03;
        long j = A00 * ((float) C66250U5u.A00);
        C14360o3.A0B(list, 1);
        U66.A00(c6fg, list);
        if (list.size() == 1) {
            u65 = AbstractC001800i.A0I(list);
        } else {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                Animator animator = (Animator) obj;
                AnonymousClass634.A07(animator, c6fg);
                C66250U5u.A02(animator, i * j);
                i = i2;
            }
            u65 = new U65(C05F.A0C, list);
        }
        return (Animator) u65;
    }
}
