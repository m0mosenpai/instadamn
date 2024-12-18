package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.423, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass423 {
    public static final void A00(C9C3 c9c3, UserSession userSession, AnonymousClass421 anonymousClass421, C75113Zb c75113Zb, InterfaceC86303t2 interfaceC86303t2, C3YD c3yd) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC86303t2, 2);
        C14360o3.A0B(anonymousClass421, 3);
        C14360o3.A0B(c9c3, 4);
        C14360o3.A0B(c75113Zb, 5);
        if (!c9c3.A02) {
            c3yd.A0A();
            return;
        }
        AbstractC86373tA.A00((View.OnClickListener) ((InterfaceC16660sJ) ((C9BH) c9c3.A00).A00).invoke(anonymousClass421), interfaceC86303t2, (C3t9) c9c3.A04, new J0E(c75113Zb), c3yd);
        String str = c9c3.A01;
        if (str == null || str.length() <= 0 || !C18U.A06(C06090Tz.A05, userSession, 36320244911317174L)) {
            return;
        }
        c3yd.A0H(str);
    }
}
