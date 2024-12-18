package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.7Xy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164597Xy {
    public final java.util.Set A00 = new HashSet();

    public static final synchronized DirectMessageIdentifier A00(C164597Xy c164597Xy, DirectMessageIdentifier directMessageIdentifier) {
        synchronized (c164597Xy) {
            java.util.Set<DirectMessageIdentifier> set = c164597Xy.A00;
            if (set.contains(directMessageIdentifier)) {
                return directMessageIdentifier;
            }
            HashSet hashSet = new HashSet();
            DirectMessageIdentifier directMessageIdentifier2 = directMessageIdentifier;
            for (DirectMessageIdentifier directMessageIdentifier3 : set) {
                if (directMessageIdentifier.A02(directMessageIdentifier3)) {
                    hashSet.add(directMessageIdentifier3);
                    directMessageIdentifier2 = directMessageIdentifier2.A01(directMessageIdentifier3);
                }
            }
            if (!set.contains(directMessageIdentifier2)) {
                set.add(directMessageIdentifier2);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    set.remove((DirectMessageIdentifier) it.next());
                }
            }
            return directMessageIdentifier2;
        }
    }
}
