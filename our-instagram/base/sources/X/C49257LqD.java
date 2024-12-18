package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LqD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49257LqD implements MQ0 {
    public final /* synthetic */ C47658L2r A00;

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "message notification did not pass the filter";
    }

    public C49257LqD(C47658L2r c47658L2r) {
        this.A00 = c47658L2r;
    }

    @Override // X.MQ0
    public final /* bridge */ /* synthetic */ boolean AT8(UserSession userSession, Object obj) {
        C45090JxK c45090JxK = (C45090JxK) obj;
        AbstractC167017dG.A1N(c45090JxK, userSession);
        return ((C2DM) this.A00.A02.invoke(userSession)).A00(c45090JxK.A0A);
    }
}
