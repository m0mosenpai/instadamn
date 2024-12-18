package X;

import android.os.Bundle;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.List;

/* renamed from: X.AWj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23339AWj implements InterfaceC25220BDu, BE4 {
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public float A00 = 1.0f;
    public final List A05 = AbstractC166987dD.A1E();

    @Override // X.BE4
    public final void FB5(Bundle bundle) {
    }

    public static C09530e4 A00() {
        return new C09530e4("serviceType", 12);
    }

    @Override // X.BE4
    public final void CO6(AnonymousClass904 anonymousClass904) {
        int i;
        int i2;
        int i3;
        float f;
        InterfaceC149876og interfaceC149876og;
        InterfaceC149876og interfaceC149876og2;
        InterfaceC149876og interfaceC149876og3;
        InterfaceC149876og interfaceC149876og4;
        InterfaceC149876og interfaceC149876og5;
        InterfaceC149876og interfaceC149876og6;
        if (anonymousClass904 != null) {
            C203848zt c203848zt = AnonymousClass901.A01;
            if (AnonymousClass904.A01(anonymousClass904, c203848zt)) {
                AnonymousClass901 anonymousClass901 = (AnonymousClass901) anonymousClass904.A02(c203848zt);
                int i4 = 0;
                if (anonymousClass901 != null && (interfaceC149876og6 = anonymousClass901.A00) != null) {
                    i = interfaceC149876og6.Bpz();
                } else {
                    i = 0;
                }
                this.A04 = i;
                if (anonymousClass901 != null && (interfaceC149876og5 = anonymousClass901.A00) != null) {
                    i2 = interfaceC149876og5.Bpx();
                } else {
                    i2 = 0;
                }
                this.A02 = i2;
                if (anonymousClass901 != null && (interfaceC149876og4 = anonymousClass901.A00) != null) {
                    i3 = interfaceC149876og4.Bpw();
                } else {
                    i3 = 0;
                }
                this.A01 = i3;
                if (anonymousClass901 != null && (interfaceC149876og3 = anonymousClass901.A00) != null) {
                    i4 = interfaceC149876og3.Bpy();
                }
                this.A03 = i4;
                if (anonymousClass901 != null && (interfaceC149876og2 = anonymousClass901.A00) != null) {
                    f = interfaceC149876og2.CIm();
                } else {
                    f = 1.0f;
                }
                setZoomFactor(f);
                if (anonymousClass901 != null && (interfaceC149876og = anonymousClass901.A00) != null) {
                    interfaceC149876og.A90(this);
                }
            }
        }
    }

    @Override // X.BE4
    public final List Epn() {
        List list = this.A05;
        if (!list.isEmpty()) {
            List A0a = AbstractC001800i.A0a(list);
            list.clear();
            return A0a;
        }
        return null;
    }

    @Override // X.InterfaceC25220BDu
    public final void capturePhoto() {
        AbstractC167027dH.A15(C05F.A1I, this.A05, A00());
    }

    @Override // X.InterfaceC25220BDu
    public final void finishCapturePhoto() {
        AbstractC167027dH.A15(C05F.A02, this.A05, A00());
    }

    @Override // X.InterfaceC25220BDu
    public final void setCaptureContext(int i) {
        AbstractC167027dH.A14("captureContext", Integer.valueOf(i), this.A05, A00(), AbstractC167027dH.A0Y(C05F.A01));
    }

    @Override // X.InterfaceC25220BDu
    public final void setCaptureDevicePosition(int i) {
        AbstractC167027dH.A14("position", Integer.valueOf(i), this.A05, A00(), AbstractC167027dH.A0Y(C05F.A00));
    }

    @Override // X.InterfaceC25220BDu
    public final void setCaptureDeviceSize(int i, int i2) {
        this.A05.add(AbstractC167027dH.A09(IgReactMediaPickerNativeModule.HEIGHT, Integer.valueOf(i2), A00(), AbstractC167027dH.A0Y(C05F.A0C), AbstractC166987dD.A1L(IgReactMediaPickerNativeModule.WIDTH, Integer.valueOf(i))));
    }

    @Override // X.InterfaceC25220BDu
    public final void setEffectSafeAreaInsets(int i, int i2, int i3, int i4) {
        this.A05.add(AbstractC61636Rr0.A00(A00(), AbstractC167027dH.A0Y(C05F.A0j), AbstractC166987dD.A1L("top", Integer.valueOf(i)), AbstractC166987dD.A1L("left", Integer.valueOf(i2)), AbstractC166987dD.A1L("bottom", Integer.valueOf(i3)), AbstractC166987dD.A1L("right", Integer.valueOf(i4))));
    }

    @Override // X.InterfaceC25220BDu
    public final void setPreviewViewInfo(int i, int i2, float f) {
        this.A05.add(AbstractC61636Rr0.A00(A00(), AbstractC167027dH.A0Y(C05F.A0N), AbstractC166987dD.A1L(IgReactMediaPickerNativeModule.WIDTH, Integer.valueOf(i)), AbstractC166987dD.A1L(IgReactMediaPickerNativeModule.HEIGHT, Integer.valueOf(i2)), AbstractC166987dD.A1L("density", Float.valueOf(f))));
    }

    @Override // X.InterfaceC25220BDu
    public final void setRotation(int i) {
        AbstractC167027dH.A14("deviceRotation", Integer.valueOf(i), this.A05, A00(), AbstractC167027dH.A0Y(C05F.A0Y));
    }

    @Override // X.InterfaceC25220BDu
    public final void setZoomFactor(float f) {
        this.A00 = f;
        AbstractC167027dH.A14("zoomFactor", Float.valueOf(f), this.A05, A00(), AbstractC167027dH.A0Y(C05F.A0u));
    }

    @Override // X.InterfaceC25220BDu
    public final void startRecording() {
        AbstractC167027dH.A15(C05F.A15, this.A05, A00());
    }

    @Override // X.InterfaceC25220BDu
    public final void stopRecording() {
        AbstractC167027dH.A15(C05F.A1F, this.A05, A00());
    }

    @Override // X.BE4
    public final Bundle BHd() {
        return AbstractC61636Rr0.A00(A00(), AbstractC166987dD.A1L("safeAreaTop", Integer.valueOf(this.A04)), AbstractC166987dD.A1L("safeAreaLeft", Integer.valueOf(this.A02)), AbstractC166987dD.A1L("safeAreaBottom", Integer.valueOf(this.A01)), AbstractC166987dD.A1L("safeAreaRight", Integer.valueOf(this.A03)), AbstractC166987dD.A1L("zoomFactor", Float.valueOf(this.A00)));
    }
}
