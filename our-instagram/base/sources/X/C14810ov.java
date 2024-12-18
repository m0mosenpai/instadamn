package X;

import com.facebook.common.dextricks.Constants;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.tukaani.xz.LZMA2Options;
import org.tukaani.xz.LZMA2OutputStream;

/* renamed from: X.0ov, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14810ov extends AbstractC20660zl {
    public long A00 = 0;
    public AbstractC20660zl A01;
    public final int A02;
    public final C14790ot A03;
    public final AbstractC20580zb A04;
    public final long A05;
    public final OutputStream A06;

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.A01.flush();
        A00();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.A01.write(bArr, i, i2);
        this.A04.A00(bArr, i, i2);
        this.A00 += i2;
        A00();
    }

    private void A00() {
        long j = this.A03.A00;
        if (j >= 0 && j <= this.A05 && this.A00 >= 0) {
        } else {
            throw new IOException("XZ Stream has grown too big");
        }
    }

    @Override // X.AbstractC20660zl
    public final void A02() {
        this.A01.A02();
        A00();
        long j = this.A03.A00;
        while (true) {
            long j2 = 3 & j;
            OutputStream outputStream = this.A06;
            if (j2 != 0) {
                outputStream.write(0);
                j++;
            } else {
                outputStream.write(this.A04.A01());
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [org.tukaani.xz.LZMA2OutputStream] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0zl] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.0ol] */
    public C14810ov(OutputStream outputStream, AbstractC20580zb abstractC20580zb, InterfaceC14770or[] interfaceC14770orArr) {
        ?? lZMA2OutputStream;
        this.A06 = outputStream;
        this.A04 = abstractC20580zb;
        final C14790ot c14790ot = new C14790ot(outputStream);
        this.A03 = c14790ot;
        this.A01 = c14790ot;
        int length = interfaceC14770orArr.length - 1;
        while (length >= 0) {
            LZMA2Options lZMA2Options = ((C06040Tt) interfaceC14770orArr[length]).A00;
            if (lZMA2Options.A04 == 0) {
                lZMA2OutputStream = new AbstractC20660zl(c14790ot) { // from class: X.0ol
                    public AbstractC20660zl A02;
                    public final DataOutputStream A05;
                    public final byte[] A06 = new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED];
                    public int A00 = 0;
                    public boolean A03 = true;
                    public boolean A04 = false;
                    public IOException A01 = null;

                    private void A00() {
                        DataOutputStream dataOutputStream = this.A05;
                        dataOutputStream.writeByte(this.A03 ? 1 : 2);
                        dataOutputStream.writeShort(this.A00 - 1);
                        dataOutputStream.write(this.A06, 0, this.A00);
                        this.A00 = 0;
                        this.A03 = false;
                    }

                    @Override // X.AbstractC20660zl
                    public final void A02() {
                        if (this.A04) {
                            return;
                        }
                        A01();
                        try {
                            this.A02.A02();
                            this.A04 = true;
                        } catch (IOException e) {
                            this.A01 = e;
                            throw e;
                        }
                    }

                    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        if (this.A02 != null) {
                            if (!this.A04) {
                                try {
                                    A01();
                                } catch (IOException unused) {
                                }
                            }
                            try {
                                this.A02.close();
                            } catch (IOException e) {
                                if (this.A01 == null) {
                                    this.A01 = e;
                                }
                            }
                            this.A02 = null;
                        }
                        IOException iOException = this.A01;
                        if (iOException != null) {
                            throw iOException;
                        }
                    }

                    @Override // java.io.OutputStream
                    public final void write(int i) {
                        write(new byte[]{(byte) i}, 0, 1);
                    }

                    private void A01() {
                        IOException iOException = this.A01;
                        if (iOException == null) {
                            if (!this.A04) {
                                try {
                                    if (this.A00 > 0) {
                                        A00();
                                    }
                                    this.A02.write(0);
                                    return;
                                } catch (IOException e) {
                                    this.A01 = e;
                                    throw e;
                                }
                            }
                            throw new IOException("Stream finished or closed");
                        }
                    }

                    @Override // java.io.OutputStream, java.io.Flushable
                    public final void flush() {
                        IOException iOException = this.A01;
                        if (iOException == null) {
                            if (!this.A04) {
                                try {
                                    if (this.A00 > 0) {
                                        A00();
                                    }
                                    this.A02.flush();
                                    return;
                                } catch (IOException e) {
                                    this.A01 = e;
                                    throw e;
                                }
                            }
                            throw new IOException("Stream finished or closed");
                        }
                    }

                    @Override // java.io.OutputStream
                    public final void write(byte[] bArr, int i, int i2) {
                        int i3;
                        if (i >= 0 && i2 >= 0 && (i3 = i + i2) >= 0 && i3 <= bArr.length) {
                            IOException iOException = this.A01;
                            if (iOException == null) {
                                if (this.A04) {
                                    throw new IOException("Stream finished or closed");
                                }
                                while (i2 > 0) {
                                    try {
                                        byte[] bArr2 = this.A06;
                                        int length2 = bArr2.length;
                                        int i4 = this.A00;
                                        int min = Math.min(length2 - i4, i2);
                                        System.arraycopy(bArr, i, bArr2, i4, min);
                                        i2 -= min;
                                        int i5 = this.A00 + min;
                                        this.A00 = i5;
                                        if (i5 == length2) {
                                            A00();
                                        }
                                    } catch (IOException e) {
                                        this.A01 = e;
                                        throw e;
                                    }
                                }
                                return;
                            }
                            throw iOException;
                        }
                        throw new IndexOutOfBoundsException();
                    }

                    {
                        this.A02 = c14790ot;
                        this.A05 = new DataOutputStream(c14790ot);
                    }
                };
            } else {
                lZMA2OutputStream = new LZMA2OutputStream(c14790ot, lZMA2Options);
            }
            c14790ot = lZMA2OutputStream;
            this.A01 = lZMA2OutputStream;
            length--;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(length);
        for (InterfaceC14770or interfaceC14770or : interfaceC14770orArr) {
            byteArrayOutputStream.write(33);
            byte[] bArr = ((C06040Tt) interfaceC14770or).A01;
            AbstractC13940nK.A00(bArr.length, byteArrayOutputStream);
            byteArrayOutputStream.write(bArr);
        }
        while ((byteArrayOutputStream.size() & 3) != 0) {
            byteArrayOutputStream.write(0);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length2 = byteArray.length;
        int i = length2 + 4;
        this.A02 = i;
        if (i <= 1024) {
            byteArray[0] = (byte) (length2 / 4);
            outputStream.write(byteArray);
            AbstractC13940nK.A01(outputStream, byteArray);
            this.A05 = (9223372036854775804L - i) - abstractC20580zb.A00;
            return;
        }
        throw new IOException();
    }
}
