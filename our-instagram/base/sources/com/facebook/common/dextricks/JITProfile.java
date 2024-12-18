package com.facebook.common.dextricks;

import X.AnonymousClass001;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class JITProfile {
    public static final byte[] PROFILE_MAGIC = {112, 114, 111, 0};
    public static final String TAG = "JITProfile";

    public static boolean isMagicRight(byte[] bArr) {
        Object[] objArr;
        int length = bArr.length;
        if (length < 4) {
            objArr = new Object[]{": profile header only has %d bytes, too short", Integer.valueOf(length)};
        } else {
            int i = 0;
            while (bArr[i] == PROFILE_MAGIC[i]) {
                i++;
                if (i >= 4) {
                    return true;
                }
            }
            objArr = new Object[]{"JITProfile:Incorrect profile magic"};
        }
        Mlog.w(TAG, objArr);
        return false;
    }

    public static short readShortFromContent(byte[] bArr, int i) {
        short s = 0;
        int i2 = 1;
        do {
            s = (short) (((short) (s << 8)) | (bArr[i + i2] & 255));
            i2--;
        } while (i2 >= 0);
        return s;
    }

    public static int readUInt16FromContent(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = 1;
        do {
            i2 = (i2 << 8) | (bArr[i + i3] & 255);
            i3--;
        } while (i3 >= 0);
        return i2;
    }

    public static int readUnsignedIntFromContent(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = 3;
        do {
            i2 = (i2 << 8) | (bArr[i + i3] & 255);
            i3--;
        } while (i3 >= 0);
        return i2;
    }

    public abstract void change2MegaZipDexLocations(String str);

    public abstract boolean fixDexChecksums(HashMap hashMap);

    public abstract byte[] getVersion();

    public abstract boolean isValid();

    public abstract boolean isVersionRight(byte[] bArr);

    public abstract boolean readFileHeader(InputStream inputStream);

    public abstract boolean writeProfile(FileOutputStream fileOutputStream);

    public static HashMap deserializeCheckSumFile(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        try {
            try {
                return (HashMap) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {
                Mlog.w(TAG, "could not read hashmap from %s for reason %s", file.getName(), e);
                objectInputStream.close();
                fileInputStream.close();
                return null;
            }
        } finally {
            objectInputStream.close();
            fileInputStream.close();
        }
    }

    public static void writeShortToContent(byte[] bArr, int i, short s) {
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    public static void writeUnsignedIntToContent(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r3 != null) goto L30;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x008a: IF  (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:40:? (LINE:138), block:B:37:0x008a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean produceProfileFile(java.io.File r8, java.io.File r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r4 = "JITProfile"
            java.lang.String r0 = r8.getName()
            r7.change2MegaZipDexLocations(r0)
            java.util.HashMap r1 = populateDex2ChecksumMap(r8, r9)
            r6 = 0
            if (r1 == 0) goto L92
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L92
            r7.fixDexChecksums(r1)
            r5 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L6a java.lang.Throwable -> L90
            r3.<init>(r9)     // Catch: java.io.FileNotFoundException -> L6a java.lang.Throwable -> L90
            if (r10 == 0) goto L4c
            java.nio.channels.FileChannel r0 = r3.getChannel()     // Catch: java.io.IOException -> L2c java.io.FileNotFoundException -> L68 java.lang.Throwable -> L84
            java.nio.channels.FileLock r5 = r0.tryLock()     // Catch: java.io.IOException -> L2c java.io.FileNotFoundException -> L68 java.lang.Throwable -> L84
            if (r5 != 0) goto L4c
            goto L3b
        L2c:
            r2 = move-exception
            java.lang.String r1 = "io exception %s while locking %"
            java.lang.String r0 = r9.getName()     // Catch: java.io.FileNotFoundException -> L68 java.lang.Throwable -> L84
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r0}     // Catch: java.io.FileNotFoundException -> L68 java.lang.Throwable -> L84
            com.facebook.common.dextricks.Mlog.w(r4, r0)     // Catch: java.io.FileNotFoundException -> L68 java.lang.Throwable -> L84
        L3b:
            java.lang.String r1 = "cannnot lock profile %s"
            java.lang.String r0 = r9.getName()     // Catch: java.io.FileNotFoundException -> L68 java.lang.Throwable -> L84
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch: java.io.FileNotFoundException -> L68 java.lang.Throwable -> L84
            com.facebook.common.dextricks.Mlog.w(r4, r0)     // Catch: java.io.FileNotFoundException -> L68 java.lang.Throwable -> L84
            r3.close()     // Catch: java.io.FileNotFoundException -> L68 java.lang.Throwable -> L84
            goto L80
        L4c:
            boolean r2 = r7.writeProfile(r3)     // Catch: java.io.FileNotFoundException -> L68 java.lang.Throwable -> L84
            if (r2 != 0) goto L5f
            java.lang.String r1 = "cannnot write to profile %s"
            java.lang.String r0 = r9.getName()     // Catch: java.io.FileNotFoundException -> L68 java.lang.Throwable -> L84
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch: java.io.FileNotFoundException -> L68 java.lang.Throwable -> L84
            com.facebook.common.dextricks.Mlog.w(r4, r0)     // Catch: java.io.FileNotFoundException -> L68 java.lang.Throwable -> L84
        L5f:
            if (r5 == 0) goto L64
            r5.release()
        L64:
            r3.close()
            return r2
        L68:
            r2 = move-exception
            goto L6c
        L6a:
            r2 = move-exception
            r3 = r5
        L6c:
            java.lang.String r1 = "cannot find profile file %s, exception %s"
            java.lang.String r0 = r9.getName()     // Catch: java.lang.Throwable -> L84
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0, r2}     // Catch: java.lang.Throwable -> L84
            com.facebook.common.dextricks.Mlog.w(r4, r0)     // Catch: java.lang.Throwable -> L84
            if (r5 == 0) goto L7e
            r5.release()
        L7e:
            if (r3 == 0) goto L92
        L80:
            r3.close()
            return r6
        L84:
            r0 = move-exception
            if (r5 == 0) goto L8a
            r5.release()
        L8a:
            if (r3 == 0) goto L91
            r3.close()
            throw r0
        L90:
            r0 = move-exception
        L91:
            throw r0
        L92:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.JITProfile.produceProfileFile(java.io.File, java.io.File, boolean):boolean");
    }

    public static HashMap populateDex2ChecksumMap(File file, File file2) {
        File file3 = new File(file2.getParentFile(), AnonymousClass001.A0R(file.getName(), ".checksum"));
        if (!file3.exists()) {
            Mlog.w(TAG, "checksum file %s for mega zip doesn't exist ", file3.getName());
            return null;
        }
        return deserializeCheckSumFile(file3);
    }

    public static void writeStringToContent(byte[] bArr, int i, String str) {
        byte[] bytes = str.getBytes();
        for (int i2 = 0; i2 < bytes.length; i2++) {
            bArr[i + i2] = bytes[i2];
        }
    }
}
