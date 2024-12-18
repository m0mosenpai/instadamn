package com.instagram.rtc.rsys.camera;

import X.A6A;
import X.AGA;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC176767tY;
import X.AbstractC176797tb;
import X.AbstractC179917yh;
import X.AbstractC52007Mz4;
import X.AnonymousClass001;
import X.B2P;
import X.C14360o3;
import X.C174997qZ;
import X.C175007qa;
import X.C175407rG;
import X.C176427t0;
import X.C176507t8;
import X.C176837tf;
import X.C176877tj;
import X.C178087vh;
import X.C179887ye;
import X.C212629bV;
import X.C23095AGf;
import X.C23432Aa5;
import X.C54453O4h;
import X.C55600Omg;
import X.C57124PVv;
import X.C69716VuB;
import X.C9X1;
import X.InterfaceC08830cm;
import X.InterfaceC175067qg;
import X.InterfaceC178207vu;
import X.InterfaceC178737wl;
import X.InterfaceC178787wq;
import X.InterfaceC179897yf;
import X.InterfaceC180067yw;
import X.MSV;
import X.OXE;
import X.POH;
import X.RunnableC24811AyX;
import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import com.facebook.rsys.camera.gen.Camera;
import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.camera.gen.CameraStallHandler;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;

/* loaded from: classes4.dex */
public class IgLiteCameraProxy extends AbstractC52007Mz4 {
    public int A00;
    public int A01;
    public C176877tj A02;
    public C176877tj A03;
    public B2P A04;
    public CameraApi A05;
    public C55600Omg A06;
    public Integer A07;
    public String A08;
    public SurfaceTextureHelper A09;
    public Float A0A;
    public final AGA A0B;
    public final UserSession A0C;
    public final C54453O4h A0D;
    public final InterfaceC08830cm A0E;
    public final EglBase.Context A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final Context A0J;
    public final boolean A0K;
    public final boolean A0L;
    public volatile boolean A0M;

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setApi(CameraApi cameraApi) {
        C14360o3.A0B(cameraApi, 0);
        this.A05 = cameraApi;
        cameraApi.setCameraStallHandler(new CameraStallHandler() { // from class: X.9e3
            @Override // com.facebook.rsys.camera.gen.CameraStallHandler
            public final void onCameraStallDetected() {
                OXE.A00.A00("IgLiteCameraProxy", "Camera Stall Detected");
                IgLiteCameraProxy igLiteCameraProxy = IgLiteCameraProxy.this;
                IgLiteCameraProxy.A00(igLiteCameraProxy);
                igLiteCameraProxy.A04().pause();
                igLiteCameraProxy.A04().EKd();
            }

            @Override // com.facebook.rsys.camera.gen.CameraStallHandler
            public final void onCameraStallRecovered() {
                OXE.A00.A00("IgLiteCameraProxy", "Camera Stall Recovered");
            }
        });
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setCameraMode(int i) {
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final int setTargetCaptureSettings(int i, int i2, int i3) {
        return 0;
    }

    public IgLiteCameraProxy(Context context, Point point, UserSession userSession, C54453O4h c54453O4h, InterfaceC08830cm interfaceC08830cm, EglBase.Context context2, double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(c54453O4h, 12);
        this.A0J = context;
        this.A0C = userSession;
        this.A0F = context2;
        this.A0E = interfaceC08830cm;
        this.A0G = z;
        this.A0K = z2;
        this.A0L = z3;
        this.A0I = z4;
        this.A0D = c54453O4h;
        this.A0H = z5;
        AGA aga = new AGA(new A6A(this));
        aga.A02 = point;
        this.A0B = aga;
        this.A04 = new B2P(this);
        this.A08 = Camera.FRONT_FACING_CAMERA.identifier;
        this.A01 = 368;
        this.A00 = 640;
        int i = (int) (d * 640.0d);
        if (aga.A01 != i) {
            AGA.A00(aga, aga.A00, i);
            aga.A01 = i;
        }
    }

    public static final void A00(IgLiteCameraProxy igLiteCameraProxy) {
        AbstractC167017dG.A1N(igLiteCameraProxy.A0J, igLiteCameraProxy.A0C);
    }

    public static final void A01(IgLiteCameraProxy igLiteCameraProxy) {
        C176877tj c176877tj = igLiteCameraProxy.A03;
        if (c176877tj != null) {
            int i = c176877tj.A02;
            int i2 = c176877tj.A01;
            Float f = igLiteCameraProxy.A0A;
            if (f != null) {
                float floatValue = f.floatValue();
                C175007qa c175007qa = B2P.A00(igLiteCameraProxy).A00;
                if (c175007qa != null && c175007qa.A0G()) {
                    float f2 = i;
                    float f3 = f2 * 0.25f;
                    float f4 = (-(((f2 / 2.0f) - (f3 / 2.0f)) - floatValue)) / f2;
                    float f5 = (((i2 / 2.0f) - ((f3 * 1.7777778f) / 2.0f)) - floatValue) / (f2 * 1.7777778f);
                    C175007qa c175007qa2 = B2P.A00(igLiteCameraProxy).A00;
                    if (c175007qa2 != null) {
                        C174997qZ c174997qZ = c175007qa2.A0R;
                        c174997qZ.A03 = f4;
                        c174997qZ.A04 = f5;
                        c174997qZ.A06 = 0.25f;
                        c174997qZ.A05 = 0.0f;
                        C69716VuB c69716VuB = c174997qZ.A00;
                        if (c69716VuB != null) {
                            c69716VuB.A01(f4, f5, 0.25f, 0.0f);
                        }
                    }
                }
            }
        }
    }

    public static final void A02(IgLiteCameraProxy igLiteCameraProxy, float f, boolean z) {
        if (z) {
            igLiteCameraProxy.A0A = Float.valueOf(f);
            C175007qa c175007qa = B2P.A00(igLiteCameraProxy).A00;
            if (c175007qa != null) {
                C212629bV c212629bV = new C212629bV(2);
                c175007qa.A0H = true;
                C175007qa c175007qa2 = c175007qa.A0C;
                if (c175007qa2 != null) {
                    c175007qa2.A0H = true;
                }
                C175407rG c175407rG = c175007qa.A0P;
                c175407rG.getClass();
                c175407rG.A08 = true;
                c175007qa.A09(null, c212629bV);
            }
            A01(igLiteCameraProxy);
            return;
        }
        C175007qa c175007qa3 = B2P.A00(igLiteCameraProxy).A00;
        if (c175007qa3 == null) {
            return;
        }
        c175007qa3.A0A(new C212629bV(3));
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final ArrayList createAvailableCameras() {
        return C23095AGf.A00.A00(this.A0J);
    }

    @Override // X.AbstractC52007Mz4
    public final CameraApi getApi() {
        CameraApi cameraApi = this.A05;
        if (cameraApi != null) {
            return cameraApi;
        }
        throw AbstractC166987dD.A14(MSV.A00(118));
    }

    @Override // X.AbstractC52007Mz4
    public final boolean isCameraCurrentlyFacingFront() {
        return C14360o3.A0K(this.A08, Camera.FRONT_FACING_CAMERA.identifier);
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void release() {
        if (!this.A0M) {
            A00(this);
            A04().destroy();
            this.A0M = true;
            this.A04 = new B2P(this);
            this.A07 = null;
        }
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setCamera(Camera camera) {
        if (camera != null && !C14360o3.A0K(camera.identifier, this.A08)) {
            C23432Aa5.A00(A04()).Epf();
            this.A08 = camera.identifier;
        }
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setCameraOn(boolean z, int i) {
        OXE.A00.A00("IgLiteCameraProxy", AnonymousClass001.A1D("setCameraOn: ", z));
        if (z) {
            C23432Aa5 A04 = A04();
            CameraApi cameraApi = this.A05;
            if (cameraApi != null) {
                cameraApi.setCameraState(1);
            }
            C55600Omg c55600Omg = new C55600Omg(this);
            this.A06 = c55600Omg;
            A04.A04(c55600Omg);
            A04.A03(C14360o3.A0K(this.A08, Camera.FRONT_FACING_CAMERA.identifier) ? 1 : 0);
            A04.EKd();
            A00(this);
            SurfaceTextureHelper surfaceTextureHelper = this.A09;
            if (surfaceTextureHelper == null) {
                surfaceTextureHelper = SurfaceTextureHelper.create("rsys_litecamera_capture", this.A0F);
            }
            this.A09 = surfaceTextureHelper;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.setTextureSize(this.A01, this.A00);
                surfaceTextureHelper.startListening(new C57124PVv(this));
                InterfaceC179897yf interfaceC179897yf = B2P.A00(this).A02;
                SurfaceTexture surfaceTexture = surfaceTextureHelper.surfaceTexture;
                C179887ye c179887ye = (C179887ye) interfaceC179897yf;
                C14360o3.A0B(surfaceTexture, 0);
                HashMap hashMap = c179887ye.A04;
                if (hashMap.get(surfaceTexture) == null) {
                    C176507t8 c176507t8 = new C176507t8(surfaceTexture, false);
                    c176507t8.A0D = true;
                    c176507t8.A09 = 1;
                    c176507t8.A07 = 1;
                    hashMap.put(surfaceTexture, c176507t8);
                    ((InterfaceC178737wl) InterfaceC178207vu.A00(c179887ye, InterfaceC178737wl.A00)).A9p(c176507t8);
                }
                SurfaceTexture surfaceTexture2 = surfaceTextureHelper.surfaceTexture;
                boolean z2 = !this.A0G;
                C14360o3.A0B(surfaceTexture2, 0);
                C176507t8 c176507t82 = (C176507t8) hashMap.get(surfaceTexture2);
                if (c176507t82 != null) {
                    c176507t82.A0E = z2;
                }
                SurfaceTexture surfaceTexture3 = surfaceTextureHelper.surfaceTexture;
                C14360o3.A0B(surfaceTexture3, 0);
                C176507t8 c176507t83 = (C176507t8) hashMap.get(surfaceTexture3);
                if (c176507t83 != null) {
                    c176507t83.A07 = 4;
                }
            }
            C23432Aa5 A042 = A04();
            C178087vh c178087vh = InterfaceC180067yw.A04;
            if (A042.A00.CRY(c178087vh)) {
                ((C9X1) ((InterfaceC180067yw) A04.A00.Aq0(c178087vh))).A07 = this.A0D;
                return;
            }
            return;
        }
        A00(this);
        C23432Aa5 A043 = A04();
        A043.pause();
        C55600Omg c55600Omg2 = this.A06;
        if (c55600Omg2 != null) {
            A043.A05(c55600Omg2);
        }
        SurfaceTextureHelper surfaceTextureHelper2 = this.A09;
        if (surfaceTextureHelper2 != null) {
            surfaceTextureHelper2.stopListening();
            InterfaceC179897yf interfaceC179897yf2 = B2P.A00(this).A02;
            SurfaceTexture surfaceTexture4 = surfaceTextureHelper2.surfaceTexture;
            C179887ye c179887ye2 = (C179887ye) interfaceC179897yf2;
            C14360o3.A0B(surfaceTexture4, 0);
            C176507t8 c176507t84 = (C176507t8) c179887ye2.A04.remove(surfaceTexture4);
            if (c176507t84 != null) {
                ((InterfaceC178737wl) InterfaceC178207vu.A00(c179887ye2, InterfaceC178737wl.A00)).EG3(c176507t84);
            }
            surfaceTextureHelper2.dispose();
            this.A09 = null;
        }
        CameraApi cameraApi2 = this.A05;
        if (cameraApi2 != null) {
            cameraApi2.setCameraState(0);
        }
        C23432Aa5 A044 = A04();
        C178087vh c178087vh2 = InterfaceC180067yw.A04;
        if (!A044.A00.CRY(c178087vh2)) {
            return;
        }
        ((C9X1) ((InterfaceC180067yw) A043.A00.Aq0(c178087vh2))).A07 = null;
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setTargetCaptureResolution(int i, int i2) {
        OXE.A00.A00("IgLiteCameraProxy", AnonymousClass001.A02(i, i2, "setTargetCaptureResolution w:", " h:"));
        if (this.A0K) {
            if (i < i2) {
                i = i2;
            }
            AGA aga = this.A0B;
            if (aga.A01 != i) {
                AGA.A00(aga, aga.A00, i);
                aga.A01 = i;
            }
        }
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setTargetFps(int i) {
        OXE oxe = OXE.A00;
        oxe.A00("IgLiteCameraProxy", AnonymousClass001.A0O("setTargetFps: ", i));
        InterfaceC175067qg Ak3 = C23432Aa5.A00(A04()).Ak3();
        if (Ak3 != null && Ak3.isConnected()) {
            if (this.A0L) {
                A03(this, i);
            }
        } else {
            oxe.A00("IgLiteCameraProxy", "Camera service it not initialized yet. Caching the target fps value and updating it after the camera initialization.");
            this.A07 = Integer.valueOf(i);
        }
    }

    public static final void A03(IgLiteCameraProxy igLiteCameraProxy, int i) {
        List list;
        AbstractC179917yh abstractC179917yh = (AbstractC179917yh) C23432Aa5.A00(igLiteCameraProxy.A04());
        InterfaceC175067qg Ak3 = abstractC179917yh.Ak3();
        if (Ak3 != null && Ak3.isConnected()) {
            int i2 = i * 1000;
            AbstractC176767tY A0A = abstractC179917yh.A0A();
            if (A0A != null && (list = (List) A0A.A01(AbstractC176767tY.A12)) != null && !list.isEmpty()) {
                int[] iArr = (int[]) list.get(0);
                int i3 = iArr[0];
                int i4 = iArr[1];
                for (int i5 = 1; i5 < list.size(); i5++) {
                    int[] iArr2 = (int[]) list.get(i5);
                    int i6 = iArr2[0];
                    int i7 = iArr2[1];
                    if (i4 > i2 ? i7 <= i2 || i7 < i4 || (i7 == i4 && i6 < i3) : i7 <= i2 && (i7 > i4 || (i7 == i4 && i6 < i3))) {
                        iArr = iArr2;
                        i3 = i6;
                        i4 = i7;
                    }
                }
                C176837tf c176837tf = new C176837tf();
                c176837tf.A01(AbstractC176797tb.A0n, iArr);
                Ak3.Cpo(new C176427t0(), c176837tf.A00());
            }
        }
        ((InterfaceC178787wq) B2P.A00(igLiteCameraProxy).A01.A00.Aq0(InterfaceC178787wq.A00)).EfR(i);
    }

    public final C23432Aa5 A04() {
        C23432Aa5 c23432Aa5 = B2P.A00(this).A01;
        C14360o3.A06(c23432Aa5);
        return c23432Aa5;
    }

    @Override // X.AbstractC52007Mz4
    public final void blankOutAndDisableCamera() {
        C23432Aa5 A04 = A04();
        ((InterfaceC178737wl) A04.A00.Aq0(InterfaceC178737wl.A00)).AQb(new RunnableC24811AyX(new POH(this)));
    }

    @Override // X.AbstractC52007Mz4
    public final boolean isSwitchCameraFacingSupported() {
        return C23432Aa5.A00(A04()).Ce9();
    }
}
