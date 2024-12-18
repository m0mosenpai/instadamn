package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.1Cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23491Cl {
    public final Context A00;
    public final UserSession A01;
    public final C1CM A02;

    public C23491Cl(Context context, UserSession userSession, C1CM c1cm) {
        C14360o3.A0B(userSession, 2);
        this.A01 = userSession;
        this.A02 = c1cm;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A00 = applicationContext;
    }

    public static /* synthetic */ C1ON A00(C1EU c1eu, C23491Cl c23491Cl, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        C1EY c1ey = null;
        String str = (i2 & 2) != 0 ? "feed/timeline/" : null;
        if ((i2 & 4) != 0) {
            i = -20;
        }
        if ((i2 & 8) != 0) {
            c1ey = C1EW.A01(c23491Cl.A01, c1eu.A02());
        }
        if ((i2 & 16) != 0) {
            interfaceC16660sJ = C25119B9p.A00;
        }
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c1ey, 3);
        UserSession userSession = c23491Cl.A01;
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0E = str;
        C25621Ms c25621Ms2 = (C25621Ms) interfaceC16660sJ.invoke(c25621Ms);
        c25621Ms2.A02 = new C128235qs(new C07510aQ(userSession), c1ey, i);
        Context context = c23491Cl.A00;
        boolean A09 = AbstractC14490oL.A09(context);
        C1CM c1cm = c23491Cl.A02;
        if (A09) {
            AbstractC23771Ej.A01(context, c25621Ms2, userSession, c1eu, c1cm);
        } else {
            AbstractC23771Ej.A02(context, c25621Ms2, userSession, c1eu, c1cm);
        }
        return c25621Ms2.A0N();
    }
}
