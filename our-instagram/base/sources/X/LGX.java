package X;

import android.app.Dialog;
import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LGX {
    public Context A00;
    public C148676mc A01;
    public UserSession A02;
    public C148686md A03;

    public final void A00() {
        Context context = this.A00;
        String str = "context";
        if (context != null) {
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            A0I.A0A(2131954568);
            A0I.A09(2131954567);
            AbstractC31173DnH.A15(context, A0I, R.drawable.instagram_icons_exceptions_illo_restore_on_refresh_outline_96);
            DialogInterfaceOnClickListenerC48023LMs.A01(A0I, this, 7, 2131976274);
            DialogInterfaceOnClickListenerC48023LMs.A02(A0I, this, 6, 2131954767);
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
            if (C18U.A06(c06090Tz, userSession, 36317990051976960L) || C18U.A06(c06090Tz, userSession, 36322418163198173L)) {
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

    public LGX(UserSession userSession, Context context) {
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = new C148676mc(EnumC143386dd.CALLING, userSession);
        this.A03 = new C148686md(userSession, context);
    }

    public LGX() {
    }
}
