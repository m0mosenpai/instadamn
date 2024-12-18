package X;

import android.opengl.EGL14;
import android.opengl.GLES20;
import com.facebook.react.views.textinput.ReactTextInputManager;

/* renamed from: X.7zD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC180237zD {
    public static String A00(String str, String str2, int i) {
        return String.format(null, "%s: GL error 0x%04x %s occurred, see logcat output", str, Integer.valueOf(i), str2);
    }

    public static void A02(String str, Object... objArr) {
        boolean z = false;
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            z = true;
            i = glGetError;
        }
        if (!z) {
            return;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 1280:
                throw new C80D(1280, A00(format, "GL_INVALID_ENUM", i));
            case 1281:
                throw new C80D(1281, A00(format, "GL_INVALID_VALUE", i));
            case 1282:
                throw new C80D(1282, A00(format, "GL_INVALID_OPERATION", i));
            case 1283:
            case 1284:
            default:
                throw new C80D(i, A00(format, "UNKNOWN", i));
            case 1285:
                throw new C80D(1285, A00(format, "GL_OUT_OF_MEMORY", i));
            case 1286:
                throw new C80D(1286, A00(format, "GL_INVALID_FRAMEBUFFER_OPERATION", i));
        }
    }

    public static void A01(String str) {
        boolean z = false;
        int i = 12288;
        while (true) {
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            z = true;
            i = eglGetError;
        }
        if (!z) {
            return;
        }
        switch (i) {
            case 12289:
                throw new C80D(12289, A00(str, "EGL_NOT_INITIALIZED", i));
            case ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED /* 12290 */:
                throw new C80D(ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED, A00(str, "EGL_BAD_ACCESS", i));
            case 12291:
                throw new C80D(12291, A00(str, "EGL_BAD_ALLOC", i));
            case 12292:
                throw new C80D(12292, A00(str, "EGL_BAD_ATTRIBUTE", i));
            case 12293:
                throw new C80D(12293, A00(str, "EGL_BAD_CONFIG", i));
            case 12294:
                throw new C80D(12294, A00(str, "EGL_BAD_CONTEXT", i));
            case 12295:
                throw new C80D(12295, A00(str, "EGL_BAD_CURRENT_SURFACE", i));
            case 12296:
                throw new C80D(12296, A00(str, "EGL_BAD_DISPLAY", i));
            case 12297:
                throw new C80D(12297, A00(str, "EGL_BAD_MATCH", i));
            case 12298:
                throw new C80D(12298, A00(str, "EGL_BAD_NATIVE_PIXMAP", i));
            case 12299:
                throw new C80D(12299, A00(str, "EGL_BAD_NATIVE_WINDOW", i));
            case 12300:
                throw new C80D(12300, A00(str, "EGL_BAD_PARAMETER", i));
            case 12301:
                throw new C80D(12301, A00(str, "EGL_BAD_SURFACE", i));
            case 12302:
                throw new C80D(12302, A00(str, "EGL_CONTEXT_LOST", i));
            default:
                throw new C80D(i, A00(str, "UNKNOWN", i));
        }
    }
}
