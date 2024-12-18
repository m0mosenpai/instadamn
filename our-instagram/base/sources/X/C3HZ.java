package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3HZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HZ {
    public final UserSession A00;
    public final HashMap A01;
    public final InterfaceC09390do A02;

    public C3HZ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new HashMap();
        this.A02 = AbstractC09440dt.A01(new C206839Do(this, 19));
    }

    public final void A00(InterfaceC669630n interfaceC669630n) {
        C14360o3.A0B(interfaceC669630n, 0);
        for (Object obj : interfaceC669630n.Bts()) {
            HashMap hashMap = this.A01;
            List list = (List) hashMap.get(obj);
            if (list == null) {
                list = new ArrayList();
            }
            if (!list.contains(interfaceC669630n)) {
                list.add(interfaceC669630n);
                hashMap.put(obj, list);
            }
        }
    }

    public final void A01(InterfaceC669630n interfaceC669630n) {
        C14360o3.A0B(interfaceC669630n, 0);
        for (Object obj : interfaceC669630n.Bts()) {
            HashMap hashMap = this.A01;
            List list = (List) hashMap.get(obj);
            if (list != null) {
                list.remove(interfaceC669630n);
            }
            Collection collection = (Collection) hashMap.get(obj);
            if (collection == null || collection.isEmpty()) {
                hashMap.remove(obj);
            }
        }
    }
}
