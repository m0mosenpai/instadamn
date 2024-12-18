package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2uh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC63602uh implements InterfaceC43071ya {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final InterfaceC63482uV A02;
    public final Map A03;

    public final void A00(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0 && intValue != 1) {
            ((AbstractC63592ug) this).A09.remove(c59062n7.A05);
        } else {
            ((AbstractC63592ug) this).A09.put(c59062n7.A05, Float.valueOf(interfaceC57162jr.CGk(c59062n7)));
        }
    }

    public AbstractC63602uh(UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC63482uV interfaceC63482uV, Map map) {
        this.A01 = interfaceC60442pS;
        this.A00 = userSession;
        this.A02 = interfaceC63482uV;
        this.A03 = map;
    }
}
