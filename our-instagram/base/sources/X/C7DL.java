package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7DL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7DL {
    public final Map A00 = new HashMap();

    public static final synchronized DirectMessageIdentifier A00(C7DL c7dl, DirectMessageIdentifier directMessageIdentifier) {
        synchronized (c7dl) {
            Map map = c7dl.A00;
            if (map.containsKey(directMessageIdentifier)) {
                return directMessageIdentifier;
            }
            ArrayList arrayList = new ArrayList();
            DirectMessageIdentifier directMessageIdentifier2 = directMessageIdentifier;
            for (DirectMessageIdentifier directMessageIdentifier3 : map.keySet()) {
                if (directMessageIdentifier.A02(directMessageIdentifier3)) {
                    arrayList.add(directMessageIdentifier3);
                    directMessageIdentifier2 = directMessageIdentifier2.A01(directMessageIdentifier3);
                }
            }
            if (!arrayList.isEmpty() && !map.containsKey(directMessageIdentifier2)) {
                Object obj = map.get(arrayList.get(0));
                if (obj != null) {
                    map.put(directMessageIdentifier2, obj);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        map.remove((DirectMessageIdentifier) it.next());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return directMessageIdentifier2;
        }
    }

    public final synchronized Object A01(DirectMessageIdentifier directMessageIdentifier) {
        Object obj;
        if (directMessageIdentifier != null) {
            obj = this.A00.get(A00(this, directMessageIdentifier));
        } else {
            obj = null;
        }
        return obj;
    }

    public final synchronized void A02(DirectMessageIdentifier directMessageIdentifier, Object obj) {
        C14360o3.A0B(directMessageIdentifier, 0);
        this.A00.put(A00(this, directMessageIdentifier), obj);
    }
}
