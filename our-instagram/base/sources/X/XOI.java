package X;

import android.opengl.GLES20;

/* loaded from: classes12.dex */
public final class XOI implements InterfaceC197718oi, YRL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass810 A04;

    @Override // X.InterfaceC197718oi
    public final C197728oj B9M() {
        return null;
    }

    @Override // X.YRL
    public final void CGW(C72783Xn3 c72783Xn3) {
        C14360o3.A0B(c72783Xn3, 0);
        c72783Xn3.A02 = 0;
        c72783Xn3.A03 = 0;
        c72783Xn3.A01 = this.A03;
        c72783Xn3.A00 = this.A01;
    }

    @Override // X.InterfaceC199658sH
    public final void cleanup() {
        GLES20.glDeleteFramebuffers(1, new int[]{this.A00}, 0);
        GLES20.glDeleteTextures(1, new int[]{this.A02}, 0);
        this.A04 = null;
    }

    @Override // X.YRL
    public final void EcX(int i, int i2) {
        throw AbstractC166987dD.A1D("setRenderDimensions() is not supported for FramebufferTexture");
    }

    @Override // X.InterfaceC197718oi
    public final AnonymousClass810 getTexture() {
        AnonymousClass810 anonymousClass810 = this.A04;
        if (anonymousClass810 == null) {
            AnonymousClass811 anonymousClass811 = new AnonymousClass811("FramebufferTexture");
            anonymousClass811.A01 = this.A02;
            anonymousClass811.A03 = 3553;
            anonymousClass811.A00 = 6408;
            AnonymousClass810 anonymousClass8102 = new AnonymousClass810(anonymousClass811);
            this.A04 = anonymousClass8102;
            return anonymousClass8102;
        }
        return anonymousClass810;
    }

    public XOI(int i, int i2) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = -1;
        this.A00 = -1;
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.A00 = iArr[0];
        this.A02 = C209089Mq.A00();
        GLES20.glTexImage2D(3553, 0, 6408, this.A03, this.A01, 0, 6408, 5121, null);
        GLES20.glBindFramebuffer(36160, this.A00);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.A02, 0);
        GLES20.glViewport(0, 0, this.A03, this.A01);
    }

    @Override // X.YRL
    public final int B8d() {
        return this.A00;
    }

    @Override // X.YRL
    public final int Bmd() {
        return this.A01;
    }

    @Override // X.YRL
    public final int Bmj() {
        return this.A03;
    }

    @Override // X.InterfaceC199658sH
    public final int getHeight() {
        return this.A01;
    }

    @Override // X.InterfaceC197718oi
    public final int getTextureId() {
        return this.A02;
    }

    @Override // X.InterfaceC199658sH
    public final int getWidth() {
        return this.A03;
    }
}
