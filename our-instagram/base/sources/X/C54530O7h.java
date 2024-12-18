package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import java.util.List;

/* renamed from: X.O7h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54530O7h {
    public String A00;
    public final UserSession A01;

    public C54530O7h(UserSession userSession, IngestSessionShim ingestSessionShim) {
        C47Z A03;
        AbstractC167017dG.A1P(userSession, ingestSessionShim);
        this.A01 = userSession;
        List list = ingestSessionShim.A00;
        if (list.size() > 0 && (A03 = C25A.A00(userSession).A03((String) AbstractC166987dD.A16(list))) != null) {
            A03.A0H();
        }
    }
}
