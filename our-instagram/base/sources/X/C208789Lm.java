package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import java.io.File;
import java.io.FileDescriptor;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9Lm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208789Lm implements InterfaceC175067qg {
    public static final Camera.ShutterCallback A0f = new Camera.ShutterCallback() { // from class: X.9Mk
        @Override // android.hardware.Camera.ShutterCallback
        public final void onShutter() {
        }
    };
    public static volatile C208789Lm A0g;
    public int A00;
    public int A01;
    public int A02;
    public Camera.ErrorCallback A03;
    public InterfaceC25160BBf A04;
    public InterfaceC175197qt A05;
    public InterfaceC174657pz A06;
    public C176577tF A07;
    public Y1s A08;
    public InterfaceC176297sm A09;
    public boolean A0A;
    public boolean A0C;
    public Matrix A0D;
    public C9O9 A0E;
    public boolean A0F;
    public boolean A0G;
    public final C9M1 A0H;
    public final C209049Mm A0I;
    public final C208979Mf A0J;
    public final C72096XNq A0K;
    public final C209039Ml A0M;
    public final C208989Mg A0N;
    public final C175237qx A0Q;
    public final C175227qw A0R;
    public final int A0T;
    public final Context A0U;
    public volatile int A0Y;
    public volatile Camera A0Z;
    public volatile C176347sr A0a;
    public volatile InterfaceC175497rP A0b;
    public volatile FutureTask A0c;
    public volatile boolean A0d;
    public volatile boolean A0e;
    public final C1814082s A0O = new C1814082s();
    public final AtomicBoolean A0W = new AtomicBoolean(false);
    public final AtomicBoolean A0X = new AtomicBoolean(false);
    public final C209019Mj A0L = new C209019Mj();
    public final AtomicBoolean A0S = new AtomicBoolean(false);
    public boolean A0B = true;
    public final C1814082s A0P = new C1814082s();
    public final C1814082s A0V = new C1814082s();

    public static void A06(C208789Lm c208789Lm) {
        try {
            InterfaceC176297sm interfaceC176297sm = c208789Lm.A09;
            if (interfaceC176297sm != null) {
                interfaceC176297sm.Eom();
                c208789Lm.A09 = null;
            }
        } finally {
            c208789Lm.A0C(null);
            c208789Lm.A0d = false;
        }
    }

    public static synchronized void A07(C208789Lm c208789Lm) {
        synchronized (c208789Lm) {
            FutureTask futureTask = c208789Lm.A0c;
            if (futureTask != null) {
                c208789Lm.A0R.A08(futureTask);
                c208789Lm.A0c = null;
            }
        }
    }

    public final void A0B() {
        try {
            try {
                if (this.A0d) {
                    A06(this);
                }
            } catch (RuntimeException e) {
                android.util.Log.e("Camera1Device", "Stop video recording failed, likely due to nothing being captured", e);
            }
            if (this.A0Z != null) {
                A03();
                this.A0K.A00();
            }
            if (this.A0b != null) {
                this.A0b.EES(this.A0b.C4N());
            }
            this.A0b = null;
            this.A07 = null;
        } finally {
            if (this.A0Z != null) {
                A03();
                this.A0K.A00();
            }
            if (this.A0b != null) {
                this.A0b.EES(this.A0b.C4N());
            }
            this.A0b = null;
            this.A07 = null;
        }
    }

    public final void A0D(AbstractC184688Hj abstractC184688Hj, final FileDescriptor fileDescriptor, final String str) {
        if (str == null && fileDescriptor == null) {
            throw AbstractC166987dD.A12("Both videoPath and videoFileDescriptor cannot be null, one must contain a valid value");
        }
        if (!isConnected()) {
            abstractC184688Hj.A01(AbstractC166987dD.A18("Can't record video before it's initialised."));
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A0d = true;
        this.A0R.A00(new XW1(0, abstractC184688Hj, this), "start_video", new Callable() { // from class: X.B1L
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00cd, code lost:
            
                if (java.lang.Integer.valueOf(r5) == null) goto L27;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 428
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.B1L.call():java.lang.Object");
            }
        });
    }

    @Override // X.InterfaceC175067qg
    public final void A9h(InterfaceC25160BBf interfaceC25160BBf, int i) {
        if (interfaceC25160BBf != null) {
            C72096XNq c72096XNq = this.A0K;
            synchronized (c72096XNq) {
                AbstractC166997dE.A1U(interfaceC25160BBf, c72096XNq.A05, 1);
                c72096XNq.A03.A01(interfaceC25160BBf);
            }
            if (this.A0Q.A04) {
                this.A0R.A07("enable_preview_frame_listeners_with_buffers", new CallableC209549Op(this, 7));
                return;
            }
            return;
        }
        throw AbstractC166987dD.A12("listener and valid number of buffers required");
    }

    @Override // X.InterfaceC175067qg
    public final void ARu(AbstractC184688Hj abstractC184688Hj) {
        this.A0R.A00(abstractC184688Hj, "enable_video_focus", new CallableC209549Op(this, 2));
    }

    @Override // X.InterfaceC175067qg
    public final boolean Ce9() {
        try {
            return this.A0H.A04() > 1;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.InterfaceC175067qg
    public final void E3g(AbstractC184688Hj abstractC184688Hj) {
        this.A0R.A00(null, "pause_preview", new CallableC209549Op(this, 4));
    }

    @Override // X.InterfaceC175067qg
    public final void EKm(AbstractC184688Hj abstractC184688Hj) {
        this.A0R.A00(null, "resume_preview", new CallableC209549Op(this, 1));
    }

    @Override // X.InterfaceC175067qg
    public final void EbM(AbstractC184688Hj abstractC184688Hj, int i) {
        this.A0R.A00(abstractC184688Hj, "set_rotation", new CallableC208669La(this, i, 1));
    }

    @Override // X.InterfaceC175067qg
    public final void EoE(AbstractC184688Hj abstractC184688Hj, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2) {
        A0D(abstractC184688Hj, fileDescriptor, null);
    }

    @Override // X.InterfaceC175067qg
    public final void EoF(AbstractC184688Hj abstractC184688Hj, String str, String str2) {
        A0D(abstractC184688Hj, null, str);
    }

    @Override // X.InterfaceC175067qg
    public final void F9E(AbstractC184688Hj abstractC184688Hj, boolean z, boolean z2, boolean z3) {
        this.A0R.A00(abstractC184688Hj, "unlock_camera_values", new B1O(0, this, abstractC184688Hj, z3));
    }

    public static int A00(C208789Lm c208789Lm, int i) {
        int i2;
        int i3;
        int i4 = c208789Lm.A00;
        int A05 = c208789Lm.A0H.A05(i4);
        if (i != 1) {
            if (i != 2) {
                i2 = 270;
                if (i != 3) {
                    i2 = 0;
                }
            } else {
                i2 = 180;
            }
        } else {
            i2 = 90;
        }
        if (i4 == 1) {
            i3 = 360 - ((A05 + i2) % 360);
        } else {
            i3 = (A05 - i2) + 360;
        }
        return i3 % 360;
    }

    public static C208999Mh A01(C208789Lm c208789Lm, int i) {
        if (c208789Lm.A0b != null) {
            c208789Lm.A0b.CFN();
        }
        return c208789Lm.A0N.A00(i);
    }

    private void A03() {
        if (this.A0Z != null) {
            if (this.A0b != null) {
                this.A0b.CFN();
            }
            A07(this);
            this.A0W.set(false);
            this.A0X.set(false);
            Camera camera = this.A0Z;
            this.A0Z = null;
            C209039Ml c209039Ml = this.A0M;
            if (c209039Ml.A0B) {
                Handler handler = c209039Ml.A04;
                handler.removeMessages(1);
                handler.removeMessages(2);
                c209039Ml.A0A = null;
                Camera camera2 = c209039Ml.A03;
                camera2.getClass();
                camera2.setZoomChangeListener(null);
                c209039Ml.A03 = null;
                c209039Ml.A0B = false;
            }
            C209049Mm c209049Mm = this.A0I;
            c209049Mm.A06.A06("The FocusController must be released on the Optic thread.");
            c209049Mm.A09 = false;
            c209049Mm.A01 = null;
            c209049Mm.A08 = false;
            c209049Mm.A07 = false;
            this.A0e = false;
            C208989Mg c208989Mg = this.A0N;
            c208989Mg.A02.remove(C9M1.A00(c208989Mg.A03, this.A00));
            this.A0R.A03("close_camera_on_camera_handler_thread", new CallableC72062XMf(7, camera, this));
        }
    }

    public static void A04(C208789Lm c208789Lm) {
        C209019Mj c209019Mj = c208789Lm.A0L;
        AtomicReference atomicReference = c209019Mj.A00;
        Object obj = atomicReference.get();
        obj.getClass();
        ((CountDownLatch) obj).countDown();
        Object obj2 = atomicReference.get();
        obj2.getClass();
        ((CountDownLatch) obj2).countDown();
        c209019Mj.A01(0);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.9Mh, java.lang.Object, X.7te] */
    public static void A08(final C208789Lm c208789Lm, int i) {
        if (c208789Lm.A0U.checkSelfPermission("android.permission.CAMERA") == 0) {
            C176567tE.A01("Should not check for open camera on the UI thread.");
            if (c208789Lm.A0Z == null || c208789Lm.A00 != i) {
                int A00 = C9M1.A00(c208789Lm.A0H, i);
                if (A00 != -1) {
                    c208789Lm.A03();
                    C196998nU.A00().A00 = SystemClock.elapsedRealtime();
                    Camera camera = (Camera) c208789Lm.A0R.A03("open_camera_on_camera_handler_thread", new CallableC208669La(c208789Lm, A00, 2));
                    camera.getClass();
                    c208789Lm.A0Z = camera;
                    c208789Lm.A00 = i;
                    Camera camera2 = c208789Lm.A0Z;
                    Camera.ErrorCallback errorCallback = c208789Lm.A03;
                    if (errorCallback == null) {
                        errorCallback = new Camera.ErrorCallback() { // from class: X.9NI
                            @Override // android.hardware.Camera.ErrorCallback
                            public final void onError(int i2, Camera camera3) {
                                String A002;
                                final C208789Lm c208789Lm2 = C208789Lm.this;
                                final boolean z = false;
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (i2 != 100) {
                                            A002 = AnonymousClass001.A0O(AbstractC58317Pt9.A00(639), i2);
                                        } else {
                                            A002 = "Camera server died. Camera resources will be released.";
                                        }
                                    } else {
                                        A002 = "Camera evicted. Camera service was likely given to another customer. Camera resources will be released.";
                                    }
                                    z = true;
                                } else {
                                    A002 = AbstractC43591JPw.A00(283);
                                }
                                final List list = c208789Lm2.A0O.A00;
                                final UUID uuid = c208789Lm2.A0Q.A03;
                                C176347sr c176347sr = c208789Lm2.A0a;
                                if (c176347sr != null && !c176347sr.A00.isEmpty()) {
                                    C176567tE.A00(new RunnableC24281Apm(c176347sr));
                                }
                                android.util.Log.e("Camera1Device", A002);
                                final B4Y b4y = new B4Y(i2, A002);
                                c208789Lm2.A0R.A05(new Runnable() { // from class: X.AzL
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C208789Lm c208789Lm3 = c208789Lm2;
                                        List list2 = list;
                                        B4Y b4y2 = b4y;
                                        boolean z2 = z;
                                        UUID uuid2 = uuid;
                                        int size = list2.size();
                                        for (int i3 = 0; i3 < size; i3++) {
                                            ((InterfaceC175457rL) list2.get(i3)).DE9(b4y2);
                                        }
                                        if (z2) {
                                            c208789Lm3.A0Q.A05(uuid2);
                                            c208789Lm3.APd(null);
                                        }
                                    }
                                }, uuid);
                            }
                        };
                        c208789Lm.A03 = errorCallback;
                    }
                    camera2.setErrorCallback(errorCallback);
                    C208989Mg c208989Mg = c208789Lm.A0N;
                    Camera camera3 = c208789Lm.A0Z;
                    if (camera3 != null) {
                        AbstractC175037qd.A00(43, 0, null);
                        int A002 = C9M1.A00(c208989Mg.A03, i);
                        Camera.Parameters parameters = camera3.getParameters();
                        C9MK c9mk = new C9MK(parameters);
                        c208989Mg.A00.put(A002, c9mk);
                        C9MI c9mi = new C9MI(parameters, c9mk);
                        c208989Mg.A01.put(A002, c9mi);
                        SparseArray sparseArray = c208989Mg.A02;
                        ?? abstractC176827te = new AbstractC176827te();
                        abstractC176827te.A00 = c9mk;
                        abstractC176827te.A01 = new C208959Md(parameters, camera3, c9mk, c9mi, i);
                        sparseArray.put(A002, abstractC176827te);
                        AbstractC175037qd.A00(44, 0, null);
                        return;
                    }
                    throw AbstractC166987dD.A15("camera is null!");
                }
                throw new UnsupportedOperationException(AnonymousClass001.A0O("Open Camera 1 failed: camera facing is not available: ", i));
            }
            return;
        }
        throw new SecurityException("Open Camera 1 failed: No camera permissions!");
    }

    public static void A0A(C208789Lm c208789Lm, boolean z) {
        C176567tE.A01("Performing post photo capture on UI thread");
        if (c208789Lm.isConnected()) {
            if (z) {
                A05(c208789Lm);
            }
            c208789Lm.A0L.A01(0);
        }
    }

    public final void A0C(MediaRecorder mediaRecorder) {
        Camera camera = this.A0Z;
        if (camera != null) {
            boolean z = this.A0A;
            int i = this.A02;
            if (mediaRecorder != null) {
                if (AbstractC176937tp.A02(AbstractC177127u8.A01)) {
                    this.A0I.A02();
                }
                camera.unlock();
                mediaRecorder.setCamera(camera);
                mediaRecorder.setVideoSource(1);
                return;
            }
            camera.lock();
            if (AbstractC176937tp.A02(AbstractC177127u8.A01)) {
                camera.reconnect();
            }
            C208999Mh A01 = A01(this, this.A00);
            AbstractC176827te.A00(AbstractC176797tb.A0B, A01, i);
            ((AbstractC176827te) A01).A00.A01(AbstractC176797tb.A0W, Boolean.valueOf(z));
            A01.A04();
            A01.A03();
        }
    }

    @Override // X.InterfaceC175067qg
    public final void A8T(InterfaceC175457rL interfaceC175457rL) {
        this.A0O.A01(interfaceC175457rL);
    }

    @Override // X.InterfaceC175067qg
    public final void A8v(InterfaceC174727q7 interfaceC174727q7) {
        if (this.A0a == null) {
            this.A0a = new C176347sr();
            this.A0J.A03 = this.A0a;
        }
        this.A0a.A00.add(interfaceC174727q7);
    }

    @Override // X.InterfaceC175067qg
    public final boolean A9L(InterfaceC175167qq interfaceC175167qq) {
        return this.A0V.A01(interfaceC175167qq);
    }

    @Override // X.InterfaceC175067qg
    public final void A9g(InterfaceC25160BBf interfaceC25160BBf) {
        C72096XNq c72096XNq = this.A0K;
        synchronized (c72096XNq) {
            c72096XNq.A03.A01(interfaceC25160BBf);
        }
        AbstractC176797tb A02 = this.A0N.A02(this.A00);
        C175227qw c175227qw = this.A0R;
        boolean A09 = c175227qw.A09();
        boolean isConnected = isConnected();
        if (A09) {
            if (isConnected) {
                c72096XNq.A02(this.A0Z, (C176877tj) A02.A02(AbstractC176797tb.A0q), AbstractC167017dG.A0H(AbstractC176797tb.A0m, A02));
            }
        } else {
            if (!isConnected) {
                return;
            }
            c175227qw.A07("enable_preview_frame_listeners", new CallableC72062XMf(1, A02, this));
        }
    }

    @Override // X.InterfaceC175067qg
    public final void A9i(InterfaceC184558Gw interfaceC184558Gw) {
        InterfaceC174657pz interfaceC174657pz = this.A06;
        if (interfaceC174657pz != null && AbstractC166987dD.A1a(interfaceC174657pz.AXQ(InterfaceC174657pz.A0G))) {
            this.A0R.A07("add_on_preview_started_listener", new CallableC72062XMf(3, interfaceC184558Gw, this));
        } else {
            this.A0J.A01.A01(interfaceC184558Gw);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void A9j(InterfaceC174807qG interfaceC174807qG) {
        C208979Mf c208979Mf = this.A0J;
        if (c208979Mf.A00.A01()) {
            interfaceC174807qG.Dal();
        }
        c208979Mf.A02.A01(interfaceC174807qG);
    }

    @Override // X.InterfaceC175067qg
    public final void AAs(C184848Hz c184848Hz) {
        this.A0M.A06.A01(c184848Hz);
    }

    @Override // X.InterfaceC175067qg
    public final int AFE(int i, int i2) {
        return this.A0H.A06(i, i2);
    }

    @Override // X.InterfaceC175067qg
    public final void AJR(C176587tG c176587tG, AbstractC184688Hj abstractC184688Hj, final InterfaceC174657pz interfaceC174657pz, InterfaceC175017qb interfaceC175017qb, final C176577tF c176577tF, String str, final int i, final int i2) {
        AbstractC175037qd.A00 = 9;
        AbstractC175037qd.A00(9, 0, null);
        this.A0R.A00(abstractC184688Hj, "connect", new Callable() { // from class: X.9M0
            /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a2: INVOKE (r3v0 ?? I:X.9Lm), (r4 I:X.8pp) VIRTUAL call: X.9Lm.EUe(X.8pp):void A[MD:(X.8pp):void (m)] (LINE:162), block:B:33:0x008e */
            /* JADX WARN: Not initialized variable reg: 5, insn: 0x0090: INVOKE (r0v0 ?? I:int), (r5 I:int), (r2 I:java.lang.Object) STATIC call: X.7qd.A00(int, int, java.lang.Object):void A[MD:(int, int, java.lang.Object):void (m)] (LINE:144), block:B:33:0x008e */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int A00;
                InterfaceC198408pp EUe;
                C208789Lm c208789Lm = C208789Lm.this;
                C176577tF c176577tF2 = c176577tF;
                int i3 = i;
                InterfaceC174657pz interfaceC174657pz2 = interfaceC174657pz;
                int i4 = i2;
                try {
                    AbstractC175037qd.A00(11, 0, null);
                    if (c208789Lm.A0b != null && c208789Lm.A0b != c176577tF2.A02) {
                        c208789Lm.A0b.EES(c208789Lm.A0b.C4N());
                        c208789Lm.A0b = null;
                    }
                    C9M1 c9m1 = c208789Lm.A0H;
                    if (c9m1.A00.A09()) {
                        if (C9M1.A00(c9m1, i3) == -1) {
                            if (c9m1.A04() > 0) {
                                if (i3 == 0) {
                                    if (c9m1.A08(1)) {
                                        AbstractC175037qd.A03("CameraInventory", "Requested back camera doesn't exist, using front instead");
                                        i3 = 1;
                                    }
                                    throw AbstractC166987dD.A18(AnonymousClass001.A0c("found ", " cameras with bad facing constants", C9M1.A03));
                                }
                                if (i3 == 1 && c9m1.A08(0)) {
                                    AbstractC175037qd.A03("CameraInventory", "Requested front camera doesn't exist, using back instead");
                                    i3 = 0;
                                }
                                throw AbstractC166987dD.A18(AnonymousClass001.A0c("found ", " cameras with bad facing constants", C9M1.A03));
                            }
                            throw new C212539bM();
                        }
                        C208789Lm.A08(c208789Lm, i3);
                        C177447ue A02 = C208789Lm.A02(c208789Lm, interfaceC174657pz2, c176577tF2, i4);
                        AbstractC175037qd.A00(12, c208789Lm.A00, A02);
                        return A02;
                    }
                    throw AbstractC166987dD.A18("Cannot resolve camera facing, not on the Optic thread");
                } catch (Exception e) {
                    AbstractC175037qd.A00(13, A00, e);
                    C208789Lm.A04(c208789Lm);
                    C208979Mf c208979Mf = c208789Lm.A0J;
                    c208979Mf.A01.A00();
                    c208979Mf.A02.A00();
                    c208789Lm.EUe(EUe);
                    c208789Lm.A0M.A06.A00();
                    c208789Lm.A0P.A00();
                    c208789Lm.A0B();
                    throw e;
                }
            }
        });
        AbstractC175037qd.A00(10, 0, null);
    }

    @Override // X.InterfaceC175067qg
    public final boolean APd(AbstractC184688Hj abstractC184688Hj) {
        UUID uuid = this.A0Q.A03;
        AbstractC175037qd.A00(23, 0, null);
        A04(this);
        C208979Mf c208979Mf = this.A0J;
        c208979Mf.A01.A00();
        c208979Mf.A02.A00();
        EUe(null);
        this.A0M.A06.A00();
        this.A0P.A00();
        C175227qw c175227qw = this.A0R;
        c175227qw.A00(abstractC184688Hj, "disconnect", new CallableC72062XMf(0, uuid, this));
        c175227qw.A07("disconnect_guard", new CallableC64783TTv(0));
        return true;
    }

    @Override // X.InterfaceC175067qg
    public final void AWH(int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0T;
        rect.inset(i3, i3);
        this.A0R.A00(new XW0(this, 0), "focus", new CallableC72062XMf(4, rect, this));
    }

    @Override // X.InterfaceC175067qg
    public final Handler Ajq() {
        Handler handler = this.A0R.A00;
        if (handler == null) {
            return C176567tE.A00;
        }
        return handler;
    }

    @Override // X.InterfaceC175067qg
    public final int Ak0() {
        return this.A00;
    }

    @Override // X.InterfaceC175067qg
    public final AbstractC176767tY AlU() {
        A0F("Cannot get camera capabilities");
        return this.A0N.A01(this.A00);
    }

    @Override // X.InterfaceC175067qg
    public final void BYA(AbstractC184688Hj abstractC184688Hj) {
        C9M1 c9m1 = this.A0H;
        int i = C9M1.A03;
        if (i == -1) {
            if (C9M1.A03(c9m1)) {
                i = C9M1.A03;
            } else {
                c9m1.A00.A01(abstractC184688Hj, "get_number_of_cameras", new CallableC209549Op(c9m1, 8));
                return;
            }
        }
        abstractC184688Hj.A02(Integer.valueOf(i));
    }

    @Override // X.InterfaceC175067qg
    public final void BYB(AbstractC184688Hj abstractC184688Hj, int i) {
        C9M1 c9m1 = this.A0H;
        c9m1.A00.A01(abstractC184688Hj, "get_number_of_cameras_facing", new CallableC208669La(c9m1, i, 4));
    }

    @Override // X.InterfaceC175067qg
    public final int BtN() {
        return this.A0H.A05(this.A00);
    }

    @Override // X.InterfaceC175067qg
    public final AbstractC176797tb Bty() {
        A0F("Cannot get camera settings");
        return this.A0N.A02(this.A00);
    }

    @Override // X.InterfaceC175067qg
    public final int CIn() {
        C209039Ml c209039Ml = this.A0M;
        if (c209039Ml.A0B) {
            return c209039Ml.A09;
        }
        return 0;
    }

    @Override // X.InterfaceC175067qg
    public final void CKl(AbstractC184688Hj abstractC184688Hj) {
        this.A0H.A07(abstractC184688Hj, 0);
    }

    @Override // X.InterfaceC175067qg
    public final boolean CKn(int i) {
        try {
            return this.A0H.A08(i);
        } catch (RuntimeException unused) {
            return false;
        }
    }

    @Override // X.InterfaceC175067qg
    public final void CKy(AbstractC184688Hj abstractC184688Hj) {
        this.A0H.A07(abstractC184688Hj, 1);
    }

    @Override // X.InterfaceC175067qg
    public final void CO9(Matrix matrix, int i, int i2, int i3) {
        C9O9 c9o9 = new C9O9(matrix, i3, A00(this, this.A01), i, i2);
        this.A0E = c9o9;
        this.A0I.A03 = c9o9;
    }

    @Override // X.InterfaceC175067qg
    public final boolean Cav() {
        return this.A0J.A00.A01();
    }

    @Override // X.InterfaceC175067qg
    public final boolean Cbe() {
        return this.A0d;
    }

    @Override // X.InterfaceC175067qg
    public final boolean CeD() {
        return AbstractC167007dF.A1O((C209019Mj.A00(this.A0L).getCount() > 0L ? 1 : (C209019Mj.A00(this.A0L).getCount() == 0L ? 0 : -1)));
    }

    @Override // X.InterfaceC175067qg
    public final void Chr(AbstractC184688Hj abstractC184688Hj, boolean z, boolean z2, final boolean z3) {
        this.A0R.A00(abstractC184688Hj, "lock_camera_values", new Callable() { // from class: X.B0o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C208789Lm c208789Lm = C208789Lm.this;
                boolean z4 = z3;
                if (c208789Lm.isConnected()) {
                    if (z4) {
                        C209049Mm c209049Mm = c208789Lm.A0I;
                        c209049Mm.A06.A06("Lock focus can only happen on the Optic thread.");
                        if (c209049Mm.A09) {
                            if (c209049Mm.A09) {
                                int A0H = AbstractC167017dG.A0H(AbstractC176797tb.A0D, c209049Mm.A05.A02(c209049Mm.A00));
                                if (A0H == 1 || A0H == 2) {
                                    c209049Mm.A04 = false;
                                    if (!c209049Mm.A07 && !c209049Mm.A08) {
                                        c209049Mm.A03(null, null);
                                    }
                                }
                            }
                        } else {
                            c209049Mm.A07 = false;
                            C209049Mm.A00(null, c209049Mm.A02, c209049Mm, C05F.A0j);
                        }
                    }
                    C208999Mh A01 = C208789Lm.A01(c208789Lm, c208789Lm.A00);
                    ((AbstractC176827te) A01).A00.A01(AbstractC176797tb.A0P, true);
                    ((AbstractC176827te) A01).A00.A01(AbstractC176797tb.A0R, true);
                    A01.A03();
                    return null;
                }
                throw new C6M2("Failed to lock automatics (focus, exposure, white-balance)");
            }
        });
    }

    @Override // X.InterfaceC175067qg
    public final boolean Cmt(float[] fArr) {
        C9O9 c9o9 = this.A0E;
        if (c9o9 == null) {
            return false;
        }
        c9o9.A00.mapPoints(fArr);
        return true;
    }

    @Override // X.InterfaceC175067qg
    public final void Cpo(AbstractC184688Hj abstractC184688Hj, C177007tw c177007tw) {
        this.A0R.A00(abstractC184688Hj, "modify_settings", new CallableC72062XMf(2, c177007tw, this));
    }

    @Override // X.InterfaceC175067qg
    public final void DX0(int i) {
        if (!this.A0F) {
            this.A0Y = i;
            InterfaceC175497rP interfaceC175497rP = this.A0b;
            if (interfaceC175497rP != null) {
                interfaceC175497rP.DA4(this.A0Y);
            }
        }
    }

    @Override // X.InterfaceC175067qg
    public final void E2d(AbstractC184688Hj abstractC184688Hj, String str, int i) {
        throw new UnsupportedOperationException("Concurrent front back mode not supported with Camera1");
    }

    @Override // X.InterfaceC175067qg
    public final void ECd(String str, View view) {
        if (this.A0a != null) {
            C176347sr c176347sr = this.A0a;
            if (view != null && !c176347sr.A00.isEmpty()) {
                C176567tE.A00(new RunnableC176557tD(view, c176347sr));
            }
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EFI(InterfaceC175457rL interfaceC175457rL) {
        this.A0O.A02(interfaceC175457rL);
    }

    @Override // X.InterfaceC175067qg
    public final void EFU(InterfaceC174727q7 interfaceC174727q7) {
        if (this.A0a != null) {
            this.A0a.A00.remove(interfaceC174727q7);
            if (!(!this.A0a.A00.isEmpty())) {
                this.A0a = null;
                this.A0J.A03 = null;
            }
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EFi(InterfaceC175167qq interfaceC175167qq) {
        this.A0V.A02(interfaceC175167qq);
    }

    @Override // X.InterfaceC175067qg
    public final void EFz(InterfaceC25160BBf interfaceC25160BBf) {
        if (interfaceC25160BBf != null) {
            C72096XNq c72096XNq = this.A0K;
            synchronized (c72096XNq) {
                c72096XNq.A05.remove(interfaceC25160BBf);
                c72096XNq.A03.A02(interfaceC25160BBf);
            }
            if (this.A0Q.A04) {
                this.A0R.A07("disable_preview_frame_listeners", new CallableC209549Op(this, 3));
                return;
            }
            return;
        }
        throw AbstractC166987dD.A12("listener is required");
    }

    @Override // X.InterfaceC175067qg
    public final void EG0(InterfaceC184558Gw interfaceC184558Gw) {
        InterfaceC174657pz interfaceC174657pz = this.A06;
        if (interfaceC174657pz != null && AbstractC166987dD.A1a(interfaceC174657pz.AXQ(InterfaceC174657pz.A0G))) {
            this.A0R.A07("remove_on_preview_started_listener", new CallableC72062XMf(6, interfaceC184558Gw, this));
        } else {
            this.A0J.A01.A02(interfaceC184558Gw);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EG1(InterfaceC174807qG interfaceC174807qG) {
        this.A0J.A02.A02(interfaceC174807qG);
    }

    @Override // X.InterfaceC175067qg
    public final void EUe(InterfaceC198408pp interfaceC198408pp) {
        this.A0I.A02 = interfaceC198408pp;
    }

    @Override // X.InterfaceC175067qg
    public final void EVB(AbstractC184688Hj abstractC184688Hj, boolean z) {
        throw new UnsupportedOperationException("isHLGCreationAllowed is not supported in Camera1 api");
    }

    @Override // X.InterfaceC175067qg
    public final void EYx(boolean z) {
        this.A0F = z;
        if (z) {
            this.A0Y = 0;
            InterfaceC175497rP interfaceC175497rP = this.A0b;
            if (interfaceC175497rP != null) {
                interfaceC175497rP.DA4(this.A0Y);
            }
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EZy(InterfaceC175397rF interfaceC175397rF) {
        this.A0Q.A04(interfaceC175397rF);
    }

    @Override // X.InterfaceC175067qg
    public final void EhW(AbstractC184688Hj abstractC184688Hj, int i) {
        this.A0R.A00(abstractC184688Hj, "set_zoom_level", new CallableC208669La(this, i, 3));
    }

    @Override // X.InterfaceC175067qg
    public final void EhX(final float f, final float f2) {
        this.A0R.A07("zoom_to_percent", new Callable() { // from class: X.B1C
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C208789Lm c208789Lm = C208789Lm.this;
                float f3 = f;
                float f4 = f2;
                if (c208789Lm.isConnected() && c208789Lm.A0e) {
                    int A0H = AbstractC166987dD.A0H(c208789Lm.AlU().A01(AbstractC176767tY.A0j));
                    int min = Math.min(Math.max(0, (int) (f3 + (f4 * (A0H - f3)))), A0H);
                    c208789Lm.A0M.A00(min);
                    return Integer.valueOf(min);
                }
                return 0;
            }
        });
    }

    @Override // X.InterfaceC175067qg
    public final void EmH(AbstractC184688Hj abstractC184688Hj, float f) {
        throw new UnsupportedOperationException("smoothZoomTo() is not supported in Camera1 API.");
    }

    @Override // X.InterfaceC175067qg
    public final void Emb(AbstractC184688Hj abstractC184688Hj, int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0T;
        rect.inset(i3, i3);
        this.A0R.A00(abstractC184688Hj, "spot_meter", new CallableC72062XMf(5, rect, this));
    }

    @Override // X.InterfaceC175067qg
    public final void EoC(AbstractC184688Hj abstractC184688Hj, C23106AGs c23106AGs) {
        File file = (File) c23106AGs.A00(C23106AGs.A07);
        String str = (String) c23106AGs.A00(C23106AGs.A09);
        FileDescriptor fileDescriptor = (FileDescriptor) c23106AGs.A00(C23106AGs.A08);
        if (file != null) {
            EoD(abstractC184688Hj, file, null);
        } else if (str != null) {
            EoF(abstractC184688Hj, str, null);
        } else {
            if (fileDescriptor == null) {
                return;
            }
            EoE(abstractC184688Hj, fileDescriptor, null);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void Eop(AbstractC184688Hj abstractC184688Hj, final boolean z) {
        if (!this.A0d) {
            abstractC184688Hj.A01(AbstractC166987dD.A18("Not recording video"));
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A0R.A00(abstractC184688Hj, AbstractC111324zv.A00(5407), new Callable() { // from class: X.B1B
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C208789Lm c208789Lm = C208789Lm.this;
                boolean z2 = z;
                long j = elapsedRealtime;
                if (c208789Lm.A0d) {
                    Y1s y1s = c208789Lm.A08;
                    y1s.getClass();
                    y1s.A02(Y1s.A0Y, Long.valueOf(SystemClock.elapsedRealtime()));
                    C208789Lm.A06(c208789Lm);
                    if (z2) {
                        C208789Lm.A05(c208789Lm);
                    }
                    Y1s y1s2 = c208789Lm.A08;
                    y1s2.getClass();
                    y1s2.A02(Y1s.A0X, Long.valueOf(j));
                    return c208789Lm.A08;
                }
                throw AbstractC166987dD.A14("Not recording video.");
            }
        });
    }

    @Override // X.InterfaceC175067qg
    public final boolean isConnected() {
        if (this.A0Z != null) {
            if (this.A0W.get() || this.A0X.get()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C208789Lm(Context context) {
        this.A0U = context;
        C175227qw c175227qw = new C175227qw();
        this.A0R = c175227qw;
        C175237qx c175237qx = new C175237qx(c175227qw);
        this.A0Q = c175237qx;
        C9M1 c9m1 = new C9M1(context.getPackageManager(), c175237qx, c175227qw);
        this.A0H = c9m1;
        C208989Mg c208989Mg = new C208989Mg(c9m1);
        this.A0N = c208989Mg;
        this.A0J = new C208979Mf();
        this.A0M = new C209039Ml(c208989Mg, c175227qw);
        this.A0I = new C209049Mm(c208989Mg, c175227qw);
        this.A0T = Math.round(TypedValue.applyDimension(1, 30.0f, AbstractC167007dF.A0K(context)));
        this.A0K = new C72096XNq();
    }

    public static C177447ue A02(C208789Lm c208789Lm, InterfaceC174657pz interfaceC174657pz, C176577tF c176577tF, int i) {
        C176997tv CFI;
        int i2;
        AbstractC09790fc.A01("Camera1Device.initialiseCamera", -1360237865);
        C176567tE.A01("initialiseCamera should not run on the UI thread");
        SystemClock.elapsedRealtime();
        if (c208789Lm.A0Z != null) {
            AbstractC175037qd.A00(39, 0, null);
            AtomicBoolean atomicBoolean = c208789Lm.A0W;
            if (atomicBoolean.get() && c176577tF.equals(c208789Lm.A07) && c208789Lm.A0b == c176577tF.A02 && c208789Lm.A01 == i && !AbstractC166987dD.A1a(interfaceC174657pz.AXQ(InterfaceC174657pz.A0S))) {
                if (c208789Lm.A0J.A00.A01()) {
                    A05(c208789Lm);
                }
                return new C177447ue(c208789Lm.AlU(), null, c208789Lm.Bty(), c208789Lm.A00, false);
            }
            c208789Lm.A06 = interfaceC174657pz;
            c208789Lm.A07 = c176577tF;
            InterfaceC175497rP interfaceC175497rP = c176577tF.A02;
            c208789Lm.A0b = interfaceC175497rP;
            c208789Lm.A0J.A01(false, c208789Lm.A0Z);
            EnumC174667q0 enumC174667q0 = (EnumC174667q0) c208789Lm.A06.AXQ(InterfaceC174657pz.A0R);
            EnumC174667q0 enumC174667q02 = (EnumC174667q0) c208789Lm.A06.AXQ(InterfaceC174657pz.A0W);
            int i3 = c176577tF.A01;
            int i4 = c176577tF.A00;
            InterfaceC174637px interfaceC174637px = (InterfaceC174637px) c208789Lm.A06.AXQ(InterfaceC174657pz.A0U);
            C174687q2 c174687q2 = (C174687q2) c208789Lm.A06.AXQ(InterfaceC174657pz.A0A);
            c208789Lm.A0C = AbstractC166987dD.A1a(interfaceC174657pz.AXQ(InterfaceC174657pz.A0F));
            boolean A1a = AbstractC166987dD.A1a(interfaceC174657pz.AXQ(InterfaceC174657pz.A0I));
            c208789Lm.A01 = i;
            int A00 = A00(c208789Lm, i);
            C208989Mg c208989Mg = c208789Lm.A0N;
            AbstractC176767tY A01 = c208989Mg.A01(c208789Lm.A00);
            EnumC174667q0 enumC174667q03 = EnumC174667q0.DEACTIVATED;
            boolean equals = enumC174667q02.equals(enumC174667q03);
            if (!equals && !enumC174667q0.equals(enumC174667q03)) {
                CFI = interfaceC174637px.ApU(enumC174667q0, enumC174667q02, (List) A01.A01(AbstractC176767tY.A10), (List) A01.A01(AbstractC176767tY.A1A), (List) A01.A01(AbstractC176767tY.A14), null, i3, i4, A00);
            } else {
                boolean equals2 = enumC174667q0.equals(enumC174667q03);
                if (equals) {
                    if (!equals2) {
                        CFI = interfaceC174637px.Bcq(enumC174667q0, (List) A01.A01(AbstractC176767tY.A10), (List) A01.A01(AbstractC176767tY.A14), i3, i4, A00);
                    }
                    CFI = interfaceC174637px.Bfv((List) A01.A01(AbstractC176767tY.A14), i3, i4, A00);
                } else {
                    if (equals2) {
                        CFI = interfaceC174637px.CFI(enumC174667q02, (List) A01.A01(AbstractC176767tY.A1A), (List) A01.A01(AbstractC176767tY.A14), i3, i4, A00);
                    }
                    CFI = interfaceC174637px.Bfv((List) A01.A01(AbstractC176767tY.A14), i3, i4, A00);
                }
            }
            if (CFI != null) {
                C208999Mh A012 = A01(c208789Lm, c208789Lm.A00);
                if (A1a) {
                    ((AbstractC176827te) A012).A00.A01(AbstractC176797tb.A0c, new C176877tj(0, 0));
                }
                C176877tj c176877tj = CFI.A00;
                if (c176877tj == null) {
                    if (CFI.A01 == null) {
                        throw AbstractC166987dD.A18("SizeSetter returned null sizes!");
                    }
                } else {
                    ((AbstractC176827te) A012).A00.A01(AbstractC176797tb.A0k, c176877tj);
                }
                C176877tj c176877tj2 = CFI.A01;
                if (c176877tj2 != null) {
                    ((AbstractC176827te) A012).A00.A01(AbstractC176797tb.A0q, c176877tj2);
                }
                C176877tj c176877tj3 = CFI.A02;
                if (c176877tj3 != null) {
                    ((AbstractC176827te) A012).A00.A01(AbstractC176797tb.A0y, c176877tj3);
                }
                A012.A04();
                ((AbstractC176827te) A012).A00.A01(AbstractC176797tb.A00, 3);
                ((AbstractC176827te) A012).A00.A01(AbstractC176797tb.A0z, 1);
                ((AbstractC176827te) A012).A00.A01(AbstractC176797tb.A0n, c174687q2.A00((List) A012.A00.A01(AbstractC176767tY.A12)));
                ((AbstractC176827te) A012).A00.A01(AbstractC176797tb.A0s, 0);
                int i5 = c208789Lm.A00;
                AbstractC176767tY A013 = c208989Mg.A01(i5);
                Number number = (Number) c208789Lm.A06.AXQ(InterfaceC174657pz.A0K);
                if (number.intValue() != 0) {
                    ((AbstractC176827te) A012).A00.A01(AbstractC176797tb.A0a, number);
                }
                A012.A03();
                C72096XNq c72096XNq = c208789Lm.A0K;
                c72096XNq.A01(c208789Lm.A0Z);
                AbstractC176797tb A02 = c208989Mg.A02(i5);
                C176807tc c176807tc = AbstractC176797tb.A0q;
                Object A022 = A02.A02(c176807tc);
                A022.getClass();
                C176877tj c176877tj4 = (C176877tj) A022;
                int i6 = c176877tj4.A02;
                int i7 = c176877tj4.A01;
                AbstractC09790fc.A01(AnonymousClass001.A02(i6, i7, "startCameraPreview ", "x"), -1727691802);
                AbstractC175037qd.A00(37, 0, null);
                C176807tc c176807tc2 = AbstractC176797tb.A0m;
                int A0H = AbstractC167017dG.A0H(c176807tc2, A02);
                int A05 = c208789Lm.A0H.A05(i5);
                int i8 = c208789Lm.A0Y;
                int i9 = c208789Lm.A01;
                if (i9 != 1) {
                    if (i9 != 2) {
                        i2 = 270;
                        if (i9 != 3) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 180;
                    }
                } else {
                    i2 = 90;
                }
                SurfaceTexture C4L = interfaceC175497rP.C4L(i6, i7, A0H, A05, i8, i2, i5, 0);
                AbstractC175037qd.A00(38, 0, null);
                if (C4L != null) {
                    c208789Lm.A0Z.setPreviewTexture(C4L);
                }
                boolean FE6 = interfaceC175497rP.FE6();
                Camera camera = c208789Lm.A0Z;
                if (FE6) {
                    camera.setDisplayOrientation(A00(c208789Lm, 0));
                } else {
                    camera.setDisplayOrientation(A00);
                }
                c208789Lm.A0G = AbstractC167007dF.A1S(AbstractC176767tY.A0a, A013);
                atomicBoolean.set(true);
                c208789Lm.A0X.set(false);
                c208789Lm.A0e = AbstractC167007dF.A1S(AbstractC176767tY.A0f, A013);
                C209039Ml c209039Ml = c208789Lm.A0M;
                Camera camera2 = c208789Lm.A0Z;
                int i10 = c208789Lm.A00;
                c209039Ml.A03 = camera2;
                c209039Ml.A00 = i10;
                C208989Mg c208989Mg2 = c209039Ml.A05;
                AbstractC176767tY A014 = c208989Mg2.A01(i10);
                c209039Ml.A0A = (List) A014.A01(AbstractC176767tY.A1D);
                c209039Ml.A0E = AbstractC167007dF.A1S(AbstractC176767tY.A0e, A014);
                c209039Ml.A09 = AbstractC167017dG.A0H(AbstractC176797tb.A11, c208989Mg2.A02(i10));
                c209039Ml.A01 = AbstractC166987dD.A0H(c208989Mg2.A01(i10).A01(AbstractC176767tY.A0j));
                Camera camera3 = c209039Ml.A03;
                camera3.getClass();
                camera3.setZoomChangeListener(c209039Ml);
                c209039Ml.A0B = true;
                C209049Mm c209049Mm = c208789Lm.A0I;
                Camera camera4 = c208789Lm.A0Z;
                int i11 = c208789Lm.A00;
                c209049Mm.A06.A06("The FocusController must be prepared on the Optic thread.");
                c209049Mm.A01 = camera4;
                c209049Mm.A00 = i11;
                c209049Mm.A09 = true;
                c209049Mm.A08 = false;
                c209049Mm.A07 = false;
                c209049Mm.A04 = true;
                c209049Mm.A0A = false;
                A09(c208789Lm, i6, i7);
                c72096XNq.A02(c208789Lm.A0Z, (C176877tj) A02.A02(c176807tc), AbstractC167017dG.A0H(c176807tc2, A02));
                A05(c208789Lm);
                C196998nU A002 = C196998nU.A00();
                A002.A01 = 0L;
                A002.A02 = 0L;
                SystemClock.elapsedRealtime();
                C177447ue c177447ue = new C177447ue(A013, null, A02, i5, false);
                AbstractC175037qd.A00(40, 0, null);
                AbstractC09790fc.A00(1013111477);
                AbstractC09790fc.A00(1752859901);
                return c177447ue;
            }
            throw AbstractC166987dD.A18("SizeSetter returned a null OptimalSize");
        }
        throw AbstractC166987dD.A18("Can't connect to the camera service.");
    }

    public static void A05(C208789Lm c208789Lm) {
        if (c208789Lm.isConnected()) {
            InterfaceC25160BBf interfaceC25160BBf = c208789Lm.A04;
            if (interfaceC25160BBf == null) {
                interfaceC25160BBf = new C209759Pl(c208789Lm, 1);
                c208789Lm.A04 = interfaceC25160BBf;
            }
            c208789Lm.A9g(interfaceC25160BBf);
            c208789Lm.A0J.A00(c208789Lm.A0Z);
        }
    }

    public static void A09(C208789Lm c208789Lm, int i, int i2) {
        Matrix matrix;
        float f;
        float f2;
        float f3;
        Matrix A0Q = AbstractC166987dD.A0Q();
        c208789Lm.A0D = A0Q;
        float f4 = 1.0f;
        if (c208789Lm.A00 == 1) {
            f4 = -1.0f;
        }
        A0Q.setScale(f4, 1.0f);
        int A00 = A00(c208789Lm, c208789Lm.A01);
        c208789Lm.A0D.postRotate(A00);
        if (A00 != 90 && A00 != 270) {
            matrix = c208789Lm.A0D;
            f = i;
            f2 = f / 2000.0f;
            f3 = i2;
        } else {
            matrix = c208789Lm.A0D;
            f = i2;
            f2 = f / 2000.0f;
            f3 = i;
        }
        matrix.postScale(f2, f3 / 2000.0f);
        c208789Lm.A0D.postTranslate(f / 2.0f, f3 / 2.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r10.A00(X.C196748n4.A0P) != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r10.A00(X.C196748n4.A0b) != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.InterfaceC174657pz r7, final X.InterfaceC196578mn r8, X.C196548mk r9, final X.C196738n3 r10, X.C196748n4 r11) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208789Lm.A0E(X.7pz, X.8mn, X.8mk, X.8n3, X.8n4):void");
    }

    public final void A0F(String str) {
        if (isConnected()) {
        } else {
            throw new C6M2(str);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void ARf(boolean z) {
        this.A0B = z;
    }

    @Override // X.InterfaceC175067qg
    public final void CtC() {
        if (isConnected() && (this.A0J.A00.A00 & 4) != 4) {
            this.A0R.A07("gpu_frames_started", new CallableC209549Op(this, 6));
        }
    }

    @Override // X.InterfaceC175067qg
    public final boolean Ehu(Matrix matrix, int i, int i2, int i3, int i4, boolean z) {
        float f;
        matrix.reset();
        float f2 = i;
        float f3 = i2;
        float f4 = f2 / f3;
        int A00 = A00(this, this.A01);
        if (A00 == 90 || A00 == 270) {
            i4 = i3;
            i3 = i4;
        }
        float f5 = i3;
        float f6 = i4;
        float f7 = f5 / f6;
        if (!z ? f7 <= f4 : f7 > f4) {
            f = f3 / f6;
        } else {
            f = f2 / f5;
        }
        matrix.setScale((f5 / f2) * f, (f6 / f3) * f, i / 2, i2 / 2);
        return true;
    }

    @Override // X.InterfaceC175067qg
    public final void EoD(AbstractC184688Hj abstractC184688Hj, File file, File file2) {
        EoF(abstractC184688Hj, file.getAbsolutePath(), null);
    }

    @Override // X.InterfaceC175067qg
    public final void Epe(AbstractC184688Hj abstractC184688Hj) {
        if (!CeD()) {
            int i = this.A00;
            AbstractC175037qd.A00 = 14;
            AbstractC175037qd.A00(14, i, null);
            this.A0R.A00(abstractC184688Hj, "switch_camera", new CallableC209549Op(this, 0));
        }
    }

    @Override // X.InterfaceC175067qg
    public final void Epu(InterfaceC196578mn interfaceC196578mn, C196548mk c196548mk) {
        if (!isConnected()) {
            interfaceC196578mn.DEF(new C6M2("Cannot take a photo"));
            return;
        }
        C209019Mj c209019Mj = this.A0L;
        if (C209019Mj.A00(c209019Mj).getCount() > 0) {
            interfaceC196578mn.DEF(new Exception("Busy taking photo"));
            return;
        }
        if (this.A0d && !this.A0G) {
            interfaceC196578mn.DEF(new Exception("Cannot take a photo while recording video"));
            return;
        }
        C196998nU.A00().A05 = SystemClock.elapsedRealtime();
        int A0H = AbstractC167017dG.A0H(AbstractC176797tb.A0h, Bty());
        AbstractC175037qd.A00 = 19;
        AbstractC175037qd.A00(19, A0H, null);
        c209019Mj.A01(2);
        this.A0S.set(false);
        this.A0R.A00(new XW2(0, this, interfaceC196578mn, c196548mk), "take_photo", new B1P(0, interfaceC196578mn, c196548mk, this));
    }
}
