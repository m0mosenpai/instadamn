package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.32S, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32S implements InterfaceC12870lZ, InterfaceC670130s, InterfaceC669830p, InterfaceC673031v, C32T {
    public int A00;
    public int A01;
    public C61672rU A03;
    public C1AV A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0G;
    public C31T A0H;
    public boolean A0I;
    public boolean A0J;
    public final long A0K;
    public final UserSession A0L;
    public final C1PH A0M;
    public final C32E A0N;
    public final C26281Pj A0O;
    public final C1PC A0P;
    public final AnonymousClass320 A0Q;
    public final InterfaceC62242sP A0R;
    public final InterfaceC671731i A0S;
    public final InterfaceC669530m A0T;
    public final InterfaceC671231d A0U;
    public final C32D A0V;
    public final C32K A0W;
    public final C31E A0X;
    public final C1PY A0Y;
    public final InterfaceC671531g A0Z;
    public final C672131m A0a;
    public final java.util.Set A0c;
    public final java.util.Set A0d;
    public final java.util.Set A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final int A0n;
    public final int A0o;
    public final int A0p;
    public final C13920nI A0q;
    public final AnonymousClass328 A0r;
    public final AnonymousClass315 A0s;
    public final InterfaceC670931a A0t;
    public final C3HZ A0u;
    public final AnonymousClass322 A0v;
    public final InterfaceC61522rF A0w;
    public final InterfaceC673231x A0x;
    public final InterfaceC673231x A0y;
    public final String A0z;
    public final List A10;
    public final List A11;
    public final boolean A12;
    public final boolean A13;
    public final boolean A14;
    public final boolean A15;
    public final boolean A16;
    public final boolean A17;
    public final boolean A18;
    public final boolean A19;
    public final boolean A1A;
    public final boolean A1B;
    public final boolean A1C;
    public final boolean A1D;
    public final boolean A1E;
    public final boolean A1F;
    public final boolean A1G;
    public final Map A0b = new HashMap();
    public final java.util.Set A0f = new HashSet();
    public final java.util.Set A0e = new HashSet();
    public int A09 = -1;
    public int A0E = -1;
    public int A0F = -1;
    public int A02 = -1;

    private C3ZB A00() {
        C3ZA By3 = this.A0s.By3();
        long j = 0;
        String str = "";
        String str2 = null;
        long j2 = By3.A00;
        long j3 = By3.A03;
        long j4 = By3.A01;
        long j5 = By3.A02;
        boolean CUl = this.A0T.CUl();
        long j6 = this.A09;
        long j7 = this.A0G;
        long j8 = this.A0Q.A01;
        long j9 = this.A0B;
        long j10 = this.A0A;
        LinkedList linkedList = this.A0Y.A02;
        long size = linkedList.size();
        InterfaceC62242sP interfaceC62242sP = this.A0R;
        interfaceC62242sP.getClass();
        Iterator it = linkedList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (interfaceC62242sP.CdX(((InterfaceC42381xS) it.next()).BUM())) {
                i++;
            }
        }
        long j11 = i;
        long j12 = this.A0C;
        long size2 = this.A0U.BZU().size();
        long size3 = this.A0f.size();
        long j13 = this.A0E;
        long j14 = this.A0F;
        long j15 = this.A02;
        C1PC c1pc = this.A0P;
        C1PH c1ph = this.A0M;
        if (c1ph != null && c1pc != null) {
            AnonymousClass318 A02 = c1ph.A02(this.A04, c1pc);
            str2 = A02.A0a;
            String str3 = A02.A0T;
            if (str3 != null) {
                str = str3;
            }
            Long l = A02.A0N;
            Long l2 = A02.A0L;
            if (l != null && l2 != null) {
                j = l.longValue() - l2.longValue();
            }
        }
        return new C3ZB(str2, str, j2, j3, j4, j5, j6, j7, j8, j9, j10, size, j11, j12, size3, size2, j13, j14, j15, j, CUl);
    }

    private C101484hA A01(Integer num, Integer num2, Collection collection, boolean z) {
        C32K c32k = this.A0W;
        boolean z2 = this.A1G;
        Map map = this.A0b;
        C5IC E6J = c32k.E6J(this.A0z, collection, map, z2);
        Collection collection2 = E6J.A01;
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            C5I4 c5i4 = (C5I4) map.get(this.A0R.BF8(it.next()));
            c5i4.getClass();
            c5i4.Eek(C5I5.A05);
        }
        int Bg5 = this.A0T.Bg5();
        C1PY c1py = this.A0Y;
        if (Bg5 == -1) {
            Bg5 = this.A0Q.A02;
        }
        c1py.A07(num, num2, collection2, Bg5, z);
        Collection collection3 = E6J.A00;
        for (Object obj : collection3) {
            InterfaceC62242sP interfaceC62242sP = this.A0R;
            C5I4 c5i42 = (C5I4) map.get(interfaceC62242sP.BF8(obj));
            if (c5i42 == null) {
                if (C18U.A06(C06090Tz.A05, this.A0L, 36329341650485535L)) {
                    C0f5 AEp = C18950wb.A01.AEp("UNMATCHED_SPONSORED_INVALIDATED_CONTENT", 817903741);
                    AEp.ABW(AbstractC43591JPw.A00(1179), interfaceC62242sP.BF8(obj));
                    AEp.report();
                }
            }
            c5i42.getClass();
            C5I5 C03 = c5i42.C03();
            C5I5 c5i5 = C5I5.A04;
            if (C03 == C5I5.A07) {
                c5i42.Eek(c5i5);
            }
            this.A0V.D9r(obj);
        }
        return new C101484hA(collection2, collection3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x021c, code lost:
    
        if (r6.A02.isEmpty() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r3.hasNext() == true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        r10 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.LinkedList A02(boolean r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32S.A02(boolean, boolean, boolean):java.util.LinkedList");
    }

    private void A03() {
        C26281Pj c26281Pj = this.A0O;
        if (this.A0h && c26281Pj != null && !this.A0J) {
            List AGp = this.A0U.AGp();
            C14360o3.A0B(AGp, 0);
            List list = c26281Pj.A01;
            list.clear();
            AnonymousClass016.A16(AGp, list);
        }
    }

    private void A04() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A0Y.A03().iterator();
        while (it.hasNext()) {
            Object BUM = ((InterfaceC42381xS) it.next()).BUM();
            this.A0S.A9u(BUM);
            InterfaceC62242sP interfaceC62242sP = this.A0R;
            C5I4 AMc = interfaceC62242sP.AMc(BUM);
            AMc.Eek(C5I5.A05);
            this.A0b.put(interfaceC62242sP.BF8(BUM), AMc);
            arrayList.add(BUM);
        }
        if (!arrayList.isEmpty()) {
            A09(arrayList);
        }
    }

    private void A05() {
        C1PY c1py = this.A0Y;
        if (c1py.A05) {
            LinkedList linkedList = c1py.A02;
            linkedList.clear();
            LinkedList linkedList2 = c1py.A03;
            linkedList.addAll(linkedList2);
            linkedList2.clear();
        }
        for (InterfaceC42381xS interfaceC42381xS : c1py.A03()) {
            Map map = this.A0b;
            InterfaceC62242sP interfaceC62242sP = this.A0R;
            Object BUM = interfaceC42381xS.BUM();
            if (!map.containsKey(interfaceC62242sP.BF8(BUM))) {
                map.put(interfaceC62242sP.BF8(BUM), interfaceC62242sP.AMc(BUM));
                this.A0S.A9u(BUM);
            }
        }
    }

    public static void A06(C32S c32s, boolean z) {
        if (c32s.A0k || z) {
            C1PZ AGn = c32s.A0Z.AGn(c32s.A0U.BZU());
            for (InterfaceC42381xS interfaceC42381xS : c32s.A0Y.A04()) {
                c32s.A0X.Cit(interfaceC42381xS, AGn, null);
                c32s.A0b.remove(c32s.A0R.BF8(interfaceC42381xS.BUM()));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (java.lang.System.currentTimeMillis() <= r15) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A07(X.C32S r21, boolean r22) {
        /*
            r10 = r21
            boolean r0 = r10.A18
            if (r0 != 0) goto L95
            boolean r0 = r10.A17
            if (r0 == 0) goto Lc4
            r20 = -9223372036854775808
        Lc:
            boolean r0 = r10.A17
            if (r0 == 0) goto L92
            long r18 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            int r0 = r10.A0o
            long r0 = (long) r0
            long r0 = r2.toMillis(r0)
            long r18 = r18 - r0
        L1f:
            X.31d r0 = r10.A0U
            java.util.List r1 = r0.BZU()
            X.31g r0 = r10.A0Z
            X.1PZ r9 = r0.AGn(r1)
            X.1PY r8 = r10.A0Y
            java.util.LinkedList r7 = r8.A02
            int r5 = r7.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r17 = r7.iterator()
        L3c:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r11 = r17.next()
            X.1xS r11 = (X.InterfaceC42381xS) r11
            long r15 = r11.B3I()
            r13 = 0
            r3 = 1
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 <= 0) goto L5c
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            r12 = 1
            if (r0 > 0) goto L5d
        L5c:
            r12 = 0
        L5d:
            java.lang.Integer r0 = r11.Byg()
            int r1 = r0.intValue()
            if (r1 == r3) goto L8b
            r0 = 2
            if (r1 != r0) goto L3c
            long r3 = r11.Ask()
            r1 = r18
        L70:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L7a
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 > 0) goto L3c
            if (r12 == 0) goto L3c
        L7a:
            X.31E r1 = r10.A0X
            r0 = 0
            r1.Cit(r11, r9, r0)
            java.lang.Object r0 = r11.BUM()
            r6.add(r0)
            r17.remove()
            goto L3c
        L8b:
            long r3 = r11.Ask()
            r1 = r20
            goto L70
        L92:
            r18 = -9223372036854775808
            goto L1f
        L95:
            long r20 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            int r0 = r10.A0p
            long r0 = (long) r0
            long r0 = r2.toMillis(r0)
            long r20 = r20 - r0
            goto Lc
        La6:
            int r2 = r7.size()
            if (r22 == 0) goto Lc4
            if (r2 >= r5) goto Lc4
            java.util.List r0 = r8.A00
            java.util.Iterator r1 = r0.iterator()
        Lb4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc4
            java.lang.Object r0 = r1.next()
            X.4iC r0 = (X.InterfaceC101974iC) r0
            r0.DZa(r5, r2)
            goto Lb4
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32S.A07(X.32S, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[Catch: all -> 0x00e9, TryCatch #0 {all -> 0x00e9, blocks: (B:3:0x0006, B:5:0x0012, B:7:0x0018, B:9:0x001c, B:11:0x0020, B:13:0x002b, B:15:0x002f, B:16:0x0036, B:18:0x003a, B:19:0x0041, B:21:0x0045, B:23:0x0050, B:27:0x007d, B:28:0x0086, B:31:0x008e, B:33:0x00a2, B:37:0x00ac, B:38:0x00af, B:39:0x00d2, B:40:0x00b2, B:41:0x00b6, B:42:0x00bc, B:44:0x00c2, B:46:0x0076, B:47:0x0059, B:49:0x005f, B:51:0x0065, B:52:0x00d6, B:54:0x00da, B:55:0x00e0), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2 A[Catch: all -> 0x00e9, TryCatch #0 {all -> 0x00e9, blocks: (B:3:0x0006, B:5:0x0012, B:7:0x0018, B:9:0x001c, B:11:0x0020, B:13:0x002b, B:15:0x002f, B:16:0x0036, B:18:0x003a, B:19:0x0041, B:21:0x0045, B:23:0x0050, B:27:0x007d, B:28:0x0086, B:31:0x008e, B:33:0x00a2, B:37:0x00ac, B:38:0x00af, B:39:0x00d2, B:40:0x00b2, B:41:0x00b6, B:42:0x00bc, B:44:0x00c2, B:46:0x0076, B:47:0x0059, B:49:0x005f, B:51:0x0065, B:52:0x00d6, B:54:0x00da, B:55:0x00e0), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2 A[Catch: all -> 0x00e9, LOOP:0: B:42:0x00bc->B:44:0x00c2, LOOP_END, TryCatch #0 {all -> 0x00e9, blocks: (B:3:0x0006, B:5:0x0012, B:7:0x0018, B:9:0x001c, B:11:0x0020, B:13:0x002b, B:15:0x002f, B:16:0x0036, B:18:0x003a, B:19:0x0041, B:21:0x0045, B:23:0x0050, B:27:0x007d, B:28:0x0086, B:31:0x008e, B:33:0x00a2, B:37:0x00ac, B:38:0x00af, B:39:0x00d2, B:40:0x00b2, B:41:0x00b6, B:42:0x00bc, B:44:0x00c2, B:46:0x0076, B:47:0x0059, B:49:0x005f, B:51:0x0065, B:52:0x00d6, B:54:0x00da, B:55:0x00e0), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(X.InterfaceC42381xS r9, X.C1PZ r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32S.A08(X.1xS, X.1PZ):void");
    }

    private void A09(Collection collection) {
        C13080lu A00 = AbstractC13090lv.A00("SponsoredContentController.processValidatedContent");
        try {
            Iterator it = this.A0g.iterator();
            while (it.hasNext()) {
                ((C32O) it.next()).DyU(collection, this.A0T.BX5());
            }
            if (this.A0l && this.A0k && this.A07) {
                AnonymousClass328 anonymousClass328 = this.A0r;
                InterfaceC671231d interfaceC671231d = this.A0U;
                C31E c31e = this.A0X;
                C1PY c1py = this.A0Y;
                InterfaceC671531g interfaceC671531g = this.A0Z;
                InterfaceC669530m interfaceC669530m = this.A0T;
                Map map = this.A0b;
                InterfaceC62242sP interfaceC62242sP = this.A0R;
                boolean z = this.A1D;
                int i = this.A0n;
                boolean z2 = false;
                if (interfaceC669530m.Bg5() == -1) {
                    z2 = true;
                }
                boolean z3 = this.A12;
                boolean z4 = this.A13;
                UserSession userSession = this.A0L;
                C14360o3.A0B(interfaceC671231d, 0);
                C14360o3.A0B(c31e, 1);
                C14360o3.A0B(c1py, 2);
                C14360o3.A0B(interfaceC671531g, 3);
                C14360o3.A0B(map, 5);
                C14360o3.A0B(interfaceC62242sP, 6);
                if (z2) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = c1py.A04().iterator();
                    while (it2.hasNext()) {
                        Object BUM = ((InterfaceC42381xS) it2.next()).BUM();
                        if (AnonymousClass328.A00(userSession, interfaceC62242sP, BUM)) {
                            if (z) {
                                interfaceC671231d.E6t(BUM);
                            }
                            if (!z3) {
                                interfaceC671231d.AHZ(BUM);
                            }
                            arrayList.add(BUM);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        c1py.A06(C05F.A0C, C05F.A00, C15500q5.A00(arrayList), 0);
                        interfaceC669530m.Cnx(true);
                    }
                } else {
                    anonymousClass328.A01(userSession, interfaceC62242sP, interfaceC669530m, interfaceC671231d, c31e, c1py, interfaceC671531g, map, i, z, z3, z4);
                }
            } else {
                this.A0Z.Ct4(this.A00);
            }
            C1PC c1pc = this.A0P;
            C1PH c1ph = this.A0M;
            if (this.A16 && c1ph != null && c1pc != null && this.A1C) {
                c1ph.A07(c1pc, this.A0r.A02(this.A0L, this.A0R, this.A0U, this.A0b));
            }
            A00.close();
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0050. Please report as an issue. */
    private boolean A0A(InterfaceC42381xS interfaceC42381xS, C1PZ c1pz) {
        C5I4 c5i4;
        C13080lu A00 = AbstractC13090lv.A00("SponsoredContentController.insertItem");
        try {
            int i = c1pz.A03;
            Object BUM = interfaceC42381xS.BUM();
            InterfaceC62242sP interfaceC62242sP = this.A0R;
            String BF8 = interfaceC62242sP.BF8(BUM);
            Map map = this.A0b;
            if (!map.containsKey(BF8)) {
                C0w9.A03("SponsoredContentController::Delivery", AnonymousClass001.A0g("Attempting to insert an item: ", BF8, " that hasn't been processed through delivery pipeline."));
                c5i4 = interfaceC62242sP.AMc(BUM);
                map.put(BF8, interfaceC62242sP.AMc(BUM));
            } else {
                c5i4 = (C5I4) map.get(BF8);
            }
            int intValue = this.A0U.COV(interfaceC42381xS, c1pz, i).intValue();
            boolean z = true;
            if (intValue != 0) {
                z = false;
                if (intValue != 5) {
                    C32K c32k = this.A0W;
                    EnumC72351Xbn enumC72351Xbn = EnumC72351Xbn.A02;
                    switch (intValue) {
                        case 1:
                            enumC72351Xbn = EnumC72351Xbn.A0A;
                            c32k.AWR(enumC72351Xbn, c1pz, BUM);
                            c5i4.getClass();
                            c5i4.Eek(C5I5.A04);
                            this.A0V.D9r(BUM);
                            break;
                        case 2:
                            enumC72351Xbn = EnumC72351Xbn.A0C;
                            c32k.AWR(enumC72351Xbn, c1pz, BUM);
                            c5i4.getClass();
                            c5i4.Eek(C5I5.A04);
                            this.A0V.D9r(BUM);
                            break;
                        case 3:
                            enumC72351Xbn = EnumC72351Xbn.A09;
                            c32k.AWR(enumC72351Xbn, c1pz, BUM);
                            c5i4.getClass();
                            c5i4.Eek(C5I5.A04);
                            this.A0V.D9r(BUM);
                            break;
                        case 4:
                            enumC72351Xbn = EnumC72351Xbn.A08;
                            c32k.AWR(enumC72351Xbn, c1pz, BUM);
                            c5i4.getClass();
                            c5i4.Eek(C5I5.A04);
                            this.A0V.D9r(BUM);
                            break;
                        case 5:
                        default:
                            throw new RuntimeException();
                        case 6:
                            c32k.AWR(enumC72351Xbn, c1pz, BUM);
                            c5i4.getClass();
                            c5i4.Eek(C5I5.A04);
                            this.A0V.D9r(BUM);
                            break;
                        case 7:
                            enumC72351Xbn = EnumC72351Xbn.A0B;
                            c32k.AWR(enumC72351Xbn, c1pz, BUM);
                            c5i4.getClass();
                            c5i4.Eek(C5I5.A04);
                            this.A0V.D9r(BUM);
                            break;
                        case 8:
                            enumC72351Xbn = EnumC72351Xbn.A06;
                            c32k.AWR(enumC72351Xbn, c1pz, BUM);
                            c5i4.getClass();
                            c5i4.Eek(C5I5.A04);
                            this.A0V.D9r(BUM);
                            break;
                        case 9:
                            enumC72351Xbn = EnumC72351Xbn.A0D;
                            c32k.AWR(enumC72351Xbn, c1pz, BUM);
                            c5i4.getClass();
                            c5i4.Eek(C5I5.A04);
                            this.A0V.D9r(BUM);
                            break;
                        case 10:
                            enumC72351Xbn = EnumC72351Xbn.A0E;
                            c32k.AWR(enumC72351Xbn, c1pz, BUM);
                            c5i4.getClass();
                            c5i4.Eek(C5I5.A04);
                            this.A0V.D9r(BUM);
                            break;
                        case 11:
                            enumC72351Xbn = EnumC72351Xbn.A03;
                            c32k.AWR(enumC72351Xbn, c1pz, BUM);
                            c5i4.getClass();
                            c5i4.Eek(C5I5.A04);
                            this.A0V.D9r(BUM);
                            break;
                    }
                } else {
                    this.A0Y.A06(interfaceC42381xS.Byg(), interfaceC42381xS.BeP(), Collections.singleton(BUM), interfaceC42381xS.BoB());
                    this.A0Z.EKX();
                }
            } else {
                C3Z9 BuQ = this.A0S.BuQ();
                C14360o3.A0B(c5i4, 0);
                BuQ.A02.put("Is ad pod", String.valueOf(!C14360o3.A0K(c5i4.AZM(), "")));
                W5F w5f = BuQ.A00;
                if (w5f != null) {
                    w5f.A01();
                }
                A03();
                c5i4.Eek(C5I5.A03);
                c5i4.EWD(System.currentTimeMillis());
                c5i4.EWC(i);
                if (this.A06) {
                    this.A0d.add(BUM);
                }
            }
            A00.close();
            C3Z9 BuQ2 = this.A0S.BuQ();
            String BF82 = interfaceC62242sP.BF8(BUM);
            C14360o3.A0B(BF82, 0);
            BuQ2.A04.remove(BF82);
            W5F w5f2 = BuQ2.A00;
            if (w5f2 != null) {
                w5f2.A01();
            }
            if (z) {
                A08(interfaceC42381xS, c1pz);
            }
            return z;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0137, code lost:
    
        if (r30.A1A != false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B() {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32S.A0B():void");
    }

    public final void A0C(int i) {
        int max = Math.max(i, this.A00);
        this.A00 = max;
        this.A0G = i;
        this.A0Z.CtD(max);
    }

    public final void A0D(int i, int i2) {
        C13080lu A00 = AbstractC13090lv.A00("SponsoredContentController.onCurrentIndexChanged");
        try {
            this.A0T.D7a(i, i2);
            A00.close();
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC669830p
    public final int AuR() {
        return this.A00;
    }

    @Override // X.InterfaceC670130s
    public final Map Bkt() {
        return Collections.unmodifiableMap(this.A0b);
    }

    @Override // X.InterfaceC669830p
    public final void CtS() {
        this.A0Z.Ct4(this.A00);
    }

    @Override // X.InterfaceC670130s
    public final void CtX(int i) {
        if (this.A06) {
            this.A0c.clear();
            if (this.A14) {
                A02(false, true, true);
            }
            this.A01 = this.A0F;
            C32E c32e = this.A0N;
            Map map = this.A0b;
            java.util.Set set = this.A0d;
            InterfaceC671231d interfaceC671231d = this.A0U;
            InterfaceC62242sP interfaceC62242sP = this.A0R;
            if (c32e instanceof C32G) {
                C32G c32g = (C32G) c32e;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(set, 1);
                C14360o3.A0B(interfaceC671231d, 2);
                C14360o3.A0B(interfaceC62242sP, 3);
                set.clear();
                c32g.A00 = null;
                InterfaceC42381xS Cpq = interfaceC671231d.Cpq();
                if (Cpq != null) {
                    Object BUM = Cpq.BUM();
                    if (C32E.A01(interfaceC62242sP.BF8(BUM), map)) {
                        c32g.A00 = BUM;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC670130s
    public final void D7Y() {
        C13080lu A00 = AbstractC13090lv.A00("SponsoredContentController.onContentDeliveredExternally");
        try {
            A02(true, false, false);
            A04();
            A00.close();
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC673031v
    public final void D7f(Object obj) {
        InterfaceC62242sP interfaceC62242sP = this.A0R;
        String BFA = interfaceC62242sP.BFA(obj);
        this.A0f.add(BFA);
        if (interfaceC62242sP.CX8(obj)) {
            this.A0e.add(BFA);
            if (this.A06) {
                this.A0c.add(obj);
            }
        }
        if (interfaceC62242sP.CX7(obj) && this.A06) {
            this.A0c.add(obj);
        }
        Map map = this.A0b;
        C5I4 c5i4 = (C5I4) map.get(BFA);
        if (c5i4 != null) {
            c5i4.Eek(C5I5.A06);
            c5i4.EdQ(System.currentTimeMillis());
            this.A0X.CkN(c5i4.getId(), AbstractC114975Hn.A01(c5i4.BKD()));
            this.A0F = c5i4.BIC();
            C1PC c1pc = this.A0P;
            C1PH c1ph = this.A0M;
            if (this.A16 && c1ph != null && c1pc != null && this.A1C) {
                c1ph.A07(c1pc, this.A0r.A02(this.A0L, interfaceC62242sP, this.A0U, map));
            }
        }
    }

    @Override // X.InterfaceC669830p
    public final void DGn(C85633rs c85633rs) {
        this.A0X.CiH(c85633rs, this.A0Y.A03());
    }

    @Override // X.InterfaceC673031v
    public final void DKk(C1PZ c1pz) {
        InterfaceC42381xS F9D;
        if (c1pz.A0C == C05F.A01 && !this.A08 && (F9D = this.A0U.F9D()) != null && F9D.BUM() != null) {
            A0A(F9D, c1pz);
            this.A08 = true;
            A03();
        }
    }

    @Override // X.InterfaceC673031v
    public final void DM9(Integer num) {
        this.A0s.CND(num);
    }

    @Override // X.InterfaceC673031v
    public final boolean DMA(C1PZ c1pz) {
        InterfaceC671231d interfaceC671231d;
        Object BUP;
        C1PY c1py;
        String str = this.A0z;
        C14360o3.A0B(str, 0);
        c1pz.A0E = str;
        Integer num = C05F.A01;
        Integer num2 = c1pz.A0C;
        boolean z = true;
        if (num == num2) {
            A03();
            c1py = this.A0Y;
            InterfaceC42381xS A01 = c1py.A01();
            this.A0X.CkO(A01, c1py.A03());
            z = A0A(A01, c1pz);
        } else if (C05F.A00 == num2) {
            c1py = this.A0Y;
            InterfaceC42381xS A012 = c1py.A01();
            this.A0X.CkO(A012, c1py.A03());
            A08(A012, c1pz);
            C3Z9 BuQ = this.A0S.BuQ();
            String BF8 = this.A0R.BF8(A012.BUM());
            C14360o3.A0B(BF8, 0);
            BuQ.A04.remove(BF8);
            W5F w5f = BuQ.A00;
            if (w5f != null) {
                w5f.A01();
            }
        } else {
            if (C05F.A0Y == num2) {
                A03();
                InterfaceC671231d interfaceC671231d2 = this.A0U;
                int i = c1pz.A07;
                interfaceC671231d2.E6u(c1pz.A0F, c1pz.A00(), i, i - c1pz.A03, c1pz.A02, c1pz.A06);
                A03();
                return true;
            }
            if (C05F.A0j == num2) {
                C1PY c1py2 = this.A0Y;
                InterfaceC42381xS A013 = c1py2.A01();
                this.A0X.CkO(A013, c1py2.A03());
                z = A0A(A013, c1pz);
                this.A0T.Dtv(c1py2.A02.size());
                if (z && (BUP = (interfaceC671231d = this.A0U).BUP(c1pz.A03 + 1)) != null && interfaceC671231d.F9C(BUP, AbstractC111324zv.A00(686), new J6V(this, A013))) {
                    this.A0W.AWR(EnumC72351Xbn.A0F, c1pz, BUP);
                    return z;
                }
            }
            return z;
        }
        this.A0T.Dtv(c1py.A02.size());
        return z;
    }

    @Override // X.InterfaceC673031v
    public final void Dgp() {
        this.A0s.Dgp();
    }

    @Override // X.InterfaceC670130s
    public final C101484hA DnX(Integer num, List list) {
        return DnY(num, C05F.A00, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0382, code lost:
    
        if (r8 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x025a, code lost:
    
        if (r0.size() >= 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x026e, code lost:
    
        if (r8.AZN(r12.BUM()) != 1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0273, code lost:
    
        r12 = r12.BUM();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x027f, code lost:
    
        if (X.C32E.A01(r8.BF8(r12), r9) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0281, code lost:
    
        if (r13 != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0283, code lost:
    
        if (r14 == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0285, code lost:
    
        r7.A02(r6, r8, r0, r0, r0, r12, r9);
        r29 = "pool_replacement_and_injected_item_removal";
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0271, code lost:
    
        if (r12 != null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02fb, code lost:
    
        if (r6.A01 == java.lang.Boolean.TRUE) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d4 A[Catch: all -> 0x0388, TryCatch #0 {all -> 0x0388, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x0010, B:9:0x0014, B:11:0x001c, B:15:0x0025, B:17:0x0030, B:18:0x0036, B:20:0x003c, B:22:0x0040, B:25:0x0048, B:27:0x0052, B:29:0x0056, B:30:0x0060, B:31:0x0069, B:33:0x007f, B:36:0x0088, B:37:0x0090, B:38:0x0094, B:40:0x009a, B:42:0x00ac, B:43:0x00b7, B:45:0x00bd, B:56:0x00c3, B:58:0x00c9, B:59:0x00d0, B:61:0x00d8, B:48:0x00dd, B:51:0x00e3, B:64:0x00ef, B:65:0x00ff, B:67:0x0105, B:69:0x0111, B:71:0x0125, B:72:0x0114, B:74:0x011a, B:76:0x0120, B:78:0x012b, B:82:0x012e, B:85:0x013e, B:88:0x0144, B:91:0x014d, B:92:0x0153, B:94:0x0159, B:96:0x015e, B:97:0x016a, B:99:0x019c, B:101:0x01c8, B:103:0x01cc, B:105:0x01d4, B:107:0x01da, B:108:0x01de, B:110:0x01e4, B:113:0x01f6, B:116:0x01fc, B:120:0x0204, B:121:0x0208, B:123:0x020c, B:124:0x0214, B:127:0x02b5, B:129:0x02bd, B:131:0x02c7, B:132:0x02ca, B:134:0x02d4, B:141:0x0225, B:143:0x0235, B:144:0x023b, B:146:0x0241, B:149:0x0255, B:151:0x025d, B:154:0x0265, B:156:0x0273, B:160:0x0285, B:161:0x02a2, B:175:0x02dd, B:178:0x02ea, B:180:0x02f6, B:182:0x02fe, B:184:0x0309, B:188:0x032b, B:191:0x0335, B:193:0x031b, B:199:0x0338, B:200:0x033e, B:202:0x0349, B:204:0x0356, B:206:0x0362, B:208:0x0366, B:211:0x036f, B:213:0x0373, B:216:0x037c), top: B:2:0x0006 }] */
    @Override // X.InterfaceC670130s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C101484hA DnY(java.lang.Integer r37, java.lang.Integer r38, java.util.List r39) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32S.DnY(java.lang.Integer, java.lang.Integer, java.util.List):X.4hA");
    }

    @Override // X.InterfaceC669830p
    public final void DrF(String str) {
        this.A0Z.DrF(str);
    }

    @Override // X.InterfaceC669830p
    public final void DrH() {
        this.A0Z.ECx();
        C31E c31e = this.A0X;
        c31e.DrI(A00());
        this.A09 = -1;
        this.A0B = 0;
        this.A0A = 0;
        this.A0D = 0;
        this.A0C = 0;
        this.A0E = -1;
        this.A0F = -1;
        this.A02 = -1;
        this.A0f.clear();
        this.A0e.clear();
        this.A01 = -1;
        if (this.A1F || this.A0I) {
            this.A0U.DrH();
            this.A0b.clear();
            if (this.A1E) {
                A06(this, false);
            } else {
                A04();
            }
        }
        if (this.A1B) {
            this.A00 = 0;
            this.A0G = 0;
        }
        String obj = UUID.randomUUID().toString();
        this.A05 = obj;
        c31e.ERS(obj);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(887526375);
        C1PC c1pc = this.A0P;
        C1PH c1ph = this.A0M;
        if (this.A16 && c1ph != null && c1pc != null) {
            AnonymousClass328 anonymousClass328 = this.A0r;
            InterfaceC671231d interfaceC671231d = this.A0U;
            Map map = this.A0b;
            c1ph.A07(c1pc, anonymousClass328.A02(this.A0L, this.A0R, interfaceC671231d, map));
        }
        C0f9.A0A(-579830870, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(346714357, C0f9.A03(-1673653492));
    }

    public C32S(UserSession userSession, C13920nI c13920nI, C31T c31t, C61672rU c61672rU, C1AV c1av, C1PH c1ph, AnonymousClass328 anonymousClass328, C32E c32e, AnonymousClass315 anonymousClass315, C1PC c1pc, InterfaceC670931a interfaceC670931a, AnonymousClass320 anonymousClass320, InterfaceC62242sP interfaceC62242sP, InterfaceC671731i interfaceC671731i, InterfaceC669530m interfaceC669530m, InterfaceC671231d interfaceC671231d, C32D c32d, C32K c32k, C31E c31e, C1PY c1py, C3HZ c3hz, InterfaceC671531g interfaceC671531g, AnonymousClass322 anonymousClass322, InterfaceC61522rF interfaceC61522rF, C672131m c672131m, InterfaceC673231x interfaceC673231x, String str, List list, java.util.Set set, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26) {
        C26281Pj c26281Pj;
        java.util.Set set2 = set;
        InterfaceC671731i interfaceC671731i2 = interfaceC671731i;
        ArrayList arrayList = new ArrayList();
        this.A11 = arrayList;
        this.A05 = UUID.randomUUID().toString();
        this.A0d = new HashSet();
        this.A0c = new HashSet();
        this.A01 = -1;
        this.A0M = c1ph;
        this.A15 = z11;
        this.A0P = c1pc;
        this.A16 = z6;
        this.A1C = z8;
        this.A0q = c13920nI;
        this.A18 = z3;
        this.A0p = i;
        this.A17 = z4;
        this.A0o = i3;
        this.A0w = interfaceC61522rF;
        this.A0U = interfaceC671231d;
        this.A0W = c32k;
        this.A0r = anonymousClass328;
        this.A0X = c31e;
        this.A0T = interfaceC669530m;
        this.A0R = interfaceC62242sP;
        this.A0Y = c1py;
        this.A0Q = anonymousClass320;
        this.A0Z = interfaceC671531g;
        this.A0v = anonymousClass322;
        this.A12 = z14;
        this.A13 = z15;
        this.A0L = userSession;
        this.A0I = z18;
        this.A0z = str;
        interfaceC671731i2 = interfaceC671731i == null ? new C671631h() : interfaceC671731i2;
        this.A0S = interfaceC671731i2;
        this.A0s = anonymousClass315;
        interfaceC671531g.EPQ(interfaceC671731i2);
        this.A0S.EPG(this);
        c31e.ERS(this.A05);
        c31e.ETt(anonymousClass320.A02);
        this.A0N = c32e;
        this.A0m = z21;
        this.A0j = z23;
        this.A0i = z24;
        this.A14 = z26;
        A07(this, false);
        boolean A7S = interfaceC669530m.A7S(anonymousClass320, this, this);
        this.A0k = A7S;
        this.A1G = z;
        interfaceC671531g.A7z(this);
        interfaceC671531g.EKY(anonymousClass322.Bow());
        InterfaceC673231x AMN = interfaceC671531g.AMN();
        this.A0x = AMN;
        interfaceC61522rF.A8m(AMN);
        this.A0g = set == null ? new HashSet() : set2;
        this.A0a = c672131m;
        this.A0t = interfaceC670931a;
        long currentTimeMillis = System.currentTimeMillis();
        this.A0K = currentTimeMillis;
        Long valueOf = Long.valueOf(currentTimeMillis);
        C1PC c1pc2 = this.A0P;
        C1PH c1ph2 = this.A0M;
        if (c1ph2 != null && c1pc2 != null && this.A0k) {
            c1ph2.A02(this.A04, c1pc2).A0N = valueOf;
        }
        this.A0H = c31t;
        if (c31t != null) {
            c31t.A04 = this;
        }
        this.A0h = z13;
        this.A0J = z17;
        if (z13 && c1pc != null) {
            c26281Pj = C26271Pi.A02.A00(c1pc);
        } else {
            c26281Pj = null;
        }
        this.A0O = c26281Pj;
        if (z12 && !c1py.A02.isEmpty() && c1pc != null && c1ph != null) {
            C26191Pa A04 = c1ph.A04(c1pc);
            if (C39528Hcv.A02.A00(A04.A0A, this, A04.A0B)) {
                InterfaceC42381xS A00 = c1py.A00();
                EnumC26291Pk BYX = interfaceC62242sP.BYX(A00.BUM());
                if (this.A0O != null && BYX != null && A00.CVy()) {
                    Integer num = C05F.A01;
                    C1PZ c1pz = new C1PZ(num);
                    c1pz.A03 = 0;
                    c1pz.A02 = 0;
                    c1pz.A0C = num;
                    DMA(c1pz);
                }
            }
        }
        this.A0V = c32d;
        if (A7S) {
            if (z16) {
                this.A00 = this.A0Q.A01;
            }
            if (!z2) {
                A04();
            } else {
                ArrayList arrayList2 = new ArrayList();
                Integer num2 = C05F.A0Y;
                Integer num3 = C05F.A00;
                for (InterfaceC42381xS interfaceC42381xS : this.A0Y.A04()) {
                    Object BUM = interfaceC42381xS.BUM();
                    num2 = interfaceC42381xS.Byg();
                    num3 = interfaceC42381xS.BeP();
                    arrayList2.add(BUM);
                    Map map = this.A0b;
                    InterfaceC62242sP interfaceC62242sP2 = this.A0R;
                    map.put(interfaceC62242sP2.BF8(BUM), interfaceC62242sP2.AMc(BUM));
                }
                Collection collection = A01(num2, num3, arrayList2, false).A01;
                if (!collection.isEmpty()) {
                    A09(collection);
                }
            }
        }
        this.A0y = interfaceC673231x;
        interfaceC61522rF.A8m(interfaceC673231x);
        this.A10 = list;
        this.A0n = i2;
        this.A1D = z5;
        this.A1B = z7;
        if (z6) {
            C218914p.A08.A0B(this);
        }
        this.A1A = z9;
        this.A0l = z10;
        this.A04 = c1av;
        this.A0u = c3hz;
        if (c3hz != null) {
            arrayList.add(interfaceC671531g.AND());
            arrayList.add(interfaceC669530m.AND());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C51G) it.next()).EDk(c3hz);
            }
        }
        this.A03 = c61672rU;
        this.A1F = z19;
        this.A06 = z20;
        this.A19 = z22;
        this.A1E = z25;
    }
}
