package X;

import android.opengl.GLES20;

/* renamed from: X.VJx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68260VJx {
    public int A00;

    public final int A00(String str) {
        int i = this.A00;
        if (i != -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
            if (glGetUniformLocation >= 0) {
                return glGetUniformLocation;
            }
            throw new RuntimeException(AnonymousClass001.A0g("Could not locate uniform '", str, "' in program"));
        }
        throw new RuntimeException("The program has been released");
    }
}
