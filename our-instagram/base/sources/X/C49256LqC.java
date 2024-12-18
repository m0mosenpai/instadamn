package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LqC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49256LqC implements MQ0 {
    public final /* synthetic */ C47658L2r A00;

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "message is not received";
    }

    public C49256LqC(C47658L2r c47658L2r) {
        this.A00 = c47658L2r;
    }

    @Override // X.MQ0
    public final /* bridge */ /* synthetic */ boolean AT8(UserSession userSession, Object obj) {
        C45090JxK c45090JxK = (C45090JxK) obj;
        C14360o3.A0B(c45090JxK, 0);
        if (c45090JxK.A04 != C05F.A00 && !C45283K2l.A00(c45090JxK.A02, 1)) {
            return false;
        }
        return true;
    }
}
