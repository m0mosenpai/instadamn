package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.G2n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36361G2n implements InterfaceC37156GYt {
    public final UserSession A00;
    public final E70 A01;
    public final EnumC31337Dq2 A02;

    public C36361G2n(UserSession userSession, E70 e70, EnumC31337Dq2 enumC31337Dq2) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = e70;
        this.A02 = enumC31337Dq2;
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        return true;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        C160857It c160857It = C160857It.A00;
        return C7KH.A04(this.A00, this.A01, this.A02, !c160857It.A08(r3, r2));
    }
}
