package X;

import com.instagram.api.schemas.OneTapLinkedProfileInfoImpl;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.ESu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32494ESu extends C1P1 {
    public final UserSession A00;

    public C32494ESu(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        C0f9.A0A(-1148062029, C0f9.A03(358353831));
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-1218210244);
        C32197ECs c32197ECs = (C32197ECs) obj;
        int A0N = AbstractC167017dG.A0N(c32197ECs, 464573669);
        if (!c32197ECs.A01.isEmpty()) {
            Iterator it = c32197ECs.A01.iterator();
            while (it.hasNext()) {
                String str = ((OneTapLinkedProfileInfoImpl) it.next()).A02;
                if (str != null) {
                    UserSession userSession = this.A00;
                    C83743oJ.A01(userSession).A0A(AbstractC31171DnF.A0D("one_tap_login_nonce_callback"), userSession, C05F.A06, str);
                }
            }
        }
        C0f9.A0A(-1627200300, A0N);
        C0f9.A0A(367444399, A03);
    }
}
