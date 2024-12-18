package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.P3b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56414P3b implements JPd {
    public C38321qM A00;
    public C131325wL A01 = new C131325wL();
    public final UserSession A02;
    public final C38900HAw A03;

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return null;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return true;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return true;
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return false;
    }

    @Override // X.JPd, X.JPW
    public final /* synthetic */ C105824pt AiE() {
        return null;
    }

    @Override // X.JPW
    public final String An2() {
        return this.A03.A03;
    }

    @Override // X.JPd
    @Deprecated
    public final String BK9() {
        String str;
        String str2;
        C38321qM c38321qM = this.A00;
        if (c38321qM.A5d()) {
            if (c38321qM.A5g()) {
                str = c38321qM.A0C.getTitle();
            } else {
                str = null;
            }
            if (c38321qM.A1V() != null) {
                str2 = c38321qM.A1V().A0e;
            } else {
                str2 = null;
            }
            boolean z = !AbstractC13670mt.A0B(str);
            boolean z2 = !AbstractC13670mt.A0B(str2);
            if (z) {
                if (z2) {
                    return AnonymousClass001.A0g(str, " • ", str2);
                }
                return str;
            }
            if (!z2) {
                return null;
            }
            return str2;
        }
        return c38321qM.A0C.getTitle();
    }

    @Override // X.JPW
    public final C38321qM BQN() {
        return this.A00;
    }

    @Override // X.JPd
    public final ImageUrl C8A(Context context) {
        return this.A00.A1q(context);
    }

    @Override // X.JPd
    public final User CDj() {
        return this.A00.A2E(this.A02);
    }

    @Override // X.JPd
    public final boolean CY4() {
        return true;
    }

    @Override // X.JPd
    public final boolean Ca5() {
        return AbstractC167007dF.A1W(this.A00.A0C.BGO());
    }

    @Override // X.JPd
    public final boolean Ejl() {
        return AbstractC167007dF.A1W(this.A00.A0C.BGP());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AbstractC50102Ry.A00(this.A00.getId(), ((JPd) obj).getId());
    }

    @Override // X.JPd, X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return this.A00.getId();
    }

    @Override // X.JPd
    public final int getViewCount() {
        C38321qM c38321qM = this.A00;
        if (c38321qM.A0C.CFm() == null) {
            return 0;
        }
        return c38321qM.A0C.CFm().intValue();
    }

    public final int hashCode() {
        return this.A00.getId().hashCode();
    }

    public C56414P3b(UserSession userSession, C38321qM c38321qM, C38900HAw c38900HAw) {
        this.A02 = userSession;
        this.A03 = c38900HAw;
        this.A00 = c38321qM;
        O0C.A00.getAndIncrement();
        IBG.A00.get(this.A00.A38());
    }

    @Override // X.JPd
    public final boolean Cfd() {
        return CDj().isVerified();
    }

    @Override // X.JPd
    public final String getUsername() {
        return CDj().getUsername();
    }
}
