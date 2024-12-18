package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Dsf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31495Dsf implements InterfaceC37229Gae {
    public final long A00;
    public final C53N A01;
    public final boolean A02;

    @Override // X.InterfaceC37229Gae
    public final boolean CRX(UserSession userSession, User user) {
        C14360o3.A0B(userSession, 0);
        boolean z = this.A02;
        Integer B7X = AbstractC166997dE.A0Y(userSession).A03.B7X();
        if (z) {
            if (B7X != null) {
                if (B7X.intValue() >= this.A00) {
                    return true;
                }
                return false;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (B7X != null) {
            if (B7X.intValue() > 0) {
                return true;
            }
            return false;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC37229Gae
    public final boolean EjK(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        return !AbstractC31178DnM.A1Z(AbstractC23021Ah.A00(userSession), "follow");
    }

    @Override // X.InterfaceC37229Gae
    public final int BEr() {
        if (!this.A02) {
            return R.drawable.activation_card_follow;
        }
        return R.drawable.activation_card_follow_redesign;
    }

    @Override // X.InterfaceC37229Gae
    public final int C3h() {
        if (!this.A02) {
            return 2131952173;
        }
        return 2131952174;
    }

    @Override // X.InterfaceC37229Gae
    public final void D12() {
        this.A01.DHo();
    }

    @Override // X.InterfaceC37229Gae
    public final int getTitleRes() {
        if (!this.A02) {
            return 2131952175;
        }
        return 2131952176;
    }

    public C31495Dsf(C53N c53n, long j, boolean z) {
        this.A01 = c53n;
        this.A02 = z;
        this.A00 = j;
    }

    @Override // X.InterfaceC37229Gae
    public final int Aj9() {
        return 2131952172;
    }

    @Override // X.InterfaceC37229Gae
    public final int Apx() {
        return 2131952171;
    }

    @Override // X.InterfaceC37229Gae
    public final int Apy() {
        return getTitleRes();
    }

    @Override // X.InterfaceC37229Gae
    public final String BfQ() {
        return "follow";
    }

    @Override // X.InterfaceC37229Gae
    public final /* synthetic */ float Aiy(UserSession userSession) {
        return 1.0f;
    }
}
