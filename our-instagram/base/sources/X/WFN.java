package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Pair;
import com.facebook.msys.mci.PSNRCalculator;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class WFN {
    public final C68681VaH A00;

    public static Bitmap A01(Bitmap bitmap, int i) {
        int i2 = i % 360;
        if (i2 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i2);
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            C0fK.A03(bitmap);
            return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private double[] A02(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap != null && bitmap2 != null) {
            try {
                Bitmap A00 = C0fK.A00(bitmap2, bitmap.getWidth(), bitmap.getHeight(), true);
                if (A00 == null) {
                    return new double[]{-1.0d, -1.0d, -1.0d};
                }
                double[] computePSNRNative = PSNRCalculator.computePSNRNative(bitmap, A00);
                if (computePSNRNative == null) {
                    return new double[]{-1.0d, -1.0d, -1.0d};
                }
                return computePSNRNative;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return new double[]{-1.0d, -1.0d, -1.0d};
    }

    public final C70111W4i A03(C69272Vkg c69272Vkg, ByteArrayOutputStream byteArrayOutputStream, String str, int i, int i2) {
        Integer valueOf;
        Integer valueOf2;
        int A00;
        int A002;
        int i3 = i;
        int i4 = i2;
        long length = new File(str).length();
        byteArrayOutputStream.reset();
        try {
            try {
                int A003 = AbstractC61797Rtr.A00(str);
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(str);
                    boolean z = c69272Vkg.A02;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str, options);
                    float f = i3;
                    float f2 = i4;
                    options.inSampleSize = Math.min(Math.round(Math.max(options.outWidth / f, options.outHeight / f2)), 4);
                    options.inJustDecodeBounds = false;
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(str, options);
                    if (decodeFile2 != null) {
                        decodeFile2.getWidth();
                        decodeFile2.getHeight();
                        if (decodeFile != null) {
                            decodeFile = A01(decodeFile, A003);
                        }
                        int i5 = A003 % 360;
                        if (i5 != 0) {
                            float min = Math.min(Math.min(f / decodeFile2.getWidth(), f2 / decodeFile2.getHeight()), 1.0f);
                            Matrix matrix = new Matrix();
                            matrix.postScale(min, min);
                            matrix.postRotate(i5);
                            int width = decodeFile2.getWidth();
                            int height = decodeFile2.getHeight();
                            C0fK.A03(decodeFile2);
                            decodeFile2 = Bitmap.createBitmap(decodeFile2, 0, 0, width, height, matrix, true);
                        }
                        int width2 = decodeFile2.getWidth();
                        int height2 = decodeFile2.getHeight();
                        if (height2 <= i4 && width2 <= i3) {
                            valueOf = Integer.valueOf(width2);
                            valueOf2 = Integer.valueOf(height2);
                        } else {
                            int i6 = i * height2;
                            int i7 = i2 * width2;
                            if (i6 < i7) {
                                i4 = i6 / width2;
                            } else {
                                i3 = i7 / height2;
                            }
                            valueOf = Integer.valueOf(i3);
                            valueOf2 = Integer.valueOf(i4);
                        }
                        Pair create = Pair.create(valueOf, valueOf2);
                        int intValue = ((Number) create.first).intValue();
                        int intValue2 = ((Number) create.second).intValue();
                        if (width2 <= intValue && height2 <= intValue2) {
                            if (z) {
                                A002 = Math.max(A00(true, height2, width2), 45);
                            } else {
                                A002 = A00(false, height2, width2);
                            }
                            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                            C0fK.A01(compressFormat, decodeFile2, A002);
                            if (!decodeFile2.compress(compressFormat, A002, byteArrayOutputStream)) {
                                byteArrayOutputStream.size();
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            double[] A02 = A02(decodeFile, BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
                            return new C70111W4i(null, C05F.A0C, byteArrayOutputStream.toByteArray(), A02[0], width2, height2, A003, width2, height2, A002, length, byteArrayOutputStream.size());
                        }
                        try {
                            Bitmap A004 = C0fK.A00(decodeFile2, intValue, intValue2, true);
                            if (A004 == null) {
                                C0K8.A0C("BitmapImageTranscoder", "transcodeImageHelper: bitmap scaling returned null");
                                return C70111W4i.A00(new RuntimeException("transcodeImageHelper: bitmap scaling returned null"));
                            }
                            if (z) {
                                A00 = Math.max(A00(true, height2, width2), 45);
                            } else {
                                A00 = A00(false, height2, width2);
                            }
                            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.JPEG;
                            C0fK.A01(compressFormat2, A004, A00);
                            if (!A004.compress(compressFormat2, A00, byteArrayOutputStream)) {
                                byteArrayOutputStream.size();
                            }
                            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                            double[] A022 = A02(decodeFile, BitmapFactory.decodeByteArray(byteArray2, 0, byteArray2.length));
                            return new C70111W4i(null, C05F.A00, byteArrayOutputStream.toByteArray(), A022[0], width2, height2, A003, intValue, intValue2, A00, length, byteArrayOutputStream.size());
                        } catch (IllegalArgumentException e) {
                            C0K8.A0F("BitmapImageTranscoder", "transcodeImageHelper: invalid dimensions passed to bitmap scaling - ", e);
                            e = new IllegalArgumentException("transcodeImageHelper: invalid dimensions passed to bitmap scaling", e);
                        }
                    } else {
                        e = new RuntimeException("BitmapImageTranscoder: Unable to decode into a bitmap");
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IOException e3) {
                throw e3;
            }
        } catch (IOException e4) {
            e = e4;
        }
        return C70111W4i.A00(e);
    }

    static {
        C53882dS.A00();
    }

    public WFN(C68681VaH c68681VaH) {
        this.A00 = c68681VaH;
    }

    public static int A00(Boolean bool, int i, int i2) {
        int max = Math.max(i, i2);
        int i3 = 1080;
        if (bool.booleanValue()) {
            i3 = 4032;
        }
        if (max <= 320) {
            return 85;
        }
        if (max >= i3) {
            return 45;
        }
        return (int) Math.max(Math.min((((-40.0d) / (i3 - 320)) * (max - i3)) + 45.0d, 85.0d), 45.0d);
    }
}
