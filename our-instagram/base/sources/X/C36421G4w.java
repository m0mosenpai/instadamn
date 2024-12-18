package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.G4w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36421G4w implements InterfaceC37161GYy {
    public final UserSession A00;
    public final C7U0 A01;
    public final InterfaceC164947Zj A02;

    @Override // X.InterfaceC37161GYy
    public final boolean isEnabled() {
        return !this.A01.C7r().CWI();
    }

    public C36421G4w(UserSession userSession, C7U0 c7u0, InterfaceC164947Zj interfaceC164947Zj) {
        this.A00 = userSession;
        this.A01 = c7u0;
        this.A02 = interfaceC164947Zj;
    }

    @Override // X.InterfaceC37161GYy
    public final C32073E6z BXV() {
        return C32073E6z.A00(this, 28, R.drawable.instagram_users_pano_outline_24, 2131968880);
    }
}
