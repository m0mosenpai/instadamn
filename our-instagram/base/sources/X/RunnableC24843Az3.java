package X;

import android.view.TextureView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;

/* renamed from: X.Az3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24843Az3 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C50643MXf A02;
    public final /* synthetic */ boolean A03;

    public RunnableC24843Az3(C50643MXf c50643MXf, int i, int i2, boolean z) {
        this.A02 = c50643MXf;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C09530e4 c09530e4;
        float f;
        C50643MXf c50643MXf = this.A02;
        TextureView textureView = c50643MXf.A07;
        if (textureView != null) {
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) c50643MXf.A0S).A0K;
            int width = interfaceC1812882f.getWidth();
            int height = interfaceC1812882f.getHeight();
            int i = this.A01;
            int i2 = this.A00;
            boolean z = this.A03;
            C09530e4 A00 = AbstractC226849zg.A00(textureView, width, height, i, i2, z, C50643MXf.A0D(c50643MXf));
            if (C50643MXf.A0D(c50643MXf)) {
                float f2 = i;
                float f3 = i2;
                float width2 = interfaceC1812882f.getWidth();
                float height2 = interfaceC1812882f.getHeight();
                boolean z2 = false;
                if (f2 / f3 <= 0.5625f) {
                    z2 = true;
                }
                if (z && !z2) {
                    f = height2 / f3;
                } else {
                    f = width2 / f2;
                }
                float f4 = (f2 / width2) * f;
                float f5 = (f3 / height2) * f;
                float max = Math.max(f4, f5);
                c09530e4 = AbstractC166987dD.A1L(Float.valueOf(f4 / max), Float.valueOf(f5 / max));
            } else {
                Float valueOf = Float.valueOf(1.0f);
                c09530e4 = new C09530e4(valueOf, valueOf);
            }
            C8JS c8js = c50643MXf.A0b;
            c8js.A01(i, i2, interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight());
            float A09 = AbstractC166987dD.A09(A00.A00);
            float A092 = AbstractC166987dD.A09(A00.A01);
            float A093 = AbstractC166987dD.A09(c09530e4.A00);
            float A094 = AbstractC166987dD.A09(c09530e4.A01);
            c8js.A00 = A09;
            c8js.A01 = A092;
            c8js.A02 = A09;
            c8js.A03 = A092;
            c8js.A04 = A093;
            c8js.A05 = A094;
            c8js.A0C = z;
            C9TN c9tn = c50643MXf.A0C;
            if (c9tn != null) {
                c9tn.A01();
            }
        }
    }
}
