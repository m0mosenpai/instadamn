package X;

import android.content.Context;
import android.util.LruCache;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.7UR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7UR {
    public static C7UR A0A;
    public static final C1QY A0B;
    public final Context A00;
    public volatile boolean A09;
    public final C7UT A03 = new C7UT();
    public final C7UX A02 = new LruCache(100);
    public final ExecutorService A07 = Executors.newSingleThreadExecutor();
    public final ExecutorService A06 = Executors.newSingleThreadExecutor();
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();
    public final InterfaceC09390do A08 = AbstractC09440dt.A00(EnumC09460dv.A04, new C9EM(this, 19));
    public final InterfaceC08100bW A01 = new C1QF("IgSecureUriParser").A00;
    public final LinkedList A04 = new LinkedList();

    public static final long A00(FileChannel fileChannel) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        fileChannel.read(allocate);
        allocate.position(0);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        return allocate.getInt() & 4294967295L;
    }

    public static final void A01(C24261Gv c24261Gv, final C7UR c7ur, final Runnable runnable, final String str, final String str2, final boolean z, final boolean z2) {
        C59732oG AXI = c24261Gv.AXI(str2);
        if (AXI.A00 != null) {
            final boolean A04 = A04(c7ur, str2);
            final AbstractC60252p8 abstractC60252p8 = (AbstractC60252p8) AXI.A00();
            c7ur.A06.execute(new Runnable() { // from class: X.74z
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String A00 = AbstractC60252p8.this.A00();
                        C14360o3.A07(A00);
                        AnonymousClass750 anonymousClass750 = AnonymousClass750.A00;
                        String str3 = str;
                        boolean z3 = z;
                        boolean z4 = z2;
                        C7UR c7ur2 = c7ur;
                        C7UR c7ur3 = C7UR.A0A;
                        C1573774t c1573774t = new C1573774t(anonymousClass750.A00(c7ur2.A00, str3, A00, z3, z4), A00);
                        C7UX c7ux = c7ur2.A02;
                        String str4 = str2;
                        c7ux.put(str4, c1573774t);
                        c7ur2.A07.execute(new RunnableC65922TwT(c1573774t, c7ur2, str4, str3, A04, z4, z3));
                    } catch (IOException unused) {
                        runnable.run();
                    }
                }
            });
            return;
        }
        runnable.run();
    }

    public final void A05(C74M c74m, String str) {
        A06(c74m, str, false, false, false);
    }

    public final void A06(final C74M c74m, final String str, final boolean z, final boolean z2, final boolean z3) {
        if (str != null && C7US.A02(str)) {
            InterfaceC1572474f interfaceC1572474f = new InterfaceC1572474f() { // from class: X.74e
                /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
                
                    if (r1 != false) goto L8;
                 */
                @Override // X.InterfaceC1572474f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void DAg(final X.C24261Gv r19) {
                    /*
                        r18 = this;
                        r3 = 0
                        r5 = r19
                        X.C14360o3.A0B(r5, r3)
                        r0 = r18
                        X.7UR r6 = r2
                        java.lang.String r8 = r3
                        X.74M r2 = r1
                        boolean r10 = r4
                        boolean r11 = r5
                        boolean r12 = r6
                        X.7UR r0 = X.C7UR.A0A
                        monitor-enter(r6)
                        X.7UT r0 = r6.A03     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        java.lang.String r9 = r0.A00(r8)     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        X.7UX r0 = r6.A02     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        java.lang.Object r13 = r0.get(r9)     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        X.74t r13 = (X.C1573774t) r13     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        java.util.concurrent.ConcurrentHashMap r4 = r6.A05     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        java.lang.Object r0 = r4.get(r9)     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        if (r0 == 0) goto L36
                        boolean r1 = r0.isEmpty()     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        r0 = 0
                        if (r1 == 0) goto L37
                    L36:
                        r0 = 1
                    L37:
                        r1 = r0 ^ 1
                        java.lang.Object r0 = r4.get(r9)     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        java.util.Set r0 = (java.util.Set) r0     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        if (r0 != 0) goto L49
                        java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        r0.<init>()     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        r4.put(r9, r0)     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                    L49:
                        r0.add(r2)     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        if (r13 == 0) goto L80
                        java.lang.String r0 = "retimedavatar.webp"
                        boolean r0 = X.AbstractC001900j.A0a(r8, r0, r3)     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        if (r0 != 0) goto L80
                        X.X8Q r0 = r13.A00     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        if (r10 == 0) goto L5d
                        boolean r0 = r0 instanceof X.C70920WkP     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        goto L5f
                    L5d:
                        boolean r0 = r0 instanceof X.AnonymousClass752     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                    L5f:
                        if (r0 == 0) goto L80
                        boolean r0 = X.C7UR.A04(r6, r9)     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        if (r0 != 0) goto L7c
                        boolean r0 = r2.EiZ()     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        if (r0 == 0) goto L7c
                        java.util.concurrent.ExecutorService r0 = r6.A07     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        X.WxK r4 = new X.WxK     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        r12 = r4
                        r14 = r6
                        r15 = r9
                        r16 = r8
                        r17 = r10
                        r12.<init>(r13, r14, r15, r16, r17)     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        goto L8e
                    L7c:
                        X.C7UR.A02(r13, r6, r8, r9)     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        goto L9e
                    L80:
                        if (r1 != 0) goto L9e
                        X.74u r7 = new X.74u     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        r7.<init>()     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        java.util.concurrent.ExecutorService r0 = r6.A07     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        X.74v r4 = new X.74v     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        r4.<init>()     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                    L8e:
                        r0.execute(r4)     // Catch: java.net.URISyntaxException -> L92 java.lang.Throwable -> La0
                        goto L9e
                    L92:
                        r2 = move-exception
                        java.lang.String r1 = "GifCache"
                        java.lang.String r0 = "Got a gif url that is not valid URL: "
                        java.lang.String r0 = X.AnonymousClass001.A0R(r0, r8)     // Catch: java.lang.Throwable -> La0
                        X.C0w9.A06(r1, r0, r2)     // Catch: java.lang.Throwable -> La0
                    L9e:
                        monitor-exit(r6)
                        return
                    La0:
                        r0 = move-exception
                        monitor-exit(r6)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C74e.DAg(X.1Gv):void");
                }
            };
            if (this.A09) {
                C11T.A02(new JXQ(interfaceC1572474f, this));
                return;
            } else {
                this.A07.execute(new RunnableC1572574g(interfaceC1572474f, this));
                return;
            }
        }
        c74m.onError(str);
    }

    public final boolean A07(String str) {
        C14360o3.A0B(str, 0);
        String A00 = this.A03.A00(str);
        if (this.A02.get(A00) != null) {
            return true;
        }
        Collection collection = (Collection) this.A05.get(A00);
        if ((collection != null && !collection.isEmpty()) || !this.A09) {
            return false;
        }
        return ((C24261Gv) this.A08.getValue()).CKd(A00);
    }

    static {
        C1QX c1qx = new C1QX();
        c1qx.A04 = EnumC23341Bw.Image;
        c1qx.A03 = C1Ef.OnScreen;
        A0B = c1qx.A00();
    }

    public static final void A02(C1573774t c1573774t, C7UR c7ur, String str, String str2) {
        ConcurrentHashMap concurrentHashMap = c7ur.A05;
        java.util.Set<C74M> set = (java.util.Set) concurrentHashMap.get(str2);
        concurrentHashMap.remove(str2);
        if (set != null) {
            for (C74M c74m : set) {
                try {
                    X8Q x8q = c1573774t.A00;
                    if (x8q instanceof AnonymousClass752) {
                        XEC AM2 = ((AnonymousClass752) x8q).AM2();
                        if (A04(c7ur, str2)) {
                            String str3 = c1573774t.A01;
                            String A00 = ((AbstractC60252p8) ((C24261Gv) c7ur.A08.getValue()).AXI(AnonymousClass001.A0R(str2, "_audio")).A00()).A00();
                            C14360o3.A07(A00);
                            c74m.DQ4(AM2, str, str3, A00);
                        } else {
                            c74m.DQ3(AM2, str, c1573774t.A01);
                        }
                    } else if (x8q instanceof C70920WkP) {
                        c74m.DIW(((C70920WkP) x8q).A00, str, c1573774t.A01);
                    } else {
                        throw new RuntimeException();
                        break;
                    }
                } catch (C7VD unused) {
                    c74m.onError(str);
                }
            }
        }
    }

    public static final void A03(C7UR c7ur, String str, String str2) {
        if (new File(str).exists()) {
            FileChannel channel = new RandomAccessFile(str, "r").getChannel();
            for (long j = 12; j + 8 < channel.size(); j += 8 + A00(channel)) {
                channel.position(j);
                ByteBuffer allocate = ByteBuffer.allocate(4);
                channel.read(allocate);
                byte[] array = allocate.array();
                C14360o3.A07(array);
                if (new String(array, C15W.A05).equals("SOUN")) {
                    ByteBuffer allocate2 = ByteBuffer.allocate((int) A00(channel));
                    A00(channel);
                    channel.read(allocate2);
                    InterfaceC09390do interfaceC09390do = c7ur.A08;
                    C24261Gv c24261Gv = (C24261Gv) interfaceC09390do.getValue();
                    String A0R = AnonymousClass001.A0R(str2, "_audio");
                    byte[] array2 = allocate2.array();
                    C14360o3.A07(array2);
                    C7US.A01(c24261Gv, A0R, array2);
                    ((AbstractC60252p8) ((C24261Gv) interfaceC09390do.getValue()).AXI(AnonymousClass001.A0R(str2, "_audio")).A00()).A00();
                    return;
                }
            }
        }
    }

    public static final boolean A04(C7UR c7ur, String str) {
        C59732oG AXI = ((C24261Gv) c7ur.A08.getValue()).AXI(AnonymousClass001.A0R(str, "_audio"));
        if (AXI.A00 != null && new File(((AbstractC60252p8) AXI.A00()).A00()).exists()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.util.LruCache, X.7UX] */
    public C7UR(Context context) {
        this.A00 = context;
    }
}
