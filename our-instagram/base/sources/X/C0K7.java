package X;

import android.content.Context;
import com.facebook.common.build.BuildConstants;
import java.io.File;

/* renamed from: X.0K7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0K7 {
    public static volatile Boolean A00;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0di, java.lang.Object] */
    public static boolean A02(Context context) {
        if (A00 == null) {
            ?? obj = new Object();
            obj.A00 = context;
            boolean z = true;
            if (AbstractC05790Sg.A00(obj, "mdcd_multiprocess_enable", 0) != 1) {
                z = false;
            }
            A00 = Boolean.valueOf(z);
        }
        return A00.booleanValue();
    }

    public static File A00(Context context) {
        File file = new File(A01(context), AnonymousClass001.A0c("v", "/", BuildConstants.A01()));
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    public static File A01(Context context) {
        File cacheDir = context.getCacheDir();
        C14360o3.A0B(cacheDir, 0);
        if (AbstractC46802Ct.A00 && C14360o3.A0K(cacheDir.getName(), "browser_proc")) {
            cacheDir = cacheDir.getParentFile();
        }
        return new File(cacheDir, "ClassTraces/");
    }
}
