package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.voltron.runtime.ModuleApkUtil$ModuleResolver;
import java.io.File;

/* renamed from: X.0gD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10000gD {
    public static boolean A01(Context context, String str) {
        String A00 = ModuleApkUtil$ModuleResolver.A00(context, str);
        if (A00 != null) {
            return new File(A00).exists();
        }
        return false;
    }

    public static File A00(Context context, String str) {
        String A00 = ModuleApkUtil$ModuleResolver.A00(context, str);
        if (A00 == null) {
            try {
                context = context.createPackageContext(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            A00 = ModuleApkUtil$ModuleResolver.A00(context, str);
            if (A00 == null) {
                return null;
            }
        }
        return new File(A00);
    }
}
