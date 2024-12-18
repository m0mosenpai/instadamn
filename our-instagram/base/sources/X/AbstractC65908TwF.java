package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.TwF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65908TwF {
    public static final C65784Tu2 A00(UserSession userSession, InterfaceC62612t0 interfaceC62612t0, InterfaceC65242xM interfaceC65242xM, Boolean bool, Integer num, int i, boolean z) {
        AbstractC167017dG.A1N(userSession, interfaceC65242xM);
        C14360o3.A0B(interfaceC62612t0, 4);
        int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        if (bool != null) {
            return new C65784Tu2(userSession, interfaceC62612t0, interfaceC65242xM, num, i, z, bool.booleanValue());
        }
        return new C65784Tu2(userSession, interfaceC62612t0, interfaceC65242xM, num, i, z);
    }

    public static final void A01(UserSession userSession, InterfaceC62612t0 interfaceC62612t0, InterfaceC65242xM interfaceC65242xM, Integer num, int i) {
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A1F(interfaceC65242xM, 1, interfaceC62612t0);
        C676233b c676233b = new C65784Tu2(userSession, interfaceC62612t0, interfaceC65242xM, num, i, true).A00.A04;
        Integer num2 = c676233b.A02;
        c676233b.A01 = num2;
        int i2 = Integer.MAX_VALUE;
        if (num2 == C05F.A01) {
            i2 = -1;
        }
        c676233b.A00 = i2;
    }
}
