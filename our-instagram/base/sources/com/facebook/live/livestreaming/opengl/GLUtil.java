package com.facebook.live.livestreaming.opengl;

import X.AbstractC25228BEl;
import X.AbstractC65702TsY;
import X.AnonymousClass001;
import X.C0K8;
import android.opengl.GLES20;
import android.opengl.Matrix;

/* loaded from: classes11.dex */
public abstract class GLUtil {
    public static final float[] A00;

    static {
        float[] fArr = new float[16];
        A00 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static void A01(int i, String str) {
        if (i >= 0) {
        } else {
            throw new RuntimeException(AnonymousClass001.A0g("Unable to locate '", str, "' in program"));
        }
    }

    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        A02(AnonymousClass001.A0O("glCreateShader type=", i));
        if (AbstractC65702TsY.A03(glCreateShader, str) == 0) {
            C0K8.A0O("com.facebook.live.livestreaming.opengl.GLUtil", "Could not compile shader %d:", AbstractC25228BEl.A1Y(i));
            C0K8.A0O("com.facebook.live.livestreaming.opengl.GLUtil", " %s", GLES20.glGetShaderInfoLog(glCreateShader));
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static void A02(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        C0K8.A0O("com.facebook.live.livestreaming.opengl.GLUtil", "%s: glError %d", AbstractC25228BEl.A1Z(str, glGetError));
        throw new RuntimeException(AnonymousClass001.A0b(str, ": glError ", glGetError));
    }
}
