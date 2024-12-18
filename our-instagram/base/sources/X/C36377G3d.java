package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.G3d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36377G3d implements JH0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.JH0
    public final void onCancel() {
    }

    public C36377G3d(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    @Override // X.JH0
    public final void DCh(int i) {
        InterfaceC83733oI interfaceC83733oI;
        int i2 = this.A00;
        UserSession userSession = (UserSession) this.A03;
        if (i2 != 0) {
            interfaceC83733oI = (InterfaceC83733oI) this.A02;
        } else {
            interfaceC83733oI = ((E70) this.A02).A0L;
        }
        AbstractC31278Dp0.A02((InterfaceC11380iw) this.A01, userSession, AbstractC31171DnF.A0c(interfaceC83733oI), i);
    }
}
