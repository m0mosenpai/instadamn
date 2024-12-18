package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.6l0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147756l0 {
    public final AbstractC147746kz A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C14360o3.A0B(enumC142806cg, 2);
        Map map = ((C142826ci) userSession.A01(C142826ci.class, C142816ch.A00)).A00;
        Object obj = map.get(enumC142806cg);
        if (obj == null) {
            int ordinal = enumC142806cg.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal == 1) {
                        obj = new C147766l1(interfaceC11380iw, userSession);
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    obj = new AbstractC147746kz(interfaceC11380iw, userSession, enumC142806cg);
                }
            } else {
                obj = new NYV(interfaceC11380iw, userSession);
            }
            map.put(enumC142806cg, obj);
        }
        return (AbstractC147746kz) obj;
    }

    public final void A01(UserSession userSession, EnumC142806cg enumC142806cg) {
        ((C142826ci) userSession.A01(C142826ci.class, C142816ch.A00)).A00.remove(enumC142806cg);
    }
}
