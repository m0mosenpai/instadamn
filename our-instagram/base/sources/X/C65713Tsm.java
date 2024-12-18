package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Tsm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65713Tsm extends AbstractC77473dX {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C65713Tsm(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        InterfaceC71994XEi interfaceC71994XEi;
        switch (this.A00) {
            case 0:
                ((C75563aN) this.A03).A01.D3v((C38321qM) this.A01, (C75113Zb) this.A02);
                return;
            case 1:
                if (((C3OO) this.A02).getBindingAdapterPosition() == -1) {
                    return;
                }
                C66423UGs c66423UGs = (C66423UGs) this.A01;
                InterfaceC63842v5 interfaceC63842v5 = c66423UGs.A02;
                interfaceC63842v5.getClass();
                FOC foc = (FOC) this.A03;
                C47K c47k = c66423UGs.A01;
                c47k.getClass();
                int A00 = c47k.A00(foc);
                C47K c47k2 = c66423UGs.A01;
                c47k2.getClass();
                int i = c47k2.A01;
                int i2 = c66423UGs.A00;
                C47K c47k3 = c66423UGs.A01;
                c47k3.getClass();
                String str = c47k3.A0C;
                C47K c47k4 = c66423UGs.A01;
                c47k4.getClass();
                interfaceC63842v5.DMp(foc, str, "preview", c47k4.getId(), A00, i, i2);
                FollowStatus A0N = C57582kX.A00(c66423UGs.A07).A0N(user);
                if (A0N != FollowStatus.A05 && A0N != FollowStatus.A07) {
                    return;
                }
                c66423UGs.A0A.run();
                return;
            default:
                C14360o3.A0B(user, 0);
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                C70792Wh5 c70792Wh5 = (C70792Wh5) this.A03;
                interfaceC16660sJ.invoke(AnonymousClass001.A0R(c70792Wh5.A01.getId(), AbstractC34345FCn.A00(c70792Wh5.A00)));
                if ((user.B7L() == FollowStatus.A05 || user.B7L() == FollowStatus.A07) && (interfaceC71994XEi = (InterfaceC71994XEi) this.A01) != null) {
                    interfaceC71994XEi.DHz(user.getId());
                    return;
                }
                return;
        }
    }
}
