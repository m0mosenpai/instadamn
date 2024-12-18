package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GCB implements C5OV {
    public final UserSession A00;
    public final boolean A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        return AbstractC167007dF.A1P(AbstractC31172DnG.A1a(AbstractC166987dD.A0x(this.A00), "has_seen_main_disclosure_sheet") ? 1 : 0, this.A01 ? 1 : 0);
    }

    public GCB(UserSession userSession, boolean z) {
        this.A00 = userSession;
        this.A01 = z;
    }
}
