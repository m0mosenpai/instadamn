package X;

import android.os.BaseBundle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import com.instagram.model.direct.DirectIfyXma;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G2T implements InterfaceC37195Ga6 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public G2T(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC37195Ga6
    public final Object Aqz() {
        if (this.A00 != 0) {
            return this.A02;
        }
        return ((DirectShareSheetFragment) this.A01).A0Q.A0B();
    }

    @Override // X.InterfaceC37195Ga6
    public final boolean CY8() {
        Object obj;
        if (this.A00 != 0) {
            obj = this.A01;
        } else {
            obj = ((DirectShareSheetFragment) this.A01).A0Q.A0N.A01;
        }
        if (obj != C2EY.A1j && obj != C2EY.A0c) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37195Ga6
    public final boolean CY9() {
        if (this.A00 != 0) {
            return false;
        }
        return AbstractC111324zv.A00(105).equals(((BaseBundle) this.A02).getString(AbstractC111324zv.A00(83), AbstractC111324zv.A00(106)));
    }

    @Override // X.InterfaceC37195Ga6
    public final boolean CYB() {
        UserSession userSession;
        User A2E;
        EnumC33381EpE enumC33381EpE;
        if (this.A00 == 0) {
            DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel = ((DirectShareSheetFragment) this.A01).A0Q;
            FKR fkr = directShareSheetFragmentViewModel.A0N;
            C2EY c2ey = fkr.A01;
            if (c2ey != C2EY.A0S && c2ey != C2EY.A0R && c2ey != C2EY.A0T) {
                if (c2ey == C2EY.A1j) {
                    return false;
                }
                if (c2ey != C2EY.A1S && c2ey != C2EY.A0c && c2ey != C2EY.A1Q) {
                    if (c2ey == C2EY.A1P) {
                        return false;
                    }
                    if (c2ey == C2EY.A0H) {
                        UserSession userSession2 = directShareSheetFragmentViewModel.A0M;
                        if (AbstractC31268Doq.A01(userSession2) && C18U.A06(C06090Tz.A05, userSession2, 36319368741330192L)) {
                            return true;
                        }
                        return false;
                    }
                    if (c2ey == C2EY.A12) {
                        C14360o3.A0C(fkr, "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectIfyContentShareContentModel");
                        DirectIfyXma directIfyXma = ((C32756EbM) fkr).A00;
                        if (directIfyXma != null) {
                            enumC33381EpE = directIfyXma.A01;
                        } else {
                            enumC33381EpE = null;
                        }
                        if (enumC33381EpE == EnumC33381EpE.A05) {
                            return true;
                        }
                        return false;
                    }
                    C38321qM c38321qM = directShareSheetFragmentViewModel.A04;
                    if (c38321qM == null || (A2E = c38321qM.A2E((userSession = directShareSheetFragmentViewModel.A0M))) == null) {
                        return false;
                    }
                    if (!C2TN.A04(userSession, A2E)) {
                        if (A2E.A0M() != C05F.A0C && !A2E.A24()) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
