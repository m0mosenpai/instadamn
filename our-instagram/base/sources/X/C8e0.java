package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository;

/* renamed from: X.8e0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8e0 implements InterfaceC52932ba {
    public final /* synthetic */ Application A00;
    public final /* synthetic */ UserSession A01;

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    public C8e0(Application application, UserSession userSession) {
        this.A00 = application;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        Application application = this.A00;
        UserSession userSession = this.A01;
        Context applicationContext = application.getApplicationContext();
        C14360o3.A07(applicationContext);
        return new C8e1(application, userSession, (InspirationHubRepository) userSession.A01(InspirationHubRepository.class, new B61(30, applicationContext, userSession)));
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(cls, 1);
        return create(cls);
    }
}
