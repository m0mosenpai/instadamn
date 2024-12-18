package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mdf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50848Mdf extends C9U7 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    @Override // X.C9U7
    public final AbstractC52922bZ A02(C152406tQ c152406tQ, Class cls, String str) {
        C14360o3.A0B(c152406tQ, 2);
        return new C50956MfP(c152406tQ, this.A00, this.A01);
    }

    public C50848Mdf(Bundle bundle, InterfaceC08430c6 interfaceC08430c6, InterfaceC11380iw interfaceC11380iw) {
        super(bundle, interfaceC08430c6);
        this.A00 = interfaceC11380iw;
        this.A01 = AbstractC31171DnF.A0G(bundle);
    }
}
