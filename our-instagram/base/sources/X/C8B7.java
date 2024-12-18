package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8B7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8B7 {
    public long A00;
    public boolean A01;
    public final C92694De A02;
    public final UserSession A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;
    public final C0UO A08;
    public final C0UO A09;
    public final boolean A0A;
    public final C19L A0B;
    public final C05A A0C;
    public final C0UO A0D;

    public final void A00(String str) {
        C14360o3.A0B(str, 0);
        C19L c19l = this.A0B;
        C9DY c9dy = new C9DY(this, str, null, 3);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        AbstractC23641Du.A03(num, anonymousClass191, c9dy, c19l);
        if (C173057nJ.A00.A00(this.A03, true)) {
            AbstractC23641Du.A03(num, anonymousClass191, new C9DZ(this, str, null, 3), c19l);
        }
    }

    public C8B7(C92694De c92694De, UserSession userSession, C19L c19l) {
        this.A03 = userSession;
        this.A0B = c19l;
        this.A02 = c92694De;
        this.A0A = C18U.A06(C06090Tz.A05, userSession, 36316598482965022L);
        C008002u A00 = C10E.A00(null);
        this.A0C = A00;
        this.A07 = A00;
        C008002u A002 = C10E.A00(null);
        this.A05 = A002;
        this.A09 = A002;
        C008002u A003 = C10E.A00(null);
        this.A04 = A003;
        this.A08 = A003;
        C008002u A004 = C10E.A00(null);
        this.A06 = A004;
        this.A0D = A004;
    }
}
