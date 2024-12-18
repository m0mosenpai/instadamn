package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3qt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC85053qt {
    public static final void A00(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        String A2u;
        C1ON A0N;
        C1P1 hga;
        Integer CEO;
        synchronized (c75113Zb) {
            if (!c75113Zb.A2V) {
                C41227IMs c41227IMs = new C41227IMs(userSession, new C41588Iab(userSession, c38321qM, c75113Zb), c38321qM, c75113Zb);
                if (c38321qM.CdW()) {
                    String CAR = c38321qM.CAR();
                    String A2u2 = c38321qM.A2u();
                    int i = c75113Zb.A0X;
                    if (i == 0) {
                        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
                        if (injected != null && (CEO = injected.CEO()) != null) {
                            i = CEO.intValue();
                        } else {
                            i = 0;
                        }
                        c75113Zb.A0X = i;
                    }
                    if (CAR != null && A2u2 != null) {
                        int A0p = c38321qM.A0p();
                        Integer valueOf = Integer.valueOf(i);
                        int i2 = 0;
                        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                        c25621Ms.A05();
                        c25621Ms.A0B("ads/async_get_ondemand_carousel_cards/");
                        c25621Ms.A0Q(new C25591Mp(new C07510aQ(userSession), new C25611Mr(null), C41246INm.class, false));
                        c25621Ms.A9s("ad_client_token", CAR);
                        c25621Ms.A0D("start_index", A0p);
                        c25621Ms.A9s("media_id", A2u2);
                        if (valueOf != null) {
                            i2 = valueOf.intValue();
                        }
                        c25621Ms.A0D(AbstractC111324zv.A00(3285), i2);
                        A0N = c25621Ms.A0N();
                        hga = new HGI(c41227IMs);
                        A0N.A00 = hga;
                        C1GJ.A03(A0N);
                    }
                } else {
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if ((C18U.A06(c06090Tz, userSession, 36316632842506800L) || C18U.A06(c06090Tz, userSession, 36316632842572337L)) && (A2u = c38321qM.A2u()) != null) {
                        int A0p2 = c38321qM.A0p();
                        C25621Ms c25621Ms2 = new C25621Ms(userSession, -2);
                        c25621Ms2.A09(C05F.A0N);
                        c25621Ms2.A0B("feed/async_get_carousel_children_for_parent/");
                        c25621Ms2.A9s(AbstractC111324zv.A00(131), A2u);
                        c25621Ms2.A0D("start_index", A0p2);
                        c25621Ms2.A0P(null, C38848H8w.class, C41248INo.class, false);
                        A0N = c25621Ms2.A0N();
                        hga = new HGA(c41227IMs);
                        A0N.A00 = hga;
                        C1GJ.A03(A0N);
                    }
                }
            }
        }
    }

    public static final boolean A01(UserSession userSession, int i, int i2, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 4);
        if (!z || i >= i2) {
            return false;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (z2) {
            boolean A06 = C18U.A06(c06090Tz, userSession, 36316632842244652L);
            C14360o3.A0A(Boolean.valueOf(A06));
            return A06;
        }
        if (!C18U.A06(c06090Tz, userSession, 36316632842506800L) && !C18U.A06(c06090Tz, userSession, 36316632842572337L)) {
            return false;
        }
        return true;
    }
}
