package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.6l8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147836l8 {
    public final AbstractC147826l7 A00(UserSession userSession, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(enumC142806cg, 1);
        Map map = ((C143116dB) userSession.A01(C143116dB.class, C143106dA.A00)).A00;
        Object obj = map.get(enumC142806cg);
        if (obj == null) {
            int ordinal = enumC142806cg.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal == 1) {
                        obj = new C147846l9(userSession);
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    obj = new C52817NZa(userSession, enumC142806cg);
                }
            } else {
                obj = new NZZ(userSession);
            }
            map.put(enumC142806cg, obj);
        }
        return (AbstractC147826l7) obj;
    }

    public final void A01(UserSession userSession, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(userSession, 0);
        ((C143116dB) userSession.A01(C143116dB.class, C143106dA.A00)).A00.remove(enumC142806cg);
    }
}
