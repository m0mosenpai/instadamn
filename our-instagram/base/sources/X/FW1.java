package X;

import android.content.Context;
import android.view.WindowManager;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class FW1 {
    public static void A00(Context context) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131976032);
        A0I.A0s(false);
        A0I.A09(2131966062);
        AbstractC31176DnK.A15(new DialogInterfaceOnClickListenerC35301Fha(10), A0I);
    }

    public static void A01(UserSession userSession, Context context, boolean z) {
        String str;
        String str2;
        C14360o3.A0B(userSession, 0);
        ArrayList arrayList = C1XC.A00;
        Iterator it = AbstractC166987dD.A1F(arrayList).iterator();
        while (true) {
            if (it.hasNext()) {
                C1XB c1xb = (C1XB) it.next();
                if (!c1xb.CPL(context, userSession)) {
                    str = c1xb.AY5(context, userSession, z);
                    break;
                }
            } else {
                str = null;
                break;
            }
        }
        Iterator it2 = AbstractC166987dD.A1F(arrayList).iterator();
        while (true) {
            if (it2.hasNext()) {
                C1XB c1xb2 = (C1XB) it2.next();
                if (!c1xb2.CPL(context, userSession)) {
                    str2 = c1xb2.AY4(context, userSession, z);
                    break;
                }
            } else {
                str2 = null;
                break;
            }
        }
        try {
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            if (str != null) {
                A0I.A05 = str;
                if (str2 != null) {
                    A0I.A0r(str2);
                    A0I.A0s(false);
                    AbstractC31176DnK.A15(new DialogInterfaceOnClickListenerC35301Fha(11), A0I);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        } catch (WindowManager.BadTokenException unused) {
            C9GR.A09(context, str2);
        }
    }
}
