package X;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A0U {
    public static final void A00(Bitmap bitmap, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i) {
        Bitmap.CompressFormat compressFormat;
        AbstractC167017dG.A1R(interfaceC16660sJ, interfaceC16820sZ);
        try {
            File createTempFile = File.createTempFile(AnonymousClass001.A0O("avatar_sticker_", i), ".webp", AbstractC23881Ey.A00().AXd(null, 1814181387));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(createTempFile.getCanonicalPath()));
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    compressFormat = Bitmap.CompressFormat.WEBP_LOSSLESS;
                } else {
                    compressFormat = Bitmap.CompressFormat.WEBP;
                }
                C0fK.A02(compressFormat, bitmap, bufferedOutputStream, 100);
                bufferedOutputStream.close();
                String canonicalPath = createTempFile.getCanonicalPath();
                C14360o3.A07(canonicalPath);
                interfaceC16660sJ.invoke(canonicalPath);
            } finally {
            }
        } catch (IOException unused) {
            interfaceC16820sZ.invoke();
        }
    }
}
