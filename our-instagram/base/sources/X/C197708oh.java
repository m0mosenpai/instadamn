package X;

import android.opengl.GLES10;

/* renamed from: X.8oh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197708oh implements InterfaceC197718oi {
    public AnonymousClass810 A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C197728oj A05;

    @Override // X.InterfaceC199658sH
    public final void cleanup() {
        GLES10.glDeleteTextures(1, new int[]{this.A02}, 0);
        C197728oj c197728oj = this.A05;
        if (c197728oj != null) {
            c197728oj.cleanup();
        }
    }

    public C197708oh(C197728oj c197728oj, int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A01 = i4;
        this.A05 = c197728oj;
    }

    @Override // X.InterfaceC197718oi
    public final C197728oj B9M() {
        return this.A05;
    }

    @Override // X.InterfaceC199658sH
    public final int getHeight() {
        return this.A01;
    }

    @Override // X.InterfaceC197718oi
    public final AnonymousClass810 getTexture() {
        AnonymousClass810 anonymousClass810 = this.A00;
        if (anonymousClass810 == null) {
            AnonymousClass811 anonymousClass811 = new AnonymousClass811("InputSurface");
            anonymousClass811.A01 = this.A02;
            anonymousClass811.A03 = this.A03;
            anonymousClass811.A00 = 6408;
            anonymousClass811.A04 = this.A04;
            anonymousClass811.A02 = this.A01;
            AnonymousClass810 anonymousClass8102 = new AnonymousClass810(anonymousClass811);
            this.A00 = anonymousClass8102;
            return anonymousClass8102;
        }
        return anonymousClass810;
    }

    @Override // X.InterfaceC197718oi
    public final int getTextureId() {
        return this.A02;
    }

    @Override // X.InterfaceC199658sH
    public final int getWidth() {
        return this.A04;
    }
}
