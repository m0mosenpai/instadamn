package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.1NC, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1NC {
    public static Method A00;
    public static boolean A01;
    public static boolean A02;
    public static final RectF A03 = new RectF();
    public static final RectF A04 = new RectF();

    public static int A00(String str) {
        try {
            int A0M = new C60782q2(str).A0M("Orientation", 1);
            if (A0M != 3) {
                if (A0M != 6) {
                    return A0M == 8 ? 270 : 0;
                }
                return 90;
            }
            return 180;
        } catch (IOException unused) {
            C0w9.A03("BitmapUtil", AnonymousClass001.A0R("Failed to load exif orientation for ", str));
            return 0;
        }
    }

    public static Bitmap A03(Bitmap.Config config, String str, int i, int i2, int i3, int i4) {
        int A012;
        if (A01) {
            A012 = A01(str, i3, i4);
        } else {
            A012 = A01(str, i, i2);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = Math.max(A012, 1);
        options.inPreferredConfig = config;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        if (decodeFile == null) {
            return null;
        }
        return A09(decodeFile, i3, i4, 0, false);
    }

    public static Bitmap A04(Bitmap bitmap) {
        if (A00 == null && !A02) {
            try {
                A02 = true;
                A00 = Class.forName("android.graphics.Bitmap").getMethod("createAshmemBitmap", new Class[0]);
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                C0K8.A0J("BitmapUtil", "failed to reflect on android.graphics.Bitmap#createAshmemBitmap", e);
            }
        }
        Method method = A00;
        boolean z = false;
        if (method != null) {
            z = true;
        }
        if (z) {
            try {
                Bitmap bitmap2 = (Bitmap) method.invoke(bitmap, new Object[0]);
                C2RD c2rd = C2RD.A06;
                if (c2rd != null && bitmap2 != null) {
                    c2rd.A01(bitmap2);
                }
                return bitmap2;
            } catch (IllegalAccessException | InvocationTargetException e2) {
                C0K8.A0F("BitmapUtil", "failed to invoke android.graphics.Bitmap#createAshmemBitmap", e2);
            }
        }
        return bitmap;
    }

    public static Bitmap A07(Bitmap bitmap, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        if (createBitmap == null) {
            return null;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setShader(bitmapShader);
        paint.setAntiAlias(true);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        canvas.restore();
        return createBitmap;
    }

    public static Bitmap A08(Bitmap bitmap, int i, int i2) {
        if (bitmap != null) {
            if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                bitmap.eraseColor(0);
                return bitmap;
            }
            bitmap.recycle();
        }
        return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }

    public static Bitmap A0B(Bitmap bitmap, int i, int i2, boolean z) {
        if (bitmap != null) {
            float f = i;
            float f2 = i2;
            float max = Math.max(Math.min(f / bitmap.getWidth(), f2 / bitmap.getHeight()), Math.min(f2 / bitmap.getWidth(), f / bitmap.getHeight()));
            if (max < 1.0f) {
                int round = Math.round(bitmap.getWidth() * max);
                int round2 = Math.round(bitmap.getHeight() * max);
                if (round == 0) {
                    round = 1;
                }
                if (round2 == 0) {
                    round2 = 1;
                }
                Bitmap A002 = C0fK.A00(bitmap, round, round2, true);
                if (A002 != bitmap && z) {
                    bitmap.recycle();
                }
                return A002;
            }
        }
        return bitmap;
    }

    public static Bitmap A0C(Bitmap bitmap, RectF rectF, int i, int i2) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, new RectF(0.0f, 0.0f, i, i2), Matrix.ScaleToFit.CENTER);
        Bitmap.Config config = bitmap.getConfig();
        config.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(3));
        return createBitmap;
    }

    public static Bitmap A0E(String str, int i, int i2) {
        StringBuilder sb;
        if (str != null && !str.isEmpty()) {
            if (i != 0 && i2 != 0) {
                int A012 = A01(str, i, i2);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = Math.max(A012, 1);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                if (decodeFile != null) {
                    return A0B(decodeFile, i, i2, true);
                }
            } else {
                sb = new StringBuilder();
                sb.append("Illegal bitmap size ");
                sb.append(str);
                sb.append("width ");
                sb.append(i);
                sb.append(" height ");
                sb.append(i2);
                C0w9.A03("BitmapUtil", sb.toString());
                return null;
            }
        }
        sb = new StringBuilder();
        sb.append("Failed to decode bitmap at ");
        sb.append(str);
        C0w9.A03("BitmapUtil", sb.toString());
        return null;
    }

    public static Bitmap A0G(String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        Bitmap A032 = A03(Bitmap.Config.ARGB_8888, str, i, i2, i3, i4);
        if (A032 == null || (i5 == 0 && !z)) {
            return A032;
        }
        Matrix matrix = new Matrix();
        if (z) {
            if (i5 % 180 == 0) {
                matrix.postScale(-1.0f, 1.0f);
            } else {
                matrix.postScale(1.0f, -1.0f);
            }
        }
        matrix.postRotate(i5);
        int width = A032.getWidth();
        int height = A032.getHeight();
        C0fK.A03(A032);
        Bitmap createBitmap = Bitmap.createBitmap(A032, 0, 0, width, height, matrix, true);
        A032.recycle();
        return createBitmap;
    }

    public static Rect A0H(String str) {
        Rect rect = new Rect();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        rect.right = options.outWidth;
        rect.bottom = options.outHeight;
        return rect;
    }

    public static void A0I(Matrix matrix, float f, float f2, float f3, int i, int i2, int i3, int i4, int i5) {
        float f4;
        float f5 = f;
        A0J(matrix, i, i2, i3, i4, i5, false);
        RectF rectF = A03;
        RectF rectF2 = A04;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        rectF2.set(0.0f, 0.0f, i, i2);
        matrix.mapRect(rectF, rectF2);
        float width = rectF.width();
        float height = rectF.height();
        float f6 = height / 2.0f;
        float f7 = i3 / 2.0f;
        float f8 = i4 / 2.0f;
        float f9 = width * f;
        float f10 = height * f2;
        if (f9 >= width / 2.0f) {
            f9 = width - f9;
        }
        float f11 = f7 / f9;
        if (f11 > f3) {
            float f12 = (f7 / f3) / width;
            if (f5 > 0.5d) {
                f5 = 1.0f - f12;
            } else {
                f5 = f12;
            }
            f11 = f3;
        }
        if (f10 >= f6) {
            f10 = height - f10;
        }
        float f13 = f8 / f10;
        if (f13 > f3) {
            float f14 = (f8 / f3) / height;
            if (f2 > 0.5d) {
                f4 = 1.0f - f14;
            } else {
                f4 = f14;
            }
            f13 = f3;
        } else {
            f4 = f2;
        }
        matrix.postTranslate(-(rectF.width() * (f5 - 0.5f)), -(rectF.height() * (f4 - 0.5f)));
        float max = Math.max(f11, f13);
        matrix.postScale(max, max, f7, f8);
    }

    public static void A0J(Matrix matrix, int i, int i2, int i3, int i4, int i5, boolean z) {
        RectF rectF = A03;
        RectF rectF2 = A04;
        rectF.set(0.0f, 0.0f, i, i2);
        int i6 = i5 % 360;
        if (i6 != 0) {
            matrix.setRotate(i5);
            matrix.mapRect(rectF);
        }
        int i7 = i2;
        if (i5 % 180 != 90) {
            i7 = i;
            i = i2;
        }
        float f = i3;
        if (i7 * i4 > i * i3) {
            rectF2.set(-100000.0f, 0.0f, 100000.0f + f, i4);
        } else {
            rectF2.set(0.0f, -100000.0f, f, i4 + 100000.0f);
        }
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        if (i6 != 0) {
            matrix.preRotate(i5);
        }
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
            matrix.postTranslate(f, 0.0f);
        }
    }

    public static boolean A0K(Context context, Bitmap.CompressFormat compressFormat, Bitmap bitmap, File file) {
        boolean A0L = A0L(compressFormat, bitmap, file, 100);
        if (A0L) {
            MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, null, null);
        }
        return A0L;
    }

    public static boolean A0M(Bitmap bitmap, File file) {
        return A0L(Bitmap.CompressFormat.JPEG, bitmap, file, 100);
    }

    public static int A01(String str, int i, int i2) {
        Rect A0H = A0H(str);
        return Math.min(Math.max(A0H.width() / i, A0H.height() / i2), Math.max(A0H.width() / i2, A0H.height() / i));
    }

    public static Bitmap A02(Context context, android.net.Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            openInputStream.getClass();
            return BitmapFactory.decodeStream(openInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public static Bitmap A05(Bitmap bitmap) {
        return A07(bitmap, bitmap.getWidth(), bitmap.getHeight());
    }

    public static Bitmap A06(Bitmap bitmap) {
        Rect rect;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == height) {
            return bitmap;
        }
        int min = Math.min(width, height);
        if (width > height) {
            int i = (width - height) / 2;
            rect = new Rect(i, 0, min + i, min);
        } else {
            int i2 = (height - width) / 2;
            rect = new Rect(0, i2, min, min + i2);
        }
        Rect rect2 = new Rect(0, 0, min, min);
        Bitmap.Config config = bitmap.getConfig();
        config.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
        new Canvas(createBitmap).drawBitmap(bitmap, rect, rect2, (Paint) null);
        return createBitmap;
    }

    public static Bitmap A09(Bitmap bitmap, int i, int i2, int i3, boolean z) {
        Bitmap.Config config = bitmap.getConfig();
        config.getClass();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        A0J(matrix, width, height, i, i2, i3, z);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(3));
        return createBitmap;
    }

    public static Bitmap A0A(Bitmap bitmap, int i, int i2, boolean z) {
        if (bitmap.isRecycled()) {
            C0w9.A03("BitmapUtil", "bitmap passed for downsampling is already recycled");
        } else {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i3 = 1;
            while (true) {
                int i4 = i3 * 2;
                if (width / i4 <= i || height / i4 <= i2) {
                    break;
                }
                i3 = i4;
            }
            if (i3 > 1) {
                Bitmap A002 = C0fK.A00(bitmap, width / i3, height / i3, true);
                if (A002 != bitmap && z) {
                    bitmap.recycle();
                }
                return A002;
            }
        }
        return bitmap;
    }

    public static Bitmap A0D(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bitmap A0F(String str, int i, int i2, int i3) {
        Bitmap A0E = A0E(str, i, i2);
        if (A0E == null) {
            C0w9.A03("BitmapUtil", AnonymousClass001.A0R("Failed to decode bitmap at ", str));
            return null;
        }
        if (i3 % 360 == 0) {
            return A0E;
        }
        Matrix matrix = new Matrix();
        if (i3 != 0) {
            matrix.postRotate(i3);
        }
        int width = A0E.getWidth();
        int height = A0E.getHeight();
        C0fK.A03(A0E);
        Bitmap createBitmap = Bitmap.createBitmap(A0E, 0, 0, width, height, matrix, true);
        A0E.recycle();
        return createBitmap;
    }

    public static boolean A0L(Bitmap.CompressFormat compressFormat, Bitmap bitmap, File file, int i) {
        File parentFile = file.getParentFile();
        if (parentFile == null || (!parentFile.exists() && !parentFile.mkdirs())) {
            return false;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                C0fK.A02(compressFormat, bitmap, fileOutputStream, i);
                fileOutputStream.close();
                return true;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }
}
