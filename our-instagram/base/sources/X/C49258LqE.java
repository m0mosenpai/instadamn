package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LqE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49258LqE implements MQ0 {
    public final /* synthetic */ C47658L2r A00;

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "message sent time is not after thread store subscribed at time";
    }

    public C49258LqE(C47658L2r c47658L2r) {
        this.A00 = c47658L2r;
    }

    @Override // X.MQ0
    public final /* bridge */ /* synthetic */ boolean AT8(UserSession userSession, Object obj) {
        C45090JxK c45090JxK = (C45090JxK) obj;
        AbstractC167017dG.A1N(c45090JxK, userSession);
        Number number = (Number) this.A00.A03.invoke(userSession);
        if (number != null) {
            long j = c45090JxK.A00;
            if (j != 0 && j <= number.longValue()) {
                return false;
            }
        }
        return true;
    }
}
