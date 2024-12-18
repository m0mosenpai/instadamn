package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bby, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25843Bby extends AbstractC52922bZ {
    public final HYF A00;
    public final String A01;
    public final InterfaceC19390xP A02;
    public final InterfaceC06180Ui A03;
    public final C0UO A04;
    public final UserSession A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final C05A A09;

    public C25843Bby(UserSession userSession, HYF hyf, String str, String str2, String str3, String str4, String str5, String str6) {
        C14360o3.A0B(hyf, 1);
        this.A00 = hyf;
        this.A05 = userSession;
        this.A01 = str2;
        this.A07 = str4;
        this.A08 = str5;
        this.A06 = str6;
        C008002u A1H = AbstractC25225BEi.A1H(new C26037BfQ("", "", "", false, false));
        this.A09 = A1H;
        this.A04 = AbstractC208910l.A02(A1H);
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A03 = A00;
        this.A02 = A00;
        do {
        } while (!A1H.AIi(A1H.getValue(), new C26037BfQ(this.A07, this.A08, this.A06, C14360o3.A0K(userSession.userId, str3) || C14360o3.A0K(userSession.userId, str), AbstractC25225BEi.A1a(userSession.userId, str))));
    }
}
