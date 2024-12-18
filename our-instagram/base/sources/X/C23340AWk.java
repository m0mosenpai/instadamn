package X;

import android.os.Bundle;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.List;

/* renamed from: X.AWk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23340AWk implements InterfaceC149876og, BCI {
    public InterfaceC25220BDu A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    @Override // X.InterfaceC149876og
    public final void EQr(Integer num) {
    }

    @Override // X.InterfaceC149876og
    public final void ERD(Integer num) {
    }

    @Override // X.BCI
    public final List Epm(Bundle bundle) {
        InterfaceC25220BDu interfaceC25220BDu;
        C14360o3.A0B(bundle, 0);
        if (bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 0) {
                if (bundle.containsKey("position")) {
                    int i2 = bundle.getInt("position");
                    InterfaceC25220BDu interfaceC25220BDu2 = this.A00;
                    if (interfaceC25220BDu2 != null) {
                        interfaceC25220BDu2.setCaptureDevicePosition(i2);
                    }
                }
            } else if (i == 1) {
                if (bundle.containsKey("captureContext")) {
                    int i3 = bundle.getInt("captureContext");
                    InterfaceC25220BDu interfaceC25220BDu3 = this.A00;
                    if (interfaceC25220BDu3 != null) {
                        interfaceC25220BDu3.setCaptureContext(i3);
                        return null;
                    }
                }
            } else if (i == 2) {
                if (bundle.containsKey(IgReactMediaPickerNativeModule.WIDTH) && bundle.containsKey(IgReactMediaPickerNativeModule.HEIGHT)) {
                    int i4 = bundle.getInt(IgReactMediaPickerNativeModule.WIDTH);
                    int i5 = bundle.getInt(IgReactMediaPickerNativeModule.HEIGHT);
                    InterfaceC25220BDu interfaceC25220BDu4 = this.A00;
                    if (interfaceC25220BDu4 != null) {
                        interfaceC25220BDu4.setCaptureDeviceSize(i4, i5);
                        return null;
                    }
                }
            } else if (i == 3) {
                if (bundle.containsKey(IgReactMediaPickerNativeModule.WIDTH) && bundle.containsKey(IgReactMediaPickerNativeModule.HEIGHT) && bundle.containsKey("density")) {
                    int i6 = bundle.getInt(IgReactMediaPickerNativeModule.WIDTH);
                    int i7 = bundle.getInt(IgReactMediaPickerNativeModule.HEIGHT);
                    float f = bundle.getFloat("density");
                    InterfaceC25220BDu interfaceC25220BDu5 = this.A00;
                    if (interfaceC25220BDu5 != null) {
                        interfaceC25220BDu5.setPreviewViewInfo(i6, i7, f);
                        return null;
                    }
                }
            } else if (i == 4) {
                if (bundle.containsKey("deviceRotation")) {
                    int i8 = bundle.getInt("deviceRotation");
                    InterfaceC25220BDu interfaceC25220BDu6 = this.A00;
                    if (interfaceC25220BDu6 != null) {
                        interfaceC25220BDu6.setRotation(i8);
                        return null;
                    }
                }
            } else if (i == 5) {
                if (bundle.containsKey("top") && bundle.containsKey("left") && bundle.containsKey("bottom") && bundle.containsKey("right")) {
                    int i9 = bundle.getInt("top");
                    int i10 = bundle.getInt("left");
                    int i11 = bundle.getInt("bottom");
                    int i12 = bundle.getInt("right");
                    InterfaceC25220BDu interfaceC25220BDu7 = this.A00;
                    if (interfaceC25220BDu7 != null) {
                        interfaceC25220BDu7.setEffectSafeAreaInsets(i9, i10, i11, i12);
                        return null;
                    }
                }
            } else if (i == 6) {
                if (bundle.containsKey("zoomFactor")) {
                    float f2 = bundle.getFloat("zoomFactor");
                    InterfaceC25220BDu interfaceC25220BDu8 = this.A00;
                    if (interfaceC25220BDu8 != null) {
                        interfaceC25220BDu8.setZoomFactor(f2);
                        return null;
                    }
                }
            } else if (i == 7) {
                InterfaceC25220BDu interfaceC25220BDu9 = this.A00;
                if (interfaceC25220BDu9 != null) {
                    interfaceC25220BDu9.startRecording();
                    return null;
                }
            } else if (i == 8) {
                InterfaceC25220BDu interfaceC25220BDu10 = this.A00;
                if (interfaceC25220BDu10 != null) {
                    interfaceC25220BDu10.stopRecording();
                    return null;
                }
            } else if (i == 9) {
                InterfaceC25220BDu interfaceC25220BDu11 = this.A00;
                if (interfaceC25220BDu11 != null) {
                    interfaceC25220BDu11.capturePhoto();
                    return null;
                }
            } else if (i == 10 && (interfaceC25220BDu = this.A00) != null) {
                interfaceC25220BDu.finishCapturePhoto();
                return null;
            }
        }
        return null;
    }

    @Override // X.InterfaceC149876og
    public final void capturePhoto() {
    }

    @Override // X.InterfaceC149876og
    public final void finishCapturePhoto() {
    }

    @Override // X.InterfaceC149876og
    public final void setCaptureDeviceSize(int i, int i2) {
    }

    @Override // X.InterfaceC149876og
    public final void setPreviewViewInfo(int i, int i2, float f) {
    }

    @Override // X.InterfaceC149876og
    public final void setRotation(int i) {
    }

    @Override // X.InterfaceC149876og
    public final void setZoomFactor(float f) {
    }

    @Override // X.InterfaceC149876og
    public final void startRecording() {
    }

    @Override // X.InterfaceC149876og
    public final void stop() {
        this.A00 = null;
    }

    @Override // X.InterfaceC149876og
    public final void stopRecording() {
    }

    @Override // X.InterfaceC149876og
    public final int Bpw() {
        return this.A02;
    }

    @Override // X.InterfaceC149876og
    public final int Bpx() {
        return this.A03;
    }

    @Override // X.InterfaceC149876og
    public final int Bpy() {
        return this.A04;
    }

    @Override // X.InterfaceC149876og
    public final int Bpz() {
        return this.A05;
    }

    @Override // X.InterfaceC149876og
    public final float CIm() {
        return this.A01;
    }

    public C23340AWk(int i, int i2, int i3, int i4, float f) {
        this.A05 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A01 = f;
    }

    @Override // X.InterfaceC149876og
    public final void A90(InterfaceC25220BDu interfaceC25220BDu) {
        this.A00 = interfaceC25220BDu;
    }
}
