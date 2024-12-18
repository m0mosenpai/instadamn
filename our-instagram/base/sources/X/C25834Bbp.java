package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bbp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25834Bbp extends AbstractC52922bZ {
    public final InterfaceC09390do A00;
    public final C05A A01;
    public final C0UO A02;
    public final UserSession A03;

    public C25834Bbp(UserSession userSession, String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        C008002u A1H = AbstractC25225BEi.A1H(new C26052Bff(str, str2, str3, str4, i, z, z2));
        this.A01 = A1H;
        this.A02 = A1H;
        C27273C1y c27273C1y = new C27273C1y(userSession);
        C17050sx A01 = AbstractC09440dt.A01(new D8J(21, c27273C1y, new C8CY(c27273C1y.A00)));
        this.A00 = A01;
        C05A c05a = ((C27267C1k) A01.getValue()).A01;
        do {
        } while (!AbstractC25236BEt.A11(c05a.getValue(), c05a, i, z));
        AbstractC166987dD.A1Z(new PXT(this, null, 0), AbstractC141776au.A00(this));
    }
}
