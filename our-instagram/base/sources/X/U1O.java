package X;

import android.util.SparseArray;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class U1O implements C38M {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C65918TwP A01;

    @Override // X.C38M
    public final void D4P(SparseArray sparseArray, Integer num) {
    }

    @Override // X.C38M
    public final void D4Q() {
    }

    @Override // X.C38M
    public final void D4R() {
    }

    @Override // X.C38M
    public final void D4T(SparseArray sparseArray) {
    }

    public U1O(UserSession userSession, C65918TwP c65918TwP) {
        this.A01 = c65918TwP;
        this.A00 = userSession;
    }

    @Override // X.C38M
    public final void D4S() {
        C65918TwP c65918TwP = this.A01;
        C65918TwP.A02(c65918TwP);
        String str = c65918TwP.A09;
        if (str == null) {
            str = "";
        }
        new C66151U1s(c65918TwP.requireActivity(), new C70675Wev(), this.A00, str, 112, false).A02();
    }
}
