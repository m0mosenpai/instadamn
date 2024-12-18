package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: X.0fL, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fL {
    public static Bitmap A00(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2, options);
        C2RD c2rd = C2RD.A06;
        if (c2rd != null && decodeByteArray != null) {
            c2rd.A01(decodeByteArray);
        }
        return decodeByteArray;
    }
}
