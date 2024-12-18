package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GGs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36723GGs implements InterfaceC1119153d {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public C36723GGs(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = interfaceC16820sZ;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        InterfaceC16820sZ interfaceC16820sZ = this.A01;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        AbstractC162267Oo.A00(this.A00, true);
    }
}
