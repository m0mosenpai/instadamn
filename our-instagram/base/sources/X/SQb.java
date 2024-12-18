package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class SQb {
    public static final C0eB A00(C6FQ c6fq, C6FW c6fw) {
        int i;
        int i2;
        SLZ c58918QJw;
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 0);
        Object A02 = c6fw.A02();
        AbstractC25225BEi.A1S(A02);
        String str = (String) A02;
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map map = (Map) A00;
        String A0s2 = AbstractC31173DnH.A0s(list, 3);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 4);
        InterfaceC103384lE A0I2 = AbstractC31175DnJ.A0I(c6fw, 5);
        InterfaceC103384lE A0I3 = AbstractC31175DnJ.A0I(c6fw, 6);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            Number A0Q = AbstractC37300Gc1.A0Q("connection_timeout", map);
            if (A0Q != null) {
                i = A0Q.intValue();
            } else {
                i = 15000;
            }
            Number A0Q2 = AbstractC37300Gc1.A0Q("read_timeout", map);
            if (A0Q2 != null) {
                i2 = A0Q2.intValue();
            } else {
                i2 = 30000;
            }
            C62476SDd c62476SDd = new C62476SDd(i, i2);
            C64080Syw c64080Syw = new C64080Syw(c6fq, A0I, A0I2);
            if (A0s2 == null) {
                c58918QJw = new C58917QJv(context, c64080Syw, c62476SDd, str);
            } else {
                c58918QJw = new C58918QJw(context, c64080Syw, c62476SDd, str, A0s2);
            }
            if (A0s != null) {
                new C58917QJv(context, new C64081Syx(c58918QJw, c6fq, A0I3, A0I2), c62476SDd, A0s).A00();
            } else {
                c58918QJw.A00();
            }
        } else {
            A01(c6fq, A0I2, "no_context");
        }
        return C0eB.A00;
    }

    public static final void A01(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, String str) {
        AbstractC167007dF.A0J().post(new TPX(c6fq, interfaceC103384lE, str));
    }
}
