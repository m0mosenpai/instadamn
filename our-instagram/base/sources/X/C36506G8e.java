package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.G8e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36506G8e implements InterfaceC37127GXo {
    public final UserSession A00;

    @Override // X.InterfaceC37127GXo
    public final void Ctz(C34648FOf c34648FOf, C34996FbT c34996FbT) {
        String A00 = c34996FbT.A00("media_id");
        if (A00 != null) {
            c34648FOf.A08 = new G8T(this, A00, c34996FbT.A00("target_comment_id"), 0);
        }
    }

    public C36506G8e(UserSession userSession) {
        this.A00 = userSession;
    }
}
