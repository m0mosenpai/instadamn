package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9yy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226419yy {
    public static final C1ON A00(UserSession userSession, Integer num) {
        C14360o3.A0B(userSession, 0);
        C1Ee c1Ee = new C1Ee();
        String valueOf = String.valueOf(C23831Eq.A00());
        c1Ee.A05("timezone_offset", valueOf);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("creatives/create_mode/");
        A0c.A9s("timezone_offset", valueOf);
        A0c.A0R(C214339eX.class, C23018ADa.class);
        A0c.A0A = c1Ee.A01("creatives/create_mode/");
        A0c.A07 = num;
        if (num == C05F.A0C) {
            ((AbstractC23721Ec) A0c).A01 = 604800000L;
        }
        A0c.A0R = true;
        return A0c.A0N();
    }
}
