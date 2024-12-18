package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iaw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41607Iaw {
    public static final C41607Iaw A00 = new Object();

    public final void A00(Activity activity, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, InterfaceC1118853a interfaceC1118853a, String str) {
        C38916HBn c38916HBn = new C38916HBn();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("user_name", str);
        C189448aO A0W = AbstractC31174DnI.A0W(A0b, c38916HBn, userSession);
        A0W.A0g = activity.getString(2131977072);
        A0W.A1J = true;
        A0W.A0K = new ViewOnClickListenerC42030Ijz(10, c38916HBn, c38321qM, userSession, c75113Zb);
        A0W.A0v = true;
        A0W.A0h = activity.getString(2131954754);
        A0W.A1N = true;
        A0W.A0w = true;
        if (interfaceC1118853a != null) {
            interfaceC1118853a.EJE("bottom_sheet");
            A0W.A0U = new C43010J0a(interfaceC1118853a, 0);
        }
        AbstractC31173DnH.A0w(activity, c38916HBn, A0W);
    }
}
