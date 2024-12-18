package com.facebook.common.dextricks;

import dalvik.system.DexFile;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class DexFileLoad {
    public static void init() {
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dalvik.system.DexFile loadDex(java.lang.String r5, java.lang.String r6, java.lang.ClassLoader r7) {
        /*
            r4 = 0
            r3 = 0
            if (r7 == 0) goto L1b
            java.lang.reflect.Method r2 = getLoadMethodWithClassLoader()     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            if (r2 == 0) goto L1b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r6, r0, r7, r4}     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r2.invoke(r4, r0)     // Catch: java.lang.Throwable -> L1b
            dalvik.system.DexFile r0 = (dalvik.system.DexFile) r0     // Catch: java.lang.Throwable -> L1b
            r4 = r0
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 != 0) goto L22
            dalvik.system.DexFile r4 = dalvik.system.DexFile.loadDex(r5, r6, r3)
        L22:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexFileLoad.loadDex(java.lang.String, java.lang.String, java.lang.ClassLoader):dalvik.system.DexFile");
    }

    public static Method getLoadMethodWithClassLoader() {
        for (Method method : DexFile.class.getDeclaredMethods()) {
            if (method.getName().equals("loadDex") && method.getParameterTypes().length >= 5) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }
}
