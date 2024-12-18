package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.MdZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50842MdZ extends C9U7 {
    public final UserSession A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50842MdZ(Bundle bundle, InterfaceC08430c6 interfaceC08430c6, UserSession userSession) {
        super(bundle, interfaceC08430c6);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.C9U7
    public final AbstractC52922bZ A02(C152406tQ c152406tQ, Class cls, String str) {
        C14360o3.A0B(c152406tQ, 2);
        return new C50902MeX(c152406tQ, this.A00);
    }
}
