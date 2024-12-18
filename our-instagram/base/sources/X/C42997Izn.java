package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.Izn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42997Izn implements InterfaceC25441Ly {
    public final UserSession A00;
    public final InterfaceC09390do A01 = J8V.A00(this, 29);
    public final Map A02;

    @Override // X.InterfaceC25441Ly
    public final void EGI(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A02;
        if (map.containsKey(str)) {
            map.remove(str);
        }
    }

    @Override // X.InterfaceC25441Ly
    public final void FCF(EnumC74603Ws enumC74603Ws, Collection collection) {
    }

    @Override // X.InterfaceC25441Ly
    public final void AAM(C9BW c9bw) {
        C82593mN c82593mN = C82593mN.A00;
        if (C82593mN.A00(c9bw)) {
            C72293Mc c72293Mc = AbstractC72283Mb.A00;
            UserSession userSession = this.A00;
            if (C72293Mc.A01(userSession) || C72293Mc.A00(userSession)) {
                c82593mN.A01(c9bw, (C3HZ) this.A01.getValue());
                if (c72293Mc.A02((C9C7) c9bw.A01, userSession)) {
                    return;
                }
            }
        }
        this.A02.put(((C9C7) c9bw.A01).A06, c9bw);
    }

    @Override // X.InterfaceC25441Ly
    public final List AbA() {
        return AbstractC001800i.A0a(this.A02.values());
    }

    public C42997Izn(UserSession userSession, Map map) {
        this.A00 = userSession;
        this.A02 = map;
    }
}
