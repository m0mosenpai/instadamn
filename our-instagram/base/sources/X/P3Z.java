package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class P3Z implements InterfaceC57950Pmw {
    public final UserSession A00;
    public final InterfaceC09390do A01;

    public P3Z(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57241PbP(this, 37));
    }

    @Override // X.InterfaceC57950Pmw
    public final void AIQ(C52C c52c, L0G l0g, List list) {
        AbstractC001800i.A0P("\n", "", "", AbstractC001800i.A0S(c52c.A05, list), MLF.A00);
        ((InterfaceC57950Pmw) this.A01.getValue()).AIQ(c52c, l0g, list);
    }
}
