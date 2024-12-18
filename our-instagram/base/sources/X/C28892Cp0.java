package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel;

/* renamed from: X.Cp0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28892Cp0 implements InterfaceC52932ba {
    public final Application A00;
    public final FoaUserSession A01;
    public final C34941FaR A02;
    public final CVS A03;

    public C28892Cp0(Application application, FoaUserSession foaUserSession, C34941FaR c34941FaR, CVS cvs) {
        AbstractC25233BEq.A0w(1, application, cvs, c34941FaR);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A03 = cvs;
        this.A02 = c34941FaR;
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        return new PromptSheetAIViewModel(this.A00, this.A01, this.A02, this.A03);
    }
}
