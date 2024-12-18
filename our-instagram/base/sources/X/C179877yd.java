package X;

import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

/* renamed from: X.7yd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179877yd {
    public final Resources A00;

    public static String A00(C179877yd c179877yd, int i) {
        InputStreamReader inputStreamReader = new InputStreamReader(c179877yd.A00.openRawResource(i));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                CharBuffer allocate = CharBuffer.allocate(C3OO.FLAG_MOVED);
                while (inputStreamReader.read(allocate) != -1) {
                    allocate.flip();
                    sb.append((CharSequence) allocate);
                    allocate.clear();
                }
                return sb.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    public final C81H A03(String str, String str2, boolean z) {
        String obj;
        if (!z) {
            String[] split = str2.split("\n");
            String str3 = split[0];
            if (str3.equals("#extension GL_OES_EGL_image_external : require")) {
                obj = str2.substring(str3.length() + 1);
            } else if (str3.equals("#version 300 es")) {
                if (split[2].equals("#extension GL_OES_EGL_image_external : require")) {
                    StringBuilder sb = new StringBuilder("");
                    for (int i = 0; i < split.length; i++) {
                        if (i != 2) {
                            sb.append(split[i]);
                            sb.append('\n');
                        }
                    }
                    obj = sb.toString();
                } else {
                    throw new IllegalStateException("Fragment shader's fourth line must be:\n#extension GL_OES_EGL_image_external : require");
                }
            } else {
                throw new IllegalStateException("Fragment shader's first line must be:\n#extension GL_OES_EGL_image_external : require");
            }
            str2 = obj.replaceFirst("samplerExternalOES", "sampler2D").replaceFirst("__samplerExternal2DY2YEXT", "sampler2D");
        }
        return new C81H(str, str2);
    }

    public C179877yd(Resources resources) {
        this.A00 = resources;
    }

    public final C81H A01(int i, int i2) {
        return new C81H(A00(this, i), A00(this, i2));
    }

    public final C81H A02(int i, int i2, boolean z) {
        return A03(A00(this, i), A00(this, i2), z);
    }
}
