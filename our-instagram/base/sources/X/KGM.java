package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGM extends AbstractC61132qb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public KGM(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        Context context = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        AbstractC167027dH.A12(userSession, context, interfaceC11380iw);
        return new C44489Jlv(context, userSession, new KZQ(context, interfaceC11380iw, userSession));
    }
}
