package X;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes5.dex */
public abstract class CFK {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0L;
        C102884kP c102884kP = (C102884kP) c6fw.A03(0);
        C6FG c6fg = (C6FG) c6fw.A02();
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        Context context = c6fg.A00;
        C50674MYs c50674MYs = new C50674MYs(context, A0B);
        String A0L2 = c102884kP.A0L(38);
        String A0F = c102884kP.A0F();
        if (!TextUtils.isEmpty(A0L2)) {
            if (!TextUtils.isEmpty(A0F)) {
                c50674MYs.A0C(A0L2, A0F);
            } else {
                c50674MYs.A07(A0L2);
            }
        }
        C102884kP A08 = c102884kP.A08(35);
        if (A08 != null && (A0L = A08.A0L(36)) != null) {
            c50674MYs.A06(AbstractC25225BEi.A0t(A0L));
        }
        InterfaceC103384lE A0B2 = c102884kP.A0B(41);
        if (A0B2 != null) {
            c50674MYs.A03 = new C29300Cvv(c6fg, c6fq, A0B2);
        }
        for (int i = 0; i < c102884kP.A0O(36).size(); i++) {
            C102884kP c102884kP2 = (C102884kP) c102884kP.A0O(36).get(i);
            String A0L3 = c102884kP2.A0L(36);
            InterfaceC103384lE A0B3 = c102884kP2.A0B(38);
            if (A0B3 != null && c102884kP2.A0F() != null) {
                ViewOnClickListenerC28665ClD viewOnClickListenerC28665ClD = new ViewOnClickListenerC28665ClD(4, c6fg, c6fq, A0B3);
                if (A0L3 != null && A0L3.equals("destructive")) {
                    c50674MYs.A09(c102884kP2.A0F(), viewOnClickListenerC28665ClD);
                } else {
                    c50674MYs.A0B(c102884kP2.A0F(), viewOnClickListenerC28665ClD);
                }
            }
        }
        new C31727DwY(c50674MYs).A07(context);
        return null;
    }
}
