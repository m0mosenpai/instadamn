package X;

import android.animation.Animator;

/* renamed from: X.VLo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68302VLo {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            return null;
        }
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type android.animation.Animator");
        Object A03 = c6fw.A03(1);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A03;
        C66250U5u c66250U5u = C66250U5u.A01;
        C66250U5u.A05((Animator) A01, c6fg, str2);
        InterfaceC102974kY interfaceC102974kY = c6fq.A02;
        if (interfaceC102974kY != null) {
            str = interfaceC102974kY.BOp();
        } else {
            str = null;
        }
        c66250U5u.A06(c6fg, str2, str, true);
        return null;
    }
}
