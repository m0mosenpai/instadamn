package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.JWg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43746JWg implements InterfaceC13000lm, InterfaceC75483aF {
    public String A00;
    public String A01;
    public final UserSession A02;

    public C43746JWg(UserSession userSession) {
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
        String str = this.A01;
        if (str != null) {
            A1G.put("last_video_has_text_translations", str);
        }
        String str2 = this.A00;
        if (str2 != null) {
            A1G.put("last_video_has_audio_translations", str2);
        }
        return A1G;
    }
}
