package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IIM {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C42411xV A03;

    public IIM(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C42411xV c42411xV, boolean z) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A03 = c42411xV;
        if (z) {
            C3AX c3ax = new C3AX(userSession, null, interfaceC60442pS.getModuleName());
            C3AR c3ar = new C3AR(userSession, interfaceC60442pS.getModuleName());
            String moduleName = interfaceC60442pS.getModuleName();
            C14360o3.A08(C42411xV.A0F);
            c42411xV.A07(c3ar, c3ax, moduleName);
        }
    }
}
