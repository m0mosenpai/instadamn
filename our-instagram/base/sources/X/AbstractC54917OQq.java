package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import com.facebook.common.callercontext.CallerContext;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: X.OQq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54917OQq {
    public static final String A01(Context context, Bitmap bitmap, String str) {
        File A0w = MSW.A0w(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), "meta_ai_imagine");
        if (!A0w.exists()) {
            A0w.mkdir();
        }
        File[] listFiles = A0w.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        File A0w2 = MSW.A0w(A0w, AnonymousClass001.A0g("meta_ai_imagine_", str, ".jpg"));
        if (bitmap.isRecycled()) {
            return null;
        }
        FileOutputStream A0x = MSW.A0x(A0w2);
        C0fK.A02(Bitmap.CompressFormat.JPEG, bitmap, A0x, 100);
        A0x.flush();
        A0x.close();
        return android.net.Uri.fromFile(A0w2).toString();
    }

    public static final Object A00(Context context, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        C27651Vs A01 = C59232nO.A01();
        C2nP A02 = A01.A02(AbstractC166997dE.A0M(context), null, C6BY.A01(str), false);
        C24891Jo A0s = JQ0.A0s(interfaceC23621Ds);
        A01.A01(A02, CallerContext.A01("ImagineNetworkService")).A06(new C25977BeR(A0s, i), C1M8.A01);
        return A0s.A0E();
    }
}
