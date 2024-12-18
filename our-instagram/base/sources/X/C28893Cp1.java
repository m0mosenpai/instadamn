package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.shared.feedback.data.FeedbackRepository;

/* renamed from: X.Cp1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28893Cp1 implements InterfaceC52932ba {
    public final Application A00;
    public final FoaUserSession A01;
    public final CA4 A02;
    public final CVW A03;
    public final Integer A04;
    public final boolean A05;

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        C14360o3.A0B(cls, 0);
        boolean z = this.A05;
        Application application = this.A00;
        FoaUserSession foaUserSession = this.A01;
        return new C25855BcA(application, new C27907CRs(foaUserSession, this.A02, this.A03, this.A04), new FeedbackRepository(application, foaUserSession), z);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }

    public C28893Cp1(Application application, FoaUserSession foaUserSession, CA4 ca4, CVW cvw, Integer num, boolean z) {
        this.A05 = z;
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A03 = cvw;
        this.A02 = ca4;
        this.A04 = num;
    }
}
