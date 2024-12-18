package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.5FF, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5FF {
    public static Method A00;
    public static final Bitmap.Config A01 = Bitmap.Config.ARGB_8888;

    public void A01(Bitmap bitmap) {
    }

    public void A02(Bitmap bitmap, Bitmap bitmap2) {
        if (C1VM.A00 && bitmap.getConfig() == bitmap2.getConfig()) {
            try {
                Method method = A00;
                if (method == null) {
                    method = Class.forName("com.facebook.imagepipeline.nativecode.Bitmaps").getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
                    A00 = method;
                }
                method.invoke(null, bitmap, bitmap2);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
            }
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
        A01(bitmap);
    }

    public C1VO A00(Bitmap bitmap, AbstractC27691Vx abstractC27691Vx) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = A01;
        }
        C1VO A002 = abstractC27691Vx.A00(config, width, height);
        try {
            A02((Bitmap) A002.A04(), bitmap);
            C1VO A02 = A002.A02();
            A002.close();
            return A02;
        } catch (Throwable th) {
            C1VO.A01(A002);
            throw th;
        }
    }
}
