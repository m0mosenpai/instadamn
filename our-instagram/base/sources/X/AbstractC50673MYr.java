package X;

import android.graphics.Bitmap;
import java.io.OutputStream;

/* renamed from: X.MYr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50673MYr {
    public static final boolean A00(Bitmap.CompressFormat compressFormat, Bitmap bitmap, OutputStream outputStream) {
        AbstractC167017dG.A1N(bitmap, compressFormat);
        C0fK.A01(compressFormat, bitmap, 100);
        return bitmap.compress(compressFormat, 100, outputStream);
    }
}
