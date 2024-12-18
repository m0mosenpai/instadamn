package X;

import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4RT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4RT {
    public int A00;
    public int A01;
    public long A04;
    public long A05;
    public Surface A06;
    public C4SS A07;
    public C459529d A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public volatile Surface A0C;
    public final /* synthetic */ C4RQ A0D;
    public int A03 = -1;
    public int A02 = -1;

    public static void A05(C4RT c4rt) {
        c4rt.A0A = false;
        c4rt.A01 = 0;
        c4rt.A00 = 0;
        c4rt.A07 = null;
        C4RQ c4rq = c4rt.A0D;
        AtomicInteger atomicInteger = C4RQ.A0b;
        c4rq.A0P = 1.0f;
        c4rt.A04 = 0L;
        c4rt.A05 = 0L;
        c4rq.A0U = 0L;
        c4rq.A0X = false;
        c4rq.A0B.set(new C4RU());
        c4rq.A0N.set(C4RV.A0D);
        List list = c4rq.A0L;
        synchronized (list) {
            list.clear();
            c4rq.A00 = -1L;
        }
        c4rt.A0B = false;
    }

    public C4RT(C4RQ c4rq) {
        this.A0D = c4rq;
    }

    public static C459529d A00(C4RT c4rt) {
        C459529d c459529d = c4rt.A08;
        if (c459529d != null) {
            return c459529d;
        }
        throw new RemoteException("No service api available");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r17.A07.A0B != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C4RT r17) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4RT.A01(X.4RT):void");
    }

    public static void A02(C4RT c4rt) {
        String str;
        C4SS c4ss = c4rt.A07;
        if (c4ss != null) {
            str = c4ss.A0K.A0G;
        } else {
            str = null;
        }
        String.valueOf(str);
    }

    public static void A03(C4RT c4rt) {
        C4RQ c4rq = c4rt.A0D;
        AtomicInteger atomicInteger = C4RQ.A0b;
        c4rq.A0U = 0L;
        long[] jArr = c4rq.A0O;
        jArr[1] = 0;
        jArr[0] = 0;
        if (c4rq.A0I()) {
            c4rq.A0S = 0L;
            c4rt.A06 = null;
            c4rq.hashCode();
            A02(c4rt);
        }
    }

    public static void A04(C4RT c4rt) {
        String str;
        C4RQ c4rq = c4rt.A0D;
        AtomicInteger atomicInteger = C4RQ.A0b;
        synchronized (c4rq.A0K) {
            C95544Ro c95544Ro = c4rq.A02;
            if (c95544Ro != null) {
                long A08 = c4rq.A08();
                String str2 = c95544Ro.A06;
                if (str2 == null) {
                    str2 = C95544Ro.A02(c95544Ro);
                }
                C95564Rq c95564Rq = c95544Ro.A0B;
                c95564Rq.A00(C4TA.A0J, str2);
                c95564Rq.A01(str2);
                c95544Ro.A06 = null;
                C95904Sz A00 = c95544Ro.A0A.A00(c95544Ro.A02, str2);
                if (A00 != null) {
                    if (c95544Ro.A0C.A0G) {
                        str = "reset";
                    } else {
                        str = "requested_pause";
                    }
                    A00.A01(null, null, null, null, null, str, str2, null, null, null, A08, c95544Ro.A01, SystemClock.elapsedRealtime(), false);
                }
            }
        }
        try {
            try {
                if (!c4rq.A0I()) {
                    C4RQ.A05(c4rq, "Before reset(), service player was evicted. Lazy recover at next play()", new Object[0]);
                } else {
                    C459529d A002 = A00(c4rt);
                    long j = c4rq.A0S;
                    C2QC.A03("id [%d]: reset", Long.valueOf(j));
                    C95794Sn A003 = A002.A0c.A00(j);
                    if (A003 == null) {
                        C4RQ.A05(c4rq, "When reset(), service player is noticed to be evicted earlier. Lazy recover at next play()", new Object[0]);
                        A03(c4rt);
                    } else {
                        C95794Sn.A0E(A003, "Reset", new Object[0]);
                        C95794Sn.A07(A003.A0G.obtainMessage(11), A003);
                    }
                }
                c4rq.hashCode();
                A02(c4rt);
            } catch (RemoteException e) {
                C4RQ.A04(c4rq, "Error occurs while pausing the video", e, new Object[0]);
            }
        } finally {
            A05(c4rt);
        }
    }

    public static void A06(C4RT c4rt, C4RU c4ru) {
        boolean z;
        C4RQ c4rq = c4rt.A0D;
        AtomicInteger atomicInteger = C4RQ.A0b;
        AtomicReference atomicReference = c4rq.A0B;
        synchronized (atomicReference) {
            if (((C4RU) atomicReference.get()).A0H <= c4ru.A0H) {
                atomicReference.set(c4ru);
                if (c4ru.A0C < c4rq.A0U) {
                    z = true;
                } else if (c4ru.A0Q) {
                    z = false;
                }
                c4rq.A0Y = z;
            }
        }
    }
}
