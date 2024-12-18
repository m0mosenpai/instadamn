package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.os.StrictMode;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: X.0GU, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0GU {
    public static void A00(ApplicationInfo applicationInfo, ClassLoader classLoader, List list, List list2) {
        StrictMode.VmPolicy.Builder builder;
        String str;
        Object[] objArr;
        long currentTimeMillis = System.currentTimeMillis();
        if (C0GV.A01) {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (vmPolicy != null) {
                builder = new StrictMode.VmPolicy.Builder(vmPolicy);
            } else {
                builder = new StrictMode.VmPolicy.Builder();
            }
            try {
                C0GV.A00.invoke(builder, new Object[0]);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
            StrictMode.setVmPolicy(builder.build());
            try {
                try {
                    Field declaredField = Class.forName("dalvik.system.BaseDexClassLoader").getDeclaredField("pathList");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(classLoader);
                    Field declaredField2 = Class.forName("dalvik.system.DexPathList").getDeclaredField("dexElements");
                    declaredField2.setAccessible(true);
                    Object[] objArr2 = (Object[]) declaredField2.get(obj);
                    Field declaredField3 = Class.forName("dalvik.system.DexPathList$Element").getDeclaredField("dexFile");
                    declaredField3.setAccessible(true);
                    String str2 = applicationInfo.sourceDir;
                    String.format("primary dex name: %s", str2);
                    if (str2 != null) {
                        boolean exists = new File(str2).exists();
                        for (Object obj2 : objArr2) {
                            DexFile dexFile = (DexFile) declaredField3.get(obj2);
                            if (dexFile != null) {
                                String name = dexFile.getName();
                                if (str2.equals(name)) {
                                    str = "Found primary dex %s";
                                    objArr = new Object[]{name};
                                } else if (list.isEmpty() && !exists && name != null && name.startsWith("/data/app/") && name.endsWith("/base.apk") && name.contains(((PackageItemInfo) applicationInfo).packageName)) {
                                    str = "Found primary dex via search %s";
                                    objArr = new Object[]{name};
                                } else {
                                    String.format("Found system/other dex %s", name);
                                    list2.add(dexFile);
                                }
                                String.format(str, objArr);
                                list.add(dexFile);
                            }
                        }
                        return;
                    }
                    throw new Exception("Cannot find a primary dex name");
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                    throw new Exception("Dalvik system code not of expected form", e);
                }
            } finally {
                if (vmPolicy != null) {
                    StrictMode.setVmPolicy(vmPolicy);
                }
                String.format("Setup multi dex took %d ms.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        }
        throw new Exception("Cannot call needed hidden apis on this platform");
    }
}
