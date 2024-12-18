package X;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.15o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C221315o {
    public C221515q A00;
    public C221515q A01;
    public C221515q A02;
    public final InterfaceC12870lZ A03 = new InterfaceC12870lZ() { // from class: X.15p
        @Override // X.InterfaceC12870lZ
        public final void onAppBackgrounded() {
            int A03 = C0f9.A03(-1419744922);
            C221315o c221315o = C221315o.this;
            C221515q c221515q = c221315o.A01;
            c221515q.A04 = true;
            c221515q.A02 = -1L;
            C221315o.A01(c221315o);
            C0f9.A0A(-1300922442, A03);
        }

        @Override // X.InterfaceC12870lZ
        public final void onAppForegrounded() {
            int A03 = C0f9.A03(582367679);
            C221315o c221315o = C221315o.this;
            C221515q c221515q = c221315o.A01;
            c221515q.A04 = false;
            c221515q.A02 = SystemClock.uptimeMillis();
            C221315o.A01(c221315o);
            C0f9.A0A(-1441552418, A03);
        }
    };
    public final List A04 = new CopyOnWriteArrayList();
    public final C218914p A05;
    public final C13920nI A06;

    public static void A00(C47262Es c47262Es, C221315o c221315o) {
        long j;
        C221515q c221515q = c221315o.A00;
        int i = c221515q.A00;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    j = c221515q.A02;
                } else {
                    throw new IllegalStateException(AnonymousClass001.A0O("Startup type not supported: ", i));
                }
            } else {
                j = c221515q.A01;
            }
        } else {
            j = -1;
        }
        C47232Ep c47232Ep = c47262Es.A00;
        C2Et c2Et = c47232Ep.A02;
        c2Et.A00 = i;
        c2Et.A06 = j;
        C47232Ep.A00(c47232Ep);
    }

    public static void A01(final C221315o c221315o) {
        int i;
        while (true) {
            C221515q c221515q = c221315o.A00;
            C221515q c221515q2 = c221315o.A01;
            if (!c221515q.equals(c221515q2)) {
                C221515q c221515q3 = c221315o.A02;
                C221515q.A00(c221515q3, c221515q);
                C221515q.A00(c221515q, c221515q2);
                if (c221515q3.A00 != c221515q.A00) {
                    Iterator it = c221315o.A04.iterator();
                    while (it.hasNext()) {
                        A00((C47262Es) it.next(), c221315o);
                    }
                }
                if (c221515q.A01 != -1) {
                    if (c221515q3.A01 == -1) {
                        Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: X.15r
                            @Override // android.os.MessageQueue.IdleHandler
                            public final boolean queueIdle() {
                                C221315o c221315o2 = C221315o.this;
                                c221315o2.A01.A03 = true;
                                C221315o.A01(c221315o2);
                                return false;
                            }
                        });
                    }
                    boolean z = c221515q.A04;
                    int i2 = c221515q.A00;
                    if (z) {
                        if (i2 != 0) {
                            i = 0;
                            c221515q2.A00 = i;
                        }
                    } else if (i2 == 0) {
                        i = 1;
                        if (c221515q3.A03) {
                            i = 2;
                        }
                        c221515q2.A00 = i;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.15q] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.15q] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.15q] */
    public C221315o(C218914p c218914p, C13920nI c13920nI) {
        this.A06 = c13920nI;
        this.A05 = c218914p;
        ?? obj = new Object();
        obj.A04 = true;
        obj.A03 = false;
        obj.A01 = -1L;
        obj.A02 = -1L;
        obj.A00 = 0;
        this.A00 = obj;
        ?? obj2 = new Object();
        C221515q.A00(obj2, obj);
        this.A02 = obj2;
        ?? obj3 = new Object();
        C221515q.A00(obj3, obj);
        this.A01 = obj3;
    }
}
