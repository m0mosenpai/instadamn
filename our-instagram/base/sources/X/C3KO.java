package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3KO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KO {
    public C3KQ A00;
    public boolean A01;
    public final UserSession A02;
    public final String A03;
    public final Map A04;
    public final boolean A05;

    public C3KO(UserSession userSession) {
        this.A02 = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A05 = C18U.A06(c06090Tz, userSession, 36322323673917596L);
        this.A03 = C18U.A04(c06090Tz, userSession, 36885273627525734L);
        this.A04 = new LinkedHashMap();
    }
}
