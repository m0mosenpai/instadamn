package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class ABQ {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    public ABQ(Context context, UserSession userSession, YPq yPq, C22979ABd c22979ABd) {
        C14360o3.A0B(yPq, 3);
        this.A01 = AbstractC167007dF.A0q(userSession, yPq, 2, 33);
        this.A00 = AbstractC167007dF.A0q(userSession, context, 2, 32);
        this.A02 = AbstractC167007dF.A0q(userSession, c22979ABd, 2, 34);
    }

    public final BDV A00(C5NP c5np) {
        InterfaceC09390do interfaceC09390do;
        int ordinal = c5np.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 3) {
                if (ordinal == 2) {
                    interfaceC09390do = this.A02;
                } else {
                    throw new UnsupportedOperationException();
                }
            } else {
                interfaceC09390do = this.A00;
            }
        } else {
            interfaceC09390do = this.A01;
        }
        return (BDV) interfaceC09390do.getValue();
    }
}
