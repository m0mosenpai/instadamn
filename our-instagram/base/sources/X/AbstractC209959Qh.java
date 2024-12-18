package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.IOException;

/* renamed from: X.9Qh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209959Qh {
    public static final Bitmap A00(ContentResolver contentResolver, BitmapFactory.Options options, android.net.Uri uri, ParcelFileDescriptor parcelFileDescriptor, int i) {
        int i2;
        int i3;
        int i4;
        Bitmap bitmap = null;
        try {
            try {
                if (parcelFileDescriptor == null) {
                    if (uri != null) {
                        if (contentResolver != null) {
                            try {
                                parcelFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                            } catch (IOException unused) {
                                parcelFileDescriptor = null;
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                if (parcelFileDescriptor != null) {
                    FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    if (!options.mCancel && (i2 = options.outWidth) != -1 && (i3 = options.outHeight) != -1) {
                        double d = i2;
                        double d2 = i3;
                        int i5 = 1;
                        if (i != -1) {
                            i5 = (int) Math.ceil(Math.sqrt((d * d2) / i));
                        }
                        if (i5 <= 8) {
                            i4 = 1;
                            while (i4 < i5) {
                                i4 <<= 1;
                            }
                        } else {
                            i4 = ((i5 + 7) / 8) * 8;
                        }
                        options.inSampleSize = i4;
                        options.inJustDecodeBounds = false;
                        options.inDither = false;
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        bitmap = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    }
                }
            } catch (OutOfMemoryError e) {
                C0K8.A0F("Util", "Got oom exception ", e);
            }
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (Throwable unused2) {
                }
            }
            return bitmap;
        } catch (Throwable th) {
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (Throwable unused3) {
                }
            }
            throw th;
        }
    }

    public static final Bitmap A01(ContentResolver contentResolver, android.net.Uri uri, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        r3 = null;
        Bitmap bitmap = null;
        try {
            parcelFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPurgeable = true;
                options.inInputShareable = true;
                bitmap = A00(contentResolver, options, uri, parcelFileDescriptor, i);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
                parcelFileDescriptor2 = parcelFileDescriptor;
                if (parcelFileDescriptor2 != null) {
                    try {
                        parcelFileDescriptor2.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException unused3) {
            parcelFileDescriptor = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable unused4) {
            }
        }
        return bitmap;
    }
}
