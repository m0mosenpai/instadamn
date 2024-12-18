package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36674GEu implements GYB {
    public final Activity A00;
    public final AbstractC018607g A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("business_id");
        String queryParameter2 = uri.getQueryParameter("media_id");
        UserSession userSession = this.A03;
        if (C0BQ.A00(userSession).BOa(queryParameter) != null && queryParameter2 != null) {
            C1DX A00 = C1DW.A00(userSession);
            C38321qM A02 = A00.A02(queryParameter2);
            if (A02 == null) {
                Activity activity = this.A00;
                C6WQ A0i = AbstractC31174DnI.A0i(activity);
                AbstractC31176DnK.A13(activity, A0i);
                C1ON A04 = AbstractC2044893h.A04(userSession, queryParameter2);
                A04.A00 = new C32540EUq(13, A0i, A00, this);
                C1GJ.A00(activity, this.A01, A04);
                return;
            }
            A00(A02, this);
        }
    }

    public static final void A00(C38321qM c38321qM, C36674GEu c36674GEu) {
        Activity activity = c36674GEu.A00;
        float A0A = AbstractC13880nE.A0A(activity);
        float A09 = AbstractC13880nE.A09(activity);
        RectF rectF = new RectF(0.0f, 0.0f, A0A, A09);
        rectF.offsetTo(0.0f, A09);
        AbstractC35183Ffa.A02(activity, rectF, rectF, c36674GEu.A03, null, c38321qM, c36674GEu.A02.getModuleName(), null, 0, true);
    }

    public C36674GEu(Activity activity, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = activity;
        this.A03 = userSession;
        this.A01 = abstractC018607g;
        this.A02 = interfaceC11380iw;
    }
}
