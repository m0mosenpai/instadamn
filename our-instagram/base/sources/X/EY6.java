package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EY6 extends C4F4 {
    public final UserSession A00;
    public final C44096JeL A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EY6) {
                EY6 ey6 = (EY6) obj;
                if (!C14360o3.A0K(this.A00, ey6.A00) || this.A02 != ey6.A02 || !C14360o3.A0K(this.A01, ey6.A01) || this.A03 != ey6.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A00))));
    }

    public EY6(UserSession userSession, C44096JeL c44096JeL, boolean z, boolean z2) {
        this.A00 = userSession;
        this.A02 = z;
        this.A01 = c44096JeL;
        this.A03 = z2;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
