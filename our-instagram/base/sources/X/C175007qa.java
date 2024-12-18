package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.WindowManager;
import java.util.List;
import java.util.Map;

/* renamed from: X.7qa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175007qa {
    public int A00;
    public OrientationEventListener A01;
    public InterfaceC175457rL A02;
    public InterfaceC175397rF A03;
    public EnumC174667q0 A04;
    public EnumC174667q0 A05;
    public InterfaceC174657pz A06;
    public InterfaceC174637px A07;
    public C177447ue A08;
    public BDG A0A;
    public C23106AGs A0B;
    public C175007qa A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final EnumC177227uI A0L;
    public final C1814082s A0M;
    public final InterfaceC175067qg A0N;
    public final InterfaceC174927qS A0O;
    public final C175407rG A0P;
    public final C174987qY A0Q;
    public final C174997qZ A0R;
    public final boolean A0S;
    public final PackageManager A0T;
    public InterfaceC175017qb A09 = null;
    public int A0K = 0;
    public int A0J = -1;
    public final AbstractC184688Hj A0U = new C175027qc(this);

    public final void A04() {
        this.A0G = true;
        final C175407rG c175407rG = this.A0P;
        if (c175407rG != null && c175407rG.A07) {
            if (c175407rG.A04 != null) {
                AbstractC175037qd.A01("ConcurrentFrontBackController", "Pausing");
                C175407rG.A01(new AbstractC184688Hj() { // from class: X.8pO
                }, c175407rG, "onPauseConcurrentFrontBack");
                return;
            }
            return;
        }
        A0I(null, "onPause");
    }

    public final void A0F(boolean z) {
        final C175407rG c175407rG;
        this.A0G = false;
        if (z && (c175407rG = this.A0P) != null && c175407rG.A07) {
            if (c175407rG.A04 != null) {
                InterfaceC175067qg interfaceC175067qg = c175407rG.A0F.A0N;
                interfaceC175067qg.A9i(c175407rG.A0B);
                c175407rG.A04.A0N.A9i(c175407rG.A0A);
                InterfaceC174807qG interfaceC174807qG = c175407rG.A0C;
                interfaceC175067qg.A9j(interfaceC174807qG);
                c175407rG.A04.A0N.A9j(interfaceC174807qG);
                AbstractC175037qd.A01("ConcurrentFrontBackController", "Resuming concurrent front-back camera");
                int i = c175407rG.A00;
                View view = c175407rG.A04.A0O.getView();
                AbstractC184688Hj abstractC184688Hj = new AbstractC184688Hj() { // from class: X.8pN
                };
                c175407rG.A07 = true;
                C175407rG.A01(new C198178pS(view, abstractC184688Hj, c175407rG, i), c175407rG, "start");
                return;
            }
            return;
        }
        if (!this.A0O.CQM()) {
            return;
        }
        A03();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.7q2] */
    public static InterfaceC174657pz A00(C175007qa c175007qa) {
        InterfaceC174657pz interfaceC174657pz = c175007qa.A06;
        if (interfaceC174657pz == null) {
            Map map = C174647py.A01;
            EnumC174667q0 enumC174667q0 = c175007qa.A04;
            if (enumC174667q0 == null) {
                enumC174667q0 = EnumC174667q0.HIGH;
            }
            EnumC174667q0 enumC174667q02 = c175007qa.A05;
            if (enumC174667q02 == null) {
                enumC174667q02 = EnumC174667q0.HIGH;
            }
            InterfaceC174637px interfaceC174637px = c175007qa.A07;
            InterfaceC174637px interfaceC174637px2 = interfaceC174637px;
            if (interfaceC174637px == null) {
                interfaceC174637px2 = new Object();
            }
            return new C174647py(new Object(), enumC174667q0, enumC174667q02, interfaceC174637px2, false, false, false);
        }
        return interfaceC174657pz;
    }

    public static void A01(C177447ue c177447ue, C175007qa c175007qa, int i, int i2) {
        AbstractC176797tb abstractC176797tb = c177447ue.A03;
        C176877tj c176877tj = (C176877tj) abstractC176797tb.A02(AbstractC176797tb.A0q);
        if (c176877tj != null) {
            int i3 = c176877tj.A02;
            int i4 = c176877tj.A01;
            Matrix matrix = new Matrix();
            InterfaceC175067qg interfaceC175067qg = c175007qa.A0N;
            if (interfaceC175067qg.Ehu(matrix, i, i2, i3, i4, true)) {
                InterfaceC174927qS interfaceC174927qS = c175007qa.A0O;
                interfaceC174927qS.Eg8(matrix);
                interfaceC175067qg.CO9(matrix, interfaceC174927qS.getWidth(), interfaceC174927qS.getHeight(), c177447ue.A01);
                c175007qa.A0E = true;
                return;
            }
            throw new RuntimeException("CameraService doesn't support setting up preview matrix.");
        }
        throw new RuntimeException(AnonymousClass001.A0R("Cannot get preview size, maybe camera was never initialised.\n characteristics.settings=\n", (String) abstractC176797tb.A02(AbstractC176797tb.A0u)));
    }

    public static void A02(C175007qa c175007qa) {
        Context context = c175007qa.A0O.getContext();
        if ((context instanceof Activity) && c175007qa.A0I) {
            ((Activity) context).setRequestedOrientation(c175007qa.A00);
            c175007qa.A0I = false;
        }
    }

    public final void A03() {
        InterfaceC175067qg interfaceC175067qg = this.A0N;
        InterfaceC174927qS interfaceC174927qS = this.A0O;
        interfaceC175067qg.ECd("initialise", interfaceC174927qS.getView());
        String str = this.A0D;
        int i = this.A0K;
        InterfaceC174657pz A00 = A00(this);
        int width = interfaceC174927qS.getWidth();
        C176577tF c176577tF = new C176577tF(this.A0R.A00(this.A0S), null, interfaceC174927qS.getHeight(), width);
        int i2 = 0;
        try {
            WindowManager windowManager = (WindowManager) interfaceC174927qS.getContext().getSystemService("window");
            if (windowManager != null) {
                i2 = windowManager.getDefaultDisplay().getRotation();
            }
        } catch (RuntimeException unused) {
        }
        interfaceC175067qg.AJR(null, this.A0U, A00, this.A09, c176577tF, str, i, i2);
    }

    public final void A05() {
        InterfaceC175067qg interfaceC175067qg = this.A0N;
        if (interfaceC175067qg.isConnected()) {
            int i = 0;
            try {
                WindowManager windowManager = (WindowManager) this.A0O.getContext().getSystemService("window");
                if (windowManager != null) {
                    i = windowManager.getDefaultDisplay().getRotation();
                }
            } catch (RuntimeException unused) {
            }
            C177447ue c177447ue = this.A08;
            if (this.A0J == i) {
                if (c177447ue != null && c177447ue.A03.A02(AbstractC176797tb.A0q) != null) {
                    InterfaceC174927qS interfaceC174927qS = this.A0O;
                    A01(c177447ue, this, interfaceC174927qS.getWidth(), interfaceC174927qS.getHeight());
                    return;
                }
                return;
            }
            this.A0J = i;
            this.A0E = false;
            interfaceC175067qg.EbM(new C176467t4(this), i);
        }
    }

    public final void A07(float f, float f2) {
        InterfaceC175067qg interfaceC175067qg = this.A0N;
        if (interfaceC175067qg.isConnected()) {
            float[] fArr = {f, f2};
            if (!interfaceC175067qg.Cmt(fArr)) {
                android.util.Log.e("CameraViewController", AbstractC43591JPw.A00(1157));
                return;
            }
            int i = (int) fArr[0];
            int i2 = (int) fArr[1];
            interfaceC175067qg.Emb(new AbstractC184688Hj() { // from class: X.7vM
            }, i, i2);
            interfaceC175067qg.AWH(i, i2);
        }
    }

    public final void A08(int i) {
        this.A0K = i;
        AbstractC175037qd.A01("CameraViewController", AnonymousClass001.A0O("Initial camera facing set to: ", i));
    }

    public final void A0A(AbstractC184688Hj abstractC184688Hj) {
        C175407rG c175407rG = this.A0P;
        if (c175407rG != null && c175407rG.A07) {
            if (this.A0S) {
                AbstractC175037qd.A02("CameraViewController", "Cannot stop concurrent front back from the auxiliary controller.");
                return;
            }
            C174997qZ c174997qZ = this.A0R;
            c174997qZ.A07 = false;
            c174997qZ.A08 = false;
            c175407rG.A07 = false;
            C175407rG.A01(new C198168pR(abstractC184688Hj, c175407rG), c175407rG, "stop");
            this.A0N.EVB(new C176427t0(), true);
        }
    }

    public final void A0C(InterfaceC174637px interfaceC174637px) {
        C175007qa c175007qa;
        this.A07 = interfaceC174637px;
        if (!this.A0S && (c175007qa = this.A0C) != null) {
            c175007qa.A0C(interfaceC174637px);
        }
    }

    public final void A0D(final InterfaceC196578mn interfaceC196578mn, final C196548mk c196548mk) {
        C196558ml c196558ml = C196548mk.A09;
        InterfaceC174927qS interfaceC174927qS = this.A0O;
        c196548mk.A01(c196558ml, new Rect(0, 0, interfaceC174927qS.getWidth(), interfaceC174927qS.getHeight()));
        InterfaceC196578mn interfaceC196578mn2 = new InterfaceC196578mn(interfaceC196578mn, c196548mk, this) { // from class: X.8mq
            public InterfaceC175497rP A00;
            public boolean A01;
            public boolean A02;
            public final /* synthetic */ InterfaceC196578mn A03;
            public final /* synthetic */ C196548mk A04;
            public final /* synthetic */ C175007qa A05;

            {
                boolean z;
                this.A05 = this;
                this.A04 = c196548mk;
                this.A01 = Boolean.TRUE.equals(c196548mk.A00(C196548mk.A06));
                InterfaceC174657pz interfaceC174657pz = this.A06;
                boolean z2 = false;
                if (interfaceC174657pz != null) {
                    z = ((Boolean) interfaceC174657pz.AXQ(InterfaceC174657pz.A04)).booleanValue();
                } else {
                    z = false;
                }
                if (this.A01 && z) {
                    z2 = true;
                }
                this.A02 = z2;
                this.A00 = this.A0R.A00(this.A0S);
            }

            @Override // X.InterfaceC196578mn
            public final void D2R() {
                if (this.A02) {
                    this.A00.EbO(false);
                }
                this.A03.D2R();
            }

            @Override // X.InterfaceC196578mn
            public final void DEF(Exception exc) {
                if (this.A02) {
                    this.A00.EbO(true);
                }
                this.A03.DEF(exc);
            }

            @Override // X.InterfaceC196578mn
            public final void DYZ(C196748n4 c196748n4) {
                if (this.A02) {
                    this.A00.EbO(true);
                }
                this.A03.DYZ(c196748n4);
            }

            @Override // X.InterfaceC196578mn
            public final void Dbk(float f) {
                this.A03.Dbk(f);
            }

            @Override // X.InterfaceC196578mn
            public final void Dtw(C196748n4 c196748n4) {
                this.A03.Dtw(c196748n4);
            }
        };
        if (A0G()) {
            C175407rG c175407rG = this.A0P;
            c175407rG.getClass();
            if (c175407rG.A04 != null) {
                C23459AaW c23459AaW = new C23459AaW(interfaceC196578mn2, c175407rG);
                c175407rG.A0F.A0N.Epu(c23459AaW, c196548mk);
                boolean A02 = AbstractC176937tp.A02(AbstractC176907tm.A02);
                C175007qa c175007qa = c175407rG.A04;
                if (!A02) {
                    c175007qa.A0D(c23459AaW, c196548mk);
                    return;
                }
                Bitmap Bfm = c175007qa.A0O.Bfm();
                if (Bfm == null) {
                    return;
                }
                int width = Bfm.getWidth();
                int height = Bfm.getHeight();
                C196738n3 c196738n3 = new C196738n3(new Rect(0, 0, width, height), new Rect(0, 0, width, height), 0, c175407rG.A04.A0N.Ak0());
                c196738n3.A01(C196748n4.A0d, c196548mk.A00(c196558ml));
                c196738n3.A01(C196748n4.A0W, Bfm);
                C196748n4 c196748n4 = new C196748n4(c196738n3);
                c23459AaW.DYZ(c196748n4);
                c23459AaW.Dtw(c196748n4);
                return;
            }
            throw new IllegalStateException("Can't take a concurrent photo, not in concurrent front-back mode.");
        }
        this.A0N.Epu(interfaceC196578mn2, c196548mk);
    }

    public final void A0E(BDG bdg, C23106AGs c23106AGs) {
        if (!this.A0I) {
            Context context = this.A0O.getContext();
            while (true) {
                Context context2 = context;
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper) || context2 == (context = ((ContextWrapper) context).getBaseContext())) {
                        break;
                    }
                } else {
                    Activity activity = (Activity) context2;
                    if (activity != null) {
                        this.A00 = activity.getRequestedOrientation();
                        activity.setRequestedOrientation(14);
                        this.A0I = true;
                    }
                }
            }
        }
        if (A0G()) {
            C175407rG c175407rG = this.A0P;
            c175407rG.getClass();
            C23464Aab c23464Aab = new C23464Aab(bdg, this);
            c175407rG.A02 = c23106AGs;
            c175407rG.A01 = c23464Aab;
            XW3 xw3 = new XW3(c23464Aab, c175407rG);
            C175407rG.A00(xw3, c23106AGs, c175407rG.A0F);
            if (!c175407rG.A08) {
                C23106AGs c23106AGs2 = (C23106AGs) c23106AGs.A00(C23106AGs.A06);
                if (c23106AGs2 != null) {
                    C175007qa c175007qa = c175407rG.A04;
                    c175007qa.getClass();
                    C175407rG.A00(xw3, c23106AGs2, c175007qa);
                    return;
                }
                throw new IllegalArgumentException("VideoCaptureRequest for concurrent capture missing.");
            }
            return;
        }
        this.A0B = c23106AGs;
        this.A0A = bdg;
        this.A0N.EoC(new C196888nI(bdg, this), c23106AGs);
    }

    public final boolean A0G() {
        C175407rG c175407rG;
        if (!this.A0S && (c175407rG = this.A0P) != null && c175407rG.A07) {
            return true;
        }
        return false;
    }

    public final boolean A0H() {
        if (this.A0L != EnumC177227uI.CAMERA2) {
            return false;
        }
        try {
            PackageManager packageManager = this.A0T;
            if (packageManager != null) {
                if (packageManager.hasSystemFeature("android.hardware.camera.concurrent")) {
                    return true;
                }
            }
            return AbstractC176937tp.A02(AbstractC177127u8.A00);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean A0I(AbstractC184688Hj abstractC184688Hj, String str) {
        OrientationEventListener orientationEventListener = this.A01;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        InterfaceC175457rL interfaceC175457rL = this.A02;
        if (interfaceC175457rL != null) {
            this.A0N.EFI(interfaceC175457rL);
        }
        InterfaceC175067qg interfaceC175067qg = this.A0N;
        interfaceC175067qg.ECd(str, this.A0O.getView());
        return interfaceC175067qg.APd(new C177887vN(abstractC184688Hj, this));
    }

    public C175007qa(Context context, EnumC177227uI enumC177227uI, EnumC174667q0 enumC174667q0, EnumC174667q0 enumC174667q02, InterfaceC174927qS interfaceC174927qS, C174987qY c174987qY, C174997qZ c174997qZ, String str, int i, boolean z, boolean z2) {
        EnumC177227uI enumC177227uI2;
        C175377rD A00;
        this.A0D = str;
        this.A04 = enumC174667q0 == null ? EnumC174667q0.HIGH : enumC174667q0;
        this.A05 = enumC174667q02 == null ? EnumC174667q0.HIGH : enumC174667q02;
        this.A0S = z2;
        this.A0O = interfaceC174927qS;
        interfaceC174927qS.EQz(this);
        this.A0Q = c174987qY;
        this.A0G = true;
        this.A0T = context.getApplicationContext().getPackageManager();
        if (enumC177227uI != null) {
            this.A0L = enumC177227uI;
        } else {
            if (AbstractC115265Ix.A00(context, false)) {
                enumC177227uI2 = EnumC177227uI.CAMERA2;
            } else {
                enumC177227uI2 = EnumC177227uI.CAMERA1;
            }
            this.A0L = enumC177227uI2;
        }
        A08(i);
        EnumC177227uI enumC177227uI3 = this.A0L;
        if (!z2) {
            A00 = AbstractC175047qe.A00(context, null, enumC177227uI3, false);
        } else {
            A00 = AbstractC175047qe.A00(context, null, enumC177227uI3, true);
        }
        this.A0N = A00;
        this.A0F = z;
        A00.EYx(z);
        this.A0M = new C1814082s();
        this.A0R = c174997qZ;
        this.A0P = z2 ? null : new C175407rG(this, this.A0D);
        this.A02 = new InterfaceC175457rL() { // from class: X.7rK
            @Override // X.InterfaceC175457rL
            public final void DE9(B4Y b4y) {
                C175007qa c175007qa = C175007qa.this;
                List list = c175007qa.A0M.A00;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC174967qW) list.get(i2)).D7C(c175007qa, b4y);
                }
            }
        };
    }

    public final void A06() {
        if (A0G()) {
            C175407rG c175407rG = this.A0P;
            c175407rG.getClass();
            C23106AGs c23106AGs = c175407rG.A02;
            BDG bdg = c175407rG.A01;
            if (c23106AGs != null && bdg != null) {
                c175407rG.A02 = null;
                c175407rG.A01 = null;
                if (c23106AGs.A00(C23106AGs.A06) != null) {
                    C198188pT c198188pT = new C198188pT(bdg, c175407rG);
                    Object A00 = c23106AGs.A00(C23106AGs.A0B);
                    A00.getClass();
                    boolean booleanValue = ((Boolean) A00).booleanValue();
                    c175407rG.A0F.A0N.Eop(c198188pT, booleanValue);
                    if (!c175407rG.A08) {
                        C175007qa c175007qa = c175407rG.A04;
                        c175007qa.getClass();
                        c175007qa.A0N.Eop(c198188pT, booleanValue);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("VideoCaptureRequest for concurrent capture missing.");
            }
            return;
        }
        C23106AGs c23106AGs2 = this.A0B;
        BDG bdg2 = this.A0A;
        if (c23106AGs2 == null || bdg2 == null) {
            return;
        }
        Object A002 = c23106AGs2.A00(C23106AGs.A0B);
        A002.getClass();
        boolean booleanValue2 = ((Boolean) A002).booleanValue();
        BDG bdg3 = this.A0A;
        if (bdg3 == null) {
            return;
        }
        this.A0B = null;
        this.A0A = null;
        this.A0N.Eop(new C196908nK(bdg3, this), booleanValue2);
    }

    public final void A09(View view, AbstractC184688Hj abstractC184688Hj) {
        C175407rG c175407rG;
        int i;
        if (!A0H()) {
            AbstractC175037qd.A02("CameraViewController", "Failed to start concurrent front-back mode, not supported.");
            return;
        }
        if (!this.A0S && (c175407rG = this.A0P) != null) {
            C177447ue c177447ue = this.A08;
            if (c177447ue != null) {
                i = c177447ue.A01;
            } else {
                i = 0;
            }
            C174997qZ c174997qZ = this.A0R;
            c174997qZ.A07 = true;
            c174997qZ.A08 = this.A0H;
            c175407rG.A07 = true;
            C175407rG.A01(new C198178pS(view, abstractC184688Hj, c175407rG, i), c175407rG, "start");
            this.A0N.EVB(new C176427t0(), false);
            return;
        }
        throw new IllegalStateException("Cannot call startConcurrentFrontBackMode() from the auxiliary controller.");
    }

    public final void A0B(AbstractC184688Hj abstractC184688Hj) {
        if (A0G()) {
            C175407rG c175407rG = this.A0P;
            c175407rG.getClass();
            C198218pW c198218pW = new C198218pW(abstractC184688Hj, this);
            if (c175407rG.A04 != null) {
                AbstractC175037qd.A01("ConcurrentFrontBackController", "Switching cameras");
                int i = 0;
                if (c175407rG.A00 == 0) {
                    i = 1;
                }
                View view = c175407rG.A04.A0O.getView();
                c175407rG.A07 = true;
                C175407rG.A01(new C198178pS(view, c198218pW, c175407rG, i), c175407rG, "start");
                return;
            }
            throw new IllegalStateException("Can't switch cameras, auxiliary camera controller not created");
        }
        C196998nU.A00().A04 = SystemClock.elapsedRealtime();
        this.A0N.Epe(new C196898nJ(abstractC184688Hj, this));
    }
}
