package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.39r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C693139r implements InterfaceC690438q {
    public final UserSession A00;
    public final InterfaceC690438q A01;
    public final C33A A02;

    public C693139r(UserSession userSession, InterfaceC690438q interfaceC690438q, C33A c33a) {
        C14360o3.A0B(interfaceC690438q, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c33a, 3);
        this.A01 = interfaceC690438q;
        this.A00 = userSession;
        this.A02 = c33a;
    }

    @Override // X.InterfaceC690438q
    public final void DGa(InterfaceC38381qS interfaceC38381qS) {
        Object c42597ItG;
        boolean z = interfaceC38381qS instanceof C38321qM;
        C33A c33a = this.A02;
        if (z) {
            c33a.A01((C38321qM) interfaceC38381qS);
            c42597ItG = new C42596ItF(interfaceC38381qS, this);
        } else {
            c33a.A00 = true;
            int intValue = interfaceC38381qS.CCj().intValue();
            if (intValue == 2 || intValue == 3) {
                c42597ItG = new C42597ItG(interfaceC38381qS, this);
            }
            c33a.A00();
        }
        c33a.A06.put(interfaceC38381qS, c42597ItG);
        c33a.A00();
    }

    @Override // X.InterfaceC690438q
    public final void DaJ() {
        this.A01.DaJ();
    }

    @Override // X.InterfaceC690438q
    public final void Dti() {
        this.A01.Dti();
    }
}
