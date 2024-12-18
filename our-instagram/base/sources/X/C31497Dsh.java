package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Dsh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31497Dsh implements InterfaceC37229Gae {
    public final C53N A00;

    @Override // X.InterfaceC37229Gae
    public final boolean EjK(Context context, UserSession userSession) {
        return C18U.A06(AbstractC25225BEi.A0j(userSession, 1), userSession, 36315567690485152L);
    }

    @Override // X.InterfaceC37229Gae
    public final void D12() {
        this.A00.D84();
    }

    public C31497Dsh(C53N c53n) {
        this.A00 = c53n;
    }

    @Override // X.InterfaceC37229Gae
    public final int Aj9() {
        return 2131952165;
    }

    @Override // X.InterfaceC37229Gae
    public final int Apx() {
        return 2131952164;
    }

    @Override // X.InterfaceC37229Gae
    public final int Apy() {
        return 2131952167;
    }

    @Override // X.InterfaceC37229Gae
    public final int BEr() {
        return R.drawable.activation_card_creation;
    }

    @Override // X.InterfaceC37229Gae
    public final String BfQ() {
        return "creation";
    }

    @Override // X.InterfaceC37229Gae
    public final int C3h() {
        return 2131952166;
    }

    @Override // X.InterfaceC37229Gae
    public final boolean CRX(UserSession userSession, User user) {
        if (AbstractC31178DnM.A0T(userSession).A03.Ab6() != null) {
            Integer Ab6 = AbstractC166997dE.A0Y(userSession).A03.Ab6();
            if (Ab6 != null) {
                if (Ab6.intValue() > 0) {
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
        return 2131952167;
    }

    @Override // X.InterfaceC37229Gae
    public final /* synthetic */ float Aiy(UserSession userSession) {
        return 1.0f;
    }
}
