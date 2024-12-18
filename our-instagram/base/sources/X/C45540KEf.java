package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KEf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45540KEf extends C1P1 {
    public final UserSession A00;
    public final String A01;
    public final InterfaceC16660sJ A02;

    public C45540KEf(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = "direct_v2/visual_threads";
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-1555366810);
        C40781ul c40781ul = (C40781ul) obj;
        int A032 = C0f9.A03(1967814075);
        C14360o3.A0B(c40781ul, 0);
        C28891aS A00 = AbstractC207749He.A00();
        UserSession userSession = this.A00;
        A00.A00(userSession);
        String str = this.A01;
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        C14360o3.A0B(userSession, 0);
        AbstractC43594JPz.A1P(str, interfaceC16660sJ);
        if (C18U.A06(C06090Tz.A05, userSession, 36318861934926508L)) {
            if (!c40781ul.isOk()) {
                c40781ul.getErrorMessage();
            }
            if (!AbstractC25231BEo.A1a(c40781ul, interfaceC16660sJ)) {
                C0K8.A0C("ArmadilloExpressSnapshotInterceptManager", "Invalid response: We may have received encrypted messages from server which are not handled for this endpoint.");
                throw AbstractC166987dD.A18("Invalid response: We may have received encrypted messages from server which are not handled for this endpoint.");
            }
        }
        C0f9.A0A(601284520, A032);
        C0f9.A0A(-760166987, A03);
    }
}
