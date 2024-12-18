package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lq2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49247Lq2 implements MQ0 {
    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "inapp notifications are not supported";
    }

    @Override // X.MQ0
    public final /* bridge */ /* synthetic */ boolean AT8(UserSession userSession, Object obj) {
        C45113Jxi c45113Jxi = (C45113Jxi) obj;
        AbstractC167017dG.A1N(c45113Jxi, userSession);
        if (c45113Jxi.A01 == C05F.A01 && C18U.A06(C06090Tz.A05, userSession, 36320326514581875L)) {
            return true;
        }
        return false;
    }
}
