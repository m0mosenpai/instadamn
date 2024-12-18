package com.facebook.superpack;

import X.C0K8;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public class SuperpackFileInputStream extends InputStream {
    public int A00;
    public int A01;
    public int A02;
    public Boolean A03;
    public byte[] A04;
    public final SuperpackFile A05;

    @Override // java.io.InputStream
    public final synchronized int available() {
        return this.A00 - this.A02;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.A01 = this.A02;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.A02 = this.A01;
    }

    @Override // java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 0) {
            return 0L;
        }
        int i = this.A02;
        long j2 = i;
        long j3 = j2 + j;
        int i2 = this.A00;
        if (j3 > i2) {
            j = i2 - i;
        }
        this.A02 = (int) (j2 + j);
        return j;
    }

    public static SuperpackFileInputStream createFromSingletonArchiveFile(File file, String str) {
        int i;
        String str2 = SuperpackArchive.TAG;
        if (str.equals("spo")) {
            i = Runtime.getRuntime().availableProcessors();
        } else {
            i = 1;
        }
        return createFromSingletonArchiveFile(file, str, i);
    }

    public static SuperpackFileInputStream createFromSingletonArchiveInputStream(InputStream inputStream, String str) {
        int i;
        String str2 = SuperpackArchive.TAG;
        if (str.equals("spo")) {
            i = Runtime.getRuntime().availableProcessors();
        } else {
            i = 1;
        }
        return createFromSingletonArchiveInputStream(inputStream, str, i);
    }

    public static int getDefaultThreadNum(String str) {
        String str2 = SuperpackArchive.TAG;
        if (str.equals("spo")) {
            return Runtime.getRuntime().availableProcessors();
        }
        return 1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.A03.booleanValue()) {
            this.A05.close();
        }
    }

    public SuperpackFileInputStream(SuperpackFile superpackFile) {
        int i;
        superpackFile.getClass();
        this.A05 = superpackFile;
        this.A02 = 0;
        synchronized (superpackFile) {
            if (superpackFile.mPtr != 0) {
                i = superpackFile.mLength;
            } else {
                throw new IllegalStateException();
            }
        }
        this.A00 = i;
        this.A01 = 0;
        this.A04 = null;
        this.A03 = false;
    }

    public SuperpackFileInputStream(SuperpackFile superpackFile, Boolean bool) {
        this(superpackFile);
        this.A03 = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5, types: [long] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9, types: [long] */
    public static SuperpackFileInputStream createFromSingletonArchiveFile(File file, String str, int i) {
        ?? r1;
        SuperpackArchive superpackArchive;
        file.getClass();
        String str2 = SuperpackArchive.TAG;
        if (!str.matches("spo")) {
            r1 = 0;
        } else {
            r1 = SuperpackArchive.getThreadNumOption(i);
        }
        try {
            try {
                r1 = SuperpackArchive.readNative(file.getPath(), str, (long) r1);
                superpackArchive = new SuperpackArchive(r1, null);
                r1 = r1;
            } catch (RuntimeException e) {
                r1 = "SuperpackArchive";
                C0K8.A0F("SuperpackArchive", "Failed to read superpack file, retrying.", e);
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.getClass();
                    r1 = SuperpackArchive.readNative(fileInputStream, str, 0L);
                    superpackArchive = new SuperpackArchive(r1, null);
                } finally {
                    fileInputStream.close();
                }
            }
            try {
                if (superpackArchive.hasNext()) {
                    SuperpackFile next = superpackArchive.next();
                    if (!superpackArchive.hasNext()) {
                        SuperpackFileInputStream superpackFileInputStream = new SuperpackFileInputStream(next, true);
                        superpackArchive.close();
                        return superpackFileInputStream;
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            } catch (Throwable th) {
                superpackArchive.close();
                throw th;
            }
        } catch (Throwable th2) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(r1, th2);
            throw r1;
        }
    }

    public static SuperpackFileInputStream createFromSingletonArchiveInputStream(InputStream inputStream, String str, int i) {
        long threadNumOption;
        inputStream.getClass();
        String str2 = SuperpackArchive.TAG;
        if (!str.matches("spo")) {
            threadNumOption = 0;
        } else {
            threadNumOption = SuperpackArchive.getThreadNumOption(i);
        }
        SuperpackArchive superpackArchive = new SuperpackArchive(SuperpackArchive.readNative(inputStream, str, threadNumOption), null);
        try {
            if (superpackArchive.hasNext()) {
                SuperpackFile next = superpackArchive.next();
                if (!superpackArchive.hasNext()) {
                    SuperpackFileInputStream superpackFileInputStream = new SuperpackFileInputStream(next, true);
                    superpackArchive.close();
                    return superpackFileInputStream;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        } catch (Throwable th) {
            try {
                superpackArchive.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3 = i2;
        synchronized (this) {
            if (bArr != null) {
                if (i >= 0 && i2 >= 0) {
                    int i4 = i2 + i;
                    int length = bArr.length;
                    if (i4 <= length) {
                        int i5 = this.A02;
                        int i6 = this.A00;
                        if (i5 == i6) {
                            return -1;
                        }
                        if (i2 + i5 > i6) {
                            i3 = i6 - i5;
                        }
                        SuperpackFile superpackFile = this.A05;
                        synchronized (superpackFile) {
                            try {
                                long j = superpackFile.mPtr;
                                if (j != 0) {
                                    if (i5 >= 0 && i3 >= 0) {
                                        if (i + i3 <= length) {
                                            if (i5 + i3 <= superpackFile.mLength) {
                                                SuperpackFile.readBytesNative(j, i5, i3, bArr, i);
                                            } else {
                                                throw new IndexOutOfBoundsException();
                                            }
                                        } else {
                                            throw new IndexOutOfBoundsException();
                                        }
                                    } else {
                                        throw new IndexOutOfBoundsException();
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        this.A02 += i3;
                        return i3;
                    }
                }
                throw new IndexOutOfBoundsException();
            }
            throw new NullPointerException();
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        int i;
        byte[] bArr = this.A04;
        if (bArr == null) {
            bArr = new byte[1];
            this.A04 = bArr;
        }
        int read = read(bArr);
        i = -1;
        if (read != -1) {
            if (read == 1) {
                i = this.A04[0];
                if (i < 0) {
                    i += 256;
                }
            } else {
                throw new IllegalStateException("Unexpected number of bytes read");
            }
        }
        return i;
    }
}
