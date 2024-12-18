package X;

import com.instagram.api.schemas.IGConsiderAndBrowseType;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Hu, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5Hu {
    public static final boolean A00(InterfaceC43506JJs interfaceC43506JJs, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (A02(interfaceC43506JJs, userSession) && C18U.A06(C06090Tz.A06, userSession, 36320515492881011L)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(InterfaceC43506JJs interfaceC43506JJs, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A06, userSession, 36320515492946548L) && A02(interfaceC43506JJs, userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(InterfaceC43506JJs interfaceC43506JJs, UserSession userSession) {
        List AiQ;
        if (interfaceC43506JJs != null && (AiQ = interfaceC43506JJs.AiQ()) != null) {
            if ((AiQ instanceof Collection) && AiQ.isEmpty()) {
                return false;
            }
            Iterator it = AiQ.iterator();
            while (it.hasNext()) {
                if (((InterfaceC43502JJo) it.next()).CHH() == IGConsiderAndBrowseType.A05) {
                    return C18U.A06(C06090Tz.A06, userSession, 36320515492684401L);
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A06, userSession, 36320515494257281L);
    }
}
