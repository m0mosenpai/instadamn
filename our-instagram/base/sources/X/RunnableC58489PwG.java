package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.PwG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58489PwG implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ String A02;

    public RunnableC58489PwG(Bitmap bitmap, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, String str) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A00 = bitmap;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap = this.A00;
        String str = this.A02;
        if (!TextUtils.isEmpty(str)) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    C0fK.A01(compressFormat, bitmap, 100);
                    if (bitmap.compress(compressFormat, 100, fileOutputStream)) {
                        fileOutputStream.close();
                        return;
                    } else {
                        android.util.Log.wtf("ShortcutInfoCompatSaver", "Unable to compress bitmap");
                        throw new RuntimeException(AnonymousClass001.A0R("Unable to compress bitmap for saving ", str));
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                android.util.Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e);
                throw new RuntimeException(AnonymousClass001.A0R("Unable to write bitmap to file ", str), e);
            }
        }
        throw new IllegalArgumentException("path is empty");
    }
}
