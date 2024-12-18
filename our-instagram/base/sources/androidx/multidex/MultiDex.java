package androidx.multidex;

import X.AnonymousClass001;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import dalvik.system.BaseDexClassLoader;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* loaded from: classes.dex */
public abstract class MultiDex {
    public static final Set A00 = new HashSet();
    public static final boolean A01;

    static {
        String str;
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String str2 = null;
            if (stringTokenizer.hasMoreTokens()) {
                str = stringTokenizer.nextToken();
            } else {
                str = null;
            }
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            }
            if (str != null && str2 != null) {
                try {
                    int parseInt = Integer.parseInt(str);
                    int parseInt2 = Integer.parseInt(str2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        A01 = z;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.080] */
    public static void A01(Context context) {
        StringBuilder sb;
        try {
            if (!A01) {
                try {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    if (applicationInfo != null) {
                        final File file = new File(applicationInfo.sourceDir);
                        File file2 = new File(applicationInfo.dataDir);
                        Set set = A00;
                        synchronized (set) {
                            if (!set.contains(file)) {
                                set.add(file);
                                int i = Build.VERSION.SDK_INT;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("MultiDex is not guaranteed to work in SDK version ");
                                sb2.append(i);
                                sb2.append(": SDK version higher than ");
                                sb2.append(20);
                                sb2.append(" should be backed by ");
                                sb2.append("runtime with built-in multidex capabilty but it's not the ");
                                sb2.append("case here: java.vm.version=\"");
                                sb2.append(System.getProperty("java.vm.version"));
                                sb2.append("\"");
                                Log.w("MultiDex", sb2.toString());
                                try {
                                    ClassLoader classLoader = context.getClassLoader();
                                    if (classLoader instanceof BaseDexClassLoader) {
                                        if (classLoader != null) {
                                            try {
                                                File file3 = new File(context.getFilesDir(), "secondary-dexes");
                                                if (file3.isDirectory()) {
                                                    file3.getPath();
                                                    String str = ").";
                                                    File[] listFiles = file3.listFiles();
                                                    if (listFiles == null) {
                                                        sb = new StringBuilder();
                                                        sb.append("Failed to list secondary dex dir content (");
                                                        sb.append(file3.getPath());
                                                    } else {
                                                        for (File file4 : listFiles) {
                                                            file4.getPath();
                                                            file4.length();
                                                            if (!file4.delete()) {
                                                                Log.w("MultiDex", AnonymousClass001.A0R("Failed to delete old file ", file4.getPath()));
                                                            } else {
                                                                file4.getPath();
                                                            }
                                                        }
                                                        if (!file3.delete()) {
                                                            sb = new StringBuilder();
                                                            sb.append("Failed to delete secondary dex dir ");
                                                            str = file3.getPath();
                                                        } else {
                                                            file3.getPath();
                                                        }
                                                    }
                                                    sb.append(str);
                                                    Log.w("MultiDex", sb.toString());
                                                }
                                            } catch (Throwable th) {
                                                Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                                            }
                                            File file5 = new File(file2, "code_cache");
                                            try {
                                                A02(file5);
                                            } catch (IOException unused) {
                                                file5 = new File(context.getFilesDir(), "code_cache");
                                                A02(file5);
                                            }
                                            final File file6 = new File(file5, "secondary-dexes");
                                            A02(file6);
                                            ?? r3 = new Closeable(file, file6) { // from class: X.080
                                                public final File A00;
                                                public final File A01;
                                                public final long A02;
                                                public final RandomAccessFile A03;
                                                public final FileChannel A04;
                                                public final FileLock A05;

                                                /* JADX WARN: Multi-variable type inference failed */
                                                /* JADX WARN: Type inference failed for: r10v0, types: [X.07z, java.lang.Object, java.io.File] */
                                                private ArrayList A01() {
                                                    ZipEntry entry;
                                                    File file7 = this.A01;
                                                    String A0R = AnonymousClass001.A0R(file7.getName(), ".classes");
                                                    File file8 = this.A00;
                                                    File[] listFiles2 = file8.listFiles(new C14410oD(this, 0));
                                                    if (listFiles2 == null) {
                                                        android.util.Log.w("MultiDex", AnonymousClass001.A0g("Failed to list secondary dex dir content (", file8.getPath(), ")."));
                                                    } else {
                                                        for (File file9 : listFiles2) {
                                                            file9.getPath();
                                                            file9.length();
                                                            if (!file9.delete()) {
                                                                android.util.Log.w("MultiDex", AnonymousClass001.A0R("Failed to delete old file ", file9.getPath()));
                                                            } else {
                                                                file9.getPath();
                                                            }
                                                        }
                                                    }
                                                    ArrayList arrayList = new ArrayList();
                                                    ZipFile zipFile = new ZipFile(file7);
                                                    int i2 = 2;
                                                    try {
                                                        entry = zipFile.getEntry(AnonymousClass001.A0c("classes", DexManifest.DEX_EXT, 2));
                                                    } catch (Throwable th2) {
                                                        try {
                                                            zipFile.close();
                                                            throw th2;
                                                        } catch (IOException e) {
                                                            android.util.Log.w("MultiDex", "Failed to close resource", e);
                                                            throw th2;
                                                        }
                                                    }
                                                    while (entry != null) {
                                                        ?? file10 = new File(file8, AnonymousClass001.A0c(A0R, ".zip", i2));
                                                        file10.A00 = -1L;
                                                        arrayList.add(file10);
                                                        int i3 = 0;
                                                        boolean z = false;
                                                        while (i3 < 3 && !z) {
                                                            i3++;
                                                            InputStream inputStream = zipFile.getInputStream(entry);
                                                            File createTempFile = File.createTempFile(AnonymousClass001.A0R("tmp-", A0R), ".zip", file10.getParentFile());
                                                            createTempFile.getPath();
                                                            try {
                                                                ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
                                                                try {
                                                                    ZipEntry zipEntry = new ZipEntry("classes.dex");
                                                                    zipEntry.setTime(entry.getTime());
                                                                    zipOutputStream.putNextEntry(zipEntry);
                                                                    byte[] bArr = new byte[Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET];
                                                                    for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                                                                        zipOutputStream.write(bArr, 0, read);
                                                                    }
                                                                    zipOutputStream.closeEntry();
                                                                    zipOutputStream.close();
                                                                    if (createTempFile.setReadOnly()) {
                                                                        file10.getPath();
                                                                        if (createTempFile.renameTo(file10)) {
                                                                            A03(inputStream);
                                                                            createTempFile.delete();
                                                                            try {
                                                                                file10.A00 = A00(file10);
                                                                                z = true;
                                                                            } catch (IOException e2) {
                                                                                android.util.Log.w("MultiDex", AnonymousClass001.A0R("Failed to read crc from ", file10.getAbsolutePath()), e2);
                                                                                z = false;
                                                                            }
                                                                            file10.getAbsolutePath();
                                                                            file10.length();
                                                                            if (!z) {
                                                                                file10.delete();
                                                                                if (file10.exists()) {
                                                                                    android.util.Log.w("MultiDex", AnonymousClass001.A0g("Failed to delete corrupted secondary dex '", file10.getPath(), "'"));
                                                                                }
                                                                            }
                                                                        } else {
                                                                            throw new IOException(AnonymousClass001.A11("Failed to rename \"", createTempFile.getAbsolutePath(), "\" to \"", file10.getAbsolutePath(), "\""));
                                                                        }
                                                                    } else {
                                                                        throw new IOException(AnonymousClass001.A11("Failed to mark readonly \"", createTempFile.getAbsolutePath(), "\" (tmp of \"", file10.getAbsolutePath(), "\")"));
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    zipOutputStream.close();
                                                                    throw th3;
                                                                }
                                                            } catch (Throwable th4) {
                                                                A03(inputStream);
                                                                createTempFile.delete();
                                                                throw th4;
                                                            }
                                                            zipFile.close();
                                                            throw th2;
                                                        }
                                                        if (z) {
                                                            i2++;
                                                            entry = zipFile.getEntry(AnonymousClass001.A0c("classes", DexManifest.DEX_EXT, i2));
                                                        } else {
                                                            throw new IOException(AnonymousClass001.A09(i2, "Could not create zip file ", file10.getAbsolutePath(), " for secondary dex (", ")"));
                                                        }
                                                    }
                                                    try {
                                                        zipFile.close();
                                                        return arrayList;
                                                    } catch (IOException e3) {
                                                        android.util.Log.w("MultiDex", "Failed to close resource", e3);
                                                        return arrayList;
                                                    }
                                                }

                                                public static void A02(Context context2, List list, long j, long j2) {
                                                    SharedPreferences.Editor edit = context2.getSharedPreferences("multidex.version", 4).edit();
                                                    edit.putLong(AnonymousClass001.A0R("", "timestamp"), j);
                                                    edit.putLong(AnonymousClass001.A0R("", "crc"), j2);
                                                    edit.putInt(AnonymousClass001.A0R("", "dex.number"), list.size() + 1);
                                                    Iterator it = list.iterator();
                                                    int i2 = 2;
                                                    while (it.hasNext()) {
                                                        C020307z c020307z = (C020307z) it.next();
                                                        edit.putLong(AnonymousClass001.A0b("", "dex.crc.", i2), c020307z.A00);
                                                        edit.putLong(AnonymousClass001.A0b("", "dex.time.", i2), c020307z.lastModified());
                                                        i2++;
                                                    }
                                                    edit.commit();
                                                }

                                                /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
                                                
                                                    if (r8.getLong(X.AnonymousClass001.A0R("", "crc"), -1) != r0) goto L13;
                                                 */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                /* JADX WARN: Type inference failed for: r8v1, types: [X.07z, java.lang.Object, java.io.File] */
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                    To view partially-correct add '--show-bad-code' argument
                                                */
                                                public final java.util.ArrayList A04(android.content.Context r25, boolean r26) {
                                                    /*
                                                        Method dump skipped, instructions count: 350
                                                        To view this dump add '--comments-level debug' option
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass080.A04(android.content.Context, boolean):java.util.ArrayList");
                                                }

                                                @Override // java.io.Closeable, java.lang.AutoCloseable
                                                public final void close() {
                                                    this.A05.release();
                                                    this.A04.close();
                                                    this.A03.close();
                                                }

                                                {
                                                    file.getPath();
                                                    file6.getPath();
                                                    this.A01 = file;
                                                    this.A00 = file6;
                                                    this.A02 = A00(file);
                                                    File file7 = new File(file6, "MultiDex.lock");
                                                    RandomAccessFile randomAccessFile = new RandomAccessFile(file7, "rw");
                                                    this.A03 = randomAccessFile;
                                                    try {
                                                        FileChannel channel = randomAccessFile.getChannel();
                                                        this.A04 = channel;
                                                        try {
                                                            file7.getPath();
                                                            this.A05 = channel.lock();
                                                            file7.getPath();
                                                        } catch (IOException | Error | RuntimeException e) {
                                                            A03(this.A04);
                                                            throw e;
                                                        }
                                                    } catch (IOException | Error | RuntimeException e2) {
                                                        A03(this.A03);
                                                        throw e2;
                                                    }
                                                }

                                                public static long A00(File file7) {
                                                    RandomAccessFile randomAccessFile = new RandomAccessFile(file7, "r");
                                                    try {
                                                        long length = randomAccessFile.length() - 22;
                                                        long j = 0;
                                                        if (length >= 0) {
                                                            long j2 = length - OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED;
                                                            if (j2 >= 0) {
                                                                j = j2;
                                                            }
                                                            int reverseBytes = Integer.reverseBytes(101010256);
                                                            do {
                                                                randomAccessFile.seek(length);
                                                                if (randomAccessFile.readInt() == reverseBytes) {
                                                                    randomAccessFile.skipBytes(2);
                                                                    randomAccessFile.skipBytes(2);
                                                                    randomAccessFile.skipBytes(2);
                                                                    randomAccessFile.skipBytes(2);
                                                                    long reverseBytes2 = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                                                                    CRC32 crc32 = new CRC32();
                                                                    randomAccessFile.seek(Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L);
                                                                    int min = (int) Math.min(OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED, reverseBytes2);
                                                                    byte[] bArr = new byte[Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET];
                                                                    while (true) {
                                                                        int read = randomAccessFile.read(bArr, 0, min);
                                                                        if (read == -1) {
                                                                            break;
                                                                        }
                                                                        crc32.update(bArr, 0, read);
                                                                        reverseBytes2 -= read;
                                                                        if (reverseBytes2 == 0) {
                                                                            break;
                                                                        }
                                                                        min = (int) Math.min(OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED, reverseBytes2);
                                                                    }
                                                                    long value = crc32.getValue();
                                                                    randomAccessFile.close();
                                                                    if (value == -1) {
                                                                        return value - 1;
                                                                    }
                                                                    return value;
                                                                }
                                                                length--;
                                                            } while (length >= j);
                                                            throw new ZipException("End Of Central Directory signature not found");
                                                        }
                                                        throw new ZipException(AnonymousClass001.A0Q("File too short to be a zip file: ", randomAccessFile.length()));
                                                    } catch (Throwable th2) {
                                                        randomAccessFile.close();
                                                        throw th2;
                                                    }
                                                }

                                                public static void A03(Closeable closeable) {
                                                    try {
                                                        closeable.close();
                                                    } catch (IOException e) {
                                                        android.util.Log.w("MultiDex", "Failed to close resource", e);
                                                    }
                                                }
                                            };
                                            try {
                                                try {
                                                    A03(file6, classLoader, r3.A04(context, false));
                                                } catch (IOException e) {
                                                    Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e);
                                                    A03(file6, classLoader, r3.A04(context, true));
                                                }
                                                try {
                                                    r3.close();
                                                } catch (IOException e2) {
                                                    throw e2;
                                                }
                                            } catch (Throwable th2) {
                                                try {
                                                    r3.close();
                                                } catch (IOException unused2) {
                                                }
                                                throw th2;
                                            }
                                        }
                                    } else {
                                        Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
                                    }
                                } catch (RuntimeException e3) {
                                    Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e3);
                                }
                            }
                        }
                    }
                } catch (RuntimeException e4) {
                    Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e4);
                }
            }
        } catch (Exception e5) {
            Log.e("MultiDex", "MultiDex installation failure", e5);
            throw new RuntimeException(AnonymousClass001.A0g("MultiDex installation failed (", e5.getMessage(), ")."));
        }
    }

    public static Field A00(Object obj, String str) {
        Class<?> cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                    return declaredField;
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(cls);
        throw new NoSuchFieldException(sb.toString());
    }

    public static void A02(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create dir ");
            String path = file.getPath();
            if (parentFile == null) {
                sb.append(path);
                sb.append(". Parent file is null.");
            } else {
                sb.append(path);
                sb.append(". parent file is a dir ");
                sb.append(parentFile.isDirectory());
                sb.append(", a file ");
                sb.append(parentFile.isFile());
                sb.append(", exists ");
                sb.append(parentFile.exists());
                sb.append(", readable ");
                sb.append(parentFile.canRead());
                sb.append(", writable ");
                sb.append(parentFile.canWrite());
            }
            Log.e("MultiDex", sb.toString());
            throw new IOException(AnonymousClass001.A0R("Failed to create directory ", file.getPath()));
        }
    }

    public static void A03(File file, ClassLoader classLoader, List list) {
        Object obj;
        if (!list.isEmpty()) {
            Object obj2 = A00(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list);
            Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            Class<?> cls = obj2.getClass();
            while (cls != null) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    Object[] objArr = (Object[]) declaredMethod.invoke(obj2, arrayList2, file, arrayList);
                    Field A002 = A00(obj2, "dexElements");
                    Object[] objArr2 = (Object[]) A002.get(obj2);
                    Class<?> componentType = objArr2.getClass().getComponentType();
                    int length = objArr2.length;
                    int length2 = objArr.length;
                    Object newInstance = Array.newInstance(componentType, length + length2);
                    System.arraycopy(objArr2, 0, newInstance, 0, length);
                    System.arraycopy(objArr, 0, newInstance, length, length2);
                    A002.set(obj2, newInstance);
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Log.w("MultiDex", "Exception in makeDexElement", (Throwable) it.next());
                        }
                        Field A003 = A00(obj2, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr = (IOException[]) A003.get(obj2);
                        int size = arrayList.size();
                        if (iOExceptionArr == null) {
                            obj = arrayList.toArray(new IOException[size]);
                        } else {
                            int length3 = iOExceptionArr.length;
                            obj = new IOException[size + length3];
                            arrayList.toArray((Object[]) obj);
                            System.arraycopy(iOExceptionArr, 0, obj, arrayList.size(), length3);
                        }
                        A003.set(obj2, obj);
                        IOException iOException = new IOException("I/O exception during makeDexElement");
                        iOException.initCause((Throwable) arrayList.get(0));
                        throw iOException;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                    cls = cls.getSuperclass();
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append("makeDexElements");
            sb.append(" with parameters ");
            sb.append(Arrays.asList(clsArr));
            sb.append(" not found in ");
            sb.append(cls);
            throw new NoSuchMethodException(sb.toString());
        }
    }
}
