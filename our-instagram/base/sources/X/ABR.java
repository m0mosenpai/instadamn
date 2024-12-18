package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class ABR {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    public final BDW A00(C5NP c5np) {
        InterfaceC09390do interfaceC09390do;
        C14360o3.A0B(c5np, 0);
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
        return (BDW) interfaceC09390do.getValue();
    }

    public ABR(Context context, UserSession userSession, C22979ABd c22979ABd, int i) {
        this.A01 = AbstractC167007dF.A0q(userSession, context, i, 36);
        this.A00 = AbstractC167007dF.A0q(userSession, context, i, 35);
        this.A02 = AbstractC167007dF.A0q(userSession, c22979ABd, i, 37);
    }
}
