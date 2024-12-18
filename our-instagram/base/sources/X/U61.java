package X;

import android.animation.Animator;
import java.util.UUID;

/* loaded from: classes11.dex */
public abstract class U61 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Object A01 = c6fw.A01();
            C14360o3.A0C(A01, "null cannot be cast to non-null type android.animation.Animator");
            C66250U5u c66250U5u = C66250U5u.A01;
            String str = null;
            StringBuilder sb = new StringBuilder();
            sb.append("NO_ID");
            String A0v = AbstractC166997dE.A0v(UUID.randomUUID(), sb);
            C66250U5u.A05((Animator) A01, c6fg, A0v);
            InterfaceC102974kY interfaceC102974kY = c6fq.A02;
            if (interfaceC102974kY != null) {
                str = interfaceC102974kY.BOp();
            }
            c66250U5u.A06(c6fg, A0v, str, true);
        }
        return null;
    }
}
