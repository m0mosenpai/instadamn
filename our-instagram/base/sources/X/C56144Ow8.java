package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Ow8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56144Ow8 implements InterfaceC13000lm, InterfaceC75483aF {
    public Boolean A00;
    public Boolean A01;
    public final UserSession A02;

    public C56144Ow8(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = null;
        this.A00 = null;
        C75503aH A00 = AbstractC75493aG.A00(userSession);
        A00.A00.add(AbstractC25225BEi.A16(this));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC75493aG.A00(this.A02).A00(this);
    }

    @Override // X.InterfaceC75483aF
    public final Map B3w() {
        HashMap A1G = AbstractC166987dD.A1G();
        Boolean bool = this.A01;
        if (bool != null) {
            A1G.put("is_last_clips_request_successful", String.valueOf(bool.booleanValue()));
        }
        Boolean bool2 = this.A00;
        if (bool2 != null) {
            A1G.put("did_clip_start", String.valueOf(bool2.booleanValue()));
        }
        return A1G;
    }
}
