package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class A9L {
    public final Context A00;
    public final View A01;
    public final C148676mc A02;
    public final C35045FcI A03;
    public final UserSession A04;

    public A9L(Context context, View view, UserSession userSession) {
        this.A00 = context;
        this.A01 = view;
        this.A04 = userSession;
        C148676mc c148676mc = new C148676mc(EnumC143386dd.THREAD, userSession);
        this.A02 = c148676mc;
        C35045FcI c35045FcI = new C35045FcI(context, view, userSession, false);
        this.A03 = c35045FcI;
        c35045FcI.A04();
        c148676mc.A01();
    }
}
