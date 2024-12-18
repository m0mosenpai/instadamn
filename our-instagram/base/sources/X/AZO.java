package X;

import android.opengl.Matrix;

/* loaded from: classes4.dex */
public final class AZO implements InterfaceC1809480w {
    public final C179457xv A00 = new Object();
    public final /* synthetic */ C9RG A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7xv, java.lang.Object] */
    public AZO(C9RG c9rg) {
        this.A01 = c9rg;
    }

    public final void A00(InterfaceC197718oi interfaceC197718oi) {
        if (interfaceC197718oi != null) {
            C179407xq c179407xq = new C179407xq();
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            System.arraycopy(fArr, 0, c179407xq.A03, 0, 16);
            System.arraycopy(fArr, 0, c179407xq.A02, 0, 16);
            int width = interfaceC197718oi.getWidth();
            int height = interfaceC197718oi.getHeight();
            c179407xq.A01 = width;
            c179407xq.A00 = height;
            C179457xv c179457xv = this.A00;
            c179457xv.A05 = c179407xq;
            c179457xv.A04 = interfaceC197718oi.getTexture();
        }
    }

    @Override // X.InterfaceC1809480w
    public final /* bridge */ /* synthetic */ Object BHx() {
        C9RG.A00(this.A01);
        return this.A00;
    }
}
