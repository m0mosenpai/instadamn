package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MUi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50577MUi extends AbstractRunnableC14200nk {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC71793Kc A01;
    public final /* synthetic */ C27741Wc A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50577MUi(UserSession userSession, InterfaceC71793Kc interfaceC71793Kc, C27741Wc c27741Wc) {
        super(339);
        this.A02 = c27741Wc;
        this.A01 = interfaceC71793Kc;
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC71793Kc interfaceC71793Kc = this.A01;
        interfaceC71793Kc.ASk();
        interfaceC71793Kc.AWX(this.A00, true);
    }
}
