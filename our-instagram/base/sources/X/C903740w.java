package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import com.facebook.R;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.ui.blur.BlurUtil;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.40w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C903740w {
    public final int A00;
    public final Context A01;
    public final C1O2 A02;
    public final ImageCacheKey A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C903740w(Context context, C1O2 c1o2, ImageCacheKey imageCacheKey, String str, String str2, int i, boolean z) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c1o2, 2);
        C14360o3.A0B(imageCacheKey, 3);
        C14360o3.A0B(str, 4);
        C14360o3.A0B(str2, 6);
        this.A01 = context;
        this.A02 = c1o2;
        this.A03 = imageCacheKey;
        this.A04 = str;
        this.A00 = i;
        this.A05 = str2;
        this.A06 = z;
    }

    public final C61332qv A00() {
        int length;
        Bitmap bitmap;
        String str;
        C25761Ni c25761Ni = this.A02.A04.A0K;
        ImageCacheKey imageCacheKey = this.A03;
        C61292qr A03 = c25761Ni.A03(imageCacheKey, -1.0f, 1);
        if (A03 != null) {
            return new C61332qv(A03.A02, A03.A04);
        }
        try {
            synchronized (C903740w.class) {
                Context context = this.A01;
                String str2 = this.A04;
                synchronized (this) {
                    try {
                        if (AbstractC903840x.A00 == null) {
                            AbstractC903840x.A00 = new byte[C3OO.FLAG_MOVED];
                            InputStream inputStream = null;
                            try {
                                try {
                                    inputStream = context.getResources().openRawResource(R.raw.header);
                                    inputStream.read(AbstractC903840x.A00, 0, 607);
                                    inputStream.close();
                                } catch (IOException e) {
                                    C0w9.A07("mini_preview_image_loader", e);
                                    throw e;
                                }
                            } catch (Throwable th) {
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        }
                        try {
                            byte[] decode = Base64.decode(str2, 0);
                            byte[] bArr = AbstractC903840x.A00;
                            if (bArr != null) {
                                bArr[162] = decode[1];
                                bArr[160] = decode[2];
                                length = decode.length - 3;
                                System.arraycopy(decode, 3, bArr, 607, length);
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                String str3 = imageCacheKey.A03;
                byte[] bArr2 = AbstractC903840x.A00;
                if (bArr2 != null) {
                    C61292qr A01 = c25761Ni.A01(null, str3, null, this.A05, "mini_preview", bArr2, null, 1, length + 607, -1, false);
                    if (A01 != null) {
                        bitmap = A01.A02;
                        str = A01.A04;
                    } else {
                        bitmap = null;
                        str = null;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            if (bitmap == null) {
                bitmap = null;
            } else {
                if (C20150ym.A07(AbstractC20100yh.A00(36326270748931889L))) {
                    bitmap = C0fK.A00(bitmap, bitmap.getWidth() * 2, bitmap.getHeight() * 2, false);
                    bitmap.getWidth();
                    bitmap.getHeight();
                    bitmap.getAllocationByteCount();
                }
                BlurUtil.blurInPlace(bitmap, this.A00);
            }
            return new C61332qv(bitmap, str);
        } catch (IOException unused) {
            return null;
        }
    }
}
