package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74853Ya {
    public boolean A00;
    public final UserSession A01;

    public C74853Ya(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        this.A00 = ((Boolean) A00.A5t.CES(A00, C23031Ai.A8c[155])).booleanValue();
    }

    public final void A00(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            C14120nc.A00().ATO(new HJO(this, z));
        }
    }
}
