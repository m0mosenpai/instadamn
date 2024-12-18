package X;

import android.content.SharedPreferences;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;
import org.webrtc.EglBase10Impl;

/* loaded from: classes12.dex */
public abstract class Y6R {
    public static Integer A00(PackageManager packageManager, String str) {
        if (packageManager == null) {
            return -1;
        }
        for (FeatureInfo featureInfo : packageManager.getSystemAvailableFeatures()) {
            if (str.equals(featureInfo.name)) {
                return Integer.valueOf(featureInfo.version);
            }
        }
        return -1;
    }

    public static void A05(SharedPreferences sharedPreferences) {
        String str;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
        EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("opengles_renderer", GLES20.glGetString(7937));
        edit.putString("opengles_vendor", GLES20.glGetString(7936));
        String glGetString = GLES20.glGetString(7938);
        edit.putString("opengles_version", glGetString);
        int[] iArr2 = new int[2];
        GLES20.glGetIntegerv(3379, iArr2, 0);
        edit.putInt("opengles_max_texture_size_pixels", iArr2[0]);
        GLES20.glGetIntegerv(34930, iArr2, 0);
        edit.putInt("opengles_max_image_texture_units", iArr2[0]);
        GLES20.glGetIntegerv(35660, iArr2, 0);
        edit.putInt("opengles_max_vertex_texture_image_units", iArr2[0]);
        GLES20.glGetIntegerv(35661, iArr2, 0);
        edit.putInt("opengles_max_combined_texture_image_units", iArr2[0]);
        if (glGetString != null) {
            if (glGetString.split(" ").length > 2 && Float.parseFloat(r1[2]) >= 3.2d) {
                GLES20.glGetIntegerv(35881, iArr2, 0);
                edit.putInt("opengles_max_geometry_texture_image_units", iArr2[0]);
            }
        }
        GLES20.glGetIntegerv(34076, iArr2, 0);
        edit.putInt("opengles_max_cube_map_texture_size", iArr2[0]);
        GLES20.glGetIntegerv(34024, iArr2, 0);
        edit.putInt("opengles_max_renderbuffer_size", iArr2[0]);
        GLES20.glGetIntegerv(3386, iArr2, 0);
        edit.putInt("opengles_max_viewport_width", iArr2[0]);
        edit.putInt("opengles_max_viewport_height", iArr2[1]);
        String glGetString2 = GLES20.glGetString(7939);
        if (glGetString2 != null && !glGetString2.isEmpty()) {
            String[] split = glGetString2.split("\\s+");
            Arrays.sort(split);
            str = AbstractC53671NoM.A00(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, split);
        } else {
            str = "";
        }
        edit.putString("opengles_extensions", str);
        edit.commit();
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
        EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
        EGL14.eglTerminate(eglGetDisplay);
    }

    public static String A01(SharedPreferences sharedPreferences, C72719Xlr c72719Xlr) {
        String str = c72719Xlr.A01;
        String string = sharedPreferences.getString(str, "com.facebook.devicesegmentation.GET_FAILED");
        if (string != null && !string.equals("com.facebook.devicesegmentation.GET_FAILED")) {
            return string;
        }
        A05(sharedPreferences);
        String string2 = sharedPreferences.getString(str, "com.facebook.devicesegmentation.GET_FAILED");
        if (string2 == null) {
            return "com.facebook.devicesegmentation.GET_FAILED";
        }
        return string2;
    }

    public static String A02(PackageManager packageManager) {
        if (Build.VERSION.SDK_INT < 31) {
            return "";
        }
        return A04(packageManager, "android.software.opengles.deqp.level");
    }

    public static String A03(PackageManager packageManager) {
        if (Build.VERSION.SDK_INT < 30) {
            return "";
        }
        return A04(packageManager, "android.software.vulkan.deqp.level");
    }

    public static String A04(PackageManager packageManager, String str) {
        int intValue = A00(packageManager, str).intValue();
        if (intValue == -1) {
            return "";
        }
        int i = intValue & 255;
        int i2 = (intValue >> 8) & 255;
        int i3 = (intValue >> 16) & 65535;
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        sb.append('-');
        sb.append(i2);
        sb.append('-');
        sb.append(i);
        return sb.toString();
    }
}
