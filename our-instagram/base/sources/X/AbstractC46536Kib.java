package X;

import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.graphics.Color;
import java.util.List;

/* renamed from: X.Kib, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46536Kib {
    public static final C66249U5t A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            return null;
        }
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 0);
        List list = c6fw.A00;
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 1);
        Object A03 = c6fw.A03(2);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        int parseColor = Color.parseColor((String) A03);
        int parseColor2 = Color.parseColor(AbstractC43593JPy.A0y(c6fw, 3));
        float A00 = AbstractC43593JPy.A00(c6fw.A03(4), "null cannot be cast to non-null type kotlin.Number");
        TimeInterpolator timeInterpolator = (TimeInterpolator) list.get(5);
        C66249U5t c66249U5t = new C66249U5t();
        c66249U5t.setIntValues(parseColor, parseColor2);
        c66249U5t.setEvaluator(new ArgbEvaluator());
        c66249U5t.setDuration(A00 * ((float) C66250U5u.A00));
        c66249U5t.setInterpolator(timeInterpolator);
        C44249Jgt.A00(c66249U5t, c6fq, A0I, 1);
        if (A0t == null) {
            return c66249U5t;
        }
        C66250U5u.A04(c66249U5t, c6fg, c6fq, A0t);
        return c66249U5t;
    }
}
