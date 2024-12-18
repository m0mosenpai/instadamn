package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5GQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GQ {
    public final InterfaceC60442pS A00;
    public final UserSession A04;
    public final C30V A05;
    public final Map A03 = new HashMap();
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();

    public static String A00(C5GQ c5gq, C1NI c1ni) {
        InterfaceC60442pS interfaceC60442pS = c5gq.A00;
        if (AbstractC75423a9.A02(c1ni, interfaceC60442pS)) {
            return AnonymousClass001.A0R(Integer.toHexString(AbstractC41071vF.A06(c5gq.A04, c1ni).hashCode()), c1ni.getId());
        }
        if (AbstractC75423a9.A01(c1ni, interfaceC60442pS)) {
            return c1ni.getId();
        }
        return null;
    }

    public static String A01(C5GQ c5gq, C1NI c1ni, String str) {
        InterfaceC60442pS interfaceC60442pS = c5gq.A00;
        if (AbstractC75423a9.A02(c1ni, interfaceC60442pS)) {
            return AnonymousClass001.A0g(Integer.toHexString(AbstractC41071vF.A06(c5gq.A04, c1ni).hashCode()), c1ni.getId(), str);
        }
        if (AbstractC75423a9.A01(c1ni, interfaceC60442pS)) {
            return c1ni.getId();
        }
        return null;
    }

    public C5GQ(UserSession userSession, C30V c30v, InterfaceC60442pS interfaceC60442pS) {
        this.A00 = interfaceC60442pS;
        this.A05 = c30v;
        this.A04 = userSession;
    }

    public final void A02(C1NI c1ni, String str) {
        String A01 = A01(this, c1ni, str);
        if (AbstractC75423a9.A02(c1ni, this.A00) && this.A01.remove(A01) != null) {
            System.currentTimeMillis();
        }
    }
}
