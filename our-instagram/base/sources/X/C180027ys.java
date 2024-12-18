package X;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Display;
import android.view.TextureView;
import java.util.Map;

/* renamed from: X.7ys, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180027ys extends AbstractC179917yh {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Display A05;
    public TextureView A06;
    public BBN A07;
    public C54655OCh A08;
    public C22808A4b A09;
    public C22809A4c A0A;
    public C212549bN A0B;
    public BBS A0C;
    public InterfaceC178677wf A0D;
    public InterfaceC175457rL A0E;
    public InterfaceC198408pp A0F;
    public InterfaceC175397rF A0G;
    public InterfaceC25160BBf A0H;
    public InterfaceC184558Gw A0I;
    public AbstractC184688Hj A0J;
    public AbstractC184688Hj A0K;
    public C177447ue A0L;
    public Float A0M;
    public Integer A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public AG6 A0V;
    public InterfaceC178337w7 A0W;
    public InterfaceC174637px A0X;
    public InterfaceC175017qb A0Y;
    public InterfaceC175497rP A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final C1814082s A0d;
    public final InterfaceC175067qg A0e;
    public final Context A0f;
    public final InterfaceC178297w3 A0g;
    public final EnumC177227uI A0h;
    public final String A0i;
    public volatile boolean A0j;

    public static void A07(final C180027ys c180027ys, C177447ue c177447ue, int i, int i2) {
        C176877tj c176877tj;
        if (i > 0 && i2 > 0 && (c176877tj = (C176877tj) c177447ue.A03.A02(AbstractC176797tb.A0q)) != null) {
            final Matrix matrix = new Matrix();
            InterfaceC175067qg interfaceC175067qg = c180027ys.A0e;
            if (interfaceC175067qg.Ehu(matrix, i, i2, c176877tj.A02, c176877tj.A01, c180027ys.A0a)) {
                interfaceC175067qg.CO9(matrix, i, i2, c177447ue.A01);
                if (c180027ys.A06 != null && !A01(c180027ys).FE6()) {
                    ((C178267w0) c180027ys.A0g).A00.post(new Runnable() { // from class: X.Atx
                        @Override // java.lang.Runnable
                        public final void run() {
                            C180027ys c180027ys2 = c180027ys;
                            Matrix matrix2 = matrix;
                            TextureView textureView = c180027ys2.A06;
                            if (textureView != null) {
                                textureView.setTransform(matrix2);
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // X.InterfaceC179927yi
    public final void ETP(boolean z) {
        this.A0O = false;
    }

    @Override // X.InterfaceC179927yi
    public final void Eam(boolean z) {
        C54655OCh c54655OCh = this.A08;
        if (c54655OCh == null) {
            c54655OCh = new C54655OCh(this.A0e);
            this.A08 = c54655OCh;
        }
        c54655OCh.A03 = false;
    }

    @Override // X.InterfaceC179927yi
    public final void EeQ(boolean z) {
        this.A0R = false;
    }

    public static InterfaceC175017qb A00(C180027ys c180027ys) {
        Looper mainLooper;
        C178087vh c178087vh = BEM.A00;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC178807ws) c180027ys).A00;
        interfaceC178207vu.getClass();
        if (interfaceC178207vu.CRY(c178087vh)) {
            InterfaceC178207vu interfaceC178207vu2 = ((AbstractC178807ws) c180027ys).A00;
            interfaceC178207vu2.getClass();
            interfaceC178207vu2.Aq0(c178087vh);
            throw new NullPointerException("getCameraEventLogger");
        }
        C178307w4 c178307w4 = InterfaceC178407wE.A00;
        InterfaceC178207vu interfaceC178207vu3 = ((AbstractC178807ws) c180027ys).A00;
        interfaceC178207vu3.getClass();
        if (interfaceC178207vu3.CRZ(c178307w4)) {
            C178307w4 c178307w42 = InterfaceC178297w3.A00;
            InterfaceC178207vu interfaceC178207vu4 = ((AbstractC178807ws) c180027ys).A00;
            interfaceC178207vu4.getClass();
            if (interfaceC178207vu4.CRZ(c178307w42) && c180027ys.A0Y == null) {
                InterfaceC178207vu interfaceC178207vu5 = ((AbstractC178807ws) c180027ys).A00;
                interfaceC178207vu5.getClass();
                InterfaceC178297w3 interfaceC178297w3 = (InterfaceC178297w3) interfaceC178207vu5.Aq1(c178307w42);
                InterfaceC178207vu interfaceC178207vu6 = ((AbstractC178807ws) c180027ys).A00;
                interfaceC178207vu6.getClass();
                InterfaceC178407wE interfaceC178407wE = (InterfaceC178407wE) interfaceC178207vu6.Aq1(c178307w4);
                InterfaceC178337w7 interfaceC178337w7 = c180027ys.A0W;
                if (interfaceC178337w7 != null && interfaceC178337w7.CUZ(110)) {
                    mainLooper = interfaceC178297w3.BAu("Lite-Controller-Thread").getLooper();
                } else {
                    mainLooper = Looper.getMainLooper();
                }
                c180027ys.A0Y = new C175857rz(interfaceC178407wE, new HandlerC174707q5(mainLooper));
            }
        }
        return c180027ys.A0Y;
    }

    public static InterfaceC175497rP A01(C180027ys c180027ys) {
        InterfaceC175497rP interfaceC175497rP = c180027ys.A0Z;
        if (interfaceC175497rP == null) {
            C178087vh c178087vh = InterfaceC178737wl.A00;
            InterfaceC178207vu interfaceC178207vu = ((AbstractC178807ws) c180027ys).A00;
            interfaceC178207vu.getClass();
            interfaceC175497rP = ((InterfaceC178737wl) interfaceC178207vu.Aq0(c178087vh)).C4Q();
            c180027ys.A0Z = interfaceC175497rP;
        }
        interfaceC175497rP.getClass();
        return interfaceC175497rP;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
    
        if (r2 != null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.9bN, X.7py] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.7q2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(final X.C180027ys r17) {
        /*
            r0 = r17
            boolean r1 = r0.A0P
            if (r1 == 0) goto Ld4
            android.os.SystemClock.elapsedRealtime()
            android.os.SystemClock.elapsedRealtime()
            X.7px r8 = r0.A0X
            if (r8 != 0) goto L1b
            int r3 = r0.A0T
            int r2 = r0.A0S
            int r1 = r0.A0U
            X.AaP r8 = new X.AaP
            r8.<init>(r3, r2, r1)
        L1b:
            X.7q0 r6 = X.EnumC174667q0.HIGH
            java.util.Map r1 = X.C174647py.A01
            X.7q2 r5 = new X.7q2
            r5.<init>()
            X.7vh r2 = X.InterfaceC178737wl.A00
            X.7vu r1 = r0.A00
            r1.getClass()
            X.7vf r1 = r1.Aq0(r2)
            X.7wl r1 = (X.InterfaceC178737wl) r1
            boolean r9 = r1.ECL()
            boolean r10 = r0.A0b
            r3 = 0
            boolean r1 = r0.A0c
            r11 = r1 ^ 1
            java.lang.Integer r2 = r0.A0N
            X.7w7 r1 = r0.A0W
            X.9bN r4 = new X.9bN
            r7 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r4.A01 = r2
            r4.A00 = r1
            X.7q3 r2 = X.InterfaceC174657pz.A06
            r8 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            r4.A00(r2, r1)
            X.7q3 r2 = X.InterfaceC174657pz.A0C
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r4.A00(r2, r1)
            r0.A0B = r4
            int r7 = r0.A01
            int r6 = r0.A00
            X.7rP r5 = A01(r0)
            r10 = 0
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            android.view.Display r2 = r0.A05     // Catch: java.lang.RuntimeException -> L81
            android.view.TextureView r1 = r0.A06     // Catch: java.lang.RuntimeException -> L81
            if (r2 != 0) goto L7d
            if (r1 == 0) goto L81
            android.view.Display r2 = r1.getDisplay()     // Catch: java.lang.RuntimeException -> L81
            r0.A05 = r2     // Catch: java.lang.RuntimeException -> L81
            if (r2 == 0) goto L81
        L7d:
            int r3 = r2.getRotation()     // Catch: java.lang.RuntimeException -> L81
        L81:
            r0.A02 = r3
            X.7qg r9 = r0.A0e
            X.8pp r1 = r0.A0F
            if (r1 != 0) goto L90
            X.Aa7 r1 = new X.Aa7
            r1.<init>()
            r0.A0F = r1
        L90:
            r9.EUe(r1)
            java.lang.String r15 = r0.A0i
            int r1 = r0.A00
            r16 = 1
            if (r1 == 0) goto La9
            if (r1 == r8) goto Lab
            java.lang.String r0 = "Could not convert camera facing to optic: "
            java.lang.String r1 = X.AnonymousClass001.A0O(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        La9:
            r16 = 0
        Lab:
            X.9bN r12 = r0.A0B
            X.7tF r14 = new X.7tF
            r14.<init>(r5, r4, r6, r7)
            X.7qb r13 = A00(r0)
            X.8Hj r11 = r0.A0J
            if (r11 != 0) goto Lc1
            X.9bS r11 = new X.9bS
            r11.<init>(r0)
            r0.A0J = r11
        Lc1:
            r17 = r3
            r9.AJR(r10, r11, r12, r13, r14, r15, r16, r17)
            X.8Gw r1 = r0.A0I
            if (r1 != 0) goto Ld1
            X.AaD r1 = new X.AaD
            r1.<init>(r0)
            r0.A0I = r1
        Ld1:
            r9.A9i(r1)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180027ys.A02(X.7ys):void");
    }

    public static void A04(C180027ys c180027ys) {
        InterfaceC175067qg interfaceC175067qg = c180027ys.A0e;
        InterfaceC184558Gw interfaceC184558Gw = c180027ys.A0I;
        if (interfaceC184558Gw == null) {
            interfaceC184558Gw = new C23440AaD(c180027ys);
            c180027ys.A0I = interfaceC184558Gw;
        }
        interfaceC175067qg.EG0(interfaceC184558Gw);
        interfaceC175067qg.EUe(null);
        InterfaceC175457rL interfaceC175457rL = c180027ys.A0E;
        if (interfaceC175457rL != null) {
            interfaceC175067qg.EFI(interfaceC175457rL);
        }
        c180027ys.A0B = null;
        c180027ys.A0j = false;
        interfaceC175067qg.APd(new C212579bQ(c180027ys));
    }

    public static void A05(C180027ys c180027ys) {
        if (c180027ys.A0V == null) {
            c180027ys.A0V = new AG6(c180027ys.A0g);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r1 != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(X.C180027ys r4, X.C177447ue r5) {
        /*
            X.7qg r3 = r4.A0e
            boolean r0 = r3.isConnected()
            if (r0 == 0) goto L35
            if (r5 == 0) goto L35
            r2 = 0
            android.view.Display r1 = r4.A05     // Catch: java.lang.RuntimeException -> L1f
            android.view.TextureView r0 = r4.A06     // Catch: java.lang.RuntimeException -> L1f
            if (r1 != 0) goto L1b
            if (r0 == 0) goto L1f
            android.view.Display r1 = r0.getDisplay()     // Catch: java.lang.RuntimeException -> L1f
            r4.A05 = r1     // Catch: java.lang.RuntimeException -> L1f
            if (r1 == 0) goto L1f
        L1b:
            int r2 = r1.getRotation()     // Catch: java.lang.RuntimeException -> L1f
        L1f:
            int r0 = r4.A02
            if (r0 != r2) goto L2b
            int r1 = r4.A04
            int r0 = r4.A03
            A07(r4, r5, r1, r0)
            return
        L2b:
            r4.A02 = r2
            X.9bR r0 = new X.9bR
            r0.<init>(r4)
            r3.EbM(r0, r2)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180027ys.A06(X.7ys, X.7ue):void");
    }

    public static void A08(C180027ys c180027ys, String str) {
        InterfaceC178407wE interfaceC178407wE;
        C178307w4 c178307w4 = InterfaceC178407wE.A00;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC178807ws) c180027ys).A00;
        interfaceC178207vu.getClass();
        if (interfaceC178207vu.CRZ(c178307w4)) {
            InterfaceC178207vu interfaceC178207vu2 = ((AbstractC178807ws) c180027ys).A00;
            interfaceC178207vu2.getClass();
            interfaceC178407wE = (InterfaceC178407wE) interfaceC178207vu2.Aq1(c178307w4);
        } else {
            interfaceC178407wE = null;
        }
        InterfaceC175017qb A00 = A00(c180027ys);
        if (interfaceC178407wE != null && A00 != null) {
            Map A7N = interfaceC178407wE.A7N();
            C175857rz c175857rz = (C175857rz) A00;
            C176587tG c176587tG = c175857rz.A00;
            if (c176587tG == null) {
                c176587tG = new C176587tG(c175857rz);
                c175857rz.A00 = c176587tG;
            }
            A7N.put("timestamp", String.valueOf(c176587tG.A00.now()));
            interfaceC178407wE.Cia(c180027ys.hashCode(), str, "OpticControllerImpl", A7N);
            interfaceC178407wE.EEM(A7N);
        }
    }

    @Override // X.InterfaceC179927yi
    public final void A9f(C22810A4d c22810A4d) {
        this.A0d.A01(c22810A4d);
    }

    @Override // X.InterfaceC179927yi
    public final InterfaceC175067qg Ak3() {
        return this.A0e;
    }

    @Override // X.AbstractC178807ws, X.InterfaceC178067vf
    public final C178087vh BKV() {
        return InterfaceC179927yi.A00;
    }

    @Override // X.InterfaceC179927yi
    public final boolean CZI() {
        return ((Boolean) A09(BE1.A04, true)).booleanValue();
    }

    @Override // X.InterfaceC179927yi
    public final boolean Ce9() {
        return this.A0e.Ce9();
    }

    @Override // X.InterfaceC179927yi
    public final boolean CfL() {
        if (this.A0h != EnumC177227uI.CAMERA2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC179927yi
    public final void EaF(boolean z) {
        this.A0e.EYx(z);
    }

    @Override // X.InterfaceC179927yi
    public final void Eal(int i) {
        if (this.A0Q) {
            this.A0S = i;
            return;
        }
        throw new IllegalStateException("Photo resolution level must be set before initializing the camera.");
    }

    @Override // X.InterfaceC179927yi
    public final void EbP(int i) {
        if (this.A0Q) {
            this.A0T = i;
            return;
        }
        throw new IllegalStateException("Preview resolution level must be set before initializing the camera.");
    }

    @Override // X.InterfaceC179927yi
    public final void Egx(int i) {
        if (this.A0Q) {
            this.A0U = i;
            return;
        }
        throw new IllegalStateException("Video resolution level must be set before initializing the camera.");
    }

    @Override // X.InterfaceC179927yi
    public final void Epf() {
        if (!this.A0Q && this.A0P) {
            InterfaceC175067qg interfaceC175067qg = this.A0e;
            if (interfaceC175067qg.Ce9()) {
                SystemClock.elapsedRealtime();
                SystemClock.elapsedRealtime();
                A05(this);
                AbstractC184688Hj abstractC184688Hj = this.A0K;
                if (abstractC184688Hj == null) {
                    abstractC184688Hj = new C212609bT(this);
                    this.A0K = abstractC184688Hj;
                }
                interfaceC175067qg.Epe(abstractC184688Hj);
            }
        }
    }

    @Override // X.InterfaceC179927yi
    public final void Epu(InterfaceC196578mn interfaceC196578mn, C196548mk c196548mk) {
        C23457AaU c23457AaU = new C23457AaU(this, interfaceC196578mn);
        if (((AbstractC179917yh) this).A00 == 1) {
            A05(this);
        }
        this.A0e.Epu(c23457AaU, c196548mk);
    }

    @Override // X.InterfaceC179927yi
    public final void enable(boolean z) {
        if (this.A0P != z) {
            this.A0P = z;
            if (!this.A0Q) {
                if (z) {
                    A02(this);
                } else {
                    A04(this);
                }
            }
        }
    }

    @Override // X.InterfaceC179927yi
    public final void setInitialCameraFacing(int i) {
        if (this.A0Q) {
            ((AbstractC179917yh) this).A00 = i;
            return;
        }
        throw new IllegalStateException("Initial camera facing must be set before initializing the camera.");
    }

    public C180027ys(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        EnumC177227uI enumC177227uI;
        this.A0d = new C1814082s();
        this.A0T = 0;
        this.A0S = 0;
        this.A0U = 0;
        this.A02 = -1;
        this.A0a = true;
        this.A0O = true;
        this.A0R = true;
        this.A0b = false;
        InterfaceC178207vu interfaceC178207vu2 = ((AbstractC178807ws) this).A00;
        interfaceC178207vu2.getClass();
        this.A0f = interfaceC178207vu2.getContext();
        C178037vc c178037vc = C178027vb.A02;
        InterfaceC178207vu interfaceC178207vu3 = ((AbstractC178807ws) this).A00;
        interfaceC178207vu3.getClass();
        Object AqG = interfaceC178207vu3.AqG(c178037vc);
        if (AqG != null) {
            this.A0i = (String) AqG;
            C178037vc c178037vc2 = BE1.A05;
            InterfaceC178207vu interfaceC178207vu4 = ((AbstractC178807ws) this).A00;
            interfaceC178207vu4.getClass();
            Boolean bool = (Boolean) interfaceC178207vu4.AqG(c178037vc2);
            if (bool == null) {
                InterfaceC178207vu interfaceC178207vu5 = ((AbstractC178807ws) this).A00;
                interfaceC178207vu5.getClass();
                bool = Boolean.valueOf(AbstractC115265Ix.A00(interfaceC178207vu5.getContext(), false));
            }
            if (bool.booleanValue()) {
                enumC177227uI = EnumC177227uI.CAMERA2;
            } else {
                enumC177227uI = EnumC177227uI.CAMERA1;
            }
            this.A0h = enumC177227uI;
            C178307w4 c178307w4 = InterfaceC178297w3.A00;
            InterfaceC178207vu interfaceC178207vu6 = ((AbstractC178807ws) this).A00;
            interfaceC178207vu6.getClass();
            InterfaceC178297w3 interfaceC178297w3 = (InterfaceC178297w3) interfaceC178207vu6.Aq1(c178307w4);
            this.A0g = interfaceC178297w3;
            C178037vc c178037vc3 = BE1.A00;
            InterfaceC178207vu interfaceC178207vu7 = ((AbstractC178807ws) this).A00;
            interfaceC178207vu7.getClass();
            InterfaceC175067qg interfaceC175067qg = (InterfaceC175067qg) interfaceC178207vu7.AqG(c178037vc3);
            if (interfaceC175067qg == null) {
                InterfaceC178207vu interfaceC178207vu8 = ((AbstractC178807ws) this).A00;
                interfaceC178207vu8.getClass();
                interfaceC175067qg = (InterfaceC175067qg) A09(c178037vc3, AbstractC175047qe.A00(interfaceC178207vu8.getContext(), interfaceC178297w3.BAu("Lite-Controller-Thread"), enumC177227uI, false));
            }
            this.A0e = interfaceC175067qg;
            ((AbstractC179917yh) this).A00 = 0;
            this.A0Q = true;
            this.A0P = true;
            this.A0b = ((Boolean) A09(BE1.A02, false)).booleanValue();
            if (((Boolean) A09(BE1.A01, false)).booleanValue()) {
                this.A0E = new InterfaceC175457rL() { // from class: X.Aa6
                    @Override // X.InterfaceC175457rL
                    public final void DE9(B4Y b4y) {
                        APL.A07(b4y, ((AbstractC179917yh) C180027ys.this).A01.A00);
                    }
                };
            }
            C178307w4 c178307w42 = InterfaceC178337w7.A00;
            InterfaceC178207vu interfaceC178207vu9 = ((AbstractC178807ws) this).A00;
            interfaceC178207vu9.getClass();
            if (interfaceC178207vu9.CRZ(c178307w42)) {
                InterfaceC178207vu interfaceC178207vu10 = ((AbstractC178807ws) this).A00;
                interfaceC178207vu10.getClass();
                this.A0W = (InterfaceC178337w7) interfaceC178207vu10.Aq1(c178307w42);
            }
            this.A01 = 1920;
            this.A00 = 1080;
            this.A0c = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Configuration is not available: ");
        sb.append(c178037vc);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void A0B(float f) {
        InterfaceC175067qg interfaceC175067qg;
        AbstractC176767tY A0A = A0A();
        if (A0A != null && ((Boolean) A0A.A01(AbstractC176767tY.A0G)).booleanValue()) {
            this.A0M = Float.valueOf(f);
            AbstractC176767tY A0A2 = A0A();
            if (A0A2 != null && (interfaceC175067qg = this.A0e) != null && interfaceC175067qg.isConnected()) {
                float floatValue = ((Number) A0A2.A01(AbstractC176767tY.A01)).floatValue();
                float intValue = ((Number) A0A2.A01(AbstractC176767tY.A0k)).intValue() * floatValue;
                float intValue2 = ((Number) A0A2.A01(AbstractC176767tY.A0g)).intValue() * floatValue;
                if (f < intValue) {
                    f = intValue;
                } else if (f > intValue2) {
                    f = intValue2;
                }
                int round = Math.round(f / floatValue);
                C176837tf c176837tf = new C176837tf();
                c176837tf.A01(AbstractC176797tb.A09, Integer.valueOf(round));
                interfaceC175067qg.Cpo(new C176427t0(), c176837tf.A00());
            }
        }
    }

    @Override // X.InterfaceC179927yi
    public final void EeT(InterfaceC174637px interfaceC174637px) {
        this.A0X = interfaceC174637px;
    }
}
