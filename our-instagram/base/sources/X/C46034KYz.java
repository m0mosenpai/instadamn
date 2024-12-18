package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimePayload;
import java.io.IOException;
import java.util.List;

/* renamed from: X.KYz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46034KYz extends RealtimeEventHandler {
    public final C25671My A00;

    public C46034KYz(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC25651Mw.A00(userSession);
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final boolean handleRealtimeEvent(C5EZ c5ez, RealtimePayload realtimePayload) {
        C14360o3.A0B(c5ez, 0);
        if (realtimePayload != null) {
            if (C14360o3.A0K(realtimePayload.subTopic, "fb_unseen_notif_count")) {
                C14360o3.A07(c5ez.A00);
                String str = realtimePayload.subTopic;
                String str2 = realtimePayload.stringPayload;
                C14360o3.A06(str2);
                try {
                    L0K parseFromJson = AbstractC47087Kri.parseFromJson(C16V.A00(str2));
                    if (parseFromJson != null) {
                        this.A00.E4s(new C36103Fwd(parseFromJson.A01, parseFromJson.A00));
                        return true;
                    }
                    return true;
                } catch (IOException e) {
                    C0K8.A0M("FacebookEntrypointBadgeEventHandler", "onRealtimeEventPayload exception", e, str);
                    return true;
                }
            }
            return false;
        }
        throw AbstractC166987dD.A14("Skywalker payload should be supported.");
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final boolean canHandleRealtimeEvent(String str, String str2) {
        return "fb_unseen_notif_count".equals(str2);
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final List getMqttTopicsToHandle() {
        return AbstractC166987dD.A1J(AbstractC111324zv.A00(1475));
    }
}
