package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.user.model.User;

/* renamed from: X.G3q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36389G3q implements MRR {
    public final DirectShareTarget A00;
    public final Context A01;
    public final UserSession A02;
    public final C2EC A03;
    public final C3DN A04;
    public final User A05;

    public C36389G3q(Context context, UserSession userSession, C2EC c2ec, DirectShareTarget directShareTarget, C3DN c3dn, User user) {
        AbstractC25229BEm.A1I(userSession, 2, user);
        this.A01 = context;
        this.A02 = userSession;
        this.A04 = c3dn;
        this.A03 = c2ec;
        this.A00 = directShareTarget;
        this.A05 = user;
    }

    @Override // X.MRR
    public final void Cu8(C148286ly c148286ly, EnumC46186KcO enumC46186KcO, int i) {
    }

    @Override // X.MRR
    public final void Cvn() {
    }

    @Override // X.MRR
    public final void Cyi(C148286ly c148286ly, C45058Jwn c45058Jwn, String str) {
    }

    @Override // X.MRR
    public final void D96(C148286ly c148286ly) {
    }

    @Override // X.MRR
    public final void DJV(C45058Jwn c45058Jwn, C45026JwH c45026JwH, String str) {
        C14360o3.A0B(c45026JwH, 0);
        UserSession userSession = this.A02;
        C7TG A00 = AbstractC165967bO.A00(userSession);
        DirectShareTarget directShareTarget = this.A00;
        A00.EN3(null, userSession, null, c45026JwH.A00, AbstractC31171DnF.A0O(directShareTarget), null, null, null, this.A03.CWO());
        this.A04.A0B();
        User user = this.A05;
        AbstractC34052F1f.A00(userSession, user.getId());
        F2L.A00(this.A01, null, userSession, directShareTarget, user, null, null);
    }

    @Override // X.MRR
    public final void DP2(C45058Jwn c45058Jwn, String str) {
    }

    @Override // X.MRR
    public final void DQH() {
    }

    @Override // X.MRR
    public final void DUW(JIN jin) {
    }

    @Override // X.MRR
    public final void Dp9(C45058Jwn c45058Jwn, DirectStoreSticker directStoreSticker, String str) {
    }

    @Override // X.MRR
    public final void Dvf() {
    }

    @Override // X.MRR
    public final void DwN(String str) {
    }

    @Override // X.MRR
    public final void DwO(String str) {
    }

    @Override // X.MRR
    public final void Ekm() {
    }

    @Override // X.MRR
    public final DirectShareTarget BuH() {
        return this.A00;
    }
}
