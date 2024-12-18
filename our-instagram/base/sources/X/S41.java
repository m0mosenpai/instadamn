package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* loaded from: classes10.dex */
public abstract class S41 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Bitmap A00;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, AbstractC43591JPw.A00(1));
        Context context = ((C6FG) A03).A00;
        SUY.A00 = c6fq;
        C6FX A0s = AbstractC25225BEi.A0s();
        android.net.Uri uri = C63181Seg.A06.A00;
        String str = null;
        if (uri != null && (A00 = C63181Seg.A00(context, uri)) != null) {
            ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
            C0fK.A02(Bitmap.CompressFormat.JPEG, A00, A0U, 100);
            str = Base64.encodeToString(A0U.toByteArray(), 0);
        }
        SUY.A00(AbstractC25227BEk.A0f(A0s, str, 0), 40);
        return null;
    }
}
