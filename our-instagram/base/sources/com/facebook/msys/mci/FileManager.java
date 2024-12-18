package com.facebook.msys.mci;

import X.AbstractC09780fb;
import X.C1EJ;
import X.C53882dS;
import android.content.ContentResolver;
import com.facebook.common.dextricks.Constants;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.FileManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FileManager {
    public static File mCacheDir;
    public static ContentResolver mContentResolver;
    public static volatile boolean sInitialized;

    public static native void nativeInitialize();

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00fd, code lost:
    
        if (r1.contains("space") == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0082, code lost:
    
        if (r1.contains("space") == false) goto L41;
     */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.0bW, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void copyFile(java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.copyFile(java.lang.String, java.lang.String):void");
    }

    public static void copyInputStreamIntoOutputStream(InputStream inputStream, OutputStream outputStream) {
        AbstractC09780fb.A01("FileManager.copyInputStreamIntoOutputStream", -612725792);
        byte[] bArr = new byte[Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                AbstractC09780fb.A00(1003219040);
                return;
            }
        }
    }

    public static String createCacheDirectory(String str) {
        File file = new File(mCacheDir, str);
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            return file.toString();
        }
        throw createFileManagerError(7, null);
    }

    public static MsysError createFileManagerError(int i, Throwable th) {
        Map map;
        if (th != null) {
            map = Collections.singletonMap(MsysError.getLocalizedFailureReasonKey(), th.toString());
        } else {
            map = null;
        }
        return new MsysError(MsysError.initNativeHolder("com.facebook.msys.filesystem", i, map));
    }

    public static long getAvailableDiskSpace() {
        File file = mCacheDir;
        if (file == null) {
            return 0L;
        }
        return getFileFromPathWithOptionalScheme(file.toString()).getFreeSpace();
    }

    public static String getCacheDirectory() {
        return mCacheDir.toString();
    }

    public static synchronized File getFileFromPathWithOptionalScheme(String str) {
        File file;
        synchronized (FileManager.class) {
            if (str.startsWith("file://")) {
                file = new File(URI.create(str));
            } else if (str.startsWith("cache://")) {
                file = new File(mCacheDir, str.substring(8));
            } else {
                file = new File(str);
            }
        }
        return file;
    }

    public static boolean isMCPEnabledForFileManager() {
        synchronized (C1EJ.class) {
        }
        return false;
    }

    public static void moveFile(String str, String str2) {
        int i;
        AbstractC09780fb.A01("FileManager.moveFile", -767238930);
        try {
            File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
            File fileFromPathWithOptionalScheme2 = getFileFromPathWithOptionalScheme(str2);
            if (!fileFromPathWithOptionalScheme.equals(fileFromPathWithOptionalScheme2)) {
                if (fileFromPathWithOptionalScheme.renameTo(fileFromPathWithOptionalScheme2)) {
                    i = -1080445344;
                } else {
                    copyFile(str, str2);
                    if (fileFromPathWithOptionalScheme.delete()) {
                        i = -1891552760;
                    } else {
                        throw createFileManagerError(8, null);
                    }
                }
            } else {
                i = 714495504;
            }
            AbstractC09780fb.A00(i);
        } catch (Throwable th) {
            AbstractC09780fb.A00(-1933485415);
            throw th;
        }
    }

    static {
        C53882dS.A00();
    }

    public static void createDirectory(String str) {
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        if ((fileFromPathWithOptionalScheme.exists() && fileFromPathWithOptionalScheme.isDirectory()) || fileFromPathWithOptionalScheme.mkdirs()) {
        } else {
            throw createFileManagerError(7, null);
        }
    }

    public static void deleteItem(String str) {
        if (deleteItemRecursive(getFileFromPathWithOptionalScheme(str))) {
        } else {
            throw createFileManagerError(8, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean deleteItemRecursive(java.io.File r7) {
        /*
            boolean r0 = r7.isDirectory()
            if (r0 == 0) goto L36
            java.io.File[] r6 = r7.listFiles()
            int r5 = r6.length
            r4 = 0
            r3 = 0
            r2 = 1
        Le:
            if (r3 >= r5) goto L2c
            r1 = r6[r3]
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L25
            if (r2 == 0) goto L21
            boolean r0 = deleteItemRecursive(r1)
        L1e:
            r2 = 1
            if (r0 != 0) goto L22
        L21:
            r2 = 0
        L22:
            int r3 = r3 + 1
            goto Le
        L25:
            if (r2 == 0) goto L21
            boolean r0 = r1.delete()
            goto L1e
        L2c:
            boolean r0 = r7.delete()
            if (r0 == 0) goto L3a
            if (r2 == 0) goto L3a
            r4 = 1
            return r4
        L36:
            boolean r4 = r7.delete()
        L3a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.deleteItemRecursive(java.io.File):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r6 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r6.isDirectory() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r2 = java.util.Locale.ROOT;
        r16 = java.lang.Boolean.valueOf(r13);
        r17 = java.lang.Boolean.valueOf(r14);
        r18 = java.lang.Boolean.valueOf(r12);
        r19 = java.lang.Long.valueOf(r10);
        r20 = java.lang.Long.valueOf(r8);
        r21 = java.lang.Boolean.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r6 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        r22 = r6.getAbsolutePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        return java.lang.String.format(r2, "File Error: Path = %s, Exists = %b, Can Read = %b, Can Write = %b, Size = %d, Last Modified = %d, Is Directory = %b, Parent Path = %s, Parent Exists = %b, Parent Can Read = %b, Parent Can Write = %b, Parent Is Directory = %b", r15, r16, r17, r18, r19, r20, r21, r22, java.lang.Boolean.valueOf(r5), java.lang.Boolean.valueOf(r4), java.lang.Boolean.valueOf(r3), java.lang.Boolean.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        r22 = "<null>";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r6.canWrite() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002a, code lost:
    
        if (r6 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r6.exists() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (r6.canRead() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r6 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String generateFileNotFoundError(java.io.File r26) {
        /*
            java.lang.String r15 = r26.getAbsolutePath()
            boolean r14 = r26.canRead()
            boolean r13 = r26.exists()
            boolean r12 = r26.canWrite()
            long r10 = r26.length()
            long r8 = r26.lastModified()
            boolean r7 = r26.isDirectory()
            java.io.File r6 = r26.getParentFile()
            if (r6 == 0) goto L29
            boolean r0 = r6.exists()
            r5 = 1
            if (r0 != 0) goto L2c
        L29:
            r5 = 0
            if (r6 == 0) goto L33
        L2c:
            boolean r0 = r6.canRead()
            r4 = 1
            if (r0 != 0) goto L36
        L33:
            r4 = 0
            if (r6 == 0) goto L3d
        L36:
            boolean r0 = r6.canWrite()
            r3 = 1
            if (r0 != 0) goto L40
        L3d:
            r3 = 0
            if (r6 == 0) goto L47
        L40:
            boolean r1 = r6.isDirectory()
            r0 = 1
            if (r1 != 0) goto L48
        L47:
            r0 = 0
        L48:
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r13)
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r14)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r12)
            java.lang.Long r19 = java.lang.Long.valueOf(r10)
            java.lang.Long r20 = java.lang.Long.valueOf(r8)
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r7)
            if (r6 == 0) goto L83
            java.lang.String r22 = r6.getAbsolutePath()
        L68:
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26}
            java.lang.String r0 = "File Error: Path = %s, Exists = %b, Can Read = %b, Can Write = %b, Size = %d, Last Modified = %d, Is Directory = %b, Parent Path = %s, Parent Exists = %b, Parent Can Read = %b, Parent Can Write = %b, Parent Is Directory = %b"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            return r0
        L83:
            java.lang.String r22 = "<null>"
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.generateFileNotFoundError(java.io.File):java.lang.String");
    }

    public static boolean itemExists(String str) {
        return getFileFromPathWithOptionalScheme(str).exists();
    }

    public static String[] listDirectory(String str) {
        File[] listFiles = getFileFromPathWithOptionalScheme(str).listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            if (length > 1) {
                final HashMap hashMap = new HashMap(length + 1, 1.0f);
                int i = 0;
                do {
                    File file = listFiles[i];
                    hashMap.put(file, Long.valueOf(file.lastModified()));
                    i++;
                } while (i < length);
                Arrays.sort(listFiles, new Comparator() { // from class: X.PU7
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        Map map = hashMap;
                        boolean z = FileManager.sInitialized;
                        Object obj3 = map.get(obj2);
                        obj3.getClass();
                        long A0N = AbstractC166987dD.A0N(obj3);
                        Object obj4 = map.get(obj);
                        obj4.getClass();
                        return (A0N > AbstractC166987dD.A0N(obj4) ? 1 : (A0N == AbstractC166987dD.A0N(obj4) ? 0 : -1));
                    }
                });
            }
            String[] strArr = new String[length];
            for (int i2 = 0; i2 < length; i2++) {
                strArr[i2] = listFiles[i2].getAbsolutePath();
            }
            return strArr;
        }
        throw createFileManagerError(6, null);
    }

    public static byte[] readFile(String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(getFileFromPathWithOptionalScheme(str), "r");
            try {
                long length = randomAccessFile.length();
                if (length <= 2147483647L) {
                    byte[] bArr = new byte[(int) length];
                    randomAccessFile.readFully(bArr);
                    randomAccessFile.close();
                    return bArr;
                }
                android.util.Log.e("FileUtils", "Cannot read more than 2GB into an array");
                throw new IOException("Cannot read more than 2GB into an array");
            } finally {
            }
        } catch (IOException e) {
            throw createFileManagerError(6, e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x004e, code lost:
    
        if (r1.contains("space") == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void writeDataToFile(byte[] r3, java.lang.String r4, boolean r5) {
        /*
            java.io.File r0 = getFileFromPathWithOptionalScheme(r4)
            java.io.File r1 = r0.getParentFile()
            if (r1 == 0) goto L13
            boolean r0 = r1.exists()
            if (r0 != 0) goto L13
            r1.mkdirs()
        L13:
            java.io.File r1 = getFileFromPathWithOptionalScheme(r4)
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L3f java.io.FileNotFoundException -> L56
            r2.<init>(r3)     // Catch: java.io.IOException -> L3f java.io.FileNotFoundException -> L56
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L35
            r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L35
            copyInputStreamIntoOutputStream(r2, r0)     // Catch: java.lang.Throwable -> L2b
            r0.close()     // Catch: java.lang.Throwable -> L35
            r2.close()     // Catch: java.io.IOException -> L3f java.io.FileNotFoundException -> L56
            return
        L2b:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r0 = move-exception
            X.AbstractC61625Rqp.A00(r1, r0)     // Catch: java.lang.Throwable -> L35
        L34:
            throw r1     // Catch: java.lang.Throwable -> L35
        L35:
            r1 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L3a:
            r0 = move-exception
            X.AbstractC61625Rqp.A00(r1, r0)     // Catch: java.io.IOException -> L3f java.io.FileNotFoundException -> L56
        L3e:
            throw r1     // Catch: java.io.IOException -> L3f java.io.FileNotFoundException -> L56
        L3f:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            if (r1 == 0) goto L50
            java.lang.String r0 = "space"
            boolean r1 = r1.contains(r0)
            r0 = 4
            if (r1 != 0) goto L51
        L50:
            r0 = 1
        L51:
            com.facebook.msys.mcf.MsysError r0 = createFileManagerError(r0, r2)
            throw r0
        L56:
            r1 = move-exception
            r0 = 3
            com.facebook.msys.mcf.MsysError r0 = createFileManagerError(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.writeDataToFile(byte[], java.lang.String, boolean):void");
    }
}
