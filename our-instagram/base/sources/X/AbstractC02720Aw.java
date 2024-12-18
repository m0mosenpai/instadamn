package X;

import android.content.Context;
import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.File;

/* renamed from: X.0Aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC02720Aw {
    public final Context A00;
    public final ClassLoader A01;

    public AbstractC02720Aw(Context context, boolean z) {
        ClassLoader pathClassLoader;
        this.A00 = context;
        File file = new File("/system/framework/services.jar");
        ClassLoader classLoader = null;
        if (file.exists()) {
            try {
                if (file.canRead()) {
                    try {
                        pathClassLoader = new PathClassLoader("/system/framework/services.jar", null);
                    } catch (Throwable unused) {
                        pathClassLoader = new PathClassLoader("/system/framework/services.jar", getClass().getClassLoader());
                    }
                    try {
                        pathClassLoader.loadClass("com.android.server.am.ActivityManagerService");
                    } catch (Throwable unused2) {
                        if (z) {
                            File file2 = new File(this.A00.getCacheDir(), "temp_service_jar_dex");
                            if (!file2.exists()) {
                                file2.mkdir();
                            }
                            pathClassLoader = new DexClassLoader("/system/framework/services.jar", file2.getCanonicalPath(), null, AbstractC02720Aw.class.getClassLoader());
                            pathClassLoader.loadClass("com.android.server.am.ActivityManagerService");
                        }
                    }
                    classLoader = pathClassLoader;
                }
            } catch (Throwable unused3) {
            }
        }
        this.A01 = classLoader;
    }
}
