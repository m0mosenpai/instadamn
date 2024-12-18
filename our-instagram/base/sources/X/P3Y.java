package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P3Y implements C33I {
    public final /* synthetic */ UserSession A00;

    @Override // X.C33I
    public final boolean Dtk(C5SW c5sw) {
        return true;
    }

    @Override // X.C33I
    public final void Dto(C5SW c5sw) {
    }

    @Override // X.C33I
    public final void Dtq(C5SW c5sw) {
    }

    public P3Y(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.C33I
    public final void Dtt(C5SW c5sw) {
        InterfaceC19610xo A0g = AbstractC167017dG.A0g(AbstractC166987dD.A0x(this.A00), "preference_feed_picker_nux_count");
        A0g.E7G("preference_feed_picker_nux_last_seen_time", System.currentTimeMillis());
        A0g.apply();
    }
}
