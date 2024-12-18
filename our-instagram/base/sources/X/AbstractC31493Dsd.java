package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Dsd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31493Dsd {
    public static int A00 = -1;
    public static final int[] A01 = {2131956591, 2131972993};

    public static final ArrayList A00(InterfaceC53792dI interfaceC53792dI, UserSession userSession, C53N c53n) {
        ArrayList A1E = AbstractC166987dD.A1E();
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36315567690354079L);
        A1E.add(new C31492Dsc(c53n, A06));
        A1E.add(new C31491Dsb(c53n, A06));
        A1E.add(new C31494Dse(c53n, A06));
        A1E.add(new C31495Dsf(c53n, C18U.A01(c06090Tz, userSession, 36597042667129571L), A06));
        A1E.add(new C31496Dsg(interfaceC53792dI, c53n));
        A1E.add(new C31497Dsh(c53n));
        return A1E;
    }
}
