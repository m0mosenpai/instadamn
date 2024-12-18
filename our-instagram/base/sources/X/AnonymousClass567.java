package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES10;
import android.opengl.GLES20;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: X.567, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass567 {
    public static Map A01;
    public static final List A02 = Arrays.asList("SM-N770F", "SM-A515F");
    public static C46h A00 = C4JK.A00;

    public static Map A00() {
        boolean z;
        boolean z2;
        int i = 0;
        EGLSurface eGLSurface = null;
        AnonymousClass568 anonymousClass568 = null;
        if (A02.contains(Build.MODEL)) {
            return new HashMap();
        }
        if (A01 == null) {
            A01 = new HashMap();
            try {
                if (((EGL10) EGLContext.getEGL()).eglGetCurrentContext().equals(EGL10.EGL_NO_CONTEXT)) {
                    anonymousClass568 = new AnonymousClass568();
                    eGLSurface = anonymousClass568.A00();
                    if (EGL14.eglMakeCurrent(anonymousClass568.A02, eGLSurface, eGLSurface, anonymousClass568.A01)) {
                        z = true;
                    } else {
                        throw new RuntimeException("eglMakeCurrent failed");
                    }
                } else {
                    z = false;
                }
                int[] iArr = new int[1];
                GLES20.glGetIntegerv(34466, iArr, 0);
                int i2 = iArr[0];
                int[] iArr2 = new int[i2];
                GLES20.glGetIntegerv(34467, iArr2, 0);
                while (true) {
                    if (i < i2) {
                        if (iArr2[i] != 37496) {
                            i++;
                        } else {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    A01.put("etc2_compression", true);
                }
                if (GLES10.glGetString(7939).contains("GL_IMG_texture_compression_pvrtc")) {
                    A01.put("pvr_compression", true);
                }
                if (z) {
                    EGLDisplay eGLDisplay = anonymousClass568.A02;
                    EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT)) {
                        EGL14.eglDestroySurface(anonymousClass568.A02, eGLSurface);
                        anonymousClass568.A01();
                    } else {
                        throw new RuntimeException("eglMakeCurrent failed");
                    }
                }
            } catch (Throwable th) {
                android.util.Log.e("SDKInfo", "Error while checking for capabilities", th);
            }
        }
        return A01;
    }
}
