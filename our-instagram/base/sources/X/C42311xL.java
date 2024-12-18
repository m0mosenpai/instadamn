package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1xL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42311xL implements InterfaceC12870lZ, InterfaceC13000lm {
    public boolean A00;
    public final C42201xA A01;
    public final Map A02;
    public final ReentrantReadWriteLock A03;
    public final UserSession A04;
    public final boolean A05;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r0 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C42311xL(com.instagram.common.session.UserSession r4) {
        /*
            r3 = this;
            r0 = 1
            X.C14360o3.A0B(r4, r0)
            r3.<init>()
            r3.A04 = r4
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r3.A03 = r0
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36314485358594687(0x8103d500000a7f, double:3.0287649952462924E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L29
            r0 = 36314485362395787(0x8103d5003a0a8b, double:3.0287649976501234E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            r2 = 1
            if (r0 != 0) goto L2a
        L29:
            r2 = 0
        L2a:
            r3.A05 = r2
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.A02 = r0
            X.0sk r1 = X.C16920sk.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>"
            X.C14360o3.A0C(r1, r0)
            X.1xA r0 = X.AbstractC42021ws.A01(r1)
            r3.A01 = r0
            if (r2 == 0) goto L46
            X.C218914p.A05(r3)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42311xL.<init>(com.instagram.common.session.UserSession):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012e A[Catch: all -> 0x01ff, TryCatch #0 {all -> 0x01ff, blocks: (B:9:0x0024, B:13:0x0030, B:16:0x003e, B:17:0x0047, B:19:0x004d, B:21:0x0058, B:23:0x005c, B:24:0x01db, B:25:0x01df, B:30:0x0070, B:33:0x007e, B:34:0x0087, B:36:0x008d, B:38:0x0098, B:40:0x01d5, B:42:0x00a4, B:43:0x00b4, B:45:0x00ba, B:47:0x00d6, B:49:0x00e2, B:51:0x00e7, B:56:0x00ff, B:58:0x0103, B:60:0x010b, B:62:0x010f, B:64:0x0115, B:65:0x0119, B:67:0x011d, B:69:0x0123, B:72:0x012e, B:74:0x0134, B:77:0x01d1, B:82:0x0156, B:84:0x0166, B:86:0x016a, B:89:0x018f, B:91:0x0199, B:93:0x019d, B:95:0x01a3, B:96:0x01a7, B:98:0x01ab, B:100:0x01b1, B:103:0x01b9, B:105:0x01be, B:111:0x015f, B:112:0x00f0, B:115:0x01e0, B:121:0x009c, B:122:0x0064), top: B:8:0x0024 }] */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.0yX, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0yX, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.util.List r33, java.util.List r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42311xL.A00(java.util.List, java.util.List, boolean):void");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
            if (this.A05) {
                C218914p.A06(this);
            }
            this.A02.clear();
            C42201xA c42201xA = this.A01;
            C16920sk c16920sk = C16920sk.A00;
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            c42201xA.accept(c16920sk);
            this.A00 = true;
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int i;
        int A03 = C0f9.A03(1251651501);
        if (this.A05) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                if (!this.A00) {
                    this.A02.clear();
                    C42201xA c42201xA = this.A01;
                    C16920sk c16920sk = C16920sk.A00;
                    C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                    c42201xA.accept(c16920sk);
                } else {
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                }
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C0f9.A0A(-2091376554, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(399907999, C0f9.A03(193786123));
    }
}
