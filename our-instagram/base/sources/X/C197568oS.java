package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.util.DisplayMetrics;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.instagram.common.session.UserSession;
import com.instagram.util.jpeg.JpegBridge;
import com.instagram.util.jpeg.NativeImage;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: X.8oS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197568oS {
    public static int A00 = -1;
    public static boolean A01;

    static {
        DisplayMetrics A0I = AbstractC13880nE.A0I(AbstractC12290kX.A00);
        if (Math.min(A0I.widthPixels, A0I.heightPixels) <= 320) {
            A00 = 1024;
        }
    }

    public static NativeImage A01(NativeImage nativeImage) {
        int i = nativeImage.width;
        int i2 = nativeImage.height;
        int i3 = A00;
        if (i3 == -1) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(3379, iArr, 0);
            i3 = Math.min(iArr[0], 8192);
            A00 = i3;
        }
        int i4 = 128;
        boolean z = false;
        float f = i2;
        float f2 = i;
        int i5 = i2;
        if (i >= i2) {
            z = true;
            f = f2;
            f2 = f;
            i5 = i;
            i = i2;
        }
        if (i < 128) {
            i5 = (int) (((128.0f * f) / f2) + 0.5f);
        } else {
            i4 = i;
        }
        if (i5 > i3) {
            i4 = (int) (((i3 * f2) / f) + 0.5f);
            i5 = i3;
        }
        int i6 = i5;
        if (!z) {
            i6 = i4;
            i4 = i5;
        }
        Point point = new Point(i6, i4);
        int i7 = point.x;
        int i8 = nativeImage.width;
        if (i7 == i8 && point.y == nativeImage.height) {
            return nativeImage;
        }
        C0w9.A03("JpegHelper", AnonymousClass001.A10("Scaling texture: ", "x", " --> ", "x", i8, nativeImage.height, i7, point.y));
        NativeImage scaleImage = JpegBridge.scaleImage(nativeImage, point.x, point.y, 12);
        JpegBridge.releaseNativeBuffer(nativeImage.bufferId);
        return scaleImage;
    }

    public static synchronized void A02(Context context, UserSession userSession) {
        synchronized (C197568oS.class) {
            if (!A01) {
                AjJ ajJ = new AjJ(context, userSession);
                ajJ.Ehf(new C55003OVg());
                if (A00 == -1) {
                    int[] iArr = new int[1];
                    GLES20.glGetIntegerv(3379, iArr, 0);
                    A00 = Math.min(iArr[0], 8192);
                }
                ajJ.AP2();
                A01 = true;
            }
        }
    }

    public static NativeImage A00(Rect rect, C197348o5 c197348o5, String str) {
        int i;
        int i2;
        String lowerCase = str.toLowerCase();
        int hashCode = str.hashCode();
        if (c197348o5 != null) {
            c197348o5.A00.markerStart(17633132, hashCode);
        }
        if (!lowerCase.endsWith(".jpg") && !lowerCase.endsWith(".jpeg")) {
            String A002 = AbstractC13570mj.A00(str);
            if (!"image/jpeg".equals(A002)) {
                C0K8.A0O("JpegHelper", "Could not load non-JPEG file %s", str);
                if (c197348o5 != null) {
                    if (A002 == null) {
                        A002 = "unknown";
                    }
                    c197348o5.A02(hashCode, "non-JPEG file", A002);
                    c197348o5.A00();
                }
                throw new IOException(AnonymousClass001.A0R("JpegHelper: Abort loading non-jpg file: ", str));
            }
        }
        if (JpegBridge.A01()) {
            if (c197348o5 != null) {
                try {
                    c197348o5.A01(hashCode, "decodeJpeg start");
                } catch (UnsatisfiedLinkError e) {
                    if (c197348o5 != null) {
                        c197348o5.A02(hashCode, "UnsatisfiedLinkError", "");
                        c197348o5.A00();
                    }
                    C0K8.A0G("JpegHelper", "UnsatisfiedLinkError", e);
                }
            }
            NativeImage A003 = JpegBridge.A00(rect, str);
            if (A003 == null) {
                if (c197348o5 != null) {
                    c197348o5.A01(hashCode, "decodeJpeg failed");
                    c197348o5.A00();
                }
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str, options);
                    i = options.outWidth;
                    try {
                        i2 = options.outHeight;
                    } catch (Exception unused) {
                        C0w9.A03(AnonymousClass001.A0R("JpegHelper", "_decode_image"), AnonymousClass001.A0R("Error decoding image: ", str));
                        i2 = 0;
                        throw new IOException(AnonymousClass001.A0R("JpegHelper: Could not load file: ", String.format(Locale.US, "%dx%d, size=%d KB, path=%s", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(new File(str).length() / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED), str)));
                    }
                } catch (Exception unused2) {
                    i = 0;
                }
                throw new IOException(AnonymousClass001.A0R("JpegHelper: Could not load file: ", String.format(Locale.US, "%dx%d, size=%d KB, path=%s", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(new File(str).length() / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED), str)));
            }
            if (c197348o5 != null) {
                c197348o5.A01(hashCode, "decodeJpeg end");
                c197348o5.A02(hashCode, "decodeJpeg", AnonymousClass001.A02(A003.width, A003.height, "end w: ", " h: "));
                c197348o5.A01(hashCode, "scaleImage start");
            }
            NativeImage A012 = A01(A003);
            if (c197348o5 != null) {
                c197348o5.A01(hashCode, "scaleImage end");
                c197348o5.A02(hashCode, "scaleImage", AnonymousClass001.A02(A012.width, A012.height, "end w: ", " h: "));
                c197348o5.A00.markerEnd(17633132, (short) 2);
                return A012;
            }
            return A012;
        }
        if (c197348o5 != null) {
            c197348o5.A01(hashCode, "decodeJpeg failed load library");
            c197348o5.A00();
        }
        return null;
    }
}
