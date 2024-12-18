package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class BL1 extends C0T6 implements InterfaceC30871Dhk {
    public final C120985dq A00;
    public final User A01;
    public final Integer A02;
    public final boolean A03;

    public BL1(C120985dq c120985dq, User user, Integer num, boolean z) {
        C14360o3.A0B(num, 4);
        this.A00 = c120985dq;
        this.A01 = user;
        this.A03 = z;
        this.A02 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BL1) {
                BL1 bl1 = (BL1) obj;
                if (!C14360o3.A0K(this.A00, bl1.A00) || !C14360o3.A0K(this.A01, bl1.A01) || this.A03 != bl1.A03 || this.A02 != bl1.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0D = AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)));
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "CLOSE_FRIENDS";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "FAN_CLUB";
                break;
        }
        return A0D + AbstractC25226BEj.A02(str, intValue);
    }
}
