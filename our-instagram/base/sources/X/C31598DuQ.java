package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.DuQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31598DuQ implements InterfaceC37229Gae {
    public final C53N A00;

    @Override // X.InterfaceC37229Gae
    public final boolean CRX(UserSession userSession, User user) {
        return false;
    }

    @Override // X.InterfaceC37229Gae
    public final void D12() {
        this.A00.D7O();
    }

    public C31598DuQ(C53N c53n) {
        this.A00 = c53n;
    }

    @Override // X.InterfaceC37229Gae
    public final int Aj9() {
        return 2131956591;
    }

    @Override // X.InterfaceC37229Gae
    public final int Apx() {
        return 2131956591;
    }

    @Override // X.InterfaceC37229Gae
    public final int Apy() {
        return 2131956593;
    }

    @Override // X.InterfaceC37229Gae
    public final int BEr() {
        return R.drawable.find_people_connect_contacts;
    }

    @Override // X.InterfaceC37229Gae
    public final String BfQ() {
        return "contacts";
    }

    @Override // X.InterfaceC37229Gae
    public final int C3h() {
        return 2131974849;
    }

    @Override // X.InterfaceC37229Gae
    public final boolean EjK(Context context, UserSession userSession) {
        AbstractC167017dG.A1N(context, userSession);
        if (C54P.A00(context, userSession) && !AbstractC31178DnM.A1Z(AbstractC23021Ah.A00(userSession), "contacts")) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37229Gae
    public final int getTitleRes() {
        return 2131956593;
    }

    @Override // X.InterfaceC37229Gae
    public final /* synthetic */ float Aiy(UserSession userSession) {
        return 1.0f;
    }
}
