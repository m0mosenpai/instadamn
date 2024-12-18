package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9Tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210779Tz extends AbstractC52922bZ {
    public final C27268C1l A00;
    public final InterfaceC19390xP A01;
    public final InterfaceC06180Ui A02;
    public final C05A A03;
    public final C0UO A04;
    public final UserSession A05;

    public C210779Tz(UserSession userSession, C27268C1l c27268C1l) {
        EnumC27404C7h enumC27404C7h;
        this.A05 = userSession;
        this.A00 = c27268C1l;
        EnumC76383bi enumC76383bi = (EnumC76383bi) c27268C1l.A03.getValue();
        C14360o3.A0B(enumC76383bi, 0);
        if (enumC76383bi.ordinal() == 1) {
            enumC27404C7h = EnumC27404C7h.A06;
        } else {
            enumC27404C7h = EnumC27404C7h.A07;
        }
        C008002u c008002u = new C008002u(new C26084BgD(enumC27404C7h, AbstractC34041F0u.A00(userSession)));
        this.A03 = c008002u;
        this.A04 = AbstractC208910l.A02(c008002u);
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A02 = A00;
        this.A01 = A00;
    }
}
