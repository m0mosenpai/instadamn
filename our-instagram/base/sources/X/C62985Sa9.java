package X;

import java.util.Map;

/* renamed from: X.Sa9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62985Sa9 {
    public final Map A00 = AbstractC166987dD.A1I();

    public static void A00(C62985Sa9 c62985Sa9, Object obj, Object obj2) {
        Map map = c62985Sa9.A00;
        if (obj != null) {
            map.remove(obj2);
        } else {
            if (!map.containsKey(obj2)) {
                return;
            }
            C58252li A02 = c62985Sa9.A02(obj2);
            if (!C63406Sjd.A0G((C63406Sjd) A02.A02())) {
                return;
            }
            A02.A0B(C63406Sjd.A03(null));
        }
    }

    public final C58252li A01(C63406Sjd c63406Sjd, Object obj) {
        Map map = this.A00;
        Object obj2 = map.get(obj);
        Object obj3 = obj2;
        if (obj2 == null) {
            C58252li A0I = AbstractC58318PtA.A0I();
            A0I.A0B(c63406Sjd);
            map.put(obj, A0I);
            obj3 = A0I;
        }
        return (C58252li) obj3;
    }

    public final C58252li A02(Object obj) {
        Object obj2 = this.A00.get(obj);
        if (obj2 != null) {
            return (C58252li) obj2;
        }
        throw AbstractC166997dE.A0g();
    }

    public final C58252li A03(Object obj) {
        C63406Sjd A0S;
        C58252li c58252li = (C58252li) this.A00.get(obj);
        if (c58252li == null || (A0S = AbstractC58318PtA.A0S(c58252li)) == null || C63406Sjd.A0G(A0S) || (C63406Sjd.A0J(A0S) && A0S.A01 == null)) {
            return null;
        }
        return c58252li;
    }
}
