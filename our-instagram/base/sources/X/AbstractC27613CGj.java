package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.CGj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27613CGj {
    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, InterfaceC16820sZ interfaceC16820sZ) {
        String A0f;
        if (AbstractC166987dD.A0x(userSession).getInt("meta_gallery_recents_nux_impression_count", 0) < 1) {
            long A01 = C18U.A01(C06090Tz.A05, userSession, 36598120705952884L);
            Long valueOf = Long.valueOf(A01);
            C193328hC c193328hC = new C193328hC(context);
            c193328hC.A0A(2131963101);
            if (A01 == -1) {
                A0f = context.getString(2131963103);
            } else {
                A0f = AbstractC167007dF.A0f(context, valueOf, 2131963099);
            }
            c193328hC.A0r(A0f);
            c193328hC.A0J(new LMH(interfaceC11380iw, userSession, str, 1), 2131963098);
            c193328hC.A0g(new DialogInterfaceOnDismissListenerC28571Cj3(interfaceC11380iw, userSession, str, interfaceC16820sZ));
            c193328hC.A0s(true);
            c193328hC.A0t(true);
            c193328hC.A0I(new LMI(context, interfaceC11380iw, userSession, str, 1), 2131963100);
            c193328hC.A0h(new DialogInterfaceOnShowListenerC28573Cj5(interfaceC11380iw, userSession, str, 0));
            AbstractC166987dD.A1W(c193328hC);
        }
    }
}
