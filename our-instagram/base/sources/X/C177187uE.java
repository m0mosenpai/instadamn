package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.7uE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177187uE implements InterfaceC177197uF {
    public final CameraCaptureSession A00;

    @Override // X.InterfaceC177197uF
    public final int AGk(CaptureRequest captureRequest, Handler handler, InterfaceC177057u1 interfaceC177057u1) {
        C177417ub c177417ub;
        CameraCaptureSession cameraCaptureSession = this.A00;
        if (interfaceC177057u1 != null) {
            c177417ub = new C177417ub(interfaceC177057u1, this);
        } else {
            c177417ub = null;
        }
        return cameraCaptureSession.capture(captureRequest, c177417ub, null);
    }

    @Override // X.InterfaceC177197uF
    public final boolean CU5() {
        return false;
    }

    @Override // X.InterfaceC177197uF
    public final int Ecf(CaptureRequest captureRequest, Handler handler, InterfaceC177057u1 interfaceC177057u1) {
        C177417ub c177417ub;
        CameraCaptureSession cameraCaptureSession = this.A00;
        if (interfaceC177057u1 != null) {
            c177417ub = new C177417ub(interfaceC177057u1, this);
        } else {
            c177417ub = null;
        }
        return C0fC.A00(c177417ub, cameraCaptureSession, captureRequest, null);
    }

    public static void A00(CameraDevice cameraDevice, C175337r9 c175337r9, InterfaceC176367st interfaceC176367st, List list, List list2, Executor executor) {
        long j;
        C177207uG c177207uG = new C177207uG(c175337r9);
        interfaceC176367st.addArSurfaces(list);
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            C177157uB c177157uB = (C177157uB) list2.get(i);
            OutputConfiguration outputConfiguration = new OutputConfiguration(c177157uB.A02);
            outputConfiguration.setStreamUseCase(c177157uB.A01);
            if (c177157uB.A00 != 1) {
                j = 1;
            } else {
                j = 2;
            }
            outputConfiguration.setDynamicRangeProfile(j);
            arrayList.add(outputConfiguration);
        }
        List arSurfaces = interfaceC176367st.getArSurfaces();
        int size2 = arSurfaces.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(new OutputConfiguration((Surface) arSurfaces.get(i2)));
        }
        cameraDevice.createCaptureSession(new SessionConfiguration(0, arrayList, executor, interfaceC176367st.wrapSessionConfigurationCallback(c177207uG)));
    }

    public static void A01(CameraDevice cameraDevice, C175337r9 c175337r9, InterfaceC176367st interfaceC176367st, List list, Executor executor, boolean z) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((C177157uB) list.get(i)).A02);
        }
        if (Build.VERSION.SDK_INT >= 33 && z) {
            A00(cameraDevice, c175337r9, interfaceC176367st, arrayList, list, executor);
        } else {
            cameraDevice.createCaptureSession(interfaceC176367st.addArSurfaces(arrayList), interfaceC176367st.wrapSessionConfigurationCallback(new C177207uG(c175337r9)), null);
        }
    }

    @Override // X.InterfaceC177197uF
    public final void A73() {
        this.A00.abortCaptures();
    }

    @Override // X.InterfaceC177197uF
    public final void close() {
        C0fC.A01(this.A00);
    }

    public C177187uE(CameraCaptureSession cameraCaptureSession) {
        this.A00 = cameraCaptureSession;
    }
}
