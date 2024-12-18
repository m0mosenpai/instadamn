package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.763, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass763 {
    public static final ArrayList A00(C2EC c2ec) {
        int i;
        C81583kT c81583kT;
        ArrayList arrayList = new ArrayList(5);
        List C7A = c2ec.C7A();
        int i2 = 0;
        if (C7A != null) {
            i = C7A.size();
        } else {
            i = 0;
        }
        do {
            String str = null;
            if (i2 < i && C7A != null && (c81583kT = (C81583kT) C7A.get(i2)) != null) {
                str = c81583kT.A01;
            }
            arrayList.add(str);
            i2++;
        } while (i2 < 5);
        return arrayList;
    }

    public static final C09530e4 A01(UserSession userSession, List list) {
        User A01 = C17060sy.A01.A01(userSession);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!C14360o3.A0K(((User) obj).getId(), userSession.userId)) {
                arrayList.add(obj);
            }
        }
        C3AY A02 = AbstractC81683kd.A02(null, A01, null, arrayList);
        Object obj2 = A02.A00;
        if (obj2 != null) {
            return new C09530e4(obj2, A02.A01);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
