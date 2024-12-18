package X;

import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KE0 extends AbstractC47604L0p {
    public final BoostMediaPickerTabType A00;
    public final C45106Jxa A01;
    public final UserSession A02;
    public final C38321qM A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KE0(BoostMediaPickerTabType boostMediaPickerTabType, C45106Jxa c45106Jxa, UserSession userSession, C38321qM c38321qM) {
        super(c45106Jxa, userSession, c38321qM);
        C14360o3.A0B(c38321qM, 4);
        this.A02 = userSession;
        this.A00 = boostMediaPickerTabType;
        this.A01 = c45106Jxa;
        this.A03 = c38321qM;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KE0) {
                KE0 ke0 = (KE0) obj;
                if (!C14360o3.A0K(this.A02, ke0.A02) || this.A00 != ke0.A00 || !C14360o3.A0K(this.A01, ke0.A01) || !C14360o3.A0K(this.A03, ke0.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00() {
        int ordinal = this.A00.ordinal();
        if (ordinal != 3 && (ordinal != 0 || this.A01.A04.size() < 2 || !WG1.A02(this.A02))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A02))));
    }
}
