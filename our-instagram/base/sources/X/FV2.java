package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class FV2 {
    public static final G05 A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        return (G05) userSession.A01(G05.class, new MHU(41, interfaceC11380iw, userSession));
    }

    public static final void A01(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C0Ah c0Ah = (C0Ah) it.next();
            if (c0Ah != null) {
                c0Ah.Cht();
            }
        }
    }
}
