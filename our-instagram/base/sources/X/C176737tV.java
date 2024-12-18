package X;

import android.hardware.camera2.CameraDevice;

/* renamed from: X.7tV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176737tV extends CameraDevice.StateCallback implements InterfaceC175347rA {
    public CameraDevice A00;
    public C177147uA A01;
    public Boolean A02;
    public final C175087qi A03;
    public final InterfaceC175107qk A04;
    public final InterfaceC175127qm A05;

    @Override // X.InterfaceC175347rA
    public final void AE4() {
        this.A03.A00();
    }

    @Override // X.InterfaceC175347rA
    public final /* bridge */ /* synthetic */ Object Bos() {
        Boolean bool = this.A02;
        if (bool != null) {
            if (bool.booleanValue()) {
                CameraDevice cameraDevice = this.A00;
                cameraDevice.getClass();
                return cameraDevice;
            }
            throw this.A01;
        }
        throw new IllegalStateException("Open Camera operation hasn't completed yet.");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.7uA, java.lang.RuntimeException] */
    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        if (this.A00 == null) {
            this.A02 = false;
            this.A01 = new RuntimeException("Could not open camera. Operation disconnected.");
            this.A03.A01();
        } else {
            InterfaceC175127qm interfaceC175127qm = this.A05;
            if (interfaceC175127qm == null) {
                return;
            }
            interfaceC175127qm.DAb(cameraDevice);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.7uA, java.lang.RuntimeException] */
    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        C0fF c0fF = C0fF.$redex_init_class;
        if (C0BU.A04()) {
            C0BU.A02(cameraDevice);
        }
        if (this.A00 == null) {
            this.A02 = false;
            this.A01 = new RuntimeException(AnonymousClass001.A0O("Could not open camera. Operation error: ", i));
            this.A03.A01();
        } else {
            InterfaceC175127qm interfaceC175127qm = this.A05;
            if (interfaceC175127qm == null) {
                return;
            }
            interfaceC175127qm.DE5(cameraDevice, i);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        C0fF c0fF = C0fF.$redex_init_class;
        if (C0BU.A04()) {
            C0BU.A03(cameraDevice);
        }
        this.A02 = true;
        this.A00 = cameraDevice;
        this.A03.A01();
    }

    public C176737tV(InterfaceC175107qk interfaceC175107qk, InterfaceC175127qm interfaceC175127qm) {
        this.A04 = interfaceC175107qk;
        this.A05 = interfaceC175127qm;
        C175087qi c175087qi = new C175087qi();
        this.A03 = c175087qi;
        c175087qi.A02(0L);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        super.onClosed(cameraDevice);
        this.A00 = null;
        InterfaceC175107qk interfaceC175107qk = this.A04;
        if (interfaceC175107qk != null) {
            interfaceC175107qk.onCameraClosed(cameraDevice);
        }
    }
}
