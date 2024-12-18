package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P7G implements GYB {
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57519Pft(this, 1));

    public P7G(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        ((C196208mB) this.A01.getValue()).A01(this.A00, "upsell", uri.getBooleanQueryParameter("is_enabled", false));
    }
}
