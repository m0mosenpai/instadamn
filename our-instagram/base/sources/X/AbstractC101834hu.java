package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.4hu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101834hu {
    public static final void A00(Activity activity, Context context, UserSession userSession, C909043h c909043h, C85083qw c85083qw, C75113Zb c75113Zb, boolean z) {
        C14360o3.A0B(activity, 0);
        C14360o3.A0B(c85083qw, 2);
        C14360o3.A0B(c75113Zb, 3);
        C14360o3.A0B(userSession, 4);
        C14360o3.A0B(context, 5);
        if (c909043h != null) {
            C75113Zb c75113Zb2 = c909043h.A02;
            if (c75113Zb2 != null && c75113Zb2 != c75113Zb) {
                c75113Zb2.A0M(c909043h, null, true);
            }
            c909043h.A02 = c75113Zb;
            c909043h.A01 = c85083qw;
            c909043h.A00 = activity;
            if (c85083qw.A07) {
                C41L A00 = c909043h.A00();
                if (A00 != null) {
                    EnumC85063qu enumC85063qu = c85083qw.A02;
                    EnumC85073qv enumC85073qv = c85083qw.A03;
                    Integer num = enumC85063qu.A00;
                    if (num != null) {
                        A00.setActiveColor(context.getColor(num.intValue()));
                    }
                    Integer num2 = enumC85073qv.A00;
                    if (num2 != null) {
                        A00.setInactiveColor(context.getColor(num2.intValue()));
                    }
                    A00.setVisibility(0);
                    A00.A01(c75113Zb.A03, c85083qw.A00);
                    A00.setCurrentPage(c75113Zb.A02);
                    A00.setDarkMode(false);
                    c75113Zb.A0L(c909043h, null, true);
                    if (c85083qw.A06) {
                        A00.A08 = new C50I(A00, new C37478Gew(userSession, c85083qw.A04, c75113Zb));
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            if (!z && c85083qw.A05 && !c909043h.A03) {
                return;
            }
            AbstractC13880nE.A0P(c909043h.A00());
        }
    }
}
