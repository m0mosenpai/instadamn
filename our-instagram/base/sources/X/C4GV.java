package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.4GV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4GV {
    public static final Comparator A0Q = new Comparator() { // from class: X.4GW
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            long j;
            long j2;
            C83403nh c83403nh = (C83403nh) obj;
            C83403nh c83403nh2 = (C83403nh) obj2;
            long A0D = c83403nh.A0D();
            if (c83403nh.A1P != null) {
                j = c83403nh.C8i();
            } else {
                j = 0;
            }
            long A0D2 = c83403nh2.A0D();
            if (c83403nh2.A1P != null) {
                j2 = c83403nh2.C8i();
            } else {
                j2 = 0;
            }
            if (A0D != A0D2) {
                return (A0D > A0D2 ? 1 : (A0D == A0D2 ? 0 : -1));
            }
            return (j > j2 ? 1 : (j == j2 ? 0 : -1));
        }
    };
    public Boolean A00;
    public final InterfaceC28041Xi A01;
    public final InterfaceC28041Xi A02;
    public final InterfaceC28041Xi A03;
    public final InterfaceC28041Xi A04;
    public final InterfaceC28041Xi A05;
    public final InterfaceC28041Xi A06;
    public final InterfaceC28041Xi A07;
    public final InterfaceC28041Xi A08;
    public final InterfaceC28041Xi A09;
    public final InterfaceC28041Xi A0A;
    public final InterfaceC28041Xi A0B;
    public final InterfaceC28041Xi A0C;
    public final InterfaceC28041Xi A0D;
    public final InterfaceC28041Xi A0E;
    public final InterfaceC28041Xi A0F;
    public final InterfaceC28041Xi A0G;
    public final UserSession A0H;
    public final C81663kb A0I;
    public final C93384Gr A0J;
    public final List A0K;
    public final List A0L;
    public final InterfaceC28041Xi A0M;
    public final InterfaceC28041Xi A0N;
    public final InterfaceC28041Xi A0O;
    public final InterfaceC28041Xi A0P;

    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2 A[Catch: all -> 0x013e, TryCatch #1 {, blocks: (B:9:0x005d, B:11:0x0080, B:12:0x0082, B:14:0x0086, B:15:0x009b, B:18:0x00a9, B:19:0x00ab, B:21:0x00c2, B:22:0x00c6, B:24:0x00eb, B:25:0x00ed, B:27:0x00f1, B:28:0x0106, B:31:0x0114, B:32:0x0116, B:36:0x010b, B:38:0x00f6, B:40:0x00fb, B:41:0x00a0, B:43:0x008b, B:45:0x0090, B:50:0x013d, B:4:0x0001, B:6:0x001b, B:8:0x0021, B:46:0x003e, B:48:0x0044), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00eb A[Catch: all -> 0x013e, TryCatch #1 {, blocks: (B:9:0x005d, B:11:0x0080, B:12:0x0082, B:14:0x0086, B:15:0x009b, B:18:0x00a9, B:19:0x00ab, B:21:0x00c2, B:22:0x00c6, B:24:0x00eb, B:25:0x00ed, B:27:0x00f1, B:28:0x0106, B:31:0x0114, B:32:0x0116, B:36:0x010b, B:38:0x00f6, B:40:0x00fb, B:41:0x00a0, B:43:0x008b, B:45:0x0090, B:50:0x013d, B:4:0x0001, B:6:0x001b, B:8:0x0021, B:46:0x003e, B:48:0x0044), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1 A[Catch: all -> 0x013e, TryCatch #1 {, blocks: (B:9:0x005d, B:11:0x0080, B:12:0x0082, B:14:0x0086, B:15:0x009b, B:18:0x00a9, B:19:0x00ab, B:21:0x00c2, B:22:0x00c6, B:24:0x00eb, B:25:0x00ed, B:27:0x00f1, B:28:0x0106, B:31:0x0114, B:32:0x0116, B:36:0x010b, B:38:0x00f6, B:40:0x00fb, B:41:0x00a0, B:43:0x008b, B:45:0x0090, B:50:0x013d, B:4:0x0001, B:6:0x001b, B:8:0x0021, B:46:0x003e, B:48:0x0044), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b A[Catch: all -> 0x013e, TryCatch #1 {, blocks: (B:9:0x005d, B:11:0x0080, B:12:0x0082, B:14:0x0086, B:15:0x009b, B:18:0x00a9, B:19:0x00ab, B:21:0x00c2, B:22:0x00c6, B:24:0x00eb, B:25:0x00ed, B:27:0x00f1, B:28:0x0106, B:31:0x0114, B:32:0x0116, B:36:0x010b, B:38:0x00f6, B:40:0x00fb, B:41:0x00a0, B:43:0x008b, B:45:0x0090, B:50:0x013d, B:4:0x0001, B:6:0x001b, B:8:0x0021, B:46:0x003e, B:48:0x0044), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0 A[Catch: all -> 0x013e, TryCatch #1 {, blocks: (B:9:0x005d, B:11:0x0080, B:12:0x0082, B:14:0x0086, B:15:0x009b, B:18:0x00a9, B:19:0x00ab, B:21:0x00c2, B:22:0x00c6, B:24:0x00eb, B:25:0x00ed, B:27:0x00f1, B:28:0x0106, B:31:0x0114, B:32:0x0116, B:36:0x010b, B:38:0x00f6, B:40:0x00fb, B:41:0x00a0, B:43:0x008b, B:45:0x0090, B:50:0x013d, B:4:0x0001, B:6:0x001b, B:8:0x0021, B:46:0x003e, B:48:0x0044), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.util.ArrayList A02(X.C81663kb r12, X.C4GV r13, int r14) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4GV.A02(X.3kb, X.4GV, int):java.util.ArrayList");
    }

    public static ArrayList A03(List list, boolean z) {
        String A0h;
        Boolean bool;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C83403nh c83403nh = (C83403nh) it.next();
            if (c83403nh.A0h() == null) {
                A0h = c83403nh.A0g();
            } else {
                A0h = c83403nh.A0h();
            }
            if (z) {
                bool = false;
            } else {
                bool = null;
            }
            arrayList.add(new C9Q7(c83403nh.A10, bool, C05F.A00, A0h));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r2.compare(r4.A01, r1) <= 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A07(X.C4H4 r4, X.C83403nh r5, X.C81663kb r6, java.util.List r7) {
        /*
            monitor-enter(r6)
            r2 = 0
            X.C14360o3.A0B(r7, r2)     // Catch: java.lang.Throwable -> L50
            X.4Gx r0 = X.C93394Gs.A00     // Catch: java.lang.Throwable -> L50
            int r1 = X.C4H5.A02(r4, r0, r7)     // Catch: java.lang.Throwable -> L50
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L50
            if (r1 >= r0) goto L3b
            java.lang.Object r0 = r7.get(r1)     // Catch: java.lang.Throwable -> L50
            X.3nh r0 = (X.C83403nh) r0     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = r0.A0h()     // Catch: java.lang.Throwable -> L50
            X.2E0 r1 = r4.A00     // Catch: java.lang.Throwable -> L50
            java.util.Comparator r2 = r1.A02     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r4.A02     // Catch: java.lang.Throwable -> L50
            java.lang.Object r1 = r1.A01     // Catch: java.lang.Throwable -> L50
            int r0 = r2.compare(r0, r1)     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L32
            java.lang.Object r0 = r4.A01     // Catch: java.lang.Throwable -> L50
            int r1 = r2.compare(r0, r1)     // Catch: java.lang.Throwable -> L50
            r0 = 1
            if (r1 > 0) goto L33
        L32:
            r0 = 0
        L33:
            r0 = r0 ^ 1
            X.5oz r1 = new X.5oz     // Catch: java.lang.Throwable -> L50
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L50
            goto L41
        L3b:
            r0 = 0
            X.5oz r1 = new X.5oz     // Catch: java.lang.Throwable -> L50
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L50
        L41:
            java.lang.String r0 = r1.A00     // Catch: java.lang.Throwable -> L50
            r6.A0E(r0)     // Catch: java.lang.Throwable -> L50
            boolean r0 = r1.A01     // Catch: java.lang.Throwable -> L50
            r6.A0J(r0)     // Catch: java.lang.Throwable -> L50
            A06(r4, r5, r6)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            return
        L50:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4GV.A07(X.4H4, X.3nh, X.3kb, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r2.compare(r9.A02, r1) >= 0) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1 A[Catch: all -> 0x00f7, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x002d, B:11:0x0037, B:12:0x0045, B:14:0x0061, B:16:0x006e, B:18:0x0075, B:20:0x007b, B:24:0x0088, B:26:0x008e, B:27:0x00a1, B:29:0x00b1, B:31:0x00be, B:33:0x00c5, B:35:0x00cc, B:39:0x00d7, B:41:0x00dd, B:42:0x00f2, B:48:0x00e4, B:50:0x00ea, B:59:0x00f6, B:53:0x00ee, B:55:0x00f1, B:63:0x0095, B:65:0x009b, B:66:0x009d, B:69:0x00a0, B:58:0x00f5, B:71:0x003f, B:37:0x00d3, B:22:0x0082, B:54:0x00ef, B:68:0x009e), top: B:2:0x0001, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee A[Catch: all -> 0x00f7, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x002d, B:11:0x0037, B:12:0x0045, B:14:0x0061, B:16:0x006e, B:18:0x0075, B:20:0x007b, B:24:0x0088, B:26:0x008e, B:27:0x00a1, B:29:0x00b1, B:31:0x00be, B:33:0x00c5, B:35:0x00cc, B:39:0x00d7, B:41:0x00dd, B:42:0x00f2, B:48:0x00e4, B:50:0x00ea, B:59:0x00f6, B:53:0x00ee, B:55:0x00f1, B:63:0x0095, B:65:0x009b, B:66:0x009d, B:69:0x00a0, B:58:0x00f5, B:71:0x003f, B:37:0x00d3, B:22:0x0082, B:54:0x00ef, B:68:0x009e), top: B:2:0x0001, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A08(X.C4H4 r9, X.C81663kb r10, java.util.List r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4GV.A08(X.4H4, X.3kb, java.util.List):void");
    }

    public final synchronized int A0E(C80993jT c80993jT, int i) {
        java.util.Set hashSet;
        int i2;
        if (c80993jT == null) {
            i2 = Math.min(this.A0K.size(), i);
        } else {
            ArrayList arrayList = new ArrayList(this.A0K);
            int size = arrayList.size();
            UserSession userSession = this.A0H;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36320640046736162L)) {
                hashSet = AbstractC23021Ah.A00(userSession).A01.C2v(AbstractC43591JPw.A00(339));
            } else {
                hashSet = new HashSet();
            }
            i2 = 0;
            C83403nh c83403nh = null;
            for (int A00 = A00(c80993jT, this); A00 < size; A00++) {
                C83403nh c83403nh2 = (C83403nh) arrayList.get(A00);
                if (c83403nh2 == null) {
                    C0f5 AEp = C18950wb.A01.AEp("getUnseenMessageCount directMessage is null", 20134884);
                    AEp.ABU("index", A00);
                    AEp.ABU("messageListSize", size);
                    AEp.report();
                } else {
                    C08730cb c08730cb = C17060sy.A01;
                    if (c83403nh2.A1i(c08730cb.A01(userSession)) && ((c83403nh2.A10 != C2EY.A0q || c83403nh2.A1l(c08730cb.A01(userSession))) && (c83403nh == null || c83403nh.A0Q == null || c83403nh2.A0Q == null || !C2I7.A00(c83403nh.A1q, c83403nh2.A1q)))) {
                        if (!(c83403nh2.A0h() != null && hashSet.contains(c83403nh2.A0h()) && C18U.A06(c06090Tz, userSession, 36320640046736162L)) && (i2 = i2 + 1) >= i) {
                            break;
                        }
                        c83403nh = c83403nh2;
                    }
                }
            }
        }
        return i2;
    }

    public final synchronized C83403nh A0F(C83403nh c83403nh, boolean z) {
        return A0G(c83403nh, true, z);
    }

    public final synchronized C83403nh A0G(C83403nh c83403nh, boolean z, boolean z2) {
        C83403nh c83403nh2;
        C83403nh c83403nh3;
        Long A00;
        C83403nh c83403nh4;
        UserSession userSession = this.A0H;
        C1345366c A002 = AbstractC1345266b.A00(userSession);
        C81663kb c81663kb = this.A0I;
        if (A002.A02(c83403nh, c81663kb.BKb(), true)) {
            return c83403nh;
        }
        C83693oE c83693oE = null;
        if (c83403nh.A1Q()) {
            List list = this.A0K;
            Comparator comparator = C93394Gs.A01;
            C14360o3.A0B(list, 0);
            int binarySearch = Collections.binarySearch(list, c83403nh, comparator);
            if (binarySearch >= 0) {
                c83403nh2 = (C83403nh) list.remove(binarySearch);
            } else {
                c83403nh2 = null;
            }
        } else {
            c83403nh2 = null;
        }
        List list2 = this.A0L;
        Comparator comparator2 = C93394Gs.A01;
        C14360o3.A0B(list2, 0);
        int binarySearch2 = Collections.binarySearch(list2, c83403nh, comparator2);
        if (binarySearch2 >= 0) {
            c83403nh3 = (C83403nh) list2.remove(binarySearch2);
        } else {
            c83403nh3 = null;
        }
        List list3 = this.A0K;
        Comparator comparator3 = C93394Gs.A04;
        C14360o3.A0B(list3, 0);
        int binarySearch3 = Collections.binarySearch(list3, c83403nh, comparator3);
        if (binarySearch3 >= 0 && (c83403nh4 = (C83403nh) list3.remove(binarySearch3)) != null) {
            c83403nh2 = c83403nh4;
        } else if (c83403nh3 != null) {
            c83403nh2 = c83403nh3;
        } else if (c83403nh2 == null) {
            c83403nh2 = c83403nh;
        }
        if (c83403nh2 != c83403nh) {
            C83693oE A003 = AbstractC83823oR.A00(c81663kb.BKb());
            if (A003 != null) {
                c83693oE = AbstractC1345466e.A02(A003);
            }
            c83403nh2.A11(userSession, c83403nh, c83693oE);
        }
        String C7V = c81663kb.C7V();
        String A0h = c83403nh2.A0h();
        if (z2 && (C7V == null || C7V.compareTo(A0h) > 0)) {
            c81663kb.A0E(A0h);
        }
        int binarySearch4 = Collections.binarySearch(list3, c83403nh2, comparator3);
        if (binarySearch4 < 0) {
            binarySearch4 = (-binarySearch4) - 1;
        }
        list3.add(binarySearch4, c83403nh2);
        C14360o3.A0B(userSession, 0);
        if ((!C18U.A06(C06090Tz.A05, userSession, 36325592144229559L)) && (A00 = ((C116345On) userSession.A01(C116345On.class, new MHL(userSession, 11))).A00(c83403nh)) != null) {
            AbstractC106194qZ.A00(AbstractC12290kX.A00, userSession).A01(A00.longValue());
        }
        if (z && this.A0G.apply(c83403nh)) {
            A0A(this);
            if (C2EY.A0q.equals(c83403nh.A10)) {
                A0R();
                A0T();
            }
        }
        return c83403nh2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
    
        r3 = r6.A0K;
        r2 = r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (r4 >= r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        r1 = (X.C83403nh) r3.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if (r7 != r1.A10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (r8.equals(r1.A0g()) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0047, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.C83403nh A0H(X.C2EY r7, java.lang.String r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.List r5 = r6.A0L     // Catch: java.lang.Throwable -> L48
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L48
            r4 = 0
            r2 = 0
        L9:
            if (r2 >= r3) goto L23
            java.lang.Object r1 = r5.get(r2)     // Catch: java.lang.Throwable -> L48
            X.3nh r1 = (X.C83403nh) r1     // Catch: java.lang.Throwable -> L48
            X.2EY r0 = r1.A10     // Catch: java.lang.Throwable -> L48
            if (r7 != r0) goto L20
            java.lang.String r0 = r1.A0g()     // Catch: java.lang.Throwable -> L48
            boolean r0 = r8.equals(r0)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L20
            goto L43
        L20:
            int r2 = r2 + 1
            goto L9
        L23:
            java.util.List r3 = r6.A0K     // Catch: java.lang.Throwable -> L48
            int r2 = r3.size()     // Catch: java.lang.Throwable -> L48
        L29:
            if (r4 >= r2) goto L45
            java.lang.Object r1 = r3.get(r4)     // Catch: java.lang.Throwable -> L48
            X.3nh r1 = (X.C83403nh) r1     // Catch: java.lang.Throwable -> L48
            X.2EY r0 = r1.A10     // Catch: java.lang.Throwable -> L48
            if (r7 != r0) goto L40
            java.lang.String r0 = r1.A0g()     // Catch: java.lang.Throwable -> L48
            boolean r0 = r8.equals(r0)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L40
            goto L43
        L40:
            int r4 = r4 + 1
            goto L29
        L43:
            monitor-exit(r6)
            return r1
        L45:
            r0 = 0
            monitor-exit(r6)
            return r0
        L48:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4GV.A0H(X.2EY, java.lang.String):X.3nh");
    }

    public final synchronized C83403nh A0I(String str) {
        C83403nh c83403nh;
        C83403nh c83403nh2 = new C83403nh();
        c83403nh2.A1F(str);
        List list = this.A0K;
        int binarySearch = Collections.binarySearch(list, c83403nh2, C93394Gs.A04);
        if (binarySearch >= 0) {
            c83403nh = (C83403nh) list.get(binarySearch);
        } else {
            c83403nh = null;
        }
        return c83403nh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        r3 = r6.A0K;
        r2 = r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        if (r4 >= r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        r1 = (X.C83403nh) r3.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r7.equals(r1.A0g()) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.C83403nh A0J(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.List r5 = r6.A0L     // Catch: java.lang.Throwable -> L3e
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            r2 = 0
        L9:
            if (r2 >= r3) goto L1e
            java.lang.Object r1 = r5.get(r2)     // Catch: java.lang.Throwable -> L3e
            X.3nh r1 = (X.C83403nh) r1     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r1.A0g()     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L39
            int r2 = r2 + 1
            goto L9
        L1e:
            java.util.List r3 = r6.A0K     // Catch: java.lang.Throwable -> L3e
            int r2 = r3.size()     // Catch: java.lang.Throwable -> L3e
        L24:
            if (r4 >= r2) goto L3b
            java.lang.Object r1 = r3.get(r4)     // Catch: java.lang.Throwable -> L3e
            X.3nh r1 = (X.C83403nh) r1     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r1.A0g()     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L39
            int r4 = r4 + 1
            goto L24
        L39:
            monitor-exit(r6)
            return r1
        L3b:
            r0 = 0
            monitor-exit(r6)
            return r0
        L3e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4GV.A0J(java.lang.String):X.3nh");
    }

    public final synchronized C81543kP A0K() {
        C81543kP c81543kP;
        c81543kP = this.A0I.A01.A0t;
        if (c81543kP == null) {
            c81543kP = new C81543kP();
        }
        return c81543kP;
    }

    public final synchronized C2Io A0L(C81543kP c81543kP) {
        C81663kb c81663kb;
        int i;
        c81663kb = this.A0I;
        if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i2 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
                for (int i3 = 0; i3 < i; i3++) {
                    readLock.unlock();
                }
            } else {
                i = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                c81663kb.A01.A0t = c81543kP;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        } else {
            C80693iy c80693iy = c81663kb.A01;
            synchronized (c80693iy) {
                try {
                    c80693iy.A0t = c81543kP;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new C2Io(c81663kb.BKb(), C05F.A0H, null, null, null, false);
    }

    public final synchronized ArrayList A0M(boolean z) {
        ArrayList arrayList;
        arrayList = new ArrayList(new ArrayList(A04(this)));
        arrayList.addAll(new ArrayList(this.A0L));
        if (z) {
            Collections.sort(arrayList, A0Q);
        }
        return arrayList;
    }

    public final synchronized List A0N() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        UserSession userSession = this.A0H;
        String str = userSession.userId;
        C80993jT Av3 = this.A0I.Av3(str);
        if (Av3 != null) {
            ArrayList arrayList2 = new ArrayList(this.A0K);
            int size = arrayList2.size();
            for (int A00 = A00(Av3, this); A00 < size; A00++) {
                C83403nh c83403nh = (C83403nh) arrayList2.get(A00);
                if (c83403nh.A1i(C08730cb.A00(userSession).A00()) && ((c83403nh.A10 != C2EY.A0q || c83403nh.A1l(C08730cb.A00(userSession).A00())) && !c83403nh.A1u.equals(str))) {
                    arrayList.add(c83403nh);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final synchronized List A0O(C4H4 c4h4) {
        return AnonymousClass483.A03(this.A0C, new ArrayList(C4H5.A03(c4h4, C93394Gs.A00, new ArrayList(this.A0K))));
    }

    public final synchronized void A0R() {
        C81663kb c81663kb = this.A0I;
        C4H4 A04 = c81663kb.A04();
        C4H4 A05 = c81663kb.A05();
        C4H4 A01 = A01(A05, A04);
        if (!A01.equals(A05)) {
            A08(A01, c81663kb, this.A0K);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x00eb, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0026, B:7:0x0033, B:9:0x003a, B:11:0x0041, B:15:0x004e, B:17:0x0054, B:18:0x0067, B:20:0x006d, B:22:0x0077, B:24:0x007b, B:25:0x00bf, B:28:0x0080, B:35:0x0094, B:30:0x00b6, B:32:0x00bc, B:37:0x0097, B:39:0x00a3, B:41:0x00b0, B:43:0x00c6, B:45:0x00cd, B:47:0x00d6, B:49:0x00dc, B:54:0x00e0, B:55:0x00e1, B:59:0x005b, B:61:0x00e7, B:62:0x00ea, B:64:0x0061, B:65:0x0063, B:68:0x0066, B:71:0x00e5, B:67:0x0064, B:13:0x0048), top: B:2:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3 A[Catch: all -> 0x00eb, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0026, B:7:0x0033, B:9:0x003a, B:11:0x0041, B:15:0x004e, B:17:0x0054, B:18:0x0067, B:20:0x006d, B:22:0x0077, B:24:0x007b, B:25:0x00bf, B:28:0x0080, B:35:0x0094, B:30:0x00b6, B:32:0x00bc, B:37:0x0097, B:39:0x00a3, B:41:0x00b0, B:43:0x00c6, B:45:0x00cd, B:47:0x00d6, B:49:0x00dc, B:54:0x00e0, B:55:0x00e1, B:59:0x005b, B:61:0x00e7, B:62:0x00ea, B:64:0x0061, B:65:0x0063, B:68:0x0066, B:71:0x00e5, B:67:0x0064, B:13:0x0048), top: B:2:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0 A[Catch: all -> 0x00eb, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0026, B:7:0x0033, B:9:0x003a, B:11:0x0041, B:15:0x004e, B:17:0x0054, B:18:0x0067, B:20:0x006d, B:22:0x0077, B:24:0x007b, B:25:0x00bf, B:28:0x0080, B:35:0x0094, B:30:0x00b6, B:32:0x00bc, B:37:0x0097, B:39:0x00a3, B:41:0x00b0, B:43:0x00c6, B:45:0x00cd, B:47:0x00d6, B:49:0x00dc, B:54:0x00e0, B:55:0x00e1, B:59:0x005b, B:61:0x00e7, B:62:0x00ea, B:64:0x0061, B:65:0x0063, B:68:0x0066, B:71:0x00e5, B:67:0x0064, B:13:0x0048), top: B:2:0x0001, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A0S() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4GV.A0S():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[Catch: all -> 0x0162, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0023, B:8:0x0031, B:10:0x003e, B:12:0x0048, B:14:0x004f, B:18:0x005c, B:20:0x0062, B:21:0x0075, B:23:0x0085, B:25:0x0092, B:27:0x0099, B:29:0x00a0, B:33:0x00ab, B:35:0x00b1, B:36:0x00c7, B:38:0x00d3, B:39:0x00d9, B:41:0x00e5, B:42:0x00f9, B:44:0x0105, B:46:0x0112, B:48:0x011c, B:50:0x0123, B:59:0x0138, B:61:0x013e, B:67:0x0145, B:69:0x015e, B:70:0x0161, B:72:0x014b, B:82:0x0158, B:87:0x00b8, B:89:0x00be, B:92:0x00c3, B:94:0x00c6, B:98:0x0069, B:101:0x006f, B:102:0x0071, B:105:0x0074, B:79:0x015c, B:52:0x012a, B:55:0x0130, B:31:0x00a7, B:16:0x0056, B:73:0x014c, B:76:0x0152, B:93:0x00c4, B:104:0x0072), top: B:2:0x0001, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3 A[Catch: all -> 0x0162, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0023, B:8:0x0031, B:10:0x003e, B:12:0x0048, B:14:0x004f, B:18:0x005c, B:20:0x0062, B:21:0x0075, B:23:0x0085, B:25:0x0092, B:27:0x0099, B:29:0x00a0, B:33:0x00ab, B:35:0x00b1, B:36:0x00c7, B:38:0x00d3, B:39:0x00d9, B:41:0x00e5, B:42:0x00f9, B:44:0x0105, B:46:0x0112, B:48:0x011c, B:50:0x0123, B:59:0x0138, B:61:0x013e, B:67:0x0145, B:69:0x015e, B:70:0x0161, B:72:0x014b, B:82:0x0158, B:87:0x00b8, B:89:0x00be, B:92:0x00c3, B:94:0x00c6, B:98:0x0069, B:101:0x006f, B:102:0x0071, B:105:0x0074, B:79:0x015c, B:52:0x012a, B:55:0x0130, B:31:0x00a7, B:16:0x0056, B:73:0x014c, B:76:0x0152, B:93:0x00c4, B:104:0x0072), top: B:2:0x0001, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5 A[Catch: all -> 0x0162, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0023, B:8:0x0031, B:10:0x003e, B:12:0x0048, B:14:0x004f, B:18:0x005c, B:20:0x0062, B:21:0x0075, B:23:0x0085, B:25:0x0092, B:27:0x0099, B:29:0x00a0, B:33:0x00ab, B:35:0x00b1, B:36:0x00c7, B:38:0x00d3, B:39:0x00d9, B:41:0x00e5, B:42:0x00f9, B:44:0x0105, B:46:0x0112, B:48:0x011c, B:50:0x0123, B:59:0x0138, B:61:0x013e, B:67:0x0145, B:69:0x015e, B:70:0x0161, B:72:0x014b, B:82:0x0158, B:87:0x00b8, B:89:0x00be, B:92:0x00c3, B:94:0x00c6, B:98:0x0069, B:101:0x006f, B:102:0x0071, B:105:0x0074, B:79:0x015c, B:52:0x012a, B:55:0x0130, B:31:0x00a7, B:16:0x0056, B:73:0x014c, B:76:0x0152, B:93:0x00c4, B:104:0x0072), top: B:2:0x0001, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105 A[Catch: all -> 0x0162, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0023, B:8:0x0031, B:10:0x003e, B:12:0x0048, B:14:0x004f, B:18:0x005c, B:20:0x0062, B:21:0x0075, B:23:0x0085, B:25:0x0092, B:27:0x0099, B:29:0x00a0, B:33:0x00ab, B:35:0x00b1, B:36:0x00c7, B:38:0x00d3, B:39:0x00d9, B:41:0x00e5, B:42:0x00f9, B:44:0x0105, B:46:0x0112, B:48:0x011c, B:50:0x0123, B:59:0x0138, B:61:0x013e, B:67:0x0145, B:69:0x015e, B:70:0x0161, B:72:0x014b, B:82:0x0158, B:87:0x00b8, B:89:0x00be, B:92:0x00c3, B:94:0x00c6, B:98:0x0069, B:101:0x006f, B:102:0x0071, B:105:0x0074, B:79:0x015c, B:52:0x012a, B:55:0x0130, B:31:0x00a7, B:16:0x0056, B:73:0x014c, B:76:0x0152, B:93:0x00c4, B:104:0x0072), top: B:2:0x0001, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b A[Catch: all -> 0x0162, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0023, B:8:0x0031, B:10:0x003e, B:12:0x0048, B:14:0x004f, B:18:0x005c, B:20:0x0062, B:21:0x0075, B:23:0x0085, B:25:0x0092, B:27:0x0099, B:29:0x00a0, B:33:0x00ab, B:35:0x00b1, B:36:0x00c7, B:38:0x00d3, B:39:0x00d9, B:41:0x00e5, B:42:0x00f9, B:44:0x0105, B:46:0x0112, B:48:0x011c, B:50:0x0123, B:59:0x0138, B:61:0x013e, B:67:0x0145, B:69:0x015e, B:70:0x0161, B:72:0x014b, B:82:0x0158, B:87:0x00b8, B:89:0x00be, B:92:0x00c3, B:94:0x00c6, B:98:0x0069, B:101:0x006f, B:102:0x0071, B:105:0x0074, B:79:0x015c, B:52:0x012a, B:55:0x0130, B:31:0x00a7, B:16:0x0056, B:73:0x014c, B:76:0x0152, B:93:0x00c4, B:104:0x0072), top: B:2:0x0001, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c3 A[Catch: all -> 0x0162, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0023, B:8:0x0031, B:10:0x003e, B:12:0x0048, B:14:0x004f, B:18:0x005c, B:20:0x0062, B:21:0x0075, B:23:0x0085, B:25:0x0092, B:27:0x0099, B:29:0x00a0, B:33:0x00ab, B:35:0x00b1, B:36:0x00c7, B:38:0x00d3, B:39:0x00d9, B:41:0x00e5, B:42:0x00f9, B:44:0x0105, B:46:0x0112, B:48:0x011c, B:50:0x0123, B:59:0x0138, B:61:0x013e, B:67:0x0145, B:69:0x015e, B:70:0x0161, B:72:0x014b, B:82:0x0158, B:87:0x00b8, B:89:0x00be, B:92:0x00c3, B:94:0x00c6, B:98:0x0069, B:101:0x006f, B:102:0x0071, B:105:0x0074, B:79:0x015c, B:52:0x012a, B:55:0x0130, B:31:0x00a7, B:16:0x0056, B:73:0x014c, B:76:0x0152, B:93:0x00c4, B:104:0x0072), top: B:2:0x0001, inners: #0, #2, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A0T() {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4GV.A0T():void");
    }

    public final synchronized void A0U(String str) {
        Object obj;
        List list = this.A0K;
        if (C93394Gs.A07(str, list)) {
            C81663kb c81663kb = this.A0I;
            if (str.equals(c81663kb.C7V())) {
                String str2 = null;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((C83403nh) obj).A0h() != null) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C83403nh c83403nh = (C83403nh) obj;
                if (c83403nh != null) {
                    str2 = c83403nh.A0h();
                }
                c81663kb.A0E(str2);
            }
            A0A(this);
            A0T();
        } else if (C93394Gs.A07(str, this.A0L)) {
            A09(this);
        }
    }

    public final synchronized boolean A0V() {
        boolean z;
        String A0h;
        if (!this.A0I.CVQ()) {
            A05();
            Iterator it = this.A0K.iterator();
            ArrayList arrayList = new ArrayList();
            final String str = null;
            while (it.hasNext()) {
                C83403nh c83403nh = (C83403nh) it.next();
                if (c83403nh.A2P && !C93384Gr.A00(c83403nh, this.A0J, true)) {
                    arrayList.add(c83403nh);
                    it.remove();
                    if (c83403nh.A1S() && (A0h = c83403nh.A0h()) != null && (str == null || str.compareTo(A0h) < 0)) {
                        str = A0h;
                    }
                }
            }
            A0A(this);
            A0T();
            if (str != null) {
                Runnable runnable = new Runnable() { // from class: X.M4T
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4GV c4gv = C4GV.this;
                        String str2 = str;
                        synchronized (c4gv) {
                            Long l = C2ED.A00;
                            C81663kb c81663kb = c4gv.A0I;
                            if (!l.equals(c81663kb.C7O())) {
                                AbstractC207749He.A00();
                                UserSession userSession = c4gv.A0H;
                                C14360o3.A0B(userSession, 0);
                                JV6 A01 = JVE.A01(userSession);
                                long currentTimeMillis = System.currentTimeMillis();
                                JVD.A00(new MI4(c81663kb, AbstractC166987dD.A0L(C4H6.A01(str2)), 1, currentTimeMillis), A01.A00);
                                AbstractC207749He.A00();
                                C2057799c c2057799c = C99V.A00(userSession).A01;
                                long longValue = c81663kb.C7O().longValue();
                                int A07 = (int) AbstractC43593JPy.A07();
                                C2059699y c2059699y = (C2059699y) c2057799c.A02.A02();
                                C1YP c1yp = c2059699y.A00;
                                c1yp.assertNotSuspendingTransaction();
                                AbstractC29601bb abstractC29601bb = c2059699y.A02;
                                InterfaceC37561ot acquire = abstractC29601bb.acquire();
                                acquire.ADi(1, A07);
                                acquire.ADi(2, longValue);
                                acquire.ADp(3, str2);
                                try {
                                    c1yp.beginTransaction();
                                    try {
                                        acquire.ATb();
                                        c1yp.setTransactionSuccessful();
                                        c1yp.endTransaction();
                                    } catch (Throwable th) {
                                        c1yp.endTransaction();
                                        throw th;
                                    }
                                } finally {
                                    abstractC29601bb.release(acquire);
                                }
                            }
                        }
                    }
                };
                UserSession userSession = this.A0H;
                if (C18U.A06(C06090Tz.A05, userSession, 36327907131603909L)) {
                    C14120nc.A00().ATO(new C18320vJ(657395099, runnable));
                } else {
                    C4HC.A00.A00(userSession).A01().post(runnable);
                }
            }
            A0C(this, arrayList);
            z = !arrayList.isEmpty();
        } else {
            z = false;
        }
        return z;
    }

    public static int A00(C80993jT c80993jT, C4GV c4gv) {
        ArrayList arrayList = new ArrayList(c4gv.A0K);
        String str = ((AbstractC81003jU) c80993jT).A02;
        C93444Gx c93444Gx = C93394Gs.A00;
        int A00 = C4H5.A00(c93444Gx.A00, str, c93444Gx.A01.A02, arrayList);
        int i = A00 ^ (-1);
        if (A00 >= 0) {
            return A00 + 1;
        }
        return i;
    }

    public static List A04(C4GV c4gv) {
        return C4H5.A03(c4gv.A0I.A04(), C93394Gs.A00, new ArrayList(c4gv.A0K));
    }

    private void A05() {
        C80993jT c80993jT = null;
        C80993jT c80993jT2 = null;
        for (Map.Entry entry : this.A0I.CDu().entrySet()) {
            boolean equals = this.A0H.userId.equals(entry.getKey());
            Object value = entry.getValue();
            if (equals) {
                c80993jT = (C80993jT) value;
            } else {
                c80993jT2 = (C80993jT) value;
            }
        }
        C93384Gr c93384Gr = this.A0J;
        c93384Gr.A00 = c80993jT;
        c93384Gr.A01 = c80993jT2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r0 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(X.C4H4 r4, X.C83403nh r5, X.C81663kb r6) {
        /*
            if (r5 == 0) goto Ld
            java.lang.Object r0 = r4.A02
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r5.A1o(r0)
            r5 = 1
            if (r0 == 0) goto Le
        Ld:
            r5 = 0
        Le:
            X.0do r0 = r6.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5b
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r6.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L36
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L2e:
            if (r0 >= r2) goto L37
            r4.unlock()
            int r0 = r0 + 1
            goto L2e
        L36:
            r2 = 0
        L37:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3iy r0 = r6.A01     // Catch: java.lang.Throwable -> L4e
            r0.A2N = r5     // Catch: java.lang.Throwable -> L4e
        L42:
            if (r3 >= r2) goto L4a
            r4.lock()
            int r3 = r3 + 1
            goto L42
        L4a:
            r1.unlock()
            return
        L4e:
            r0 = move-exception
        L4f:
            if (r3 >= r2) goto L57
            r4.lock()
            int r3 = r3 + 1
            goto L4f
        L57:
            r1.unlock()
            throw r0
        L5b:
            X.3iy r1 = r6.A01
            monitor-enter(r1)
            r1.A2N = r5     // Catch: java.lang.Throwable -> L62
            monitor-exit(r1)
            return
        L62:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4GV.A06(X.4H4, X.3nh, X.3kb):void");
    }

    public static void A0B(C4GV c4gv, ArrayList arrayList, ArrayList arrayList2) {
        C83403nh c83403nh;
        List list = c4gv.A0L;
        if (!list.isEmpty()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                C83403nh c83403nh2 = (C83403nh) listIterator.previous();
                Comparator comparator = C93394Gs.A01;
                C14360o3.A0B(c83403nh2, 1);
                int binarySearch = Collections.binarySearch(list, c83403nh2, comparator);
                if (binarySearch >= 0 && (c83403nh = (C83403nh) list.remove(binarySearch)) != null) {
                    listIterator.remove();
                    c83403nh.A1F(c83403nh2.A0h());
                    arrayList2.add(c83403nh);
                }
            }
        }
    }

    public static void A0C(C4GV c4gv, List list) {
        AbstractC25651Mw.A00(c4gv.A0H).E4s(new C2Io(c4gv.A0I.BKb(), C05F.A0G, null, A03(list, true), null, false));
    }

    public static synchronized void A0D(C4GV c4gv, List list, List list2, List list3, List list4, List list5) {
        C83693oE c83693oE;
        C83693oE c83693oE2;
        C83693oE c83693oE3;
        synchronized (c4gv) {
            ArrayList arrayList = new ArrayList(list);
            UserSession userSession = c4gv.A0H;
            DirectThreadKey BKb = c4gv.A0I.BKb();
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(list2, 3);
            int size = list2.size();
            int i = 0;
            int i2 = 0;
            while (i < arrayList.size() && i2 < size) {
                C83403nh c83403nh = (C83403nh) arrayList.get(i);
                C83403nh c83403nh2 = (C83403nh) list2.get(i2);
                String A0h = c83403nh.A0h();
                if (A0h != null) {
                    String A0h2 = c83403nh2.A0h();
                    if (A0h2 != null) {
                        int compare = C93404Gt.A01.compare(A0h, A0h2);
                        if (compare == 0) {
                            if (!c83403nh.equals(c83403nh2)) {
                                C45120Jxp c45120Jxp = c83403nh2.A0D;
                                if (c45120Jxp != null && C14360o3.A0K((Boolean) c45120Jxp.A02, true)) {
                                    if (c83403nh.C8i() > c83403nh2.C8i() && C18U.A06(C06090Tz.A05, userSession, 2342161871152880346L)) {
                                        C0K8.A0E("messageIsDirectlyCreatedFromEBResponse", AnonymousClass001.A0g("TTLC message ", c83403nh2.A0g(), " is skipped since cache is newer "));
                                    } else {
                                        C0K8.A0E("messageIsDirectlyCreatedFromEBResponse", AnonymousClass001.A0g("TTLC message ", c83403nh2.A0g(), " will replace cached message"));
                                    }
                                }
                                C83693oE A00 = AbstractC83823oR.A00(BKb);
                                if (A00 != null) {
                                    c83693oE2 = AbstractC1345466e.A02(A00);
                                } else {
                                    c83693oE2 = null;
                                }
                                c83403nh.A11(userSession, c83403nh2, c83693oE2);
                                list5.add(c83403nh);
                            }
                            i++;
                            i2++;
                        } else if (compare < 0) {
                            list4.add(arrayList.remove(i));
                        } else {
                            C83693oE A002 = AbstractC83823oR.A00(BKb);
                            if (A002 != null) {
                                c83693oE3 = AbstractC1345466e.A02(A002);
                            } else {
                                c83693oE3 = null;
                            }
                            c83403nh2.A12(userSession, c83693oE3);
                            arrayList.add(i, c83403nh2);
                            C45120Jxp c45120Jxp2 = c83403nh2.A0D;
                            if (c45120Jxp2 != null && C14360o3.A0K((Boolean) c45120Jxp2.A02, true)) {
                                C0K8.A0E("messageIsDirectlyCreatedFromEBResponse", AnonymousClass001.A0g("TTLC message ", c83403nh2.A0g(), " is not in cache, may need to double check if this message is deleted locally or not"));
                            }
                            list3.add(c83403nh2);
                            i++;
                            i2++;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            int size2 = arrayList.size();
            if (i < size2) {
                List subList = arrayList.subList(i, size2);
                list4.addAll(subList);
                subList.clear();
            }
            if (i2 < size) {
                for (C83403nh c83403nh3 : list2.subList(i2, size)) {
                    C83693oE A003 = AbstractC83823oR.A00(BKb);
                    if (A003 != null) {
                        c83693oE = AbstractC1345466e.A02(A003);
                    } else {
                        c83693oE = null;
                    }
                    c83403nh3.A12(userSession, c83693oE);
                    list3.add(c83403nh3);
                    arrayList.add(c83403nh3);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    public final void A0P() {
        C80693iy c80693iy;
        C81703kf c81703kf;
        C81663kb c81663kb = this.A0I;
        long j = 0;
        if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = c81663kb.A03.readLock();
            readLock.lock();
            try {
                c80693iy = c81663kb.A01;
                C83403nh c83403nh = c80693iy.A0i;
                if (c83403nh != null) {
                    j = c83403nh.C8i();
                }
            } finally {
                readLock.unlock();
            }
        } else {
            c80693iy = c81663kb.A01;
            synchronized (c80693iy) {
                C83403nh c83403nh2 = c80693iy.A0i;
                if (c83403nh2 != null) {
                    j = c83403nh2.C8i();
                }
            }
        }
        if (!c81663kb.CVQ()) {
            UserSession userSession = this.A0H;
            C80993jT Av3 = c81663kb.Av3(userSession.userId);
            if (Av3 != null && (c81703kf = Av3.A02) != null) {
                j = Math.max(j, c81703kf.A00);
            }
            if (c81663kb.Ay9() != null && c81663kb.Ay9().A05 != null) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 2342163292781551917L) || C18U.A06(c06090Tz, userSession, 36320283568775475L)) {
                    j = Math.max(j, TimeUnit.MILLISECONDS.toMicros(c81663kb.Ay9().A05.longValue()));
                }
            }
        }
        if (j > c81663kb.BLF()) {
            c80693iy.A0N = j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (r1.A10 != X.C2EY.A0G) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Q() {
        /*
            r14 = this;
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r1 = 1
            java.util.ArrayList r10 = r14.A0M(r1)
            X.3kb r6 = r14.A0I
            java.util.List r0 = r6.BSD()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            com.instagram.common.session.UserSession r0 = r14.A0H
            java.lang.String r0 = r0.userId
            r9.remove(r0)
            java.util.HashMap r8 = r6.CDu()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            boolean r13 = r6.CVQ()
            int r4 = r10.size()
            int r4 = r4 - r1
        L2e:
            if (r4 < 0) goto Lb6
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto Lb6
            java.lang.Object r3 = r10.get(r4)
            X.3nh r3 = (X.C83403nh) r3
            java.util.Iterator r12 = r9.iterator()
        L40:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Lb2
            java.lang.Object r2 = r12.next()
            java.lang.Object r1 = r8.get(r2)
            X.3jU r1 = (X.AbstractC81003jU) r1
            java.lang.String r11 = r3.A0h()
            if (r11 == 0) goto L40
            if (r1 == 0) goto L40
            java.lang.String r0 = r3.A1u
            boolean r0 = r0.equals(r2)
            if (r13 == 0) goto Laf
            if (r0 != 0) goto L94
        L62:
            java.lang.String r1 = r1.A02
            boolean r0 = r1.equals(r11)
            if (r0 != 0) goto L72
            java.util.Comparator r0 = X.C93404Gt.A01
            int r0 = r0.compare(r1, r11)
            if (r0 < 0) goto L40
        L72:
            if (r13 != 0) goto L94
            int r1 = r4 + 1
            int r0 = r10.size()
            if (r1 >= r0) goto L94
            java.lang.Object r1 = r10.get(r1)
            X.3nh r1 = (X.C83403nh) r1
            java.lang.String r0 = r1.A1u
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L94
            X.2EY r1 = r1.A10
            X.2EY r0 = X.C2EY.A0G
            if (r1 == r0) goto L94
        L90:
            r12.remove()
            goto L40
        L94:
            boolean r0 = r5.containsKey(r3)
            if (r0 != 0) goto La2
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5.put(r3, r0)
        La2:
            java.lang.Object r0 = r5.get(r3)
            r0.getClass()
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r2)
            goto L90
        Laf:
            if (r0 != 0) goto L40
            goto L62
        Lb2:
            int r4 = r4 + (-1)
            goto L2e
        Lb6:
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r5 = r0.iterator()
        Lbe:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Le7
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            X.3nh r0 = (X.C83403nh) r0
            long r3 = r0.C8i()
            java.lang.String r2 = r0.A0h()
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            X.4H9 r0 = new X.4H9
            r0.<init>(r2, r1, r3)
            r7.add(r0)
            goto Lbe
        Le7:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r7)
            X.3iy r0 = r6.A01
            r0.A2H = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4GV.A0Q():void");
    }

    public final synchronized boolean A0W() {
        ArrayList arrayList;
        C81663kb c81663kb = this.A0I;
        ArrayList A02 = A02(c81663kb, this, 20);
        ArrayList arrayList2 = new ArrayList();
        arrayList = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        A0D(this, this.A0K, A02, arrayList2, arrayList, arrayList3);
        A0A(this);
        A0T();
        AbstractC25651Mw.A00(this.A0H).E4s(new C2Io(c81663kb.BKb(), C05F.A0G, arrayList2, A03(arrayList, true), arrayList3, false));
        return !arrayList.isEmpty();
    }

    public final synchronized boolean A0X(boolean z) {
        long currentTimeMillis;
        boolean z2;
        String str;
        if (z) {
            currentTimeMillis = 0;
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        List<C83403nh> list = this.A0K;
        Iterator it = list.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            C83403nh c83403nh = (C83403nh) it.next();
            if (c83403nh.A1T()) {
                Long l = c83403nh.A1L;
                if (l == null) {
                    C0f5 AEp = C18950wb.A01.AEp("Unexpected null timestamp for disappearing message, removed message", 20134884);
                    AEp.ABW("message_id", c83403nh.A0i());
                    AEp.report();
                }
                if (z || l == null || c83403nh.A1n(Long.valueOf(currentTimeMillis))) {
                    arrayList.add(c83403nh);
                    it.remove();
                }
            }
        }
        if (!arrayList.isEmpty()) {
            UserSession userSession = this.A0H;
            C14360o3.A0B(userSession, 0);
            if (!(!C18U.A06(C06090Tz.A05, userSession, 36325592144229559L))) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String A0g = ((C83403nh) it2.next()).A0g();
                    ArrayList arrayList2 = new ArrayList();
                    for (C83403nh c83403nh2 : list) {
                        AnonymousClass442 A0P = c83403nh2.A0P();
                        if (A0P != null && (C14360o3.A0K(A0P.A0T, A0g) || C14360o3.A0K(A0P.A0R, A0g))) {
                            arrayList2.add(c83403nh2);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        C83403nh c83403nh3 = (C83403nh) it3.next();
                        C14360o3.A0B(c83403nh3, 0);
                        AnonymousClass442 A0P2 = c83403nh3.A0P();
                        AnonymousClass442 anonymousClass442 = null;
                        if (A0P2 != null && (str = A0P2.A0T) != null) {
                            anonymousClass442 = new AnonymousClass442(new LF6(C2EY.A1O, null, new AnonymousClass570(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT), str, A0P2.A0S, "0", "0", AbstractC43591JPw.A00(1278), null, false));
                        }
                        c83403nh3.A14(anonymousClass442);
                    }
                }
            }
            A0A(this);
            A0T();
            A0C(this, arrayList);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C83403nh c83403nh4 = (C83403nh) it4.next();
                C35138Fef.A00.A01(userSession, Boolean.valueOf(c83403nh4.A1S()), c83403nh4.A1L, c83403nh4.A0e(), c83403nh4.A1K, c83403nh4.A0d(), Long.valueOf(currentTimeMillis), this.A0I.C7I());
            }
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    public C4GV(UserSession userSession, C81663kb c81663kb, List list) {
        ArrayList arrayList = new ArrayList();
        this.A0K = arrayList;
        this.A0L = new ArrayList();
        this.A0C = new InterfaceC28041Xi() { // from class: X.4GX
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                C83403nh c83403nh = (C83403nh) obj;
                C4GV c4gv = C4GV.this;
                boolean A1l = c83403nh.A1l(C17060sy.A01.A01(c4gv.A0H));
                if (A1l && c83403nh.A2P) {
                    return c4gv.A09.apply(c83403nh);
                }
                return A1l;
            }
        };
        this.A0D = new InterfaceC28041Xi() { // from class: X.4GY
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return !((C83403nh) obj).A2D;
            }
        };
        this.A0N = new InterfaceC28041Xi() { // from class: X.4GZ
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                C4GV c4gv = C4GV.this;
                if (c4gv.A04.apply(obj) && c4gv.A03.apply(obj)) {
                    return true;
                }
                return false;
            }
        };
        this.A07 = new InterfaceC28041Xi() { // from class: X.4Ga
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return ((C83403nh) obj).A2P;
            }
        };
        this.A08 = new InterfaceC28041Xi() { // from class: X.4Gb
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                C83403nh c83403nh = (C83403nh) obj;
                if (c83403nh.A2P && C93384Gr.A00(c83403nh, C4GV.this.A0J, true)) {
                    return true;
                }
                return false;
            }
        };
        this.A09 = new InterfaceC28041Xi() { // from class: X.4Gc
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
            
                if (r1 != false) goto L14;
             */
            @Override // X.InterfaceC28041Xi
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ boolean apply(java.lang.Object r4) {
                /*
                    r3 = this;
                    X.3nh r4 = (X.C83403nh) r4
                    X.4GV r2 = X.C4GV.this
                    monitor-enter(r2)
                    X.3kb r1 = r2.A0I     // Catch: java.lang.Throwable -> L29
                    com.instagram.common.session.UserSession r0 = r2.A0H     // Catch: java.lang.Throwable -> L29
                    java.lang.String r0 = r0.userId     // Catch: java.lang.Throwable -> L29
                    X.3jT r1 = r1.Av3(r0)     // Catch: java.lang.Throwable -> L29
                    if (r1 == 0) goto L26
                    java.lang.String r0 = r4.A0h()     // Catch: java.lang.Throwable -> L29
                    if (r0 == 0) goto L26
                    X.3kf r0 = r1.A02     // Catch: java.lang.Throwable -> L29
                    if (r0 == 0) goto L26
                    java.lang.String r0 = r0.A01     // Catch: java.lang.Throwable -> L29
                    if (r0 == 0) goto L26
                    boolean r1 = r4.A1o(r0)     // Catch: java.lang.Throwable -> L29
                    r0 = 0
                    if (r1 == 0) goto L27
                L26:
                    r0 = 1
                L27:
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
                    return r0
                L29:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C93264Gc.apply(java.lang.Object):boolean");
            }
        };
        this.A04 = new InterfaceC28041Xi() { // from class: X.4Gd
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                C4GV c4gv = C4GV.this;
                if (!c4gv.A06.apply(obj) && c4gv.A0G.apply(obj) && c4gv.A0F.apply(obj)) {
                    return true;
                }
                return false;
            }
        };
        this.A06 = new InterfaceC28041Xi() { // from class: X.4Ge
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return ((C83403nh) obj).A1j(C17060sy.A01.A01(C4GV.this.A0H));
            }
        };
        this.A0E = new InterfaceC28041Xi() { // from class: X.4Gf
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                C83403nh c83403nh = (C83403nh) obj;
                if (C4GV.this.A07.apply(c83403nh) && !c83403nh.A2D) {
                    return true;
                }
                return false;
            }
        };
        this.A05 = new InterfaceC28041Xi() { // from class: X.4Gg
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                C83403nh c83403nh = (C83403nh) obj;
                C4GV c4gv = C4GV.this;
                if (c4gv.A0E.apply(c83403nh) && c4gv.A04.apply(c83403nh) && c83403nh.A10 != C2EY.A0q) {
                    return true;
                }
                return false;
            }
        };
        this.A03 = new InterfaceC28041Xi() { // from class: X.4Gh
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                C83403nh c83403nh = (C83403nh) obj;
                if (c83403nh.A10 != C2EY.A0q && !c83403nh.A2P) {
                    return true;
                }
                return false;
            }
        };
        this.A0O = new InterfaceC28041Xi() { // from class: X.4Gi
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                if (((C83403nh) obj).A1F != C05F.A0C) {
                    return false;
                }
                return true;
            }
        };
        this.A0B = new InterfaceC28041Xi() { // from class: X.4Gj
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                boolean z;
                C83403nh c83403nh = (C83403nh) obj;
                C4GV c4gv = C4GV.this;
                synchronized (c4gv) {
                    C80993jT Av3 = c4gv.A0I.Av3(c4gv.A0H.userId);
                    if (!c83403nh.A2D && c4gv.A04.apply(c83403nh) && (Av3 == null || c83403nh.A1o(((AbstractC81003jU) Av3).A02))) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                return z;
            }
        };
        this.A0A = new InterfaceC28041Xi() { // from class: X.4Gk
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
            
                if (r4.A0I.Ccc(r4.A0H.userId, r6.A0h(), r6.A1u) != false) goto L8;
             */
            @Override // X.InterfaceC28041Xi
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ boolean apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    X.3nh r6 = (X.C83403nh) r6
                    X.4GV r4 = X.C4GV.this
                    monitor-enter(r4)
                    X.2EY r1 = r6.A10     // Catch: java.lang.Throwable -> L21
                    X.2EY r0 = X.C2EY.A1k     // Catch: java.lang.Throwable -> L21
                    if (r1 != r0) goto L1e
                    X.3kb r3 = r4.A0I     // Catch: java.lang.Throwable -> L21
                    com.instagram.common.session.UserSession r0 = r4.A0H     // Catch: java.lang.Throwable -> L21
                    java.lang.String r2 = r0.userId     // Catch: java.lang.Throwable -> L21
                    java.lang.String r1 = r6.A0h()     // Catch: java.lang.Throwable -> L21
                    java.lang.String r0 = r6.A1u     // Catch: java.lang.Throwable -> L21
                    boolean r1 = r3.Ccc(r2, r1, r0)     // Catch: java.lang.Throwable -> L21
                    r0 = 1
                    if (r1 == 0) goto L1f
                L1e:
                    r0 = 0
                L1f:
                    monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
                    return r0
                L21:
                    r0 = move-exception
                    monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C93324Gk.apply(java.lang.Object):boolean");
            }
        };
        this.A0F = new InterfaceC28041Xi() { // from class: X.4Gl
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                C83553nw c83553nw;
                C31200Dnj c31200Dnj;
                String str;
                C83403nh c83403nh = (C83403nh) obj;
                if (c83403nh.A10 == C2EY.A0G && (c83553nw = c83403nh.A0N) != null && (((c31200Dnj = c83553nw.A01) != null && C83553nw.A0B.contains(c31200Dnj.A00)) || ((str = c83553nw.A02) != null && C83553nw.A0A.contains(str)))) {
                    return false;
                }
                if ((c83403nh.A1u.equals(C4GV.this.A0H.userId) && "igd_automation_automated_message".equals(c83403nh.A1p)) || c83403nh.A1Q != null) {
                    return false;
                }
                return true;
            }
        };
        this.A0G = new InterfaceC28041Xi() { // from class: X.4Gm
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                C83553nw c83553nw;
                C31200Dnj c31200Dnj;
                C83403nh c83403nh = (C83403nh) obj;
                if (c83403nh.A10 == C2EY.A0G && (c83553nw = c83403nh.A0N) != null && (c31200Dnj = c83553nw.A01) != null && C83553nw.A0B.contains(c31200Dnj.A00)) {
                    return false;
                }
                return true;
            }
        };
        this.A0P = new InterfaceC28041Xi() { // from class: X.4Gn
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                C83553nw c83553nw;
                C31200Dnj c31200Dnj;
                C83403nh c83403nh = (C83403nh) obj;
                if (c83403nh.A10 == C2EY.A0G && (c83553nw = c83403nh.A0N) != null && (c31200Dnj = c83553nw.A01) != null && C83553nw.A0B.contains(c31200Dnj.A00)) {
                    return false;
                }
                return true;
            }
        };
        this.A0M = new InterfaceC28041Xi() { // from class: X.4Go
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                C83403nh c83403nh = (C83403nh) obj;
                C2EY c2ey = c83403nh.A10;
                if ((c2ey == C2EY.A0W || c2ey == C2EY.A1r) && c83403nh.A0I() != null) {
                    return true;
                }
                return false;
            }
        };
        this.A02 = new InterfaceC28041Xi() { // from class: X.4Gp
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                C83403nh c83403nh = (C83403nh) obj;
                if (c83403nh.A10 != C2EY.A0G && c83403nh.A1Q == null) {
                    return true;
                }
                return false;
            }
        };
        this.A01 = new InterfaceC28041Xi() { // from class: X.4Gq
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return ((C83403nh) obj).A1S();
            }
        };
        this.A00 = null;
        this.A0H = userSession;
        this.A0I = c81663kb;
        this.A0J = new C93384Gr(userSession.userId, new C28111Xp(Boolean.valueOf(c81663kb.Cd4())));
        if (list != null) {
            arrayList.addAll(list);
            Collections.sort(arrayList, C93394Gs.A04);
        }
        A0A(this);
        A0T();
    }

    public static C4H4 A01(C4H4 c4h4, C4H4 c4h42) {
        if (!c4h4.A01() && !c4h42.A01()) {
            Comparator comparator = c4h4.A00.A02;
            if (comparator.compare(c4h4.A01, c4h42.A02) > 0 && comparator.compare(c4h42.A01, c4h4.A02) > 0) {
                return c4h4.A00(c4h42);
            }
            return c4h4;
        }
        return c4h4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    public static void A09(C4GV c4gv) {
        ?? r7;
        C81663kb c81663kb;
        C80693iy c80693iy;
        Throwable th;
        ReentrantReadWriteLock.WriteLock writeLock;
        int i;
        int i2;
        int i3;
        int i4;
        List A04 = A04(c4gv);
        C14360o3.A0B(A04, 0);
        C83403nh c83403nh = (C83403nh) AbstractC001800i.A0L(A04);
        List<C83403nh> list = c4gv.A0L;
        C14360o3.A0B(list, 0);
        C83403nh c83403nh2 = (C83403nh) AbstractC001800i.A0L(list);
        C83403nh c83403nh3 = (C83403nh) AnonymousClass483.A01(c4gv.A0F, A04(c4gv));
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                r7 = listIterator.previous();
                if (((C83403nh) r7).A1Q == null) {
                    break;
                }
            } else {
                r7 = 0;
                break;
            }
        }
        C83403nh c83403nh4 = (C83403nh) AnonymousClass483.A01(c4gv.A0P, A04(c4gv));
        if (c83403nh2 != null) {
            for (C83403nh c83403nh5 : list) {
                if (c83403nh5.C8i() > c83403nh2.C8i()) {
                    c83403nh2 = c83403nh5;
                }
            }
            c81663kb = c4gv.A0I;
            Comparator comparator = C93394Gs.A05;
            C14360o3.A0B(comparator, 2);
            if (c83403nh == null || comparator.compare(c83403nh, c83403nh2) < 0) {
                c83403nh = c83403nh2;
            }
            c81663kb.A09(c83403nh);
            if (c83403nh3 == null || (r7 != 0 && comparator.compare(c83403nh3, r7) < 0)) {
                c83403nh3 = r7;
            }
            c81663kb.A0A(c83403nh3);
            if (c83403nh4 == null || comparator.compare(c83403nh4, c83403nh2) < 0) {
                c83403nh4 = c83403nh2;
            }
        } else {
            c81663kb = c4gv.A0I;
            c81663kb.A09(c83403nh);
            c81663kb.A0A(c83403nh3);
        }
        c81663kb.A0B(c83403nh4);
        List list2 = c4gv.A0K;
        C83403nh c83403nh6 = (C83403nh) AnonymousClass483.A01(c4gv.A0B, list2);
        InterfaceC09390do interfaceC09390do = c81663kb.A05;
        if (((Boolean) interfaceC09390do.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i5 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i4 = reentrantReadWriteLock.getReadHoldCount();
                for (int i6 = 0; i6 < i4; i6++) {
                    readLock.unlock();
                }
            } else {
                i4 = 0;
            }
            writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                c80693iy = c81663kb.A01;
                c80693iy.A0o = c83403nh6;
                while (i5 < i4) {
                    readLock.lock();
                    i5++;
                }
                writeLock.unlock();
            } catch (Throwable th2) {
                th = th2;
                while (i5 < i4) {
                    readLock.lock();
                    i5++;
                }
                writeLock.unlock();
                throw th;
            }
        } else {
            c80693iy = c81663kb.A01;
            synchronized (c80693iy) {
                c80693iy.A0o = c83403nh6;
            }
        }
        C83403nh c83403nh7 = (C83403nh) AnonymousClass483.A01(c4gv.A04, A04(c4gv));
        if (((Boolean) interfaceC09390do.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock2 = c81663kb.A03;
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock2.readLock();
            int i7 = 0;
            if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                i3 = reentrantReadWriteLock2.getReadHoldCount();
                for (int i8 = 0; i8 < i3; i8++) {
                    readLock2.unlock();
                }
            } else {
                i3 = 0;
            }
            writeLock = reentrantReadWriteLock2.writeLock();
            writeLock.lock();
            try {
                c80693iy.A0l = c83403nh7;
                while (i7 < i3) {
                    readLock2.lock();
                    i7++;
                }
                writeLock.unlock();
            } catch (Throwable th3) {
                th = th3;
                while (i7 < i3) {
                    readLock2.lock();
                    i7++;
                }
                writeLock.unlock();
                throw th;
            }
        } else {
            synchronized (c80693iy) {
                c80693iy.A0l = c83403nh7;
            }
        }
        C83403nh c83403nh8 = (C83403nh) AnonymousClass483.A01(c4gv.A03, list2);
        if (((Boolean) interfaceC09390do.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock3 = c81663kb.A03;
            ReentrantReadWriteLock.ReadLock readLock3 = reentrantReadWriteLock3.readLock();
            int i9 = 0;
            if (reentrantReadWriteLock3.getWriteHoldCount() == 0) {
                i2 = reentrantReadWriteLock3.getReadHoldCount();
                for (int i10 = 0; i10 < i2; i10++) {
                    readLock3.unlock();
                }
            } else {
                i2 = 0;
            }
            writeLock = reentrantReadWriteLock3.writeLock();
            writeLock.lock();
            try {
                c80693iy.A0j = c83403nh8;
                while (i9 < i2) {
                    readLock3.lock();
                    i9++;
                }
                writeLock.unlock();
            } catch (Throwable th4) {
                th = th4;
                while (i9 < i2) {
                    readLock3.lock();
                    i9++;
                }
                writeLock.unlock();
                throw th;
            }
        } else {
            synchronized (c80693iy) {
                c80693iy.A0j = c83403nh8;
            }
        }
        C83403nh c83403nh9 = (C83403nh) AnonymousClass483.A01(c4gv.A0E, list2);
        if (((Boolean) interfaceC09390do.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock4 = c81663kb.A03;
            ReentrantReadWriteLock.ReadLock readLock4 = reentrantReadWriteLock4.readLock();
            int i11 = 0;
            if (reentrantReadWriteLock4.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock4.getReadHoldCount();
                for (int i12 = 0; i12 < i; i12++) {
                    readLock4.unlock();
                }
            } else {
                i = 0;
            }
            writeLock = reentrantReadWriteLock4.writeLock();
            writeLock.lock();
            try {
                c80693iy.A0p = c83403nh9;
                while (i11 < i) {
                    readLock4.lock();
                    i11++;
                }
                writeLock.unlock();
            } catch (Throwable th5) {
                th = th5;
                while (i11 < i) {
                    readLock4.lock();
                    i11++;
                }
                writeLock.unlock();
                throw th;
            }
        } else {
            synchronized (c80693iy) {
                c80693iy.A0p = c83403nh9;
            }
        }
        c80693iy.A0m = (C83403nh) AnonymousClass483.A01(c4gv.A05, list2);
        c4gv.A0P();
    }

    public static void A0A(C4GV c4gv) {
        A09(c4gv);
        c4gv.A0S();
        c4gv.A0Q();
    }
}
