package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.DirectApiError;
import com.instagram.realtimeclient.DirectRealtimePayload;

/* loaded from: classes6.dex */
public final class EE4 extends AnonymousClass935 {
    public final GZ3 A00;

    public EE4(UserSession userSession, GZ3 gz3) {
        super(userSession);
        this.A00 = gz3;
    }

    @Override // X.AnonymousClass935
    public final void A02(UserSession userSession) {
        C0f9.A0A(-1362302756, C0f9.A03(-188679929));
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        GZ3 gz3;
        Integer num;
        C114675Fx A01;
        DirectRealtimePayload directRealtimePayload;
        DirectApiError directApiError;
        int A03 = C0f9.A03(1853622432);
        C32207EDg c32207EDg = (C32207EDg) abstractC115105If.A00();
        if (c32207EDg != null && (directRealtimePayload = c32207EDg.A00) != null && (directApiError = directRealtimePayload.error) != null) {
            gz3 = this.A00;
            num = C05F.A00;
            EnumC46247KdO enumC46247KdO = EnumC46247KdO.A0B;
            String str = directApiError.errorType;
            C14360o3.A06(str);
            A01 = new C114675Fx(null, enumC46247KdO, str, null, "http", directApiError.errorTitle, directApiError.errorDescription, null, AbstractC166987dD.A1I(), false, false, false, false, false, false);
        } else {
            gz3 = this.A00;
            num = C05F.A00;
            A01 = AbstractC35240FgZ.A01(abstractC115105If, AbstractC35240FgZ.A00);
        }
        gz3.DFl(A01, num);
        C0f9.A0A(481469796, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(-443163528);
        int A032 = C0f9.A03(122762633);
        this.A00.DqN((C32207EDg) obj, C05F.A00);
        C0f9.A0A(1241582796, A032);
        C0f9.A0A(-1073743012, A03);
    }
}
