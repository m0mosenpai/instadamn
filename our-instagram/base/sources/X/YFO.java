package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes12.dex */
public final class YFO implements C5OV {
    public final C72489Xf1 A00;
    public final boolean A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        return AbstractC167007dF.A1P(this.A00.A00 ? 1 : 0, this.A01 ? 1 : 0);
    }

    public YFO(UserSession userSession, boolean z) {
        this.A01 = z;
        this.A00 = (C72489Xf1) userSession.A01(C72489Xf1.class, YL6.A00);
    }
}
