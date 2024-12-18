package X;

import android.opengl.GLES10;

/* loaded from: classes4.dex */
public final class AjM implements InterfaceC197718oi {
    public int A00;
    public int A01 = -1;
    public int A02;
    public AnonymousClass810 A03;

    @Override // X.InterfaceC197718oi
    public final C197728oj B9M() {
        return null;
    }

    @Override // X.InterfaceC199658sH
    public final void cleanup() {
        GLES10.glDeleteTextures(1, new int[]{this.A01}, 0);
        this.A03 = null;
    }

    @Override // X.InterfaceC199658sH
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.InterfaceC197718oi
    public final AnonymousClass810 getTexture() {
        AnonymousClass810 anonymousClass810 = this.A03;
        if (anonymousClass810 == null) {
            AnonymousClass811 anonymousClass811 = new AnonymousClass811("ModifiableInputSurface");
            anonymousClass811.A01 = this.A01;
            anonymousClass811.A03 = 3553;
            AnonymousClass810 anonymousClass8102 = new AnonymousClass810(anonymousClass811);
            this.A03 = anonymousClass8102;
            return anonymousClass8102;
        }
        return anonymousClass810;
    }

    @Override // X.InterfaceC197718oi
    public final int getTextureId() {
        return this.A01;
    }

    @Override // X.InterfaceC199658sH
    public final int getWidth() {
        return this.A02;
    }
}
