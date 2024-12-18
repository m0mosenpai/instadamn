package X;

import android.animation.TimeInterpolator;
import java.util.List;

/* renamed from: X.Kic, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46537Kic {
    public static final C44819Jst A00(C6FQ c6fq, C6FW c6fw) {
        float A01;
        float A012;
        Integer num;
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            return null;
        }
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 0);
        List list = c6fw.A00;
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 1);
        Object A03 = c6fw.A03(2);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        String A0y = AbstractC43593JPy.A0y(c6fw, 3);
        float A00 = AbstractC43593JPy.A00(c6fw.A03(4), "null cannot be cast to non-null type kotlin.Number");
        TimeInterpolator timeInterpolator = (TimeInterpolator) list.get(5);
        try {
            if (str.endsWith("%")) {
                A01 = C6BE.A00(str);
                A012 = C6BE.A00(A0y);
                num = C05F.A00;
            } else {
                A01 = C6BE.A01(str);
                A012 = C6BE.A01(A0y);
                num = C05F.A01;
            }
            C44819Jst c44819Jst = new C44819Jst(num);
            c44819Jst.setFloatValues(A01, A012);
            c44819Jst.setDuration(A00 * ((float) C66250U5u.A00));
            c44819Jst.setInterpolator(timeInterpolator);
            C44249Jgt.A00(c44819Jst, c6fq, A0I, 2);
            if (A0t == null) {
                return c44819Jst;
            }
            C66250U5u.A04(c44819Jst, c6fg, c6fq, A0t);
            return c44819Jst;
        } catch (C41M e) {
            throw AbstractC37303Gc4.A0M(e, "Could not parse start and end values. ", AbstractC166987dD.A1C());
        }
    }
}
