package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Dsb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31491Dsb implements InterfaceC37229Gae {
    public final C53N A00;
    public final boolean A01;

    @Override // X.InterfaceC37229Gae
    public final float Aiy(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return AbstractC31175DnJ.A00(AbstractC1565371b.A00(userSession) ? 1 : 0);
    }

    @Override // X.InterfaceC37229Gae
    public final boolean EjK(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        return !AbstractC31178DnM.A1Z(AbstractC23021Ah.A00(userSession), "profile_photo");
    }

    @Override // X.InterfaceC37229Gae
    public final int BEr() {
        if (!this.A01) {
            return R.drawable.activation_card_profile_photo;
        }
        return R.drawable.activation_card_profile_photo_redesign;
    }

    @Override // X.InterfaceC37229Gae
    public final void D12() {
        this.A00.Dbe();
    }

    public C31491Dsb(C53N c53n, boolean z) {
        this.A00 = c53n;
        this.A01 = z;
    }

    @Override // X.InterfaceC37229Gae
    public final int Aj9() {
        return 2131952187;
    }

    @Override // X.InterfaceC37229Gae
    public final int Apx() {
        return 2131952186;
    }

    @Override // X.InterfaceC37229Gae
    public final int Apy() {
        return 2131952189;
    }

    @Override // X.InterfaceC37229Gae
    public final String BfQ() {
        return "profile_photo";
    }

    @Override // X.InterfaceC37229Gae
    public final int C3h() {
        return 2131952188;
    }

    @Override // X.InterfaceC37229Gae
    public final boolean CRX(UserSession userSession, User user) {
        return !AbstractC31178DnM.A0T(userSession).A1k();
    }

    @Override // X.InterfaceC37229Gae
    public final int getTitleRes() {
        return 2131952189;
    }
}
