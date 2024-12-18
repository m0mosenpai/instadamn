package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6TH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6TH implements C6FI {
    public static final AtomicInteger A0Q = new AtomicInteger(0);
    public C6TN A00;
    public C79243gV A01;
    public C65743TtI A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public C140216Vz A0A;
    public C2W2 A0B;
    public C135266Ab A0C;
    public C6TO A0D;
    public Object A0E;
    public boolean A0F;
    public final int A0G;
    public final long A0H;
    public final C6TI A0I;
    public final Object A0J;
    public final List A0K;
    public final Context A0L;
    public final C6TG A0M;
    public final Object A0N;
    public final Executor A0O;
    public final AbstractC79173gO[] A0P;

    public static final void A01(C6TH c6th) {
        C79243gV c79243gV;
        Object obj;
        C79243gV c79243gV2;
        synchronized (c6th) {
            C6TG c6tg = c6th.A0M;
            C135266Ab c135266Ab = c6th.A0C;
            C79243gV c79243gV3 = null;
            if (c135266Ab != null) {
                c79243gV = c135266Ab.A01;
                obj = c135266Ab.A02;
            } else {
                c79243gV = null;
                obj = null;
            }
            c6tg.AIg(c79243gV, obj, c6th.A03);
            C79243gV c79243gV4 = c6th.A01;
            C135266Ab c135266Ab2 = c6th.A0C;
            if (c135266Ab2 != null) {
                c79243gV2 = c135266Ab2.A01;
            } else {
                c79243gV2 = null;
            }
            if (C14360o3.A0K(c79243gV4, c79243gV2)) {
                return;
            }
            C135266Ab c135266Ab3 = c6th.A0C;
            if (c135266Ab3 != null) {
                c79243gV3 = c135266Ab3.A01;
            }
            c6th.A01 = c79243gV3;
            C65743TtI c65743TtI = c6th.A02;
            if (c65743TtI == null) {
                return;
            }
            c65743TtI.A01(c6th.A01);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        if (r1.A02 == r14.A09) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C6TH r14, int[] r15) {
        /*
            monitor-enter(r14)
            boolean r0 = r14.A0F     // Catch: java.lang.Throwable -> Lb7
            if (r0 != 0) goto L7
            goto La5
        L7:
            X.2W2 r5 = r14.A0B     // Catch: java.lang.Throwable -> Lb7
            if (r5 == 0) goto Laf
            X.6Vz r1 = r14.A0A     // Catch: java.lang.Throwable -> Lb7
            if (r1 == 0) goto L24
            X.2W2 r0 = r1.A03     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = X.C14360o3.A0K(r0, r5)     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto L24
            long r3 = r14.A09     // Catch: java.lang.Throwable -> Lb7
            long r1 = r1.A02     // Catch: java.lang.Throwable -> Lb7
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L24
        L1f:
            X.6Vz r6 = r14.A0A     // Catch: java.lang.Throwable -> Lb7
            if (r6 == 0) goto La7
            goto L40
        L24:
            android.content.Context r4 = r14.A0L     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r7 = r14.A0N     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r8 = r14.A0E     // Catch: java.lang.Throwable -> Lb7
            int r10 = r14.A07     // Catch: java.lang.Throwable -> Lb7
            int r0 = r10 + 1
            r14.A07 = r0     // Catch: java.lang.Throwable -> Lb7
            int r11 = r14.A06     // Catch: java.lang.Throwable -> Lb7
            X.6Ab r6 = r14.A0C     // Catch: java.lang.Throwable -> Lb7
            X.3gO[] r9 = r14.A0P     // Catch: java.lang.Throwable -> Lb7
            long r12 = r14.A09     // Catch: java.lang.Throwable -> Lb7
            X.6Vz r3 = new X.6Vz     // Catch: java.lang.Throwable -> Lb7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb7
            r14.A0A = r3     // Catch: java.lang.Throwable -> Lb7
            goto L1f
        L40:
            monitor-exit(r14)
            java.lang.Object r5 = r6.A00()
            X.6Ab r5 = (X.C135266Ab) r5
            monitor-enter(r14)
            long r2 = r14.A09     // Catch: java.lang.Throwable -> Lb7
            long r0 = r6.A02     // Catch: java.lang.Throwable -> Lb7
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 0
            if (r4 != 0) goto L52
            r0 = 1
        L52:
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L6e
            int r1 = r6.A01     // Catch: java.lang.Throwable -> Lb7
            int r0 = r14.A04     // Catch: java.lang.Throwable -> Lb7
            if (r1 <= r0) goto L6e
            X.6Ab r0 = r14.A0C     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = X.C14360o3.A0K(r0, r5)     // Catch: java.lang.Throwable -> Lb7
            if (r0 != 0) goto L6e
            r14.A04 = r1     // Catch: java.lang.Throwable -> Lb7
            int r0 = r6.A00     // Catch: java.lang.Throwable -> Lb7
            r14.A03 = r0     // Catch: java.lang.Throwable -> Lb7
            r14.A0C = r5     // Catch: java.lang.Throwable -> Lb7
            r2 = 1
            goto L6f
        L6e:
            r2 = 0
        L6f:
            X.6Vz r0 = r14.A0A     // Catch: java.lang.Throwable -> Lb7
            boolean r1 = X.C14360o3.A0K(r0, r6)     // Catch: java.lang.Throwable -> Lb7
            r0 = 0
            if (r1 == 0) goto L7a
            r14.A0A = r0     // Catch: java.lang.Throwable -> Lb7
        L7a:
            monitor-exit(r14)
            if (r15 == 0) goto L8b
            X.3gV r1 = r5.A01
            int r0 = r1.A01()
            r15[r4] = r0
            int r0 = r1.A00()
            r15[r3] = r0
        L8b:
            if (r2 == 0) goto La6
            boolean r0 = X.AbstractC79383gk.A03()
            if (r0 == 0) goto L97
            A01(r14)
            return
        L97:
            X.6TI r2 = r14.A0I
            r1 = 99
            boolean r0 = r2.hasMessages(r1)
            if (r0 != 0) goto La6
            r2.sendEmptyMessage(r1)
            return
        La5:
            monitor-exit(r14)
        La6:
            return
        La7:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb7
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb7
            goto Lb6
        Laf:
            java.lang.String r0 = "Tried executing the layout step before resolving a tree"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb7
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb7
        Lb6:
            throw r1     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6TH.A02(X.6TH, int[]):void");
    }

    public static final synchronized boolean A03(C6TH c6th, C6TO c6to, C6AY c6ay) {
        boolean z;
        synchronized (c6th) {
            int i = c6to.A01;
            z = true;
            if (i > c6th.A05) {
                c6th.A05 = i;
                c6th.A0B = c6ay.A00;
                c6th.A06 = c6to.A00;
                c6th.A0E = c6ay.A01;
                List list = c6ay.A02;
                if (list != null && !list.isEmpty()) {
                    C15500q5.A00(c6th.A0K).removeAll(list);
                }
            } else {
                z = false;
            }
            if (C14360o3.A0K(c6th.A0D, c6to)) {
                c6th.A0D = null;
            }
        }
        return z;
    }

    public final void A04(long j, int[] iArr) {
        C6TO c6to;
        synchronized (this) {
            if (!this.A0F || this.A09 != j) {
                this.A0F = true;
                this.A09 = j;
            }
            C79243gV c79243gV = this.A01;
            if (c79243gV != null && AbstractC78603fS.A02(j, c79243gV.A01, AbstractC78673fZ.A00(c79243gV.A01(), c79243gV.A00()))) {
                if (iArr != null) {
                    iArr[0] = c79243gV.A01();
                    iArr[1] = c79243gV.A00();
                }
            } else {
                C135266Ab c135266Ab = this.A0C;
                if (c135266Ab != null) {
                    C79243gV c79243gV2 = c135266Ab.A01;
                    if (AbstractC78603fS.A02(j, c79243gV2.A01, AbstractC78673fZ.A00(c79243gV2.A01(), c79243gV2.A00()))) {
                        A01(this);
                        if (iArr != null) {
                            C79243gV c79243gV3 = c135266Ab.A01;
                            iArr[0] = c79243gV3.A01();
                            iArr[1] = c79243gV3.A00();
                        }
                    }
                }
                if (this.A00 == null) {
                    if (iArr != null) {
                        iArr[0] = 0;
                        iArr[1] = 0;
                    }
                } else {
                    if (this.A0B == null) {
                        c6to = this.A0D;
                        c6to.getClass();
                    } else {
                        c6to = null;
                    }
                    if (c6to != null) {
                        A03(this, c6to, (C6AY) c6to.A00());
                    }
                    A02(this, iArr);
                }
            }
        }
    }

    @Override // X.C6FI
    public final void ASi(InterfaceC30791DgS interfaceC30791DgS) {
        C6TN c6tn;
        synchronized (this) {
            this.A0K.add(interfaceC30791DgS);
            c6tn = this.A00;
        }
        if (c6tn != null) {
            C6TI c6ti = this.A0I;
            Object obj = this.A0J;
            c6ti.removeCallbacksAndMessages(obj);
            c6ti.postAtTime(new RunnableC29572D0z(this), obj, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0ps, java.lang.Object] */
    public static final void A00(C6TN c6tn, final C6TH c6th, boolean z) {
        List arrayList;
        final ?? obj = new Object();
        synchronized (c6th) {
            if (c6tn == null) {
                if (c6th.A0K.isEmpty()) {
                    return;
                }
            } else {
                c6th.A00 = c6tn;
            }
            C6TN c6tn2 = c6th.A00;
            if (c6tn2 != null) {
                C136336Fm c136336Fm = new C136336Fm(c6th, c6th.A0N);
                C2W2 c2w2 = c6th.A0B;
                Object obj2 = c6th.A0E;
                List list = c6th.A0K;
                if (list.isEmpty()) {
                    arrayList = C16930sl.A00;
                } else {
                    arrayList = new ArrayList(list);
                }
                int i = c6th.A08;
                c6th.A08 = i + 1;
                C6TO c6to = new C6TO(c2w2, c6tn2, c136336Fm, obj2, arrayList, i, C1H4.A00(((System.nanoTime() - c6th.A0H) * 1.0d) / c6th.A0G));
                obj.A00 = c6to;
                c6th.A0D = c6to;
                if (z) {
                    c6th.A0O.execute(new Runnable() { // from class: X.6TQ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6TH c6th2 = C6TH.this;
                            C6TO c6to2 = (C6TO) obj.A00;
                            if (C6TH.A03(c6th2, c6to2, (C6AY) c6to2.A00())) {
                                C6TH.A02(c6th2, null);
                            }
                        }
                    });
                    return;
                }
                C6TO c6to2 = (C6TO) obj.A00;
                if (!A03(c6th, c6to2, (C6AY) c6to2.A00())) {
                    return;
                }
                A02(c6th, null);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6TI] */
    public C6TH(Context context, C6TG c6tg, Object obj, Executor executor, AbstractC79173gO[] abstractC79173gOArr) {
        this.A0L = context;
        this.A0M = c6tg;
        this.A0N = obj;
        this.A0P = abstractC79173gOArr;
        this.A0O = executor;
        final Looper mainLooper = Looper.getMainLooper();
        C14360o3.A07(mainLooper);
        this.A0I = new Handler(mainLooper) { // from class: X.6TI
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C14360o3.A0B(message, 0);
                int i = message.what;
                if (i == 99) {
                    C6TH.A01(this);
                    return;
                }
                throw new RuntimeException(AnonymousClass001.A0O("Unknown message: ", i));
            }
        };
        A0Q.incrementAndGet();
        this.A05 = -1;
        this.A06 = -1;
        this.A0K = new ArrayList();
        this.A0G = AbstractC63152ts.A00(context);
        this.A0H = System.nanoTime();
        this.A04 = -1;
        this.A03 = -1;
        this.A09 = C78443fA.A00.A00(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.A0J = new Object();
    }
}
