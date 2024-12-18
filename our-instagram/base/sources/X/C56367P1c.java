package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.P1c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56367P1c implements InterfaceC57944Pmo {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C56367P1c(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC57944Pmo
    public final void Dav() {
        if (this.A00 != 0) {
            NMX.A04((C130135uJ) this.A01, (NMX) this.A02);
            return;
        }
        C51045Mgx c51045Mgx = ((P0G) this.A02).A08.A0D.A02;
        C130135uJ c130135uJ = (C130135uJ) this.A01;
        C131975xX c131975xX = C131965xW.A05;
        UserSession userSession = c51045Mgx.A01;
        if (MSX.A0Q(userSession) != null) {
            c130135uJ.A00 = true;
            C131975xX.A00(userSession).A0A(c130135uJ);
        }
        C51045Mgx.A01(c51045Mgx);
        C51045Mgx.A00(c51045Mgx);
    }
}
