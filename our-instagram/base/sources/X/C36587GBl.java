package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GBl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36587GBl implements C5OV {
    public final UserSession A00;

    public C36587GBl(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        AbstractC31265Don.A00();
        C31267Dop A00 = AbstractC31266Doo.A00(this.A00);
        if (A00.A00() == C05F.A0N && !AbstractC31172DnG.A1a(((FF9) A00.A02.getValue()).A00, "picker_viewed_after_eligible")) {
            return true;
        }
        return false;
    }
}
