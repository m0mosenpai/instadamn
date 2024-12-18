package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import java.util.List;

/* renamed from: X.9P4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9P4 implements InterfaceC13000lm {
    public C3AY A00;
    public final List A01 = AbstractC166987dD.A1E();
    public final UserSession A02;

    public static void A00(C9P4 c9p4) {
        C47Z A03;
        C3AY c3ay = c9p4.A00;
        if (c3ay != null) {
            Object obj = c3ay.A00;
            obj.getClass();
            for (String str : ((IngestSessionShim) obj).A00) {
                UserSession userSession = c9p4.A02;
                C47Z A032 = C25A.A00(userSession).A03(str);
                C40121td A00 = C40121td.A00(AbstractC12290kX.A00, userSession);
                if (A032 != null) {
                    if (A032.A2f != null && (A03 = C25A.A00(userSession).A03(A032.A2f)) != null) {
                        A00.A07(A03);
                    }
                    A00.A07(A032);
                }
            }
            c9p4.A01.clear();
        }
    }

    public C9P4(UserSession userSession) {
        this.A02 = userSession;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A00(this);
    }
}
