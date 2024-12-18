package com.facebook.webpsupport;

import X.AbstractC166987dD;
import X.C05800Si;
import X.C0fL;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes10.dex */
public class WebpBitmapFactoryImpl {
    public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) {
        Bitmap bitmap = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                bitmap = hookDecodeStream(fileInputStream, null, options);
                fileInputStream.close();
                return bitmap;
            } finally {
            }
        } catch (Exception unused) {
            return bitmap;
        }
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }

    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, null);
    }

    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    public static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);

    public static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);

    public static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    public static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        if (options != null && (bitmap = options.inBitmap) != null && bitmap.isMutable()) {
            return options.inBitmap;
        }
        throw AbstractC166987dD.A15("jpegGenerator");
    }

    public static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        if (options != null && (bArr = options.inTempStorage) != null) {
            return bArr;
        }
        return new byte[8192];
    }

    public static float getScaleFromOptions(BitmapFactory.Options options) {
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        float f = i > 1 ? 1.0f / i : 1.0f;
        if (options.inScaled) {
            int i2 = options.inDensity;
            int i3 = options.inTargetDensity;
            int i4 = options.inScreenDensity;
            if (i2 != 0 && i3 != 0 && i2 != i4) {
                return i3 / i2;
            }
            return f;
        }
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r1 != 65535) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap hookDecodeResourceStream(android.content.res.Resources r2, android.util.TypedValue r3, java.io.InputStream r4, android.graphics.Rect r5, android.graphics.BitmapFactory.Options r6) {
        /*
            if (r6 != 0) goto L7
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options
            r6.<init>()
        L7:
            int r0 = r6.inDensity
            if (r0 != 0) goto L15
            if (r3 == 0) goto L15
            int r1 = r3.density
            if (r1 != 0) goto L28
            r1 = 160(0xa0, float:2.24E-43)
        L13:
            r6.inDensity = r1
        L15:
            int r0 = r6.inTargetDensity
            if (r0 != 0) goto L23
            if (r2 == 0) goto L23
            android.util.DisplayMetrics r0 = r2.getDisplayMetrics()
            int r0 = r0.densityDpi
            r6.inTargetDensity = r0
        L23:
            android.graphics.Bitmap r0 = hookDecodeStream(r4, r5, r6)
            return r0
        L28:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 == r0) goto L15
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeResourceStream(android.content.res.Resources, android.util.TypedValue, java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static void setBitmapSize(BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    public static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options != null && options.inJustDecodeBounds) {
            options.outWidth = i;
            options.outHeight = i2;
            return true;
        }
        return false;
    }

    public static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    public static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        C05800Si.A00();
        return C0fL.A00(bArr, i, i2, options);
    }

    public static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return C0fL.A00(bArr, i, i2, options);
    }

    public static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    public static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    public static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    public static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        C05800Si.A00();
        return C0fL.A00(bArr, i, i2, null);
    }

    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        byte[] bArr;
        C05800Si.A00();
        long nativeSeek = nativeSeek(fileDescriptor, 0L, false);
        if (nativeSeek != -1) {
            InputStream fileInputStream = new FileInputStream(fileDescriptor);
            if (!fileInputStream.markSupported()) {
                fileInputStream = new BufferedInputStream(fileInputStream, 20);
            }
            try {
                fileInputStream.mark(20);
                if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
                    bArr = new byte[20];
                }
                try {
                    fileInputStream.read(bArr, 0, 20);
                    fileInputStream.reset();
                } catch (IOException unused) {
                }
                nativeSeek(fileDescriptor, nativeSeek, true);
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
                try {
                    return decodeFileDescriptor;
                } catch (Throwable unused2) {
                    return decodeFileDescriptor;
                }
            } finally {
                try {
                    fileInputStream.close();
                } catch (Throwable unused3) {
                }
            }
        }
        Bitmap hookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
        setPaddingDefaultValues(rect);
        return hookDecodeStream;
    }

    public static Bitmap hookDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        TypedValue typedValue = new TypedValue();
        Bitmap bitmap = null;
        try {
            InputStream openRawResource = resources.openRawResource(i, typedValue);
            try {
                bitmap = hookDecodeResourceStream(resources, typedValue, openRawResource, null, options);
                if (openRawResource != null) {
                    openRawResource.close();
                }
            } finally {
            }
        } catch (Exception unused) {
        }
        if (bitmap == null && options != null && options.inBitmap != null) {
            throw AbstractC166987dD.A12("Problem decoding into existing bitmap");
        }
        return bitmap;
    }

    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        C05800Si.A00();
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 20);
        }
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    public static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    public static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    public static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    public static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }
}
