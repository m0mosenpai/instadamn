package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.ILj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41195ILj {
    public final C23031Ai A00;
    public final List A01;
    public final UserSession A02;

    public C41195ILj(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = new CopyOnWriteArrayList();
        this.A00 = AbstractC23021Ah.A00(userSession);
    }

    public final void A00(boolean z) {
        C23031Ai c23031Ai = this.A00;
        if (c23031Ai.A1l() != z) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((C38264Gs7) it.next()).A00(this.A02, z);
            }
            AbstractC167007dF.A1L(c23031Ai, c23031Ai.A0T, C23031Ai.A8c, 144, z);
        }
    }
}
