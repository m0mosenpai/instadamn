package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import com.google.common.io.Closeables;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

/* renamed from: X.OaX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55077OaX {
    public static final C55077OaX A00 = new Object();

    public static final android.net.Uri A00(File file, String str) {
        try {
            FileOutputStream A0x = MSW.A0x(file);
            try {
                PrintWriter printWriter = new PrintWriter(A0x);
                if (str == null) {
                    str = "";
                }
                printWriter.print(str);
                printWriter.flush();
                return android.net.Uri.fromFile(file);
            } finally {
                Closeables.A00(A0x, false);
            }
        } catch (IOException e) {
            C0K8.A0F("FlyTrapUtil", "Unable to saveLogFile", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.graphics.Bitmap] */
    public final Object A01(Activity activity, AbstractC12990ll abstractC12990ll) {
        View rootView;
        Object obj;
        C14360o3.A0B(activity, 1);
        if (activity.isChild()) {
            activity = activity.getParent();
        }
        Handler handler = new Handler();
        if (activity != null && (rootView = AbstractC43592JPx.A08(activity).getRootView()) != null) {
            double A002 = C18U.A00(C06090Tz.A05, abstractC12990ll, 37168831663178215L);
            int width = rootView.getWidth();
            int height = rootView.getHeight();
            try {
                height = Bitmap.createBitmap((int) (width * A002), (int) (((double) height) * A002), Bitmap.Config.ARGB_8888);
                obj = height;
            } catch (OutOfMemoryError e) {
                C0K8.A0F("FlyTrapUtil", "Create bitmap OutOfMemoryError", e);
                float f = rootView.getResources().getDisplayMetrics().density;
                if (f >= 2.0f) {
                    float f2 = height;
                    if (f2 >= f) {
                        float f3 = width;
                        if (f3 >= f) {
                            try {
                                obj = Bitmap.createBitmap((int) (f3 / f), (int) (f2 / f), Bitmap.Config.ARGB_8888);
                            } catch (Exception e2) {
                                C0K8.A0F("FlyTrapUtil", "Create bitmap exception", e2);
                                obj = AbstractC50523MSb.A0d(new RuntimeException("Bitmap.createBitmap exception", e2));
                            } catch (OutOfMemoryError e3) {
                                C0K8.A0F("FlyTrapUtil", "OOM during downscaled bitmap creation", e3);
                                obj = AbstractC50523MSb.A0d(new RuntimeException("OOM Bitmap.createBitmap exception", e3));
                            }
                        }
                    }
                }
                obj = AbstractC50523MSb.A0d(AbstractC166987dD.A18("Invalid screen density for bitmap creation"));
            }
            if (!(obj instanceof C09540e5)) {
                Bitmap bitmap = (Bitmap) obj;
                C14360o3.A0B(bitmap, 1);
                if (activity.getWindow() != null) {
                    PixelCopy.request(activity.getWindow(), bitmap, PixelCopyOnPixelCopyFinishedListenerC55352OiE.A00, handler);
                }
            }
            return obj;
        }
        return AbstractC50523MSb.A0d(AbstractC166987dD.A18("Could not get root view for screenshot"));
    }

    public final Object A02(Bitmap bitmap, AbstractC12990ll abstractC12990ll, File file) {
        Bitmap.CompressFormat compressFormat;
        int i;
        C14360o3.A0B(abstractC12990ll, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, abstractC12990ll, 36324406733123739L)) {
            compressFormat = Bitmap.CompressFormat.JPEG;
            i = AbstractC25225BEi.A07(c06090Tz, abstractC12990ll, 36605881709892971L);
        } else {
            compressFormat = Bitmap.CompressFormat.PNG;
            i = 100;
        }
        try {
            FileOutputStream A0x = MSW.A0x(file);
            try {
                C0fK.A02(compressFormat, bitmap, A0x, i);
                A0x.flush();
                long length = file.length();
                Long valueOf = Long.valueOf(length);
                if (length > 512000) {
                    String format = String.format(Locale.US, "Flytrap screenshot larger than 500 KiB: %s, %d bytes", MSX.A1b(compressFormat.name(), valueOf, 2));
                    C14360o3.A07(format);
                    C0w9.A03("flytrap_screenshot_large", format);
                }
                return android.net.Uri.fromFile(file);
            } finally {
                Closeables.A00(A0x, false);
            }
        } catch (Exception e) {
            C0K8.A0F("FlyTrapUtil", "Couldn't save screenshot", e);
            return MSW.A1D(e);
        }
    }
}
