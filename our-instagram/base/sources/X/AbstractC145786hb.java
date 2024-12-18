package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6hb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC145786hb {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1M1, X.1M0, java.lang.Object] */
    public static final C71023Go A00(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 2);
        ?? obj = new Object();
        obj.A00 = str;
        C1M6 A01 = AbstractC25451Lz.A01(userSession, obj);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36318114606684066L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36318114607208360L);
        boolean A063 = C18U.A06(c06090Tz, userSession, 2342161123821492144L);
        return new C71023Go(interfaceC60442pS, A01, new C61412r4(userSession, C25361Lq.A00(userSession)), new C9FL(2, interfaceC60442pS, A01, userSession), new C9FL(3, interfaceC60442pS, A01, userSession), new C9FL(4, interfaceC60442pS, A01, userSession), new C9F7(11, interfaceC60442pS, userSession), new C9FL(5, interfaceC60442pS, A01, userSession), new C9FL(6, interfaceC60442pS, A01, userSession), new C9FL(7, interfaceC60442pS, A01, userSession), new C9F7(12, A01, userSession), new C9F7(13, A01, userSession), new C9FH(9, userSession, A01, A062), A06, A062, A063, C18U.A06(c06090Tz, userSession, 36318114606552992L));
    }

    public static final String A02(C41181vS c41181vS) {
        String id;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM == null || (id = c38321qM.getId()) == null) {
            return "n/a";
        }
        return id;
    }

    public static final ArrayList A03(UserSession userSession, C41551w4 c41551w4) {
        Reel reel = c41551w4.A0H;
        ArrayList arrayList = new ArrayList();
        if (reel.A17(userSession)) {
            List A0O = reel.A0O(userSession);
            C14360o3.A07(A0O);
            Iterator it = A0O.iterator();
            while (it.hasNext()) {
                C38321qM c38321qM = ((C41181vS) it.next()).A0b;
                if (c38321qM != null) {
                    String id = c38321qM.getId();
                    if (id != null) {
                        arrayList.add(id);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
        return arrayList;
    }

    public static final AnonymousClass344 A01(final UserSession userSession, final InterfaceC60442pS interfaceC60442pS, final InterfaceC101944i9 interfaceC101944i9, final C1M1 c1m1) {
        InterfaceC64212vg c42995Izl;
        InterfaceC64212vg c42996Izm;
        boolean A01 = C1P8.A01(userSession);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36320635751834398L);
        if (A01) {
            if (A06) {
                c42996Izm = new InterfaceC64212vg(userSession, interfaceC60442pS, interfaceC101944i9, c1m1) { // from class: X.6YF
                    public int A01;
                    public final UserSession A04;
                    public final InterfaceC60442pS A05;
                    public final InterfaceC101944i9 A06;
                    public final C1M1 A07;
                    public final ConcurrentHashMap A0A = new ConcurrentHashMap();
                    public final ConcurrentHashMap A09 = new ConcurrentHashMap();
                    public final ConcurrentHashMap A0B = new ConcurrentHashMap();
                    public final HashSet A08 = new HashSet();
                    public String A03 = "empty";
                    public int A00 = -1;
                    public int A02 = -1;

                    @Override // X.InterfaceC64212vg
                    public final /* bridge */ /* synthetic */ C9CQ AUX(Object obj, Object obj2) {
                        C41181vS c41181vS = (C41181vS) obj;
                        C14360o3.A0B(c41181vS, 0);
                        return AbstractC82563mK.A01(c41181vS.A0b);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
                    
                        if (r12 == null) goto L44;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fd, code lost:
                    
                        if (r4 != null) goto L52;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:66:0x0154, code lost:
                    
                        if (r32 != X.EnumC64262vl.A04) goto L44;
                     */
                    @Override // X.InterfaceC64212vg
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final /* bridge */ /* synthetic */ X.C82573mL AUY(X.EnumC64262vl r32, java.lang.Object r33, java.lang.Object r34, float r35, long r36, long r38) {
                        /*
                            Method dump skipped, instructions count: 390
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C6YF.AUY(X.2vl, java.lang.Object, java.lang.Object, float, long, long):X.3mL");
                    }

                    {
                        this.A04 = userSession;
                        this.A05 = interfaceC60442pS;
                        this.A06 = interfaceC101944i9;
                        this.A07 = c1m1;
                    }
                };
            } else {
                c42996Izm = new C42996Izm(userSession, interfaceC60442pS, interfaceC101944i9, c1m1);
            }
            return AnonymousClass343.A00(userSession, c42996Izm, EnumC64222vh.A09);
        }
        if (A06) {
            c42995Izl = new InterfaceC64212vg(userSession, interfaceC60442pS, interfaceC101944i9, c1m1) { // from class: X.6YF
                public int A01;
                public final UserSession A04;
                public final InterfaceC60442pS A05;
                public final InterfaceC101944i9 A06;
                public final C1M1 A07;
                public final ConcurrentHashMap A0A = new ConcurrentHashMap();
                public final ConcurrentHashMap A09 = new ConcurrentHashMap();
                public final ConcurrentHashMap A0B = new ConcurrentHashMap();
                public final HashSet A08 = new HashSet();
                public String A03 = "empty";
                public int A00 = -1;
                public int A02 = -1;

                @Override // X.InterfaceC64212vg
                public final /* bridge */ /* synthetic */ C9CQ AUX(Object obj, Object obj2) {
                    C41181vS c41181vS = (C41181vS) obj;
                    C14360o3.A0B(c41181vS, 0);
                    return AbstractC82563mK.A01(c41181vS.A0b);
                }

                @Override // X.InterfaceC64212vg
                public final /* bridge */ /* synthetic */ C82573mL AUY(EnumC64262vl enumC64262vl, Object obj, Object obj2, float f, long j, long j2) {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*
                        Method dump skipped, instructions count: 390
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C6YF.AUY(X.2vl, java.lang.Object, java.lang.Object, float, long, long):X.3mL");
                }

                {
                    this.A04 = userSession;
                    this.A05 = interfaceC60442pS;
                    this.A06 = interfaceC101944i9;
                    this.A07 = c1m1;
                }
            };
        } else {
            c42995Izl = new C42995Izl(userSession, interfaceC60442pS, interfaceC101944i9, c1m1);
        }
        return AnonymousClass343.A00(userSession, c42995Izl, EnumC64222vh.A09);
    }
}
