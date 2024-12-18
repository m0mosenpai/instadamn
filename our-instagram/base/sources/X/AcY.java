package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AcY implements InterfaceC199598sB {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public AcY(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC199598sB
    public final InterfaceC199698sL ALY(InterfaceC199678sJ interfaceC199678sJ, InterfaceC178897x1 interfaceC178897x1) {
        if (interfaceC199678sJ != null) {
            return new C23592Acm(this.A00, interfaceC199678sJ, interfaceC178897x1, this.A01);
        }
        throw AbstractC166997dE.A0g();
    }
}
