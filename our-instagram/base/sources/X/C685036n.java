package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.36n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C685036n {
    public final C18920wW A00;

    public C685036n(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A00(String str, Map map) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(map, 1);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(3853));
        if (A00.isSampled()) {
            A00.AAP("event_name", str);
            A00.AAP(AbstractC111324zv.A00(4391), AbstractC111324zv.A00(2176));
            A00.A9M("event_target_info", map);
            A00.Cht();
        }
    }
}
