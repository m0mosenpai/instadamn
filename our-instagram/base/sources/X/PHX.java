package X;

import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class PHX implements InterfaceC1119153d {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ InterfaceC1118853a A01;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public PHX(C41181vS c41181vS, InterfaceC1118853a interfaceC1118853a) {
        this.A00 = c41181vS;
        this.A01 = interfaceC1118853a;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        C17Q c17q;
        User user = this.A00.A0i;
        if (user != null) {
            c17q = user.A02;
        } else {
            c17q = null;
        }
        C17Q c17q2 = C17Q.A06;
        InterfaceC1118853a interfaceC1118853a = this.A01;
        if (c17q == c17q2) {
            interfaceC1118853a.CqT();
        } else {
            interfaceC1118853a.EJJ();
        }
    }
}
