package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160117Fx implements InterfaceC160057Fr {
    public final UserSession A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC160057Fr
    public final View Ajw() {
        InterfaceC56392iX interfaceC56392iX = (InterfaceC56392iX) this.A01.getValue();
        if (interfaceC56392iX != null) {
            return interfaceC56392iX.getView();
        }
        return null;
    }

    public C160117Fx(View view, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = C1XM.A00(new C9FA(28, this, view));
    }
}
