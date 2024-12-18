package com.facebook.common.dextricks;

import android.content.Context;
import com.facebook.common.dextricks.classifier.NameClassifier;
import com.facebook.common.dextricks.fallback.FallbackDexLoader;
import dalvik.system.BaseDexClassLoader;

/* loaded from: classes.dex */
public abstract class ReflectionClassLoader extends ClassLoader {
    public static final ClassLoader APP_CLASSLOADER;
    public static final String TAG = "ReflectionClassLoader";
    public static volatile ClassLoader sInstalledClassLoader;
    public final ClassLoader mPutativeLoader = APP_CLASSLOADER;

    static {
        try {
            APP_CLASSLOADER = ReflectionClassLoader.class.getClassLoader();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ClassLoader createReflectionClassLoader() {
        return new ReflectionClassLoader();
    }

    public static synchronized ClassLoader install(Context context) {
        ClassLoader reflectionClassLoader;
        synchronized (ReflectionClassLoader.class) {
            if (sInstalledClassLoader != null) {
                reflectionClassLoader = sInstalledClassLoader;
            } else {
                try {
                    reflectionClassLoader = new ReflectionClassLoader();
                    if (Achilles.addTosharedLibraryLoadersAfter((BaseDexClassLoader) APP_CLASSLOADER, reflectionClassLoader)) {
                        Mlog.w("ReflectionClassLoader Successfully set reflection on sharedLibraryLoadersAfter?", new Object[0]);
                        sInstalledClassLoader = reflectionClassLoader;
                    } else {
                        throw new RuntimeException("ReflectionClassLoaderFailed to set reflection");
                    }
                } catch (Exception e) {
                    Mlog.w("ReflectionClassLoader Failed to set reflection on sharedLibraryLoadersAfter", e);
                    throw new RuntimeException("ReflectionClassLoader Failed to set reflection ", e);
                }
            }
        }
        return reflectionClassLoader;
    }

    public static final boolean maybeFallbackLoadDexes(String str) {
        FallbackDexLoader fallbackDexLoader = FallbackDexLoader.A00;
        if (fallbackDexLoader == null) {
            return false;
        }
        String str2 = null;
        if (NameClassifier.A01(MultiDexClassLoaderJava.sEncodedLongtailUnrenamedTypes, str)) {
            str2 = "longtail";
        }
        return fallbackDexLoader.A02(str, str2, new ClassNotFoundException(str));
    }

    public void addDexPathFromConfig(ClassLoaderConfiguration classLoaderConfiguration) {
        classLoaderConfiguration.addDexFileToClassLoaderPath((BaseDexClassLoader) this.mPutativeLoader);
    }
}
