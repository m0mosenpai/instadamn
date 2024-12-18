package X;

import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.common.session.UserSession;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.31C, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C31C extends C31D {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C65192xH A02;
    public final C64042vP A03;
    public final InterfaceC62242sP A04;
    public final C31A A05;
    public final AnonymousClass318 A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31C(UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, C65192xH c65192xH, C64042vP c64042vP, InterfaceC62242sP interfaceC62242sP, C31A c31a, String str) {
        super(userSession, anonymousClass318, interfaceC60442pS, null, c31a, str, null);
        C14360o3.A0B(str, 3);
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A06 = anonymousClass318;
        this.A05 = c31a;
        this.A02 = c65192xH;
        this.A03 = c64042vP;
        this.A04 = interfaceC62242sP;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A09 = C18U.A06(c06090Tz, userSession, 2342158602673982900L);
        this.A08 = C18U.A06(c06090Tz, userSession, 36315593460420022L);
        this.A07 = C18U.A06(c06090Tz, userSession, 36315593460354485L);
    }

    public static final void A08(C31C c31c, InterfaceC42381xS interfaceC42381xS, C1PZ c1pz) {
        int i;
        int i2;
        C38321qM A02;
        C82373m0 c82373m0 = (C82373m0) interfaceC42381xS.BUM();
        C671831j c671831j = c82373m0.A03;
        Integer num = c1pz.A0B;
        if (num == C05F.A01 && c671831j.A0B && c671831j.A09) {
            c31c.A0A(interfaceC42381xS);
            return;
        }
        int i3 = -1;
        switch (num.intValue()) {
            case 0:
                i = 6;
                break;
            case 1:
                i = 9;
                break;
            case 2:
                throw new IllegalStateException("Feed logging does not currently support TARGET_POSITION_NO_LONGER_VALID reason");
            case 3:
            case 4:
            case 5:
                i = -1;
                break;
            case 6:
                throw new IllegalStateException("Feed logging does not currently support AD_POSITION_IS_PASSED reason");
            case 7:
                throw new IllegalStateException("Feed logging does not currently support PUSH_DOWN_OUT_OF_SPACE reason");
            case 8:
                throw new IllegalStateException("Cannot log invalidation with NONE reason");
            default:
                throw new RuntimeException();
        }
        UserSession userSession = c31c.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36315309992381586L)) {
            i2 = 1016;
        } else {
            i2 = 2547;
        }
        String A00 = AbstractC111324zv.A00(i2);
        if (c31c.A04.CYw(c82373m0) && C18U.A06(c06090Tz, userSession, 36327855591865264L)) {
            C3XG c3xg = c82373m0.A01;
            C1XV c1xv = c3xg.A06;
            if (c1xv == C1XV.A0T) {
                Iterator it = c3xg.A01().A0B.iterator();
                while (it.hasNext()) {
                    c31c.A06(((IL5) it.next()).A00(), interfaceC42381xS, c1pz, c671831j, A00, i);
                }
                return;
            } else {
                if (c1xv == C1XV.A0l && (A02 = C3XH.A02(c3xg.A05)) != null) {
                    IL6 A002 = I23.A00(userSession);
                    Integer num2 = c3xg.A07;
                    if (num2 != null) {
                        i3 = num2.intValue();
                    }
                    Iterator it2 = A002.A00(A02, i3).A0B.iterator();
                    while (it2.hasNext()) {
                        c31c.A06(((IL5) it2.next()).A00(), interfaceC42381xS, c1pz, c671831j, A00, i);
                    }
                    return;
                }
                return;
            }
        }
        c31c.A06(C3XH.A02(c82373m0.A01.A05), interfaceC42381xS, c1pz, c671831j, A00, i);
    }

    public final void A0A(InterfaceC42381xS interfaceC42381xS) {
        C38321qM A02;
        int i;
        C14360o3.A0B(interfaceC42381xS, 0);
        C82373m0 c82373m0 = (C82373m0) interfaceC42381xS.BUM();
        if (this.A04.CYw(c82373m0)) {
            UserSession userSession = this.A00;
            if (C18U.A06(C06090Tz.A05, userSession, 36327855591865264L)) {
                C3XG c3xg = c82373m0.A01;
                C1XV c1xv = c3xg.A06;
                if (c1xv == C1XV.A0T) {
                    Iterator it = c3xg.A01().A0B.iterator();
                    while (it.hasNext()) {
                        it.next();
                        A09(interfaceC42381xS);
                    }
                    return;
                }
                if (c1xv == C1XV.A0l && (A02 = C3XH.A02(c3xg.A05)) != null) {
                    IL6 A00 = I23.A00(userSession);
                    Integer num = c3xg.A07;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -1;
                    }
                    Iterator it2 = A00.A00(A02, i).A0B.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                        A09(interfaceC42381xS);
                    }
                    return;
                }
                return;
            }
        }
        A09(interfaceC42381xS);
    }

    @Override // X.C31F
    public final /* bridge */ /* synthetic */ void CiA(C1PZ c1pz, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        C82373m0 c82373m0 = (C82373m0) obj;
        C14360o3.A0B(c82373m0, 0);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(collection, 3);
        C14360o3.A0B(collection2, 4);
        A07(this, c82373m0, l, str, str2, str3, str4, collection, collection2, z);
    }

    private final void A00(UserSession userSession, C3XG c3xg, C5H9 c5h9, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C671831j c671831j, Integer num, Long l, String str, String str2, String str3, String str4, List list, List list2, boolean z) {
        int i;
        C82713mZ A01 = C32U.A01(c5h9, c38321qM, interfaceC60442pS, "invalidation");
        A01.A1X = Boolean.valueOf(z);
        A01.A6U = str2;
        A01.A44 = l;
        A01.A66 = str3;
        A01.A6I = str4;
        A01.A6v = str;
        A01.A84 = list2;
        A01.A8J = AbstractC41071vF.A0R(userSession, c38321qM);
        A01.A1G = Boolean.valueOf(AbstractC23021Ah.A00(userSession).A1k());
        A01.A7E = c671831j.A08;
        A01.A4S = super.A00;
        A01.A4Y = C32V.A00(userSession);
        String A00 = AbstractC77343dK.A00(c38321qM.A0e);
        if (A00 != null) {
            A01.A57 = A00;
        }
        C3YO A002 = C3YM.A00(userSession);
        A01.A88 = A002.A04(interfaceC60442pS, list);
        A01.A0V(A002.A03(interfaceC60442pS));
        A01.A31 = A002.A01(interfaceC60442pS);
        A01.A32 = A002.A02(interfaceC60442pS);
        A002.A06(interfaceC60442pS, num);
        if (AbstractC61652rS.A02(userSession)) {
            A01.A4d = AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession)).toString();
            A01.A4e = AbstractC61652rS.A00(userSession).toString();
        }
        if (list2.contains(AbstractC111324zv.A00(1231))) {
            C65192xH c65192xH = this.A02;
            String str5 = c65192xH.A0T.BRZ(c38321qM).A1T;
            ArrayList A06 = c65192xH.A06();
            C14360o3.A0B(A06, 0);
            A01.A3J = Integer.valueOf(A06.indexOf(str5));
            A01.A6q = str5;
        }
        C1XV c1xv = c3xg.A06;
        if (c1xv == C1XV.A0l) {
            IL6 A003 = I23.A00(userSession);
            Integer num2 = c3xg.A07;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = -1;
            }
            this.A03.A09(null, A003.A00(c38321qM, i), null, str);
        }
        int A0n = c38321qM.A0n();
        if (A0n != -1) {
            A01.A2q = Integer.valueOf(A0n);
        }
        String A2w = c38321qM.A2w();
        if (A2w.length() > 0) {
            A01.A6J = A2w;
        }
        A01(c3xg, A01);
        A02(c1xv, A01, c38321qM, num);
        A04(A01, c38321qM, num);
        C11520jB c11520jB = new C11520jB();
        c11520jB.A04(C5I8.A6s, this.A06.A0a);
        A01.A0E(c11520jB);
        C32U.A0I(userSession, A01, interfaceC60442pS, C05F.A01);
    }

    private final void A01(C3XG c3xg, C82713mZ c82713mZ) {
        C1XV c1xv;
        C11520jB c11520jB;
        long j;
        Serializable serializable;
        Serializable serializable2;
        C38321qM A02 = C3XH.A02(c3xg.A05);
        Serializable serializable3 = null;
        if (A02 != null) {
            c1xv = A02.B5n();
        } else {
            c1xv = null;
        }
        if (c1xv == C1XV.A0l) {
            c11520jB = new C11520jB();
            c11520jB.A04(C5I8.A4W, true);
            C11500j9 c11500j9 = C5I8.A5y;
            if (A02.A0C.BVD() != null) {
                serializable = Long.valueOf(r1.BVI());
            } else {
                serializable = null;
            }
            c11520jB.A04(c11500j9, serializable);
            C11500j9 c11500j92 = C5I8.A5w;
            JMJ BVD = A02.A0C.BVD();
            if (BVD != null) {
                serializable2 = BVD.BVL();
            } else {
                serializable2 = null;
            }
            c11520jB.A04(c11500j92, serializable2);
            C11500j9 c11500j93 = C5I8.A5v;
            JMJ BVD2 = A02.A0C.BVD();
            if (BVD2 != null) {
                serializable3 = BVD2.BVC();
            }
            c11520jB.A04(c11500j93, serializable3);
        } else {
            if (c3xg.A06 != C1XV.A0T) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = c3xg.A01().A0B.iterator();
            while (it.hasNext()) {
                String A07 = AbstractC41071vF.A07(this.A00, ((IL5) it.next()).A00());
                if (A07 != null) {
                    arrayList.add(A07);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            c11520jB = new C11520jB();
            c11520jB.A04(C5I8.A4W, true);
            C11500j9 c11500j94 = C5I8.A5x;
            Integer A022 = c3xg.A01().A02();
            if (A022 != null) {
                serializable3 = AbstractC40675I1h.A00(A022);
            }
            c11520jB.A04(c11500j94, serializable3);
            C11500j9 c11500j95 = C5I8.A5y;
            H4K h4k = c3xg.A01().A03;
            if (h4k != null) {
                j = h4k.A00;
            } else {
                j = -1;
            }
            c11520jB.A04(c11500j95, Long.valueOf(j));
            c11520jB.A04(C5I8.A60, c3xg.A01().getId());
            c11520jB.A04(C5I8.A7w, c3xg.A01().A00().A02);
            c11520jB.A05(C5I8.A5t, arrayList);
        }
        c82713mZ.A0E(c11520jB);
    }

    private final void A02(C1XV c1xv, C82713mZ c82713mZ, C38321qM c38321qM, Integer num) {
        String str;
        Integer num2;
        String str2;
        Integer num3;
        List list;
        if (this.A09 && c38321qM != null && num != null && c1xv != C1XV.A0T) {
            Integer A2N = c38321qM.A2N();
            int intValue = num.intValue();
            int i = intValue - 1;
            List A08 = this.A02.A08();
            List list2 = null;
            if (i >= 0 && i < A08.size()) {
                InterfaceC38381qS interfaceC38381qS = ((C3XG) A08.get(i)).A05;
                C38321qM A02 = C3XH.A02(interfaceC38381qS);
                if (A02 != null) {
                    str2 = A02.getId();
                } else {
                    str2 = null;
                }
                C38321qM A022 = C3XH.A02(interfaceC38381qS);
                if (A022 != null) {
                    num3 = A022.A2M();
                } else {
                    num3 = null;
                }
                C38321qM A023 = C3XH.A02(interfaceC38381qS);
                if (A023 != null) {
                    list = A023.A0e;
                } else {
                    list = null;
                }
                String A00 = AbstractC77343dK.A00(list);
                if (str2 != null) {
                    c82713mZ.A6L = str2;
                }
                if (num3 != null) {
                    c82713mZ.A0D = num3.intValue();
                }
                if (A00 != null) {
                    c82713mZ.A59 = A00;
                }
            }
            if (intValue >= 0 && intValue < A08.size()) {
                InterfaceC38381qS interfaceC38381qS2 = ((C3XG) A08.get(intValue)).A05;
                C38321qM A024 = C3XH.A02(interfaceC38381qS2);
                if (A024 != null) {
                    str = A024.getId();
                } else {
                    str = null;
                }
                C38321qM A025 = C3XH.A02(interfaceC38381qS2);
                if (A025 != null) {
                    num2 = A025.A2M();
                } else {
                    num2 = null;
                }
                C38321qM A026 = C3XH.A02(interfaceC38381qS2);
                if (A026 != null) {
                    list2 = A026.A0e;
                }
                String A002 = AbstractC77343dK.A00(list2);
                if (str != null) {
                    c82713mZ.A6K = str;
                }
                if (num2 != null) {
                    c82713mZ.A0C = num2.intValue();
                }
                if (A002 != null) {
                    c82713mZ.A58 = A002;
                }
            }
            if (A2N != null) {
                c82713mZ.A0E = A2N.intValue();
            }
        }
    }

    private final void A03(C82713mZ c82713mZ, C38321qM c38321qM, C82373m0 c82373m0) {
        if (c38321qM != null) {
            if (c38321qM.CdW()) {
                c82713mZ.A0G(this.A00, c38321qM);
            }
            int A0n = c38321qM.A0n();
            if (A0n != -1) {
                c82713mZ.A2q = Integer.valueOf(A0n);
            }
            String A2w = c38321qM.A2w();
            if (A2w.length() > 0) {
                c82713mZ.A6J = A2w;
            }
        } else {
            InterfaceC38381qS interfaceC38381qS = c82373m0.A01.A05;
            if (interfaceC38381qS instanceof C40971v4) {
                C14360o3.A0C(interfaceC38381qS, AbstractC111324zv.A00(129));
                c82713mZ.A4T = ((C40971v4) interfaceC38381qS).A0S;
            }
        }
        C3XG c3xg = c82373m0.A01;
        A01(c3xg, c82713mZ);
        UserSession userSession = this.A00;
        if (AbstractC61652rS.A02(userSession)) {
            c82713mZ.A4d = AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession)).toString();
            c82713mZ.A4e = AbstractC61652rS.A00(userSession).toString();
        }
        C3YO A00 = C3YM.A00(userSession);
        InterfaceC60442pS interfaceC60442pS = this.A01;
        A00.A05(interfaceC60442pS, c3xg.A07);
        if (!C5I7.A00(userSession, c82713mZ, interfaceC60442pS, C05F.A01)) {
            AbstractC11060iN.A00(userSession).EIu(c82713mZ.A00());
        }
        C9CB c9cb = c82373m0.A00;
        int A09 = c82373m0.A03.A09();
        C14360o3.A0B(c9cb, 0);
        C74493Wh.A05(c9cb, userSession, c3xg, A09);
    }

    private final void A04(C82713mZ c82713mZ, C38321qM c38321qM, Integer num) {
        C38321qM A02;
        BrandSafetyContentBlocklistBitmapQLObj AiW;
        List Ag9;
        C38321qM A022;
        BrandSafetyContentBlocklistBitmapQLObj AiW2;
        List Ag92;
        if (this.A07) {
            boolean z = this.A08;
            if (z) {
                if (c38321qM != null) {
                    List A3b = c38321qM.A3b();
                    if (A3b != null) {
                        c82713mZ.A7o = A3b;
                    }
                } else {
                    return;
                }
            } else if (c38321qM == null) {
                return;
            }
            if (num != null) {
                int intValue = num.intValue();
                int i = intValue - 1;
                List A08 = this.A02.A08();
                if (i >= 0 && i < A08.size() && (A022 = C3XH.A02(((C3XG) A08.get(i)).A05)) != null && (AiW2 = A022.A0C.AiW()) != null && (Ag92 = AiW2.Ag9()) != null) {
                    ArrayList A01 = C5IK.A00.A01(Ag92);
                    if (z) {
                        c82713mZ.A7t = A01;
                    }
                    c82713mZ.A2u = Integer.valueOf(A01.size());
                }
                if (intValue >= 0 && intValue < A08.size() && (A02 = C3XH.A02(((C3XG) A08.get(intValue)).A05)) != null && (AiW = A02.A0C.AiW()) != null && (Ag9 = AiW.Ag9()) != null) {
                    ArrayList A012 = C5IK.A00.A01(Ag9);
                    if (z) {
                        c82713mZ.A7s = A012;
                    }
                    c82713mZ.A2t = Integer.valueOf(A012.size());
                }
            }
        }
    }

    public static final void A05(C38321qM c38321qM, C31C c31c, C82373m0 c82373m0, Integer num) {
        InterfaceC60442pS interfaceC60442pS = c31c.A01;
        if (AbstractC75423a9.A00(c38321qM, interfaceC60442pS)) {
            UserSession userSession = c31c.A00;
            C5SE c5se = new C5SE(userSession, c38321qM);
            int i = -1;
            if (c38321qM.A5M()) {
                i = 0;
            }
            c5se.A00 = i;
            C82713mZ A01 = C32U.A01(c5se, c38321qM, interfaceC60442pS, "delivery");
            A01.A4S = ((C31D) c31c).A00;
            A01.A7E = c82373m0.A03.A08;
            A01.A2x = num;
            A01.A4Y = C32V.A00(userSession);
            c31c.A01(c82373m0.A01, A01);
            if (AbstractC61652rS.A02(userSession)) {
                A01.A4d = AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession)).toString();
                A01.A4e = AbstractC61652rS.A00(userSession).toString();
            }
            C32U.A0C(userSession, A01, c38321qM, interfaceC60442pS, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A06(X.C38321qM r10, X.InterfaceC42381xS r11, X.C1PZ r12, X.C671831j r13, java.lang.String r14, int r15) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31C.A06(X.1qM, X.1xS, X.1PZ, X.31j, java.lang.String, int):void");
    }

    public static final void A07(C31C c31c, C82373m0 c82373m0, Long l, String str, String str2, String str3, String str4, Collection collection, Collection collection2, boolean z) {
        C38321qM A02;
        List list;
        C3XG c3xg = c82373m0.A01;
        List list2 = null;
        if (c3xg.A06 == C1XV.A0T) {
            IL5 il5 = (IL5) AbstractC001800i.A0O(c3xg.A01().A0B, 0);
            if (il5 != null) {
                A02 = il5.A00();
            } else {
                return;
            }
        } else {
            A02 = C3XH.A02(c3xg.A05);
        }
        if (A02 != null) {
            boolean equals = str.equals("duplicate_ad_received");
            UserSession userSession = c31c.A00;
            if (equals) {
                InterfaceC60442pS interfaceC60442pS = c31c.A01;
                if (collection != null) {
                    list2 = AbstractC001800i.A0a(collection);
                }
                List singletonList = Collections.singletonList("duplicate_ad_received");
                C14360o3.A07(singletonList);
                C5H9 c5se = new C5SE(userSession, A02);
                C671831j c671831j = c82373m0.A03;
                c31c.A00(userSession, c3xg, c5se, A02, interfaceC60442pS, c671831j, c3xg.A07, l, "duplicate_ad_received", str2, str3, str4, list2, singletonList, z);
                C74493Wh.A04(c82373m0.A00, userSession, c3xg, c671831j.A09());
                return;
            }
            InterfaceC60442pS interfaceC60442pS2 = c31c.A01;
            if (collection != null) {
                list = AbstractC001800i.A0a(collection);
            } else {
                list = null;
            }
            List A0a = AbstractC001800i.A0a(collection2);
            C5SE c5se2 = new C5SE(userSession, A02);
            int i = -1;
            if (A02.A5M()) {
                i = 0;
            }
            c5se2.A00 = i;
            c31c.A00(userSession, c3xg, c5se2, A02, interfaceC60442pS2, c82373m0.A03, c3xg.A07, null, str, null, null, null, list, A0a, z);
            C74493Wh.A03(c82373m0.A00, userSession, c3xg);
        }
    }

    private final void A09(InterfaceC42381xS interfaceC42381xS) {
        C82713mZ c82713mZ = new C82713mZ(this.A01, "ad_exit_pool");
        C82373m0 c82373m0 = (C82373m0) interfaceC42381xS.BUM();
        InterfaceC38381qS interfaceC38381qS = c82373m0.A01.A05;
        c82713mZ.A7Q = interfaceC38381qS.CAR();
        C671831j c671831j = c82373m0.A03;
        c82713mZ.A7E = c671831j.A08;
        c82713mZ.A0G = c671831j.A09();
        c82713mZ.A4S = super.A00;
        C38321qM A02 = C3XH.A02(interfaceC38381qS);
        if (A02 != null) {
            c82713mZ.A0G(this.A00, A02);
        }
        AbstractC11060iN.A00(this.A00).EIu(c82713mZ.A00());
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ci9(InterfaceC42381xS interfaceC42381xS, Object obj) {
        String str;
        C38321qM A02;
        C1PZ c1pz = (C1PZ) obj;
        C14360o3.A0B(interfaceC42381xS, 0);
        C14360o3.A0B(c1pz, 1);
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36315309992316049L)) {
            str = "instagram_ad_insertion_success";
        } else {
            str = "instagram_ad_async_ad_controller_action_success";
        }
        C82373m0 c82373m0 = (C82373m0) interfaceC42381xS.BUM();
        C82713mZ c82713mZ = new C82713mZ(this.A01, str);
        C3XG c3xg = c82373m0.A01;
        InterfaceC38381qS interfaceC38381qS = c3xg.A05;
        c82713mZ.A7Q = interfaceC38381qS.CAR();
        c82713mZ.A4Z = "timeline_request";
        C671831j c671831j = c82373m0.A03;
        c82713mZ.A0B = c671831j.A09();
        c82713mZ.A7E = c671831j.A08;
        c82713mZ.A4S = super.A00;
        c82713mZ.A4Y = C32V.A00(userSession);
        int i = -1;
        if (this.A04.CYw(c82373m0) && C18U.A06(c06090Tz, userSession, 36327855591865264L)) {
            C1XV c1xv = c3xg.A06;
            if (c1xv == C1XV.A0T) {
                c82713mZ.A5p = A2Q.A00(c1pz.A0C);
                Iterator it = c3xg.A01().A0B.iterator();
                while (it.hasNext()) {
                    A03(c82713mZ, ((IL5) it.next()).A00(), c82373m0);
                }
                return;
            }
            if (c1xv == C1XV.A0l && (A02 = C3XH.A02(interfaceC38381qS)) != null) {
                IL6 A00 = I23.A00(userSession);
                Integer num = c3xg.A07;
                if (num != null) {
                    i = num.intValue();
                }
                HBC A002 = A00.A00(A02, i);
                this.A03.A0H(A002, null, Long.valueOf(c671831j.A09()), "server_delivered_iaa", -1);
                Iterator it2 = A002.A0B.iterator();
                while (it2.hasNext()) {
                    A03(c82713mZ, ((IL5) it2.next()).A00(), c82373m0);
                }
                return;
            }
            return;
        }
        C38321qM A022 = C3XH.A02(interfaceC38381qS);
        C1XV c1xv2 = c3xg.A06;
        if (c1xv2 == C1XV.A0T) {
            c82713mZ.A5p = A2Q.A00(c1pz.A0C);
        }
        if (c1xv2 == C1XV.A0l && A022 != null) {
            IL6 A003 = I23.A00(userSession);
            Integer num2 = c3xg.A07;
            if (num2 != null) {
                i = num2.intValue();
            }
            this.A03.A0H(A003.A00(A022, i), null, Long.valueOf(c671831j.A09()), "server_delivered_iaa", -1);
        }
        A03(c82713mZ, A022, c82373m0);
    }
}
