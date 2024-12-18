package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class F3G {
    public static final boolean A00(UserSession userSession, InterfaceC83713oG interfaceC83713oG) {
        C81613kW c81613kW;
        C14360o3.A0B(userSession, 0);
        if (!(interfaceC83713oG instanceof C83693oE)) {
            return false;
        }
        C81663kb A0M = AbstractC31175DnJ.A0M(C2JD.A00(userSession), ((C83693oE) interfaceC83713oG).A00);
        C81613kW c81613kW2 = null;
        if (A0M != null) {
            c81613kW = A0M.Aic();
        } else {
            c81613kW = null;
        }
        if (!C161867Mw.A02(c81613kW)) {
            if (A0M != null) {
                c81613kW2 = A0M.Aic();
            }
            if (!C161867Mw.A01(userSession, c81613kW2)) {
                return false;
            }
        }
        return true;
    }
}
