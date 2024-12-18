package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.wellbeing.quietmode.repository.QuietModeRepository$updateQuietMode$2;
import com.instagram.wellbeing.quietmode.repository.QuietModeRepository$updateQuietModeWithWindows$2;
import java.util.List;

/* renamed from: X.OKk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54811OKk {
    public final C92694De A00 = AbstractC166177bl.A00(MZG.A00);
    public final UserSession A01;
    public final C54292NzC A02;

    public final Object A01(InterfaceC58007Pnr interfaceC58007Pnr, InterfaceC23621Ds interfaceC23621Ds) {
        User A01 = C17060sy.A01.A01(this.A01);
        C92694De c92694De = this.A00;
        QuietModeRepository$updateQuietMode$2 quietModeRepository$updateQuietMode$2 = new QuietModeRepository$updateQuietMode$2(A01, interfaceC58007Pnr, this, null, true);
        C0eB c0eB = C0eB.A00;
        Object A00 = c92694De.A00(c0eB, interfaceC23621Ds, quietModeRepository$updateQuietMode$2);
        if (A00 != C1JX.A02) {
            return c0eB;
        }
        return A00;
    }

    public final Object A00(InterfaceC58092PpH interfaceC58092PpH, Long l, Long l2, List list, InterfaceC23621Ds interfaceC23621Ds, long j, long j2, boolean z, boolean z2) {
        User A01 = C17060sy.A01.A01(this.A01);
        C92694De c92694De = this.A00;
        QuietModeRepository$updateQuietModeWithWindows$2 quietModeRepository$updateQuietModeWithWindows$2 = new QuietModeRepository$updateQuietModeWithWindows$2(A01, interfaceC58092PpH, this, l, l2, list, null, j, j2, z, z2);
        C0eB c0eB = C0eB.A00;
        Object A00 = c92694De.A00(c0eB, interfaceC23621Ds, quietModeRepository$updateQuietModeWithWindows$2);
        if (A00 != C1JX.A02) {
            return c0eB;
        }
        return A00;
    }

    public C54811OKk(UserSession userSession, C54292NzC c54292NzC) {
        this.A01 = userSession;
        this.A02 = c54292NzC;
    }
}
