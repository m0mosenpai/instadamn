package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lq6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49251Lq6 implements MQ0 {
    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "no unsupported notification types through iris";
    }

    @Override // X.MQ0
    public final /* bridge */ /* synthetic */ boolean AT8(UserSession userSession, Object obj) {
        C45090JxK c45090JxK;
        C45113Jxi c45113Jxi = (C45113Jxi) obj;
        C14360o3.A0B(c45113Jxi, 0);
        if (c45113Jxi.A01 == C05F.A00 && (c45090JxK = (C45090JxK) c45113Jxi.A02) != null) {
            C14360o3.A0C(c45090JxK, "null cannot be cast to non-null type com.instagram.direct.notifications.core.api.DirectNotification.MessageDirectNotificationTypeData");
            if (C45282K2k.A00(c45090JxK.A02, 2)) {
                return false;
            }
        }
        return true;
    }
}
