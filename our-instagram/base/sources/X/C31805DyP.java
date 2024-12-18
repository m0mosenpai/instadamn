package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.DyP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31805DyP extends AbstractC52922bZ {
    public final C05A A00;
    public final C0UO A01;
    public final List A02;

    public C31805DyP(UserSession userSession, EnumC33411Epi enumC33411Epi, boolean z) {
        EnumC33411Epi enumC33411Epi2;
        AbstractC167017dG.A1P(userSession, enumC33411Epi);
        C01L A1I = C0eM.A1I();
        if (z) {
            if (C18U.A06(C06090Tz.A05, userSession, 36327520584481420L)) {
                enumC33411Epi2 = EnumC33411Epi.A08;
            } else {
                enumC33411Epi2 = EnumC33411Epi.A06;
            }
        } else {
            enumC33411Epi2 = EnumC33411Epi.A04;
        }
        A1I.add(enumC33411Epi2);
        A1I.add(EnumC33411Epi.A07);
        A1I.add(EnumC33411Epi.A05);
        C01L A1J = C0eM.A1J(A1I);
        this.A02 = A1J;
        C008002u A1H = AbstractC25225BEi.A1H(new C51761Mtk(enumC33411Epi, A1J));
        this.A00 = A1H;
        this.A01 = AbstractC208910l.A02(A1H);
    }
}
