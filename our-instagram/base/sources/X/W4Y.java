package X;

import com.facebook.gltf.jni.GltfRenderSession;
import com.facebook.gltf.jni.Photo3DCameraControl;

/* loaded from: classes11.dex */
public final class W4Y {
    public int A00;
    public int A01;
    public C68865VdL A02;
    public boolean A03;
    public boolean A04;
    public final C149366nm A05;

    public W4Y(C149366nm c149366nm) {
        C14360o3.A0B(c149366nm, 2);
        this.A05 = c149366nm;
    }

    public static final void A00(W4Y w4y) {
        float cameraZ;
        int i;
        C68865VdL c68865VdL = w4y.A02;
        if (w4y.A04 && c68865VdL != null) {
            InterfaceC141866b4 interfaceC141866b4 = w4y.A05.A00;
            float[] boundingBox = ((GltfRenderSession) c68865VdL.A00.getValue()).getBoundingBox();
            C14360o3.A07(boundingBox);
            interfaceC141866b4.EQR(boundingBox);
            if (interfaceC141866b4 instanceof C73484YFj) {
                C73484YFj c73484YFj = (C73484YFj) interfaceC141866b4;
                InterfaceC09390do interfaceC09390do = c68865VdL.A00;
                float extrasHFov = ((GltfRenderSession) interfaceC09390do.getValue()).getExtrasHFov();
                float extrasVFov = ((GltfRenderSession) interfaceC09390do.getValue()).getExtrasVFov();
                float tan = (float) Math.tan(extrasHFov / 2.0f);
                float tan2 = (float) Math.tan(extrasVFov / 2.0f);
                if (tan2 > 0.0f && (i = w4y.A00) > 0) {
                    float f = tan / tan2;
                    float f2 = w4y.A01 / i;
                    if (f < f2) {
                        extrasVFov = ((float) Math.atan(tan / f2)) * 2.0f;
                    } else if (f > f2) {
                        extrasHFov = ((float) Math.atan(tan2 * f2)) * 2.0f;
                    }
                }
                ((Photo3DCameraControl) c73484YFj.A00.getValue()).setHVFov(extrasHFov, extrasVFov);
            }
            if (w4y.A03) {
                cameraZ = 3.0f;
            } else {
                cameraZ = ((GltfRenderSession) c68865VdL.A00.getValue()).getCameraZ();
            }
            interfaceC141866b4.EJc(cameraZ);
        }
    }

    public final void A01() {
        C68865VdL c68865VdL = this.A02;
        if (c68865VdL != null) {
            ((GltfRenderSession) c68865VdL.A00.getValue()).release();
            this.A02 = null;
        }
    }
}
