package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GBx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36599GBx implements C5OV {
    public final C33590Et2 A00;
    public final boolean A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        return AbstractC167007dF.A1P(this.A00.A00 ? 1 : 0, this.A01 ? 1 : 0);
    }

    public C36599GBx(UserSession userSession, boolean z) {
        this.A00 = (C33590Et2) userSession.A01(C33590Et2.class, GUG.A00);
        this.A01 = z;
    }
}
