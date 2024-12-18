package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class CFJ {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        String A0L;
        String A0L2;
        FragmentActivity A04 = C6BQ.A04(c6fq);
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A03;
        C50674MYs c50674MYs = new C50674MYs(A04, C6BQ.A0B(c6fq));
        Iterator it = c102884kP.A0O(35).iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            C102884kP c102884kP2 = (C102884kP) it.next();
            ViewOnClickListenerC28668ClG viewOnClickListenerC28668ClG = new ViewOnClickListenerC28668ClG(8, c102884kP2, c6fq);
            String A0L3 = c102884kP2.A0L(34);
            if (A0L3 != null && !A0L3.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
                if (A0L3.equals("destructive")) {
                    String A0L4 = c102884kP2.A0L(38);
                    if (A0L4 != null) {
                        str = A0L4;
                    }
                    c50674MYs.A09(str, viewOnClickListenerC28668ClG);
                } else {
                    AbstractC25241Le.A02(AbstractC111324zv.A00(1658), AbstractC166997dE.A0z("Got unexpected value: %s while parsing action sheet item style", AbstractC166997dE.A1b(A0L3, 1)));
                }
            } else {
                String A0L5 = c102884kP2.A0L(38);
                if (A0L5 != null) {
                    str = A0L5;
                }
                c50674MYs.A0B(str, viewOnClickListenerC28668ClG);
            }
        }
        C102884kP A08 = c102884kP.A08(38);
        if (A08 != null) {
            String A0L6 = A08.A0L(35);
            C102884kP A082 = c102884kP.A08(40);
            if (A082 != null && (A0L2 = A082.A0L(35)) != null) {
                if (A0L6 != null) {
                    str = A0L6;
                }
                c50674MYs.A0C(str, A0L2);
            } else {
                if (A0L6 != null) {
                    str = A0L6;
                }
                c50674MYs.A07(str);
            }
        }
        C102884kP A083 = c102884kP.A08(36);
        if (A083 != null && (A0L = A083.A0L(36)) != null) {
            c50674MYs.A06(AbstractC25225BEi.A0t(A0L));
        }
        C3DN A00 = C3DN.A00.A00(A04);
        if (A00 != null && ((C3DP) A00).A0h) {
            new C31727DwY(c50674MYs).A06(A04);
            return null;
        }
        new C31727DwY(c50674MYs).A05(A04);
        return null;
    }
}
