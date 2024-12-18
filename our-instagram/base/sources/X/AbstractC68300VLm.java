package X;

import android.animation.Animator;

/* renamed from: X.VLm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68300VLm {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            String A0d = AbstractC31177DnL.A0d(c6fw);
            float A00 = AbstractC43593JPy.A00(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
            Animator A01 = C66250U5u.A01(c6fg, A0d);
            if (A01 != null) {
                C66250U5u.A03(A01, A00 * ((float) C66250U5u.A00));
            }
        }
        return null;
    }
}
