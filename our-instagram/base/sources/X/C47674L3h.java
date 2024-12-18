package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.L3h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47674L3h {
    public final C57112jm A00;
    public final C39127HJz A01;
    public final C41591Iae A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;

    public C47674L3h(Context context, InterfaceC59992oh interfaceC59992oh, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, String str, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC25229BEm.A1I(userSession, 1, c57112jm);
        this.A03 = userSession;
        this.A04 = interfaceC60442pS;
        this.A00 = c57112jm;
        C39127HJz c39127HJz = new C39127HJz(userSession, interfaceC60442pS, interfaceC16660sJ);
        this.A01 = c39127HJz;
        this.A02 = new C41591Iae(context, userSession, interfaceC60442pS, str);
        interfaceC59992oh.registerLifecycleListener(new KFA(c39127HJz));
    }
}
