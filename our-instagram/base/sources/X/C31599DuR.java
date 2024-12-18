package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.DuR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31599DuR implements InterfaceC37229Gae {
    public final C53N A00;

    @Override // X.InterfaceC37229Gae
    public final boolean CRX(UserSession userSession, User user) {
        return false;
    }

    @Override // X.InterfaceC37229Gae
    public final boolean EjK(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        return !AbstractC31178DnM.A1Z(AbstractC23021Ah.A00(userSession), "search");
    }

    @Override // X.InterfaceC37229Gae
    public final void D12() {
        this.A00.DjD();
    }

    public C31599DuR(C53N c53n) {
        this.A00 = c53n;
    }

    @Override // X.InterfaceC37229Gae
    public final int Aj9() {
        return 2131972993;
    }

    @Override // X.InterfaceC37229Gae
    public final int Apx() {
        return 2131972993;
    }

    @Override // X.InterfaceC37229Gae
    public final int Apy() {
        return 2131952170;
    }

    @Override // X.InterfaceC37229Gae
    public final int BEr() {
        return R.drawable.find_people_search;
    }

    @Override // X.InterfaceC37229Gae
    public final String BfQ() {
        return "search";
    }

    @Override // X.InterfaceC37229Gae
    public final int C3h() {
        return 2131952169;
    }

    @Override // X.InterfaceC37229Gae
    public final int getTitleRes() {
        return 2131952170;
    }

    @Override // X.InterfaceC37229Gae
    public final /* synthetic */ float Aiy(UserSession userSession) {
        return 1.0f;
    }
}
