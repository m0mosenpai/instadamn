package X;

import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.A8h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22911A8h {
    public final InterfaceC150446pt A00;
    public final C22939A9j A01;
    public final UserSession A02;
    public final ArrayList A03;

    public C22911A8h(ViewStub viewStub, C07X c07x, InterfaceC150446pt interfaceC150446pt, UserSession userSession) {
        AbstractC167017dG.A1Q(viewStub, c07x);
        C14360o3.A0B(userSession, 4);
        this.A00 = interfaceC150446pt;
        this.A02 = userSession;
        this.A03 = AbstractC166987dD.A1E();
        this.A01 = new C22939A9j(viewStub, AbstractC57302k5.A00(c07x.getLifecycle()));
    }
}
