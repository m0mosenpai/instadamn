package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Callable;

/* renamed from: X.9MV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9MV implements Callable {
    public static final Bitmap.CompressFormat A05 = Bitmap.CompressFormat.JPEG;
    public final Medium A00;
    public final Integer A01;
    public final ContentResolver A02;
    public final Context A03;
    public final UserSession A04;

    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C183978Ee call() {
        String str;
        C183978Ee c183978Ee;
        int pixel;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Medium medium = this.A00;
        BitmapFactory.decodeFile(medium.A0X, options);
        boolean A01 = AbstractC13570mj.A01(AbstractC166987dD.A11(medium.A0X));
        int i = options.outWidth;
        int i2 = options.outHeight;
        UserSession userSession = this.A04;
        Integer num = this.A01;
        C0f5 AEp = C18950wb.A01.AEp("PhotoImportCallable_call", 817892667);
        String str2 = options.outMimeType;
        if (str2 == null) {
            str2 = "null";
        }
        AEp.ABW("mime_type", str2);
        AEp.ABU(IgReactMediaPickerNativeModule.WIDTH, options.outWidth);
        AEp.ABU(IgReactMediaPickerNativeModule.HEIGHT, options.outHeight);
        AEp.ABW(CacheBehaviorLogger.SOURCE, C9MY.A00(num));
        AEp.report();
        if (medium.A0I == null) {
            medium.A0I = Boolean.valueOf(C9Ag.A00.A00(userSession, medium.A0X, medium.hashCode()));
        }
        if ("image/jpeg".equals(options.outMimeType) && !A01 && !C14360o3.A0K(medium.A03(), "image/png") && (!C18U.A06(C06090Tz.A05, userSession, 36322731695942072L) || (!C14360o3.A0K(medium.A03(), "image/webp") && !C14360o3.A0K(medium.A03(), "image/heic")))) {
            c183978Ee = new C183978Ee(medium, i, i2);
            c183978Ee.A07 = C197098ne.A01(c183978Ee.A06());
            c183978Ee.A0j = C197098ne.A06(c183978Ee.A06());
            if (C14360o3.A0K(ColorSpace.get(ColorSpace.Named.DISPLAY_P3), options.outColorSpace)) {
                c183978Ee.A01 = -1;
            }
            if (C05F.A00 == num) {
                c183978Ee.A19 = false;
            }
        } else {
            options.inJustDecodeBounds = false;
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(medium.A0X, options);
                str = "unknown";
                if (decodeFile != null) {
                    File A04 = AbstractC13530mf.A04(this.A03);
                    C14360o3.A07(A04);
                    OutputStream openOutputStream = this.A02.openOutputStream(android.net.Uri.fromFile(A04));
                    try {
                        if (openOutputStream != null) {
                            AbstractC50673MYr.A00(A05, decodeFile, openOutputStream);
                            decodeFile.recycle();
                            c183978Ee = new C183978Ee(C8IU.A02(medium, A04), i, i2);
                            c183978Ee.A07 = C197098ne.A01(medium.A0X);
                            c183978Ee.A0k = medium.A0X;
                            openOutputStream.close();
                        } else {
                            AbstractC226659zN.A00(options, medium, num, "null_output_stream");
                            throw new IOException("OutputStream is null");
                        }
                    } finally {
                    }
                }
            } catch (OutOfMemoryError unused) {
                str = "oom_decoding_image";
            }
            AbstractC226659zN.A00(options, medium, num, str);
            throw new IOException("bitmap is null");
        }
        c183978Ee.A01().A01(medium.A0G);
        c183978Ee.A01().A00(C9L8.A03(userSession, medium.A0X));
        if (c183978Ee.A0I == null) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(c183978Ee.A06(), options2);
            int i3 = options2.outHeight;
            int i4 = options2.outWidth;
            int i5 = 1;
            if (i3 > 4 || i4 > 4) {
                int i6 = i3 / 2;
                int i7 = i4 / 2;
                while (i6 / i5 >= 4 && i7 / i5 >= 4) {
                    i5 *= 2;
                }
            }
            options2.inSampleSize = i5;
            options2.inJustDecodeBounds = false;
            Bitmap decodeFile2 = BitmapFactory.decodeFile(c183978Ee.A06(), options2);
            int i8 = -16777216;
            if (decodeFile2 == null) {
                AbstractC12120kG.A07("PhotoImportCallable", "BitmapFactory.decodeFile() couldn't decode image data, gradient colors were not extracted", null);
                pixel = -16777216;
            } else {
                i8 = decodeFile2.getPixel(0, 0);
                pixel = decodeFile2.getPixel(decodeFile2.getWidth() - 1, decodeFile2.getHeight() - 1);
            }
            C18160v1 A012 = AbstractC14620oa.A01(new BackgroundGradientColors(i8, pixel), c183978Ee.A07);
            if (A012 != null) {
                c183978Ee.A0I = A012;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return c183978Ee;
    }

    public C9MV(ContentResolver contentResolver, Context context, Medium medium, UserSession userSession, Integer num) {
        AbstractC167017dG.A1R(contentResolver, medium);
        C14360o3.A0B(userSession, 5);
        this.A03 = context;
        this.A02 = contentResolver;
        this.A00 = medium;
        this.A01 = num;
        this.A04 = userSession;
    }
}
