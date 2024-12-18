package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.C0H1;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.xzdecoder.XzInputStream;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* loaded from: classes.dex */
public final class InputDex implements Closeable {
    public static final byte STATE_RAW = 0;
    public static final byte STATE_USED = 2;
    public static final byte STATE_ZIPPED = 1;
    public static final String XZS_ASSET_SUFFIX = ".xzs.tmp~";
    public final DexManifest.Dex dex;
    public InputStream mContents;
    public byte mState;
    public int sizeHint;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.zip.CheckedInputStream, java.io.Closeable, java.io.InputStream] */
    private void synthesizeDexJarFile(OutputStream outputStream) {
        InputStream inputStream = this.mContents;
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        try {
            ZipEntry zipEntry = new ZipEntry("classes.dex");
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                FileChannel channel = fileInputStream.getChannel();
                if (channel.position() == 0) {
                    ?? fileInputStream2 = new FileInputStream(fileInputStream.getFD());
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream2);
                        try {
                            fileInputStream2 = new CheckedInputStream(bufferedInputStream, new CRC32());
                            zipEntry.setSize(fileInputStream2.skip(Long.MAX_VALUE));
                            zipEntry.setCrc(fileInputStream2.getChecksum().getValue());
                            zipEntry.setMethod(0);
                            Mlog.safeFmt("computed zip data for %s from file size:%s crc:%s", this, Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCrc()));
                            Fs.safeClose((Closeable) fileInputStream2);
                            channel.position(0L);
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream2 = bufferedInputStream;
                            Fs.safeClose((Closeable) fileInputStream2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
            zipOutputStream.putNextEntry(zipEntry);
            C0H1.A01(inputStream, zipOutputStream, Integer.MAX_VALUE);
            zipOutputStream.finish();
            zipOutputStream.close();
        } catch (Throwable th3) {
            try {
                zipOutputStream.close();
                throw th3;
            } catch (Throwable th4) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Fs.safeClose(this.mContents);
    }

    public void extract(File file) {
        InputStream dexContents;
        byte b = this.mState;
        this.mState = (byte) 2;
        if (b != 0 && b != 1) {
            throw new RuntimeException("InputDex already used");
        }
        String name = file.getName();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            if (name.endsWith(".dex.jar")) {
                if (b == 1) {
                    Mlog.safeFmt("copying existing zip file %s", this);
                    dexContents = this.mContents;
                } else {
                    Mlog.safeFmt("synthesizing new zip file %s", this);
                    synthesizeDexJarFile(fileOutputStream);
                    fileOutputStream.close();
                }
            } else if (name.endsWith(DexManifest.DEX_EXT)) {
                Mlog.safeFmt("writing raw dex file %s", this);
                this.mState = b;
                dexContents = getDexContents();
            } else {
                throw new RuntimeException(AnonymousClass001.A0R("don't know how to make this kind of file: ", name));
            }
            C0H1.A01(dexContents, fileOutputStream, Integer.MAX_VALUE);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public InputStream getDexContents() {
        ZipEntry nextEntry;
        int i;
        byte b = this.mState;
        this.mState = (byte) 2;
        if (b == 1) {
            ZipInputStream zipInputStream = new ZipInputStream(this.mContents);
            this.mContents = zipInputStream;
            do {
                nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    throw new IOException(String.format("zip file %s did not contain a classes.dex", this.dex));
                }
            } while (!nextEntry.getName().equals("classes.dex"));
            long size = nextEntry.getSize();
            if (size > 2147483647L) {
                i = Integer.MAX_VALUE;
            } else {
                i = (int) size;
            }
            this.sizeHint = i;
        } else if (b != 0) {
            throw new RuntimeException("InputDex already used");
        }
        return this.mContents;
    }

    public int getSizeHint(InputStream inputStream) {
        int i = this.sizeHint;
        if (i <= 0) {
            int available = inputStream.available();
            if (available <= 1) {
                return -1;
            }
            return available;
        }
        return i;
    }

    public String toString() {
        return String.format("InputDex:[%s]", this.dex.assetName);
    }

    public InputDex(DexManifest.Dex dex, InputStream inputStream) {
        this.dex = dex;
        String str = dex.assetName;
        try {
            try {
                str = str.endsWith(XZS_ASSET_SUFFIX) ? str.substring(0, str.length() - 9) : str;
                if (str.endsWith(".xz")) {
                    str = str.substring(0, str.length() - 3);
                    inputStream = new XzInputStream(inputStream);
                }
                if (str.endsWith(".jar")) {
                    str = str.substring(0, str.length() - 4);
                    this.mState = (byte) 1;
                }
                if (str.endsWith(DexManifest.DEX_EXT)) {
                    this.mContents = inputStream;
                    return;
                }
                throw new RuntimeException(AnonymousClass001.A0R("malformed dex asset name: ", dex.assetName));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            Fs.safeClose(inputStream);
            throw th;
        }
    }
}
