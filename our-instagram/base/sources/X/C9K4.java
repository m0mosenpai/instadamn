package X;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: X.9K4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9K4 {
    public final /* synthetic */ C81H A00;

    public C9K4(C81H c81h) {
        this.A00 = c81h;
    }

    public static int A00(C9K4 c9k4, String str) {
        C81H c81h = c9k4.A00;
        Map map = c81h.A04;
        if (map.containsKey(str)) {
            return ((Number) map.get(str)).intValue();
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(c81h.A00, str);
        if (glGetUniformLocation != -1) {
            map.put(str, Integer.valueOf(glGetUniformLocation));
            return glGetUniformLocation;
        }
        throw new IllegalStateException(String.format(null, "Uniform location not found: %s", str));
    }

    public final void A01(C180337zN c180337zN) {
        int glGetAttribLocation;
        C81H c81h = this.A00;
        Map map = c180337zN.A03;
        List list = c180337zN.A02;
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            Map map2 = c81h.A05;
            if (map2.containsKey(str)) {
                glGetAttribLocation = ((Number) map2.get(str)).intValue();
            } else {
                glGetAttribLocation = GLES20.glGetAttribLocation(c81h.A00, str);
                if (glGetAttribLocation != -1) {
                    map2.put(str, Integer.valueOf(glGetAttribLocation));
                } else {
                    throw new IllegalStateException(String.format(null, "Vertex attribute location not found: %s", str));
                }
            }
            if (glGetAttribLocation != -1) {
                C180327zM c180327zM = (C180327zM) map.get(str);
                FloatBuffer floatBuffer = c180327zM.A01;
                int position = floatBuffer.position();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glVertexAttribPointer(glGetAttribLocation, c180327zM.A00, 5126, false, 0, floatBuffer.position(position));
                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                floatBuffer.position(position);
            }
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void A03(String str, AnonymousClass810 anonymousClass810) {
        int size;
        Map map = this.A00.A03;
        if (map.containsKey(str)) {
            size = ((Number) map.get(str)).intValue();
        } else {
            size = map.size();
            map.put(str, Integer.valueOf(size));
        }
        int i = anonymousClass810.A01;
        int i2 = anonymousClass810.A00;
        AbstractC180237zD.A02(AnonymousClass001.A0p("gl.Program::setTexture::before: textureUnit: ", " textureTarget: ", " textureHandle: ", size, i, i2), new Object[0]);
        int A00 = A00(this, str);
        GLES20.glActiveTexture(33984 + size);
        GLES20.glBindTexture(i, i2);
        GLES20.glUniform1i(A00, size);
        AbstractC180237zD.A02(AnonymousClass001.A0p("gl.Program::setTexture::after: textureUnit: ", " textureTarget: ", " textureHandle: ", size, i, i2), new Object[0]);
    }

    public final void A02(String str, float f) {
        GLES20.glUniform1f(A00(this, str), f);
    }

    public final void A04(String str, float[] fArr) {
        GLES20.glUniformMatrix4fv(A00(this, str), 1, false, fArr, 0);
    }
}
