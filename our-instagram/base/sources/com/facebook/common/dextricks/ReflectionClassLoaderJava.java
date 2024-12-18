package com.facebook.common.dextricks;

import X.AnonymousClass001;

/* loaded from: classes.dex */
public final class ReflectionClassLoaderJava extends ReflectionClassLoader {
    private ClassNotFoundException createCNFE(String str) {
        return new ClassNotFoundException(str);
    }

    @Override // java.lang.ClassLoader
    public Class findClass(String str) {
        Class<?> loadClass;
        ClassLoader classLoader = this.mPutativeLoader;
        if (classLoader != null && (loadClass = classLoader.loadClass(str)) != null) {
            return loadClass;
        }
        throw new ClassNotFoundException(AnonymousClass001.A0R("ReflectionClassLoaderJava cannot find ", str));
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z) {
        try {
            if (ReflectionClassLoader.maybeFallbackLoadDexes(str)) {
                try {
                    return findClass(str);
                } catch (ClassNotFoundException unused) {
                    throw new ClassNotFoundException(AnonymousClass001.A0R("ReflectionClassLoaderJava cannot find ", str));
                }
            }
            throw new ClassNotFoundException(AnonymousClass001.A0R("Fallback dex load return false for class ", str));
        } catch (RuntimeException e) {
            throw new ClassNotFoundException(AnonymousClass001.A0R("Fallback dex load failed for ", str), e);
        }
    }

    public ClassNotFoundException createCNFE(String str, Throwable th) {
        return new ClassNotFoundException(str, th);
    }
}
