package X;

import android.view.View;

/* loaded from: classes5.dex */
public abstract class CFE {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        View view;
        View view2;
        Integer num;
        C102884kP c102884kP = (C102884kP) c6fw.A01();
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP2 = (C102884kP) A00;
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
            C0w9.A03("BKBloksActionShowreelInvokeInteractionWithArgsImpl#InvokeInteractionWithArgsV2", "ShowreelCompositionView is null");
            return null;
        }
        String A0I = c102884kP2.A0I();
        Integer[] A002 = C05F.A00(5);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A002[i];
                if (C14360o3.A0K(AbstractC68329VMp.A00(num), A0I)) {
                    break;
                }
                i++;
            } else {
                num = null;
                break;
            }
        }
        String A0L = c102884kP2.A0L(45);
        if (view != null && num != null && A0L != null) {
            abstractC127345pD.A03(view, num, A0L, (int) c102884kP2.A02(51, 0.0f), (int) c102884kP2.A02(52, 0.0f), (int) c102884kP2.A02(46, 0.0f), c102884kP2.A03(35, -1));
            return null;
        }
        C0w9.A03("BKBloksActionShowreelInvokeInteractionWithArgsImpl#InvokeInteractionWithArgsV2", "The argument is null");
        return null;
    }
}
