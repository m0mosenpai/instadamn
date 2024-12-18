package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1PH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1PH implements InterfaceC13000lm {
    public static final Map A07 = new HashMap();
    public final C1PP A01;
    public final UserSession A04;
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();
    public final Map A06 = new HashMap();
    public final Map A05 = new HashMap();
    public final C1PN A00 = new C1PN();

    public static C1PH A00(final UserSession userSession) {
        return (C1PH) userSession.A01(C1PH.class, new InterfaceC16820sZ() { // from class: X.1PM
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C1PH(UserSession.this);
            }
        });
    }

    public static void A01(C1PE c1pe, C1PC c1pc) {
        A07.put(c1pc, new C1PI(null, c1pe, null));
    }

    public final AnonymousClass318 A02(C1AV c1av, C1PC c1pc) {
        Map map = this.A05;
        AnonymousClass318 anonymousClass318 = (AnonymousClass318) map.get(c1pc);
        if (anonymousClass318 == null) {
            if (c1av == null) {
                anonymousClass318 = new AnonymousClass318();
            } else {
                anonymousClass318 = new AnonymousClass318(C1AT.A01(this.A04).A03(c1av));
            }
            map.put(c1pc, anonymousClass318);
        }
        return anonymousClass318;
    }

    public final AnonymousClass318 A03(C1PC c1pc) {
        Map map = this.A05;
        AnonymousClass318 anonymousClass318 = (AnonymousClass318) map.get(c1pc);
        if (anonymousClass318 == null) {
            AnonymousClass318 anonymousClass3182 = new AnonymousClass318();
            map.put(c1pc, anonymousClass3182);
            return anonymousClass3182;
        }
        return anonymousClass318;
    }

    public final C26191Pa A04(C1PC c1pc) {
        Map map = this.A06;
        if (!map.containsKey(c1pc)) {
            map.put(c1pc, new C26191Pa(this.A04, c1pc));
        }
        return (C26191Pa) map.get(c1pc);
    }

    public final C1PY A05(C1PC c1pc) {
        final C1PG c1pg;
        boolean containsKey = this.A02.containsKey(c1pc);
        C1PY A06 = A06(c1pc);
        if (!containsKey) {
            C1PI c1pi = (C1PI) A07.get(c1pc);
            C26191Pa A04 = A04(c1pc);
            if (c1pi != null) {
                C1PE c1pe = c1pi.A01;
                final UserSession userSession = this.A04;
                if (c1pe.ABH(userSession) && (c1pg = c1pi.A00) != null) {
                    final String str = c1pi.A02;
                    if (!TextUtils.isEmpty(str)) {
                        final C26221Pd c26221Pd = new C26221Pd(this, A04, A06);
                        InterfaceC14020nS interfaceC14020nS = C26231Pe.A02;
                        C14360o3.A0B(userSession, 0);
                        C14360o3.A0B(str, 1);
                        C26231Pe.A02.ATO(new AbstractC26261Ph() { // from class: X.1Pg
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(604168644, 3, false, false);
                            }

                            /* JADX WARN: Not initialized variable reg: 8, insn: 0x01fe: IGET (r0 I:java.lang.String) = (r8 I:X.1Pg) (LINE:510) X.1Pg.A03 java.lang.String, block:B:98:0x01fb */
                            /* JADX WARN: Removed duplicated region for block: B:37:0x011a A[Catch: IllegalStateException -> 0x01e1, NullPointerException -> 0x01ea, SQLException -> 0x01f3, TryCatch #5 {SQLException -> 0x01f3, IllegalStateException -> 0x01e1, NullPointerException -> 0x01ea, blocks: (B:3:0x0002, B:12:0x0068, B:14:0x006d, B:16:0x0083, B:18:0x0089, B:20:0x00b3, B:21:0x00b5, B:23:0x00bb, B:31:0x00ee, B:33:0x00f7, B:34:0x00f9, B:35:0x0114, B:37:0x011a, B:39:0x013b, B:54:0x0141, B:42:0x0156, B:44:0x0164, B:46:0x016d, B:48:0x0192, B:49:0x0197, B:52:0x016a, B:56:0x014c, B:58:0x0150, B:64:0x019c, B:66:0x01a2, B:68:0x01a8, B:70:0x01b3, B:72:0x01bb, B:73:0x01c0, B:76:0x00d3, B:78:0x00dc, B:79:0x00df, B:81:0x00e8, B:82:0x00eb, B:83:0x00c5, B:87:0x01ce, B:94:0x01dd, B:95:0x01e0), top: B:2:0x0002 }] */
                            /* JADX WARN: Removed duplicated region for block: B:48:0x0192 A[Catch: IllegalStateException -> 0x01e1, NullPointerException -> 0x01ea, SQLException -> 0x01f3, TryCatch #5 {SQLException -> 0x01f3, IllegalStateException -> 0x01e1, NullPointerException -> 0x01ea, blocks: (B:3:0x0002, B:12:0x0068, B:14:0x006d, B:16:0x0083, B:18:0x0089, B:20:0x00b3, B:21:0x00b5, B:23:0x00bb, B:31:0x00ee, B:33:0x00f7, B:34:0x00f9, B:35:0x0114, B:37:0x011a, B:39:0x013b, B:54:0x0141, B:42:0x0156, B:44:0x0164, B:46:0x016d, B:48:0x0192, B:49:0x0197, B:52:0x016a, B:56:0x014c, B:58:0x0150, B:64:0x019c, B:66:0x01a2, B:68:0x01a8, B:70:0x01b3, B:72:0x01bb, B:73:0x01c0, B:76:0x00d3, B:78:0x00dc, B:79:0x00df, B:81:0x00e8, B:82:0x00eb, B:83:0x00c5, B:87:0x01ce, B:94:0x01dd, B:95:0x01e0), top: B:2:0x0002 }] */
                            /* JADX WARN: Type inference failed for: r8v0, types: [X.1Pg] */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() {
                                /*
                                    Method dump skipped, instructions count: 523
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C26251Pg.run():void");
                            }
                        });
                    }
                }
            }
        }
        return A06;
    }

    public final C1PY A06(C1PC c1pc) {
        Map map = this.A02;
        if (!map.containsKey(c1pc)) {
            Map map2 = A07;
            if (map2.containsKey(c1pc)) {
                C1PY AMn = ((C1PI) map2.get(c1pc)).A01.AMn(this.A04);
                if (AMn != null) {
                    map.put(c1pc, AMn);
                    this.A03.put(c1pc, C1PZ.A0K);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Pool creator for surface: ");
                    sb.append(c1pc);
                    sb.append(" did not create valid pool.");
                    throw new NullPointerException(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Surface: ");
                sb2.append(c1pc);
                sb2.append(" needs to register first through registerSurface()");
                throw new IllegalStateException(sb2.toString());
            }
        }
        return (C1PY) map.get(c1pc);
    }

    public final void A07(C1PC c1pc, InterfaceC42381xS interfaceC42381xS) {
        ConcurrentHashMap concurrentHashMap;
        AtomicLong atomicLong;
        long j;
        Map map = A07;
        if (map.containsKey(c1pc)) {
            C1PI c1pi = (C1PI) map.get(c1pc);
            if (c1pi != null) {
                C1PE c1pe = c1pi.A01;
                final UserSession userSession = this.A04;
                if (c1pe.ABH(userSession)) {
                    final String str = c1pi.A02;
                    final C1PG c1pg = c1pi.A00;
                    C26191Pa c26191Pa = (C26191Pa) this.A06.get(c1pc);
                    C1PY A06 = A06(c1pc);
                    if (c1pg != null && c26191Pa != null && !TextUtils.isEmpty(str)) {
                        final ArrayList arrayList = new ArrayList();
                        if (interfaceC42381xS != null) {
                            arrayList.add(interfaceC42381xS);
                        }
                        Iterator it = A06.A03().iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next());
                        }
                        final Object obj = c26191Pa.A03;
                        InterfaceC14020nS interfaceC14020nS = C26231Pe.A02;
                        C14360o3.A0B(userSession, 0);
                        C14360o3.A0B(str, 1);
                        C26241Pf c26241Pf = C26231Pe.A01;
                        loop1: do {
                            concurrentHashMap = c26241Pf.A00;
                            atomicLong = (AtomicLong) concurrentHashMap.get(str);
                            if (atomicLong == null && (atomicLong = (AtomicLong) concurrentHashMap.putIfAbsent(str, new AtomicLong(1L))) == null) {
                                break;
                            }
                            do {
                                j = atomicLong.get();
                                if (j == 0) {
                                }
                            } while (!atomicLong.compareAndSet(j, j + 1));
                        } while (!concurrentHashMap.replace(str, atomicLong, new AtomicLong(1L)));
                        j = 0;
                        final long j2 = 1 + j;
                        C26231Pe.A02.ATO(new AbstractC26261Ph() { // from class: X.5Ne
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(604168644, 3, false, false);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:91:0x01f6, code lost:
                            
                                r0 = move-exception;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:93:0x01fa, code lost:
                            
                                throw r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
                            
                                if (X.C18U.A06(r11, r4, 36321426025751964L) != false) goto L11;
                             */
                            /* JADX WARN: Type inference failed for: r9v6, types: [X.1pA, java.lang.Object] */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() {
                                /*
                                    Method dump skipped, instructions count: 528
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C5Ne.run():void");
                            }
                        });
                        return;
                    }
                    C0w9.A03("AdsStore::Persistence", AnonymousClass001.A0R("Pool persisting did not succeed due to user logout or invalid data. Surface: ", str));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Pool creator for surface: ");
        sb.append(c1pc);
        sb.append(" did not register properly.");
        throw new NullPointerException(sb.toString());
    }

    public final boolean A08() {
        boolean z;
        C1PP c1pp = this.A01;
        Boolean bool = c1pp.A02;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = c1pp.A04.getBoolean("peak_throttling_check_result", false);
        }
        if (!z) {
            if (!C18U.A06(C06090Tz.A05, c1pp.A03, 36321426027128237L)) {
                return false;
            }
            if (c1pp.A01 == 0) {
                c1pp.A01 = c1pp.A04.getLong("real_time_peak_epoch_start_time_millis", 0L);
            }
            long j = c1pp.A00;
            if (j == 0) {
                j = c1pp.A04.getLong("real_time_peak_epoch_end_time_millis", 0L);
                c1pp.A00 = j;
            }
            long j2 = c1pp.A01;
            if (j2 == 0 || j == 0) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > j || j2 > currentTimeMillis) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        Map map = this.A03;
        for (C1PC c1pc : map.keySet()) {
            A07(c1pc, null);
            map.put(c1pc, C1PZ.A0K);
        }
        Iterator it = this.A02.entrySet().iterator();
        while (it.hasNext()) {
            ((C1PY) ((Map.Entry) it.next()).getValue()).A04();
        }
        this.A06.clear();
        this.A05.clear();
        C1PN c1pn = this.A00;
        c1pn.A02.clear();
        c1pn.A01.clear();
    }

    public C1PH(UserSession userSession) {
        this.A04 = userSession;
        C14360o3.A0B(userSession, 0);
        this.A01 = (C1PP) userSession.A01(C1PP.class, new J8V(userSession, 24));
    }
}
