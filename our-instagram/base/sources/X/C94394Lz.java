package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: X.4Lz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94394Lz {
    public int A00;
    public long A01;
    public C4M1 A02;
    public Runnable A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final Handler A08;
    public final UserSession A09;
    public final C94384Ly A0A;
    public final C4M0 A0B;
    public final LinkedList A0C;
    public final Map A0D;
    public final PriorityQueue A0E;

    public /* synthetic */ C94394Lz(Handler handler, UserSession userSession, C94384Ly c94384Ly) {
        C4M0 c4m0 = (C4M0) userSession.A01(C4M0.class, new C37056GUm(userSession, 46));
        C06090Tz c06090Tz = C06090Tz.A05;
        int A01 = (int) C18U.A01(c06090Tz, userSession, 36597321843477286L);
        long A00 = ((long) C18U.A00(c06090Tz, userSession, 37160271796830317L)) * 1000;
        int A012 = (int) C18U.A01(c06090Tz, userSession, 36597321843804968L);
        int A013 = (int) C18U.A01(c06090Tz, userSession, 36597321844001577L);
        C14360o3.A0B(handler, 2);
        C14360o3.A0B(c4m0, 4);
        this.A09 = userSession;
        this.A08 = handler;
        this.A0A = c94384Ly;
        this.A0B = c4m0;
        this.A04 = A01;
        this.A07 = A00;
        this.A05 = A012;
        this.A06 = A013;
        this.A0D = new LinkedHashMap();
        C4M1 c4m1 = C4M1.A02;
        this.A02 = c4m1;
        this.A01 = -1L;
        this.A0E = new PriorityQueue(5, new Comparator() { // from class: X.4M2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2BS.A00(((C5lP) obj).A02, ((C5lP) obj2).A02);
            }
        });
        this.A0C = new LinkedList();
        C4M3 c4m3 = C4M3.A06;
        A01(c4m3, c4m1, c4m1);
        C4M3 c4m32 = C4M3.A03;
        C4M1 c4m12 = C4M1.A04;
        A01(c4m32, c4m1, c4m12);
        C4M3 c4m33 = C4M3.A02;
        C4M1 c4m13 = C4M1.A03;
        A01(c4m33, c4m1, c4m13);
        A01(c4m3, c4m12, c4m1);
        A01(c4m32, c4m12, c4m12);
        A01(c4m33, c4m12, c4m13);
        A01(C4M3.A05, c4m12, c4m13);
        A01(C4M3.A04, c4m13, c4m1);
        A01(c4m3, c4m13, c4m13);
        A01(c4m32, c4m13, c4m13);
        A01(c4m33, c4m13, c4m13);
    }

    public static final void A00(C4M3 c4m3, C94394Lz c94394Lz, C5lP c5lP) {
        Object obj = c94394Lz.A0D.get(c94394Lz.A02);
        if (obj != null) {
            Object obj2 = ((Map) obj).get(c4m3);
            if (obj2 != null) {
                C4M1 c4m1 = (C4M1) obj2;
                c94394Lz.A02 = c4m1;
                int ordinal = c4m1.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            if (c4m3 == C4M3.A06) {
                                C94384Ly c94384Ly = c94394Lz.A0A;
                                if (c5lP != null) {
                                    c94384Ly.A00.A01(c5lP);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else if (c5lP != null) {
                                c94394Lz.A0E.add(c5lP);
                            }
                            int i = c94394Lz.A00;
                            if (i < c94394Lz.A06) {
                                c94394Lz.A00 = i + 1;
                                C94114Kx c94114Kx = c94394Lz.A0A.A00;
                                String str = ((AbstractC94124Ky) c94114Kx).A01;
                                if (str != null) {
                                    c94114Kx.A00.A05(ThreadFetchReason.BROADCAST_CHANNEL_SNAPSHOT_REQUEST, null, str, null, false);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        throw new RuntimeException();
                    }
                    if (c5lP != null) {
                        c94394Lz.A0E.add(c5lP);
                    }
                    long j = c94394Lz.A07;
                    Runnable runnable = c94394Lz.A03;
                    if (runnable != null && AbstractC114505Ev.A00(c94394Lz.A08, runnable)) {
                        return;
                    }
                    M1S m1s = new M1S(c94394Lz);
                    c94394Lz.A03 = m1s;
                    c94394Lz.A08.postDelayed(m1s, j);
                    return;
                }
                Runnable runnable2 = c94394Lz.A03;
                if (runnable2 != null) {
                    c94394Lz.A08.removeCallbacks(runnable2);
                }
                c94394Lz.A03 = null;
                if (c5lP != null) {
                    c94394Lz.A0A.A00.A01(c5lP);
                }
                long j2 = c94394Lz.A01;
                ArrayList arrayList = new ArrayList();
                Iterator it = c94394Lz.A0E.iterator();
                C14360o3.A07(it);
                while (it.hasNext()) {
                    C5lP c5lP2 = (C5lP) it.next();
                    Long l = c5lP2.A02;
                    if (l != null) {
                        long longValue = l.longValue();
                        if (longValue > c94394Lz.A01) {
                            j2++;
                            if (longValue == j2) {
                                arrayList.add(c5lP2);
                            }
                        }
                        it.remove();
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    return;
                }
                c94394Lz.A0A.A00.A02(arrayList);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[OctaneStateMachine] No transition available from ");
            sb.append(c94394Lz.A02);
            sb.append(" on event ");
            sb.append(c4m3);
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[OctaneStateMachine] No transitions available from ");
        sb2.append(c94394Lz.A02);
        throw new IllegalStateException(sb2.toString());
    }

    private final void A01(C4M3 c4m3, C4M1 c4m1, C4M1 c4m12) {
        Map map = this.A0D;
        Map map2 = (Map) map.get(c4m1);
        if (map2 == null) {
            map2 = new LinkedHashMap();
            map.put(c4m1, map2);
        }
        map2.put(c4m3, c4m12);
    }
}
