package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Dsg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31496Dsg implements InterfaceC37229Gae {
    public final InterfaceC53792dI A00;
    public final C53N A01;

    @Override // X.InterfaceC37229Gae
    public final boolean EjK(Context context, UserSession userSession) {
        InterfaceC53792dI interfaceC53792dI;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 1), userSession, 36315567690550689L) && (interfaceC53792dI = this.A00) != null) {
            String obj = C1QO.A09.toString();
            if (interfaceC53792dI.C4r(obj) != null) {
                View C4r = interfaceC53792dI.C4r(obj);
                if (C4r != null) {
                    if (C4r.isInLayout()) {
                        return true;
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC37229Gae
    public final void D12() {
        this.A01.DP1(this.A00);
    }

    public C31496Dsg(InterfaceC53792dI interfaceC53792dI, C53N c53n) {
        this.A01 = c53n;
        this.A00 = interfaceC53792dI;
    }

    @Override // X.InterfaceC37229Gae
    public final int Aj9() {
        return 2131952178;
    }

    @Override // X.InterfaceC37229Gae
    public final int Apx() {
        return 2131952179;
    }

    @Override // X.InterfaceC37229Gae
    public final int Apy() {
        return 2131952181;
    }

    @Override // X.InterfaceC37229Gae
    public final int BEr() {
        return R.drawable.activation_card_like_reel;
    }

    @Override // X.InterfaceC37229Gae
    public final String BfQ() {
        return "like_reel";
    }

    @Override // X.InterfaceC37229Gae
    public final int C3h() {
        return 2131952180;
    }

    @Override // X.InterfaceC37229Gae
    public final boolean CRX(UserSession userSession, User user) {
        if (AbstractC31178DnM.A0T(userSession).A03.BND() != null) {
            Integer BND = AbstractC166997dE.A0Y(userSession).A03.BND();
            if (BND != null) {
                if (BND.intValue() > 0) {
                    return true;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return false;
    }

    @Override // X.InterfaceC37229Gae
    public final int getTitleRes() {
        return 2131952181;
    }

    @Override // X.InterfaceC37229Gae
    public final /* synthetic */ float Aiy(UserSession userSession) {
        return 1.0f;
    }
}
