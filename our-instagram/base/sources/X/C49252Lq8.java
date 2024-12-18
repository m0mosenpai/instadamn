package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lq8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49252Lq8 implements MQ0 {
    public final /* synthetic */ C47668L3b A00;

    @Override // X.MQ0
    public final boolean AT8(UserSession userSession, Object obj) {
        C14360o3.A0B(userSession, 1);
        if (System.currentTimeMillis() < ((C23031Ai) this.A00.A02.invoke(userSession)).A01.getLong("direct_message_mute_all_timestamp", -1L)) {
            return false;
        }
        return true;
    }

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "app setting - all notifications paused";
    }

    public C49252Lq8(C47668L3b c47668L3b) {
        this.A00 = c47668L3b;
    }
}
