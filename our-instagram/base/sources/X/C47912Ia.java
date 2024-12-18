package X;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.2Ia, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47912Ia {
    public final synchronized C2IZ A00(String str) {
        C2IZ c2iz;
        C14360o3.A0B(str, 0);
        C005001p c005001p = C2IZ.A03;
        c2iz = (C2IZ) c005001p.get(str);
        if (c2iz == null) {
            c2iz = new C2IZ(str);
            c005001p.put(str, c2iz);
            Map map = c2iz.A02;
            map.put(-1, new CopyOnWriteArraySet());
            map.put(0, new CopyOnWriteArraySet());
            map.put(1, new CopyOnWriteArraySet());
        }
        return c2iz;
    }
}
