package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MXD {
    public C178577wV A00;
    public final Context A01;
    public final Handler A02;
    public final InterfaceC178297w3 A03;
    public final UserSession A04;

    public final C197368o7 A00(InterfaceC197408oB interfaceC197408oB) {
        InterfaceC180137z3 interfaceC180137z3;
        C178577wV c178577wV = this.A00;
        if (c178577wV != null && (interfaceC180137z3 = (InterfaceC180137z3) c178577wV.A02(InterfaceC180137z3.A00)) != null) {
            return interfaceC180137z3.AN0(interfaceC197408oB);
        }
        return null;
    }

    public MXD(Context context, UserSession userSession) {
        this.A01 = context;
        this.A04 = userSession;
        C178267w0 c178267w0 = new C178267w0();
        this.A03 = c178267w0;
        this.A02 = c178267w0.BAu("Lite-Controller-Thread");
    }
}
