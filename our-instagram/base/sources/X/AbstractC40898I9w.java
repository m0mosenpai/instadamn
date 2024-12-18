package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.I9w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40898I9w {
    public static final C38931HCe A00(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, AnonymousClass341 anonymousClass341, InterfaceC43588JPt interfaceC43588JPt, String str, String str2) {
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC37301Gc2.A0u(A0b, c38321qM);
        AbstractC31173DnH.A1C(A0b, userSession);
        AbstractC37300Gc1.A0c(A0b, interfaceC60442pS.getModuleName());
        A0b.putSerializable("media_surface", anonymousClass341);
        A0b.putString("shopping_session_id", str);
        A0b.putString("prior_submodule_name", str2);
        C38931HCe c38931HCe = new C38931HCe();
        c38931HCe.setArguments(A0b);
        if (interfaceC43588JPt != null) {
            c38931HCe.A04 = interfaceC43588JPt;
        }
        return c38931HCe;
    }
}
