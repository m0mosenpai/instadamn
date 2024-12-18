package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3Z8, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3Z8 {
    public static final void A00(UserSession userSession, String str, List list, List list2, boolean z) {
        C38321qM A02;
        String id;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C3XG c3xg = (C3XG) list.get(i);
                if (c3xg.equals(list2.get(i2)) && ((A02 = C3XH.A02(c3xg.A05)) == null || !A02.CdW())) {
                    if (userSession != null) {
                        C3YO A00 = C3YM.A00(userSession);
                        C3YP c3yp = C3YP.A05;
                        Integer num = C05F.A00;
                        if (A02 == null) {
                            id = "";
                        } else {
                            id = A02.getId();
                        }
                        Integer valueOf = Integer.valueOf(list.size() + i2);
                        int i3 = i;
                        if (z) {
                            i3 = -100;
                        }
                        A00.A07(new C25615BUc(c3yp, num, valueOf, Integer.valueOf(i3), null, null, str, id));
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
    }
}
