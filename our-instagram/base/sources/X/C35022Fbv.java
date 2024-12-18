package X;

import android.app.Dialog;
import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fbv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35022Fbv {
    public Context A00;
    public C148676mc A01;
    public UserSession A02;
    public C148686md A03;

    public C35022Fbv(UserSession userSession, Context context) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = new C148676mc(EnumC143386dd.THREAD_COMPOSER, userSession);
        this.A03 = new C148686md(userSession, context);
    }

    public final void A00() {
        UserSession userSession = this.A02;
        String str = "userSession";
        if (userSession != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            String A04 = C18U.A04(c06090Tz, userSession, 36885368117985899L);
            String A042 = C18U.A04(c06090Tz, userSession, 36885368117920362L);
            Context context = this.A00;
            str = "context";
            if (context != null) {
                C193328hC A0I = AbstractC31171DnF.A0I(context);
                if (A04.length() == 0) {
                    A04 = AbstractC25227BEk.A0u(context, 2131975489);
                }
                A0I.A05 = A04;
                if (A042.length() == 0) {
                    A042 = AbstractC25227BEk.A0u(context, 2131975488);
                }
                A0I.A0r(A042);
                AbstractC31173DnH.A15(context, A0I, R.drawable.instagram_icons_exceptions_illo_restore_on_refresh_outline_96);
                DialogInterfaceOnClickListenerC35452Fk9.A02(A0I, this, 9, 2131976274);
                A0I.A0I(DialogInterfaceOnClickListenerC35452Fk9.A00(this, 8), 2131954767);
                Dialog A02 = A0I.A02();
                C148676mc c148676mc = this.A01;
                if (c148676mc == null) {
                    str = "audLogging";
                } else {
                    c148676mc.A01();
                    C0fJ.A00(A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final boolean A01() {
        String str;
        UserSession userSession = this.A02;
        if (userSession == null) {
            str = "userSession";
        } else {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36317990053156619L) || C18U.A06(c06090Tz, userSession, 36322418164377831L)) {
                C148686md c148686md = this.A03;
                if (c148686md == null) {
                    str = "rollingDeprecationUtil";
                } else if (c148686md.A00()) {
                    return true;
                }
            }
            return false;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C35022Fbv() {
    }
}
