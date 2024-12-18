package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.F9t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34273F9t {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.Egv, X.FQz] */
    public static final C33008Egv A00(C35781FrJ c35781FrJ, List list) {
        C14360o3.A0B(c35781FrJ, 0);
        if (list == null) {
            list = C16930sl.A00;
        }
        C35120FeN c35120FeN = new C35120FeN(c35781FrJ);
        ArrayList A1E = AbstractC166987dD.A1E();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C34954Fae c34954Fae = (C34954Fae) list.get(i);
            C14360o3.A0B(c34954Fae, 0);
            EnumC33522Erv enumC33522Erv = c34954Fae.A00;
            if (enumC33522Erv != null) {
                A1E.add(C35120FeN.A00(c35120FeN, enumC33522Erv, c34954Fae.A02));
            }
        }
        UserSession userSession = c35781FrJ.A00;
        if (userSession != null && C18U.A06(C06090Tz.A05, userSession, 36330595781067691L)) {
            Iterator it = A1E.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((AbstractC34718FRf) next).A00.equals(EnumC33522Erv.A0J)) {
                    if (next != null) {
                        A1E.remove(next);
                        A1E.add(next);
                    }
                }
            }
        }
        return new AbstractC34714FQz(A1E);
    }
}
