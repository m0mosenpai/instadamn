package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.EnU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33273EnU extends AbstractC77473dX {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C33273EnU(InterfaceC37216GaR interfaceC37216GaR, C47P c47p, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = interfaceC37216GaR;
        this.A03 = c47p;
        this.A01 = i;
        this.A04 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        InterfaceC37216GaR interfaceC37216GaR;
        C47P c47p;
        int intValue;
        switch (this.A00) {
            case 0:
                interfaceC37216GaR = (InterfaceC37216GaR) this.A02;
                c47p = (C47P) this.A03;
                intValue = this.A01;
                break;
            case 1:
                C14360o3.A0B(user, 0);
                interfaceC37216GaR = (InterfaceC37216GaR) this.A02;
                Integer AvK = interfaceC37216GaR.AvK(user.getId());
                c47p = (C47P) this.A03;
                if (AvK != null) {
                    intValue = AvK.intValue();
                    break;
                }
                intValue = this.A01;
                break;
            default:
                AbstractC167017dG.A1N(user, followStatus);
                interfaceC37216GaR = (InterfaceC37216GaR) this.A02;
                c47p = (C47P) this.A03;
                intValue = this.A01;
                break;
        }
        interfaceC37216GaR.DHq(c47p, this.A04, intValue);
    }
}
