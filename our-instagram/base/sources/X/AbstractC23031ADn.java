package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.ADn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23031ADn {
    public static final void A00(Context context, UserSession userSession, C22C c22c, C23031Ai c23031Ai) {
        AbstractC167017dG.A1O(c23031Ai, context);
        if (C18U.A06(C06090Tz.A05, userSession, 36322937854700295L) && !AbstractC167017dG.A1b(c23031Ai, c23031Ai.A0h, C23031Ai.A8c, 188)) {
            C193328hC c193328hC = new C193328hC(context);
            c193328hC.A0k(context.getDrawable(R.drawable.ig_illustrations_illo_text_refresh));
            c193328hC.A0A(2131975294);
            c193328hC.A09(2131975291);
            c193328hC.A0K(new DialogInterfaceOnClickListenerC55321Ogj(19, c22c, c23031Ai), 2131975292);
            c193328hC.A0H(new DialogInterfaceOnClickListenerC55321Ogj(20, c22c, c23031Ai), 2131975293);
            c193328hC.A0g(new DialogInterfaceOnDismissListenerC55324Ogm(c23031Ai, 6));
            c193328hC.A04();
            AbstractC166987dD.A1W(c193328hC);
            c22c.A0i();
        }
    }

    public static final void A01(Context context, UserSession userSession, C22C c22c, C23031Ai c23031Ai, boolean z) {
        AbstractC167017dG.A1O(c23031Ai, context);
        if (!C18U.A06(C06090Tz.A05, userSession, 36322937854700295L)) {
            InterfaceC19630xq interfaceC19630xq = c23031Ai.A01;
            if (interfaceC19630xq.getInt("clips_sticker_translations_opt_in_impression_count", 0) < 3 && !AbstractC167017dG.A1b(c23031Ai, c23031Ai.A0h, C23031Ai.A8c, 188)) {
                C193328hC c193328hC = new C193328hC(context);
                c193328hC.A0k(context.getDrawable(R.drawable.ig_illustrations_illo_text_refresh));
                int i = 2131974423;
                if (z) {
                    i = 2131975290;
                }
                c193328hC.A0A(i);
                int i2 = 2131974420;
                if (z) {
                    i2 = 2131975287;
                }
                c193328hC.A09(i2);
                int i3 = 2131974421;
                if (z) {
                    i3 = 2131975288;
                }
                c193328hC.A0K(new DialogInterfaceOnClickListenerC55321Ogj(17, c22c, c23031Ai), i3);
                int i4 = 2131974422;
                if (z) {
                    i4 = 2131975289;
                }
                c193328hC.A0H(new DialogInterfaceOnClickListenerC55321Ogj(18, c22c, c23031Ai), i4);
                c193328hC.A04();
                AbstractC166987dD.A1W(c193328hC);
                AbstractC167007dF.A18(interfaceC19630xq, "clips_sticker_translations_opt_in_impression_count", interfaceC19630xq.getInt("clips_sticker_translations_opt_in_impression_count", 0) + 1);
                c22c.A0i();
            }
        }
    }
}
