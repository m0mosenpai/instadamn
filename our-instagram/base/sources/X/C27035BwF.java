package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BwF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27035BwF extends AbstractC61132qb {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C27035BwF(UserSession userSession, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        String str = this.A01;
        String str2 = this.A02;
        UserSession userSession = this.A00;
        return new C26905Bu8(new C27267C1k(userSession, new C27886CQx(userSession, AbstractC40691uc.A01(userSession))), str, str2);
    }
}
