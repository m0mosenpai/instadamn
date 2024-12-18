package X;

import android.opengl.GLES20;
import com.instagram.common.session.UserSession;
import java.nio.FloatBuffer;

/* loaded from: classes4.dex */
public final class AKA {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public FloatBuffer A08;
    public final float[] A09 = {-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f};
    public final float[] A0A = {-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f};
    public final UserSession A0B;

    public AKA(UserSession userSession) {
        this.A0B = userSession;
    }

    public static final int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                android.util.Log.e("GradientBackgGLUtil", AnonymousClass001.A0I(AbstractC111324zv.A00(301), ':', i));
                android.util.Log.e("GradientBackgGLUtil", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                return 0;
            }
            return glCreateShader;
        }
        return glCreateShader;
    }

    public static final void A01(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String A07 = AnonymousClass001.A07(glGetError, "GL step error: ", str, AbstractC43591JPw.A00(227));
            C0f5 A00 = C18950wb.A00("GradientBackgGLUtil", 817892933, true);
            A00.ABW("error: ", A07);
            A00.report();
        }
    }
}
