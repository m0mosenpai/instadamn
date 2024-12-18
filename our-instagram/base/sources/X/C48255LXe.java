package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LXe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48255LXe implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "ImagineCreateLogger";
    public final C18920wW A00;
    public final UserSession A01;

    public C48255LXe(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC12220kQ.A01(this, userSession);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_direct_imagine_create";
    }

    public final long A00() {
        String fbidV2 = AbstractC31171DnF.A0T(this.A01, C17060sy.A01).getFbidV2();
        if (fbidV2 == null) {
            return 0L;
        }
        return Long.parseLong(fbidV2);
    }
}
