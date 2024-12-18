package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Koe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46897Koe {
    public static final C49261LqH A00(AbstractC59962oe abstractC59962oe, UserSession userSession, MSH msh, InterfaceC50423MOd interfaceC50423MOd) {
        Object obj;
        Context requireContext = abstractC59962oe.requireContext();
        C2DS A00 = C2JD.A00(userSession);
        C2054597s c2054597s = C2054597s.A00;
        C16930sl c16930sl = C16930sl.A00;
        C43929Jbe A002 = AbstractC43930Jbf.A00(userSession, c2054597s.createWithAdditionalCapabilities(c16930sl, c16930sl));
        C14360o3.A0B(A00, 1);
        C28811aJ A003 = C28811aJ.A00(userSession);
        C14360o3.A07(A003);
        C43631JRo c43631JRo = new C43631JRo(interfaceC50423MOd, A003, A00);
        JS8 js8 = new JS8(requireContext, userSession, A002, C41951wl.A00(userSession));
        C43950Jbz c43950Jbz = new C43950Jbz(null);
        if (C18U.A06(C06090Tz.A05, userSession, 36325506245014660L)) {
            obj = new C48740Lh8(userSession);
        } else {
            obj = new Object();
        }
        js8.A01 = msh;
        js8.A03 = c43950Jbz;
        js8.A00 = (InterfaceC50516MRt) obj;
        C47032Dr c47032Dr = C47032Dr.A00;
        C4I3 c4i3 = C4I3.A03;
        return new C49261LqH(c43631JRo, new C43787JYa(requireContext, AbstractC31180DnO.A0J(userSession, C4HC.A00), userSession, js8, c47032Dr, AbstractC28761aE.A00(userSession), c4i3, C41951wl.A00(userSession), false, false, false));
    }
}
