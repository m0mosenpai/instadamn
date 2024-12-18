package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel;

/* renamed from: X.Coz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28891Coz implements InterfaceC52932ba {
    public final Application A00;
    public final FoaUserSession A01;
    public final C28280CdP A02;

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
        return new WriteWithAICreationViewModel(this.A00, this.A01, this.A02);
    }

    public C28891Coz(Application application, FoaUserSession foaUserSession, C28280CdP c28280CdP) {
        AbstractC167017dG.A1Q(application, c28280CdP);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A02 = c28280CdP;
    }
}
