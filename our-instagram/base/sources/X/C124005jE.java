package X;

import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5jE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124005jE {
    public static final AtomicInteger A0H = new AtomicInteger(1);
    public int A00;
    public ComponentTree A01;
    public C75803al A02;
    public C170547j7 A03;
    public InterfaceC170717jO A04;
    public boolean A06;
    public XNI A0A;
    public final InterfaceC51012Vx A0C;
    public final boolean A0E;
    public final C2V3 A0F;
    public final C170957jm A0G;
    public final AtomicInteger A0D = new AtomicInteger(0);
    public boolean A05 = true;
    public int A08 = -1;
    public int A07 = -1;
    public final int A0B = A0H.getAndIncrement();
    public C170867jd A09 = null;

    public C124005jE(InterfaceC51012Vx interfaceC51012Vx, C2V3 c2v3, C170957jm c170957jm, InterfaceC170717jO interfaceC170717jO, boolean z) {
        this.A04 = interfaceC170717jO;
        this.A0G = c170957jm;
        this.A0C = interfaceC51012Vx;
        this.A0F = c2v3;
        this.A0E = z;
    }

    public final synchronized ComponentTree A01() {
        return this.A01;
    }

    public final synchronized InterfaceC170717jO A02() {
        return this.A04;
    }

    public final synchronized void A03() {
        boolean z;
        ComponentTree componentTree;
        Object AvD = this.A04.AvD("acquire_state_handler");
        if (AvD instanceof Boolean) {
            z = ((Boolean) AvD).booleanValue();
        } else {
            z = this.A0E;
        }
        if (z && (componentTree = this.A01) != null) {
            this.A02 = componentTree.A0G();
        }
        A04();
    }

    public final synchronized void A04() {
        ComponentTree componentTree = this.A01;
        if (componentTree != null) {
            XNI xni = this.A0A;
            if (xni != null) {
                xni.A00(C05F.A0C);
            } else {
                componentTree.A0K();
                this.A01 = null;
            }
        }
        this.A06 = false;
    }

    public final synchronized void A05() {
        ComponentTree componentTree = this.A01;
        if (componentTree != null) {
            LithoView lithoView = componentTree.A07;
            if (lithoView != null && lithoView.isAttachedToWindow()) {
                this.A01.A07.addOnAttachStateChangeListener(new AQ4(this));
            } else {
                A04();
            }
        }
    }

    public final void A06(C2XE c2xe, InterfaceC170287ih interfaceC170287ih, int i, int i2) {
        C2XU c2xu;
        synchronized (this) {
            if (this.A04.EGz()) {
                return;
            }
            this.A08 = i;
            this.A07 = i2;
            A00(c2xe);
            ComponentTree componentTree = this.A01;
            AbstractC50812Vc Apz = this.A04.Apz();
            InterfaceC170717jO interfaceC170717jO = this.A04;
            if (interfaceC170717jO instanceof C170727jP) {
                c2xu = ((C170727jP) interfaceC170717jO).A00;
            } else {
                c2xu = null;
            }
            if (interfaceC170287ih != null) {
                componentTree.A0Q(interfaceC170287ih);
            }
            ComponentTree.A04(Apz, componentTree, null, c2xu, i, i2, 1, true);
            synchronized (this) {
                if (this.A01 == componentTree && Apz == this.A04.Apz()) {
                    this.A06 = true;
                }
            }
        }
    }

    public final void A07(C2XE c2xe, C2Vj c2Vj, int i, int i2) {
        C2XU c2xu;
        synchronized (this) {
            if (this.A04.EGz()) {
                return;
            }
            this.A08 = i;
            this.A07 = i2;
            A00(c2xe);
            ComponentTree componentTree = this.A01;
            AbstractC50812Vc Apz = this.A04.Apz();
            InterfaceC170717jO interfaceC170717jO = this.A04;
            if (interfaceC170717jO instanceof C170727jP) {
                c2xu = ((C170727jP) interfaceC170717jO).A00;
            } else {
                c2xu = null;
            }
            ComponentTree.A04(Apz, componentTree, c2Vj, c2xu, i, i2, 0, false);
            synchronized (this) {
                if (componentTree == this.A01 && Apz == this.A04.Apz()) {
                    this.A06 = true;
                    if (c2Vj != null) {
                        this.A00 = c2Vj.A00;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (com.facebook.litho.ComponentTree.A0E(r3, r3.A05, r2, r1) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r0 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A08() {
        /*
            r4 = this;
            monitor-enter(r4)
            X.7jO r0 = r4.A04     // Catch: java.lang.Throwable -> L30
            boolean r0 = r0.EGz()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L2b
            com.facebook.litho.ComponentTree r3 = r4.A01     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L2e
            int r2 = r4.A08     // Catch: java.lang.Throwable -> L30
            int r1 = r4.A07     // Catch: java.lang.Throwable -> L30
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L30
            X.2Vk r0 = r3.A06     // Catch: java.lang.Throwable -> L26
            boolean r0 = com.facebook.litho.ComponentTree.A0E(r3, r0, r2, r1)     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L23
            X.2Vk r0 = r3.A05     // Catch: java.lang.Throwable -> L26
            boolean r1 = com.facebook.litho.ComponentTree.A0E(r3, r0, r2, r1)     // Catch: java.lang.Throwable -> L26
            r0 = 0
            if (r1 == 0) goto L24
        L23:
            r0 = 1
        L24:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L30
            goto L29
        L26:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L30
            throw r0     // Catch: java.lang.Throwable -> L30
        L29:
            if (r0 == 0) goto L2e
        L2b:
            r0 = 1
        L2c:
            monitor-exit(r4)
            return r0
        L2e:
            r0 = 0
            goto L2c
        L30:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124005jE.A08():boolean");
    }

    public final synchronized boolean A09() {
        return this.A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r2.A07 != r4) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A0A(int r3, int r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A09()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L10
            int r0 = r2.A08     // Catch: java.lang.Throwable -> L13
            if (r0 != r3) goto L10
            int r1 = r2.A07     // Catch: java.lang.Throwable -> L13
            r0 = 1
            if (r1 == r4) goto L11
        L10:
            r0 = 0
        L11:
            monitor-exit(r2)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124005jE.A0A(int, int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [X.7jd, java.lang.Object] */
    private void A00(C2XE c2xe) {
        AYE aye;
        if (this.A01 == null) {
            if (this.A0C != null) {
                this.A0A = new XNI(this);
            }
            C75713ac A02 = ComponentTree.A02(this.A04.Apz(), c2xe, this.A0A);
            String BOX = this.A04.BOX();
            C2V3 c2v3 = this.A0F;
            C2V3 c2v32 = C2V3.defaultInstance;
            C14360o3.A0B(c2v3, 0);
            C2V3 A00 = C2V3.A00(null, c2v3, null, null, null, null, null, null, -1, 31, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            boolean z = A00.A0P;
            C2VF c2vf = A00.A02;
            boolean z2 = A00.A0M;
            C2V6 c2v6 = A00.A03;
            C2V8 c2v8 = A00.A01;
            Integer num = A00.A05;
            boolean z3 = A00.A0X;
            String str = A00.A07;
            boolean z4 = A00.A00;
            boolean z5 = A00.A09;
            boolean z6 = A00.A0J;
            boolean z7 = A00.A0C;
            boolean z8 = A00.A0A;
            boolean z9 = A00.A0L;
            boolean z10 = A00.A0S;
            Integer num2 = A00.A06;
            boolean z11 = A00.A0E;
            boolean z12 = A00.A0G;
            InterfaceC16660sJ interfaceC16660sJ = A00.A08;
            boolean z13 = A00.A0W;
            boolean z14 = A00.A0I;
            boolean z15 = A00.A0F;
            boolean z16 = A00.A0H;
            boolean z17 = A00.A0D;
            boolean z18 = A00.A0N;
            if (this.A04.BOX() != null) {
                str = BOX;
            }
            A02.A06 = AbstractC75743af.A00(c2v8, A00, c2vf, c2v6, num, num2, str, interfaceC16660sJ, z5, z8, z7, z17, z11, z15, z12, z16, z4, z14, z6, z9, z2, z18, z, z10, z13, z3);
            A02.A05 = this.A02;
            C170957jm c170957jm = this.A0G;
            if (c170957jm == null) {
                aye = null;
            } else {
                aye = new AYE(this, c170957jm.A00);
            }
            A02.A02 = aye;
            C170867jd c170867jd = this.A09;
            C170867jd c170867jd2 = c170867jd;
            if (c170867jd == null) {
                ?? obj = new Object();
                this.A09 = obj;
                c170867jd2 = obj;
            }
            A02.A04 = c170867jd2;
            ComponentTree A002 = A02.A00();
            this.A01 = A002;
            this.A09.A00 = A002;
            C170547j7 c170547j7 = this.A03;
            if (c170547j7 != null) {
                A002.A0j = c170547j7;
            }
        }
    }
}
