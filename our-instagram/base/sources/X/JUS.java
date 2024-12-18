package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class JUS extends C4F4 {
    public final AbstractC46972Dl A00;
    public final List A01;
    public final boolean A02;

    public JUS(AbstractC46972Dl abstractC46972Dl, List list, boolean z) {
        C14360o3.A0B(abstractC46972Dl, 3);
        this.A01 = list;
        this.A02 = z;
        this.A00 = abstractC46972Dl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JUS) {
                JUS jus = (JUS) obj;
                if (!C14360o3.A0K(this.A01, jus.A01) || this.A02 != jus.A02 || !C14360o3.A0K(this.A00, jus.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A01)));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
