package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CSY {
    public InterfaceC69973Cg A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC31051Dkr A03;
    public final C36324G0t A04;

    public CSY(Context context, UserSession userSession, InterfaceC31051Dkr interfaceC31051Dkr) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = interfaceC31051Dkr;
        C36324G0t c36324G0t = new C36324G0t(this, 2);
        this.A04 = c36324G0t;
        this.A00 = AbstractC69933Cc.A00(context, userSession, c36324G0t);
    }
}
