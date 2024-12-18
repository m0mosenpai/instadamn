package X;

import android.opengl.GLES20;

/* loaded from: classes4.dex */
public final class AZ4 implements InterfaceC200678uA {
    public final C200688uB A00;

    @Override // X.InterfaceC200678uA
    public final void bind() {
        GLES20.glBindFramebuffer(36160, this.A00.A00);
    }

    @Override // X.InterfaceC200678uA
    public final int getHeight() {
        return this.A00.A01;
    }

    @Override // X.InterfaceC200678uA
    public final AnonymousClass810 getTexture() {
        return this.A00.A03;
    }

    @Override // X.InterfaceC200678uA
    public final int getWidth() {
        return this.A00.A02;
    }

    @Override // X.InterfaceC200678uA
    public final boolean is10Bit() {
        return this.A00.A04;
    }

    @Override // X.InterfaceC200678uA
    public final void release() {
        this.A00.A01();
    }

    public AZ4(int i, int i2, boolean z) {
        this.A00 = new C200688uB(i, i2, z);
    }

    @Override // X.InterfaceC200678uA
    public final void unbind() {
        GLES20.glBindFramebuffer(36160, 0);
    }
}
