package X;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.StringTreeSet;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.MappedByteBuffer;
import java.util.HashMap;

/* renamed from: X.01x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C005801x implements C0OO, InterfaceC04560Ly {
    public static final Object A0W = new Object();
    public C003801d A00;
    public InterfaceC04640Mg A01;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public WeakReference A07;
    public final int A08;
    public final Application A09;
    public final C0AG A0A;
    public final C0AM A0B;
    public final C0LW A0C;
    public final C07960bG A0F;
    public final C04480Lp A0G;
    public final C05410Qp A0H;
    public final C0Z0 A0I;
    public final C0Pe A0M;
    public final RunnableC05150Ph A0N;
    public final boolean A0Q;
    public final HandlerThread A0S;
    public final C0AK A0T;
    public final boolean A0U;
    public String A03 = null;
    public final C0M2 A0E = new C0M2() { // from class: X.04Y
        @Override // X.C0M2
        public final void DXs(C11020iI c11020iI) {
            Integer num;
            C005801x c005801x = C005801x.this;
            C07960bG c07960bG = c005801x.A0F;
            if (c07960bG != null && c11020iI.AWk()) {
                Activity activity = ((AbstractC05380Qm) c11020iI).A00;
                boolean z = c11020iI.A03;
                int A02 = c005801x.A0A.A02();
                synchronized (c07960bG) {
                    if (z) {
                        num = C05F.A05;
                    } else {
                        num = C05F.A06;
                    }
                    char c = ' ';
                    C0AK c0ak = c07960bG.A0A;
                    if (c0ak != null && activity != null) {
                        c = c0ak.A00(C0AG.A01(activity));
                    }
                    if (A02 > 127) {
                        A02 = StringTreeSet.MAX_SYMBOL_COUNT;
                    }
                    C07960bG.A02(c07960bG, num, (byte) c, (byte) A02);
                }
            }
        }

        @Override // X.C0M2
        public final void DXt(C11020iI c11020iI) {
            Integer num;
            C005801x c005801x = C005801x.this;
            C07960bG c07960bG = c005801x.A0F;
            if (c07960bG != null && c11020iI.AWk()) {
                Activity activity = ((AbstractC05380Qm) c11020iI).A00;
                boolean z = c11020iI.A03;
                int A02 = c005801x.A0A.A02();
                synchronized (c07960bG) {
                    if (z) {
                        num = C05F.A03;
                    } else {
                        num = C05F.A04;
                    }
                    char c = ' ';
                    C0AK c0ak = c07960bG.A0A;
                    if (c0ak != null && activity != null) {
                        c = c0ak.A00(C0AG.A01(activity));
                    }
                    if (A02 > 127) {
                        A02 = StringTreeSet.MAX_SYMBOL_COUNT;
                    }
                    C07960bG.A02(c07960bG, num, (byte) c, (byte) A02);
                }
            }
        }
    };
    public final InterfaceC04550Lx A0D = new InterfaceC04550Lx() { // from class: X.03o
        @Override // X.InterfaceC04550Lx
        public final void Db0() {
            C07960bG c07960bG = C005801x.this.A0F;
            if (c07960bG != null) {
                synchronized (c07960bG) {
                    C07960bG.A02(c07960bG, C05F.A09, new byte[0]);
                }
            }
        }

        @Override // X.InterfaceC04550Lx
        public final void Db1() {
            C07960bG c07960bG = C005801x.this.A0F;
            if (c07960bG != null) {
                synchronized (c07960bG) {
                    C07960bG.A02(c07960bG, C05F.A0A, new byte[0]);
                }
            }
        }

        @Override // X.InterfaceC04550Lx
        public final void DmF() {
            C07960bG c07960bG = C005801x.this.A0F;
            if (c07960bG != null) {
                synchronized (c07960bG) {
                    C07960bG.A02(c07960bG, C05F.A07, new byte[0]);
                }
            }
        }

        @Override // X.InterfaceC04550Lx
        public final void DmG() {
            C07960bG c07960bG = C005801x.this.A0F;
            if (c07960bG != null) {
                synchronized (c07960bG) {
                    C07960bG.A02(c07960bG, C05F.A08, new byte[0]);
                }
            }
        }
    };
    public Integer A02 = C05F.A01;
    public final Object A0O = new Object();
    public final Object A0P = new Object();
    public volatile Handler A0V = null;
    public final C03V A0J = new C03V(this);
    public final C03J A0K = new C03J(this);
    public final C02F A0L = new Object() { // from class: X.02F
    };
    public final boolean A0R = true;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.02F] */
    public C005801x(Application application, C0AG c0ag, C0AK c0ak, C0AM c0am, C0LW c0lw, InterfaceC04640Mg interfaceC04640Mg, InterfaceC04650Mh interfaceC04650Mh, C04480Lp c04480Lp, C05410Qp c05410Qp, C0Z0 c0z0, C0Pe c0Pe, RunnableC05150Ph runnableC05150Ph, int i, int i2, boolean z, boolean z2) {
        this.A09 = application;
        this.A0M = c0Pe;
        this.A0C = c0lw;
        this.A0A = c0ag;
        this.A0T = c0ak;
        this.A01 = interfaceC04640Mg;
        this.A0B = c0am;
        this.A0Q = z;
        this.A0N = runnableC05150Ph;
        this.A0H = c05410Qp;
        this.A0G = c04480Lp;
        this.A0I = c0z0;
        this.A08 = i2;
        this.A0U = z2;
        if (z2) {
            HandlerThread handlerThread = new HandlerThread() { // from class: X.0Ou
                {
                    super("AsyncQueryMultiWindow");
                }

                @Override // android.os.HandlerThread
                public final void onLooperPrepared() {
                    Looper looper = getLooper();
                    if (looper != null) {
                        C005801x.this.A0V = new Handler(looper);
                    }
                }
            };
            this.A0S = handlerThread;
            handlerThread.start();
        }
        File file = c0Pe.A05;
        C02R.A03(file, "Did you call SessionManager.init()?");
        this.A0F = new C07960bG(c0ak, interfaceC04650Mh, runnableC05150Ph, file, i, !z);
    }

    public static void A01(Activity activity, C005801x c005801x) {
        if (!c005801x.A05) {
            if (activity != null) {
                File file = c005801x.A0M.A05;
                C02R.A03(file, "Did you call SessionManager.init()?");
                try {
                    FileWriter fileWriter = new FileWriter(new File(file, "first_intent.txt"), false);
                    try {
                        fileWriter.write(activity.getIntent().toString());
                        fileWriter.close();
                    } finally {
                    }
                } catch (IOException unused) {
                }
            }
            if (c005801x.A00 != null) {
                if (c005801x.A0Q) {
                    c005801x.A0A.A03(C05F.A15, C0AI.A01);
                }
                C003801d c003801d = c005801x.A00;
                long uptimeMillis = SystemClock.uptimeMillis() - c005801x.A0M.A01;
                boolean z = c005801x.A04;
                synchronized (c003801d.A02) {
                    c003801d.A0D(Long.toString(uptimeMillis), 167, 10);
                    MappedByteBuffer mappedByteBuffer = c003801d.A01.A00;
                    int i = 48;
                    if (z) {
                        i = 49;
                    }
                    mappedByteBuffer.put(178, (byte) i);
                    C003801d.A02(c003801d);
                }
                C04480Lp c04480Lp = c005801x.A0G;
                if (c04480Lp != null) {
                    c04480Lp.A01(2);
                }
            }
            c005801x.A05 = true;
        }
    }

    @Override // X.C0OO
    public final int BDP() {
        return DexStore.MS_IN_NS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00db, code lost:
    
        if (r2 == 4) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0143 A[Catch: all -> 0x0148, TryCatch #3 {, blocks: (B:87:0x0100, B:89:0x0106, B:91:0x010a, B:93:0x010e, B:99:0x013c, B:100:0x013f, B:102:0x0143, B:103:0x0146, B:109:0x0112, B:110:0x0114, B:111:0x0118, B:113:0x011c, B:115:0x012c, B:118:0x0132), top: B:86:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013c A[Catch: all -> 0x0148, TryCatch #3 {, blocks: (B:87:0x0100, B:89:0x0106, B:91:0x010a, B:93:0x010e, B:99:0x013c, B:100:0x013f, B:102:0x0143, B:103:0x0146, B:109:0x0112, B:110:0x0114, B:111:0x0118, B:113:0x011c, B:115:0x012c, B:118:0x0132), top: B:86:0x0100 }] */
    @Override // X.C0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C005801x.start():void");
    }

    public static void A00() {
        synchronized (A0W) {
        }
    }

    public static void A02(C0LR c0lr, C0LW c0lw, C0M6 c0m6) {
        C0OO A05 = c0lw.A05(C005801x.class);
        if (A05 == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("CollectorName", C0LX.A00(c0lr.BW4()));
            hashMap.put("ReportCategory", c0m6.A00);
            C0PC.A00().DEh("ApplicationLifecycleDetector.addExtraCollector", new RuntimeException("Unable to add extra collector to ApplicationLifecycleDetector"), hashMap);
            C0K8.A0D("lacrima", "Cannot find registered detector");
            return;
        }
        c0lw.A07(c0lr, c0m6, A05);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0106  */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0AF, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(final android.app.Activity r21, java.lang.Integer r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C005801x.A03(android.app.Activity, java.lang.Integer, java.lang.String, boolean):void");
    }

    @Override // X.C0OO
    public final C0Z0 BNJ() {
        return this.A0I;
    }

    @Override // X.C0OO
    public final C0OP BW2() {
        return C0OP.A07;
    }

    @Override // X.InterfaceC04560Ly
    public final void Db2(int i) {
        C07960bG c07960bG = this.A0F;
        if (c07960bG != null) {
            synchronized (c07960bG) {
                if (i > 126) {
                    i = StringTreeSet.MAX_SYMBOL_COUNT;
                }
                C07960bG.A02(c07960bG, C05F.A0B, (byte) i);
            }
        }
    }
}
