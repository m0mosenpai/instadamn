package X;

import android.content.Context;
import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.instagram.common.session.UserSession;

/* renamed from: X.Sw0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63925Sw0 implements InterfaceC65635Tpw {
    public final /* synthetic */ C7CP A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    @Override // X.InterfaceC65338TiJ
    public final void onError(Throwable th) {
        throw C00O.createAndThrow();
    }

    public C63925Sw0(C7CP c7cp, String str, boolean z) {
        this.A00 = c7cp;
        this.A02 = z;
        this.A01 = str;
    }

    @Override // X.InterfaceC65635Tpw
    public final void onSuccess() {
        String str;
        C7CP c7cp = this.A00;
        String str2 = c7cp.A08;
        C7CP.A00(c7cp, str2, false);
        C62929SXl c62929SXl = new C62929SXl();
        Context context = c7cp.A00;
        UserSession userSession = c7cp.A04;
        c62929SXl.A01(context, userSession, C05F.A01);
        if (this.A02 && (str = this.A01) != null) {
            AbstractC63311ShH.A04(str2, "groupishId");
            long currentTimeMillis = System.currentTimeMillis();
            String str3 = userSession.userId;
            AbstractC63311ShH.A04(str3, "userAliasId");
            c7cp.A07.A00(new C63923Svy(), new LiveLocationSession(str2, null, str, str3, 0L, currentTimeMillis, false));
        }
    }
}
