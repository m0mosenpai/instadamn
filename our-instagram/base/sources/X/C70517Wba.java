package X;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.Wba, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70517Wba implements C5T9 {
    public int A00;
    public C68702Vae A01;
    public SEK A02;
    public byte[] A03;
    public byte[] A04;
    public int A05;
    public HandlerThread A06;
    public InterfaceC71856X7o A07;
    public Q3c A08;
    public C5PN A09;
    public final InterfaceC71858X7q A0A;
    public final U9A A0B;
    public final InterfaceC72005XEt A0C;
    public final InterfaceC65243TgZ A0D;
    public final C4XO A0E;
    public final C71195Wpk A0F;
    public final List A0G;
    public final UUID A0H;
    public final Looper A0I;
    public final C4WZ A0J;
    public final InterfaceC71859X7r A0K;
    public final HashMap A0L;

    private void A04(byte[] bArr, int i, boolean z) {
        try {
            C68702Vae BKk = this.A0C.BKk(this.A0L, this.A0G, bArr, i);
            this.A01 = BKk;
            Q3c q3c = this.A08;
            C98264b5.A03.getAndIncrement();
            SystemClock.elapsedRealtime();
            AbstractC58318PtA.A1F(q3c, new SGH(BKk, z), 1);
        } catch (Exception e) {
            A02(this, e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if ("neg".equals(r4[r3 - 2]) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C70517Wba r6, java.lang.Exception r7, int r8) {
        /*
            boolean r0 = r7 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r0 == 0) goto L37
            r0 = r7
            android.media.MediaDrm$MediaDrmStateException r0 = (android.media.MediaDrm.MediaDrmStateException) r0
            java.lang.String r2 = r0.getDiagnosticInfo()
            r5 = 0
            if (r2 == 0) goto L6a
            java.lang.String r1 = "_"
            r0 = -1
            java.lang.String[] r4 = r2.split(r1, r0)
            int r3 = r4.length
            r1 = 2
            if (r3 < r1) goto L6a
            int r0 = r3 + (-1)
            r2 = r4[r0]
            r0 = 3
            if (r3 < r0) goto L2c
            int r3 = r3 - r1
            r1 = r4[r3]
            java.lang.String r0 = "neg"
            boolean r1 = r0.equals(r1)
            r0 = 1
            if (r1 != 0) goto L2d
        L2c:
            r0 = 0
        L2d:
            r2.getClass()     // Catch: java.lang.NumberFormatException -> L6a
            int r5 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L6a
            if (r0 == 0) goto L6a
            goto L69
        L37:
            boolean r0 = r7 instanceof android.media.MediaDrmResetException
            if (r0 != 0) goto L66
            r1 = 6002(0x1772, float:8.41E-42)
            boolean r0 = r7 instanceof android.media.NotProvisionedException
            if (r0 != 0) goto L6e
            boolean r0 = r7 instanceof android.media.DeniedByServerException
            if (r0 == 0) goto L48
            r1 = 6007(0x1777, float:8.418E-42)
            goto L6e
        L48:
            boolean r0 = r7 instanceof X.C40M
            if (r0 == 0) goto L4f
            r1 = 6001(0x1771, float:8.409E-42)
            goto L6e
        L4f:
            boolean r0 = r7 instanceof X.C68215VHx
            if (r0 == 0) goto L56
            r1 = 6003(0x1773, float:8.412E-42)
            goto L6e
        L56:
            boolean r0 = r7 instanceof X.VI6
            if (r0 == 0) goto L5d
            r1 = 6008(0x1778, float:8.419E-42)
            goto L6e
        L5d:
            r0 = 1
            if (r8 == r0) goto L66
            r0 = 2
            if (r8 != r0) goto L6e
            r1 = 6004(0x1774, float:8.413E-42)
            goto L6e
        L66:
            r1 = 6006(0x1776, float:8.416E-42)
            goto L6e
        L69:
            int r5 = -r5
        L6a:
            int r1 = com.google.android.exoplayer2.util.Util.A01(r5)
        L6e:
            X.5PN r0 = new X.5PN
            r0.<init>(r1, r7)
            r6.A09 = r0
            java.lang.String r1 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            X.AbstractC46512Bo.A05(r1, r0, r7)
            X.Wpk r0 = r6.A0F
            java.util.Set r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L86:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r0 = r1.next()
            X.4XY r0 = (X.C4XY) r0
            r0.A04(r7)
            goto L86
        L96:
            int r1 = r6.A00
            r0 = 4
            if (r1 == r0) goto L9e
            r0 = 1
            r6.A00 = r0
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70517Wba.A01(X.Wba, java.lang.Exception, int):void");
    }

    public static void A02(C70517Wba c70517Wba, Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            WbX wbX = (WbX) c70517Wba.A0A;
            wbX.A01.add(c70517Wba);
            if (wbX.A00 == null) {
                wbX.A00 = c70517Wba;
                c70517Wba.A06();
                return;
            }
            return;
        }
        int i = 2;
        if (z) {
            i = 1;
        }
        A01(c70517Wba, exc, i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:14|(2:15|16)|(7:18|19|20|21|(2:23|24)|34|24)|37|19|20|21|(0)|34|24) */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[Catch: NumberFormatException -> 0x0058, TryCatch #0 {NumberFormatException -> 0x0058, blocks: (B:21:0x0049, B:23:0x0051), top: B:20:0x0049 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.C70517Wba r8, boolean r9) {
        /*
            byte[] r7 = r8.A04
            r2 = 1
            r5 = 2
            byte[] r1 = r8.A03
            if (r1 != 0) goto Lc
            r8.A04(r7, r2, r9)
        Lb:
            return
        Lc:
            int r0 = r8.A00
            r6 = 4
            if (r0 == r6) goto L16
            X.XEt r0 = r8.A0C     // Catch: java.lang.Exception -> Lba
            r0.EKa(r7, r1)     // Catch: java.lang.Exception -> Lba
        L16:
            java.util.UUID r1 = X.C4YL.A04
            java.util.UUID r0 = r8.A0H
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9e
            A00(r8)
            byte[] r1 = r8.A04
            if (r1 == 0) goto L56
            X.XEt r0 = r8.A0C
            java.util.Map r3 = r0.E7R(r1)
            if (r3 == 0) goto L56
            java.lang.String r0 = "LicenseDurationRemaining"
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.NumberFormatException -> L3e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L3e
            if (r0 == 0) goto L3e
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L3e
            goto L43
        L3e:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L43:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "PlaybackDurationRemaining"
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.NumberFormatException -> L58
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L58
            if (r0 == 0) goto L58
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L58
            goto L5d
        L56:
            r1 = 0
            goto L66
        L58:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L5d:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r2, r0)
        L66:
            r1.getClass()
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            java.lang.Object r0 = r1.second
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r3 = java.lang.Math.min(r2, r0)
            r1 = 60
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L8f
            java.lang.String r0 = "Offline license has expired or will expire soon. Remaining seconds: "
            X.AnonymousClass001.A0Q(r0, r3)
            X.AbstractC46512Bo.A01()
            r8.A04(r7, r5, r9)
            return
        L8f:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L9e
            X.VI6 r0 = new X.VI6
            r0.<init>()
            A01(r8, r0, r5)
            return
        L9e:
            r8.A00 = r6
            X.Wpk r0 = r8.A0F
            java.util.Set r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        Laa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r1.next()
            X.4XY r0 = (X.C4XY) r0
            r0.A01()
            goto Laa
        Lba:
            r0 = move-exception
            A01(r8, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70517Wba.A03(X.Wba, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r2 == 4) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A05(X.C70517Wba r5) {
        /*
            int r2 = r5.A00
            r4 = 3
            if (r2 == r4) goto L9
            r1 = 4
            r0 = 0
            if (r2 != r1) goto La
        L9:
            r0 = 1
        La:
            r3 = 1
            if (r0 != 0) goto L5d
            X.XEt r2 = r5.A0C     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            byte[] r1 = r2.E2u()     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            r5.A04 = r1     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            X.4WZ r0 = r5.A0J     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            r2.Eb5(r0, r1)     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            byte[] r0 = r5.A04     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            X.X7o r0 = r2.ALv(r0)     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            r5.A07 = r0     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            r5.A00 = r4     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            X.Wpk r0 = r5.A0F     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            java.util.Set r0 = r0.A01()     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            java.util.Iterator r1 = r0.iterator()     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
        L2e:
            boolean r0 = r1.hasNext()     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r1.next()     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            X.4XY r0 = (X.C4XY) r0     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            r0.A03(r4)     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            goto L2e
        L3e:
            byte[] r0 = r5.A04     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            r0.getClass()     // Catch: android.media.NotProvisionedException -> L44 java.lang.Exception -> L57
            return r3
        L44:
            X.X7q r1 = r5.A0A
            X.WbX r1 = (X.WbX) r1
            java.util.Set r0 = r1.A01
            r0.add(r5)
            X.Wba r0 = r1.A00
            if (r0 != 0) goto L5b
            r1.A00 = r5
            r5.A06()
            goto L5b
        L57:
            r0 = move-exception
            A01(r5, r0, r3)
        L5b:
            r0 = 0
            return r0
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70517Wba.A05(X.Wba):boolean");
    }

    public final void A06() {
        SEK Biz = this.A0C.Biz();
        this.A02 = Biz;
        Q3c q3c = this.A08;
        C98264b5.A03.getAndIncrement();
        SystemClock.elapsedRealtime();
        AbstractC58318PtA.A1F(q3c, new SGH(Biz, true), 0);
    }

    public C70517Wba(Looper looper, C4WZ c4wz, InterfaceC71858X7q interfaceC71858X7q, InterfaceC71859X7r interfaceC71859X7r, InterfaceC72005XEt interfaceC72005XEt, InterfaceC65243TgZ interfaceC65243TgZ, C4XO c4xo, HashMap hashMap, List list, UUID uuid) {
        this.A0H = uuid;
        this.A0A = interfaceC71858X7q;
        this.A0K = interfaceC71859X7r;
        this.A0C = interfaceC72005XEt;
        list.getClass();
        this.A0G = Collections.unmodifiableList(list);
        this.A0L = hashMap;
        this.A0D = interfaceC65243TgZ;
        this.A0F = new C71195Wpk();
        this.A0E = c4xo;
        this.A0J = c4wz;
        this.A00 = 2;
        this.A0I = looper;
        this.A0B = new U9A(looper, this);
    }

    public static void A00(C70517Wba c70517Wba) {
        Thread currentThread = Thread.currentThread();
        Looper looper = c70517Wba.A0I;
        if (currentThread != looper.getThread()) {
            AbstractC46512Bo.A06("DefaultDrmSession", AnonymousClass001.A0u("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: ", currentThread.getName(), "\nExpected thread: ", looper.getThread().getName()), new IllegalStateException());
        }
    }

    @Override // X.C5T9
    public final void A7J(C4XY c4xy) {
        int i;
        A00(this);
        int i2 = this.A05;
        boolean z = false;
        if (i2 < 0) {
            AbstractC46512Bo.A03("DefaultDrmSession", AnonymousClass001.A0O("Session reference count less than zero: ", i2));
            this.A05 = 0;
        }
        if (c4xy != null) {
            C71195Wpk c71195Wpk = this.A0F;
            synchronized (c71195Wpk.A02) {
                ArrayList arrayList = new ArrayList(c71195Wpk.A00);
                arrayList.add(c4xy);
                c71195Wpk.A00 = Collections.unmodifiableList(arrayList);
                Map map = c71195Wpk.A03;
                Integer num = (Integer) map.get(c4xy);
                if (num == null) {
                    HashSet hashSet = new HashSet(c71195Wpk.A01);
                    hashSet.add(c4xy);
                    c71195Wpk.A01 = Collections.unmodifiableSet(hashSet);
                }
                int i3 = 1;
                if (num != null) {
                    i3 = 1 + num.intValue();
                }
                AbstractC37301Gc2.A1T(c4xy, map, i3);
            }
        }
        int i4 = this.A05 + 1;
        this.A05 = i4;
        if (i4 == 1) {
            if (this.A00 == 2) {
                z = true;
            }
            C4B8.A04(z);
            HandlerThread A0A = MSY.A0A("ExoPlayer:DrmRequestHandler");
            this.A06 = A0A;
            A0A.start();
            this.A08 = new Q3c(this.A06.getLooper(), this);
            if (A05(this)) {
                A03(this, true);
            }
        } else if (c4xy != null && (((i = this.A00) == 3 || i == 4) && this.A0F.A00(c4xy) == 1)) {
            c4xy.A03(this.A00);
        }
        C70519Wbc c70519Wbc = ((WbY) this.A0K).A00;
        if (c70519Wbc.A06 != -9223372036854775807L) {
            c70519Wbc.A09.remove(this);
            Handler handler = c70519Wbc.A01;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // X.C5T9
    public final InterfaceC71856X7o AtS() {
        A00(this);
        return this.A07;
    }

    @Override // X.C5T9
    public final C5PN B2Y() {
        A00(this);
        if (this.A00 == 1) {
            return this.A09;
        }
        return null;
    }

    @Override // X.C5T9
    public final UUID Bqc() {
        A00(this);
        return this.A0H;
    }

    @Override // X.C5T9
    public final int Bzy() {
        A00(this);
        return this.A00;
    }

    @Override // X.C5T9
    public final boolean E4V() {
        A00(this);
        return false;
    }

    @Override // X.C5T9
    public final void EE2(C4XY c4xy) {
        A00(this);
        int i = this.A05;
        if (i <= 0) {
            AbstractC46512Bo.A03("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.A05 = i2;
        if (i2 == 0) {
            this.A00 = 0;
            this.A0B.removeCallbacksAndMessages(null);
            Q3c q3c = this.A08;
            synchronized (q3c) {
                q3c.removeCallbacksAndMessages(null);
                q3c.A00 = true;
            }
            this.A08 = null;
            this.A06.quit();
            this.A06 = null;
            this.A07 = null;
            this.A09 = null;
            this.A01 = null;
            this.A02 = null;
            byte[] bArr = this.A04;
            if (bArr != null) {
                this.A0C.AIJ(bArr);
                this.A04 = null;
            }
        }
        if (c4xy != null) {
            C71195Wpk c71195Wpk = this.A0F;
            synchronized (c71195Wpk.A02) {
                Map map = c71195Wpk.A03;
                Integer num = (Integer) map.get(c4xy);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(c71195Wpk.A00);
                    arrayList.remove(c4xy);
                    c71195Wpk.A00 = Collections.unmodifiableList(arrayList);
                    int intValue = num.intValue();
                    if (intValue == 1) {
                        map.remove(c4xy);
                        HashSet hashSet = new HashSet(c71195Wpk.A01);
                        hashSet.remove(c4xy);
                        c71195Wpk.A01 = Collections.unmodifiableSet(hashSet);
                    } else {
                        AbstractC37301Gc2.A1T(c4xy, map, intValue - 1);
                    }
                }
            }
            if (c71195Wpk.A00(c4xy) == 0) {
                c4xy.A02();
            }
        }
        InterfaceC71859X7r interfaceC71859X7r = this.A0K;
        int i3 = this.A05;
        WbY wbY = (WbY) interfaceC71859X7r;
        if (i3 == 1) {
            C70519Wbc c70519Wbc = wbY.A00;
            if (c70519Wbc.A00 > 0) {
                long j = c70519Wbc.A06;
                if (j != -9223372036854775807L) {
                    c70519Wbc.A09.add(this);
                    Handler handler = c70519Wbc.A01;
                    handler.getClass();
                    handler.postAtTime(new Runnable() { // from class: X.WrM
                        @Override // java.lang.Runnable
                        public final void run() {
                            C70517Wba.this.EE2(null);
                        }
                    }, this, SystemClock.uptimeMillis() + j);
                }
            }
        } else if (i3 == 0) {
            C70519Wbc c70519Wbc2 = wbY.A00;
            c70519Wbc2.A08.remove(this);
            if (c70519Wbc2.A03 == this) {
                c70519Wbc2.A03 = null;
            }
            WbX wbX = c70519Wbc2.A07;
            java.util.Set set = wbX.A01;
            set.remove(this);
            if (wbX.A00 == this) {
                wbX.A00 = null;
                if (!set.isEmpty()) {
                    C70517Wba c70517Wba = (C70517Wba) set.iterator().next();
                    wbX.A00 = c70517Wba;
                    c70517Wba.A06();
                }
            }
            if (c70519Wbc2.A06 != -9223372036854775807L) {
                Handler handler2 = c70519Wbc2.A01;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                c70519Wbc2.A09.remove(this);
            }
        }
        C70519Wbc.A03(wbY.A00);
    }

    @Override // X.C5T9
    public final boolean EJQ(String str) {
        A00(this);
        InterfaceC72005XEt interfaceC72005XEt = this.A0C;
        byte[] bArr = this.A04;
        C4B8.A01(bArr);
        return interfaceC72005XEt.EJR(bArr, str);
    }
}
