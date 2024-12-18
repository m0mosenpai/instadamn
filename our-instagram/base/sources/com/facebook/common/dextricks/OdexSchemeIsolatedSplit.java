package com.facebook.common.dextricks;

import X.C0GV;
import X.C0K8;
import android.content.Context;
import com.facebook.common.dextricks.OdexScheme;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class OdexSchemeIsolatedSplit extends OdexScheme {
    public static final String TAG = "OdexSchemeIsolatedSplit";
    public File apk;
    public Context ctx;

    public OdexSchemeIsolatedSplit(File file, Context context) {
        super(0, new String[0]);
        this.apk = file;
        this.ctx = context.getApplicationContext();
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return TAG;
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) {
        String str;
        String name;
        File file2 = this.apk;
        if (file2 == null) {
            C0K8.A0O(TAG, "Could not find split apk path %s.", file2);
            return;
        }
        boolean tryRemovingImage = new RuntimeImageHelper(this.ctx, file2).tryRemovingImage();
        Object[] objArr = {this.apk};
        if (tryRemovingImage) {
            str = "Removed unexpected runtime image for %s";
        } else {
            str = "Could not find any runtime images for %s";
        }
        C0K8.A0P(TAG, str, objArr);
        try {
            try {
                DalvikInternals.setMadviseFileForRangeEnabled(false);
                PathClassLoader pathClassLoader = new PathClassLoader(this.apk.getCanonicalPath(), MultiDexClassLoader.SYSTEM_CLASSLOADER);
                LinkedList linkedList = new LinkedList();
                boolean z = false;
                if (C0GV.A01) {
                    z = true;
                }
                if (!z) {
                    C0K8.A0D("DexUtils", "Could not call hidden apis.");
                } else {
                    try {
                        Field declaredField = Class.forName("dalvik.system.BaseDexClassLoader").getDeclaredField("pathList");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(pathClassLoader);
                        Field declaredField2 = Class.forName("dalvik.system.DexPathList").getDeclaredField("dexElements");
                        declaredField2.setAccessible(true);
                        Object[] objArr2 = (Object[]) declaredField2.get(obj);
                        if (objArr2 != null) {
                            Field declaredField3 = Class.forName("dalvik.system.DexPathList$Element").getDeclaredField("dexFile");
                            declaredField3.setAccessible(true);
                            for (Object obj2 : objArr2) {
                                DexFile dexFile = (DexFile) declaredField3.get(obj2);
                                if (dexFile != null && (name = dexFile.getName()) != null && name.contains(".apk")) {
                                    linkedList.add(dexFile);
                                }
                            }
                        }
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        C0K8.A0M("DexUtils", "Could not get dex files like %", e, ".apk");
                    }
                }
                if (linkedList.isEmpty()) {
                    C0K8.A0O(TAG, "Could not get dex files from PCL of split %s.", this.apk);
                } else {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        classLoaderConfiguration.addDex((DexFile) it.next());
                    }
                }
            } catch (IOException e2) {
                C0K8.A0L(TAG, "Could not getCanonicalPath of apk path for split %s.", e2, this.apk);
            }
        } finally {
            DalvikInternals.setMadviseFileForRangeEnabled(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.common.dextricks.OdexScheme$Compiler] */
    @Override // com.facebook.common.dextricks.OdexScheme
    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new Object();
    }
}
