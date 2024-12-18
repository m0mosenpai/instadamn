package X;

import android.opengl.GLES20;

/* renamed from: X.8u9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200668u9 implements InterfaceC200678uA {
    public final C200688uB A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass810 A03;
    public final boolean A04;

    @Override // X.InterfaceC200678uA
    public final void bind() {
        GLES20.glBindFramebuffer(36160, this.A00.A00);
    }

    @Override // X.InterfaceC200678uA
    public final int getHeight() {
        return this.A01;
    }

    @Override // X.InterfaceC200678uA
    public final AnonymousClass810 getTexture() {
        return this.A03;
    }

    @Override // X.InterfaceC200678uA
    public final int getWidth() {
        return this.A02;
    }

    @Override // X.InterfaceC200678uA
    public final boolean is10Bit() {
        return this.A04;
    }

    @Override // X.InterfaceC200678uA
    public final void release() {
        this.A00.A01();
    }

    public C200668u9(int i, int i2, boolean z) {
        C200688uB c200688uB = new C200688uB(i, i2, z);
        this.A00 = c200688uB;
        this.A02 = c200688uB.A02;
        this.A01 = c200688uB.A01;
        this.A04 = c200688uB.A04;
        AnonymousClass810 anonymousClass810 = c200688uB.A03;
        C14360o3.A06(anonymousClass810);
        this.A03 = anonymousClass810;
    }

    @Override // X.InterfaceC200678uA
    public final void unbind() {
        GLES20.glBindFramebuffer(36160, 0);
    }
}
