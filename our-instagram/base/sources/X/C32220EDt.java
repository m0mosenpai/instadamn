package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EDt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32220EDt extends AnonymousClass935 {
    public final /* synthetic */ InterfaceC16660sJ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32220EDt(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        super(userSession);
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.AnonymousClass935, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-347308590);
        C14360o3.A0B(abstractC115105If, 0);
        InterfaceC40821up A0L = AbstractC31172DnG.A0L(abstractC115105If);
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (A0L == null) {
            A1C.append("failed to set e2ee eligibility via MI. response = ");
            A1C.append(abstractC115105If);
        } else {
            A1C.append("failed to set e2ee eligibility via MI. error code: ");
            A1C.append(A0L.getStatusCode());
            A1C.append(AbstractC58317Pt9.A00(429));
            A1C.append(A0L.getErrorMessage());
        }
        AbstractC166987dD.A1T(C18950wb.A01, A1C.toString(), 20131955);
        AbstractC25227BEk.A1Q(this.A00, false);
        C0f9.A0A(-336547499, A03);
    }

    @Override // X.AnonymousClass935, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(348080229);
        int A032 = C0f9.A03(-2071104613);
        AbstractC25227BEk.A1Q(this.A00, true);
        C0f9.A0A(-313372203, A032);
        C0f9.A0A(-1712368192, A03);
    }
}
