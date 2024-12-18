package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.1MR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1MR extends C1MM {
    public final int A00;
    public final LightweightQuickPerformanceLogger A01;
    public final boolean A02;
    public final String A03;
    public final String A04;

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final boolean remove(String str) {
        return remove(str, 0);
    }

    private void A00(int i, int i2) {
        String str = this.A04;
        if (str != null) {
            this.A01.markerLinkPivot(i2, i, str);
        }
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final java.util.Set getAllKeys() {
        int i = this.A00;
        A00(i, 42991637);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        lightweightQuickPerformanceLogger.markerStart(42991637, i, "stash_name", this.A03);
        try {
            return super.A00.getAllKeys();
        } finally {
            lightweightQuickPerformanceLogger.markerEnd(42991637, i, (short) 2);
        }
    }

    @Override // X.C1MM, com.facebook.stash.core.FileStash
    public final File getFile(String str) {
        int hashCode = ((this.A00 + 527) * 31) + str.hashCode();
        A00(hashCode, 42991628);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        lightweightQuickPerformanceLogger.markerStart(42991628, hashCode, "stash_name", this.A03);
        short s = 3;
        try {
            FileStash fileStash = super.A00;
            File file = fileStash.getFile(str);
            if (file != null) {
                if (this.A02) {
                    fileStash.getFilePath(str).setExecutable(true);
                }
                s = 2;
            }
            return file;
        } finally {
            lightweightQuickPerformanceLogger.markerEnd(42991628, hashCode, (short) 3);
        }
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final int getItemCount() {
        int i = this.A00;
        A00(i, 42991649);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        lightweightQuickPerformanceLogger.markerStart(42991649, i, "stash_name", this.A03);
        try {
            return super.A00.getItemCount();
        } finally {
            lightweightQuickPerformanceLogger.markerEnd(42991649, i, (short) 2);
        }
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final long getSizeBytes() {
        int i = this.A00;
        A00(i, 42991638);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        lightweightQuickPerformanceLogger.markerStart(42991638, i, "stash_name", this.A03);
        try {
            return super.A00.getSizeBytes();
        } finally {
            lightweightQuickPerformanceLogger.markerEnd(42991638, i, (short) 2);
        }
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final boolean hasKey(String str) {
        int hashCode = ((this.A00 + 527) * 31) + str.hashCode();
        A00(hashCode, 42991636);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        lightweightQuickPerformanceLogger.markerStart(42991636, hashCode, "stash_name", this.A03);
        short s = 3;
        try {
            boolean hasKey = super.A00.hasKey(str);
            if (hasKey) {
                s = 2;
            }
            return hasKey;
        } finally {
            lightweightQuickPerformanceLogger.markerEnd(42991636, hashCode, (short) 3);
        }
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final InputStream read(String str) {
        final int hashCode = ((this.A00 + 527) * 31) + str.hashCode();
        A00(hashCode, 42991628);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        String str2 = this.A03;
        lightweightQuickPerformanceLogger.markerStart(42991628, hashCode, "stash_name", str2);
        FileStash fileStash = super.A00;
        if (fileStash.hasKey(str)) {
            A00(hashCode, 42991645);
            lightweightQuickPerformanceLogger.markerStart(42991645, hashCode, "stash_name", str2);
            final InputStream read = fileStash.read(str);
            if (read == null) {
                lightweightQuickPerformanceLogger.markerEnd(42991645, hashCode, (short) 3);
            } else {
                if (this.A02) {
                    fileStash.getFilePath(str).setExecutable(true);
                }
                if (lightweightQuickPerformanceLogger.isMarkerOn(42991645, hashCode, true)) {
                    read = new AbstractC60202p3(read, hashCode) { // from class: X.2p0
                        public long A00 = 0;
                        public boolean A01 = false;
                        public final int A02;

                        public final void A00(IOException iOException) {
                            this.A01 = true;
                            C1MR.this.A01.markerEnd(42991645, this.A02, (short) 3);
                            throw iOException;
                        }

                        @Override // java.io.InputStream
                        public final int read(byte[] bArr) {
                            try {
                                int read2 = super.A00.read(bArr);
                                if (read2 != -1) {
                                    this.A00 += read2;
                                }
                                return read2;
                            } catch (IOException e) {
                                A00(e);
                                throw C00O.createAndThrow();
                            }
                        }

                        {
                            this.A02 = hashCode;
                        }

                        @Override // X.AbstractC60202p3, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                        public final void close() {
                            int i;
                            if (!this.A01 && (i = this.A02) != 0) {
                                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = C1MR.this.A01;
                                lightweightQuickPerformanceLogger2.markerAnnotate(42991645, i, "read_bytes", this.A00);
                                lightweightQuickPerformanceLogger2.markerEnd(42991645, i, (short) 2);
                            }
                            try {
                                super.close();
                            } catch (IOException e) {
                                A00(e);
                                throw C00O.createAndThrow();
                            }
                        }

                        @Override // X.AbstractC60202p3, java.io.InputStream
                        public final int read(byte[] bArr, int i, int i2) {
                            try {
                                int read2 = super.read(bArr, i, i2);
                                if (read2 != -1) {
                                    this.A00 += read2;
                                }
                                return read2;
                            } catch (IOException e) {
                                A00(e);
                                throw C00O.createAndThrow();
                            }
                        }

                        @Override // java.io.InputStream
                        public final int read() {
                            try {
                                int read2 = super.A00.read();
                                if (read2 != -1) {
                                    this.A00++;
                                }
                                return read2;
                            } catch (IOException e) {
                                A00(e);
                                throw C00O.createAndThrow();
                            }
                        }
                    };
                }
                lightweightQuickPerformanceLogger.markerEnd(42991628, hashCode, (short) 2);
                return read;
            }
        }
        lightweightQuickPerformanceLogger.markerEnd(42991628, hashCode, (short) 3);
        return null;
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final boolean removeAll() {
        int i = this.A00;
        A00(i, 42991639);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        lightweightQuickPerformanceLogger.markerStart(42991639, i, "stash_name", this.A03);
        try {
            return super.A00.removeAll();
        } finally {
            lightweightQuickPerformanceLogger.markerEnd(42991639, i, (short) 2);
        }
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final boolean touch(String str) {
        int hashCode = ((this.A00 + 527) * 31) + str.hashCode();
        A00(hashCode, 42993851);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        lightweightQuickPerformanceLogger.markerStart(42993851, hashCode, "stash_name", this.A03);
        short s = 3;
        try {
            boolean z = super.A00.touch(str);
            if (z) {
                s = 2;
            }
            return z;
        } finally {
            lightweightQuickPerformanceLogger.markerEnd(42993851, hashCode, (short) 3);
        }
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final OutputStream write(String str) {
        final int hashCode = ((this.A00 + 527) * 31) + str.hashCode();
        A00(hashCode, 42991629);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        String str2 = this.A03;
        lightweightQuickPerformanceLogger.markerStart(42991629, hashCode, "stash_name", str2);
        A00(hashCode, 42991646);
        lightweightQuickPerformanceLogger.markerStart(42991646, hashCode, "stash_name", str2);
        try {
            final OutputStream write = super.A00.write(str);
            if (lightweightQuickPerformanceLogger.isMarkerOn(42991646, hashCode, true)) {
                write = new AbstractC85873sG(write, hashCode) { // from class: X.3sH
                    public long A00 = 0;
                    public boolean A01 = false;
                    public final int A02;

                    public final void A00(IOException iOException) {
                        this.A01 = true;
                        C1MR.this.A01.markerEnd(42991646, this.A02, (short) 3);
                        throw iOException;
                    }

                    {
                        this.A02 = hashCode;
                    }

                    @Override // X.AbstractC85873sG, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        int i;
                        if (!this.A01 && (i = this.A02) != 0) {
                            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = C1MR.this.A01;
                            lightweightQuickPerformanceLogger2.markerAnnotate(42991646, i, "written_bytes", this.A00);
                            lightweightQuickPerformanceLogger2.markerEnd(42991646, i, (short) 2);
                        }
                        try {
                            super.close();
                        } catch (IOException e) {
                            A00(e);
                            throw C00O.createAndThrow();
                        }
                    }

                    @Override // X.AbstractC85873sG, java.io.OutputStream, java.io.Flushable
                    public final void flush() {
                        try {
                            super.flush();
                        } catch (IOException e) {
                            A00(e);
                            throw C00O.createAndThrow();
                        }
                    }

                    @Override // X.AbstractC85873sG, java.io.OutputStream
                    public final void write(int i) {
                        try {
                            super.write(i);
                            this.A00++;
                        } catch (IOException e) {
                            A00(e);
                            throw C00O.createAndThrow();
                        }
                    }

                    @Override // X.AbstractC85873sG, java.io.OutputStream
                    public final void write(byte[] bArr, int i, int i2) {
                        try {
                            super.write(bArr, i, i2);
                            this.A00 += i2;
                        } catch (IOException e) {
                            A00(e);
                            throw C00O.createAndThrow();
                        }
                    }

                    @Override // X.AbstractC85873sG, java.io.OutputStream
                    public final void write(byte[] bArr) {
                        try {
                            super.write(bArr);
                            this.A00 += bArr.length;
                        } catch (IOException e) {
                            A00(e);
                            throw C00O.createAndThrow();
                        }
                    }
                };
            }
            lightweightQuickPerformanceLogger.markerEnd(42991629, hashCode, (short) 2);
            return write;
        } catch (IOException e) {
            lightweightQuickPerformanceLogger.markerEnd(42991629, hashCode, (short) 3);
            throw e;
        }
    }

    public C1MR(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, FileStash fileStash, String str, String str2, boolean z) {
        super(fileStash);
        this.A03 = str;
        this.A01 = lightweightQuickPerformanceLogger;
        this.A02 = z;
        this.A00 = str.hashCode();
        this.A04 = str2;
    }

    @Override // X.C1MM, com.facebook.stash.core.FileStash
    public final File insertFile(String str) {
        int hashCode = ((this.A00 + 527) * 31) + str.hashCode();
        A00(hashCode, 42991629);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        lightweightQuickPerformanceLogger.markerStart(42991629, hashCode, "stash_name", this.A03);
        short s = 3;
        short s2 = 2;
        try {
            FileStash fileStash = super.A00;
            File insertFile = fileStash.insertFile(str);
            if (lightweightQuickPerformanceLogger.isMarkerOn(42991629, hashCode, true)) {
                File parentFile = fileStash.getFilePath("insertFile").getParentFile();
                if (parentFile != null && parentFile.isDirectory()) {
                    s = 2;
                }
                s2 = s;
            }
            lightweightQuickPerformanceLogger.markerEnd(42991629, hashCode, s2);
            return insertFile;
        } catch (Throwable th) {
            if (lightweightQuickPerformanceLogger.isMarkerOn(42991629, hashCode, true)) {
                File parentFile2 = super.A00.getFilePath("insertFile").getParentFile();
                if (parentFile2 != null && parentFile2.isDirectory()) {
                    s = 2;
                }
                s2 = s;
            }
            lightweightQuickPerformanceLogger.markerEnd(42991629, hashCode, s2);
            throw th;
        }
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final byte[] readResourceToMemory(String str) {
        short s;
        int hashCode = ((this.A00 + 527) * 31) + str.hashCode();
        A00(hashCode, 42991628);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        String str2 = this.A03;
        lightweightQuickPerformanceLogger.markerStart(42991628, hashCode, "stash_name", str2);
        A00(hashCode, 42991645);
        lightweightQuickPerformanceLogger.markerStart(42991645, hashCode, "stash_name", str2);
        int i = -1;
        try {
            byte[] readResourceToMemory = super.A00.readResourceToMemory(str);
            if (readResourceToMemory != null) {
                i = readResourceToMemory.length;
                s = 2;
            } else {
                s = 3;
            }
            lightweightQuickPerformanceLogger.markerAnnotate(42991645, hashCode, "read_bytes", i);
            lightweightQuickPerformanceLogger.markerEnd(42991645, hashCode, s);
            lightweightQuickPerformanceLogger.markerEnd(42991628, hashCode, s);
            return readResourceToMemory;
        } catch (Throwable th) {
            lightweightQuickPerformanceLogger.markerAnnotate(42991645, hashCode, "read_bytes", i);
            lightweightQuickPerformanceLogger.markerEnd(42991645, hashCode, (short) 87);
            lightweightQuickPerformanceLogger.markerEnd(42991628, hashCode, (short) 87);
            throw th;
        }
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final boolean remove(String str, int i) {
        int hashCode = ((this.A00 + 527) * 31) + str.hashCode();
        A00(hashCode, 42991635);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        lightweightQuickPerformanceLogger.markerStart(42991635, hashCode, "stash_name", this.A03);
        lightweightQuickPerformanceLogger.markerAnnotate(42991635, hashCode, "reason", i);
        try {
            return super.A00.remove(str, i);
        } finally {
            lightweightQuickPerformanceLogger.markerEnd(42991635, hashCode, (short) 2);
        }
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final void write(String str, byte[] bArr) {
        OutputStream write = write(str);
        try {
            write.write(bArr);
            write.close();
        } catch (Throwable th) {
            if (write != null) {
                try {
                    write.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }
}
