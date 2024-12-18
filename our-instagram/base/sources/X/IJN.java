package X;

import com.instagram.common.session.UserSession;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public final class IJN {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C4E9 A02;
    public final C4E5 A03;
    public final WeakHashMap A04 = new WeakHashMap();

    public IJN(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        C4E5 c4e5 = new C4E5(null, null, C05F.A01, null, 500, false, C18U.A06(C06090Tz.A05, this.A00, 36324565646913776L), false);
        this.A03 = c4e5;
        this.A02 = C4E8.A00(userSession, c4e5);
    }
}
