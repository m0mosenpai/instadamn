package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CGf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27609CGf {
    public static final boolean A00(Context context, View view, UserSession userSession, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        int i;
        Integer num;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC31035DkZ interfaceC31035DkZ = (InterfaceC31035DkZ) it.next();
            String A0p = AbstractC166997dE.A0p(context, interfaceC31035DkZ.BKz());
            Drawable drawable = context.getDrawable(interfaceC31035DkZ.BEr());
            C29302Cvx c29302Cvx = new C29302Cvx(1, interfaceC31035DkZ, interfaceC16660sJ);
            if (interfaceC31035DkZ.isNegative()) {
                num = Integer.valueOf(AbstractC53242c7.A03(context));
            } else {
                num = null;
            }
            A0q.add(new C199928sw(null, drawable, null, c29302Cvx, num, A0p, 0, 0, 0, false, false, false, true, false, false, false));
        }
        C8QJ c8qj = new C8QJ(context, userSession, null, false);
        c8qj.A02(A0q);
        c8qj.setOnDismissListener(new C23287ATy(interfaceC16820sZ, 1));
        int measuredHeight = view.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int A0G = AbstractC53242c7.A0G(context, AbstractC57322k7.A01(userSession));
        int i2 = iArr[1];
        int A0A = AbstractC25229BEm.A0A(c8qj.A00());
        try {
            if (AbstractC13890nF.A00(context) - i2 < A0G + A0A + measuredHeight) {
                i = (-A0A) - (measuredHeight / 2);
            } else {
                i = 0;
            }
            c8qj.showAsDropDown(view, 0, i);
            return true;
        } catch (WindowManager.BadTokenException unused) {
            return false;
        }
    }
}
