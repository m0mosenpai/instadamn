package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PJi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56812PJi implements C8YD {
    @Override // X.C8YD
    public final int BfT(UserSession userSession) {
        return 0;
    }

    @Override // X.C8YD
    public final int BoD(UserSession userSession) {
        return 500;
    }

    @Override // X.C8YD
    public final boolean CZ0() {
        return false;
    }

    @Override // X.C8YD
    public final boolean Ej8(UserSession userSession) {
        return false;
    }

    @Override // X.C8YD
    public final boolean EiG(UserSession userSession) {
        if (AbstractC31177DnL.A06() >= AbstractC31175DnJ.A03(AbstractC166987dD.A0x(userSession), "caption_warning_earliest_next_request_time")) {
            return true;
        }
        return false;
    }

    @Override // X.C8YD
    public final boolean Ej9(UserSession userSession) {
        return false;
    }
}
