package com.facebook.common.dextricks;

import X.AbstractC04290Kv;
import X.AnonymousClass001;
import X.C0LK;
import X.C0PX;
import X.C10850hu;
import X.InterfaceC08830cm;
import android.content.Context;
import android.os.Build;
import android.os.SystemProperties;
import android.util.Log;
import com.facebook.common.dextricks.classifier.NameClassifier;
import com.facebook.common.dextricks.fallback.FallbackDexLoader;
import dalvik.system.DexFile;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class MultiDexClassLoader extends ClassLoader implements DexFileAccessLoggingClassLoader, ColdStartAwareClassLoader {
    public static final ClassLoader APP_CLASSLOADER;
    public static final int BASE_DEX_RETRY_WAIT_MS = 500;
    public static final Field CLASSLOADER_PARENT_FIELD;
    public static final Object INSTALL_LOCK = new Object();
    public static final int MAX_LOAD_DEX_RETRY = 3;
    public static final ClassLoader SYSTEM_CLASSLOADER;
    public static final String TAG = "MultiDexClassLoader";
    public static final boolean USE_DALVIK_NATIVE_LOADER = true;
    public static boolean sHadFancyLoaderFailure;
    public static volatile ClassLoader sInstalledClassLoader;
    public DexFileAccessListener dexFileAccessListener;
    public ClassLoaderConfiguration mConfig;
    public final ClassLoader mPutativeLoader;
    public DexFile[] subscribedDexFiles;

    public static boolean isArt() {
        return true;
    }

    public static boolean isNativeHookUseable() {
        return false;
    }

    public abstract void configure(ClassLoaderConfiguration classLoaderConfiguration);

    public abstract DexFile[] doGetConfiguredDexFiles();

    public String[] getRecentFailedClasses() {
        return new String[0];
    }

    @Override // com.facebook.common.dextricks.ColdStartAwareClassLoader
    public void onColdstartDone() {
    }

    public String verboseDescription() {
        return TAG;
    }

    static {
        try {
            ClassLoader classLoader = MultiDexClassLoader.class.getClassLoader();
            APP_CLASSLOADER = classLoader;
            Field declaredField = ClassLoader.class.getDeclaredField("parent");
            CLASSLOADER_PARENT_FIELD = declaredField;
            declaredField.setAccessible(true);
            SYSTEM_CLASSLOADER = (ClassLoader) declaredField.get(classLoader);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MultiDexClassLoader() {
        super(SYSTEM_CLASSLOADER);
        this.dexFileAccessListener = null;
        this.subscribedDexFiles = null;
        this.mPutativeLoader = APP_CLASSLOADER;
    }

    public static boolean classInLongtailModule(String str) {
        if (sInstalledClassLoader instanceof MultiDexClassLoaderJava) {
            return NameClassifier.A01(MultiDexClassLoaderJava.sEncodedLongtailUnrenamedTypes, str);
        }
        return false;
    }

    public static ClassLoader createMultiDexClassLoader(Context context, ArrayList arrayList, ArrayList arrayList2) {
        SystemProperties.get("com.facebook.force_mdclj");
        return new MultiDexClassLoaderJava(context, arrayList, arrayList2);
    }

    public static void forceLoadProfiloIfPresent() {
        try {
            Class.forName("com.facebook.profilo.logger.api.ProfiloClassLoadTracer");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static ClassLoader get() {
        return sInstalledClassLoader;
    }

    public static ClassLoaderConfiguration getConfiguration() {
        ClassLoader classLoader = sInstalledClassLoader;
        if (!(classLoader instanceof MultiDexClassLoader)) {
            return null;
        }
        return ((MultiDexClassLoader) classLoader).mConfig;
    }

    public static DexFile[] getConfiguredDexFiles() {
        ClassLoader classLoader = sInstalledClassLoader;
        if (!(classLoader instanceof MultiDexClassLoader)) {
            return new DexFile[0];
        }
        return ((MultiDexClassLoader) classLoader).doGetConfiguredDexFiles();
    }

    public static ClassLoader getSysClassloader() {
        return SYSTEM_CLASSLOADER;
    }

    public static boolean hadFancyLoaderFailure() {
        return sHadFancyLoaderFailure;
    }

    public static ClassLoader install(Context context, ArrayList arrayList, ArrayList arrayList2) {
        ClassLoader classLoader;
        ClassLoader classLoader2 = sInstalledClassLoader;
        if (classLoader2 == null) {
            synchronized (INSTALL_LOCK) {
                classLoader = sInstalledClassLoader;
                if (classLoader == null) {
                    try {
                        Class.forName("com.facebook.common.dextricks.FatalDexError");
                        Class.forName("com.facebook.common.dextricks.DexFileLoadOld");
                        Class.forName("com.facebook.common.dextricks.DexFileLoadNew");
                        Class.forName("com.facebook.common.dextricks.classifier.NameClassifier");
                        Class.forName("com.facebook.common.dextricks.stats.ClassLoadingStats");
                        Class.forName("com.facebook.common.dextricks.stats.ClassLoadingStats$SnapshotStats");
                        Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger");
                        Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerNativeHolder");
                        Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerLite");
                        Class.forName("com.facebook.common.dextricks.coverage.logger.ClassCoverageLogger");
                        Class.forName("com.facebook.common.dextricks.benchmarkhelper.ClassloadNameCollector");
                        Class.forName("com.facebook.common.dextricks.classid.ClassId");
                        Class.forName("com.facebook.common.dextricks.StringTreeSet");
                        Class.forName("com.facebook.common.dextricks.fallback.FallbackDexLoader");
                        forceLoadProfiloIfPresent();
                        C0PX c0px = AbstractC04290Kv.A00;
                        if (c0px != null) {
                            c0px.A02(new C10850hu("recentClassLoadFailures", -2, true), new InterfaceC08830cm() { // from class: com.facebook.common.dextricks.MultiDexClassLoader.1
                                @Override // X.InterfaceC08830cm
                                public String get() {
                                    ClassLoader classLoader3 = MultiDexClassLoader.sInstalledClassLoader;
                                    if (classLoader3 instanceof MultiDexClassLoader) {
                                        return Arrays.toString(((MultiDexClassLoader) classLoader3).getRecentFailedClasses());
                                    }
                                    return "";
                                }
                            });
                            c0px.A02(C0LK.A7Z, new InterfaceC08830cm() { // from class: com.facebook.common.dextricks.MultiDexClassLoader.2
                                @Override // X.InterfaceC08830cm
                                public String get() {
                                    ClassLoader classLoader3 = MultiDexClassLoader.sInstalledClassLoader;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("");
                                    sb.append(classLoader3);
                                    return sb.toString();
                                }
                            });
                        }
                        classLoader = createMultiDexClassLoader(context, arrayList, arrayList2);
                        try {
                            CLASSLOADER_PARENT_FIELD.set(((MultiDexClassLoader) classLoader).mPutativeLoader, classLoader);
                            sInstalledClassLoader = classLoader;
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    } catch (ClassNotFoundException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
            return classLoader;
        }
        return classLoader2;
    }

    public static final boolean maybeFallbackLoadDexes(String str, Throwable th) {
        FallbackDexLoader fallbackDexLoader = FallbackDexLoader.A00;
        if (fallbackDexLoader == null) {
            return false;
        }
        String str2 = null;
        if (classInLongtailModule(str)) {
            str2 = "longtail";
        }
        return fallbackDexLoader.A02(str, str2, th);
    }

    public void configureArtHacks(ClassLoaderConfiguration classLoaderConfiguration) {
        if (classLoaderConfiguration.disableVerifier) {
            DalvikInternals.installArtHacks(4, Build.VERSION.SDK_INT);
        }
    }

    public ClassLoaderConfiguration getConfig() {
        return this.mConfig;
    }

    public void observeDexFileLoad(DexFile dexFile, Class cls) {
        DexFile[] dexFileArr;
        DexFileAccessListener dexFileAccessListener;
        if (cls != null && (dexFileArr = this.subscribedDexFiles) != null && (dexFileAccessListener = this.dexFileAccessListener) != null) {
            for (DexFile dexFile2 : dexFileArr) {
                if (dexFile == dexFile2) {
                    dexFileAccessListener.onClassLoadedFromDexFile(cls, dexFile);
                    return;
                }
            }
        }
    }

    @Override // com.facebook.common.dextricks.DexFileAccessLoggingClassLoader
    public void subscribeToDexFileAccesses(DexFile[] dexFileArr, DexFileAccessListener dexFileAccessListener) {
        this.subscribedDexFiles = dexFileArr;
        this.dexFileAccessListener = dexFileAccessListener;
    }

    public final Class maybeFallbackLoadClass(String str, Throwable th) {
        try {
            if (maybeFallbackLoadDexes(str, th)) {
                Class<?> findClass = findClass(str);
                if (findClass != null) {
                    return findClass;
                }
                Log.w(TAG, AnonymousClass001.A0R("findClass failed without throwing for ", str));
            }
            if (th instanceof ClassNotFoundException) {
                throw ((ClassNotFoundException) th);
            }
            throw new ClassNotFoundException(str, th);
        } catch (RuntimeException e) {
            throw new ClassNotFoundException(AnonymousClass001.A0R("Fallback class load failed for ", str), e);
        }
    }
}
