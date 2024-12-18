package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.38p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C690338p implements InterfaceC690438q {
    public final UserSession A00;
    public final C33A A01;
    public final InterfaceC65282xQ A02;

    @Override // X.InterfaceC690438q
    public final void DGa(InterfaceC38381qS interfaceC38381qS) {
        C33A c33a;
        Object c42594ItD;
        if (interfaceC38381qS instanceof C38321qM) {
            c33a = this.A01;
            if (c33a != null) {
                c33a.A01((C38321qM) interfaceC38381qS);
                c42594ItD = new C42595ItE(this, interfaceC38381qS);
                c33a.A06.put(interfaceC38381qS, c42594ItD);
            }
        } else if ((interfaceC38381qS instanceof C105854pw) && (c33a = this.A01) != null) {
            c33a.A00 = true;
            c42594ItD = new C42594ItD(this);
            c33a.A06.put(interfaceC38381qS, c42594ItD);
        }
        C33A c33a2 = this.A01;
        if (c33a2 != null) {
            c33a2.A00();
        }
    }

    @Override // X.InterfaceC690438q
    public final void DaJ() {
        C33A c33a = this.A01;
        if (c33a != null) {
            c33a.onPause();
        }
    }

    @Override // X.InterfaceC690438q
    public final void Dti() {
        this.A02.AVK();
    }

    public C690338p(UserSession userSession, C33A c33a, InterfaceC65282xQ interfaceC65282xQ) {
        this.A00 = userSession;
        this.A02 = interfaceC65282xQ;
        this.A01 = c33a;
    }
}
