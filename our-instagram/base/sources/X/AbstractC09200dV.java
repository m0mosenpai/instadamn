package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;

/* renamed from: X.0dV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09200dV {
    public static C09020d6 A00(File file, File file2) {
        try {
            return new C09020d6(file2);
        } catch (FileNotFoundException e) {
            try {
                if (file.setWritable(true)) {
                    return new C09020d6(file2);
                }
                throw e;
            } finally {
                if (!file.setWritable(false)) {
                    android.util.Log.w("SysUtil", AnonymousClass001.A0g("error removing ", file.getCanonicalPath(), " write permission"));
                }
            }
        }
    }

    public static String A01() {
        ClassLoader classLoader = C09170dP.class.getClassLoader();
        if (classLoader != null && !(classLoader instanceof BaseDexClassLoader)) {
            StringBuilder sb = new StringBuilder();
            sb.append("ClassLoader ");
            sb.append(classLoader.getClass().getName());
            sb.append(" should be of type BaseDexClassLoader");
            throw new IllegalStateException(sb.toString());
        }
        try {
            return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
        } catch (Exception e) {
            AbstractC09030d7.A02(e);
            return null;
        }
    }

    public static Method A02() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || i > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Exception e) {
            AbstractC09030d7.A01("SysUtil", "Cannot get nativeLoad method", e);
            return null;
        }
    }

    public static void A04(File file) {
        Stack stack = new Stack();
        stack.push(file);
        ArrayList arrayList = new ArrayList();
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (!file2.isDirectory()) {
                A03(file2);
            } else {
                arrayList.add(file2);
                File[] listFiles = file2.listFiles();
                if (listFiles != null) {
                    for (File file3 : listFiles) {
                        stack.push(file3);
                    }
                }
            }
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                A03((File) arrayList.get(size));
            } else {
                return;
            }
        }
    }

    public static void A05(File file) {
        Stack stack = new Stack();
        stack.push(file);
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                File[] listFiles = file2.listFiles();
                if (listFiles != null) {
                    for (File file3 : listFiles) {
                        stack.push(file3);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("cannot list directory ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            } else if (file2.getPath().endsWith("_lock")) {
                continue;
            } else {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
                    try {
                        randomAccessFile.getFD().sync();
                        randomAccessFile.close();
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                        break;
                    }
                } catch (IOException e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Syncing failed for ");
                    sb2.append(file2);
                    sb2.append(": ");
                    sb2.append(e.getMessage());
                    android.util.Log.e("SysUtil", sb2.toString());
                }
            }
        }
    }

    public static void A03(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Enable write permission failed: ");
            sb.append(parentFile);
            android.util.Log.e("SysUtil", sb.toString());
        }
        if (!file.delete() && file.exists()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not delete file ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        }
    }

    public static byte[] A06(Context context, File file) {
        File canonicalFile = file.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 1);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            PackageManager packageManager = context.getPackageManager();
            int i = 0;
            if (packageManager != null) {
                try {
                    i = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                }
            }
            obtain.writeInt(i);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}
