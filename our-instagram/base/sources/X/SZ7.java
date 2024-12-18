package X;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class SZ7 {
    public static final Executor A06;
    public boolean A00;
    public final long A02;
    public final Runnable A03 = new Runnable() { // from class: X.TM3
        @Override // java.lang.Runnable
        public final void run() {
            SZ7 sz7 = SZ7.this;
            while (true) {
                long nanoTime = System.nanoTime();
                synchronized (sz7) {
                    Deque<C65158TeX> deque = sz7.A04;
                    C65158TeX c65158TeX = null;
                    long j = Long.MIN_VALUE;
                    int i = 0;
                    int i2 = 0;
                    for (C65158TeX c65158TeX2 : deque) {
                        List list = c65158TeX2.A0D;
                        int i3 = 0;
                        while (true) {
                            if (i3 < list.size()) {
                                Reference reference = (Reference) list.get(i3);
                                if (reference.get() != null) {
                                    i3++;
                                } else {
                                    StringBuilder A1C = AbstractC166987dD.A1C();
                                    A1C.append("A connection to ");
                                    A1C.append(c65158TeX2.A0E.A02.A0A);
                                    String A0x = AbstractC166997dE.A0x(" was leaked. Did you forget to close a response body?", A1C);
                                    C63220SfQ c63220SfQ = C63220SfQ.A01;
                                    Object obj = ((C64880TYg) reference).A00;
                                    if (c63220SfQ instanceof C65163Tec) {
                                        C65163Tec c65163Tec = (C65163Tec) c63220SfQ;
                                        C62574SGz c62574SGz = c65163Tec.A05;
                                        if (obj != null) {
                                            try {
                                                c62574SGz.A02.invoke(obj, new Object[0]);
                                            } catch (Exception unused) {
                                            }
                                        }
                                        c65163Tec.A03(A0x, null, 5);
                                    } else {
                                        if (obj == null) {
                                            A0x = AnonymousClass001.A0R(A0x, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
                                        }
                                        c63220SfQ.A03(A0x, (Throwable) obj, 5);
                                    }
                                    list.remove(i3);
                                    c65158TeX2.A0C = true;
                                    if (list.isEmpty()) {
                                        c65158TeX2.A04 = nanoTime - sz7.A02;
                                        break;
                                    }
                                }
                            } else if (list.size() > 0) {
                                i2++;
                            }
                        }
                        i++;
                        long j2 = nanoTime - c65158TeX2.A04;
                        if (j2 > j) {
                            c65158TeX = c65158TeX2;
                            j = j2;
                        }
                    }
                    long j3 = sz7.A02;
                    if (j < j3 && i <= sz7.A01) {
                        if (i > 0) {
                            j3 -= j;
                        } else if (i2 <= 0) {
                            sz7.A00 = false;
                            j3 = -1;
                        }
                        if (j3 == -1) {
                            return;
                        }
                        if (j3 > 0) {
                            long j4 = j3 / 1000000;
                            long j5 = j3 - (1000000 * j4);
                            synchronized (sz7) {
                                try {
                                    sz7.wait(j4, (int) j5);
                                } catch (InterruptedException unused2) {
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        deque.remove(c65158TeX);
                        AbstractC63404SjZ.A0A(c65158TeX.A06);
                    }
                }
            }
        }
    };
    public final Deque A04 = new ArrayDeque();
    public final C62461SCo A05 = new C62461SCo();
    public final int A01 = 5;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = AbstractC63404SjZ.A07;
        A06 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new TVC("OkHttp ConnectionPool", true));
    }

    public SZ7(TimeUnit timeUnit) {
        this.A02 = timeUnit.toNanos(5L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r13.A05 != X.TVx.A00) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
    
        if (r4.A02(r6) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        r13.A08.A01(r2, r4.A07.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0006, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0006, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0006, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(java.util.List r12, X.C62756SPn r13, X.C63026Saw r14, boolean r15) {
        /*
            r11 = this;
            java.util.Deque r0 = r11.A04
            java.util.Iterator r10 = r0.iterator()
        L6:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r4 = r10.next()
            X.TeX r4 = (X.C65158TeX) r4
            if (r15 == 0) goto L18
            X.THU r0 = r4.A09
            if (r0 == 0) goto L6
        L18:
            java.util.List r3 = r4.A0D
            int r1 = r3.size()
            int r0 = r4.A00
            if (r1 >= r0) goto L6
            boolean r0 = r4.A0C
            if (r0 != 0) goto L6
            X.SP2 r8 = r4.A0E
            X.SPn r1 = r8.A02
            boolean r0 = r1.A00(r13)
            if (r0 == 0) goto L6
            X.Sit r6 = r13.A0A
            java.lang.String r2 = r6.A02
            X.Sit r0 = r1.A0A
            java.lang.String r0 = r0.A02
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L86
            X.THU r0 = r4.A09
            if (r0 == 0) goto L6
            if (r12 == 0) goto L6
            int r7 = r12.size()
            r5 = 0
        L49:
            if (r5 >= r7) goto L6
            java.lang.Object r9 = r12.get(r5)
            X.SP2 r9 = (X.SP2) r9
            java.net.Proxy r0 = r9.A01
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 != r1) goto L83
            java.net.Proxy r0 = r8.A01
            java.net.Proxy$Type r0 = r0.type()
            if (r0 != r1) goto L83
            java.net.InetSocketAddress r1 = r8.A00
            java.net.InetSocketAddress r0 = r9.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L83
            javax.net.ssl.HostnameVerifier r1 = r13.A05
            X.TVx r0 = X.TVx.A00
            if (r1 != r0) goto L6
            boolean r0 = r4.A02(r6)
            if (r0 == 0) goto L6
            X.Sf4 r1 = r13.A08     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            X.SaK r0 = r4.A07     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            java.util.List r0 = r0.A00     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            r1.A01(r2, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            goto L86
        L83:
            int r5 = r5 + 1
            goto L49
        L86:
            X.TeX r0 = r14.A04
            if (r0 != 0) goto L98
            r14.A04 = r4
            java.lang.Object r1 = r14.A00
            X.TYg r0 = new X.TYg
            r0.<init>(r1, r14)
            r3.add(r0)
            r0 = 1
            return r0
        L98:
            java.lang.IllegalStateException r0 = X.AbstractC58318PtA.A0Z()
            throw r0
        L9d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SZ7.A00(java.util.List, X.SPn, X.Saw, boolean):boolean");
    }
}
