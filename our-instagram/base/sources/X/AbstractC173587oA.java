package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7oA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC173587oA {
    public static final EnumC143276dS A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36314730171730717L)) {
            return EnumC143276dS.A0P;
        }
        return EnumC143276dS.A0Y;
    }

    public static final C148276lx A01(C148286ly c148286ly) {
        EnumC150226pU enumC150226pU;
        String str = c148286ly.A0S;
        C14360o3.A07(str);
        c148286ly.A0S = c148286ly.A0a;
        List singletonList = Collections.singletonList(c148286ly);
        C14360o3.A07(singletonList);
        if (c148286ly.A04() == C05F.A0N) {
            enumC150226pU = EnumC150226pU.A0A;
        } else {
            enumC150226pU = EnumC150226pU.A0C;
        }
        return new C148276lx(enumC150226pU, str, singletonList);
    }
}
