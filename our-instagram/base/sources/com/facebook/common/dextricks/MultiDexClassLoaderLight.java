package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.C0GS;
import X.C0GU;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.facebook.common.dextricks.classifier.NameClassifier;
import com.facebook.common.dextricks.fallback.FallbackDexLoader;
import dalvik.system.DexFile;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class MultiDexClassLoaderLight extends ClassLoader {
    public static volatile MultiDexClassLoaderLight INSTANCE = null;
    public static final String[] REQUIRED_PRELOAD_CLASSES = {"com.facebook.common.dextricks.DexFileLoadNew", "com.facebook.common.dextricks.classifier.NameClassifier", "com.facebook.common.dextricks.StringTreeSet", "com.facebook.common.dextricks.MultiDexClassLoaderJava", "com.facebook.common.dextricks.halfnosis.Halfnosis", "com.facebook.common.dextricks.halfnosis.HalfnosisClassNotFoundException", "com.facebook.common.build.BuildConstants", "android.util.Log", "java.lang.StringBuilder"};
    public static final String TAG = "MDCLLight";
    public final DexFile mBaseApkDex;
    public final ClassLoader mPutativeLoader;

    private synchronized boolean maybeFallbackLoadDexes(String str) {
        String str2;
        boolean A02;
        boolean A01 = NameClassifier.A01(MultiDexClassLoaderJava.sEncodedLongtailUnrenamedTypes, str);
        FallbackDexLoader fallbackDexLoader = FallbackDexLoader.A00;
        if (fallbackDexLoader == null) {
            if (!A01) {
                Log.w(TAG, AnonymousClass001.A0R("tryFallbackLoadDex: fallbackLoader is null, unable to fallback load dex for ", str));
                A02 = false;
            } else {
                ClassNotFoundException classNotFoundException = new ClassNotFoundException(str);
                Log.e(TAG, AnonymousClass001.A0g("Halfnosis class load attempts ", str, " before fallback loader is setup, this needs to be fixed!"), classNotFoundException);
                throw classNotFoundException;
            }
        } else {
            if (!A01) {
                str2 = null;
            } else {
                str2 = "longtail";
            }
            Log.w(TAG, AnonymousClass001.A0u("Trying to fallback load dex", str, " moduleHint = ", str2));
            A02 = fallbackDexLoader.A02(str, str2, null);
        }
        return A02;
    }

    public static synchronized boolean install(ApplicationInfo applicationInfo, ClassLoader classLoader) {
        synchronized (MultiDexClassLoaderLight.class) {
            if (INSTANCE != null && INSTANCE.mPutativeLoader == classLoader) {
                Log.w(TAG, "MultiDexClassLoaderLight already installed");
            } else {
                try {
                    Field declaredField = ClassLoader.class.getDeclaredField("parent");
                    declaredField.setAccessible(true);
                    preloadRequiredClasses();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        C0GU.A00(applicationInfo, classLoader, arrayList, arrayList2);
                    } catch (C0GS e) {
                        Log.w(TAG, "failure to locate primary/auxiliary dexes.", e);
                        arrayList.clear();
                        arrayList2.clear();
                    }
                    if (arrayList.isEmpty()) {
                        Log.e(TAG, "No dex primary files found, skipping install MDCLLight!");
                    } else {
                        ClassLoader parent = classLoader.getParent();
                        if (parent == null) {
                            Log.e(TAG, "Parent classloader is null, skipping install MDCLLight!");
                        } else {
                            if (arrayList.size() != 1) {
                                Log.e(TAG, "More than 1 base.apk dex file found, something is unexpected!");
                            }
                            MultiDexClassLoaderLight multiDexClassLoaderLight = new MultiDexClassLoaderLight(parent, (DexFile) arrayList.get(0), classLoader);
                            declaredField.set(classLoader, multiDexClassLoaderLight);
                            INSTANCE = multiDexClassLoaderLight;
                        }
                    }
                } catch (Exception e2) {
                    Log.e(TAG, "Failed to install MultiDexClassLoaderLight", e2);
                }
                return false;
            }
            return true;
        }
    }

    public static boolean isInstalled() {
        if (INSTANCE == null) {
            return false;
        }
        return true;
    }

    private Class maybeFallbackLoadClass(String str) {
        try {
            if (maybeFallbackLoadDexes(str)) {
                ClassLoader classLoader = MultiDexClassLoader.sInstalledClassLoader;
                if (classLoader != null) {
                    return classLoader.loadClass(str);
                }
                Log.e(TAG, AnonymousClass001.A0g("MDCL wasn't installed although fallback load dexes for ", str, " had succeeded!"));
                return null;
            }
            Log.e(TAG, AnonymousClass001.A0R("Fallback load dex failed for ", str));
            return null;
        } catch (ClassNotFoundException | RuntimeException e) {
            Log.e(TAG, AnonymousClass001.A0R("Failed to load class from MDCL: ", str), e);
            return null;
        }
    }

    public static void preloadRequiredClasses() {
        try {
            for (String str : REQUIRED_PRELOAD_CLASSES) {
                Class.forName(str);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.ClassLoader
    public Class findClass(String str) {
        Class loadClassBinaryName = DexFileLoadNew.loadClassBinaryName(this.mBaseApkDex, str, this.mPutativeLoader);
        if (loadClassBinaryName != null) {
            return loadClassBinaryName;
        }
        throw new ClassNotFoundException(str);
    }

    public MultiDexClassLoaderLight(ClassLoader classLoader, DexFile dexFile, ClassLoader classLoader2) {
        super(classLoader);
        this.mBaseApkDex = dexFile;
        this.mPutativeLoader = classLoader2;
    }

    private Class loadFromParent(String str) {
        try {
            return getParent().loadClass(str);
        } catch (ClassNotFoundException e) {
            Log.w(TAG, AnonymousClass001.A0R("Failed to load class from parent: ", str), e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0 != null) goto L6;
     */
    @Override // java.lang.ClassLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Class loadClass(java.lang.String r4, boolean r5) {
        /*
            r3 = this;
            boolean r0 = com.facebook.common.dextricks.classifier.NameClassifier.A00(r4)
            r2 = 0
            if (r0 == 0) goto Lf
            r2 = 1
            java.lang.Class r0 = r3.loadFromParent(r4)
            if (r0 == 0) goto Lf
        Le:
            return r0
        Lf:
            dalvik.system.DexFile r1 = r3.mBaseApkDex
            java.lang.ClassLoader r0 = r3.mPutativeLoader
            java.lang.Class r0 = com.facebook.common.dextricks.DexFileLoadNew.loadClassBinaryName(r1, r4, r0)
            if (r0 != 0) goto Le
            if (r2 != 0) goto L2f
            java.lang.Class r2 = r3.loadFromParent(r4)
            if (r2 == 0) goto L2f
            java.lang.String r1 = "Class "
            java.lang.String r0 = " was loaded on parent fallback. This should be fixed and added to the shouldAskParent method."
            java.lang.String r1 = X.AnonymousClass001.A0g(r1, r4, r0)
            java.lang.String r0 = "MDCLLight"
            android.util.Log.w(r0, r1)
        L2e:
            return r2
        L2f:
            java.lang.Class r2 = r3.maybeFallbackLoadClass(r4)
            if (r2 != 0) goto L2e
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.MultiDexClassLoaderLight.loadClass(java.lang.String, boolean):java.lang.Class");
    }
}
