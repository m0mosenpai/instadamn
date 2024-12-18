package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.G8g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36508G8g implements InterfaceC37127GXo {
    public final UserSession A00;

    @Override // X.InterfaceC37127GXo
    public final void Ctz(C34648FOf c34648FOf, C34996FbT c34996FbT) {
        ImageUrl imageUrl = c34996FbT.A00.A00.A00;
        if (imageUrl != null) {
            c34648FOf.A06 = imageUrl;
        }
        String A00 = c34996FbT.A00("reel_id");
        if (A00 != null) {
            String A002 = c34996FbT.A00("feeditem_id");
            if (A002 != null) {
                c34648FOf.A08 = new G8T(this, A00, A002, 1);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public C36508G8g(UserSession userSession) {
        this.A00 = userSession;
    }
}
