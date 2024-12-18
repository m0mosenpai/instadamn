package X;

import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;

/* renamed from: X.7gn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC169147gn {
    @Deprecated(message = "Use newer extension method #nameMatchesQuery combine with Iterable#filter")
    public static final void A00(InterfaceC28041Xi interfaceC28041Xi, String str, Collection collection, java.util.Set set) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            if (AbstractC169157go.A00(user, str) && (interfaceC28041Xi == null || interfaceC28041Xi.apply(user))) {
                set.add(user);
            }
        }
    }
}
