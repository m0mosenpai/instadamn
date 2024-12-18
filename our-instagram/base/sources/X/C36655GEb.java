package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36655GEb implements GYB {
    public final Activity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("hash");
        if (queryParameter != null) {
            EN8 A01 = AbstractC35059FcW.A01(EnumC33373Ep6.A0I, null, queryParameter, null);
            UserSession userSession = this.A02;
            C14360o3.A0B(userSession, 0);
            AbstractC31175DnJ.A0N(userSession).A02(this.A00, A01);
        }
    }

    public C36655GEb(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }
}
