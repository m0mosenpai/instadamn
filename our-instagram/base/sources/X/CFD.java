package X;

import android.view.View;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CFD {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        View view;
        View view2;
        Integer num;
        Integer num2;
        String str;
        List list = c6fw.A00;
        C102884kP c102884kP = (C102884kP) list.get(0);
        C102884kP c102884kP2 = (C102884kP) list.get(1);
        Number number = (Number) list.get(2);
        Number number2 = (Number) list.get(3);
        Number number3 = (Number) list.get(4);
        if (c102884kP != null) {
            view2 = c102884kP.A05(c6fq.A03);
            view = view2;
            while (view2 != null) {
                if (!(view2 instanceof AbstractC127345pD)) {
                    Object parent = view2.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view2 = (View) parent;
                } else {
                    break;
                }
            }
        } else {
            view = null;
        }
        view2 = null;
        AbstractC127345pD abstractC127345pD = (AbstractC127345pD) view2;
        if (abstractC127345pD == null) {
            C0w9.A03("BKBloksActionShowreelInvokeInteractionWithArgsImpl#InvokeInteraction", "ShowreelCompositionView is null");
            return null;
        }
        if (c102884kP2 != null) {
            String A0G = c102884kP2.A0G();
            Integer[] A00 = C05F.A00(5);
            int length = A00.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    num2 = A00[i];
                    if (C14360o3.A0K(AbstractC68329VMp.A00(num2), A0G)) {
                        break;
                    }
                    i++;
                } else {
                    num2 = null;
                    break;
                }
            }
            str = c102884kP2.A0E();
            num = Integer.valueOf(c102884kP2.A03(38, -1));
        } else {
            num = null;
            num2 = null;
            str = null;
        }
        if (view != null && num2 != null && str != null && number != null && number2 != null && number3 != null && num != null) {
            abstractC127345pD.A03(view, num2, str, number.intValue(), number2.intValue(), number3.intValue(), num.intValue());
            return null;
        }
        C0w9.A03("BKBloksActionShowreelInvokeInteractionWithArgsImpl#InvokeInteraction", "The argument is null");
        return null;
    }
}
