package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.30Y, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30Y {
    public C62732tC A00;
    public final UserSession A01;
    public final InterfaceC668330a A02;
    public final InterfaceC60442pS A03;
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();
    public final C30V A07;

    public static C1BX A00(C30Y c30y, C1NI c1ni) {
        C62732tC c62732tC;
        synchronized (c30y) {
            c62732tC = c30y.A00;
            if (c62732tC == null) {
                c62732tC = c30y.A02.AXM(c30y.A01);
                c30y.A00 = c62732tC;
            }
        }
        InterfaceC60442pS interfaceC60442pS = c30y.A03;
        if (AbstractC75423a9.A02(c1ni, interfaceC60442pS)) {
            return c62732tC.A01;
        }
        if (AbstractC75423a9.A01(c1ni, interfaceC60442pS)) {
            return c62732tC.A00;
        }
        return null;
    }

    public static String A03(Integer num, String str) {
        if (!C05F.A00.equals(num)) {
            if (C05F.A01.equals(num)) {
                return AnonymousClass001.A0R(str, "_LAST_VIEWED_IMPRESSION_TIME");
            }
            return null;
        }
        return str;
    }

    public final void A06(C1NI c1ni, int i) {
        C141726ap c141726ap;
        String A01 = A01(this, c1ni);
        C1BX A00 = A00(this, c1ni);
        if (A01 != null && A00 != null && (c141726ap = (C141726ap) this.A05.remove(A01)) != null) {
            long currentTimeMillis = System.currentTimeMillis() - c141726ap.A05.longValue();
            if (currentTimeMillis > 500) {
                InterfaceC60442pS interfaceC60442pS = this.A03;
                if (AbstractC75423a9.A00(c1ni, interfaceC60442pS)) {
                    this.A07.Cm8((C82413m5) this.A06.remove(A01), c1ni, interfaceC60442pS, i, c141726ap.A01, currentTimeMillis);
                }
            }
        }
    }

    public final void A07(C38321qM c38321qM, C38321qM c38321qM2, int i) {
        C141726ap c141726ap;
        String A02 = A02(this, c38321qM, c38321qM2);
        C1BX A00 = A00(this, c38321qM);
        if (A02 != null && A00 != null && (c141726ap = (C141726ap) this.A05.remove(A02)) != null) {
            long currentTimeMillis = System.currentTimeMillis() - c141726ap.A05.longValue();
            if (currentTimeMillis > 500) {
                InterfaceC60442pS interfaceC60442pS = this.A03;
                if (AbstractC75423a9.A00(c38321qM, interfaceC60442pS)) {
                    this.A07.Cik(c38321qM, interfaceC60442pS, i, c141726ap.A01, currentTimeMillis);
                }
            }
        }
    }

    public final void A0A(C38321qM c38321qM, C38321qM c38321qM2, int i, int i2) {
        String A02 = A02(this, c38321qM, c38321qM2);
        C1BX A00 = A00(this, c38321qM);
        if (A02 != null && A00 != null) {
            this.A04.put(A02, new C141726ap(c38321qM, Long.valueOf(System.currentTimeMillis()), null, i, i2, 1000L));
        }
    }

    public static String A01(C30Y c30y, C1NI c1ni) {
        InterfaceC60442pS interfaceC60442pS = c30y.A03;
        if (AbstractC75423a9.A02(c1ni, interfaceC60442pS)) {
            String A06 = AbstractC41071vF.A06(c30y.A01, c1ni);
            A06.getClass();
            return AnonymousClass001.A0R(Integer.toHexString(A06.hashCode()), c1ni.getId());
        }
        if (AbstractC75423a9.A01(c1ni, interfaceC60442pS)) {
            return c1ni.getId();
        }
        return null;
    }

    public static String A02(C30Y c30y, C38321qM c38321qM, C38321qM c38321qM2) {
        String id;
        InterfaceC60442pS interfaceC60442pS = c30y.A03;
        if (AbstractC75423a9.A02(c38321qM, interfaceC60442pS)) {
            String A0F = AbstractC41071vF.A0F(c30y.A01, c38321qM);
            A0F.getClass();
            id = AnonymousClass001.A0R(Integer.toHexString(A0F.hashCode()), c38321qM2.getId());
        } else if (AbstractC75423a9.A01(c38321qM, interfaceC60442pS)) {
            id = c38321qM2.getId();
        } else {
            return null;
        }
        return AnonymousClass001.A0R("carousel_", id);
    }

    public static void A04(C1BX c1bx, C30Y c30y, C141726ap c141726ap, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, String str, int i) {
        if (str != null && c1bx != null) {
            Long l = c141726ap.A04;
            C18C.A07(l, "End time required at impression end");
            long longValue = l.longValue();
            if (longValue - c141726ap.A05.longValue() >= c141726ap.A02) {
                Integer num = C05F.A01;
                boolean z = false;
                if (c1bx.A04(A03(num, str), -2147483648L) != -2147483648L) {
                    z = true;
                }
                if (!z) {
                    int i2 = c141726ap.A00;
                    if (i2 == -1) {
                        c30y.A07.CmR(c1ni, interfaceC60442pS, i, c141726ap.A01);
                    } else {
                        C18C.A0E(c1ni instanceof C38321qM);
                        c30y.A07.Cil((C38321qM) c1ni, interfaceC60442pS, i2, c141726ap.A01);
                    }
                } else {
                    if (longValue - c1bx.A04(A03(num, str), 0L) <= StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                        return;
                    }
                    int i3 = c141726ap.A00;
                    if (i3 == -1) {
                        c30y.A07.Clt(c1ni, interfaceC60442pS, i, c141726ap.A01);
                    } else {
                        C18C.A0E(c1ni instanceof C38321qM);
                        c30y.A07.Cii((C38321qM) c1ni, interfaceC60442pS, i3, c141726ap.A01);
                    }
                }
                c1bx.A0C(A03(num, str), l.longValue());
                if (c1bx.A03() > 200) {
                    C6V2.A00(c1bx);
                }
            }
        }
    }

    public final void A05(C11520jB c11520jB, C1NI c1ni, int i, int i2) {
        String A01 = A01(this, c1ni);
        C1BX A00 = A00(this, c1ni);
        if (A01 != null && A00 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Integer num = C05F.A00;
            if (A00.A04(A03(num, A01), -2147483648L) != -2147483648L) {
                if (currentTimeMillis > A00.A04(A03(num, A01), 0L) + StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                    this.A07.Cls(c11520jB, c1ni, this.A03, i2, i);
                } else {
                    return;
                }
            } else {
                this.A07.Ck5(c11520jB, c1ni, this.A03, i2, i);
            }
            A00.A0C(A03(num, A01), currentTimeMillis);
            if (A00.A03() > 200) {
                C6V2.A00(A00);
            }
        }
    }

    public final void A08(C38321qM c38321qM, C38321qM c38321qM2, int i) {
        String A02 = A02(this, c38321qM, c38321qM2);
        C1BX A00 = A00(this, c38321qM);
        if (A02 != null && A00 != null) {
            C141726ap c141726ap = (C141726ap) this.A04.remove(A02);
            if (c141726ap == null) {
                C0K8.A0O("ImpressionTracker", "Viewable info missing for media with key %s", A02);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            C141726ap c141726ap2 = new C141726ap(c38321qM, c141726ap.A05, Long.valueOf(currentTimeMillis), c141726ap.A01, c141726ap.A00, c141726ap.A02);
            this.A05.put(A02, c141726ap2);
            A04(A00, this, c141726ap2, c38321qM, this.A03, A02, i);
        }
    }

    public C30Y(UserSession userSession, InterfaceC668330a interfaceC668330a, C30V c30v, InterfaceC60442pS interfaceC60442pS) {
        this.A03 = interfaceC60442pS;
        this.A07 = c30v;
        this.A01 = userSession;
        this.A02 = interfaceC668330a == null ? new InterfaceC668330a() { // from class: X.30Z
            @Override // X.InterfaceC668330a
            public final C62732tC AXM(UserSession userSession2) {
                return C62732tC.A00(userSession2);
            }
        } : interfaceC668330a;
    }

    public final void A09(C38321qM c38321qM, C38321qM c38321qM2, int i, int i2) {
        String A02 = A02(this, c38321qM, c38321qM2);
        C1BX A00 = A00(this, c38321qM);
        if (A02 != null && A00 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Integer num = C05F.A00;
            if (A00.A04(A03(num, A02), -2147483648L) != -2147483648L) {
                if (currentTimeMillis > A00.A04(A03(num, A02), 0L) + StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                    this.A07.Cih(c38321qM, this.A03, i2, i);
                } else {
                    return;
                }
            } else {
                this.A07.Cig(c38321qM, this.A03, i2, i);
            }
            A00.A0C(A03(num, A02), currentTimeMillis);
            if (A00.A03() > 200) {
                C6V2.A00(A00);
            }
        }
    }
}
