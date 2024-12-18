package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.5jA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123965jA implements C5H3 {
    public final long A00;
    public final long A01;
    public final /* synthetic */ AbstractC12990ll A02;
    public final /* synthetic */ C38321qM A03;

    public C123965jA(AbstractC12990ll abstractC12990ll, C38321qM c38321qM) {
        this.A03 = c38321qM;
        this.A02 = abstractC12990ll;
        this.A00 = AbstractC123975jB.A00(c38321qM.getId());
        this.A01 = AbstractC123975jB.A01(c38321qM.getId());
    }

    @Override // X.C5H3
    public final boolean AkL() {
        return !this.A03.A4k();
    }

    @Override // X.C5H3
    public final boolean Akl() {
        return this.A03.A4U();
    }

    @Override // X.C5H3
    public final boolean Akv() {
        C38321qM c38321qM = this.A03;
        AbstractC12990ll abstractC12990ll = this.A02;
        if (c38321qM.A1y() == C3YU.A04 || c38321qM.A69() || ((abstractC12990ll instanceof UserSession) && c38321qM.CdW() && !AbstractC41071vF.A0M((UserSession) abstractC12990ll, c38321qM))) {
            return false;
        }
        return true;
    }

    @Override // X.C5H3
    public final String BEK() {
        AbstractC12990ll abstractC12990ll = this.A02;
        if (abstractC12990ll instanceof UserSession) {
            return AbstractC41071vF.A0H((UserSession) abstractC12990ll, this.A03.getId());
        }
        return null;
    }

    @Override // X.C5H3
    public final long BF4() {
        return this.A00;
    }

    @Override // X.C5H3
    public final long Bai() {
        return this.A01;
    }

    @Override // X.C5H3
    public final List Bl5() {
        return C16930sl.A00;
    }

    @Override // X.C5H3
    public final Boolean CXP() {
        boolean A5l;
        AbstractC12990ll abstractC12990ll = this.A02;
        if (abstractC12990ll instanceof UserSession) {
            UserSession userSession = (UserSession) abstractC12990ll;
            C14360o3.A0A(userSession);
            A5l = C57532kS.A00(userSession).A0N(this.A03);
        } else {
            A5l = this.A03.A5l();
        }
        return Boolean.valueOf(A5l);
    }

    @Override // X.C5H3
    public final Boolean CcM() {
        boolean CcN;
        AbstractC12990ll abstractC12990ll = this.A02;
        if (abstractC12990ll instanceof UserSession) {
            UserSession userSession = (UserSession) abstractC12990ll;
            C14360o3.A0A(userSession);
            CcN = C57602kZ.A00(userSession).A0O(this.A03);
        } else {
            CcN = this.A03.CcN();
        }
        return Boolean.valueOf(CcN);
    }
}
