package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8hn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193678hn implements InterfaceC52932ba {
    public final Context A00;
    public final UserSession A01;

    public C193678hn(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        context.getApplicationContext();
        C8CI c8ci = (C8CI) userSession.A01(C8CI.class, new B8P(userSession, 36));
        return new C188848Ya(new C193708hq(new C8CM(c8ci), new C193698hp(c8ci), new C193688ho(c8ci)));
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(cls, 1);
        return create(cls);
    }
}
