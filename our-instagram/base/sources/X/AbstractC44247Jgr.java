package X;

import android.animation.TimeInterpolator;
import java.util.List;

/* renamed from: X.Jgr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44247Jgr {
    public static final C66249U5t A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            return null;
        }
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 0);
        List list = c6fw.A00;
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 1);
        float A00 = AbstractC43593JPy.A00(c6fw.A03(2), "null cannot be cast to non-null type kotlin.Number");
        float A002 = AbstractC43593JPy.A00(c6fw.A03(3), "null cannot be cast to non-null type kotlin.Number");
        float A003 = AbstractC43593JPy.A00(c6fw.A03(4), "null cannot be cast to non-null type kotlin.Number");
        TimeInterpolator timeInterpolator = (TimeInterpolator) list.get(5);
        C66249U5t c66249U5t = new C66249U5t();
        c66249U5t.setFloatValues(A00, A002);
        c66249U5t.setDuration(A003 * ((float) C66250U5u.A00));
        c66249U5t.setInterpolator(timeInterpolator);
        C44249Jgt.A00(c66249U5t, c6fq, A0I, 0);
        if (A0t == null) {
            return c66249U5t;
        }
        C66250U5u.A04(c66249U5t, c6fg, c6fq, A0t);
        return c66249U5t;
    }
}
