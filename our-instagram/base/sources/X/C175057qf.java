package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.Surface;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.7qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175057qf implements InterfaceC175067qg {
    public static final Map A0u;
    public static volatile C175057qf A0v;
    public static volatile C175057qf A0w;
    public int A00;
    public int A01;
    public int A02;
    public Matrix A03;
    public Matrix A04;
    public Rect A05;
    public CaptureRequest.Builder A06;
    public C176697tR A07;
    public C176787ta A08;
    public C176817td A09;
    public InterfaceC174657pz A0A;
    public InterfaceC175547rU A0B;
    public InterfaceC176367st A0C;
    public AbstractC176767tY A0D;
    public C176877tj A0E;
    public C176577tF A0F;
    public FutureTask A0G;
    public boolean A0H;
    public C176877tj A0I;
    public boolean A0J;
    public final int A0L;
    public final CameraManager A0M;
    public final C175247qy A0O;
    public final C175297r3 A0P;
    public final C175257qz A0Q;
    public final C175307r4 A0R;
    public final C175287r2 A0S;
    public final C175237qx A0Y;
    public final C175227qw A0Z;
    public final Context A0c;
    public volatile int A0j;
    public volatile CameraDevice A0k;
    public volatile C177047u0 A0l;
    public volatile C176347sr A0m;
    public volatile InterfaceC175497rP A0n;
    public volatile boolean A0o;
    public volatile boolean A0p;
    public volatile boolean A0q;
    public volatile boolean A0r;
    public volatile boolean A0s;
    public volatile boolean A0t;
    public boolean A0K = true;
    public final C1814082s A0W = new C1814082s();
    public final C1814082s A0X = new C1814082s();
    public final C1814082s A0V = new C1814082s();
    public final C175077qh A0N = new C175087qi();
    public final Object A0a = new Object();
    public final InterfaceC175107qk A0T = new C175097qj(this);
    public final InterfaceC175127qm A0U = new InterfaceC175127qm() { // from class: X.7ql
        @Override // X.InterfaceC175127qm
        public final void DAb(CameraDevice cameraDevice) {
            C175057qf c175057qf = C175057qf.this;
            InterfaceC176367st interfaceC176367st = c175057qf.A0C;
            if (interfaceC176367st != null) {
                interfaceC176367st.onCameraDisconnected(cameraDevice);
            }
            C175057qf.A04(c175057qf, "Camera has been disconnected.", 2);
        }

        @Override // X.InterfaceC175127qm
        public final void DE5(CameraDevice cameraDevice, int i) {
            String str;
            int i2;
            C175057qf c175057qf = C175057qf.this;
            InterfaceC176367st interfaceC176367st = c175057qf.A0C;
            if (interfaceC176367st != null) {
                interfaceC176367st.onCameraError(cameraDevice, i);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4 && i != 5) {
                            str = "Unknown camera error.";
                        } else {
                            i2 = 100;
                            str = AbstractC111324zv.A00(1524);
                            C175057qf.A04(c175057qf, str, i2);
                        }
                    } else {
                        str = "Camera disabled, device policy error.";
                    }
                } else {
                    str = "There are too many open camera devices.";
                }
            } else {
                str = "Camera in use by higher priority component.";
            }
            i2 = 1;
            C175057qf.A04(c175057qf, str, i2);
        }
    };
    public final C175137qn A0f = new C175137qn(this);
    public final C175147qo A0g = new Object() { // from class: X.7qo
    };
    public final InterfaceC175167qq A0d = new C175157qp(this);
    public final C175177qr A0h = new Object() { // from class: X.7qr
    };
    public final InterfaceC175197qt A0e = new InterfaceC175197qt() { // from class: X.7qs
        @Override // X.InterfaceC175197qt
        public final void DSC(MediaRecorder mediaRecorder, int i, int i2, boolean z) {
        }

        @Override // X.InterfaceC175197qt
        public final void Dl8(MediaRecorder mediaRecorder) {
            String str;
            try {
                mediaRecorder.setVideoSource(2);
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    str = e.getMessage();
                } else {
                    str = "";
                }
                AbstractC175037qd.A02("Camera2Device.setVideoRecordingSource", str);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        
            if (r12 == false) goto L22;
         */
        @Override // X.InterfaceC175197qt
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void Do3(android.media.MediaRecorder r11, boolean r12) {
            /*
                r10 = this;
                X.7qf r2 = X.C175057qf.this
                X.7qw r1 = r2.A0Z
                java.lang.String r0 = "Method onStartMediaRecorder() must run on the Optic Background Thread."
                r1.A06(r0)
                X.7r4 r4 = r2.A0R
                X.7r1 r1 = r4.A0J
                java.lang.String r0 = "Can only check if the prepared on the Optic thread"
                r1.A01(r0)
                boolean r0 = r1.A00
                if (r0 != 0) goto L1e
                java.lang.String r1 = "Camera2Device"
                java.lang.String r0 = "Can not start video recording, PreviewController is not prepared"
                X.AbstractC175037qd.A03(r1, r0)
                return
            L1e:
                X.7r2 r0 = r2.A0S
                r3 = 1
                r0.A0C = r3
                android.view.Surface r7 = r11.getSurface()
                java.lang.String r0 = "Cannot start native video recording."
                r1.A00(r0)
                android.hardware.camera2.CaptureRequest$Builder r0 = r4.A02
                if (r0 == 0) goto Lb7
                android.view.Surface r0 = r4.A04
                if (r0 == 0) goto Lb7
                X.7tY r1 = r4.A0F
                if (r1 == 0) goto L4e
                X.7tZ r0 = X.AbstractC176767tY.A0c
                java.lang.Object r0 = r1.A01(r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L4e
                java.lang.String r1 = "Cannot start native video native capture, not supported!"
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r1)
                throw r0
            L4e:
                X.7tY r1 = r4.A0F
                r2 = 0
                if (r1 == 0) goto L64
                X.7tZ r0 = X.AbstractC176767tY.A0J
                java.lang.Object r0 = r1.A01(r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L64
                r9 = 1
                if (r12 != 0) goto L65
            L64:
                r9 = 0
            L65:
                r0 = 0
                X.7uB r8 = new X.7uB
                r8.<init>(r7, r2, r0)
                android.view.Surface r6 = r4.A04
                X.7uB r5 = new X.7uB
                r5.<init>(r6, r2, r0)
                if (r9 == 0) goto L7f
                X.7uB r8 = new X.7uB
                r8.<init>(r7, r3, r0)
                X.7uB r5 = new X.7uB
                r5.<init>(r6, r3, r0)
            L7f:
                r4.A06 = r7
                X.7uB[] r0 = new X.C177157uB[]{r5, r8}
                java.util.List r1 = java.util.Arrays.asList(r0)
                X.7uF r0 = r4.A09
                if (r0 == 0) goto L90
                r0.close()
            L90:
                java.lang.String r0 = "record_native_video_on_camera_thread"
                X.7uF r0 = X.C175307r4.A00(r4, r0, r1, r9)
                r4.A09 = r0
                android.hardware.camera2.CaptureRequest$Builder r0 = r4.A02
                r0.addTarget(r7)
                X.7u0 r1 = r4.A08
                r1.getClass()
                r0 = 7
                r1.A0H = r0
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                r1.A0B = r0
                r0 = 0
                r1.A01 = r0
                r4.A09(r2)
                java.lang.String r0 = "Preview session was closed while starting recording."
                r4.A0A(r3, r0)
                return
            Lb7:
                java.lang.String r1 = "Cannot start native video recording, preview closed."
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C175187qs.Do3(android.media.MediaRecorder, boolean):void");
        }
    };
    public final C175207qu A0i = new Object() { // from class: X.7qu
    };
    public final Callable A0b = new Callable() { // from class: X.7qv
        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ Object call() {
            C175057qf c175057qf = C175057qf.this;
            if (!C175057qf.A07(c175057qf)) {
                C175307r4 c175307r4 = c175057qf.A0R;
                if (c175307r4.A0S) {
                    c175307r4.A0P.A07("restart_preview_on_background_thread", new B1F(c175307r4, false, false));
                    return null;
                }
                return null;
            }
            return null;
        }
    };

    @Override // X.InterfaceC175067qg
    public final boolean CKn(int i) {
        try {
            return this.A0O.A07(i) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.InterfaceC175067qg
    public final void CO9(Matrix matrix, int i, int i2, int i3) {
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        matrix.mapRect(rectF);
        Rect rect = this.A05;
        if (rect == null) {
            rect = (Rect) AbstractC176717tT.A00(this.A0M, this.A0O.A07(i3)).get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        }
        RectF rectF2 = new RectF(rect);
        int A08 = A08();
        if (A08 == 90 || A08 == 270) {
            rect.getClass();
            rectF2.set(rect.left, rect.top, rect.bottom, rect.right);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f = 1.0f;
        if (this.A00 == 1) {
            f = -1.0f;
        }
        matrix2.postScale(f, 1.0f, rectF2.width() / 2.0f, 0.0f);
        int abs = Math.abs(A08 / 90);
        Matrix matrix3 = new Matrix();
        for (int i4 = 0; i4 < abs; i4++) {
            Matrix matrix4 = new Matrix();
            float width = rectF2.width() / 2.0f;
            matrix4.setRotate(-90.0f, width, width);
            matrix4.mapRect(rectF2);
            matrix3.postConcat(matrix4);
        }
        matrix2.postConcat(matrix3);
        this.A04 = matrix2;
    }

    @Override // X.InterfaceC175067qg
    public final boolean Ce9() {
        C176647tM[] c176647tMArr;
        int length;
        try {
            C175247qy c175247qy = this.A0O;
            if (C175247qy.A04(c175247qy)) {
                length = C175247qy.A06;
            } else {
                if (c175247qy.A05 != null) {
                    c176647tMArr = c175247qy.A05;
                } else {
                    c175247qy.A02.A06("Number of cameras must be loaded on background thread.");
                    C175247qy.A02(c175247qy);
                    c176647tMArr = c175247qy.A05;
                    c176647tMArr.getClass();
                }
                length = c176647tMArr.length;
            }
            return length > 1;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.InterfaceC175067qg
    public final void CtC() {
    }

    @Override // X.InterfaceC175067qg
    public final void E3g(AbstractC184688Hj abstractC184688Hj) {
    }

    @Override // X.InterfaceC175067qg
    public final void EKm(AbstractC184688Hj abstractC184688Hj) {
    }

    static {
        HashMap hashMap = new HashMap();
        A0u = hashMap;
        hashMap.put(0, 0);
        hashMap.put(1, 90);
        hashMap.put(2, 180);
        hashMap.put(3, 270);
    }

    public static void A00(C175057qf c175057qf) {
        InterfaceC176367st interfaceC176367st;
        c175057qf.A0Z.A06("Method closeCamera() must run on the Optic Background Thread.");
        C175287r2 c175287r2 = c175057qf.A0S;
        if (c175287r2.A0D && (!c175057qf.A0t || c175287r2.A0C)) {
            c175287r2.A00();
        }
        A05(c175057qf, false);
        C175297r3 c175297r3 = c175057qf.A0P;
        c175297r3.A0A.A02(false, "Failed to release PreviewController.");
        c175297r3.A03 = null;
        c175297r3.A01 = null;
        c175297r3.A00 = null;
        c175297r3.A07 = null;
        c175297r3.A06 = null;
        c175297r3.A05 = null;
        c175297r3.A04 = null;
        c175297r3.A02 = null;
        C175257qz c175257qz = c175057qf.A0Q;
        c175257qz.A0C.A02(false, "Failed to release PhotoCaptureController.");
        c175257qz.A00 = null;
        c175257qz.A07 = null;
        c175257qz.A05 = null;
        c175257qz.A03 = null;
        c175257qz.A04 = null;
        c175257qz.A02 = null;
        c175257qz.A01 = null;
        c175257qz.A06 = null;
        InterfaceC177027ty interfaceC177027ty = c175257qz.A08;
        if (interfaceC177027ty != null) {
            interfaceC177027ty.release();
            c175257qz.A08 = null;
        }
        InterfaceC177027ty interfaceC177027ty2 = c175257qz.A09;
        if (interfaceC177027ty2 != null) {
            interfaceC177027ty2.release();
            c175257qz.A09 = null;
        }
        InterfaceC177027ty interfaceC177027ty3 = c175257qz.A0A;
        if (interfaceC177027ty3 != null) {
            interfaceC177027ty3.release();
            c175257qz.A0A = null;
        }
        c175287r2.A09.A02(false, "Failed to release VideoCaptureController.");
        c175287r2.A0B = null;
        c175287r2.A05 = null;
        c175287r2.A03 = null;
        c175287r2.A04 = null;
        c175287r2.A02 = null;
        c175287r2.A01 = null;
        if (c175057qf.A0k != null) {
            C175077qh c175077qh = c175057qf.A0N;
            c175077qh.A00 = c175057qf.A0k.getId();
            c175077qh.A02(0L);
            C0fG.A00(c175057qf.A0k);
            c175077qh.A00();
        }
        c175057qf.A0R.A0Q.clear();
        if (!c175057qf.A0t && (interfaceC176367st = c175057qf.A0C) != null) {
            interfaceC176367st.setUseArCoreIfSupported(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C175057qf r15) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175057qf.A01(X.7qf):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x013b, code lost:
    
        if (A07(r21) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015c, code lost:
    
        if (r21.A0C.isARCoreEnabled() != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0329  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C175057qf r21, java.lang.Float r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175057qf.A02(X.7qf, java.lang.Float, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (((java.lang.Boolean) r1.AXQ(X.InterfaceC174657pz.A0M)).booleanValue() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        if (((java.lang.Boolean) r1.AXQ(X.InterfaceC174657pz.A00)).booleanValue() == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(final X.C175057qf r9, final java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175057qf.A03(X.7qf, java.lang.String):void");
    }

    public static void A04(final C175057qf c175057qf, String str, int i) {
        final List list = c175057qf.A0V.A00;
        final UUID uuid = c175057qf.A0Y.A03;
        C176347sr c176347sr = c175057qf.A0m;
        if (c176347sr != null && !c176347sr.A00.isEmpty()) {
            C176567tE.A00(new RunnableC24281Apm(c176347sr));
        }
        final B4Y b4y = new B4Y(i, str);
        c175057qf.A0Z.A05(new Runnable() { // from class: X.Ayo
            @Override // java.lang.Runnable
            public final void run() {
                C175057qf c175057qf2 = c175057qf;
                List list2 = list;
                B4Y b4y2 = b4y;
                UUID uuid2 = uuid;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC175457rL) list2.get(i2)).DE9(b4y2);
                }
                c175057qf2.A0Y.A05(uuid2);
                c175057qf2.APd(null);
            }
        }, uuid);
    }

    public static void A05(C175057qf c175057qf, boolean z) {
        final C175307r4 c175307r4;
        InterfaceC176367st interfaceC176367st;
        C175227qw c175227qw = c175057qf.A0Z;
        c175227qw.A06("Method stopCameraPreview() must run on the Optic Background Thread.");
        synchronized (C175307r4.A0U) {
            c175307r4 = c175057qf.A0R;
            C175277r1 c175277r1 = c175307r4.A0J;
            c175277r1.A02(false, "Failed to release PreviewController.");
            c175307r4.A0S = false;
            InterfaceC175547rU interfaceC175547rU = c175307r4.A0D;
            if (interfaceC175547rU != null) {
                interfaceC175547rU.release();
                c175307r4.A0D = null;
            }
            C177047u0 c177047u0 = c175307r4.A08;
            if (c177047u0 != null) {
                c177047u0.A0J = false;
                c175307r4.A08 = null;
            }
            if (z || ((interfaceC176367st = c175307r4.A0E) != null && interfaceC176367st.isARCoreEnabled())) {
                try {
                    c175277r1.A01("Method closeCameraSession must be called on Optic Thread.");
                    InterfaceC177197uF interfaceC177197uF = c175307r4.A09;
                    if (interfaceC177197uF == null || !interfaceC177197uF.CU5()) {
                        C175337r9 c175337r9 = c175307r4.A0M;
                        c175337r9.A03 = 3;
                        c175337r9.A01.A02(0L);
                        c175307r4.A0P.A04("camera_session_abort_capture_on_camera_handler_thread", new CallableC24909B0i(c175307r4));
                    }
                    C175337r9 c175337r92 = c175307r4.A0M;
                    c175337r92.A03 = 2;
                    c175337r92.A01.A02(0L);
                    c175307r4.A0P.A04("camera_session_close_on_camera_handler_thread", new CallableC24910B0j(c175307r4));
                } catch (Exception unused) {
                }
            }
            InterfaceC176367st interfaceC176367st2 = c175307r4.A0E;
            if (interfaceC176367st2 != null) {
                interfaceC176367st2.closeSession();
                c175307r4.A0E = null;
            }
            Surface surface = c175307r4.A04;
            if (surface != null) {
                if (c175307r4.A0G) {
                    surface.release();
                }
                c175307r4.A04 = null;
            }
            InterfaceC177197uF interfaceC177197uF2 = c175307r4.A09;
            if (interfaceC177197uF2 != null) {
                interfaceC177197uF2.close();
                c175307r4.A09 = null;
            }
            c175307r4.A06 = null;
            c175307r4.A02 = null;
            c175307r4.A0I = null;
            c175307r4.A0H = null;
            c175307r4.A01 = null;
            c175307r4.A0A = null;
            c175307r4.A0B = null;
            c175307r4.A0C = null;
            c175307r4.A0F = null;
            c175307r4.A00 = null;
            synchronized (c175057qf.A0a) {
                FutureTask futureTask = c175057qf.A0G;
                if (futureTask != null) {
                    c175227qw.A08(futureTask);
                    c175057qf.A0G = null;
                }
            }
            c175057qf.A0l = null;
            c175057qf.A06 = null;
            c175057qf.A0I = null;
            c175057qf.A0Q.A0G = false;
        }
        C176347sr c176347sr = c175307r4.A0R;
        if (c176347sr != null && !c176347sr.A00.isEmpty()) {
            C176567tE.A00(new RunnableC198398po(c176347sr));
        }
        if (!c175307r4.A0O.A00.isEmpty()) {
            C176567tE.A00(new Runnable() { // from class: X.Apk
                @Override // java.lang.Runnable
                public final void run() {
                    List list = C175307r4.this.A0O.A00;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((InterfaceC174807qG) list.get(i)).Dal();
                    }
                }
            });
        }
    }

    private boolean A06() {
        InterfaceC176367st interfaceC176367st;
        InterfaceC174657pz interfaceC174657pz;
        AbstractC176767tY abstractC176767tY = this.A0D;
        if (abstractC176767tY != null && ((Boolean) abstractC176767tY.A01(AbstractC176767tY.A0J)).booleanValue() && !this.A0o && (((interfaceC176367st = this.A0C) == null || !interfaceC176367st.isARCoreEnabled()) && (interfaceC174657pz = this.A0A) != null && ((Boolean) interfaceC174657pz.AXQ(InterfaceC174657pz.A0B)).booleanValue())) {
            return true;
        }
        return false;
    }

    public static boolean A07(C175057qf c175057qf) {
        InterfaceC175547rU interfaceC175547rU = c175057qf.A0B;
        if (interfaceC175547rU != null && interfaceC175547rU.CLA()) {
            return true;
        }
        return false;
    }

    public final int A08() {
        Number number = (Number) A0u.get(Integer.valueOf(this.A01));
        if (number != null) {
            return ((this.A02 - number.intValue()) + 360) % 360;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("Invalid display rotation value: ", this.A01));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r2 == 180) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        r3 = -r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        r3 = r3 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        if (r2 == 270) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        r4 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        r4 = r4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
    
        if (r2 == 180) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
    
        if (r2 == 90) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09() {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175057qf.A09():void");
    }

    public final void A0A(final InterfaceC196578mn interfaceC196578mn, final C196548mk c196548mk) {
        int i;
        final Integer num;
        C175307r4 c175307r4;
        InterfaceC174657pz interfaceC174657pz = this.A0A;
        if (interfaceC174657pz != null) {
            i = ((Number) interfaceC174657pz.AXQ(InterfaceC174657pz.A0K)).intValue();
        } else {
            i = 0;
        }
        final C175257qz c175257qz = this.A0Q;
        final CameraManager cameraManager = this.A0M;
        final int i2 = this.A00;
        int i3 = (((this.A0j + 45) / 90) * 90) % 360;
        int i4 = this.A00;
        int i5 = this.A02;
        int i6 = i5 + i3;
        if (i4 == 1) {
            i6 = (i5 - i3) + 360;
        }
        final int i7 = i6 % 360;
        final int A08 = A08();
        if (i != 0) {
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        final CaptureRequest.Builder builder = this.A06;
        final InterfaceC176367st interfaceC176367st = this.A0C;
        final boolean A07 = A07(this);
        final C177047u0 c177047u0 = this.A0l;
        if (c175257qz.A00 != null && (c175307r4 = c175257qz.A02) != null && c175307r4.A0S) {
            if (c175257qz.A0G) {
                c175257qz.A01(interfaceC196578mn, new RuntimeException("Cannot take photo, another capture in progress."));
                return;
            }
            C175287r2 c175287r2 = c175257qz.A03;
            c175287r2.getClass();
            if (c175287r2.A0D) {
                c175257qz.A01(interfaceC196578mn, new RuntimeException("Cannot take photo, video recording in progress."));
                return;
            }
            C176787ta c176787ta = c175257qz.A05;
            c176787ta.getClass();
            Object A02 = c176787ta.A02(AbstractC176797tb.A0h);
            A02.getClass();
            int intValue = ((Number) A02).intValue();
            AbstractC175037qd.A00 = 19;
            AbstractC175037qd.A00(19, intValue, null);
            c175257qz.A0G = true;
            C175297r3 c175297r3 = c175257qz.A01;
            c175297r3.getClass();
            c175297r3.A00();
            c175257qz.A0F.A00(new C196628ms(c175257qz, interfaceC196578mn), "take_photo", new Callable() { // from class: X.8mr
                /* JADX WARN: Code restructure failed: missing block: B:12:0x009b, code lost:
                
                    if (r5 != 1) goto L14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x00cf, code lost:
                
                    if (r5.A0C != false) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x019b, code lost:
                
                    if (r14 == null) goto L58;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x01a1, code lost:
                
                    if (r18 == null) goto L62;
                 */
                /* JADX WARN: Removed duplicated region for block: B:117:0x052e  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x0537  */
                /* JADX WARN: Removed duplicated region for block: B:124:0x058a  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x05a3  */
                /* JADX WARN: Removed duplicated region for block: B:155:0x05d5  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x05d7  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 1587
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC196618mr.call():java.lang.Object");
                }
            });
            return;
        }
        c175257qz.A01(interfaceC196578mn, new RuntimeException("Camera not ready to take photo."));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (((java.lang.Boolean) r20.A0A.AXQ(X.InterfaceC174657pz.A0E)).booleanValue() == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175057qf.A0B(java.lang.String):void");
    }

    @Override // X.InterfaceC175067qg
    public final void A8T(InterfaceC175457rL interfaceC175457rL) {
        this.A0V.A01(interfaceC175457rL);
    }

    @Override // X.InterfaceC175067qg
    public final void A8v(InterfaceC174727q7 interfaceC174727q7) {
        if (this.A0m == null) {
            this.A0m = new C176347sr();
            this.A0R.A0R = this.A0m;
        }
        this.A0m.A00.add(interfaceC174727q7);
    }

    @Override // X.InterfaceC175067qg
    public final boolean A9L(InterfaceC175167qq interfaceC175167qq) {
        return this.A0X.A01(interfaceC175167qq);
    }

    @Override // X.InterfaceC175067qg
    public final void A9g(InterfaceC25160BBf interfaceC25160BBf) {
        InterfaceC175547rU interfaceC175547rU = this.A0B;
        if (interfaceC175547rU != null) {
            boolean z = !A07(this);
            boolean A9B = interfaceC175547rU.A9B(interfaceC25160BBf);
            if (z && A9B && interfaceC175547rU.Ce5()) {
                this.A0Z.A07("restart_preview_to_resume_cpu_frames", new Callable() { // from class: X.B0b
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C175307r4 c175307r4 = C175057qf.this.A0R;
                        C175277r1 c175277r1 = c175307r4.A0J;
                        c175277r1.A01("Can only check if is retrieving preview frames from the Optic thread");
                        c175277r1.A01("Can only check if the prepared on the Optic thread");
                        if (c175277r1.A00 && c175307r4.A0T) {
                            return null;
                        }
                        try {
                            c175307r4.A0B(true, false);
                            return null;
                        } catch (CameraAccessException | IllegalArgumentException unused) {
                            return null;
                        } catch (Exception e) {
                            throw new RuntimeException(AbstractC166997dE.A0y("Could not start preview: ", e));
                        }
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC175067qg
    public final void A9h(InterfaceC25160BBf interfaceC25160BBf, int i) {
        if (interfaceC25160BBf != null) {
            A9g(interfaceC25160BBf);
            return;
        }
        throw new IllegalArgumentException("Cannot add null OnPreviewFrameListener.");
    }

    @Override // X.InterfaceC175067qg
    public final void A9i(InterfaceC184558Gw interfaceC184558Gw) {
        if (interfaceC184558Gw != null) {
            this.A0R.A0N.A01(interfaceC184558Gw);
            return;
        }
        throw new IllegalArgumentException("Cannot add null OnPreviewStartedListener.");
    }

    @Override // X.InterfaceC175067qg
    public final void A9j(InterfaceC174807qG interfaceC174807qG) {
        if (interfaceC174807qG != null) {
            this.A0R.A0O.A01(interfaceC174807qG);
            return;
        }
        throw new IllegalArgumentException("Cannot add null OnPreviewStoppedListener.");
    }

    @Override // X.InterfaceC175067qg
    public final void AAs(C184848Hz c184848Hz) {
        C176697tR c176697tR = this.A07;
        if (c176697tR != null) {
            c176697tR.A0F.A01(c184848Hz);
        }
    }

    @Override // X.InterfaceC175067qg
    public final int AFE(int i, int i2) {
        return this.A0O.A05(i, this.A02, i2);
    }

    @Override // X.InterfaceC175067qg
    public final void AJR(C176587tG c176587tG, AbstractC184688Hj abstractC184688Hj, final InterfaceC174657pz interfaceC174657pz, InterfaceC175017qb interfaceC175017qb, final C176577tF c176577tF, String str, final int i, final int i2) {
        AbstractC175037qd.A00 = 9;
        AbstractC175037qd.A00(9, 0, null);
        this.A0Z.A00(abstractC184688Hj, "connect", new Callable() { // from class: X.7tI
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                AbstractC175037qd.A00(11, 0, null);
                C175057qf c175057qf = C175057qf.this;
                if (c175057qf.A0n != null && c175057qf.A0n != c176577tF.A02) {
                    c175057qf.A0n.EES(c175057qf.A0n.C4N());
                }
                C176577tF c176577tF2 = c176577tF;
                InterfaceC175497rP interfaceC175497rP = c176577tF2.A02;
                c175057qf.A0n = interfaceC175497rP;
                InterfaceC176367st interfaceC176367st = (InterfaceC176367st) interfaceC175497rP.BZG(InterfaceC176367st.A00);
                c175057qf.A0C = interfaceC176367st;
                if (interfaceC176367st == null) {
                    c175057qf.A0C = InterfaceC176367st.A01;
                }
                c175057qf.A0F = c176577tF2;
                InterfaceC174657pz interfaceC174657pz2 = interfaceC174657pz;
                c175057qf.A0A = interfaceC174657pz2;
                Map map = (Map) interfaceC174657pz2.AXQ(InterfaceC174657pz.A02);
                if (!map.isEmpty()) {
                    C175247qy c175247qy = c175057qf.A0O;
                    if (!map.isEmpty()) {
                        c175247qy.A00 = map;
                        if (c175247qy.A02.A09()) {
                            C175247qy.A03(c175247qy);
                        }
                    }
                }
                c175057qf.A01 = i2;
                c175057qf.A0H = ((Boolean) interfaceC174657pz2.AXQ(InterfaceC174657pz.A0F)).booleanValue();
                C175247qy c175247qy2 = c175057qf.A0O;
                int i3 = i;
                if (c175247qy2.A02.A09()) {
                    C175247qy.A02(c175247qy2);
                    int i4 = 1;
                    if (i3 == 1) {
                        i4 = 0;
                    }
                    if (!c175247qy2.A09(i4)) {
                        if (c175247qy2.A05 != null) {
                            if (c175247qy2.A05.length != 0) {
                                if (i3 == 0 && c175247qy2.A09(0)) {
                                    AbstractC175037qd.A03("CameraInventory", "Requested back camera doesn't exist, using front instead");
                                    i3 = 1;
                                } else {
                                    if (i3 == 1 && c175247qy2.A09(1)) {
                                        AbstractC175037qd.A03("CameraInventory", "Requested front camera doesn't exist, using back instead");
                                        i3 = 0;
                                    } else {
                                        StringBuilder sb = new StringBuilder("Camera 2 API - Could not get CameraInfo for CameraFacing id: ");
                                        sb.append(i3);
                                        sb.append(" Number Of Cameras: ");
                                        sb.append(C175247qy.A06);
                                        sb.append(" BACK: ");
                                        boolean z = C175247qy.A07;
                                        sb.append(z);
                                        sb.append(" FRONT: ");
                                        sb.append(z);
                                        C176647tM[] c176647tMArr = c175247qy2.A05;
                                        if (c176647tMArr != null) {
                                            sb.append(" Camera Info size: ");
                                            sb.append(c176647tMArr.length);
                                            sb.append(" Camera lenses: ");
                                            for (C176647tM c176647tM : c176647tMArr) {
                                                sb.append(c176647tM.A01);
                                                sb.append(" ");
                                            }
                                        } else {
                                            sb.append(" Camera Info NULL");
                                        }
                                        throw new RuntimeException(sb.toString());
                                    }
                                }
                            } else {
                                throw new C212539bM();
                            }
                        } else {
                            throw new RuntimeException("Logical cameras not initialised!");
                        }
                    }
                    c175057qf.A07 = new C176697tR();
                    String A07 = c175247qy2.A07(i3);
                    try {
                        C175057qf.A03(c175057qf, A07);
                        c175057qf.A0B(A07);
                        C175057qf.A01(c175057qf);
                        C175057qf.A02(c175057qf, null, A07);
                        C177447ue c177447ue = new C177447ue(c175057qf.AlU(), null, c175057qf.Bty(), c175057qf.A00, false);
                        AbstractC175037qd.A00(12, c175057qf.A00, c177447ue);
                        return c177447ue;
                    } catch (Exception e) {
                        AbstractC175037qd.A00(13, 0, e);
                        c175057qf.APd(null);
                        throw e;
                    }
                }
                throw new RuntimeException("Cannot resolve camera facing, not on the Optic thread");
            }
        });
        AbstractC175037qd.A00(10, 0, null);
    }

    @Override // X.InterfaceC175067qg
    public final boolean APd(AbstractC184688Hj abstractC184688Hj) {
        AbstractC175037qd.A00(23, 0, null);
        final UUID uuid = this.A0Y.A03;
        C175307r4 c175307r4 = this.A0R;
        c175307r4.A0N.A00();
        c175307r4.A0O.A00();
        InterfaceC175547rU interfaceC175547rU = this.A0B;
        this.A0B = null;
        if (interfaceC175547rU != null) {
            interfaceC175547rU.AHp();
        }
        this.A0W.A00();
        this.A0X.A00();
        C176697tR c176697tR = this.A07;
        if (c176697tR != null) {
            c176697tR.A0F.A00();
        }
        this.A0p = false;
        C175227qw c175227qw = this.A0Z;
        c175227qw.A00(abstractC184688Hj, "disconnect", new Callable() { // from class: X.8mb
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                try {
                    try {
                        UUID uuid2 = uuid;
                        C175057qf c175057qf = C175057qf.this;
                        C175237qx c175237qx = c175057qf.A0Y;
                        int i = 0;
                        if (!C2I7.A00(uuid2, c175237qx.A03)) {
                            i = 1;
                        }
                        AbstractC175037qd.A00(24, i, null);
                        C175057qf.A00(c175057qf);
                        if (c175057qf.A0n != null) {
                            c175057qf.A0n.EES(c175057qf.A0n.C4N());
                            c175057qf.A0n = null;
                            c175057qf.A0C = null;
                        }
                        c175057qf.A0F = null;
                        c175057qf.A0A = null;
                        c175057qf.A0o = false;
                        AbstractC175037qd.A00(25, !C2I7.A00(uuid2, c175237qx.A03) ? 1 : 0, null);
                        return null;
                    } catch (Exception e) {
                        AbstractC175037qd.A00(26, C2I7.A00(uuid, C175057qf.this.A0Y.A03) ? 0 : 1, e);
                        throw e;
                    }
                } catch (Throwable th) {
                    AbstractC175037qd.A00(25, !C2I7.A00(uuid, C175057qf.this.A0Y.A03) ? 1 : 0, null);
                    throw th;
                }
            }
        });
        c175227qw.A07("disconnect_guard", new Callable() { // from class: X.8mc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        });
        return true;
    }

    @Override // X.InterfaceC175067qg
    public final void ARu(AbstractC184688Hj abstractC184688Hj) {
        this.A0Z.A00(abstractC184688Hj, "enable_video_focus", new Callable() { // from class: X.B0c
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
            
                if (r0.isARCoreEnabled() == false) goto L8;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r6 = this;
                    X.7qf r5 = X.C175057qf.this
                    boolean r0 = r5.isConnected()
                    r4 = 0
                    if (r0 == 0) goto L1e
                    X.7r3 r3 = r5.A0P
                    android.hardware.camera2.CaptureRequest$Builder r2 = r5.A06
                    X.7st r0 = r5.A0C
                    if (r0 == 0) goto L18
                    boolean r0 = r0.isARCoreEnabled()
                    r1 = 1
                    if (r0 != 0) goto L19
                L18:
                    r1 = 0
                L19:
                    X.7u0 r0 = r5.A0l
                    r3.A03(r2, r0, r1)
                L1e:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CallableC24903B0c.call():java.lang.Object");
            }
        });
    }

    @Override // X.InterfaceC175067qg
    public final void AWH(int i, int i2) {
        final Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0L;
        rect.inset(i3, i3);
        this.A0Z.A00(new C198238pY(this), "focus", new Callable() { // from class: X.B0q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C175307r4 c175307r4;
                InterfaceC177197uF interfaceC177197uF;
                long j;
                C175057qf c175057qf = this;
                Rect rect2 = rect;
                float[] fArr = {rect2.centerX(), rect2.centerY()};
                if (c175057qf.A04 != null) {
                    Matrix A0Q = AbstractC166987dD.A0Q();
                    c175057qf.A04.invert(A0Q);
                    A0Q.mapPoints(fArr);
                }
                C175297r3 c175297r3 = c175057qf.A0P;
                boolean z = c175057qf.A0H;
                CaptureRequest.Builder builder = c175057qf.A06;
                InterfaceC176367st interfaceC176367st = c175057qf.A0C;
                C177047u0 c177047u0 = c175057qf.A0l;
                C175277r1 c175277r1 = c175297r3.A0A;
                c175277r1.A01("Cannot perform focus, not on Optic thread.");
                c175277r1.A01("Can only check if the prepared on the Optic thread");
                if (c175277r1.A00) {
                    C177017tx c177017tx = c175297r3.A03;
                    c177017tx.getClass();
                    if (c177017tx.A00.isConnected() && (c175307r4 = c175297r3.A04) != null && c175307r4.A0S && builder != null && c177047u0 != null) {
                        AbstractC176767tY abstractC176767tY = c175297r3.A07;
                        abstractC176767tY.getClass();
                        if (AbstractC167007dF.A1S(AbstractC176767tY.A0V, abstractC176767tY) && interfaceC176367st != null) {
                            if ((!interfaceC176367st.isCameraSessionActivated() || !interfaceC176367st.isARCoreEnabled()) && c175297r3.A05 != null && c175297r3.A0D && (interfaceC177197uF = c175297r3.A04.A09) != null) {
                                c175297r3.A00();
                                c175297r3.A05(C05F.A00, fArr);
                                MeteringRectangle[] meteringRectangleArr = {new MeteringRectangle(c175297r3.A05.A08(rect2), 1000)};
                                c177047u0.A05 = null;
                                c177047u0.A06 = new C23444AaH(builder, c175297r3, c177047u0, fArr, z);
                                builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
                                builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
                                c175297r3.A0C = true;
                                CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                                builder.set(key, 2);
                                interfaceC177197uF.AGk(builder.build(), null, c177047u0);
                                builder.set(key, 0);
                                interfaceC177197uF.Ecf(builder.build(), null, c177047u0);
                                builder.set(key, 1);
                                interfaceC177197uF.AGk(builder.build(), null, c177047u0);
                                if (z) {
                                    j = 6000;
                                } else {
                                    j = 4000;
                                }
                                c175297r3.A02(builder, c177047u0, j);
                                return null;
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                }
                return null;
            }
        });
    }

    @Override // X.InterfaceC175067qg
    public final Handler Ajq() {
        Handler handler = this.A0Z.A00;
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
    public final void BYA(AbstractC184688Hj abstractC184688Hj) {
        int length;
        C175247qy c175247qy = this.A0O;
        if (C175247qy.A04(c175247qy)) {
            length = C175247qy.A06;
        } else if (c175247qy.A05 != null) {
            length = c175247qy.A05.length;
        } else {
            c175247qy.A02.A01(abstractC184688Hj, "get_number_of_cameras", new CallableC24907B0g(c175247qy));
            return;
        }
        abstractC184688Hj.A02(Integer.valueOf(length));
    }

    @Override // X.InterfaceC175067qg
    public final void BYB(AbstractC184688Hj abstractC184688Hj, final int i) {
        final C175247qy c175247qy = this.A0O;
        c175247qy.A02.A01(abstractC184688Hj, "get_number_of_cameras_facing", new Callable() { // from class: X.B0w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C175247qy c175247qy2 = C175247qy.this;
                int i2 = i;
                c175247qy2.A02.A06("Number of cameras must be loaded on background thread.");
                HashSet A1H = AbstractC166987dD.A1H();
                CameraManager cameraManager = c175247qy2.A01;
                cameraManager.getClass();
                int i3 = 0;
                for (String str : cameraManager.getCameraIdList()) {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    Number number = (Number) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (number != null) {
                        int intValue = number.intValue();
                        int i4 = 1;
                        if (intValue == 1) {
                            i4 = 0;
                        }
                        if (i4 == i2) {
                            A1H.addAll(cameraCharacteristics.getPhysicalCameraIds());
                            i3++;
                        }
                    }
                }
                if (!A1H.isEmpty()) {
                    i3 = A1H.size();
                }
                return Integer.valueOf(i3);
            }
        });
    }

    @Override // X.InterfaceC175067qg
    public final int BtN() {
        return this.A02;
    }

    @Override // X.InterfaceC175067qg
    public final int CIn() {
        C176697tR c176697tR = this.A07;
        if (c176697tR == null) {
            return -1;
        }
        return c176697tR.A07();
    }

    @Override // X.InterfaceC175067qg
    public final void CKl(AbstractC184688Hj abstractC184688Hj) {
        this.A0O.A08(abstractC184688Hj, 1);
    }

    @Override // X.InterfaceC175067qg
    public final void CKy(AbstractC184688Hj abstractC184688Hj) {
        this.A0O.A08(abstractC184688Hj, 0);
    }

    @Override // X.InterfaceC175067qg
    public final boolean Cav() {
        return !this.A0R.A0S;
    }

    @Override // X.InterfaceC175067qg
    public final boolean Cbe() {
        return this.A0S.A0D;
    }

    @Override // X.InterfaceC175067qg
    public final boolean CeD() {
        return this.A0Q.A0G;
    }

    @Override // X.InterfaceC175067qg
    public final void Chr(AbstractC184688Hj abstractC184688Hj, boolean z, boolean z2, boolean z3) {
        this.A0Z.A00(abstractC184688Hj, "lock_camera_values", new CallableC24921B0u(this, z3));
    }

    @Override // X.InterfaceC175067qg
    public final boolean Cmt(float[] fArr) {
        Matrix matrix = this.A04;
        if (matrix == null) {
            return false;
        }
        matrix.mapPoints(fArr);
        return true;
    }

    @Override // X.InterfaceC175067qg
    public final void Cpo(AbstractC184688Hj abstractC184688Hj, final C177007tw c177007tw) {
        this.A0Z.A00(abstractC184688Hj, "modify_settings_on_background_thread", new Callable() { // from class: X.7uv
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
            
                if (r0.intValue() == 1) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x0239, code lost:
            
                if (r9 == 1) goto L60;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 772
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CallableC177617uv.call():java.lang.Object");
            }
        });
    }

    @Override // X.InterfaceC175067qg
    public final void DX0(int i) {
        if (!this.A0J) {
            this.A0j = i;
            InterfaceC175497rP interfaceC175497rP = this.A0n;
            if (interfaceC175497rP != null) {
                interfaceC175497rP.DA4(this.A0j);
            }
        }
    }

    @Override // X.InterfaceC175067qg
    public final void E2d(AbstractC184688Hj abstractC184688Hj, String str, final int i) {
        String str2;
        C175227qw c175227qw = this.A0Z;
        Callable callable = new Callable() { // from class: X.B0t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C175057qf c175057qf = C175057qf.this;
                C175057qf.A03(c175057qf, c175057qf.A0O.A07(i));
                c175057qf.A0o = true;
                c175057qf.A0s = true;
                return new C177447ue(c175057qf.AlU(), null, c175057qf.Bty(), c175057qf.A00, false);
            }
        };
        if (i == 0) {
            str2 = "back";
        } else {
            str2 = "front";
        }
        c175227qw.A00(abstractC184688Hj, AnonymousClass001.A0R("open_concurrent_camera_", str2), callable);
    }

    @Override // X.InterfaceC175067qg
    public final void ECd(String str, View view) {
        if (this.A0m != null) {
            C176347sr c176347sr = this.A0m;
            if (view != null && !c176347sr.A00.isEmpty()) {
                C176567tE.A00(new RunnableC176557tD(view, c176347sr));
            }
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EFI(InterfaceC175457rL interfaceC175457rL) {
        this.A0V.A02(interfaceC175457rL);
    }

    @Override // X.InterfaceC175067qg
    public final void EFU(InterfaceC174727q7 interfaceC174727q7) {
        if (this.A0m != null) {
            this.A0m.A00.remove(interfaceC174727q7);
            if (!(!this.A0m.A00.isEmpty())) {
                this.A0m = null;
                this.A0R.A0R = null;
            }
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EFi(InterfaceC175167qq interfaceC175167qq) {
        this.A0X.A02(interfaceC175167qq);
    }

    @Override // X.InterfaceC175067qg
    public final void EFz(InterfaceC25160BBf interfaceC25160BBf) {
        InterfaceC175547rU interfaceC175547rU = this.A0B;
        if (interfaceC25160BBf != null && interfaceC175547rU != null && interfaceC175547rU.EFc(interfaceC25160BBf) && !A07(this) && interfaceC175547rU.Ce5()) {
            synchronized (this.A0a) {
                FutureTask futureTask = this.A0G;
                if (futureTask != null) {
                    this.A0Z.A08(futureTask);
                }
                this.A0G = this.A0Z.A02("restart_preview_if_to_stop_cpu_frames", this.A0b, 200L);
            }
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EG0(InterfaceC184558Gw interfaceC184558Gw) {
        if (interfaceC184558Gw != null) {
            this.A0R.A0N.A02(interfaceC184558Gw);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EG1(InterfaceC174807qG interfaceC174807qG) {
        if (interfaceC174807qG != null) {
            this.A0R.A0O.A02(interfaceC174807qG);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EUe(InterfaceC198408pp interfaceC198408pp) {
        this.A0P.A02 = interfaceC198408pp;
    }

    @Override // X.InterfaceC175067qg
    public final void EVB(AbstractC184688Hj abstractC184688Hj, boolean z) {
        boolean z2;
        if (z) {
            z2 = A06();
        } else {
            z2 = false;
        }
        C176787ta c176787ta = this.A08;
        if (c176787ta != null) {
            C176807tc c176807tc = AbstractC176797tb.A0J;
            if (c176787ta.A02(c176807tc) != null) {
                Object A02 = this.A08.A02(c176807tc);
                A02.getClass();
                if (((Boolean) A02).booleanValue() != z2) {
                    C176837tf c176837tf = new C176837tf();
                    c176837tf.A01(c176807tc, Boolean.valueOf(z2));
                    C177007tw A00 = c176837tf.A00();
                    if (abstractC184688Hj == null) {
                        abstractC184688Hj = new C176427t0();
                    }
                    Cpo(abstractC184688Hj, A00);
                }
            }
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EYx(boolean z) {
        this.A0J = z;
        if (z) {
            this.A0j = 0;
            InterfaceC175497rP interfaceC175497rP = this.A0n;
            if (interfaceC175497rP != null) {
                interfaceC175497rP.DA4(this.A0j);
            }
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EZy(InterfaceC175397rF interfaceC175397rF) {
        this.A0Y.A04(interfaceC175397rF);
    }

    @Override // X.InterfaceC175067qg
    public final void EbM(AbstractC184688Hj abstractC184688Hj, int i) {
        this.A01 = i;
        this.A0Z.A00(abstractC184688Hj, "set_rotation", new Callable() { // from class: X.7uf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2;
                C175057qf c175057qf = C175057qf.this;
                if (c175057qf.isConnected()) {
                    c175057qf.A09();
                    if (c175057qf.A0n != null) {
                        InterfaceC175497rP interfaceC175497rP = c175057qf.A0n;
                        int i3 = c175057qf.A01;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                i2 = 270;
                                if (i3 != 3) {
                                    i2 = 0;
                                }
                            } else {
                                i2 = 180;
                            }
                        } else {
                            i2 = 90;
                        }
                        interfaceC175497rP.D1a(i2);
                    }
                    return new C177447ue(c175057qf.AlU(), null, c175057qf.Bty(), c175057qf.A00, false);
                }
                throw new C6M2("Can not update preview display rotation");
            }
        });
    }

    @Override // X.InterfaceC175067qg
    public final void EhW(AbstractC184688Hj abstractC184688Hj, final int i) {
        this.A0Z.A00(abstractC184688Hj, "set_zoom_level", new Callable() { // from class: X.B0p
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
            
                if (r13 >= r12) goto L37;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r15 = this;
                    X.7qf r4 = X.C175057qf.this
                    int r2 = r2
                    boolean r0 = r4.isConnected()
                    if (r0 == 0) goto Lc1
                    X.7r4 r3 = r4.A0R
                    X.7r1 r1 = r3.A0J
                    java.lang.String r0 = "Can only check if the prepared on the Optic thread"
                    r1.A01(r0)
                    boolean r0 = r1.A00
                    if (r0 == 0) goto Lc1
                    X.7tR r8 = r4.A07
                    if (r8 == 0) goto Lc1
                    X.7tY r1 = r8.A08
                    X.7ta r0 = r8.A06
                    X.7td r10 = r8.A07
                    android.graphics.Rect r7 = r8.A05
                    android.graphics.Rect r6 = r8.A04
                    java.util.List r9 = r8.A0A
                    if (r0 == 0) goto L37
                    if (r10 == 0) goto L37
                    if (r1 == 0) goto L37
                    if (r9 == 0) goto L37
                    boolean r0 = r8.A0B
                    if (r0 == 0) goto L42
                    java.util.List r0 = r8.A09
                    if (r0 != 0) goto L42
                L37:
                    X.7tR r0 = r4.A07
                    int r0 = r0.A07()
                L3d:
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    return r0
                L42:
                    if (r6 == 0) goto L37
                    if (r7 == 0) goto L37
                    int r0 = r8.A03
                    int r1 = java.lang.Math.max(r2, r0)
                    int r0 = r8.A02
                    int r5 = java.lang.Math.min(r1, r0)
                    int r0 = r8.A07()
                    if (r5 == r0) goto L37
                    float r11 = (float) r5
                    int r0 = r8.A03
                    float r12 = (float) r0
                    int r0 = r8.A02
                    float r0 = (float) r0
                    r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                    r1 = 1065353216(0x3f800000, float:1.0)
                    float r14 = X.C176697tR.A01(r11, r12, r0, r2, r1)
                    float r13 = r8.A05()
                    float r12 = r8.A01
                    int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
                    if (r0 >= 0) goto Lb6
                    int r0 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
                    if (r0 < 0) goto Lb6
                    r13 = 1
                L76:
                    int r0 = r8.A03
                    float r12 = (float) r0
                    int r0 = r8.A02
                    float r0 = (float) r0
                    float r1 = X.C176697tR.A01(r11, r12, r0, r2, r1)
                    X.7tc r0 = X.AbstractC176797tb.A11
                    X.AbstractC176827te.A00(r0, r10, r5)
                    r10.A00()
                    X.7tc r2 = X.AbstractC176797tb.A0t
                    java.lang.Float r1 = java.lang.Float.valueOf(r1)
                    X.7tf r0 = r10.A00
                    r0.A01(r2, r1)
                    r10.A00()
                    boolean r0 = r8.A0B
                    if (r0 != 0) goto La4
                    float r1 = X.AbstractC167007dF.A04(r9, r5)
                    r0 = 1120403456(0x42c80000, float:100.0)
                    float r1 = r1 / r0
                    X.C176697tR.A02(r7, r6, r1)
                La4:
                    android.os.Handler r2 = r8.A0E
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
                    r0 = 1
                    android.os.Message r0 = r2.obtainMessage(r0, r5, r0, r1)
                    r2.sendMessage(r0)
                    X.C176697tR.A03(r4, r3)
                    goto L37
                Lb6:
                    int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
                    if (r0 < 0) goto Lbf
                    int r0 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
                    r13 = 2
                    if (r0 < 0) goto L76
                Lbf:
                    r13 = 0
                    goto L76
                Lc1:
                    r0 = 0
                    goto L3d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CallableC24916B0p.call():java.lang.Object");
            }
        });
    }

    @Override // X.InterfaceC175067qg
    public final void EhX(final float f, final float f2) {
        this.A0Z.A07("set_zoom_percent", new Callable() { // from class: X.B1D
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i;
                C176697tR c176697tR;
                C175057qf c175057qf = C175057qf.this;
                float f3 = f;
                float f4 = f2;
                if (c175057qf.isConnected()) {
                    C175307r4 c175307r4 = c175057qf.A0R;
                    C175277r1 c175277r1 = c175307r4.A0J;
                    c175277r1.A01("Can only check if the prepared on the Optic thread");
                    if (c175277r1.A00 && (c176697tR = c175057qf.A07) != null) {
                        int i2 = 0;
                        if (c176697tR.A08 != null) {
                            if (c176697tR.A0B) {
                                i2 = c176697tR.A03;
                            }
                            if (c176697tR.A09(C176697tR.A01(f3 + (f4 * ((r1 - i2) - f3)), i2, c176697tR.A02, -1.0f, 1.0f), false)) {
                                C176697tR.A03(c175057qf, c175307r4);
                            }
                        }
                        i = c175057qf.A07.A07();
                        return Integer.valueOf(i);
                    }
                }
                i = 0;
                return Integer.valueOf(i);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r4 == 180) goto L9;
     */
    @Override // X.InterfaceC175067qg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ehu(android.graphics.Matrix r7, int r8, int r9, int r10, int r11, boolean r12) {
        /*
            r6 = this;
            if (r7 == 0) goto L86
            X.7tj r0 = r6.A0E
            if (r0 == 0) goto L7e
            r7.reset()
            float r1 = (float) r8
            float r0 = (float) r9
            r5 = 0
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r5, r5, r1, r0)
            int r4 = r6.A02
            if (r4 == 0) goto L1b
            r2 = 180(0xb4, float:2.52E-43)
            float r1 = (float) r11
            float r0 = (float) r10
            if (r4 != r2) goto L1d
        L1b:
            float r1 = (float) r10
            float r0 = (float) r11
        L1d:
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r5, r5, r1, r0)
            float r5 = r3.centerX()
            float r4 = r3.centerY()
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L63
            float r0 = r2.centerX()
            float r1 = r5 - r0
            float r0 = r2.centerY()
            float r0 = r4 - r0
            r2.offset(r1, r0)
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.FILL
            r7.setRectToRect(r3, r2, r0)
            int r0 = java.lang.Math.max(r8, r9)
            float r2 = (float) r0
            int r0 = java.lang.Math.max(r10, r11)
            float r0 = (float) r0
            float r2 = r2 / r0
            int r0 = java.lang.Math.min(r8, r9)
            float r1 = (float) r0
            int r0 = java.lang.Math.min(r10, r11)
            float r0 = (float) r0
            float r1 = r1 / r0
            if (r12 == 0) goto L79
            float r0 = java.lang.Math.max(r2, r1)
        L60:
            r7.postScale(r0, r0, r5, r4)
        L63:
            int r3 = r6.A01
            r2 = 2
            r1 = 1
            if (r3 == r1) goto L74
            r0 = 3
            if (r3 == r0) goto L74
            if (r3 != r2) goto L73
            r0 = 1127481344(0x43340000, float:180.0)
        L70:
            r7.postRotate(r0, r5, r4)
        L73:
            return r1
        L74:
            int r3 = r3 - r2
            int r0 = r3 * 90
            float r0 = (float) r0
            goto L70
        L79:
            float r0 = java.lang.Math.min(r2, r1)
            goto L60
        L7e:
            java.lang.String r0 = "Camera params need to be configured before invoking setupViewTransformMatrix()"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L86:
            java.lang.String r0 = "View transform matrix must be instantiated by the client."
            X.7uA r1 = new X.7uA
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175057qf.Ehu(android.graphics.Matrix, int, int, int, int, boolean):boolean");
    }

    @Override // X.InterfaceC175067qg
    public final void EmH(AbstractC184688Hj abstractC184688Hj, final float f) {
        this.A0Z.A00(abstractC184688Hj, "smooth_zoom_to", new Callable() { // from class: X.B0s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                float f2;
                C176697tR c176697tR;
                C175057qf c175057qf = C175057qf.this;
                float f3 = f;
                if (c175057qf.isConnected()) {
                    C175307r4 c175307r4 = c175057qf.A0R;
                    C175277r1 c175277r1 = c175307r4.A0J;
                    c175277r1.A01("Can only check if the prepared on the Optic thread");
                    if (c175277r1.A00 && (c176697tR = c175057qf.A07) != null) {
                        if (c176697tR.A09(f3, false)) {
                            C176697tR.A03(c175057qf, c175307r4);
                        }
                        f2 = c175057qf.A07.A05();
                        return Float.valueOf(f2);
                    }
                }
                f2 = -1.0f;
                return Float.valueOf(f2);
            }
        });
    }

    @Override // X.InterfaceC175067qg
    public final void Emb(AbstractC184688Hj abstractC184688Hj, int i, int i2) {
        final Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0L;
        rect.inset(i3, i3);
        this.A0Z.A00(abstractC184688Hj, "spot_meter", new Callable() { // from class: X.B0r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C176697tR c176697tR;
                AbstractC176767tY abstractC176767tY;
                C175057qf c175057qf = this;
                Rect rect2 = rect;
                if (c175057qf.isConnected()) {
                    C175307r4 c175307r4 = c175057qf.A0R;
                    C175277r1 c175277r1 = c175307r4.A0J;
                    c175277r1.A01("Can only check if the prepared on the Optic thread");
                    if (c175277r1.A00 && (c176697tR = c175057qf.A07) != null) {
                        MeteringRectangle[] meteringRectangleArr = {new MeteringRectangle(c176697tR.A08(rect2), 1000)};
                        c175277r1.A01("Can only perform spot metering on the Optic thread");
                        c175277r1.A01("Can only check if the prepared on the Optic thread");
                        if (c175277r1.A00 && c175307r4.A0S && c175307r4.A02 != null && c175307r4.A09 != null && (abstractC176767tY = c175307r4.A0F) != null && AbstractC167007dF.A1S(AbstractC176767tY.A0W, abstractC176767tY)) {
                            InterfaceC176367st interfaceC176367st = c175307r4.A0E;
                            interfaceC176367st.getClass();
                            if (!interfaceC176367st.isCameraSessionActivated() || !c175307r4.A0E.isARCoreEnabled()) {
                                c175307r4.A02.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr);
                                c175307r4.A09.Ecf(c175307r4.A02.build(), null, null);
                                return null;
                            }
                        }
                    }
                }
                return null;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:
    
        if (r1.isARCoreEnabled() == false) goto L9;
     */
    @Override // X.InterfaceC175067qg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EoC(X.AbstractC184688Hj r20, X.C23106AGs r21) {
        /*
            r19 = this;
            X.A4v r0 = X.C23106AGs.A07
            r3 = r21
            java.lang.Object r2 = r3.A00(r0)
            java.io.File r2 = (java.io.File) r2
            X.A4v r0 = X.C23106AGs.A09
            java.lang.Object r11 = r3.A00(r0)
            java.lang.String r11 = (java.lang.String) r11
            X.A4v r0 = X.C23106AGs.A08
            java.lang.Object r10 = r3.A00(r0)
            java.io.FileDescriptor r10 = (java.io.FileDescriptor) r10
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.A4v r0 = X.C23106AGs.A0A
            java.lang.Object r0 = r3.A00(r0)
            boolean r17 = r1.equals(r0)
            r0 = r19
            r5 = r20
            if (r2 == 0) goto L5b
            X.7r2 r3 = r0.A0S
            r10 = 0
            java.lang.String r11 = r2.getAbsolutePath()
        L33:
            int r12 = r0.A00
            int r13 = r0.A02
            int r14 = r0.A0j
            boolean r15 = r0.A0K
            X.7st r1 = r0.A0C
            if (r1 == 0) goto L47
            boolean r1 = r1.isARCoreEnabled()
            r16 = 1
            if (r1 != 0) goto L49
        L47:
            r16 = 0
        L49:
            X.7rP r9 = r0.A0n
            X.7qt r6 = r0.A0e
            X.7qu r7 = r0.A0i
            android.hardware.camera2.CaptureRequest$Builder r4 = r0.A06
            boolean r18 = A07(r0)
            X.7u0 r8 = r0.A0l
            r3.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L5a:
            return
        L5b:
            if (r11 == 0) goto L61
            X.7r2 r3 = r0.A0S
            r10 = 0
            goto L33
        L61:
            if (r10 == 0) goto L5a
            X.7r2 r3 = r0.A0S
            r11 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175057qf.EoC(X.8Hj, X.AGs):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0.isARCoreEnabled() == false) goto L6;
     */
    @Override // X.InterfaceC175067qg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EoD(X.AbstractC184688Hj r19, java.io.File r20, java.io.File r21) {
        /*
            r18 = this;
            r1 = r18
            X.7r2 r2 = r1.A0S
            java.lang.String r10 = r20.getAbsolutePath()
            int r11 = r1.A00
            int r12 = r1.A02
            int r13 = r1.A0j
            boolean r14 = r1.A0K
            X.7st r0 = r1.A0C
            if (r0 == 0) goto L1b
            boolean r0 = r0.isARCoreEnabled()
            r15 = 1
            if (r0 != 0) goto L1c
        L1b:
            r15 = 0
        L1c:
            r16 = 0
            X.7rP r8 = r1.A0n
            X.7qt r5 = r1.A0e
            X.7qu r6 = r1.A0i
            android.hardware.camera2.CaptureRequest$Builder r3 = r1.A06
            boolean r17 = A07(r1)
            X.7u0 r7 = r1.A0l
            r9 = 0
            r4 = r19
            r2.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175057qf.EoD(X.8Hj, java.io.File, java.io.File):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0.isARCoreEnabled() == false) goto L6;
     */
    @Override // X.InterfaceC175067qg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EoE(X.AbstractC184688Hj r19, java.io.FileDescriptor r20, java.io.FileDescriptor r21) {
        /*
            r18 = this;
            r1 = r18
            X.7r2 r2 = r1.A0S
            int r11 = r1.A00
            int r12 = r1.A02
            int r13 = r1.A0j
            boolean r14 = r1.A0K
            X.7st r0 = r1.A0C
            if (r0 == 0) goto L17
            boolean r0 = r0.isARCoreEnabled()
            r15 = 1
            if (r0 != 0) goto L18
        L17:
            r15 = 0
        L18:
            r16 = 0
            X.7rP r8 = r1.A0n
            X.7qt r5 = r1.A0e
            X.7qu r6 = r1.A0i
            android.hardware.camera2.CaptureRequest$Builder r3 = r1.A06
            boolean r17 = A07(r1)
            X.7u0 r7 = r1.A0l
            r10 = 0
            r4 = r19
            r9 = r20
            r2.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175057qf.EoE(X.8Hj, java.io.FileDescriptor, java.io.FileDescriptor):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0.isARCoreEnabled() == false) goto L6;
     */
    @Override // X.InterfaceC175067qg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EoF(X.AbstractC184688Hj r19, java.lang.String r20, java.lang.String r21) {
        /*
            r18 = this;
            r1 = r18
            X.7r2 r2 = r1.A0S
            int r11 = r1.A00
            int r12 = r1.A02
            int r13 = r1.A0j
            boolean r14 = r1.A0K
            X.7st r0 = r1.A0C
            if (r0 == 0) goto L17
            boolean r0 = r0.isARCoreEnabled()
            r15 = 1
            if (r0 != 0) goto L18
        L17:
            r15 = 0
        L18:
            r16 = 0
            X.7rP r8 = r1.A0n
            X.7qt r5 = r1.A0e
            X.7qu r6 = r1.A0i
            android.hardware.camera2.CaptureRequest$Builder r3 = r1.A06
            boolean r17 = A07(r1)
            X.7u0 r7 = r1.A0l
            r9 = 0
            r4 = r19
            r10 = r20
            r2.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175057qf.EoF(X.8Hj, java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC175067qg
    public final void Eop(AbstractC184688Hj abstractC184688Hj, boolean z) {
        C175287r2 c175287r2 = this.A0S;
        CaptureRequest.Builder builder = this.A06;
        boolean A07 = A07(this);
        C177047u0 c177047u0 = this.A0l;
        if (!c175287r2.A0D) {
            abstractC184688Hj.A01(new IllegalStateException("Not recording video."));
        } else {
            c175287r2.A0A.A00(abstractC184688Hj, "stop_video_capture", new B1T(builder, c175287r2, c177047u0, SystemClock.elapsedRealtime(), z, A07));
        }
    }

    @Override // X.InterfaceC175067qg
    public final void Epe(AbstractC184688Hj abstractC184688Hj) {
        int i = this.A00;
        AbstractC175037qd.A00 = 14;
        AbstractC175037qd.A00(14, i, null);
        this.A0Z.A00(abstractC184688Hj, "switch_camera", new CallableC24905B0e(this));
    }

    @Override // X.InterfaceC175067qg
    public final void Epu(InterfaceC196578mn interfaceC196578mn, C196548mk c196548mk) {
        C176787ta c176787ta = this.A08;
        if (c176787ta != null) {
            C176807tc c176807tc = AbstractC176797tb.A0e;
            Number number = (Number) c176787ta.A02(c176807tc);
            if (number != null && number.intValue() == 2) {
                C176837tf c176837tf = new C176837tf();
                c176837tf.A01(c176807tc, 1);
                Cpo(new C197068nb(this, interfaceC196578mn, c196548mk), c176837tf.A00());
                return;
            }
        }
        A0A(interfaceC196578mn, c196548mk);
    }

    @Override // X.InterfaceC175067qg
    public final void F9E(AbstractC184688Hj abstractC184688Hj, boolean z, boolean z2, final boolean z3) {
        this.A0Z.A00(abstractC184688Hj, "unlock_camera_values", new Callable() { // from class: X.9Qu
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                C175057qf c175057qf = C175057qf.this;
                if (c175057qf.isConnected() && c175057qf.A08 != null) {
                    C176837tf c176837tf = new C176837tf();
                    c176837tf.A01(AbstractC176797tb.A0P, false);
                    c176837tf.A01(AbstractC176797tb.A0R, false);
                    c175057qf.Cpo(new C176427t0(), c176837tf.A00());
                    if (z3) {
                        c175057qf.A0P.A0D = true;
                        return null;
                    }
                    return null;
                }
                throw new C6M2("Camera disconnected, failed to unlock automatics (focus, AE, AWB)");
            }
        });
    }

    @Override // X.InterfaceC175067qg
    public final boolean isConnected() {
        if (this.A0k != null) {
            if (this.A0r || this.A0s) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.7qr] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.7qu] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.7qi, X.7qh] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.7qo] */
    public C175057qf(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A0c = applicationContext;
        C175227qw c175227qw = new C175227qw();
        this.A0Z = c175227qw;
        C175237qx c175237qx = new C175237qx(c175227qw);
        this.A0Y = c175237qx;
        CameraManager cameraManager = (CameraManager) applicationContext.getSystemService("camera");
        this.A0M = cameraManager;
        C175247qy c175247qy = new C175247qy(applicationContext.getPackageManager(), cameraManager, c175237qx, c175227qw);
        this.A0O = c175247qy;
        this.A0Q = new C175257qz(c175237qx, c175227qw);
        this.A0S = new C175287r2(c175247qy, c175227qw);
        this.A0L = Math.round(TypedValue.applyDimension(1, 30.0f, context.getResources().getDisplayMetrics()));
        this.A0P = new C175297r3(c175227qw);
        this.A0R = new C175307r4(c175227qw);
    }

    @Override // X.InterfaceC175067qg
    public final void ARf(boolean z) {
        this.A0K = z;
    }

    @Override // X.InterfaceC175067qg
    public final AbstractC176767tY AlU() {
        AbstractC176767tY abstractC176767tY;
        if (isConnected() && (abstractC176767tY = this.A0D) != null) {
            return abstractC176767tY;
        }
        throw new C6M2("Cannot get camera capabilities");
    }

    @Override // X.InterfaceC175067qg
    public final AbstractC176797tb Bty() {
        C176787ta c176787ta;
        if (isConnected() && (c176787ta = this.A08) != null) {
            return c176787ta;
        }
        throw new C6M2("Cannot get camera settings");
    }
}
