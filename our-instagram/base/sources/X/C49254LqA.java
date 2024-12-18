package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LqA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49254LqA implements MQ0 {
    public final /* synthetic */ C47668L3b A00;

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "thread setting - messages muted";
    }

    public C49254LqA(C47668L3b c47668L3b) {
        this.A00 = c47668L3b;
    }

    @Override // X.MQ0
    public final /* bridge */ /* synthetic */ boolean AT8(UserSession userSession, Object obj) {
        C45090JxK c45090JxK = (C45090JxK) obj;
        boolean A1a = AbstractC167017dG.A1a(c45090JxK, userSession);
        C2ED c2ed = c45090JxK.A01;
        if (c2ed == null) {
            c2ed = (C2ED) this.A00.A03.invoke(userSession, c45090JxK.A0A);
        }
        boolean z = false;
        if (c2ed != null && c2ed.isMuted() == A1a) {
            z = true;
        }
        return !z;
    }
}
