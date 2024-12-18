package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* loaded from: classes10.dex */
public abstract class S42 {
    public static Object A00(C6FQ c6fq) {
        String obj;
        C6FX A0s;
        Bitmap A00;
        Context context = C6BQ.A09(c6fq).A00;
        SUY.A00 = c6fq;
        C63181Seg c63181Seg = C63181Seg.A06;
        if (c63181Seg.A04) {
            A0s = AbstractC25225BEi.A0s();
            android.net.Uri uri = c63181Seg.A01;
            if (uri == null) {
                uri = c63181Seg.A00;
            }
            obj = null;
            if (uri != null && (A00 = C63181Seg.A00(context, uri)) != null) {
                ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
                C0fK.A02(Bitmap.CompressFormat.JPEG, A00, A0U, 100);
                obj = Base64.encodeToString(A0U.toByteArray(), 0);
            }
        } else {
            android.net.Uri uri2 = c63181Seg.A01;
            if (uri2 == null && (uri2 = c63181Seg.A00) == null) {
                obj = null;
            } else {
                C6BS c6bs = C6BS.A02;
                obj = C6BX.A00(uri2).toString();
            }
            A0s = AbstractC25225BEi.A0s();
        }
        A0s.A01(obj);
        SUY.A00(A0s.A00(), 36);
        return null;
    }
}
