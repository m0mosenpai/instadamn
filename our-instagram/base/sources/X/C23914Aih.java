package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Aih, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23914Aih implements InterfaceC165537ag {
    public final UserSession A00;
    public final InterfaceC16660sJ A01;

    @Override // X.InterfaceC165537ag
    public final void ECw(String str, String str2) {
        Object invoke;
        if (str != null && str2 != null && (invoke = this.A01.invoke(str)) != null) {
            AbstractC161587Lt.A03(this.A00, str2, AbstractC166987dD.A1J(invoke));
        }
    }

    public C23914Aih(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = interfaceC16660sJ;
    }
}
