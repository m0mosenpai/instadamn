package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EPY extends C7E1 {
    public EDI A00;
    public final ERW A01;
    public final HFA A02;
    public final C32447EQz A03;

    public EPY(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ENO eno, ENO eno2) {
        C32447EQz c32447EQz = new C32447EQz(context);
        this.A03 = c32447EQz;
        HFA hfa = new HFA(context, interfaceC11380iw, userSession, eno);
        this.A02 = hfa;
        ERW erw = new ERW(context, eno2);
        this.A01 = erw;
        A0B(c32447EQz, hfa, erw);
    }
}
