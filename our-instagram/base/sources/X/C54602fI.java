package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.notifications.badging.impl.BadgingApiImpl;
import com.instagram.notifications.badging.impl.InMemoryBadgingRepository$getBadges$$inlined$filter$1$2;
import com.instagram.notifications.badging.impl.InMemoryBadgingRepository$getBadges$$inlined$map$1$2;
import java.util.Map;

/* renamed from: X.2fI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54602fI {
    public boolean A00;
    public final Context A01;
    public final UserSession A02;
    public final C54462f0 A03;
    public final C54662fO A04;
    public final BadgingApiImpl A05;
    public final C54592fH A06;
    public final Map A07;
    public final C19L A08;
    public final C05A A09;
    public final C54452ez A0A;

    public C54602fI(Context context, UserSession userSession, C54462f0 c54462f0, C54662fO c54662fO, BadgingApiImpl badgingApiImpl, C54452ez c54452ez, C54592fH c54592fH, Map map, C19L c19l) {
        C14360o3.A0B(c54462f0, 1);
        C14360o3.A0B(badgingApiImpl, 2);
        C14360o3.A0B(c19l, 5);
        C14360o3.A0B(c54452ez, 8);
        C14360o3.A0B(c54592fH, 9);
        this.A03 = c54462f0;
        this.A05 = badgingApiImpl;
        this.A07 = map;
        this.A04 = c54662fO;
        this.A08 = c19l;
        this.A02 = userSession;
        this.A01 = context;
        this.A0A = c54452ez;
        this.A06 = c54592fH;
        this.A09 = new C008002u(false);
    }

    public final InterfaceC19390xP A00(InterfaceC54232eZ interfaceC54232eZ) {
        InterfaceC19390xP interfaceC19390xP;
        InterfaceC19390xP interfaceC19390xP2;
        C54492f3 c54492f3 = (C54492f3) this.A03.A03.get(interfaceC54232eZ);
        if (c54492f3 != null) {
            interfaceC19390xP = c54492f3.A01;
        } else {
            interfaceC19390xP = null;
        }
        if (interfaceC19390xP != null) {
            interfaceC19390xP2 = new C16400rl(new C206629Ct(this, null, 35), interfaceC19390xP);
        } else {
            interfaceC19390xP2 = C16450rq.A00;
        }
        if (C18U.A06(C06090Tz.A06, this.A0A.A00, 36310662838288613L)) {
            final C15150pV A03 = C10Q.A03(new C206679Cy(0, null), interfaceC19390xP2, this.A09);
            final InterfaceC19390xP interfaceC19390xP3 = new InterfaceC19390xP() { // from class: X.2lb
                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    Object collect = InterfaceC19390xP.this.collect(new InMemoryBadgingRepository$getBadges$$inlined$filter$1$2(interfaceC19960yQ), interfaceC23621Ds);
                    if (collect != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return collect;
                }
            };
            return new InterfaceC19390xP() { // from class: X.2lc
                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    Object collect = InterfaceC19390xP.this.collect(new InMemoryBadgingRepository$getBadges$$inlined$map$1$2(interfaceC19960yQ), interfaceC23621Ds);
                    if (collect != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return collect;
                }
            };
        }
        return interfaceC19390xP2;
    }

    public final void A01() {
        C19L c19l = this.A08;
        C9DU c9du = new C9DU(this, null, 3);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9du, c19l);
    }

    public final void A02(InterfaceC54232eZ interfaceC54232eZ) {
        C54492f3 c54492f3 = (C54492f3) this.A03.A03.get(interfaceC54232eZ);
        if (c54492f3 != null) {
            c54492f3.A01();
        }
        InterfaceC54632fL interfaceC54632fL = (InterfaceC54632fL) this.A07.get(interfaceC54232eZ);
        if (interfaceC54632fL != null) {
            interfaceC54632fL.AHc(interfaceC54232eZ);
        }
    }
}
