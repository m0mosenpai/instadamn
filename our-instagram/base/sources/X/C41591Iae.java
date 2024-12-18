package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iae, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41591Iae {
    public final InterfaceC60442pS A00;
    public final C42376Ipd A01 = A00("instagram_organic_vpvd_imp");
    public final C42376Ipd A02 = A00("instagram_ad_vpvd_imp");
    public final Context A03;
    public final UserSession A04;
    public final String A05;

    private final C42376Ipd A00(String str) {
        Context context = this.A03;
        UserSession userSession = this.A04;
        C28091Xn c28091Xn = (C28091Xn) userSession.A00(C39445HbX.class);
        if (c28091Xn == null) {
            c28091Xn = new C28091Xn(context, userSession, "igtv_impression_store", AbstractC28081Xm.A00(userSession));
            userSession.A04(C39445HbX.class, c28091Xn);
        }
        return new C42376Ipd(new J29(new C41133IIy(userSession, this.A00, c28091Xn, this.A05, str)), AbstractC37302Gc3.A0R(userSession));
    }

    public C41591Iae(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        this.A03 = context;
        this.A04 = userSession;
        this.A05 = str;
        this.A00 = interfaceC60442pS;
    }
}
