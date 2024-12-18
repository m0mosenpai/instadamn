package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119885bm {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public final C25991Og A00(String str) {
        Map map = this.A00;
        C02R.A07(map.containsKey(str), AnonymousClass001.A0R("No DirectMutationDefinition registered for type: ", str));
        Object obj = map.get(str);
        obj.getClass();
        return (C25991Og) obj;
    }

    public final C43684JTt A01(String str) {
        C02R.A07(this.A00.containsKey(str), AnonymousClass001.A0R("No SessionScopedDirectMutationDefinition registered for type: ", str));
        Object obj = this.A01.get(str);
        obj.getClass();
        return (C43684JTt) ((InterfaceC09390do) obj).getValue();
    }

    public C119885bm(UserSession userSession, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25991Og c25991Og = (C25991Og) it.next();
            String str = c25991Og.A02;
            this.A00.put(str, c25991Og);
            this.A01.put(str, C0KW.A00(userSession, c25991Og.A01));
        }
    }
}
