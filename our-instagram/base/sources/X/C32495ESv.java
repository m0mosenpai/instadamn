package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.nux.cal.model.NuxConnectResponse;

/* renamed from: X.ESv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32495ESv extends C1P1 {
    public final /* synthetic */ EVP A00;

    public C32495ESv(EVP evp) {
        this.A00 = evp;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-734357807);
        UserSession userSession = this.A00.A01;
        CallerContext callerContext = C1L2.A00;
        C14360o3.A0B(userSession, 0);
        C1L2.A02(userSession, false);
        C0f9.A0A(-514913723, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(829676338);
        NuxConnectResponse nuxConnectResponse = (NuxConnectResponse) obj;
        int A0N = AbstractC167017dG.A0N(nuxConnectResponse, -1538894992);
        if (!AbstractC13670mt.A0B(nuxConnectResponse.A00) && !AbstractC13670mt.A0B(nuxConnectResponse.A02)) {
            this.A00.A04.A00(null);
        }
        C0f9.A0A(1367394199, A0N);
        C0f9.A0A(-436190604, A03);
    }
}
