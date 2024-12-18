package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.OrF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55865OrF implements InterfaceC75483aF {
    public RtcCallKey A00;
    public final UserSession A01;

    @Override // X.InterfaceC75483aF
    public final Map B3w() {
        RtcCallKey rtcCallKey = this.A00;
        if (rtcCallKey != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("last_video_call_was_interop", "yes");
            A1G.put("last_video_call_esid", rtcCallKey.A00);
            return A1G;
        }
        return null;
    }

    public C55865OrF(UserSession userSession) {
        this.A01 = userSession;
        C75503aH A00 = AbstractC75493aG.A00(userSession);
        A00.A00.add(AbstractC25225BEi.A16(this));
    }
}
