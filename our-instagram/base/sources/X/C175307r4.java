package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Range;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7r4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175307r4 {
    public static final Object A0U = new Object();
    public CameraCharacteristics A00;
    public CameraDevice A01;
    public CaptureRequest.Builder A02;
    public Surface A03;
    public Surface A04;
    public Surface A05;
    public Surface A06;
    public Surface A07;
    public C177047u0 A08;
    public InterfaceC177197uF A09;
    public C176787ta A0A;
    public C176817td A0B;
    public InterfaceC174657pz A0C;
    public InterfaceC175547rU A0D;
    public InterfaceC176367st A0E;
    public AbstractC176767tY A0F;
    public boolean A0G;
    public MeteringRectangle[] A0H;
    public MeteringRectangle[] A0I;
    public final C175277r1 A0J;
    public final C175227qw A0P;
    public volatile C176347sr A0R;
    public volatile boolean A0S;
    public volatile boolean A0T;
    public final C1814082s A0N = new C1814082s();
    public final C1814082s A0O = new C1814082s();
    public final List A0Q = new ArrayList();
    public final C7r6 A0L = new C7r6() { // from class: X.7r5
        @Override // X.C7r6
        public final void Dak() {
            final C175307r4 c175307r4 = C175307r4.this;
            AbstractC175037qd.A00(18, 0, null);
            C176347sr c176347sr = c175307r4.A0R;
            if (c176347sr != null) {
                c176347sr.A00();
            }
            if (!c175307r4.A0N.A00.isEmpty()) {
                C176567tE.A00(new Runnable() { // from class: X.7v8
                    @Override // java.lang.Runnable
                    public final void run() {
                        List list = C175307r4.this.A0N.A00;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((InterfaceC184558Gw) list.get(i)).Dak();
                        }
                    }
                });
            }
            c175307r4.A0P.A07("handle_preview_started", new CallableC177757v9(c175307r4));
        }
    };
    public final C7r6 A0K = new C7r6() { // from class: X.7r7
        @Override // X.C7r6
        public final void Dak() {
            C175307r4 c175307r4 = C175307r4.this;
            c175307r4.A0P.A07("handle_preview_started", new CallableC177757v9(c175307r4));
        }
    };
    public final C175337r9 A0M = new C175337r9(new C175327r8(this));

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (java.lang.Boolean.TRUE.equals(r2.A02(X.AbstractC176797tb.A03)) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (((java.lang.Number) r8.A0A.A02(r1)).intValue() != 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC177197uF A00(final X.C175307r4 r8, java.lang.String r9, final java.util.List r10, final boolean r11) {
        /*
            r4 = r8
            X.7r1 r1 = r8.A0J
            java.lang.String r0 = "Method createCaptureSession must be called on Optic Thread"
            r1.A01(r0)
            X.7ta r0 = r8.A0A
            r3 = 1
            if (r0 == 0) goto L24
            X.7tc r1 = X.AbstractC176797tb.A0e
            java.lang.Object r0 = r0.A02(r1)
            if (r0 == 0) goto L24
            X.7ta r0 = r8.A0A
            java.lang.Object r0 = r0.A02(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r6 = 1
            if (r0 == r3) goto L25
        L24:
            r6 = 0
        L25:
            X.7ta r2 = r8.A0A
            if (r2 == 0) goto L38
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.7tc r0 = X.AbstractC176797tb.A03
            java.lang.Object r0 = r2.A02(r0)
            boolean r0 = r1.equals(r0)
            r7 = 1
            if (r0 != 0) goto L39
        L38:
            r7 = 0
        L39:
            X.7r9 r0 = r8.A0M
            r0.A03 = r3
            X.7qi r2 = r0.A01
            r0 = 0
            r2.A02(r0)
            X.7qw r0 = r8.A0P
            X.7uC r3 = new X.7uC
            r5 = r10
            r8 = r11
            r3.<init>()
            java.lang.Object r0 = r0.A04(r9, r3)
            X.7uF r0 = (X.InterfaceC177197uF) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175307r4.A00(X.7r4, java.lang.String, java.util.List, boolean):X.7uF");
    }

    public static boolean A03(List list, int[] iArr) {
        if (list != null && iArr != null && (iArr[0] != 0 || iArr[1] != 0)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int[] iArr2 = (int[]) it.next();
                if (iArr2[0] == iArr[0] && iArr2[1] == iArr[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void A01(Rect rect, CaptureRequest.Builder builder, AbstractC176767tY abstractC176767tY, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, float f) {
        if (Build.VERSION.SDK_INT >= 30 && ((Boolean) abstractC176767tY.A01(AbstractC176767tY.A0O)).booleanValue()) {
            builder.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(f / 100.0f));
        } else if (((Boolean) abstractC176767tY.A01(AbstractC176767tY.A0f)).booleanValue()) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, rect);
        }
        if (((Boolean) abstractC176767tY.A01(AbstractC176767tY.A0V)).booleanValue()) {
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        if (((Boolean) abstractC176767tY.A01(AbstractC176767tY.A0W)).booleanValue()) {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
    }

    private boolean A02(int i) {
        CameraCharacteristics cameraCharacteristics = this.A00;
        cameraCharacteristics.getClass();
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r9 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fa, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC177197uF A04(X.C7r6 r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175307r4.A04(X.7r6, boolean, boolean):X.7uF");
    }

    public final void A05() {
        this.A0J.A00("Cannot refresh camera preview.");
        try {
            A0A(false, null);
        } catch (Exception unused) {
        }
    }

    public final void A06() {
        InterfaceC177137u9 interfaceC177137u9;
        this.A0J.A00("Cannot update frame metadata collection.");
        C176787ta c176787ta = this.A0A;
        if (c176787ta != null && this.A0D != null && this.A08 != null) {
            Object A02 = c176787ta.A02(AbstractC176797tb.A0U);
            A02.getClass();
            boolean booleanValue = ((Boolean) A02).booleanValue();
            C177047u0 c177047u0 = this.A08;
            if (booleanValue) {
                interfaceC177137u9 = this.A0D.B8a();
                if (c177047u0.A09 == null) {
                    c177047u0.A09 = new C177627uw();
                }
            } else {
                interfaceC177137u9 = null;
            }
            c177047u0.A0K = booleanValue;
            c177047u0.A07 = interfaceC177137u9;
        }
    }

    public final void A07(Rect rect, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, float f) {
        CaptureRequest.Builder builder;
        AbstractC176767tY abstractC176767tY;
        C175277r1 c175277r1 = this.A0J;
        c175277r1.A01("Can only apply zoom on the Optic thread");
        c175277r1.A01("Can only check if the prepared on the Optic thread");
        if (c175277r1.A00 && (builder = this.A02) != null && (abstractC176767tY = this.A0F) != null) {
            A01(rect, builder, abstractC176767tY, meteringRectangleArr, meteringRectangleArr2, f);
            if (this.A0S) {
                A05();
            }
        }
    }

    public final void A08(Surface surface, C175137qn c175137qn, boolean z, boolean z2) {
        InterfaceC174657pz interfaceC174657pz;
        InterfaceC174657pz interfaceC174657pz2;
        CaptureRequest.Builder builder;
        CaptureRequest.Key key;
        AbstractC176767tY abstractC176767tY;
        Integer valueOf;
        Integer valueOf2;
        AbstractC176767tY abstractC176767tY2;
        InterfaceC174657pz interfaceC174657pz3;
        CaptureRequest.Builder builder2;
        CaptureRequest.Key key2;
        int i;
        this.A0J.A00("Cannot configure camera preview.");
        this.A04 = surface;
        this.A0G = z;
        CameraDevice cameraDevice = this.A01;
        cameraDevice.getClass();
        InterfaceC176367st interfaceC176367st = this.A0E;
        interfaceC176367st.getClass();
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(interfaceC176367st.getPreviewTemplate());
        this.A02 = createCaptureRequest;
        this.A0I = (MeteringRectangle[]) createCaptureRequest.get(CaptureRequest.CONTROL_AF_REGIONS);
        this.A0H = (MeteringRectangle[]) this.A02.get(CaptureRequest.CONTROL_AE_REGIONS);
        if (!z2) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                InterfaceC174657pz interfaceC174657pz4 = this.A0C;
                if (interfaceC174657pz4 != null && ((Boolean) interfaceC174657pz4.AXQ(InterfaceC174657pz.A09)).booleanValue()) {
                    builder2 = this.A02;
                    key2 = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
                    i = 1;
                } else {
                    builder2 = this.A02;
                    key2 = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
                    i = 0;
                }
                builder2.set(key2, i);
            }
            int i3 = 1;
            this.A02.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            this.A02.set(CaptureRequest.CONTROL_MODE, 1);
            InterfaceC174657pz interfaceC174657pz5 = this.A0C;
            interfaceC174657pz5.getClass();
            if (!((Boolean) interfaceC174657pz5.AXQ(InterfaceC174657pz.A06)).booleanValue()) {
                this.A02.set(CaptureRequest.CONTROL_SCENE_MODE, 0);
            }
            this.A02.set(CaptureRequest.CONTROL_AE_LOCK, false);
            this.A02.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            if (this.A0B != null) {
                if (A02(4)) {
                    C176817td c176817td = this.A0B;
                    ((AbstractC176827te) c176817td).A00.A01(AbstractC176797tb.A0D, 4);
                    c176817td.A00();
                    this.A02.set(CaptureRequest.CONTROL_AF_MODE, 4);
                } else if (A02(3)) {
                    C176817td c176817td2 = this.A0B;
                    ((AbstractC176827te) c176817td2).A00.A01(AbstractC176797tb.A0D, 3);
                    c176817td2.A00();
                    this.A02.set(CaptureRequest.CONTROL_AF_MODE, 3);
                } else if (A02(1)) {
                    C176817td c176817td3 = this.A0B;
                    ((AbstractC176827te) c176817td3).A00.A01(AbstractC176797tb.A0D, 1);
                    c176817td3.A00();
                    this.A02.set(CaptureRequest.CONTROL_AF_MODE, 1);
                }
            }
            if (this.A02 != null && this.A0B != null) {
                AbstractC176767tY abstractC176767tY3 = this.A0F;
                if (abstractC176767tY3 != null && ((Boolean) abstractC176767tY3.A01(AbstractC176767tY.A0Q)).booleanValue()) {
                    this.A02.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                    C176817td c176817td4 = this.A0B;
                    ((AbstractC176827te) c176817td4).A00.A01(AbstractC176797tb.A0X, true);
                    c176817td4.A00();
                }
                AbstractC176767tY abstractC176767tY4 = this.A0F;
                if (abstractC176767tY4 != null && ((Boolean) abstractC176767tY4.A01(AbstractC176767tY.A0b)).booleanValue()) {
                    this.A02.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                    C176817td c176817td5 = this.A0B;
                    ((AbstractC176827te) c176817td5).A00.A01(AbstractC176797tb.A0Z, false);
                    c176817td5.A00();
                }
                if (i2 >= 33 && (abstractC176767tY2 = this.A0F) != null && ((Boolean) abstractC176767tY2.A01(AbstractC176767tY.A0R)).booleanValue() && (interfaceC174657pz3 = this.A0C) != null && ((Boolean) interfaceC174657pz3.AXQ(InterfaceC174657pz.A08)).booleanValue()) {
                    builder = this.A02;
                    key = CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE;
                    i3 = 2;
                } else {
                    AbstractC176767tY abstractC176767tY5 = this.A0F;
                    if (abstractC176767tY5 != null && ((Boolean) abstractC176767tY5.A01(AbstractC176767tY.A0S)).booleanValue() && (interfaceC174657pz2 = this.A0C) != null && ((Boolean) interfaceC174657pz2.AXQ(InterfaceC174657pz.A07)).booleanValue()) {
                        builder = this.A02;
                        key = CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE;
                    }
                    if (this.A02 == null && this.A0F != null && this.A0B != null) {
                        InterfaceC174657pz interfaceC174657pz6 = this.A0C;
                        interfaceC174657pz6.getClass();
                        C174687q2 c174687q2 = (C174687q2) interfaceC174657pz6.AXQ(InterfaceC174657pz.A0A);
                        List list = (List) this.A0F.A01(AbstractC176767tY.A12);
                        int[] A00 = c174687q2.A00(list);
                        if (A03(list, A00)) {
                            C176817td c176817td6 = this.A0B;
                            ((AbstractC176827te) c176817td6).A00.A01(AbstractC176797tb.A0n, A00);
                            c176817td6.A00();
                            boolean booleanValue = ((Boolean) this.A0F.A01(AbstractC176767tY.A0m)).booleanValue();
                            int i4 = A00[0];
                            if (booleanValue) {
                                valueOf = Integer.valueOf(i4 / 1000);
                                valueOf2 = Integer.valueOf(A00[1] / 1000);
                            } else {
                                valueOf = Integer.valueOf(i4);
                                valueOf2 = Integer.valueOf(A00[1]);
                            }
                            this.A02.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, Range.create(valueOf, valueOf2));
                        }
                        if (this.A02 != null && (abstractC176767tY = this.A0F) != null && this.A0A != null) {
                            if (((Boolean) abstractC176767tY.A01(AbstractC176767tY.A0F)).booleanValue()) {
                                this.A0A.A02(AbstractC176797tb.A0l);
                            }
                            this.A02.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                            AbstractC176767tY abstractC176767tY6 = this.A0F;
                            abstractC176767tY6.getClass();
                            if (((Boolean) abstractC176767tY6.A01(AbstractC176767tY.A0P)).booleanValue()) {
                                this.A02.set(CaptureRequest.NOISE_REDUCTION_MODE, 2);
                            }
                        } else {
                            throw new IllegalStateException("Cannot initialize custom capture settings, preview closed.");
                        }
                    } else {
                        throw new IllegalStateException("Cannot initialize fps settings, preview closed.");
                    }
                }
                builder.set(key, i3);
                C176817td c176817td7 = this.A0B;
                ((AbstractC176827te) c176817td7).A00.A01(AbstractC176797tb.A0Y, true);
                c176817td7.A00();
                if (this.A02 == null) {
                }
                throw new IllegalStateException("Cannot initialize fps settings, preview closed.");
            }
            throw new IllegalStateException("Cannot initialize stabilization settings, preview closed.");
        }
        if (A0C()) {
            CaptureRequest.Builder builder3 = this.A02;
            builder3.getClass();
            builder3.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 3);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            AbstractC176767tY abstractC176767tY7 = this.A0F;
            abstractC176767tY7.getClass();
            if (((Boolean) abstractC176767tY7.A01(AbstractC176767tY.A09)).booleanValue() && (interfaceC174657pz = this.A0C) != null && ((Boolean) interfaceC174657pz.AXQ(InterfaceC174657pz.A0L)).booleanValue()) {
                this.A02.set(CaptureRequest.CONTROL_AE_MODE, 6);
            }
        }
        this.A02.addTarget(this.A04);
        C177047u0 c177047u0 = this.A08;
        c177047u0.getClass();
        c177047u0.A03 = c175137qn;
        A06();
    }

    public final void A09(boolean z) {
        CaptureRequest.Builder builder;
        this.A0J.A00("Cannot update preview builder for CPU frames.");
        InterfaceC176367st interfaceC176367st = this.A0E;
        boolean z2 = true;
        if (interfaceC176367st != null && interfaceC176367st.isARCoreEnabled()) {
            z = true;
        }
        InterfaceC175547rU interfaceC175547rU = this.A0D;
        if ((interfaceC175547rU != null && !interfaceC175547rU.Ce5()) || (builder = this.A02) == null || interfaceC175547rU == null) {
            return;
        }
        Surface surface = interfaceC175547rU.getSurface();
        surface.getClass();
        if (z) {
            builder.addTarget(surface);
        } else {
            builder.removeTarget(surface);
            z2 = false;
        }
        this.A0T = z2;
    }

    public final void A0A(boolean z, String str) {
        CaptureRequest.Builder builder;
        this.A0J.A01("Method updatePreviewView must be invoked in the Optic background thread");
        InterfaceC176367st interfaceC176367st = this.A0E;
        if (interfaceC176367st != null && interfaceC176367st.isCameraSessionActivated() && this.A0E.isARCoreEnabled()) {
            return;
        }
        synchronized (A0U) {
            InterfaceC177197uF interfaceC177197uF = this.A09;
            if (interfaceC177197uF != null && (builder = this.A02) != null) {
                interfaceC177197uF.Ecf(builder.build(), null, this.A08);
            } else if (z) {
                if (str == null) {
                    str = "Trying to update preview view while preview is closed";
                }
                throw new RuntimeException(str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.9ux] */
    public final void A0B(boolean z, boolean z2) {
        C7r6 c7r6;
        C175277r1 c175277r1 = this.A0J;
        c175277r1.A01("Method restartPreview() must run on the Optic Background Thread.");
        if (this.A08 != null) {
            c175277r1.A01("Can only check if the prepared on the Optic thread");
            if (c175277r1.A00) {
                C177047u0 c177047u0 = this.A08;
                if (c177047u0.A0J && c177047u0.A0H == 1) {
                    List list = this.A0Q;
                    ?? obj = new Object();
                    obj.A00 = z;
                    obj.A01 = z2;
                    list.add(obj);
                    return;
                }
                if (z2) {
                    c7r6 = this.A0L;
                } else {
                    c7r6 = this.A0K;
                }
                this.A09 = A04(c7r6, z, false);
            }
        }
    }

    public final boolean A0C() {
        C176787ta c176787ta = this.A0A;
        if (c176787ta != null && Boolean.TRUE.equals(c176787ta.A02(AbstractC176797tb.A0J))) {
            InterfaceC176367st interfaceC176367st = this.A0E;
            if (interfaceC176367st == null || !interfaceC176367st.isARCoreEnabled()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C175307r4(C175227qw c175227qw) {
        this.A0P = c175227qw;
        this.A0J = new C175277r1(c175227qw);
    }
}
