package X;

import com.facebook.zstd.ZstdOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.GZIPOutputStream;
import org.tukaani.xz.LZMA2Options;

/* renamed from: X.RtC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61757RtC {
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, org.tukaani.xz.LZMA2Options] */
    public static long A00(File file, File file2, int i, int i2) {
        OutputStream outputStream;
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.totalMemory() - runtime.freeMemory();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            try {
                if (i == 1) {
                    outputStream = new GZIPOutputStream(bufferedOutputStream);
                } else if (i == 2) {
                    outputStream = new ZstdOutputStream(bufferedOutputStream, 4096, i2);
                } else {
                    final ?? obj = new Object();
                    obj.A00(i2);
                    outputStream = new AbstractC20660zl(bufferedOutputStream, obj) { // from class: X.0oF
                        public IOException A00;
                        public OutputStream A01;
                        public C14810ov A02;
                        public boolean A03;
                        public boolean A04;
                        public InterfaceC14770or[] A05;
                        public final AbstractC20580zb A06;
                        public final C20570za A07;
                        public final C13740n0 A08;

                        {
                            C20570za c20570za = new C20570za();
                            this.A07 = c20570za;
                            this.A08 = new C13740n0();
                            this.A02 = null;
                            this.A00 = null;
                            this.A04 = false;
                            this.A01 = bufferedOutputStream;
                            this.A03 = true;
                            InterfaceC14770or[] interfaceC14770orArr = {new C06040Tt(new LZMA2Options[]{obj}[0])};
                            this.A03 &= true;
                            AbstractC20630zi.A00(interfaceC14770orArr);
                            this.A05 = interfaceC14770orArr;
                            c20570za.A00 = 4;
                            this.A06 = new C14230nn();
                            this.A01.write(AbstractC20610ze.A01);
                            byte[] bArr = {0, (byte) this.A07.A00};
                            this.A01.write(bArr);
                            AbstractC13940nK.A01(this.A01, bArr);
                        }

                        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                        public final void close() {
                            if (this.A01 != null) {
                                try {
                                    A02();
                                } catch (IOException unused) {
                                }
                                try {
                                    this.A01.close();
                                } catch (IOException e) {
                                    if (this.A00 == null) {
                                        this.A00 = e;
                                    }
                                }
                                this.A01 = null;
                            }
                            IOException iOException = this.A00;
                            if (iOException != null) {
                                throw iOException;
                            }
                        }

                        @Override // java.io.OutputStream
                        public final void write(int i3) {
                            write(new byte[]{(byte) i3}, 0, 1);
                        }

                        @Override // X.AbstractC20660zl
                        public final void A02() {
                            if (!this.A04) {
                                A03();
                                try {
                                    C13740n0 c13740n0 = this.A08;
                                    OutputStream outputStream2 = this.A01;
                                    CRC32 crc32 = new CRC32();
                                    CheckedOutputStream checkedOutputStream = new CheckedOutputStream(outputStream2, crc32);
                                    int i3 = 0;
                                    checkedOutputStream.write(0);
                                    AbstractC13940nK.A00(c13740n0.A02, checkedOutputStream);
                                    Iterator it = c13740n0.A00.iterator();
                                    while (it.hasNext()) {
                                        C20540zW c20540zW = (C20540zW) it.next();
                                        AbstractC13940nK.A00(c20540zW.A01, checkedOutputStream);
                                        AbstractC13940nK.A00(c20540zW.A00, checkedOutputStream);
                                    }
                                    long j = c13740n0.A02;
                                    int i4 = 0;
                                    do {
                                        i4++;
                                        j >>= 7;
                                    } while (j != 0);
                                    for (int i5 = (int) (3 & (4 - (((i4 + 1) + c13740n0.A01) + 4))); i5 > 0; i5--) {
                                        checkedOutputStream.write(0);
                                    }
                                    long value = crc32.getValue();
                                    do {
                                        outputStream2.write((byte) (value >>> (i3 * 8)));
                                        i3++;
                                    } while (i3 < 4);
                                    byte[] bArr = new byte[6];
                                    long A00 = (c13740n0.A00() / 4) - 1;
                                    int i6 = 0;
                                    do {
                                        bArr[i6] = (byte) (A00 >>> (i6 * 8));
                                        i6++;
                                    } while (i6 < 4);
                                    bArr[4] = 0;
                                    bArr[5] = (byte) this.A07.A00;
                                    AbstractC13940nK.A01(this.A01, bArr);
                                    this.A01.write(bArr);
                                    this.A01.write(AbstractC20610ze.A00);
                                    this.A04 = true;
                                } catch (IOException e) {
                                    this.A00 = e;
                                    throw e;
                                }
                            }
                        }

                        public final void A03() {
                            IOException iOException = this.A00;
                            if (iOException == null) {
                                if (!this.A04) {
                                    C14810ov c14810ov = this.A02;
                                    if (c14810ov != null) {
                                        try {
                                            c14810ov.A02();
                                            C13740n0 c13740n0 = this.A08;
                                            C14810ov c14810ov2 = this.A02;
                                            c13740n0.A01(c14810ov2.A02 + c14810ov2.A03.A00 + c14810ov2.A04.A00, c14810ov2.A00);
                                            this.A02 = null;
                                            return;
                                        } catch (IOException e) {
                                            this.A00 = e;
                                            throw e;
                                        }
                                    }
                                    return;
                                }
                                throw new IOException("Stream finished or closed");
                            }
                        }

                        @Override // java.io.OutputStream, java.io.Flushable
                        public final void flush() {
                            IOException iOException = this.A00;
                            if (iOException == null) {
                                if (!this.A04) {
                                    try {
                                        OutputStream outputStream2 = this.A02;
                                        if (outputStream2 != null) {
                                            if (!this.A03) {
                                                A03();
                                                outputStream2 = this.A01;
                                            }
                                        } else {
                                            outputStream2 = this.A01;
                                        }
                                        outputStream2.flush();
                                        return;
                                    } catch (IOException e) {
                                        this.A00 = e;
                                        throw e;
                                    }
                                }
                                throw new IOException("Stream finished or closed");
                            }
                        }

                        @Override // java.io.OutputStream
                        public final void write(byte[] bArr, int i3, int i4) {
                            int i5;
                            if (i3 >= 0 && i4 >= 0 && (i5 = i3 + i4) >= 0 && i5 <= bArr.length) {
                                IOException iOException = this.A00;
                                if (iOException == null) {
                                    if (!this.A04) {
                                        try {
                                            C14810ov c14810ov = this.A02;
                                            if (c14810ov == null) {
                                                c14810ov = new C14810ov(this.A01, this.A06, this.A05);
                                                this.A02 = c14810ov;
                                            }
                                            c14810ov.write(bArr, i3, i4);
                                            return;
                                        } catch (IOException e) {
                                            this.A00 = e;
                                            throw e;
                                        }
                                    }
                                    throw new IOException("Stream finished or closed");
                                }
                                throw iOException;
                            }
                            throw new IndexOutOfBoundsException();
                        }
                    };
                }
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read != -1) {
                            outputStream.write(bArr, 0, read);
                        } else {
                            long freeMemory2 = runtime.totalMemory() - runtime.freeMemory();
                            outputStream.flush();
                            outputStream.close();
                            bufferedOutputStream.close();
                            bufferedInputStream.close();
                            return freeMemory2 - freeMemory;
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
                throw th;
            } finally {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
            }
        }
    }
}
