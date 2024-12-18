package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GCG implements C5OV {
    public final int A00;
    public final UserSession A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        if (C461529z.A02(this.A01) < this.A00) {
            return false;
        }
        return true;
    }

    public GCG(UserSession userSession, int i) {
        this.A01 = userSession;
        this.A00 = i;
    }
}
