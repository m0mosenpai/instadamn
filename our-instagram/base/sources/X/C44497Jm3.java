package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Jm3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44497Jm3 extends AbstractC52922bZ {
    public List A00;
    public java.util.Set A01;
    public final UserSession A02;
    public final C48599Leb A03;
    public final C05A A04;
    public final C0UO A05;

    public C44497Jm3(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = C16910sj.A00;
        C16930sl c16930sl = C16930sl.A00;
        this.A00 = c16930sl;
        C008002u A1H = AbstractC25225BEi.A1H(new C26087BgG(C05F.A0C, c16930sl));
        this.A04 = A1H;
        this.A05 = A1H;
        this.A03 = new C48599Leb(userSession, new C49264LqK(this));
        C14120nc.A00().ATO(new C45702KLf(this));
    }
}
