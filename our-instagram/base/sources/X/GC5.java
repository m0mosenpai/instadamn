package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GC5 implements C5OV {
    public final UserSession A00;
    public final boolean A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        if (AbstractC167007dF.A1O((new C29W(this.A00).A00() > 0L ? 1 : (new C29W(this.A00).A00() == 0L ? 0 : -1))) == this.A01) {
            return true;
        }
        return false;
    }

    public GC5(UserSession userSession, boolean z) {
        this.A00 = userSession;
        this.A01 = z;
    }
}
