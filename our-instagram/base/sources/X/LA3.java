package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LA3 {
    public final UserSession A00;
    public final LEQ A01;

    public final ArrayList A03(C2EB c2eb, boolean z) {
        EnumC46248KdP enumC46248KdP;
        Iterable A1J;
        C14360o3.A0B(c2eb, 0);
        UserSession userSession = this.A00;
        List A0a = AbstractC001800i.A0a(C4I4.A00(userSession).A00);
        int ordinal = c2eb.ordinal();
        if (ordinal != 6 && ordinal != 3) {
            if (ordinal != 4) {
                if (ordinal == 7 || ordinal == 5) {
                    enumC46248KdP = EnumC46248KdP.A0A;
                    A1J = AbstractC166987dD.A1J(enumC46248KdP);
                }
                A1J = C16930sl.A00;
            } else {
                A1J = AbstractC001800i.A0a(this.A01.A01);
            }
        } else {
            if (!z && (AbstractC1337462f.A07(userSession) || AbstractC1337462f.A0B(userSession, true))) {
                enumC46248KdP = EnumC46248KdP.A09;
                A1J = AbstractC166987dD.A1J(enumC46248KdP);
            }
            A1J = C16930sl.A00;
        }
        return AbstractC001800i.A0S(A1J, A0a);
    }

    public final AbstractC46972Dl A00() {
        int ordinal = AbstractC46782Kmd.A00(this.A00).A00.ordinal();
        if (ordinal != 9 && ordinal != 10) {
            if (ordinal != 5 && ordinal != 8) {
                return C125575m3.A00;
            }
            return C125585m4.A00;
        }
        return C2057398y.A00;
    }

    public LA3(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = (LEQ) userSession.A01(LEQ.class, new C50159MDm(userSession, 17));
    }

    public final ArrayList A01() {
        Object A03;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A02().iterator();
        while (it.hasNext()) {
            AbstractC46972Dl abstractC46972Dl = (AbstractC46972Dl) it.next();
            if (C14360o3.A0K(abstractC46972Dl, C2057398y.A00)) {
                A03 = AbstractC001800i.A0a(C4I4.A00(this.A00).A00);
            } else {
                A03 = A03(AbstractC47860LCg.A00(abstractC46972Dl).A01, false);
            }
            A1E.add(new Pair(abstractC46972Dl, A03));
        }
        return A1E;
    }

    public final ArrayList A02() {
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(C125575m3.A00);
        UserSession userSession = this.A00;
        if (!AbstractC1337462f.A0A(userSession, true)) {
            A1E.add(C44039JdQ.A00);
        }
        if (AbstractC1337462f.A0C(userSession, true) && C18U.A06(C06090Tz.A05, userSession, 36317139648647990L)) {
            A1E.add(C125585m4.A00);
        }
        if (AbstractC1337462f.A03(userSession)) {
            A1E.add(C2057398y.A00);
        }
        return A1E;
    }
}
