package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.FgF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35222FgF {
    public static final C35222FgF A00 = new Object();

    public static final Long A00(UserSession userSession, DirectShareTarget directShareTarget, Map map) {
        C81663kb B3W;
        String C7I;
        InterfaceC83713oG A0O = AbstractC31171DnF.A0O(directShareTarget);
        if (A0O instanceof C83693oE) {
            C7I = ((C83693oE) A0O).A00;
        } else if ((A0O instanceof C122145g6) && (B3W = C2JD.A00(userSession).B3W(((C122145g6) A0O).A00)) != null) {
            C7I = B3W.C7I();
        } else {
            return null;
        }
        if (C7I != null) {
            return (Long) map.get(C7I);
        }
        return null;
    }

    public static final LinkedHashMap A01(List list) {
        String A0o;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        for (Object obj : list) {
            if (obj instanceof DirectShareTarget) {
                A0o = AbstractC31173DnH.A0o((DirectShareTarget) obj);
            } else if (obj != null) {
                A0o = obj.toString();
            }
            A1I.put(A0o, obj);
        }
        return A1I;
    }

    public static final boolean A02(String str, String str2) {
        if (AbstractC13670mt.A0B(str2) || str == null || !AbstractC31172DnG.A16(C1Q2.A02(), str).startsWith(AbstractC31172DnG.A16(C1Q2.A02(), str2))) {
            return false;
        }
        return true;
    }
}
