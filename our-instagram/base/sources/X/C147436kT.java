package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6kT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147436kT implements InterfaceC13000lm {
    public final UserSession A00;
    public final Map A01;
    public final Map A02;

    public C147436kT(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        Map linkedHashMap = new LinkedHashMap();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36320506904519279L)) {
            linkedHashMap = Collections.synchronizedMap(linkedHashMap);
            C14360o3.A07(linkedHashMap);
        }
        this.A01 = linkedHashMap;
        Map hashMap = new HashMap();
        if (C18U.A06(c06090Tz, this.A00, 36320506904519279L)) {
            hashMap = Collections.synchronizedMap(hashMap);
            C14360o3.A07(hashMap);
        }
        this.A02 = hashMap;
    }

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        C72786Xn6 c72786Xn6 = (C72786Xn6) this.A02.remove(str);
        if (c72786Xn6 != null) {
            C72497XfA c72497XfA = c72786Xn6.A02;
            C43647JSf c43647JSf = c72497XfA.A01;
            if (c43647JSf != null) {
                c43647JSf.A00();
            }
            c72497XfA.A01 = null;
            c72497XfA.A00 = null;
            InterfaceC678133v interfaceC678133v = c72786Xn6.A01;
            interfaceC678133v.EJa(false);
            this.A01.put(str, interfaceC678133v);
        }
    }

    public final void A00() {
        Map map = this.A01;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((InterfaceC678133v) ((Map.Entry) it.next()).getValue()).release();
        }
        map.clear();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A00();
    }
}
