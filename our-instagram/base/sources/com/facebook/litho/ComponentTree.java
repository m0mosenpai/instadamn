package com.facebook.litho;

import X.AbstractC09770fa;
import X.AbstractC170427iv;
import X.AbstractC50692Uq;
import X.AbstractC50812Vc;
import X.AbstractC75843ap;
import X.AbstractC76013b6;
import X.AbstractC76113bG;
import X.AbstractRunnableC51502Xx;
import X.AnonymousClass001;
import X.C00O;
import X.C07X;
import X.C1124455w;
import X.C1124555x;
import X.C125975mo;
import X.C14360o3;
import X.C170547j7;
import X.C206999Ee;
import X.C212109af;
import X.C25946Bdq;
import X.C2V3;
import X.C2VK;
import X.C2VL;
import X.C2VM;
import X.C2VN;
import X.C2VO;
import X.C2VX;
import X.C2VY;
import X.C2Vj;
import X.C2XE;
import X.C2XK;
import X.C2XL;
import X.C2XM;
import X.C2XN;
import X.C2XO;
import X.C2XP;
import X.C2XS;
import X.C2XU;
import X.C2XV;
import X.C2Z5;
import X.C50882Vk;
import X.C51132Wj;
import X.C51182Wr;
import X.C51302Xd;
import X.C57Z;
import X.C75703ab;
import X.C75713ac;
import X.C75723ad;
import X.C75763ah;
import X.C75793ak;
import X.C75803al;
import X.C75833ao;
import X.C75903av;
import X.C75983b3;
import X.C78373f3;
import X.C80503if;
import X.C9IO;
import X.InterfaceC09390do;
import X.InterfaceC1124255u;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC170287ih;
import X.InterfaceC51012Vx;
import X.InterfaceC75873as;
import X.InterfaceC89283yU;
import X.RunnableC49919M2m;
import X.RunnableC49920M2n;
import X.YB8;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.viewpager.widget.ViewPager;
import com.facebook.litho.ComponentTree;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class ComponentTree implements C2VK, C2VL, C2VM, C2VN, C2VO {
    public static final ThreadLocal A0k = new ThreadLocal();
    public static volatile Looper A0l;
    public int A00;
    public int A01;
    public int A02;
    public AbstractC50812Vc A03;
    public C75903av A04;
    public C50882Vk A05;
    public C50882Vk A06;
    public LithoView A07;
    public InterfaceC51012Vx A08;
    public C78373f3 A09;
    public C75803al A0A;
    public C2VY A0B;
    public String A0C;
    public String A0D;
    public List A0E;
    public boolean A0G;
    public boolean A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public C9IO A0L;
    public C75983b3 A0M;
    public C212109af A0N;
    public C2XU A0O;
    public C2XU A0P;
    public C2VY A0Q;
    public List A0R;
    public boolean A0S;
    public boolean A0T;
    public final int A0U;
    public final AccessibilityManager A0V;
    public final C2XE A0W;
    public final C2XN A0X;
    public final Runnable A0Y;
    public final List A0Z;
    public final List A0a;
    public final C75763ah A0b;
    public final C2XP A0c;
    public final C2XU A0d;
    public final Object A0e;
    public final Object A0f;
    public final Object A0g;
    public final boolean A0i;
    public volatile C170547j7 A0j;
    public boolean A0F = false;
    public final Object A0h = new Object();

    public static void A04(AbstractC50812Vc abstractC50812Vc, ComponentTree componentTree, C2Vj c2Vj, C2XU c2xu, int i, int i2, int i3, boolean z) {
        AbstractC50812Vc abstractC50812Vc2 = abstractC50812Vc;
        if (abstractC50812Vc == null) {
            abstractC50812Vc2 = new C75723ad();
        }
        A06(abstractC50812Vc2, componentTree, c2Vj, c2xu, null, i, i2, i3, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00b4, code lost:
    
        if (r3.isEmpty() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00a0, code lost:
    
        if (r13.A0a.isEmpty() == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A09(final com.facebook.litho.ComponentTree r13, X.C78373f3 r14, X.C2Vj r15, final int r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A09(com.facebook.litho.ComponentTree, X.3f3, X.2Vj, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r14 == 6) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.9IO, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0A(final X.C78373f3 r11, X.C2Vj r12, final java.lang.String r13, final int r14, final int r15, final int r16, boolean r17) {
        /*
            r10 = this;
            r7 = r14
            if (r14 == 0) goto Ld
            r0 = 2
            if (r14 == r0) goto Ld
            r0 = 4
            if (r14 == r0) goto Ld
            r1 = 6
            r0 = 0
            if (r14 != r1) goto Le
        Ld:
            r0 = 1
        Le:
            r3 = r0 ^ 1
            r6 = r12
            if (r3 == 0) goto L23
            if (r12 == 0) goto L23
            java.lang.String r1 = "Cannot generate output for async layout calculation (source = "
            java.lang.String r0 = ")"
            java.lang.String r0 = X.AnonymousClass001.A0c(r1, r0, r14)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L23:
            r4 = r10
            java.lang.Object r2 = r10.A0e
            monitor-enter(r2)
            X.9IO r1 = r10.A0L     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L35
            X.2VY r0 = r10.A0Q     // Catch: java.lang.Throwable -> L57
            X.2VX r0 = (X.C2VX) r0     // Catch: java.lang.Throwable -> L57
            r0.removeCallbacks(r1)     // Catch: java.lang.Throwable -> L57
            r0 = 0
            r10.A0L = r0     // Catch: java.lang.Throwable -> L57
        L35:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
            r5 = r11
            r8 = r15
            r9 = r16
            if (r3 == 0) goto L53
            if (r17 != 0) goto L53
            monitor-enter(r2)
            X.9IO r3 = new X.9IO     // Catch: java.lang.Throwable -> L50
            r6 = r13
            r3.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L50
            r10.A0L = r3     // Catch: java.lang.Throwable -> L50
            X.2VY r0 = r10.A0Q     // Catch: java.lang.Throwable -> L50
            X.2VX r0 = (X.C2VX) r0     // Catch: java.lang.Throwable -> L50
            r0.post(r3)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L50
            return
        L50:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L50
            throw r1
        L53:
            A09(r4, r5, r6, r7, r8, r9)
            return
        L57:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A0A(X.3f3, X.2Vj, java.lang.String, int, int, int, boolean):void");
    }

    private void A0C(String str) {
        AbstractC50692Uq.A07("Litho.StateUpdateEnqueued", new C1124455w(this), new C1124555x(this, str, false));
        C75763ah c75763ah = this.A0b;
        if (c75763ah.A02.getAndIncrement() == 0) {
            AtomicReference atomicReference = c75763ah.A04;
            if (atomicReference.get() != null) {
                c75763ah.A03.set(str);
                ((Choreographer) atomicReference.get()).postFrameCallback(c75763ah.A00);
            }
        }
    }

    public final synchronized AbstractC50812Vc A0F() {
        return this.A03;
    }

    public final synchronized C75803al A0G() {
        C75803al c75803al;
        C75803al c75803al2 = this.A0A;
        if (c75803al2 == null) {
            c75803al = new C75803al();
        } else {
            c75803al = new C75803al(c75803al2);
        }
        return c75803al;
    }

    public final synchronized C75803al A0H() {
        return this.A0A;
    }

    public final void A0K() {
        C51182Wr c51182Wr;
        C2XV.A00();
        LithoView lithoView = this.A07;
        if (lithoView != null && ((BaseMountingView) lithoView).A0B) {
            throw new IllegalStateException("Releasing a ComponentTree that is currently being mounted");
        }
        synchronized (this) {
            C75763ah c75763ah = this.A0b;
            c75763ah.A02.set(0);
            C2VY c2vy = c75763ah.A05.A0B;
            Runnable runnable = c75763ah.A01;
            C14360o3.A0B(runnable, 0);
            ((C2VX) c2vy).removeCallbacks(runnable);
            AtomicReference atomicReference = c75763ah.A04;
            if (atomicReference.get() != null) {
                ((Choreographer) atomicReference.get()).removeFrameCallback(c75763ah.A00);
            }
            C2VY c2vy2 = this.A0B;
            Runnable runnable2 = this.A0Y;
            C14360o3.A0B(runnable2, 0);
            ((C2VX) c2vy2).removeCallbacks(runnable2);
            Object obj = this.A0e;
            synchronized (obj) {
                try {
                    C75983b3 c75983b3 = this.A0M;
                    if (c75983b3 != null) {
                        ((C2VX) this.A0Q).removeCallbacks(c75983b3);
                        this.A0M = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (obj) {
                try {
                    C9IO c9io = this.A0L;
                    if (c9io != null) {
                        ((C2VX) this.A0Q).removeCallbacks(c9io);
                        this.A0L = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            synchronized (this.A0h) {
                try {
                    C212109af c212109af = this.A0N;
                    if (c212109af != null) {
                        ((C2VX) this.A0Q).removeCallbacks(c212109af);
                        this.A0N = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            synchronized (this.A0g) {
                try {
                    List list = this.A0a;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((AbstractC76013b6) it.next()).A05();
                    }
                    list.clear();
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            synchronized (this.A0f) {
                try {
                    List list2 = this.A0Z;
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC76013b6) it2.next()).A05();
                    }
                    list2.clear();
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            C75903av c75903av = this.A04;
            if (c75903av != null) {
                C2VY c2vy3 = c75903av.A03;
                Runnable runnable3 = c75903av.A04;
                C14360o3.A0B(runnable3, 0);
                ((C2VX) c2vy3).removeCallbacks(runnable3);
            }
            AbstractC50812Vc abstractC50812Vc = this.A03;
            if (abstractC50812Vc != null) {
                this.A0D = abstractC50812Vc.A0H();
            }
            LithoView lithoView2 = this.A07;
            if (lithoView2 != null) {
                lithoView2.A0l(null, true);
            }
            this.A0T = true;
            this.A03 = null;
            try {
                C50882Vk c50882Vk = this.A05;
                if (c50882Vk != null) {
                    C14360o3.A0B(this.A0X, 0);
                    C51302Xd c51302Xd = c50882Vk.A0K;
                    if (c51302Xd != null) {
                        InterfaceC09390do interfaceC09390do = c51302Xd.A00;
                        if (!((Map) interfaceC09390do.getValue()).isEmpty()) {
                            Iterator it3 = ((Map) interfaceC09390do.getValue()).keySet().iterator();
                            if (it3.hasNext()) {
                                if (((Map) interfaceC09390do.getValue()).get(it3.next()) != null) {
                                    throw new NullPointerException("scopedComponentInfos");
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                }
                this.A0X.A00.clear();
                C75803al c75803al = this.A0A;
                if (c75803al != null) {
                    c51182Wr = c75803al.A00;
                    if (C2V3.clearEventHandlersAndTriggers) {
                        C2XM c2xm = c75803al.A02;
                        synchronized (c2xm) {
                            try {
                                c2xm.A00();
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                        C2XL c2xl = c75803al.A01;
                        synchronized (c2xl) {
                            c2xl.A00.clear();
                        }
                    }
                } else {
                    c51182Wr = null;
                }
                this.A06 = null;
                this.A05 = null;
                this.A0A = null;
                this.A0E = null;
                this.A09 = null;
            } catch (Throwable th7) {
                throw th7;
            }
        }
        if (c51182Wr != null) {
            c51182Wr.A00();
        }
        List list3 = this.A0R;
        if (list3 != null) {
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                C57Z.A01(null, ((C80503if) it4.next()).A00.A01);
            }
            this.A0R = null;
        }
        C75803al c75803al2 = this.A0A;
        if (c75803al2 != null && !C2V3.clearEventHandlersAndTriggers) {
            C2XM c2xm2 = c75803al2.A02;
            synchronized (c2xm2) {
                c2xm2.A00();
            }
        }
    }

    public final synchronized void A0L(final C07X c07x) {
        C2XU c2xu;
        boolean z = this.A0i;
        if (z) {
            c2xu = this.A0P;
        } else {
            c2xu = this.A0W.A07;
        }
        if (C2V3.defaultInstance.A0G) {
            if (c2xu != null) {
                InterfaceC75873as interfaceC75873as = AbstractC75843ap.A00;
                C07X c07x2 = (C07X) c2xu.A00(interfaceC75873as);
                if (c07x2 instanceof C75833ao) {
                    final C75833ao c75833ao = (C75833ao) c07x2;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        c75833ao.A0B(c07x);
                    } else {
                        ((C2VX) this.A0B).post(new Runnable() { // from class: X.Au7
                            @Override // java.lang.Runnable
                            public final void run() {
                                c75833ao.A0B(c07x);
                            }
                        });
                    }
                } else {
                    c2xu.A01(interfaceC75873as, c07x2);
                }
            } else {
                throw new NullPointerException("The treePropContainer cannot be null");
            }
        } else if (z) {
            if (c2xu == null) {
                c2xu = A03(null);
                if (c2xu == null) {
                    c2xu = new C2XU();
                }
                this.A0P = c2xu;
            }
            c2xu.A01(AbstractC75843ap.A00, c07x);
        } else {
            C2XE c2xe = this.A0W;
            if (!c2xe.A0B) {
                c2xe.A07 = AbstractC170427iv.A00(c2xu);
                c2xe.A0B = true;
            }
            C2XU c2xu2 = c2xe.A07;
            if (c2xu2 != null) {
                c2xu2.A01(AbstractC75843ap.A00, c07x);
            }
        }
    }

    public final void A0M(AbstractC50812Vc abstractC50812Vc) {
        A04(abstractC50812Vc, this, null, null, -1, -1, 0, false);
    }

    public final void A0N(AbstractC50812Vc abstractC50812Vc) {
        A04(abstractC50812Vc, this, null, null, -1, -1, 1, true);
    }

    public final void A0O(AbstractC50812Vc abstractC50812Vc, int i, int i2) {
        A04(abstractC50812Vc, this, null, null, i, i2, 1, true);
    }

    public final void A0P(AbstractC50812Vc abstractC50812Vc, C2Vj c2Vj, int i, int i2) {
        A04(abstractC50812Vc, this, c2Vj, null, i, i2, 0, false);
    }

    public final synchronized void A0R(InterfaceC51012Vx interfaceC51012Vx) {
        C07X BN8;
        if (this.A08 == null) {
            this.A08 = interfaceC51012Vx;
            interfaceC51012Vx.A91(this);
            if (!C2V3.defaultInstance.A0J && (interfaceC51012Vx instanceof InterfaceC89283yU) && (BN8 = ((InterfaceC89283yU) interfaceC51012Vx).BN8()) != null) {
                A0L(BN8);
            }
        } else {
            throw new IllegalStateException("Already subscribed");
        }
    }

    public final void A0S(boolean z, String str) {
        C2XU c2xu;
        C2XU c2xu2;
        synchronized (this) {
            if (this.A03 == null) {
                return;
            }
            if (!this.A0i && (c2xu2 = this.A0P) != null) {
                c2xu = AbstractC170427iv.A00(c2xu2);
            } else {
                c2xu = null;
            }
            C75763ah c75763ah = this.A0b;
            c75763ah.A02.set(0);
            AtomicReference atomicReference = c75763ah.A04;
            if (atomicReference.get() != null) {
                ((Choreographer) atomicReference.get()).removeFrameCallback(c75763ah.A00);
            }
            AbstractC50812Vc abstractC50812Vc = this.A03;
            int i = 4;
            if (z) {
                i = 5;
            }
            A06(abstractC50812Vc, this, null, c2xu, str, -1, -1, i, z, false);
        }
    }

    @Override // X.C2VK
    public final synchronized Object Ajj(Object obj, String str, int i, boolean z) {
        Object obj2;
        C75803al c75803al;
        if (!this.A0T && (c75803al = this.A0A) != null) {
            obj2 = c75803al.A00(obj, str, i, z);
        } else {
            obj2 = null;
        }
        return obj2;
    }

    @Override // X.C2VM
    public final synchronized boolean Cbm() {
        return this.A0T;
    }

    @Override // X.C2VK
    public final synchronized void E78(Object obj, Object obj2, String str, int i, boolean z) {
        C75803al c75803al;
        if (!this.A0T && (c75803al = this.A0A) != null) {
            c75803al.A06(obj, obj2, str, i, z);
        }
    }

    @Override // X.C2VK
    public final void FBB(InterfaceC1124255u interfaceC1124255u, String str, String str2, boolean z) {
        synchronized (this) {
            if (this.A03 == null) {
                return;
            }
            C75803al c75803al = this.A0A;
            if (c75803al != null) {
                c75803al.A03(interfaceC1124255u, str, z);
            }
            AbstractC76113bG.A04.addAndGet(1L);
            A0C(str2);
        }
    }

    @Override // X.C2VK
    public final void FBC(InterfaceC1124255u interfaceC1124255u, String str, String str2, boolean z) {
        synchronized (this) {
            if (this.A03 == null) {
                return;
            }
            C75803al c75803al = this.A0A;
            if (c75803al != null) {
                c75803al.A03(interfaceC1124255u, str, z);
            }
            A0B(str2);
        }
    }

    @Override // X.C2VK
    public final void FCI(C125975mo c125975mo, String str, String str2, boolean z) {
        synchronized (this) {
            if (this.A03 == null) {
                return;
            }
            C75803al c75803al = this.A0A;
            if (c75803al != null) {
                c75803al.A05(c125975mo, str, false, z);
            }
            AbstractC76113bG.A04.addAndGet(1L);
            A0C(str2);
        }
    }

    @Override // X.C2VK
    public final synchronized void FCJ(C125975mo c125975mo, String str, boolean z) {
        C75803al c75803al;
        if (this.A03 != null && (c75803al = this.A0A) != null) {
            c75803al.A05(c125975mo, str, true, z);
        }
    }

    @Override // X.C2VK
    public final void FCK(C125975mo c125975mo, String str, String str2, boolean z) {
        synchronized (this) {
            if (this.A03 == null) {
                return;
            }
            C75803al c75803al = this.A0A;
            if (c75803al != null) {
                try {
                    c75803al.A05(c125975mo, str, false, z);
                } catch (Exception e) {
                    C2XE c2xe = this.A0W;
                    c2xe.A02.A01.A01.A02(c2xe, e);
                    throw C00O.createAndThrow();
                }
            }
            A0B(str2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2VY, android.os.Handler] */
    /* JADX WARN: Type inference failed for: r3v11, types: [X.2VY, android.os.Handler] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.2VY, android.os.Handler] */
    public ComponentTree(C75713ac c75713ac) {
        C2XP c2xp;
        InterfaceC51012Vx interfaceC51012Vx;
        C2XE c2xe;
        InterfaceC51012Vx interfaceC51012Vx2;
        InterfaceC51012Vx interfaceC51012Vx3;
        Object c75833ao;
        C07X c07x;
        Looper mainLooper = Looper.getMainLooper();
        C14360o3.A0B(mainLooper, 1);
        this.A0B = new Handler(mainLooper);
        this.A0Y = new Runnable() { // from class: X.3ag
            @Override // java.lang.Runnable
            public final void run() {
                ComponentTree.A08(ComponentTree.this);
            }
        };
        this.A0e = new Object();
        this.A0f = new Object();
        this.A0g = new Object();
        this.A0a = new ArrayList();
        this.A0Z = new ArrayList();
        this.A0I = -1;
        this.A00 = -1;
        boolean z = C2V3.defaultInstance.A0R;
        this.A0i = z;
        this.A02 = -1;
        this.A01 = -1;
        this.A0H = false;
        this.A0X = new C2XN();
        this.A0b = new C75763ah(this);
        this.A03 = c75713ac.A01;
        int andIncrement = C75793ak.A06.getAndIncrement();
        this.A0U = andIncrement;
        C2XK c2xk = new C2XK(andIncrement);
        A0Q(c75713ac.A02);
        C75803al c75803al = c75713ac.A05;
        this.A0A = c75803al == null ? new C75803al() : c75803al;
        if (C2V3.USE_INCREMENTAL_MOUNT_HELPER) {
            c2xp = new C2XP(this);
        } else {
            c2xp = null;
        }
        this.A0c = c2xp;
        this.A0Q = null;
        this.A0B = this.A0B;
        Looper A00 = A00();
        C14360o3.A0B(A00, 1);
        this.A0Q = new Handler(A00);
        Context context = c75713ac.A00;
        C75703ab c75703ab = new C75703ab(c2xk, c75713ac.A06, C51132Wj.A00(context));
        C2VK c2vk = c75713ac.A04;
        c2vk = c2vk == null ? this : c2vk;
        if (z) {
            this.A0d = c75713ac.A09;
        } else {
            this.A0d = null;
        }
        if (C2V3.defaultInstance.A0G) {
            C2XU c2xu = c75713ac.A09;
            if (c2xu != null && (c75833ao = (C07X) c2xu.A00(AbstractC75843ap.A00)) != null) {
                if (c75833ao instanceof C75833ao) {
                    C75833ao c75833ao2 = (C75833ao) c75833ao;
                    synchronized (c75833ao2) {
                        c07x = c75833ao2.A00;
                    }
                    c75833ao = new C75833ao(c07x);
                }
            } else {
                c75833ao = new C75833ao(null);
            }
            C2XU c2xu2 = new C2XU();
            c2xu2.A01(AbstractC75843ap.A00, c75833ao);
            this.A0O = c2xu2;
        }
        if (z) {
            this.A0P = A03(null);
            C14360o3.A0B(c2vk, 1);
            C75793ak c75793ak = new C75793ak(this, this, this, c2vk, this.A0U);
            if (C2V3.defaultInstance.A0L) {
                interfaceC51012Vx3 = c75713ac.A03;
            } else {
                interfaceC51012Vx3 = this.A08;
            }
            c2xe = new C2XE(context, c75703ab, c75793ak, interfaceC51012Vx3, null, null, "root");
        } else {
            C2XU c2xu3 = this.A0O;
            C2XU c2xu4 = c75713ac.A09;
            c2xu4 = c2xu3 != null ? A03(c2xu4) : c2xu4;
            C14360o3.A0B(c2vk, 1);
            C75793ak c75793ak2 = new C75793ak(this, this, this, c2vk, this.A0U);
            if (C2V3.defaultInstance.A0L) {
                interfaceC51012Vx = c75713ac.A03;
            } else {
                interfaceC51012Vx = this.A08;
            }
            c2xe = new C2XE(context, c75703ab, c75793ak2, interfaceC51012Vx, c2xu4, c75713ac.A08, "root");
        }
        this.A0W = c2xe;
        if (c75713ac.A06.A02 != null) {
            Looper A002 = A00();
            C14360o3.A0B(A002, 1);
            this.A04 = new C75903av(this.A0W, new Handler(A002), new InterfaceC16820sZ() { // from class: X.3at
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    C50882Vk c50882Vk;
                    ComponentTree componentTree = ComponentTree.this;
                    synchronized (componentTree) {
                        c50882Vk = componentTree.A06;
                        if (c50882Vk == null && (c50882Vk = componentTree.A05) == null) {
                            c50882Vk = null;
                        }
                    }
                    if (c50882Vk != null) {
                        return c50882Vk.A0Q;
                    }
                    return Collections.emptyList();
                }
            }, new InterfaceC16620sF() { // from class: X.3au
                @Override // X.InterfaceC16620sF
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2;
                    Context context2 = (Context) obj;
                    InterfaceC50822Vd interfaceC50822Vd = (InterfaceC50822Vd) obj2;
                    C14360o3.A0B(context2, 0);
                    C14360o3.A0B(interfaceC50822Vd, 1);
                    C2Wm A003 = C51382Xl.A00(context2, interfaceC50822Vd, interfaceC50822Vd.E4c());
                    if (A003 != null) {
                        z2 = A003.CoK(context2, interfaceC50822Vd);
                    } else {
                        z2 = false;
                    }
                    return Boolean.valueOf(z2);
                }
            }, this.A0U, c75713ac.A06.A09);
        }
        if (C2V3.defaultInstance.A0L) {
            interfaceC51012Vx2 = this.A0W.A04;
        } else {
            interfaceC51012Vx2 = c75713ac.A03;
        }
        if (interfaceC51012Vx2 != null) {
            A0R(interfaceC51012Vx2);
        }
        if (!z) {
            this.A0P = this.A0W.A07;
        }
        this.A0V = (AccessibilityManager) this.A0W.A0C.getSystemService("accessibility");
    }

    public static synchronized Looper A00() {
        Looper looper;
        synchronized (ComponentTree.class) {
            if (A0l == null) {
                HandlerThread handlerThread = new HandlerThread("ComponentLayoutThread", C2V3.DEFAULT_BACKGROUND_THREAD_PRIORITY);
                AbstractC09770fa.A00(handlerThread);
                handlerThread.start();
                A0l = handlerThread.getLooper();
            }
            looper = A0l;
        }
        return looper;
    }

    public static C75713ac A01(AbstractC50812Vc abstractC50812Vc, C2XE c2xe) {
        YB8 yb8;
        InterfaceC51012Vx interfaceC51012Vx = c2xe.A04;
        if (interfaceC51012Vx == null) {
            yb8 = null;
        } else {
            yb8 = new YB8(interfaceC51012Vx);
        }
        return A02(abstractC50812Vc, C2XE.A01(c2xe), yb8);
    }

    public static C75713ac A02(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, InterfaceC51012Vx interfaceC51012Vx) {
        C75713ac c75713ac = new C75713ac(c2xe);
        if (abstractC50812Vc != null) {
            c75713ac.A01 = abstractC50812Vc;
        }
        c75713ac.A03 = interfaceC51012Vx;
        return c75713ac;
    }

    private C2XU A03(C2XU c2xu) {
        C2XU A00;
        C2XU c2xu2 = this.A0d;
        if (c2xu2 == null) {
            A00 = null;
        } else {
            A00 = AbstractC170427iv.A00(c2xu2);
        }
        if (c2xu != null) {
            if (A00 == null) {
                A00 = new C2XU();
            }
            Map map = c2xu.A00;
            C14360o3.A06(map);
            synchronized (map) {
                A00.A00.putAll(map);
            }
        }
        if (C2V3.defaultInstance.A0G) {
            if (A00 == null) {
                A00 = new C2XU();
            }
            C2XU c2xu3 = this.A0O;
            if (c2xu3 != null) {
                Map map2 = c2xu3.A00;
                C14360o3.A06(map2);
                synchronized (map2) {
                    A00.A00.putAll(map2);
                }
            }
        }
        return A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r26 == 6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if ("Resuming partial result skipped due to not being on main-thread".equals(r8.A02) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e3, code lost:
    
        if (X.C2XS.A00(r22.A0V) != r8.A0b) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A05(X.AbstractC50812Vc r21, com.facebook.litho.ComponentTree r22, X.C2Vj r23, X.C2XU r24, java.lang.String r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A05(X.2Vc, com.facebook.litho.ComponentTree, X.2Vj, X.2XU, java.lang.String, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0066, code lost:
    
        if (r10 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(X.AbstractC50812Vc r22, final com.facebook.litho.ComponentTree r23, X.C2Vj r24, X.C2XU r25, final java.lang.String r26, final int r27, final int r28, final int r29, boolean r30, final boolean r31) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A06(X.2Vc, com.facebook.litho.ComponentTree, X.2Vj, X.2XU, java.lang.String, int, int, int, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0011, code lost:
    
        if (r26 != (-1)) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.3b3, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(final X.AbstractC50812Vc r20, X.C2Vj r21, final X.C2XU r22, final java.lang.String r23, int r24, final int r25, final int r26, boolean r27) {
        /*
            r19 = this;
            r4 = r19
            monitor-enter(r4)
            X.3f3 r5 = r4.A09     // Catch: java.lang.Throwable -> L80
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L80
            r9 = r25
            r10 = r26
            if (r24 != 0) goto L13
            r0 = -1
            if (r9 != r0) goto L13
            r3 = 1
            r8 = 1
            if (r10 == r0) goto L17
        L13:
            r3 = r27
            r8 = r24
        L17:
            r12 = r20
            r6 = r21
            r14 = r22
            r7 = r23
            if (r5 == 0) goto L41
            X.2XE r0 = r5.A02
            X.2XU r0 = r0.A07
            boolean r0 = X.C14360o3.A0K(r0, r14)
            if (r0 != 0) goto L33
            X.2V3 r0 = X.C2V3.defaultInstance
            boolean r0 = r0.A0G
            if (r0 == 0) goto L3f
            if (r22 != 0) goto L3f
        L33:
            r1 = 1
        L34:
            X.2Vc r0 = r5.A01
            if (r0 != r12) goto L41
            if (r1 == 0) goto L41
            r11 = 0
            r4.A0A(r5, r6, r7, r8, r9, r10, r11)
            return
        L3f:
            r1 = 0
            goto L34
        L41:
            java.lang.Object r2 = r4.A0e
            monitor-enter(r2)
            X.3b3 r1 = r4.A0M     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L52
            X.2VY r0 = r4.A0Q     // Catch: java.lang.Throwable -> L7d
            X.2VX r0 = (X.C2VX) r0     // Catch: java.lang.Throwable -> L7d
            r0.removeCallbacks(r1)     // Catch: java.lang.Throwable -> L7d
            r0 = 0
            r4.A0M = r0     // Catch: java.lang.Throwable -> L7d
        L52:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L71
            monitor-enter(r2)
            X.3b3 r11 = new X.3b3     // Catch: java.lang.Throwable -> L6e
            r13 = r4
            r15 = r7
            r16 = r8
            r17 = r9
            r18 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L6e
            r4.A0M = r11     // Catch: java.lang.Throwable -> L6e
            X.2VY r0 = r4.A0Q     // Catch: java.lang.Throwable -> L6e
            X.2VX r0 = (X.C2VX) r0     // Catch: java.lang.Throwable -> L6e
            r0.post(r11)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6e
            return
        L6e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6e
            throw r0
        L71:
            r0 = r12
            r1 = r4
            r2 = r6
            r3 = r14
            r4 = r7
            r5 = r8
            r6 = r9
            r7 = r10
            A05(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        L7d:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            throw r0
        L80:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L80
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A07(X.2Vc, X.2Vj, X.2XU, java.lang.String, int, int, int, boolean):void");
    }

    public static void A08(ComponentTree componentTree) {
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        C2XV.A00();
        if (isTracing) {
            ComponentsSystrace.A02("backgroundLayoutStateUpdated");
        }
        synchronized (componentTree) {
            if (componentTree.A03 == null) {
                if (isTracing) {
                    ComponentsSystrace.A01();
                }
                return;
            }
            if (componentTree.A05 != null) {
                boolean A0D = componentTree.A0D();
                if (A0D) {
                    C170547j7 c170547j7 = componentTree.A0j;
                    if (c170547j7 != null) {
                        C2Z5.A0N(c170547j7.A00, 0);
                        componentTree.A0j = null;
                    }
                    if (componentTree.A0G && !componentTree.A0S) {
                        int measuredWidth = componentTree.A07.getMeasuredWidth();
                        int measuredHeight = componentTree.A07.getMeasuredHeight();
                        if (measuredWidth != 0 || measuredHeight != 0) {
                            C50882Vk c50882Vk = componentTree.A06;
                            if (c50882Vk != null && c50882Vk.A0C == measuredWidth && c50882Vk.A09 == measuredHeight) {
                                componentTree.A07.A0g();
                            } else {
                                componentTree.A07.requestLayout();
                            }
                        }
                    }
                }
                if (isTracing) {
                    ComponentsSystrace.A01();
                    return;
                }
                return;
            }
            throw new RuntimeException("Unexpected null mCommittedLayoutState");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.9af, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.9af, java.lang.Runnable] */
    private void A0B(final String str) {
        Object handler;
        AbstractC76113bG.A05.addAndGet(1L);
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            Log.w("ComponentTree", "You cannot update state synchronously from a thread without a looper, using the default background layout thread instead");
            synchronized (this.A0h) {
                C212109af c212109af = this.A0N;
                if (c212109af != null) {
                    ((C2VX) this.A0Q).removeCallbacks(c212109af);
                }
                ?? r1 = new AbstractRunnableC51502Xx(str) { // from class: X.9af
                    public final String A00;

                    {
                        this.A00 = str;
                    }

                    @Override // X.AbstractRunnableC51502Xx
                    public final void A00() {
                        ComponentTree.this.A0S(false, this.A00);
                    }
                };
                this.A0N = r1;
                ((C2VX) this.A0Q).post(r1);
            }
            return;
        }
        ThreadLocal threadLocal = A0k;
        Reference reference = (Reference) threadLocal.get();
        if (reference == null || (handler = (C2VY) reference.get()) == null) {
            handler = new Handler(myLooper);
            threadLocal.set(new WeakReference(handler));
        }
        AbstractC50692Uq.A07("Litho.StateUpdateEnqueued", new C1124455w(this), new C1124555x(this, str, true));
        synchronized (this.A0h) {
            C212109af c212109af2 = this.A0N;
            if (c212109af2 != null) {
                ((C2VX) handler).removeCallbacks(c212109af2);
            }
            ?? r0 = new AbstractRunnableC51502Xx(str) { // from class: X.9af
                public final String A00;

                {
                    this.A00 = str;
                }

                @Override // X.AbstractRunnableC51502Xx
                public final void A00() {
                    ComponentTree.this.A0S(false, this.A00);
                }
            };
            this.A0N = r0;
            ((C2VX) handler).post(r0);
        }
    }

    private boolean A0D() {
        C50882Vk c50882Vk;
        List list;
        C50882Vk c50882Vk2 = this.A05;
        if (c50882Vk2 != null && c50882Vk2 != (c50882Vk = this.A06)) {
            this.A06 = c50882Vk2;
            if ((c50882Vk != null && !(c50882Vk.A0H.A01 instanceof C75723ad)) || !(c50882Vk2.A0H.A01 instanceof C75723ad)) {
                C75803al c75803al = this.A0A;
                if (this.A0W.A02.A01.A0U && c75803al != null) {
                    List list2 = c50882Vk2.A04;
                    c50882Vk2.A04 = null;
                    List list3 = c50882Vk2.A03;
                    c50882Vk2.A03 = null;
                    c75803al.A07(list3, list2);
                }
                C50882Vk c50882Vk3 = this.A06;
                if (c50882Vk3 != null) {
                    list = c50882Vk3.A0P;
                } else {
                    list = null;
                }
                C75803al c75803al2 = this.A0A;
                c75803al2.getClass();
                c75803al2.A00.A01(list);
                LithoView lithoView = this.A07;
                if (lithoView != null) {
                    ((BaseMountingView) lithoView).A0A = true;
                    ((BaseMountingView) lithoView).A0H.setEmpty();
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean A0E(ComponentTree componentTree, C50882Vk c50882Vk, int i, int i2) {
        if (c50882Vk != null && c50882Vk.A02(i, i2) && C2XS.A00(componentTree.A0V) == c50882Vk.A0b) {
            return true;
        }
        return false;
    }

    public final void A0Q(InterfaceC170287ih interfaceC170287ih) {
        if (interfaceC170287ih != null) {
            synchronized (this) {
                List list = this.A0E;
                if (list == null) {
                    list = new ArrayList();
                    this.A0E = list;
                }
                list.add(interfaceC170287ih);
            }
        }
    }

    @Override // X.C2VL
    public final View BV3() {
        return this.A07;
    }

    @Override // X.C2VK
    public final void EG7(String str, boolean z) {
        C75803al c75803al;
        C2XO c2xo;
        if (!this.A0T && (c75803al = this.A0A) != null) {
            C14360o3.A0B(str, 0);
            if (z) {
                c2xo = c75803al.A04;
            } else {
                c2xo = c75803al.A05;
            }
            synchronized (c2xo) {
                c2xo.A07.remove(str);
            }
        }
    }

    public C75703ab getLithoConfiguration() {
        return this.A0W.A02;
    }

    public LithoView getLithoView() {
        return this.A07;
    }

    public final void A0I() {
        C2XV.A00();
        LithoView lithoView = this.A07;
        if (lithoView != null) {
            this.A0F = true;
            try {
                C2XP c2xp = this.A0c;
                if (c2xp != null) {
                    ComponentTree componentTree = c2xp.A00;
                    if (componentTree.A0W.A02.A01.A0M) {
                        for (ViewParent parent = lithoView.getParent(); parent != null; parent = parent.getParent()) {
                            if (parent instanceof ViewPager) {
                                ViewPager viewPager = (ViewPager) parent;
                                C25946Bdq c25946Bdq = new C25946Bdq(viewPager, componentTree);
                                try {
                                    viewPager.A0J(c25946Bdq);
                                } catch (ConcurrentModificationException unused) {
                                    ((View) parent).postOnAnimation(new RunnableC49920M2n(parent, c25946Bdq));
                                }
                                c2xp.A01.add(c25946Bdq);
                            }
                        }
                    }
                }
                synchronized (this) {
                    this.A0G = true;
                    A0D();
                    if (this.A03 == null) {
                        throw new IllegalStateException(AnonymousClass001.A1A("Trying to attach a ComponentTree with a null root. Is released: ", ", Released Component name is: ", this.A0D, this.A0T));
                    }
                }
                int measuredWidth = this.A07.getMeasuredWidth();
                int measuredHeight = this.A07.getMeasuredHeight();
                if (measuredWidth != 0 || measuredHeight != 0) {
                    C50882Vk c50882Vk = this.A06;
                    if (c50882Vk != null && c50882Vk.A0C == measuredWidth && c50882Vk.A09 == measuredHeight) {
                        LithoView lithoView2 = this.A07;
                        if (!((BaseMountingView) lithoView2).A0A) {
                            ((BaseMountingView) lithoView2).A0J.A0A();
                        }
                    }
                    this.A07.requestLayout();
                }
                return;
            } finally {
                this.A0F = false;
            }
        }
        throw new IllegalStateException("Trying to attach a ComponentTree without a set View");
    }

    public final void A0J() {
        C2XV.A00();
        C2XP c2xp = this.A0c;
        if (c2xp != null) {
            List<C25946Bdq> list = c2xp.A01;
            for (C25946Bdq c25946Bdq : list) {
                c25946Bdq.A00.clear();
                ViewPager viewPager = (ViewPager) c25946Bdq.A01.get();
                if (viewPager != null) {
                    viewPager.postOnAnimation(new RunnableC49919M2m(viewPager, c25946Bdq));
                }
            }
            list.clear();
        }
        synchronized (this) {
            this.A0G = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (X.AbstractC78603fS.A00(r24.A06.A0D) != r27) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (X.C2XS.A00(r24.A0V) != r3.A0b) goto L25;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.2Vj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0T(int[] r25, final int r26, final int r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A0T(int[], int, int, boolean):void");
    }

    @Override // X.C2VM
    public final void A9k(C80503if c80503if) {
        C2XV.A00();
        List list = this.A0R;
        if (list == null) {
            list = new ArrayList();
            this.A0R = list;
        }
        list.add(c80503if);
    }

    @Override // X.C2VK
    public final boolean AG3(Object obj, String str, int i, boolean z) {
        C75803al A0H = A0H();
        if (A0H == null) {
            return false;
        }
        return A0H.A08(str, new C206999Ee(obj, 18), i, z);
    }

    @Override // X.C2VK
    public final boolean AG4(String str, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        C75803al A0H = A0H();
        if (A0H == null) {
            return false;
        }
        return A0H.A08(str, interfaceC16660sJ, i, z);
    }

    @Override // X.C2VK
    public final boolean CUq() {
        C75803al A0H = A0H();
        if (A0H == null) {
            return false;
        }
        return A0H.A06.A01;
    }

    @Override // X.C2VN
    public final void DU0(Integer num) {
        LithoView lithoView;
        boolean z;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                A0K();
                InterfaceC51012Vx interfaceC51012Vx = this.A08;
                if (interfaceC51012Vx != null) {
                    interfaceC51012Vx.EFX(this);
                    this.A08 = null;
                    return;
                }
                return;
            }
            lithoView = this.A07;
            if (lithoView == null) {
                return;
            } else {
                z = false;
            }
        } else {
            lithoView = this.A07;
            if (lithoView == null) {
                return;
            } else {
                z = true;
            }
        }
        lithoView.setVisibilityHintNonRecursive(z);
    }

    @Override // X.C2VK
    public final void EUa(boolean z) {
        C75803al A0H = A0H();
        if (A0H != null) {
            A0H.A06.A01 = z;
        }
    }
}
