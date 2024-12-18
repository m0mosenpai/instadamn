package X;

import android.opengl.GLES20;

/* renamed from: X.VsT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69626VsT {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;

    public final void A00(float[] fArr, float[] fArr2, float f, float f2, float f3, int i, boolean z) {
        int i2 = this.A00;
        GLES20.glActiveTexture(33984 + i2);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.A03, i2);
        GLES20.glUniformMatrix4fv(this.A06, 1, false, fArr, 0);
        WFK.A02("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.A01, 1, false, fArr2, 0);
        WFK.A02("glUniformMatrix4fv");
        GLES20.glUniform2f(this.A05, f, f2);
        WFK.A02("glUniform2f");
        GLES20.glUniform1f(this.A02, f3);
        WFK.A02("glUniform1f");
        int i3 = this.A04;
        float f4 = 0.0f;
        if (z) {
            f4 = 1.0f;
        }
        GLES20.glUniform1f(i3, f4);
        WFK.A02("glUniform1f");
    }

    public C69626VsT(int i, int i2) {
        this.A00 = i;
        this.A03 = GLES20.glGetUniformLocation(i2, AnonymousClass001.A0O("uTexture", i));
        int glGetUniformLocation = GLES20.glGetUniformLocation(i2, AnonymousClass001.A0O("uTextureTransformMatrix", i));
        this.A06 = glGetUniformLocation;
        this.A01 = GLES20.glGetUniformLocation(i2, AnonymousClass001.A0O("uContentTransformMatrix", i));
        WFK.A01(glGetUniformLocation, AnonymousClass001.A0O("uTextureTransformMatrix", i));
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(i2, AnonymousClass001.A0O("uTextureSize", i));
        this.A05 = glGetUniformLocation2;
        WFK.A01(glGetUniformLocation2, AnonymousClass001.A0O("uTextureSize", i));
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(i2, AnonymousClass001.A0O("uCornerRadius", i));
        this.A02 = glGetUniformLocation3;
        WFK.A01(glGetUniformLocation3, AnonymousClass001.A0O("uCornerRadius", i));
        int glGetUniformLocation4 = GLES20.glGetUniformLocation(i2, AnonymousClass001.A0O("uTextureEnabled", i));
        this.A04 = glGetUniformLocation4;
        WFK.A01(glGetUniformLocation4, AnonymousClass001.A0O("uTextureEnabled", i));
    }
}
