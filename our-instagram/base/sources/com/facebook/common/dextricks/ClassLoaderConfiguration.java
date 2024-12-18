package com.facebook.common.dextricks;

import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ClassLoaderConfiguration {
    public static final int BASE_DEX_RETRY_WAIT_MS = 500;
    public static final int LOAD_SECONDARY = 4;
    public static final int MAX_LOAD_DEX_RETRY = 3;
    public static final int SUPPORTS_LOCATORS = 2;
    public static final String TAG = "ClassLoaderConfiguration";
    public final int coldstartDexCount;
    public int configFlags;
    public final boolean disableVerifier;
    public final ArrayList mDexFiles = new ArrayList();
    public final ArrayList coldstartDexBaseNames = new ArrayList();

    private void appendColdstartDexBaseName(File file) {
        if (this.coldstartDexBaseNames.size() < this.coldstartDexCount) {
            String name = file.getName();
            String substring = name.substring(0, name.indexOf(46));
            this.coldstartDexBaseNames.add(substring);
            DalvikInternals.addDexBaseNames(substring);
        }
    }

    public void addDex(DexFile dexFile) {
        this.mDexFiles.add(dexFile);
    }

    public void addDexFileToClassLoaderPath(BaseDexClassLoader baseDexClassLoader) {
        Iterator it = this.mDexFiles.iterator();
        while (it.hasNext()) {
            try {
                IOException[] threadSafeAddDexPath = OdexSchemeOreo.threadSafeAddDexPath(baseDexClassLoader, new File(((DexFile) it.next()).getName()));
                if (threadSafeAddDexPath != null) {
                    for (IOException iOException : threadSafeAddDexPath) {
                        Mlog.e("ClassLoaderConfiguration Failed to add dex path", iOException);
                    }
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException("ClassLoaderConfigurationfail to add dex file to class loader path", e);
            }
        }
    }

    public int getConfigFlags() {
        return this.configFlags;
    }

    public int getNumberConfiguredDexFiles() {
        return this.mDexFiles.size();
    }

    public void setConfigFlags(int i) {
        this.configFlags = i;
    }

    public ClassLoaderConfiguration(int i, int i2, boolean z) {
        this.configFlags = i;
        this.coldstartDexCount = i2;
        this.disableVerifier = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0026, code lost:
    
        r8.mDexFiles.add(r1);
        appendColdstartDexBaseName(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0024, code lost:
    
        if (r1 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addDex(java.io.File r9, java.io.File r10, boolean r11) {
        /*
            r8 = this;
            java.lang.String r4 = r9.getCanonicalPath()
            r5 = 0
            if (r10 == 0) goto Lb
            java.lang.String r5 = r10.getCanonicalPath()
        Lb:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            r6 = 0
            if (r1 < r0) goto L15
            r9.setWritable(r6)
        L15:
            r3 = 0
        L16:
            int r3 = r3 + 1
            r7 = 3
            java.lang.String r0 = r9.getCanonicalPath()     // Catch: java.io.IOException -> L3f
            dalvik.system.DexFile r1 = dalvik.system.DexFile.loadDex(r0, r5, r6)     // Catch: java.io.IOException -> L3f
            if (r11 == 0) goto L24
            goto L2f
        L24:
            if (r1 == 0) goto L33
        L26:
            java.util.ArrayList r0 = r8.mDexFiles
            r0.add(r1)
            r8.appendColdstartDexBaseName(r9)
            return
        L2f:
            if (r1 != 0) goto L26
            if (r3 <= r7) goto L4d
        L33:
            java.lang.String r0 = "Could not load dex file "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r4)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L3f:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r2}
            java.lang.String r0 = "ClassLoaderConfiguration Failed loading dex ( %s )"
            com.facebook.common.dextricks.Mlog.w(r0, r1)
            if (r11 == 0) goto L5e
            if (r7 < r3) goto L5e
        L4d:
            if (r3 <= 0) goto L16
            int r0 = r3 * 500
            long r0 = (long) r0
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L56
            goto L16
        L56:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L16
        L5e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ClassLoaderConfiguration.addDex(java.io.File, java.io.File, boolean):void");
    }

    public void addDex(File file, File file2) {
        addDex(file, file2, false);
    }

    public void addDex(File file, boolean z) {
        addDex(file, null, z);
    }

    public void addDex(File file) {
        addDex(file, false);
    }
}
