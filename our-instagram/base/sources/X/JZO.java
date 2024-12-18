package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class JZO extends AbstractC46440Kh0 {
    public final UserSession A00;
    public final DirectThreadKey A01;
    public final C73743Sc A02;
    public final boolean A03;

    public JZO(UserSession userSession, DirectThreadKey directThreadKey, C73743Sc c73743Sc, boolean z) {
        C14360o3.A0B(directThreadKey, 2);
        this.A00 = userSession;
        this.A01 = directThreadKey;
        this.A03 = z;
        this.A02 = c73743Sc;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (C14360o3.A0K(getClass(), AbstractC43593JPy.A0o(obj)) && (obj instanceof JZO)) {
                JZO jzo = (JZO) obj;
                if (!C14360o3.A0K(this.A01, jzo.A01) || this.A03 != jzo.A03 || !C14360o3.A0K(this.A02, jzo.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0G(this.A01)) + AbstractC25235BEs.A06(this.A02);
    }
}
