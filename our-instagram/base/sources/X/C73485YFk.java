package X;

import com.facebook.gltf.jni.GLTFCameraOrientation;
import com.facebook.gltf.jni.TurntableCameraControl;

/* renamed from: X.YFk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73485YFk implements InterfaceC141866b4 {
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(YLB.A00);

    @Override // X.InterfaceC141866b4
    public final void E4O(float f, float f2, float f3, float f4, float f5, float f6) {
        A00(this).pinchMove(f, f2, f3, 0.0f, 0.0f, 0.0f);
    }

    @Override // X.InterfaceC141866b4
    public final void EWS(boolean z) {
        A00(this).setIsFullscreen(false);
    }

    @Override // X.InterfaceC141866b4
    public final void FA0(GLTFCameraOrientation gLTFCameraOrientation, double d) {
        C14360o3.A0B(gLTFCameraOrientation, 0);
        A00(this).update(gLTFCameraOrientation, d);
    }

    public static TurntableCameraControl A00(C73485YFk c73485YFk) {
        return (TurntableCameraControl) c73485YFk.A00.getValue();
    }

    @Override // X.InterfaceC141866b4
    public final void EMW(float f) {
        A00(this).scrollUpdate(0.5f);
    }

    @Override // X.InterfaceC141866b4
    public final float BdN() {
        return A00(this).getPitch();
    }

    @Override // X.InterfaceC141866b4
    public final float BpU() {
        return A00(this).getRoll();
    }

    @Override // X.InterfaceC141866b4
    public final float CIe() {
        return A00(this).getYaw();
    }

    @Override // X.InterfaceC141866b4
    public final void E3H(float f, float f2) {
        A00(this).panEnd(f, f2);
    }

    @Override // X.InterfaceC141866b4
    public final void E3I(float f, float f2) {
        A00(this).panMove(f, f2);
    }

    @Override // X.InterfaceC141866b4
    public final void E3J() {
        A00(this).panStart();
    }

    @Override // X.InterfaceC141866b4
    public final void E4N() {
        A00(this).pinchEnd();
    }

    @Override // X.InterfaceC141866b4
    public final void E4P() {
        A00(this).pinchStart();
    }

    @Override // X.InterfaceC141866b4
    public final void EJc(float f) {
        A00(this).resetCamera();
    }

    @Override // X.InterfaceC141866b4
    public final void EQR(float[] fArr) {
        A00(this).setBoundingBox(fArr);
    }

    @Override // X.InterfaceC141866b4
    public final void Eq7(float f, float f2, float f3) {
        A00(this).tiltUpdate(f, f2, f3);
    }
}
