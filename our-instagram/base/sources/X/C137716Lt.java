package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Lt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137716Lt implements C2IU {
    public final UserSession A00;
    public final C6DQ A01;

    public C137716Lt(UserSession userSession, C6DQ c6dq) {
        C14360o3.A0B(c6dq, 2);
        this.A00 = userSession;
        this.A01 = c6dq;
    }

    @Override // X.C2IU
    public final C71943Kr E8Z() {
        C9BO c9bo = (C9BO) this.A01.A01.A0W();
        if (c9bo != null) {
            ArrayList arrayList = new ArrayList();
            UserSession userSession = this.A00;
            HashSet hashSet = new HashSet();
            if (C2E8.A07(userSession)) {
                hashSet.add(C46962Dk.A00);
                hashSet.add(C47032Dr.A00);
            }
            HashMap hashMap = new HashMap(hashSet.size());
            int i = 0;
            for (C9ZG c9zg : (List) c9bo.A01) {
                C5NQ c5nq = new C5NQ(c9zg);
                if (c9zg.A05) {
                    if (i < 20) {
                        arrayList.add(c5nq);
                    }
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((AbstractC46972Dl) next).A00 == c9zg.A00) {
                                if (next != null) {
                                    hashMap.put(next, Integer.valueOf(((Number) hashMap.getOrDefault(next, 0)).intValue() + 1));
                                }
                            }
                        }
                    }
                }
                i++;
            }
            int size = arrayList.size();
            return new C71943Kr(new C71933Kq(size, -1, size), arrayList, hashMap);
        }
        return new C71943Kr(new C71933Kq(0, -1, -1), null, null);
    }
}
