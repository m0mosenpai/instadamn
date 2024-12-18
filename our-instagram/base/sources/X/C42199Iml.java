package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iml, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42199Iml implements InterfaceC43400JFp {
    public final /* synthetic */ C42090Ikx A00;

    public C42199Iml(C42090Ikx c42090Ikx) {
        this.A00 = c42090Ikx;
    }

    @Override // X.InterfaceC43400JFp
    public final void DlB(boolean z) {
        C42090Ikx c42090Ikx = this.A00;
        FragmentActivity activity = c42090Ikx.A04.getActivity();
        if (activity != null) {
            UserSession userSession = c42090Ikx.A0A;
            InterfaceC60442pS interfaceC60442pS = c42090Ikx.A0F;
            C1M1 c1m1 = c42090Ikx.A0L;
            String sessionId = c1m1.getSessionId();
            if (sessionId == null) {
                C18950wb c18950wb = C18950wb.A01;
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Null session ID from provider ");
                A1C.append(c1m1);
                A1C.append(" in module ");
                c18950wb.AEp(AbstractC166997dE.A0x(interfaceC60442pS.getModuleName(), A1C), 817890849);
                sessionId = "";
            }
            C55220Oej.A00.A09(activity, userSession, c42090Ikx.A0E, interfaceC60442pS, c42090Ikx.A0G, sessionId, null, z);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
